// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720;

import com.aliyun.tea.*;
import com.aliyun.ddosbgp20180720.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-beijing", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ddosbgp.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ddosbgp.aliyuncs.com"),
            new TeaPair("eu-central-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ddosbgp.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ddosbgp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds IP addresses to an Anti-DDoS Origin Enterprise instance.</p>
     * 
     * @param request AddIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddIpResponse
     */
    public AddIpResponse addIpWithOptions(AddIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipList)) {
            query.put("IpList", request.ipList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIp"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds IP addresses to an Anti-DDoS Origin Enterprise instance.</p>
     * 
     * @param request AddIpRequest
     * @return AddIpResponse
     */
    public AddIpResponse addIp(AddIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加资源目录成员账号列表</p>
     * 
     * @param tmpReq AddRdMemberListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRdMemberListResponse
     */
    public AddRdMemberListResponse addRdMemberListWithOptions(AddRdMemberListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddRdMemberListShrinkRequest request = new AddRdMemberListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.memberList)) {
            request.memberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.memberList, "MemberList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberListShrink)) {
            query.put("MemberList", request.memberListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRdMemberList"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRdMemberListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加资源目录成员账号列表</p>
     * 
     * @param request AddRdMemberListRequest
     * @return AddRdMemberListResponse
     */
    public AddRdMemberListResponse addRdMemberList(AddRdMemberListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRdMemberListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates an asset with an Anti-DDoS Origin instance of a paid edition.</p>
     * 
     * @param tmpReq AttachAssetGroupToInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachAssetGroupToInstanceResponse
     */
    public AttachAssetGroupToInstanceResponse attachAssetGroupToInstanceWithOptions(AttachAssetGroupToInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachAssetGroupToInstanceShrinkRequest request = new AttachAssetGroupToInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assetGroupList)) {
            request.assetGroupListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assetGroupList, "AssetGroupList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetGroupListShrink)) {
            query.put("AssetGroupList", request.assetGroupListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachAssetGroupToInstance"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachAssetGroupToInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates an asset with an Anti-DDoS Origin instance of a paid edition.</p>
     * 
     * @param request AttachAssetGroupToInstanceRequest
     * @return AttachAssetGroupToInstanceResponse
     */
    public AttachAssetGroupToInstanceResponse attachAssetGroupToInstance(AttachAssetGroupToInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAssetGroupToInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether Anti-DDoS Origin is authorized to access Log Service.</p>
     * 
     * @param request CheckAccessLogAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAccessLogAuthResponse
     */
    public CheckAccessLogAuthResponse checkAccessLogAuthWithOptions(CheckAccessLogAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAccessLogAuth"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAccessLogAuthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether Anti-DDoS Origin is authorized to access Log Service.</p>
     * 
     * @param request CheckAccessLogAuthRequest
     * @return CheckAccessLogAuthResponse
     */
    public CheckAccessLogAuthResponse checkAccessLogAuth(CheckAccessLogAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAccessLogAuthWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the CheckGrant operation to query whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.</p>
     * 
     * @param request CheckGrantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckGrantResponse
     */
    public CheckGrantResponse checkGrantWithOptions(CheckGrantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckGrant"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckGrantResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the CheckGrant operation to query whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.</p>
     * 
     * @param request CheckGrantRequest
     * @return CheckGrantResponse
     */
    public CheckGrantResponse checkGrant(CheckGrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkGrantWithOptions(request, runtime);
    }

    /**
     * @param request ConfigSchedruleOnDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigSchedruleOnDemandResponse
     */
    public ConfigSchedruleOnDemandResponse configSchedruleOnDemandWithOptions(ConfigSchedruleOnDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAction)) {
            query.put("RuleAction", request.ruleAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConditionCnt)) {
            query.put("RuleConditionCnt", request.ruleConditionCnt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConditionKpps)) {
            query.put("RuleConditionKpps", request.ruleConditionKpps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConditionMbps)) {
            query.put("RuleConditionMbps", request.ruleConditionMbps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleSwitch)) {
            query.put("RuleSwitch", request.ruleSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleUndoBeginTime)) {
            query.put("RuleUndoBeginTime", request.ruleUndoBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleUndoEndTime)) {
            query.put("RuleUndoEndTime", request.ruleUndoEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleUndoMode)) {
            query.put("RuleUndoMode", request.ruleUndoMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigSchedruleOnDemand"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigSchedruleOnDemandResponse());
    }

    /**
     * @param request ConfigSchedruleOnDemandRequest
     * @return ConfigSchedruleOnDemandResponse
     */
    public ConfigSchedruleOnDemandResponse configSchedruleOnDemand(ConfigSchedruleOnDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configSchedruleOnDemandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建策略</p>
     * 
     * @param request CreatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicy"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建策略</p>
     * 
     * @param request CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduling rule for an on-demand instance.</p>
     * 
     * @param request CreateSchedruleOnDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSchedruleOnDemandResponse
     */
    public CreateSchedruleOnDemandResponse createSchedruleOnDemandWithOptions(CreateSchedruleOnDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAction)) {
            query.put("RuleAction", request.ruleAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConditionCnt)) {
            query.put("RuleConditionCnt", request.ruleConditionCnt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConditionKpps)) {
            query.put("RuleConditionKpps", request.ruleConditionKpps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConditionMbps)) {
            query.put("RuleConditionMbps", request.ruleConditionMbps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleSwitch)) {
            query.put("RuleSwitch", request.ruleSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleUndoBeginTime)) {
            query.put("RuleUndoBeginTime", request.ruleUndoBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleUndoEndTime)) {
            query.put("RuleUndoEndTime", request.ruleUndoEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleUndoMode)) {
            query.put("RuleUndoMode", request.ruleUndoMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSchedruleOnDemand"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSchedruleOnDemandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduling rule for an on-demand instance.</p>
     * 
     * @param request CreateSchedruleOnDemandRequest
     * @return CreateSchedruleOnDemandResponse
     */
    public CreateSchedruleOnDemandResponse createSchedruleOnDemand(CreateSchedruleOnDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSchedruleOnDemandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteBlackhole operation to deactivate blackhole filtering for a protected IP address.
     * Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/118701.html">DescribePackIpList</a> operation to query the protection status of the IP addresses that are protected by your Anti-DDoS Origin instance. For example, you can query whether blackhole filtering is triggered for an IP address.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deactivates blackhole filtering for a protected IP address.</p>
     * 
     * @param request DeleteBlackholeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBlackholeResponse
     */
    public DeleteBlackholeResponse deleteBlackholeWithOptions(DeleteBlackholeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBlackhole"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBlackholeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteBlackhole operation to deactivate blackhole filtering for a protected IP address.
     * Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/118701.html">DescribePackIpList</a> operation to query the protection status of the IP addresses that are protected by your Anti-DDoS Origin instance. For example, you can query whether blackhole filtering is triggered for an IP address.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deactivates blackhole filtering for a protected IP address.</p>
     * 
     * @param request DeleteBlackholeRequest
     * @return DeleteBlackholeResponse
     */
    public DeleteBlackholeResponse deleteBlackhole(DeleteBlackholeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBlackholeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The Anti-DDoS Origin Enterprise instance no longer protects the IP addresses that are removed.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes specific IP addresses from an Anti-DDoS Origin Enterprise instance.</p>
     * 
     * @param request DeleteIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpResponse
     */
    public DeleteIpResponse deleteIpWithOptions(DeleteIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipList)) {
            query.put("IpList", request.ipList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIp"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpResponse());
    }

    /**
     * <b>description</b> :
     * <p>The Anti-DDoS Origin Enterprise instance no longer protects the IP addresses that are removed.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes specific IP addresses from an Anti-DDoS Origin Enterprise instance.</p>
     * 
     * @param request DeleteIpRequest
     * @return DeleteIpResponse
     */
    public DeleteIpResponse deleteIp(DeleteIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除策略</p>
     * 
     * @param request DeletePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicy"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除策略</p>
     * 
     * @param request DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源目录成员账号列表</p>
     * 
     * @param tmpReq DeleteRdMemberListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRdMemberListResponse
     */
    public DeleteRdMemberListResponse deleteRdMemberListWithOptions(DeleteRdMemberListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRdMemberListShrinkRequest request = new DeleteRdMemberListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.memberList)) {
            request.memberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.memberList, "MemberList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberListShrink)) {
            query.put("MemberList", request.memberListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRdMemberList"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRdMemberListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源目录成员账号列表</p>
     * 
     * @param request DeleteRdMemberListRequest
     * @return DeleteRdMemberListResponse
     */
    public DeleteRdMemberListResponse deleteRdMemberList(DeleteRdMemberListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRdMemberListWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSchedruleOnDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSchedruleOnDemandResponse
     */
    public DeleteSchedruleOnDemandResponse deleteSchedruleOnDemandWithOptions(DeleteSchedruleOnDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSchedruleOnDemand"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSchedruleOnDemandResponse());
    }

    /**
     * @param request DeleteSchedruleOnDemandRequest
     * @return DeleteSchedruleOnDemandResponse
     */
    public DeleteSchedruleOnDemandResponse deleteSchedruleOnDemand(DeleteSchedruleOnDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSchedruleOnDemandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the association between an asset and an Anti-DDoS Origin instance of a paid edition.</p>
     * 
     * @param request DescribeAssetGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAssetGroupResponse
     */
    public DescribeAssetGroupResponse describeAssetGroupWithOptions(DescribeAssetGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAssetGroup"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAssetGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the association between an asset and an Anti-DDoS Origin instance of a paid edition.</p>
     * 
     * @param request DescribeAssetGroupRequest
     * @return DescribeAssetGroupResponse
     */
    public DescribeAssetGroupResponse describeAssetGroup(DescribeAssetGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAssetGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the association between an asset and an Anti-DDoS Origin instance of a paid edition.</p>
     * 
     * @param request DescribeAssetGroupToInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAssetGroupToInstanceResponse
     */
    public DescribeAssetGroupToInstanceResponse describeAssetGroupToInstanceWithOptions(DescribeAssetGroupToInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAssetGroupToInstance"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAssetGroupToInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the association between an asset and an Anti-DDoS Origin instance of a paid edition.</p>
     * 
     * @param request DescribeAssetGroupToInstanceRequest
     * @return DescribeAssetGroupToInstanceResponse
     */
    public DescribeAssetGroupToInstanceResponse describeAssetGroupToInstance(DescribeAssetGroupToInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAssetGroupToInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosEvent operation to query the details about the DDoS attack events that occurred on a specific Anti-DDoS Origin instance by page. The details include the start time, end time, attacked IP address, and status of each event.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about the DDoS attack events that occurred on a specific Anti-DDoS Origin instance.</p>
     * 
     * @param request DescribeDdosEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDdosEventResponse
     */
    public DescribeDdosEventResponse describeDdosEventWithOptions(DescribeDdosEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDdosEvent"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDdosEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosEvent operation to query the details about the DDoS attack events that occurred on a specific Anti-DDoS Origin instance by page. The details include the start time, end time, attacked IP address, and status of each event.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about the DDoS attack events that occurred on a specific Anti-DDoS Origin instance.</p>
     * 
     * @param request DescribeDdosEventRequest
     * @return DescribeDdosEventResponse
     */
    public DescribeDdosEventResponse describeDdosEvent(DescribeDdosEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDdosEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询账单</p>
     * 
     * @param request DescribeDdosOriginInstanceBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDdosOriginInstanceBillResponse
     */
    public DescribeDdosOriginInstanceBillResponse describeDdosOriginInstanceBillWithOptions(DescribeDdosOriginInstanceBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShowList)) {
            query.put("IsShowList", request.isShowList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDdosOriginInstanceBill"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDdosOriginInstanceBillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询账单</p>
     * 
     * @param request DescribeDdosOriginInstanceBillRequest
     * @return DescribeDdosOriginInstanceBillResponse
     */
    public DescribeDdosOriginInstanceBillResponse describeDdosOriginInstanceBill(DescribeDdosOriginInstanceBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDdosOriginInstanceBillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call the DescribeExcpetionCount operation to query the number of assets that are in an abnormal state and the number of Anti-DDoS Origin instances that are about to expire in a specific region. For example, if blackhole filtering is triggered for an IP address, the IP address is in an abnormal state. An instance whose remaining validity period is less than seven days is considered as an instance that is about to expire.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of assets that are in an abnormal state and the number of Anti-DDoS
     *                   Origin instances that are about to expire in a specific region. The assets can be
     *                   elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS)
     *                   instances or Server Load Balancer (SLB) instances that are assigned public IP addresses.</p>
     * 
     * @param request DescribeExcpetionCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExcpetionCountResponse
     */
    public DescribeExcpetionCountResponse describeExcpetionCountWithOptions(DescribeExcpetionCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExcpetionCount"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExcpetionCountResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call the DescribeExcpetionCount operation to query the number of assets that are in an abnormal state and the number of Anti-DDoS Origin instances that are about to expire in a specific region. For example, if blackhole filtering is triggered for an IP address, the IP address is in an abnormal state. An instance whose remaining validity period is less than seven days is considered as an instance that is about to expire.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of assets that are in an abnormal state and the number of Anti-DDoS
     *                   Origin instances that are about to expire in a specific region. The assets can be
     *                   elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS)
     *                   instances or Server Load Balancer (SLB) instances that are assigned public IP addresses.</p>
     * 
     * @param request DescribeExcpetionCountRequest
     * @return DescribeExcpetionCountResponse
     */
    public DescribeExcpetionCountResponse describeExcpetionCount(DescribeExcpetionCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExcpetionCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeInstanceList operation to query the details of all Anti-DDoS Origin instances within your Alibaba Cloud account by page. The details include the ID, validity period, and status of each instance.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of all Anti-DDoS Origin instances.</p>
     * 
     * @param request DescribeInstanceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceListResponse
     */
    public DescribeInstanceListResponse describeInstanceListWithOptions(DescribeInstanceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeList)) {
            query.put("InstanceTypeList", request.instanceTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderby)) {
            query.put("Orderby", request.orderby);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderdire)) {
            query.put("Orderdire", request.orderdire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceList"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeInstanceList operation to query the details of all Anti-DDoS Origin instances within your Alibaba Cloud account by page. The details include the ID, validity period, and status of each instance.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of all Anti-DDoS Origin instances.</p>
     * 
     * @param request DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     */
    public DescribeInstanceListResponse describeInstanceList(DescribeInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstanceSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSpecsResponse
     */
    public DescribeInstanceSpecsResponse describeInstanceSpecsWithOptions(DescribeInstanceSpecsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSpecs"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSpecsResponse());
    }

    /**
     * @param request DescribeInstanceSpecsRequest
     * @return DescribeInstanceSpecsResponse
     */
    public DescribeInstanceSpecsResponse describeInstanceSpecs(DescribeInstanceSpecsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSpecsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Anti-DDoS Origin API operations are available for only Anti-DDoS Origin Enterprise users.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeOnDemandDdosEvent operation to query the DDoS events recorded for the IP address of the Anti-DDoS on-demand instance.</p>
     * 
     * @param request DescribeOnDemandDdosEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOnDemandDdosEventResponse
     */
    public DescribeOnDemandDdosEventResponse describeOnDemandDdosEventWithOptions(DescribeOnDemandDdosEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOnDemandDdosEvent"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOnDemandDdosEventResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Anti-DDoS Origin API operations are available for only Anti-DDoS Origin Enterprise users.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeOnDemandDdosEvent operation to query the DDoS events recorded for the IP address of the Anti-DDoS on-demand instance.</p>
     * 
     * @param request DescribeOnDemandDdosEventRequest
     * @return DescribeOnDemandDdosEventResponse
     */
    public DescribeOnDemandDdosEventResponse describeOnDemandDdosEvent(DescribeOnDemandDdosEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOnDemandDdosEventWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOnDemandInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOnDemandInstanceStatusResponse
     */
    public DescribeOnDemandInstanceStatusResponse describeOnDemandInstanceStatusWithOptions(DescribeOnDemandInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOnDemandInstanceStatus"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOnDemandInstanceStatusResponse());
    }

    /**
     * @param request DescribeOnDemandInstanceStatusRequest
     * @return DescribeOnDemandInstanceStatusResponse
     */
    public DescribeOnDemandInstanceStatusResponse describeOnDemandInstanceStatus(DescribeOnDemandInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOnDemandInstanceStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The start time. Operation logs that were generated after this time are queried.**** This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <b>summary</b> : 
     * <p>The number of entries to return on each page.</p>
     * 
     * @param request DescribeOpEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOpEntitiesResponse
     */
    public DescribeOpEntitiesResponse describeOpEntitiesWithOptions(DescribeOpEntitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDir)) {
            query.put("OrderDir", request.orderDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOpEntities"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOpEntitiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>The start time. Operation logs that were generated after this time are queried.**** This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <b>summary</b> : 
     * <p>The number of entries to return on each page.</p>
     * 
     * @param request DescribeOpEntitiesRequest
     * @return DescribeOpEntitiesResponse
     */
    public DescribeOpEntitiesResponse describeOpEntities(DescribeOpEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOpEntitiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribePackIpList operation to query the details about each IP address that is protected by a specific Anti-DDoS Origin instance by page. The details include the IP address and the type of the cloud asset to which the IP address belongs. The details also include the status of the IP address, such as whether blackhole filtering is triggered for the IP address.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP addresses that are protected by a specific Anti-DDoS Origin instance.</p>
     * 
     * @param request DescribePackIpListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePackIpListResponse
     */
    public DescribePackIpListResponse describePackIpListWithOptions(DescribePackIpListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePackIpList"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePackIpListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribePackIpList operation to query the details about each IP address that is protected by a specific Anti-DDoS Origin instance by page. The details include the IP address and the type of the cloud asset to which the IP address belongs. The details also include the status of the IP address, such as whether blackhole filtering is triggered for the IP address.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP addresses that are protected by a specific Anti-DDoS Origin instance.</p>
     * 
     * @param request DescribePackIpListRequest
     * @return DescribePackIpListResponse
     */
    public DescribePackIpListResponse describePackIpList(DescribePackIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePackIpListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源目录成员账号列表</p>
     * 
     * @param request DescribeRdMemberListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdMemberListResponse
     */
    public DescribeRdMemberListResponse describeRdMemberListWithOptions(DescribeRdMemberListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDirectoryId)) {
            query.put("ResourceDirectoryId", request.resourceDirectoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdMemberList"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdMemberListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源目录成员账号列表</p>
     * 
     * @param request DescribeRdMemberListRequest
     * @return DescribeRdMemberListResponse
     */
    public DescribeRdMemberListResponse describeRdMemberList(DescribeRdMemberListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdMemberListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询RD状态</p>
     * 
     * @param request DescribeRdStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdStatusResponse
     */
    public DescribeRdStatusResponse describeRdStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdStatus"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询RD状态</p>
     * @return DescribeRdStatusResponse
     */
    public DescribeRdStatusResponse describeRdStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions of cloud assets that are supported by an Anti-DDoS Origin instance.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions of cloud assets that are supported by an Anti-DDoS Origin instance.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeTraffic operation to query traffic statistics of an Anti-DDoS Origin instance within a specific time period.  </p>
     * <blockquote>
     * <p> When you call this operation, you must configure the <strong>InstanceId</strong> parameter to specify the Anti-DDoS Origin instance whose traffic statistics you want to query.  </p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation once per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries traffic statistics of an Anti-DDoS Origin instance within a specific time period.</p>
     * 
     * @param request DescribeTrafficRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrafficResponse
     */
    public DescribeTrafficResponse describeTrafficWithOptions(DescribeTrafficRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowType)) {
            query.put("FlowType", request.flowType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipnet)) {
            query.put("Ipnet", request.ipnet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTraffic"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrafficResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeTraffic operation to query traffic statistics of an Anti-DDoS Origin instance within a specific time period.  </p>
     * <blockquote>
     * <p> When you call this operation, you must configure the <strong>InstanceId</strong> parameter to specify the Anti-DDoS Origin instance whose traffic statistics you want to query.  </p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation once per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries traffic statistics of an Anti-DDoS Origin instance within a specific time period.</p>
     * 
     * @param request DescribeTrafficRequest
     * @return DescribeTrafficResponse
     */
    public DescribeTrafficResponse describeTraffic(DescribeTrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrafficWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略解绑</p>
     * 
     * @param tmpReq DetachFromPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachFromPolicyResponse
     */
    public DetachFromPolicyResponse detachFromPolicyWithOptions(DetachFromPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetachFromPolicyShrinkRequest request = new DetachFromPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ipPortProtocolList)) {
            request.ipPortProtocolListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ipPortProtocolList, "IpPortProtocolList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipPortProtocolListShrink)) {
            query.put("IpPortProtocolList", request.ipPortProtocolListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachFromPolicy"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachFromPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略解绑</p>
     * 
     * @param request DetachFromPolicyRequest
     * @return DetachFromPolicyResponse
     */
    public DetachFromPolicyResponse detachFromPolicy(DetachFromPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachFromPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates an asset from an Anti-DDoS Origin instance of a paid edition.</p>
     * 
     * @param tmpReq DettachAssetGroupToInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DettachAssetGroupToInstanceResponse
     */
    public DettachAssetGroupToInstanceResponse dettachAssetGroupToInstanceWithOptions(DettachAssetGroupToInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DettachAssetGroupToInstanceShrinkRequest request = new DettachAssetGroupToInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assetGroupList)) {
            request.assetGroupListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assetGroupList, "AssetGroupList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetGroupListShrink)) {
            query.put("AssetGroupList", request.assetGroupListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DettachAssetGroupToInstance"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DettachAssetGroupToInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates an asset from an Anti-DDoS Origin instance of a paid edition.</p>
     * 
     * @param request DettachAssetGroupToInstanceRequest
     * @return DettachAssetGroupToInstanceResponse
     */
    public DettachAssetGroupToInstanceResponse dettachAssetGroupToInstance(DettachAssetGroupToInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dettachAssetGroupToInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether Log Service is activated.</p>
     * 
     * @param request GetSlsOpenStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSlsOpenStatusResponse
     */
    public GetSlsOpenStatusResponse getSlsOpenStatusWithOptions(GetSlsOpenStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSlsOpenStatus"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSlsOpenStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether Log Service is activated.</p>
     * 
     * @param request GetSlsOpenStatusRequest
     * @return GetSlsOpenStatusResponse
     */
    public GetSlsOpenStatusResponse getSlsOpenStatus(GetSlsOpenStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSlsOpenStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Anti-DDoS Origin instances for which log analysis is enabled.</p>
     * 
     * @param request ListOpenedAccessLogInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOpenedAccessLogInstancesResponse
     */
    public ListOpenedAccessLogInstancesResponse listOpenedAccessLogInstancesWithOptions(ListOpenedAccessLogInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOpenedAccessLogInstances"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOpenedAccessLogInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Anti-DDoS Origin instances for which log analysis is enabled.</p>
     * 
     * @param request ListOpenedAccessLogInstancesRequest
     * @return ListOpenedAccessLogInstancesResponse
     */
    public ListOpenedAccessLogInstancesResponse listOpenedAccessLogInstances(ListOpenedAccessLogInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOpenedAccessLogInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略</p>
     * 
     * @param request ListPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicyWithOptions(ListPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicy"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略</p>
     * 
     * @param request ListPolicyRequest
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略绑定</p>
     * 
     * @param tmpReq ListPolicyAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicyAttachmentResponse
     */
    public ListPolicyAttachmentResponse listPolicyAttachmentWithOptions(ListPolicyAttachmentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPolicyAttachmentShrinkRequest request = new ListPolicyAttachmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ipPortProtocolList)) {
            request.ipPortProtocolListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ipPortProtocolList, "IpPortProtocolList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipPortProtocolListShrink)) {
            query.put("IpPortProtocolList", request.ipPortProtocolListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicyAttachment"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicyAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略绑定</p>
     * 
     * @param request ListPolicyAttachmentRequest
     * @return ListPolicyAttachmentResponse
     */
    public ListPolicyAttachmentResponse listPolicyAttachment(ListPolicyAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicyAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all tags.</p>
     * 
     * @param request ListTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all tags.</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ListTagResources operation to query the tags that are added to Anti-DDoS Origin instances at a time.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ListTagResources operation to query the tags that are added to Anti-DDoS Origin instances at a time.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改策略</p>
     * 
     * @param tmpReq ModifyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolicyResponse
     */
    public ModifyPolicyResponse modifyPolicyWithOptions(ModifyPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPolicyShrinkRequest request = new ModifyPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicy"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改策略</p>
     * 
     * @param request ModifyPolicyRequest
     * @return ModifyPolicyResponse
     */
    public ModifyPolicyResponse modifyPolicy(ModifyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改策略</p>
     * 
     * @param tmpReq ModifyPolicyContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolicyContentResponse
     */
    public ModifyPolicyContentResponse modifyPolicyContentWithOptions(ModifyPolicyContentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPolicyContentShrinkRequest request = new ModifyPolicyContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicyContent"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改策略</p>
     * 
     * @param request ModifyPolicyContentRequest
     * @return ModifyPolicyContentResponse
     */
    public ModifyPolicyContentResponse modifyPolicyContent(ModifyPolicyContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolicyContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyRemark operation to add remarks for a single Anti-DDoS Origin instance.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds remarks for a specific Anti-DDoS Origin instance.</p>
     * 
     * @param request ModifyRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRemarkResponse
     */
    public ModifyRemarkResponse modifyRemarkWithOptions(ModifyRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRemark"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRemarkResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyRemark operation to add remarks for a single Anti-DDoS Origin instance.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds remarks for a specific Anti-DDoS Origin instance.</p>
     * 
     * @param request ModifyRemarkRequest
     * @return ModifyRemarkResponse
     */
    public ModifyRemarkResponse modifyRemark(ModifyRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scheduling rule of an on-demand instance.</p>
     * 
     * @param request QuerySchedruleOnDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySchedruleOnDemandResponse
     */
    public QuerySchedruleOnDemandResponse querySchedruleOnDemandWithOptions(QuerySchedruleOnDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySchedruleOnDemand"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySchedruleOnDemandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scheduling rule of an on-demand instance.</p>
     * 
     * @param request QuerySchedruleOnDemandRequest
     * @return QuerySchedruleOnDemandResponse
     */
    public QuerySchedruleOnDemandResponse querySchedruleOnDemand(QuerySchedruleOnDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySchedruleOnDemandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放原生防护全局实例</p>
     * 
     * @param request ReleaseDdosOriginInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseDdosOriginInstanceResponse
     */
    public ReleaseDdosOriginInstanceResponse releaseDdosOriginInstanceWithOptions(ReleaseDdosOriginInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseDdosOriginInstance"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseDdosOriginInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放原生防护全局实例</p>
     * 
     * @param request ReleaseDdosOriginInstanceRequest
     * @return ReleaseDdosOriginInstanceResponse
     */
    public ReleaseDdosOriginInstanceResponse releaseDdosOriginInstance(ReleaseDdosOriginInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseDdosOriginInstanceWithOptions(request, runtime);
    }

    /**
     * @param request SetInstanceModeOnDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetInstanceModeOnDemandResponse
     */
    public SetInstanceModeOnDemandResponse setInstanceModeOnDemandWithOptions(SetInstanceModeOnDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetInstanceModeOnDemand"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetInstanceModeOnDemandResponse());
    }

    /**
     * @param request SetInstanceModeOnDemandRequest
     * @return SetInstanceModeOnDemandResponse
     */
    public SetInstanceModeOnDemandResponse setInstanceModeOnDemand(SetInstanceModeOnDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstanceModeOnDemandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the TagResources operation to add tags to Anti-DDoS Origin instances. </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to Anti-DDoS Origin instances.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the TagResources operation to add tags to Anti-DDoS Origin instances. </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to Anti-DDoS Origin instances.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from Anti-DDoS Origin Enterprise instances.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from Anti-DDoS Origin Enterprise instances.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}

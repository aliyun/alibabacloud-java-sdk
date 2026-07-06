// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916;

import com.aliyun.tea.*;
import com.aliyun.alikafka20190916.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "alikafka.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "alikafka.us-east-1.aliyuncs.com"),
            new TeaPair("na-south-1", "alikafka.na-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "alikafka.me-east-1.aliyuncs.com"),
            new TeaPair("me-central-1", "alikafka.me-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "alikafka.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "alikafka.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "alikafka.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "alikafka.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "alikafka.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "alikafka.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "alikafka.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "alikafka.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "alikafka.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "alikafka.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hongkong", "alikafka.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-heyuan", "alikafka.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "alikafka.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "alikafka.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "alikafka.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "alikafka.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "alikafka.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "alikafka.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "alikafka.ap-southeast-7.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "alikafka.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "alikafka.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "alikafka.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "alikafka.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "alikafka.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "alikafka.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alikafka", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>AddUserDefinedSg</p>
     * 
     * @param tmpReq AddUserDefinedSgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserDefinedSgResponse
     */
    public AddUserDefinedSgResponse addUserDefinedSgWithOptions(AddUserDefinedSgRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddUserDefinedSgShrinkRequest request = new AddUserDefinedSgShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sgIdList)) {
            request.sgIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sgIdList, "SgIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sgIdListShrink)) {
            query.put("SgIdList", request.sgIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserDefinedSg"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserDefinedSgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AddUserDefinedSg</p>
     * 
     * @param request AddUserDefinedSgRequest
     * @return AddUserDefinedSgResponse
     */
    public AddUserDefinedSgResponse addUserDefinedSg(AddUserDefinedSgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserDefinedSgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a resource to a different resource group.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a resource to a different resource group.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Converts a pay-as-you-go instance to a subscription instance.</p>
     * 
     * @param request ConvertPostPayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertPostPayOrderResponse
     */
    public ConvertPostPayOrderResponse convertPostPayOrderWithOptions(ConvertPostPayOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertPostPayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertPostPayOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Converts a pay-as-you-go instance to a subscription instance.</p>
     * 
     * @param request ConvertPostPayOrderRequest
     * @return ConvertPostPayOrderResponse
     */
    public ConvertPostPayOrderResponse convertPostPayOrder(ConvertPostPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertPostPayOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation is used to create an access control list (ACL).</p>
     * 
     * @param request CreateAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAclResponse
     */
    public CreateAclResponse createAclWithOptions(CreateAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationType)) {
            query.put("AclOperationType", request.aclOperationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationTypes)) {
            query.put("AclOperationTypes", request.aclOperationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclPermissionType)) {
            query.put("AclPermissionType", request.aclPermissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceName)) {
            query.put("AclResourceName", request.aclResourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourcePatternType)) {
            query.put("AclResourcePatternType", request.aclResourcePatternType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceType)) {
            query.put("AclResourceType", request.aclResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAcl"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation is used to create an access control list (ACL).</p>
     * 
     * @param request CreateAclRequest
     * @return CreateAclResponse
     */
    public CreateAclResponse createAcl(CreateAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call CreateConsumerGroup to create a consumer group.</p>
     * 
     * @param request CreateConsumerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call CreateConsumerGroup to create a consumer group.</p>
     * 
     * @param request CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation creates a pay-as-you-go instance and returns the instance ID and order ID.</p>
     * 
     * @param tmpReq CreatePostPayInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePostPayInstanceResponse
     */
    public CreatePostPayInstanceResponse createPostPayInstanceWithOptions(CreatePostPayInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePostPayInstanceShrinkRequest request = new CreatePostPayInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverlessConfig)) {
            request.serverlessConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverlessConfig, "ServerlessConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessConfigShrink)) {
            query.put("ServerlessConfig", request.serverlessConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePostPayInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePostPayInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation creates a pay-as-you-go instance and returns the instance ID and order ID.</p>
     * 
     * @param request CreatePostPayInstanceRequest
     * @return CreatePostPayInstanceResponse
     */
    public CreatePostPayInstanceResponse createPostPayInstance(CreatePostPayInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPostPayInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure you understand the billing methods and pricing of pay-as-you-go instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Pay-as-you-go instances are billed based on actual usage. This billing method is ideal for testing or short-term scenarios with unpredictable traffic peaks. This topic describes how to call the CreatePostPayOrder operation to create a pay-as-you-go instance.</p>
     * 
     * @param tmpReq CreatePostPayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePostPayOrderResponse
     */
    public CreatePostPayOrderResponse createPostPayOrderWithOptions(CreatePostPayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePostPayOrderShrinkRequest request = new CreatePostPayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverlessConfig)) {
            request.serverlessConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverlessConfig, "ServerlessConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessConfigShrink)) {
            query.put("ServerlessConfig", request.serverlessConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePostPayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePostPayOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure you understand the billing methods and pricing of pay-as-you-go instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Pay-as-you-go instances are billed based on actual usage. This billing method is ideal for testing or short-term scenarios with unpredictable traffic peaks. This topic describes how to call the CreatePostPayOrder operation to create a pay-as-you-go instance.</p>
     * 
     * @param request CreatePostPayOrderRequest
     * @return CreatePostPayOrderResponse
     */
    public CreatePostPayOrderResponse createPostPayOrder(CreatePostPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPostPayOrderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, ensure you understand the billing methods and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">billing overview</a>.</li>
     * <li>By default, a subscription instance created using this operation has a one-month subscription period and is set to auto-renew monthly. To change the renewal period or disable auto-renewal, go to the <a href="https://renew.console.aliyun.com/#/ecs">renewal management</a> page in the Alibaba Cloud Management Console.&lt;props=&quot;china&quot;&gt; For more information, see <a href="https://help.aliyun.com/document_detail/37128.html">Set up auto-renewal</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a subscription instance and returns the instance ID and order ID.</p>
     * 
     * @param tmpReq CreatePrePayInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrePayInstanceResponse
     */
    public CreatePrePayInstanceResponse createPrePayInstanceWithOptions(CreatePrePayInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePrePayInstanceShrinkRequest request = new CreatePrePayInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.confluentConfig)) {
            request.confluentConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.confluentConfig, "ConfluentConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confluentConfigShrink)) {
            query.put("ConfluentConfig", request.confluentConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrePayInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrePayInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, ensure you understand the billing methods and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">billing overview</a>.</li>
     * <li>By default, a subscription instance created using this operation has a one-month subscription period and is set to auto-renew monthly. To change the renewal period or disable auto-renewal, go to the <a href="https://renew.console.aliyun.com/#/ecs">renewal management</a> page in the Alibaba Cloud Management Console.&lt;props=&quot;china&quot;&gt; For more information, see <a href="https://help.aliyun.com/document_detail/37128.html">Set up auto-renewal</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a subscription instance and returns the instance ID and order ID.</p>
     * 
     * @param request CreatePrePayInstanceRequest
     * @return CreatePrePayInstanceResponse
     */
    public CreatePrePayInstanceResponse createPrePayInstance(CreatePrePayInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrePayInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that you understand the billing method and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * <li>By default, when you call this operation, the subscription duration is one month and auto-renewal is enabled with a Unified Auto Renewal Cycle of one month. To modify the Unified Auto Renewal Cycle or disable auto-renewal, go to the <a href="https://renew.console.aliyun.com/#/ecs">Renewal Management</a> page in the Alibaba Cloud Management Console. For more information, see <a href="https://help.aliyun.com/document_detail/37128.html">Configure auto-renewal</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Subscription instances require prepayment for resources and are ideal for long-term, stable business scenarios. This topic describes how to call the CreatePrePayOrder operation to create a subscription instance.</p>
     * 
     * @param tmpReq CreatePrePayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrePayOrderResponse
     */
    public CreatePrePayOrderResponse createPrePayOrderWithOptions(CreatePrePayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePrePayOrderShrinkRequest request = new CreatePrePayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.confluentConfig)) {
            request.confluentConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.confluentConfig, "ConfluentConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confluentConfigShrink)) {
            query.put("ConfluentConfig", request.confluentConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrePayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrePayOrderResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that you understand the billing method and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * <li>By default, when you call this operation, the subscription duration is one month and auto-renewal is enabled with a Unified Auto Renewal Cycle of one month. To modify the Unified Auto Renewal Cycle or disable auto-renewal, go to the <a href="https://renew.console.aliyun.com/#/ecs">Renewal Management</a> page in the Alibaba Cloud Management Console. For more information, see <a href="https://help.aliyun.com/document_detail/37128.html">Configure auto-renewal</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Subscription instances require prepayment for resources and are ideal for long-term, stable business scenarios. This topic describes how to call the CreatePrePayOrder operation to create a subscription instance.</p>
     * 
     * @param request CreatePrePayOrderRequest
     * @return CreatePrePayOrderResponse
     */
    public CreatePrePayOrderResponse createPrePayOrder(CreatePrePayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrePayOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation creates a SASL user.</p>
     * 
     * @param request CreateSaslUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSaslUserResponse
     */
    public CreateSaslUserResponse createSaslUserWithOptions(CreateSaslUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mechanism)) {
            query.put("Mechanism", request.mechanism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSaslUser"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSaslUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation creates a SASL user.</p>
     * 
     * @param request CreateSaslUserRequest
     * @return CreateSaslUserResponse
     */
    public CreateSaslUserResponse createSaslUser(CreateSaslUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSaslUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h6>This operation supports only serverless instances.</h6>
     * 
     * <b>summary</b> : 
     * <p>After you deploy a serverless instance, you can use this API to create a scheduled scaling rule for the instance.</p>
     * 
     * @param tmpReq CreateScheduledScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledScalingRuleResponse
     */
    public CreateScheduledScalingRuleResponse createScheduledScalingRuleWithOptions(CreateScheduledScalingRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScheduledScalingRuleShrinkRequest request = new CreateScheduledScalingRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.weeklyTypes)) {
            request.weeklyTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.weeklyTypes, "WeeklyTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.durationMinutes)) {
            query.put("DurationMinutes", request.durationMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstScheduledTime)) {
            query.put("FirstScheduledTime", request.firstScheduledTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedPubFlow)) {
            query.put("ReservedPubFlow", request.reservedPubFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedSubFlow)) {
            query.put("ReservedSubFlow", request.reservedSubFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            query.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weeklyTypesShrink)) {
            query.put("WeeklyTypes", request.weeklyTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledScalingRule"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledScalingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h6>This operation supports only serverless instances.</h6>
     * 
     * <b>summary</b> : 
     * <p>After you deploy a serverless instance, you can use this API to create a scheduled scaling rule for the instance.</p>
     * 
     * @param request CreateScheduledScalingRuleRequest
     * @return CreateScheduledScalingRuleResponse
     */
    public CreateScheduledScalingRuleResponse createScheduledScalingRule(CreateScheduledScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledScalingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Each user can send up to 20 queries per second (QPS).</li>
     * <li>The maximum number of topics for an instance depends on its instance type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a topic.</p>
     * 
     * @param request CreateTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopicWithOptions(CreateTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compactTopic)) {
            query.put("CompactTopic", request.compactTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localTopic)) {
            query.put("LocalTopic", request.localTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minInsyncReplicas)) {
            query.put("MinInsyncReplicas", request.minInsyncReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationFactor)) {
            query.put("ReplicationFactor", request.replicationFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTopic"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTopicResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Each user can send up to 20 queries per second (QPS).</li>
     * <li>The maximum number of topics for an instance depends on its instance type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a topic.</p>
     * 
     * @param request CreateTopicRequest
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopic(CreateTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control list (ACL).</p>
     * 
     * @param request DeleteAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAclResponse
     */
    public DeleteAclResponse deleteAclWithOptions(DeleteAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationType)) {
            query.put("AclOperationType", request.aclOperationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationTypes)) {
            query.put("AclOperationTypes", request.aclOperationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclPermissionType)) {
            query.put("AclPermissionType", request.aclPermissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceName)) {
            query.put("AclResourceName", request.aclResourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourcePatternType)) {
            query.put("AclResourcePatternType", request.aclResourcePatternType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceType)) {
            query.put("AclResourceType", request.aclResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAcl"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control list (ACL).</p>
     * 
     * @param request DeleteAclRequest
     * @return DeleteAclResponse
     */
    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Group.</p>
     * 
     * @param request DeleteConsumerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
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
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Group.</p>
     * 
     * @param request DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The DeleteInstance operation deletes an instance after a subscription instance or a pay-as-you-go instance is released.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The DeleteInstance operation deletes an instance after a subscription instance or a pay-as-you-go instance is released.</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DeleteSaslUser operation to delete a Simple Authentication and Security Layer (SASL) user.</p>
     * 
     * @param request DeleteSaslUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSaslUserResponse
     */
    public DeleteSaslUserResponse deleteSaslUserWithOptions(DeleteSaslUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mechanism)) {
            query.put("Mechanism", request.mechanism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSaslUser"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSaslUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DeleteSaslUser operation to delete a Simple Authentication and Security Layer (SASL) user.</p>
     * 
     * @param request DeleteSaslUserRequest
     * @return DeleteSaslUserResponse
     */
    public DeleteSaslUserResponse deleteSaslUser(DeleteSaslUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSaslUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h6>This operation applies only to Serverless instances.</h6>
     * 
     * <b>summary</b> : 
     * <p>After a Serverless instance is deployed, you can call this API operation to delete its scheduled scaling policy configuration.</p>
     * 
     * @param request DeleteScheduledScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledScalingRuleResponse
     */
    public DeleteScheduledScalingRuleResponse deleteScheduledScalingRuleWithOptions(DeleteScheduledScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteScheduledScalingRule"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledScalingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h6>This operation applies only to Serverless instances.</h6>
     * 
     * <b>summary</b> : 
     * <p>After a Serverless instance is deployed, you can call this API operation to delete its scheduled scaling policy configuration.</p>
     * 
     * @param request DeleteScheduledScalingRuleRequest
     * @return DeleteScheduledScalingRuleResponse
     */
    public DeleteScheduledScalingRuleResponse deleteScheduledScalingRule(DeleteScheduledScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledScalingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a topic.</p>
     * 
     * @param request DeleteTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopicWithOptions(DeleteTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTopic"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a topic.</p>
     * 
     * @param request DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteUserDefinedSg</p>
     * 
     * @param tmpReq DeleteUserDefinedSgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserDefinedSgResponse
     */
    public DeleteUserDefinedSgResponse deleteUserDefinedSgWithOptions(DeleteUserDefinedSgRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteUserDefinedSgShrinkRequest request = new DeleteUserDefinedSgShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sgIdList)) {
            request.sgIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sgIdList, "SgIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sgIdListShrink)) {
            query.put("SgIdList", request.sgIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserDefinedSg"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserDefinedSgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteUserDefinedSg</p>
     * 
     * @param request DeleteUserDefinedSgRequest
     * @return DeleteUserDefinedSgResponse
     */
    public DeleteUserDefinedSgResponse deleteUserDefinedSg(DeleteUserDefinedSgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserDefinedSgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access control list (ACL) resource names.</p>
     * 
     * @param request DescribeAclResourceNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclResourceNameResponse
     */
    public DescribeAclResourceNameResponse describeAclResourceNameWithOptions(DescribeAclResourceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclResourcePatternType)) {
            query.put("AclResourcePatternType", request.aclResourcePatternType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceType)) {
            query.put("AclResourceType", request.aclResourceType);
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
            new TeaPair("action", "DescribeAclResourceName"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclResourceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access control list (ACL) resource names.</p>
     * 
     * @param request DescribeAclResourceNameRequest
     * @return DescribeAclResourceNameResponse
     */
    public DescribeAclResourceNameResponse describeAclResourceName(DescribeAclResourceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclResourceNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access control lists (ACLs).</p>
     * 
     * @param request DescribeAclsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclsResponse
     */
    public DescribeAclsResponse describeAclsWithOptions(DescribeAclsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationType)) {
            query.put("AclOperationType", request.aclOperationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclPermissionType)) {
            query.put("AclPermissionType", request.aclPermissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceName)) {
            query.put("AclResourceName", request.aclResourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourcePatternType)) {
            query.put("AclResourcePatternType", request.aclResourcePatternType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceType)) {
            query.put("AclResourceType", request.aclResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAcls"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access control lists (ACLs).</p>
     * 
     * @param request DescribeAclsRequest
     * @return DescribeAclsResponse
     */
    public DescribeAclsResponse describeAcls(DescribeAclsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call DescribeSaslUsers to query SASL users.</p>
     * 
     * @param request DescribeSaslUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSaslUsersResponse
     */
    public DescribeSaslUsersResponse describeSaslUsersWithOptions(DescribeSaslUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeSaslUsers"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSaslUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call DescribeSaslUsers to query SASL users.</p>
     * 
     * @param request DescribeSaslUsersRequest
     * @return DescribeSaslUsersResponse
     */
    public DescribeSaslUsersResponse describeSaslUsers(DescribeSaslUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSaslUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>降配后付费实例</p>
     * 
     * @param tmpReq DowngradePostPayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DowngradePostPayOrderResponse
     */
    public DowngradePostPayOrderResponse downgradePostPayOrderWithOptions(DowngradePostPayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DowngradePostPayOrderShrinkRequest request = new DowngradePostPayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverlessConfig)) {
            request.serverlessConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverlessConfig, "ServerlessConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipModel)) {
            query.put("EipModel", request.eipModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessConfigShrink)) {
            query.put("ServerlessConfig", request.serverlessConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DowngradePostPayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DowngradePostPayOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>降配后付费实例</p>
     * 
     * @param request DowngradePostPayOrderRequest
     * @return DowngradePostPayOrderResponse
     */
    public DowngradePostPayOrderResponse downgradePostPayOrder(DowngradePostPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downgradePostPayOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>降配预付费实例</p>
     * 
     * @param tmpReq DowngradePrePayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DowngradePrePayOrderResponse
     */
    public DowngradePrePayOrderResponse downgradePrePayOrderWithOptions(DowngradePrePayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DowngradePrePayOrderShrinkRequest request = new DowngradePrePayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.confluentConfig)) {
            request.confluentConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.confluentConfig, "ConfluentConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confluentConfigShrink)) {
            query.put("ConfluentConfig", request.confluentConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipModel)) {
            query.put("EipModel", request.eipModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DowngradePrePayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DowngradePrePayOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>降配预付费实例</p>
     * 
     * @param request DowngradePrePayOrderRequest
     * @return DowngradePrePayOrderResponse
     */
    public DowngradePrePayOrderResponse downgradePrePayOrder(DowngradePrePayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downgradePrePayOrderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, only reserved instances support this API.
     * Serverless instances are not supported at this time.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes how to call EnableAutoGroupCreation to enable or disable the free use of Groups.</p>
     * 
     * @param request EnableAutoGroupCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAutoGroupCreationResponse
     */
    public EnableAutoGroupCreationResponse enableAutoGroupCreationWithOptions(EnableAutoGroupCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
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
            new TeaPair("action", "EnableAutoGroupCreation"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAutoGroupCreationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, only reserved instances support this API.
     * Serverless instances are not supported at this time.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes how to call EnableAutoGroupCreation to enable or disable the free use of Groups.</p>
     * 
     * @param request EnableAutoGroupCreationRequest
     * @return EnableAutoGroupCreationResponse
     */
    public EnableAutoGroupCreationResponse enableAutoGroupCreation(EnableAutoGroupCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAutoGroupCreationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes how to call the EnableAutoTopicCreation operation to enable or disable automatic topic creation and modify the default number of partitions for automatically created topics.</p>
     * 
     * @param request EnableAutoTopicCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAutoTopicCreationResponse
     */
    public EnableAutoTopicCreationResponse enableAutoTopicCreationWithOptions(EnableAutoTopicCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operate)) {
            query.put("Operate", request.operate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updatePartition)) {
            query.put("UpdatePartition", request.updatePartition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAutoTopicCreation"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAutoTopicCreationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes how to call the EnableAutoTopicCreation operation to enable or disable automatic topic creation and modify the default number of partitions for automatically created topics.</p>
     * 
     * @param request EnableAutoTopicCreationRequest
     * @return EnableAutoTopicCreationResponse
     */
    public EnableAutoTopicCreationResponse enableAutoTopicCreation(EnableAutoTopicCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAutoTopicCreationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障演练</p>
     * 
     * @param request FailoverTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FailoverTestResponse
     */
    public FailoverTestResponse failoverTestWithOptions(FailoverTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            query.put("Configs", request.configs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeTime)) {
            query.put("ExecuteTime", request.executeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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
            new TeaPair("action", "FailoverTest"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailoverTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障演练</p>
     * 
     * @param request FailoverTestRequest
     * @return FailoverTestResponse
     */
    public FailoverTestResponse failoverTest(FailoverTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.failoverTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IDs of all instances in the current account.</p>
     * 
     * @param request GetAllInstanceIdListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAllInstanceIdListResponse
     */
    public GetAllInstanceIdListResponse getAllInstanceIdListWithOptions(GetAllInstanceIdListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAllInstanceIdList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAllInstanceIdListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IDs of all instances in the current account.</p>
     * 
     * @param request GetAllInstanceIdListRequest
     * @return GetAllInstanceIdListResponse
     */
    public GetAllInstanceIdListResponse getAllInstanceIdList(GetAllInstanceIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllInstanceIdListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The GetAllowedIpList operation retrieves the IP address allowlist.</p>
     * 
     * @param request GetAllowedIpListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAllowedIpListResponse
     */
    public GetAllowedIpListResponse getAllowedIpListWithOptions(GetAllowedIpListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetAllowedIpList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAllowedIpListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The GetAllowedIpList operation retrieves the IP address allowlist.</p>
     * 
     * @param request GetAllowedIpListRequest
     * @return GetAllowedIpListResponse
     */
    public GetAllowedIpListResponse getAllowedIpList(GetAllowedIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllowedIpListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h6><strong>This operation applies only to Serverless instances.</strong></h6>
     * 
     * <b>summary</b> : 
     * <p>After a Serverless instance is deployed, you can call this API operation to query the auto scaling configuration of the instance.</p>
     * 
     * @param request GetAutoScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoScalingConfigurationResponse
     */
    public GetAutoScalingConfigurationResponse getAutoScalingConfigurationWithOptions(GetAutoScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetAutoScalingConfiguration"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <h6><strong>This operation applies only to Serverless instances.</strong></h6>
     * 
     * <b>summary</b> : 
     * <p>After a Serverless instance is deployed, you can call this API operation to query the auto scaling configuration of the instance.</p>
     * 
     * @param request GetAutoScalingConfigurationRequest
     * @return GetAutoScalingConfigurationResponse
     */
    public GetAutoScalingConfigurationResponse getAutoScalingConfiguration(GetAutoScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of consumer groups.</p>
     * 
     * @param request GetConsumerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumerListResponse
     */
    public GetConsumerListResponse getConsumerListWithOptions(GetConsumerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of consumer groups.</p>
     * 
     * @param request GetConsumerListRequest
     * @return GetConsumerListResponse
     */
    public GetConsumerListResponse getConsumerList(GetConsumerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConsumerListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the consumption status of a consumer group.</p>
     * 
     * @param request GetConsumerProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumerProgressResponse
     */
    public GetConsumerProgressResponse getConsumerProgressWithOptions(GetConsumerProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hideLastTimestamp)) {
            query.put("HideLastTimestamp", request.hideLastTimestamp);
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
            new TeaPair("action", "GetConsumerProgress"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the consumption status of a consumer group.</p>
     * 
     * @param request GetConsumerProgressRequest
     * @return GetConsumerProgressResponse
     */
    public GetConsumerProgressResponse getConsumerProgress(GetConsumerProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConsumerProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about instances in a specified region.</p>
     * 
     * @param request GetInstanceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceListResponse
     */
    public GetInstanceListResponse getInstanceListWithOptions(GetInstanceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            query.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about instances in a specified region.</p>
     * 
     * @param request GetInstanceListRequest
     * @return GetInstanceListResponse
     */
    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The IP information is retrieved from the sampling logs of client requests to the server through the Kafka API.</li>
     * <li>The count indicates the number of connections from a single IP address using different ports that the server detected within the specified time range.</li>
     * <li>If your server is not running the latest minor version, the sampling logs may be inaccurate and provide less precise IP information. We recommend that you upgrade the server to the latest minor version.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the IP addresses of Kafka clients.</p>
     * 
     * @param request GetKafkaClientIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKafkaClientIpResponse
     */
    public GetKafkaClientIpResponse getKafkaClientIpWithOptions(GetKafkaClientIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKafkaClientIp"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKafkaClientIpResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The IP information is retrieved from the sampling logs of client requests to the server through the Kafka API.</li>
     * <li>The count indicates the number of connections from a single IP address using different ports that the server detected within the specified time range.</li>
     * <li>If your server is not running the latest minor version, the sampling logs may be inaccurate and provide less precise IP information. We recommend that you upgrade the server to the latest minor version.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the IP addresses of Kafka clients.</p>
     * 
     * @param request GetKafkaClientIpRequest
     * @return GetKafkaClientIpResponse
     */
    public GetKafkaClientIpResponse getKafkaClientIp(GetKafkaClientIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKafkaClientIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the usage quotas for topics and partitions.</p>
     * 
     * @param request GetQuotaTipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaTipResponse
     */
    public GetQuotaTipResponse getQuotaTipWithOptions(GetQuotaTipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetQuotaTip"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaTipResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the usage quotas for topics and partitions.</p>
     * 
     * @param request GetQuotaTipRequest
     * @return GetQuotaTipResponse
     */
    public GetQuotaTipResponse getQuotaTip(GetQuotaTipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaTipWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of threats on an instance.</p>
     * 
     * @param request GetRiskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRiskListResponse
     */
    public GetRiskListResponse getRiskListWithOptions(GetRiskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startIndex)) {
            query.put("StartIndex", request.startIndex);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRiskList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRiskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of threats on an instance.</p>
     * 
     * @param request GetRiskListRequest
     * @return GetRiskListResponse
     */
    public GetRiskListResponse getRiskList(GetRiskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRiskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about topics.</p>
     * 
     * @param request GetTopicListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTopicListResponse
     */
    public GetTopicListResponse getTopicListWithOptions(GetTopicListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about topics.</p>
     * 
     * @param request GetTopicListRequest
     * @return GetTopicListResponse
     */
    public GetTopicListResponse getTopicList(GetTopicListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the message sending and receiving status of a topic.</p>
     * 
     * @param request GetTopicStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTopicStatusResponse
     */
    public GetTopicStatusResponse getTopicStatusWithOptions(GetTopicStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicStatus"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the message sending and receiving status of a topic.</p>
     * 
     * @param request GetTopicStatusRequest
     * @return GetTopicStatusResponse
     */
    public GetTopicStatusResponse getTopicStatus(GetTopicStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the subscription status of Groups for a topic.</p>
     * 
     * @param request GetTopicSubscribeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTopicSubscribeStatusResponse
     */
    public GetTopicSubscribeStatusResponse getTopicSubscribeStatusWithOptions(GetTopicSubscribeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicSubscribeStatus"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicSubscribeStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the subscription status of Groups for a topic.</p>
     * 
     * @param request GetTopicSubscribeStatusRequest
     * @return GetTopicSubscribeStatusResponse
     */
    public GetTopicSubscribeStatusResponse getTopicSubscribeStatus(GetTopicSubscribeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicSubscribeStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of rebalancing tasks.</p>
     * 
     * @param request ListRebalanceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRebalanceInfoResponse
     */
    public ListRebalanceInfoResponse listRebalanceInfoWithOptions(ListRebalanceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
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
            new TeaPair("action", "ListRebalanceInfo"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRebalanceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of rebalancing tasks.</p>
     * 
     * @param request ListRebalanceInfoRequest
     * @return ListRebalanceInfoResponse
     */
    public ListRebalanceInfoResponse listRebalanceInfo(ListRebalanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRebalanceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of tags that are attached to resources.</p>
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
            new TeaPair("version", "2019-09-16"),
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
     * <b>summary</b> : 
     * <p>Queries the list of tags that are attached to resources.</p>
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
     * <p>You can modify the name of an ApsaraMQ for Kafka instance after it is deployed. This topic describes how to call the ModifyInstanceName operation.</p>
     * 
     * @param request ModifyInstanceNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceNameResponse
     */
    public ModifyInstanceNameResponse modifyInstanceNameWithOptions(ModifyInstanceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceName"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can modify the name of an ApsaraMQ for Kafka instance after it is deployed. This topic describes how to call the ModifyInstanceName operation.</p>
     * 
     * @param request ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     */
    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation modifies the number of partitions in a topic.</p>
     * 
     * @param request ModifyPartitionNumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPartitionNumResponse
     */
    public ModifyPartitionNumResponse modifyPartitionNumWithOptions(ModifyPartitionNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addPartitionNum)) {
            query.put("AddPartitionNum", request.addPartitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPartitionNum"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPartitionNumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation modifies the number of partitions in a topic.</p>
     * 
     * @param request ModifyPartitionNumRequest
     * @return ModifyPartitionNumResponse
     */
    public ModifyPartitionNumResponse modifyPartitionNum(ModifyPartitionNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPartitionNumWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h6>This operation applies only to Serverless instances.</h6>
     * 
     * <b>summary</b> : 
     * <p>After you deploy Serverless instances, you can call this API operation to modify their scheduled scaling policy.</p>
     * 
     * @param request ModifyScheduledScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScheduledScalingRuleResponse
     */
    public ModifyScheduledScalingRuleResponse modifyScheduledScalingRuleWithOptions(ModifyScheduledScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

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
            new TeaPair("action", "ModifyScheduledScalingRule"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScheduledScalingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h6>This operation applies only to Serverless instances.</h6>
     * 
     * <b>summary</b> : 
     * <p>After you deploy Serverless instances, you can call this API operation to modify their scheduled scaling policy.</p>
     * 
     * @param request ModifyScheduledScalingRuleRequest
     * @return ModifyScheduledScalingRuleResponse
     */
    public ModifyScheduledScalingRuleResponse modifyScheduledScalingRule(ModifyScheduledScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScheduledScalingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remark of a topic.</p>
     * 
     * @param request ModifyTopicRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTopicRemarkResponse
     */
    public ModifyTopicRemarkResponse modifyTopicRemarkWithOptions(ModifyTopicRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTopicRemark"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTopicRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remark of a topic.</p>
     * 
     * @param request ModifyTopicRemarkRequest
     * @return ModifyTopicRemarkResponse
     */
    public ModifyTopicRemarkResponse modifyTopicRemark(ModifyTopicRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTopicRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyUserDefinedSg</p>
     * 
     * @param tmpReq ModifyUserDefinedSgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserDefinedSgResponse
     */
    public ModifyUserDefinedSgResponse modifyUserDefinedSgWithOptions(ModifyUserDefinedSgRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyUserDefinedSgShrinkRequest request = new ModifyUserDefinedSgShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sgIdList)) {
            request.sgIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sgIdList, "SgIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sgIdListShrink)) {
            query.put("SgIdList", request.sgIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserDefinedSg"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserDefinedSgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyUserDefinedSg</p>
     * 
     * @param request ModifyUserDefinedSgRequest
     * @return ModifyUserDefinedSgResponse
     */
    public ModifyUserDefinedSgResponse modifyUserDefinedSg(ModifyUserDefinedSgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserDefinedSgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation queries messages stored in a topic by message creation time or offset.</p>
     * 
     * @param request QueryMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMessageResponse
     */
    public QueryMessageResponse queryMessageWithOptions(QueryMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMessage"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation queries messages stored in a topic by message creation time or offset.</p>
     * 
     * @param request QueryMessageRequest
     * @return QueryMessageResponse
     */
    public QueryMessageResponse queryMessage(QueryMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMessageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot use this operation to release subscription instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go instance.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDeleteInstance)) {
            query.put("ForceDeleteInstance", request.forceDeleteInstance);
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
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You cannot use this operation to release subscription instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go instance.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only when the instance is in the Stopped state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts an instance.</p>
     * 
     * @param request ReopenInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReopenInstanceResponse
     */
    public ReopenInstanceResponse reopenInstanceWithOptions(ReopenInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ReopenInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReopenInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only when the instance is in the Stopped state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts an instance.</p>
     * 
     * @param request ReopenInstanceRequest
     * @return ReopenInstanceResponse
     */
    public ReopenInstanceResponse reopenInstance(ReopenInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reopenInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The request frequency is limited to 2 queries per second (QPS) for each user.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You must purchase and deploy an ApsaraMQ for Kafka instance before you can send and receive messages. This topic describes how to deploy an instance by calling the StartInstance operation.</p>
     * 
     * @param request StartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossZone)) {
            query.put("CrossZone", request.crossZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployModule)) {
            query.put("DeployModule", request.deployModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEipInner)) {
            query.put("IsEipInner", request.isEipInner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isForceSelectedZones)) {
            query.put("IsForceSelectedZones", request.isForceSelectedZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSetUserAndPassword)) {
            query.put("IsSetUserAndPassword", request.isSetUserAndPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.KMSKeyId)) {
            query.put("KMSKeyId", request.KMSKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifier)) {
            query.put("Notifier", request.notifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroup)) {
            query.put("SecurityGroup", request.securityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedZones)) {
            query.put("SelectedZones", request.selectedZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPhoneNum)) {
            query.put("UserPhoneNum", request.userPhoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The request frequency is limited to 2 queries per second (QPS) for each user.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You must purchase and deploy an ApsaraMQ for Kafka instance before you can send and receive messages. This topic describes how to deploy an instance by calling the StartInstance operation.</p>
     * 
     * @param request StartInstanceRequest
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Stopping subscription instances is not currently supported. To stop a subscription instance, submit a ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an instance.</p>
     * 
     * @param request StopInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Stopping subscription instances is not currently supported. To stop a subscription instance, submit a ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an instance.</p>
     * 
     * @param request StopInstanceRequest
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the TagResources operation to attach tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2019-09-16"),
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
     * <b>summary</b> : 
     * <p>You can call the TagResources operation to attach tags to resources.</p>
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
     * <p>You can call UntagResources to detach tags from resources.</p>
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
            new TeaPair("version", "2019-09-16"),
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
     * <p>You can call UntagResources to detach tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the UpdateAllowedIp operation to edit the IP whitelist for an ApsaraMQ for Kafka instance. The whitelist specifies the IP addresses and ports that are allowed to access the instance.</p>
     * 
     * @param request UpdateAllowedIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAllowedIpResponse
     */
    public UpdateAllowedIpResponse updateAllowedIpWithOptions(UpdateAllowedIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedListIp)) {
            query.put("AllowedListIp", request.allowedListIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedListType)) {
            query.put("AllowedListType", request.allowedListType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRange)) {
            query.put("PortRange", request.portRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateType)) {
            query.put("UpdateType", request.updateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAllowedIp"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAllowedIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the UpdateAllowedIp operation to edit the IP whitelist for an ApsaraMQ for Kafka instance. The whitelist specifies the IP addresses and ports that are allowed to access the instance.</p>
     * 
     * @param request UpdateAllowedIpRequest
     * @return UpdateAllowedIpResponse
     */
    public UpdateAllowedIpResponse updateAllowedIp(UpdateAllowedIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAllowedIpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation resets the consumer offset of a specified consumer group. You can reset the consumer offset by timestamp or by a specific offset value. Using different parameter combinations, you can perform the following tasks:</p>
     * <ul>
     * <li>Consume messages from the latest offset by setting the consumer offset to the latest position. This is supported for a single topic or all topics.</li>
     * <li>Consume messages from the offset of a specified time point by providing a timestamp. This is supported for a single topic or all topics.</li>
     * <li>Reset the consumer offset for a specific partition by providing the target partition ID and consumer offset. This is supported only for a single topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The UpdateConsumerOffset operation resets the consumer offset of a consumer group.</p>
     * 
     * @param tmpReq UpdateConsumerOffsetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConsumerOffsetResponse
     */
    public UpdateConsumerOffsetResponse updateConsumerOffsetWithOptions(UpdateConsumerOffsetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConsumerOffsetShrinkRequest request = new UpdateConsumerOffsetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.offsets)) {
            request.offsetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.offsets, "Offsets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offsetsShrink)) {
            query.put("Offsets", request.offsetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConsumerOffset"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConsumerOffsetResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation resets the consumer offset of a specified consumer group. You can reset the consumer offset by timestamp or by a specific offset value. Using different parameter combinations, you can perform the following tasks:</p>
     * <ul>
     * <li>Consume messages from the latest offset by setting the consumer offset to the latest position. This is supported for a single topic or all topics.</li>
     * <li>Consume messages from the offset of a specified time point by providing a timestamp. This is supported for a single topic or all topics.</li>
     * <li>Reset the consumer offset for a specific partition by providing the target partition ID and consumer offset. This is supported only for a single topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The UpdateConsumerOffset operation resets the consumer offset of a consumer group.</p>
     * 
     * @param request UpdateConsumerOffsetRequest
     * @return UpdateConsumerOffsetResponse
     */
    public UpdateConsumerOffsetResponse updateConsumerOffset(UpdateConsumerOffsetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConsumerOffsetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><strong>Permission information</strong></h2>
     * <p>RAM users must obtain authorization before they can call the <strong>UpdateInstanceConfig</strong> operation. For more information, see <a href="https://help.aliyun.com/document_detail/185815.html">RAM access policies</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>API</th>
     * <th>Action</th>
     * <th>Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>UpdateInstanceConfig</td>
     * <td>alikafka: UpdateInstance</td>
     * <td>acs:alikafka:<em>:</em>:{instanceId}</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>After an instance is deployed, you can modify configurations such as enabling Access Control List (ACL) and SSL, the message retention period, and the maximum message size. This topic describes how to call the UpdateInstanceConfig operation to modify the configuration of an instance.</p>
     * 
     * @param request UpdateInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceConfigResponse
     */
    public UpdateInstanceConfigResponse updateInstanceConfigWithOptions(UpdateInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
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
            new TeaPair("action", "UpdateInstanceConfig"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2><strong>Permission information</strong></h2>
     * <p>RAM users must obtain authorization before they can call the <strong>UpdateInstanceConfig</strong> operation. For more information, see <a href="https://help.aliyun.com/document_detail/185815.html">RAM access policies</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>API</th>
     * <th>Action</th>
     * <th>Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>UpdateInstanceConfig</td>
     * <td>alikafka: UpdateInstance</td>
     * <td>acs:alikafka:<em>:</em>:{instanceId}</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>After an instance is deployed, you can modify configurations such as enabling Access Control List (ACL) and SSL, the message retention period, and the maximum message size. This topic describes how to call the UpdateInstanceConfig operation to modify the configuration of an instance.</p>
     * 
     * @param request UpdateInstanceConfigRequest
     * @return UpdateInstanceConfigResponse
     */
    public UpdateInstanceConfigResponse updateInstanceConfig(UpdateInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>After a topic is created, you can modify its configurations, such as the message retention period and maximum message size. This topic describes how to call this API operation to modify topic configurations.</p>
     * 
     * @param request UpdateTopicConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTopicConfigResponse
     */
    public UpdateTopicConfigResponse updateTopicConfigWithOptions(UpdateTopicConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTopicConfig"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTopicConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>After a topic is created, you can modify its configurations, such as the message retention period and maximum message size. This topic describes how to call this API operation to modify topic configurations.</p>
     * 
     * @param request UpdateTopicConfigRequest
     * @return UpdateTopicConfigResponse
     */
    public UpdateTopicConfigResponse updateTopicConfig(UpdateTopicConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTopicConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><strong>Permission description</strong></h2>
     * <p>RAM users must be authorized before they can call the <strong>UpgradeInstanceVersion</strong> API. For more information about authorization, see <a href="https://help.aliyun.com/document_detail/185815.html">RAM access policy</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>API</th>
     * <th>Action</th>
     * <th>Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>UpgradeInstanceVersion</td>
     * <td>UpdateInstance</td>
     * <td>acs:alikafka:<em>:</em>:{instanceId}</td>
     * </tr>
     * </tbody></table>
     * <h2><strong>QPS limits</strong></h2>
     * <p>The request frequency is limited to 2 queries per second (QPS) for a single user.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the version of an instance.</p>
     * 
     * @param request UpgradeInstanceVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeInstanceVersionResponse
     */
    public UpgradeInstanceVersionResponse upgradeInstanceVersionWithOptions(UpgradeInstanceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("TargetVersion", request.targetVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeInstanceVersion"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeInstanceVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2><strong>Permission description</strong></h2>
     * <p>RAM users must be authorized before they can call the <strong>UpgradeInstanceVersion</strong> API. For more information about authorization, see <a href="https://help.aliyun.com/document_detail/185815.html">RAM access policy</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>API</th>
     * <th>Action</th>
     * <th>Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>UpgradeInstanceVersion</td>
     * <td>UpdateInstance</td>
     * <td>acs:alikafka:<em>:</em>:{instanceId}</td>
     * </tr>
     * </tbody></table>
     * <h2><strong>QPS limits</strong></h2>
     * <p>The request frequency is limited to 2 queries per second (QPS) for a single user.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the version of an instance.</p>
     * 
     * @param request UpgradeInstanceVersionRequest
     * @return UpgradeInstanceVersionResponse
     */
    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeInstanceVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing method and pricing of pay-as-you-go instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades a pay-as-you-go instance.</p>
     * 
     * @param tmpReq UpgradePostPayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradePostPayOrderResponse
     */
    public UpgradePostPayOrderResponse upgradePostPayOrderWithOptions(UpgradePostPayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradePostPayOrderShrinkRequest request = new UpgradePostPayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverlessConfig)) {
            request.serverlessConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverlessConfig, "ServerlessConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipModel)) {
            query.put("EipModel", request.eipModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessConfigShrink)) {
            query.put("ServerlessConfig", request.serverlessConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradePostPayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradePostPayOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing method and pricing of pay-as-you-go instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades a pay-as-you-go instance.</p>
     * 
     * @param request UpgradePostPayOrderRequest
     * @return UpgradePostPayOrderResponse
     */
    public UpgradePostPayOrderResponse upgradePostPayOrder(UpgradePostPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradePostPayOrderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure you understand the billing method and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades a subscription instance.</p>
     * 
     * @param tmpReq UpgradePrePayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradePrePayOrderResponse
     */
    public UpgradePrePayOrderResponse upgradePrePayOrderWithOptions(UpgradePrePayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradePrePayOrderShrinkRequest request = new UpgradePrePayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.confluentConfig)) {
            request.confluentConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.confluentConfig, "ConfluentConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confluentConfigShrink)) {
            query.put("ConfluentConfig", request.confluentConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipModel)) {
            query.put("EipModel", request.eipModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradePrePayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradePrePayOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure you understand the billing method and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades a subscription instance.</p>
     * 
     * @param request UpgradePrePayOrderRequest
     * @return UpgradePrePayOrderResponse
     */
    public UpgradePrePayOrderResponse upgradePrePayOrder(UpgradePrePayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradePrePayOrderWithOptions(request, runtime);
    }
}

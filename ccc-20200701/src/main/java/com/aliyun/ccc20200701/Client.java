// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701;

import com.aliyun.tea.*;
import com.aliyun.ccc20200701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-south-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ccc.aliyuncs.com"),
            new TeaPair("cn-beijing", "ccc.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ccc.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ccc.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ccc.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ccc.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ccc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ccc.aliyuncs.com"),
            new TeaPair("eu-central-1", "ccc.aliyuncs.com"),
            new TeaPair("eu-west-1", "ccc.aliyuncs.com"),
            new TeaPair("me-east-1", "ccc.aliyuncs.com"),
            new TeaPair("us-east-1", "ccc.aliyuncs.com"),
            new TeaPair("us-west-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ccc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ccc.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ccc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>废弃预测式外呼活动</p>
     * 
     * @param request AbortCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbortCampaignResponse
     */
    public AbortCampaignResponse abortCampaignWithOptions(AbortCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>废弃预测式外呼活动</p>
     * 
     * @param request AbortCampaignRequest
     * @return AbortCampaignResponse
     */
    public AbortCampaignResponse abortCampaign(AbortCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abortCampaignWithOptions(request, runtime);
    }

    /**
     * @param request AcceptChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptChatResponse
     */
    public AcceptChatResponse acceptChatWithOptions(AcceptChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptChat"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptChatResponse());
    }

    /**
     * @param request AcceptChatRequest
     * @return AcceptChatResponse
     */
    public AcceptChatResponse acceptChat(AcceptChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑呼入控制号码</p>
     * 
     * @param request AddBlacklistCallTaggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBlacklistCallTaggingResponse
     */
    public AddBlacklistCallTaggingResponse addBlacklistCallTaggingWithOptions(AddBlacklistCallTaggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBlacklistCallTagging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBlacklistCallTaggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑呼入控制号码</p>
     * 
     * @param request AddBlacklistCallTaggingRequest
     * @return AddBlacklistCallTaggingResponse
     */
    public AddBlacklistCallTaggingResponse addBlacklistCallTagging(AddBlacklistCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBlacklistCallTaggingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>追加联系人</p>
     * 
     * @param tmpReq AddCasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCasesResponse
     */
    public AddCasesResponse addCasesWithOptions(AddCasesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddCasesShrinkRequest request = new AddCasesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.caseList)) {
            request.caseListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.caseList, "CaseList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseListShrink)) {
            query.put("CaseList", request.caseListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCases"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>追加联系人</p>
     * 
     * @param request AddCasesRequest
     * @return AddCasesResponse
     */
    public AddCasesResponse addCases(AddCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasesWithOptions(request, runtime);
    }

    /**
     * @param request AddNumbersToSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddNumbersToSkillGroupResponse
     */
    public AddNumbersToSkillGroupResponse addNumbersToSkillGroupWithOptions(AddNumbersToSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instNumberGroupIdList)) {
            query.put("InstNumberGroupIdList", request.instNumberGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddNumbersToSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddNumbersToSkillGroupResponse());
    }

    /**
     * @param request AddNumbersToSkillGroupRequest
     * @return AddNumbersToSkillGroupResponse
     */
    public AddNumbersToSkillGroupResponse addNumbersToSkillGroup(AddNumbersToSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addNumbersToSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request AddPersonalNumbersToUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPersonalNumbersToUserResponse
     */
    public AddPersonalNumbersToUserResponse addPersonalNumbersToUserWithOptions(AddPersonalNumbersToUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPersonalNumbersToUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPersonalNumbersToUserResponse());
    }

    /**
     * @param request AddPersonalNumbersToUserRequest
     * @return AddPersonalNumbersToUserResponse
     */
    public AddPersonalNumbersToUserResponse addPersonalNumbersToUser(AddPersonalNumbersToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPersonalNumbersToUserWithOptions(request, runtime);
    }

    /**
     * @param request AddPhoneNumberToSkillGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPhoneNumberToSkillGroupsResponse
     */
    public AddPhoneNumberToSkillGroupsResponse addPhoneNumberToSkillGroupsWithOptions(AddPhoneNumberToSkillGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPhoneNumberToSkillGroups"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPhoneNumberToSkillGroupsResponse());
    }

    /**
     * @param request AddPhoneNumberToSkillGroupsRequest
     * @return AddPhoneNumberToSkillGroupsResponse
     */
    public AddPhoneNumberToSkillGroupsResponse addPhoneNumberToSkillGroups(AddPhoneNumberToSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPhoneNumberToSkillGroupsWithOptions(request, runtime);
    }

    /**
     * @param request AddPhoneNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPhoneNumbersResponse
     */
    public AddPhoneNumbersResponse addPhoneNumbersWithOptions(AddPhoneNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberGroupId)) {
            query.put("NumberGroupId", request.numberGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPhoneNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPhoneNumbersResponse());
    }

    /**
     * @param request AddPhoneNumbersRequest
     * @return AddPhoneNumbersResponse
     */
    public AddPhoneNumbersResponse addPhoneNumbers(AddPhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPhoneNumbersWithOptions(request, runtime);
    }

    /**
     * @param tmpReq AddSchemaPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSchemaPropertyResponse
     */
    public AddSchemaPropertyResponse addSchemaPropertyWithOptions(AddSchemaPropertyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddSchemaPropertyShrinkRequest request = new AddSchemaPropertyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.property)) {
            request.propertyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.property, "Property", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyShrink)) {
            body.put("Property", request.propertyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSchemaProperty"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSchemaPropertyResponse());
    }

    /**
     * @param request AddSchemaPropertyRequest
     * @return AddSchemaPropertyResponse
     */
    public AddSchemaPropertyResponse addSchemaProperty(AddSchemaPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSchemaPropertyWithOptions(request, runtime);
    }

    /**
     * @param request AddSkillGroupsToUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSkillGroupsToUserResponse
     */
    public AddSkillGroupsToUserResponse addSkillGroupsToUserWithOptions(AddSkillGroupsToUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevelList)) {
            query.put("SkillLevelList", request.skillLevelList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSkillGroupsToUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSkillGroupsToUserResponse());
    }

    /**
     * @param request AddSkillGroupsToUserRequest
     * @return AddSkillGroupsToUserResponse
     */
    public AddSkillGroupsToUserResponse addSkillGroupsToUser(AddSkillGroupsToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSkillGroupsToUserWithOptions(request, runtime);
    }

    /**
     * @param request AddUsersToSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUsersToSkillGroupResponse
     */
    public AddUsersToSkillGroupResponse addUsersToSkillGroupWithOptions(AddUsersToSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSkillLevelList)) {
            query.put("UserSkillLevelList", request.userSkillLevelList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUsersToSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUsersToSkillGroupResponse());
    }

    /**
     * @param request AddUsersToSkillGroupRequest
     * @return AddUsersToSkillGroupResponse
     */
    public AddUsersToSkillGroupResponse addUsersToSkillGroup(AddUsersToSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUsersToSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request AnalyzeConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnalyzeConversationResponse
     */
    public AnalyzeConversationResponse analyzeConversationWithOptions(AnalyzeConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldListJson)) {
            query.put("FieldListJson", request.fieldListJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskListJson)) {
            query.put("TaskListJson", request.taskListJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnalyzeConversation"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnalyzeConversationResponse());
    }

    /**
     * @param request AnalyzeConversationRequest
     * @return AnalyzeConversationResponse
     */
    public AnalyzeConversationResponse analyzeConversation(AnalyzeConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.analyzeConversationWithOptions(request, runtime);
    }

    /**
     * @param request AnswerCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnswerCallResponse
     */
    public AnswerCallResponse answerCallWithOptions(AnswerCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnswerCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnswerCallResponse());
    }

    /**
     * @param request AnswerCallRequest
     * @return AnswerCallResponse
     */
    public AnswerCallResponse answerCall(AnswerCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.answerCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>追加联系人</p>
     * 
     * @param tmpReq AppendCasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AppendCasesResponse
     */
    public AppendCasesResponse appendCasesWithOptions(AppendCasesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AppendCasesShrinkRequest request = new AppendCasesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppendCases"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppendCasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>追加联系人</p>
     * 
     * @param request AppendCasesRequest
     * @return AppendCasesResponse
     */
    public AppendCasesResponse appendCases(AppendCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.appendCasesWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI AssignUsers is deprecated, please use CCC::2020-07-01::ImportRamUsers instead.
     * 
     * @param request AssignUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignUsersResponse
     */
    @Deprecated
    // Deprecated
    public AssignUsersResponse assignUsersWithOptions(AssignUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramIdList)) {
            query.put("RamIdList", request.ramIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevelList)) {
            query.put("SkillLevelList", request.skillLevelList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workMode)) {
            query.put("WorkMode", request.workMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignUsers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignUsersResponse());
    }

    /**
     * @deprecated OpenAPI AssignUsers is deprecated, please use CCC::2020-07-01::ImportRamUsers instead.
     * 
     * @param request AssignUsersRequest
     * @return AssignUsersResponse
     */
    @Deprecated
    // Deprecated
    public AssignUsersResponse assignUsers(AssignUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignUsersWithOptions(request, runtime);
    }

    /**
     * @param request BargeInCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BargeInCallResponse
     */
    public BargeInCallResponse bargeInCallWithOptions(BargeInCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bargedUserId)) {
            query.put("BargedUserId", request.bargedUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BargeInCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BargeInCallResponse());
    }

    /**
     * @param request BargeInCallRequest
     * @return BargeInCallResponse
     */
    public BargeInCallResponse bargeInCall(BargeInCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bargeInCallWithOptions(request, runtime);
    }

    /**
     * @param request BlindTransferRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BlindTransferResponse
     */
    public BlindTransferResponse blindTransferWithOptions(BlindTransferRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callPriority)) {
            query.put("CallPriority", request.callPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowVariables)) {
            query.put("ContactFlowVariables", request.contactFlowVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingOverflowThreshold)) {
            query.put("QueuingOverflowThreshold", request.queuingOverflowThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingTimeoutSeconds)) {
            query.put("QueuingTimeoutSeconds", request.queuingTimeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingType)) {
            query.put("RoutingType", request.routingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            query.put("StrategyName", request.strategyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyParams)) {
            query.put("StrategyParams", request.strategyParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferee)) {
            query.put("Transferee", request.transferee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transfereeType)) {
            query.put("TransfereeType", request.transfereeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferor)) {
            query.put("Transferor", request.transferor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BlindTransfer"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BlindTransferResponse());
    }

    /**
     * @param request BlindTransferRequest
     * @return BlindTransferResponse
     */
    public BlindTransferResponse blindTransfer(BlindTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.blindTransferWithOptions(request, runtime);
    }

    /**
     * @param request BridgeRtcCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BridgeRtcCallResponse
     */
    public BridgeRtcCallResponse bridgeRtcCallWithOptions(BridgeRtcCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceProvider)) {
            query.put("ServiceProvider", request.serviceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoEnabled)) {
            query.put("VideoEnabled", request.videoEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BridgeRtcCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BridgeRtcCallResponse());
    }

    /**
     * @param request BridgeRtcCallRequest
     * @return BridgeRtcCallResponse
     */
    public BridgeRtcCallResponse bridgeRtcCall(BridgeRtcCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bridgeRtcCallWithOptions(request, runtime);
    }

    /**
     * @param request CancelAttendedTransferRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAttendedTransferResponse
     */
    public CancelAttendedTransferResponse cancelAttendedTransferWithOptions(CancelAttendedTransferRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAttendedTransfer"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAttendedTransferResponse());
    }

    /**
     * @param request CancelAttendedTransferRequest
     * @return CancelAttendedTransferResponse
     */
    public CancelAttendedTransferResponse cancelAttendedTransfer(CancelAttendedTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAttendedTransferWithOptions(request, runtime);
    }

    /**
     * @param request ChangeVisibilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeVisibilityResponse
     */
    public ChangeVisibilityResponse changeVisibilityWithOptions(ChangeVisibilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invisible)) {
            query.put("Invisible", request.invisible);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeVisibility"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeVisibilityResponse());
    }

    /**
     * @param request ChangeVisibilityRequest
     * @return ChangeVisibilityResponse
     */
    public ChangeVisibilityResponse changeVisibility(ChangeVisibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeVisibilityWithOptions(request, runtime);
    }

    /**
     * @param request ChangeWorkModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeWorkModeResponse
     */
    public ChangeWorkModeResponse changeWorkModeWithOptions(ChangeWorkModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signedSkillGroupIdList)) {
            query.put("SignedSkillGroupIdList", request.signedSkillGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workMode)) {
            query.put("WorkMode", request.workMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeWorkMode"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeWorkModeResponse());
    }

    /**
     * @param request ChangeWorkModeRequest
     * @return ChangeWorkModeResponse
     */
    public ChangeWorkModeResponse changeWorkMode(ChangeWorkModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeWorkModeWithOptions(request, runtime);
    }

    /**
     * @param request ClaimChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClaimChatResponse
     */
    public ClaimChatResponse claimChatWithOptions(ClaimChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClaimChat"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClaimChatResponse());
    }

    /**
     * @param request ClaimChatRequest
     * @return ClaimChatResponse
     */
    public ClaimChatResponse claimChat(ClaimChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.claimChatWithOptions(request, runtime);
    }

    /**
     * @param request CoachCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CoachCallResponse
     */
    public CoachCallResponse coachCallWithOptions(CoachCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coachedUserId)) {
            query.put("CoachedUserId", request.coachedUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CoachCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CoachCallResponse());
    }

    /**
     * @param request CoachCallRequest
     * @return CoachCallResponse
     */
    public CoachCallResponse coachCall(CoachCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.coachCallWithOptions(request, runtime);
    }

    /**
     * @param request CommitContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommitContactFlowResponse
     */
    public CommitContactFlowResponse commitContactFlowWithOptions(CommitContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            query.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draftId)) {
            query.put("DraftId", request.draftId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitContactFlowResponse());
    }

    /**
     * @param request CommitContactFlowRequest
     * @return CommitContactFlowResponse
     */
    public CommitContactFlowResponse commitContactFlow(CommitContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitContactFlowWithOptions(request, runtime);
    }

    /**
     * @param request CompleteAttendedTransferRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteAttendedTransferResponse
     */
    public CompleteAttendedTransferResponse completeAttendedTransferWithOptions(CompleteAttendedTransferRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteAttendedTransfer"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteAttendedTransferResponse());
    }

    /**
     * @param request CompleteAttendedTransferRequest
     * @return CompleteAttendedTransferResponse
     */
    public CompleteAttendedTransferResponse completeAttendedTransfer(CompleteAttendedTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeAttendedTransferWithOptions(request, runtime);
    }

    /**
     * @param request CreateAudioFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAudioFileResponse
     */
    public CreateAudioFileResponse createAudioFileWithOptions(CreateAudioFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFileName)) {
            query.put("AudioFileName", request.audioFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFileKey)) {
            query.put("OssFileKey", request.ossFileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAudioFile"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAudioFileResponse());
    }

    /**
     * @param request CreateAudioFileRequest
     * @return CreateAudioFileResponse
     */
    public CreateAudioFileResponse createAudioFile(CreateAudioFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAudioFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建号码标签</p>
     * 
     * @param request CreateCallTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCallTagsResponse
     */
    public CreateCallTagsResponse createCallTagsWithOptions(CreateCallTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callTagNameList)) {
            query.put("CallTagNameList", request.callTagNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCallTags"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCallTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建号码标签</p>
     * 
     * @param request CreateCallTagsRequest
     * @return CreateCallTagsResponse
     */
    public CreateCallTagsResponse createCallTags(CreateCallTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCallTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建预测式外呼活动</p>
     * 
     * @param tmpReq CreateCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCampaignResponse
     */
    public CreateCampaignResponse createCampaignWithOptions(CreateCampaignRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCampaignShrinkRequest request = new CreateCampaignShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.caseList)) {
            request.caseListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.caseList, "CaseList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callableTime)) {
            query.put("CallableTime", request.callableTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseFileKey)) {
            query.put("CaseFileKey", request.caseFileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseListShrink)) {
            query.put("CaseList", request.caseListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executingUntilTimeout)) {
            query.put("ExecutingUntilTimeout", request.executingUntilTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttemptCount)) {
            query.put("MaxAttemptCount", request.maxAttemptCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAttemptInterval)) {
            query.put("MinAttemptInterval", request.minAttemptInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueId)) {
            query.put("QueueId", request.queueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simulation)) {
            query.put("Simulation", request.simulation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simulationParameters)) {
            query.put("SimulationParameters", request.simulationParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyParameters)) {
            query.put("StrategyParameters", request.strategyParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyType)) {
            query.put("StrategyType", request.strategyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建预测式外呼活动</p>
     * 
     * @param request CreateCampaignRequest
     * @return CreateCampaignResponse
     */
    public CreateCampaignResponse createCampaign(CreateCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCampaignWithOptions(request, runtime);
    }

    /**
     * @param request CreateContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContactFlowResponse
     */
    public CreateContactFlowResponse createContactFlowWithOptions(CreateContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            query.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

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
            new TeaPair("action", "CreateContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContactFlowResponse());
    }

    /**
     * @param request CreateContactFlowRequest
     * @return CreateContactFlowResponse
     */
    public CreateContactFlowResponse createContactFlow(CreateContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建呼入控制号码</p>
     * 
     * @deprecated OpenAPI CreateCustomCallTagging is deprecated, please use CCC::2020-07-01::CreateCustomCallTaggings instead.
     * 
     * @param request CreateCustomCallTaggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomCallTaggingResponse
     */
    @Deprecated
    // Deprecated
    public CreateCustomCallTaggingResponse createCustomCallTaggingWithOptions(CreateCustomCallTaggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customNumberList)) {
            query.put("CustomNumberList", request.customNumberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomCallTagging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomCallTaggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建呼入控制号码</p>
     * 
     * @deprecated OpenAPI CreateCustomCallTagging is deprecated, please use CCC::2020-07-01::CreateCustomCallTaggings instead.
     * 
     * @param request CreateCustomCallTaggingRequest
     * @return CreateCustomCallTaggingResponse
     */
    @Deprecated
    // Deprecated
    public CreateCustomCallTaggingResponse createCustomCallTagging(CreateCustomCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomCallTaggingWithOptions(request, runtime);
    }

    /**
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminRamIdList)) {
            query.put("AdminRamIdList", request.adminRamIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * @param tmpReq CreateSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSchemaResponse
     */
    public CreateSchemaResponse createSchemaWithOptions(CreateSchemaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSchemaShrinkRequest request = new CreateSchemaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.properties)) {
            request.propertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.properties, "Properties", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertiesShrink)) {
            body.put("Properties", request.propertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSchema"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSchemaResponse());
    }

    /**
     * @param request CreateSchemaRequest
     * @return CreateSchemaResponse
     */
    public CreateSchemaResponse createSchema(CreateSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSchemaWithOptions(request, runtime);
    }

    /**
     * @param request CreateSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillGroupResponse
     */
    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillGroupResponse());
    }

    /**
     * @param request CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarUrl)) {
            query.put("AvatarUrl", request.avatarUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayId)) {
            query.put("DisplayId", request.displayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginName)) {
            query.put("LoginName", request.loginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickname)) {
            query.put("Nickname", request.nickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetPassword)) {
            query.put("ResetPassword", request.resetPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevelList)) {
            query.put("SkillLevelList", request.skillLevelList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workMode)) {
            query.put("WorkMode", request.workMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAudioFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAudioFileResponse
     */
    public DeleteAudioFileResponse deleteAudioFileWithOptions(DeleteAudioFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioResourceId)) {
            query.put("AudioResourceId", request.audioResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAudioFile"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAudioFileResponse());
    }

    /**
     * @param request DeleteAudioFileRequest
     * @return DeleteAudioFileResponse
     */
    public DeleteAudioFileResponse deleteAudioFile(DeleteAudioFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAudioFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除号码标签</p>
     * 
     * @param request DeleteCallTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCallTagResponse
     */
    public DeleteCallTagResponse deleteCallTagWithOptions(DeleteCallTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCallTag"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCallTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除号码标签</p>
     * 
     * @param request DeleteCallTagRequest
     * @return DeleteCallTagResponse
     */
    public DeleteCallTagResponse deleteCallTag(DeleteCallTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCallTagWithOptions(request, runtime);
    }

    /**
     * @param request DeleteContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactFlowResponse
     */
    public DeleteContactFlowResponse deleteContactFlowWithOptions(DeleteContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactFlowResponse());
    }

    /**
     * @param request DeleteContactFlowRequest
     * @return DeleteContactFlowResponse
     */
    public DeleteContactFlowResponse deleteContactFlow(DeleteContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除呼入控制号码</p>
     * 
     * @param request DeleteCustomCallTaggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomCallTaggingResponse
     */
    public DeleteCustomCallTaggingResponse deleteCustomCallTaggingWithOptions(DeleteCustomCallTaggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomCallTagging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomCallTaggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除呼入控制号码</p>
     * 
     * @param request DeleteCustomCallTaggingRequest
     * @return DeleteCustomCallTaggingResponse
     */
    public DeleteCustomCallTaggingResponse deleteCustomCallTagging(DeleteCustomCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomCallTaggingWithOptions(request, runtime);
    }

    /**
     * @param request DeleteDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocumentWithOptions(DeleteDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            body.put("DocumentId", request.documentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDocument"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentResponse());
    }

    /**
     * @param request DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocument(DeleteDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocumentWithOptions(request, runtime);
    }

    /**
     * @param tmpReq DeleteDocumentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentsResponse
     */
    public DeleteDocumentsResponse deleteDocumentsWithOptions(DeleteDocumentsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDocumentsShrinkRequest request = new DeleteDocumentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentIds)) {
            request.documentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentIds, "DocumentIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIdsShrink)) {
            body.put("DocumentIds", request.documentIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDocuments"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentsResponse());
    }

    /**
     * @param request DeleteDocumentsRequest
     * @return DeleteDocumentsResponse
     */
    public DeleteDocumentsResponse deleteDocuments(DeleteDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocumentsWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSchemaResponse
     */
    public DeleteSchemaResponse deleteSchemaWithOptions(DeleteSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSchema"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSchemaResponse());
    }

    /**
     * @param request DeleteSchemaRequest
     * @return DeleteSchemaResponse
     */
    public DeleteSchemaResponse deleteSchema(DeleteSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSchemaWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSchemaPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSchemaPropertyResponse
     */
    public DeleteSchemaPropertyResponse deleteSchemaPropertyWithOptions(DeleteSchemaPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyName)) {
            body.put("PropertyName", request.propertyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSchemaProperty"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSchemaPropertyResponse());
    }

    /**
     * @param request DeleteSchemaPropertyRequest
     * @return DeleteSchemaPropertyResponse
     */
    public DeleteSchemaPropertyResponse deleteSchemaProperty(DeleteSchemaPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSchemaPropertyWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillGroupResponse
     */
    public DeleteSkillGroupResponse deleteSkillGroupWithOptions(DeleteSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSkillGroupResponse());
    }

    /**
     * @param request DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    public DeleteSkillGroupResponse deleteSkillGroup(DeleteSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request DisableSchemaPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSchemaPropertyResponse
     */
    public DisableSchemaPropertyResponse disableSchemaPropertyWithOptions(DisableSchemaPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyName)) {
            body.put("PropertyName", request.propertyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSchemaProperty"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSchemaPropertyResponse());
    }

    /**
     * @param request DisableSchemaPropertyRequest
     * @return DisableSchemaPropertyResponse
     */
    public DisableSchemaPropertyResponse disableSchemaProperty(DisableSchemaPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSchemaPropertyWithOptions(request, runtime);
    }

    /**
     * @param request DiscardEditingContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DiscardEditingContactFlowResponse
     */
    public DiscardEditingContactFlowResponse discardEditingContactFlowWithOptions(DiscardEditingContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draftId)) {
            query.put("DraftId", request.draftId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DiscardEditingContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiscardEditingContactFlowResponse());
    }

    /**
     * @param request DiscardEditingContactFlowRequest
     * @return DiscardEditingContactFlowResponse
     */
    public DiscardEditingContactFlowResponse discardEditingContactFlow(DiscardEditingContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.discardEditingContactFlowWithOptions(request, runtime);
    }

    /**
     * @param request EnableSchemaPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSchemaPropertyResponse
     */
    public EnableSchemaPropertyResponse enableSchemaPropertyWithOptions(EnableSchemaPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyName)) {
            body.put("PropertyName", request.propertyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSchemaProperty"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSchemaPropertyResponse());
    }

    /**
     * @param request EnableSchemaPropertyRequest
     * @return EnableSchemaPropertyResponse
     */
    public EnableSchemaPropertyResponse enableSchemaProperty(EnableSchemaPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSchemaPropertyWithOptions(request, runtime);
    }

    /**
     * @param request EndConferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EndConferenceResponse
     */
    public EndConferenceResponse endConferenceWithOptions(EndConferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EndConference"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EndConferenceResponse());
    }

    /**
     * @param request EndConferenceRequest
     * @return EndConferenceResponse
     */
    public EndConferenceResponse endConference(EndConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.endConferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出全部呼入号码标签</p>
     * 
     * @deprecated OpenAPI ExportCustomCallTagging is deprecated, please use CCC::2020-07-01::ExportCustomCallTaggings instead.
     * 
     * @param request ExportCustomCallTaggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportCustomCallTaggingResponse
     */
    @Deprecated
    // Deprecated
    public ExportCustomCallTaggingResponse exportCustomCallTaggingWithOptions(ExportCustomCallTaggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportCustomCallTagging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportCustomCallTaggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出全部呼入号码标签</p>
     * 
     * @deprecated OpenAPI ExportCustomCallTagging is deprecated, please use CCC::2020-07-01::ExportCustomCallTaggings instead.
     * 
     * @param request ExportCustomCallTaggingRequest
     * @return ExportCustomCallTaggingResponse
     */
    @Deprecated
    // Deprecated
    public ExportCustomCallTaggingResponse exportCustomCallTagging(ExportCustomCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportCustomCallTaggingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出黑名单号码</p>
     * 
     * @param request ExportDoNotCallNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportDoNotCallNumbersResponse
     */
    public ExportDoNotCallNumbersResponse exportDoNotCallNumbersWithOptions(ExportDoNotCallNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDoNotCallNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDoNotCallNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出黑名单号码</p>
     * 
     * @param request ExportDoNotCallNumbersRequest
     * @return ExportDoNotCallNumbersResponse
     */
    public ExportDoNotCallNumbersResponse exportDoNotCallNumbers(ExportDoNotCallNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDoNotCallNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetAccessChannelOfStaging</p>
     * 
     * @param request GetAccessChannelOfStagingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessChannelOfStagingResponse
     */
    public GetAccessChannelOfStagingResponse getAccessChannelOfStagingWithOptions(GetAccessChannelOfStagingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessChannelOfStaging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessChannelOfStagingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetAccessChannelOfStaging</p>
     * 
     * @param request GetAccessChannelOfStagingRequest
     * @return GetAccessChannelOfStagingResponse
     */
    public GetAccessChannelOfStagingResponse getAccessChannelOfStaging(GetAccessChannelOfStagingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessChannelOfStagingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取音频文件</p>
     * 
     * @param request GetAudioFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAudioFileResponse
     */
    public GetAudioFileResponse getAudioFileWithOptions(GetAudioFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioResourceId)) {
            query.put("AudioResourceId", request.audioResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAudioFile"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAudioFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取音频文件</p>
     * 
     * @param request GetAudioFileRequest
     * @return GetAudioFileResponse
     */
    public GetAudioFileResponse getAudioFile(GetAudioFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAudioFileWithOptions(request, runtime);
    }

    /**
     * @param request GetAudioFileDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAudioFileDownloadUrlResponse
     */
    public GetAudioFileDownloadUrlResponse getAudioFileDownloadUrlWithOptions(GetAudioFileDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioResourceId)) {
            query.put("AudioResourceId", request.audioResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAudioFileDownloadUrl"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAudioFileDownloadUrlResponse());
    }

    /**
     * @param request GetAudioFileDownloadUrlRequest
     * @return GetAudioFileDownloadUrlResponse
     */
    public GetAudioFileDownloadUrlResponse getAudioFileDownloadUrl(GetAudioFileDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAudioFileDownloadUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetAudioFileUploadParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAudioFileUploadParametersResponse
     */
    public GetAudioFileUploadParametersResponse getAudioFileUploadParametersWithOptions(GetAudioFileUploadParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFileName)) {
            query.put("AudioFileName", request.audioFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAudioFileUploadParameters"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAudioFileUploadParametersResponse());
    }

    /**
     * @param request GetAudioFileUploadParametersRequest
     * @return GetAudioFileUploadParametersResponse
     */
    public GetAudioFileUploadParametersResponse getAudioFileUploadParameters(GetAudioFileUploadParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAudioFileUploadParametersWithOptions(request, runtime);
    }

    /**
     * @param request GetCallDetailRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCallDetailRecordResponse
     */
    public GetCallDetailRecordResponse getCallDetailRecordWithOptions(GetCallDetailRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallDetailRecord"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallDetailRecordResponse());
    }

    /**
     * @param request GetCallDetailRecordRequest
     * @return GetCallDetailRecordResponse
     */
    public GetCallDetailRecordResponse getCallDetailRecord(GetCallDetailRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallDetailRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动信息</p>
     * 
     * @param request GetCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCampaignResponse
     */
    public GetCampaignResponse getCampaignWithOptions(GetCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动信息</p>
     * 
     * @param request GetCampaignRequest
     * @return GetCampaignResponse
     */
    public GetCampaignResponse getCampaign(GetCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCampaignWithOptions(request, runtime);
    }

    /**
     * @param request GetCaseFileUploadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCaseFileUploadUrlResponse
     */
    public GetCaseFileUploadUrlResponse getCaseFileUploadUrlWithOptions(GetCaseFileUploadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCaseFileUploadUrl"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCaseFileUploadUrlResponse());
    }

    /**
     * @param request GetCaseFileUploadUrlRequest
     * @return GetCaseFileUploadUrlResponse
     */
    public GetCaseFileUploadUrlResponse getCaseFileUploadUrl(GetCaseFileUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCaseFileUploadUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContactFlowResponse
     */
    public GetContactFlowResponse getContactFlowWithOptions(GetContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draftId)) {
            query.put("DraftId", request.draftId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContactFlowResponse());
    }

    /**
     * @param request GetContactFlowRequest
     * @return GetContactFlowResponse
     */
    public GetContactFlowResponse getContactFlow(GetContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取通话文本信息</p>
     * 
     * @param request GetConversationDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConversationDetailResponse
     */
    public GetConversationDetailResponse getConversationDetailWithOptions(GetConversationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConversationDetail"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConversationDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取通话文本信息</p>
     * 
     * @param request GetConversationDetailRequest
     * @return GetConversationDetailResponse
     */
    public GetConversationDetailResponse getConversationDetail(GetConversationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConversationDetailWithOptions(request, runtime);
    }

    /**
     * @param request GetDataChannelCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataChannelCredentialsResponse
     */
    public GetDataChannelCredentialsResponse getDataChannelCredentialsWithOptions(GetDataChannelCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataChannelCredentials"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataChannelCredentialsResponse());
    }

    /**
     * @param request GetDataChannelCredentialsRequest
     * @return GetDataChannelCredentialsResponse
     */
    public GetDataChannelCredentialsResponse getDataChannelCredentials(GetDataChannelCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataChannelCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取黑名单文件上传地址</p>
     * 
     * @param request GetDoNotCallFileUploadParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoNotCallFileUploadParametersResponse
     */
    public GetDoNotCallFileUploadParametersResponse getDoNotCallFileUploadParametersWithOptions(GetDoNotCallFileUploadParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoNotCallFileUploadParameters"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoNotCallFileUploadParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取黑名单文件上传地址</p>
     * 
     * @param request GetDoNotCallFileUploadParametersRequest
     * @return GetDoNotCallFileUploadParametersResponse
     */
    public GetDoNotCallFileUploadParametersResponse getDoNotCallFileUploadParameters(GetDoNotCallFileUploadParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoNotCallFileUploadParametersWithOptions(request, runtime);
    }

    /**
     * @param request GetDocumentUploadParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentUploadParametersResponse
     */
    public GetDocumentUploadParametersResponse getDocumentUploadParametersWithOptions(GetDocumentUploadParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentUploadParameters"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentUploadParametersResponse());
    }

    /**
     * @param request GetDocumentUploadParametersRequest
     * @return GetDocumentUploadParametersResponse
     */
    public GetDocumentUploadParametersResponse getDocumentUploadParameters(GetDocumentUploadParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocumentUploadParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取早媒体音频</p>
     * 
     * @param request GetEarlyMediaRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEarlyMediaRecordingResponse
     */
    public GetEarlyMediaRecordingResponse getEarlyMediaRecordingWithOptions(GetEarlyMediaRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEarlyMediaRecording"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEarlyMediaRecordingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取早媒体音频</p>
     * 
     * @param request GetEarlyMediaRecordingRequest
     * @return GetEarlyMediaRecordingResponse
     */
    public GetEarlyMediaRecordingResponse getEarlyMediaRecording(GetEarlyMediaRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEarlyMediaRecordingWithOptions(request, runtime);
    }

    /**
     * @param request GetHistoricalCallerReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistoricalCallerReportResponse
     */
    public GetHistoricalCallerReportResponse getHistoricalCallerReportWithOptions(GetHistoricalCallerReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("StopTime", request.stopTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoricalCallerReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoricalCallerReportResponse());
    }

    /**
     * @param request GetHistoricalCallerReportRequest
     * @return GetHistoricalCallerReportResponse
     */
    public GetHistoricalCallerReportResponse getHistoricalCallerReport(GetHistoricalCallerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoricalCallerReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动历史报表</p>
     * 
     * @param request GetHistoricalCampaignReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistoricalCampaignReportResponse
     */
    public GetHistoricalCampaignReportResponse getHistoricalCampaignReportWithOptions(GetHistoricalCampaignReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoricalCampaignReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoricalCampaignReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动历史报表</p>
     * 
     * @param request GetHistoricalCampaignReportRequest
     * @return GetHistoricalCampaignReportResponse
     */
    public GetHistoricalCampaignReportResponse getHistoricalCampaignReport(GetHistoricalCampaignReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoricalCampaignReportWithOptions(request, runtime);
    }

    /**
     * @param request GetHistoricalInstanceReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistoricalInstanceReportResponse
     */
    public GetHistoricalInstanceReportResponse getHistoricalInstanceReportWithOptions(GetHistoricalInstanceReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoricalInstanceReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoricalInstanceReportResponse());
    }

    /**
     * @param request GetHistoricalInstanceReportRequest
     * @return GetHistoricalInstanceReportResponse
     */
    public GetHistoricalInstanceReportResponse getHistoricalInstanceReport(GetHistoricalInstanceReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoricalInstanceReportWithOptions(request, runtime);
    }

    /**
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * @param request GetInstanceTrendingReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceTrendingReportResponse
     */
    public GetInstanceTrendingReportResponse getInstanceTrendingReportWithOptions(GetInstanceTrendingReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceTrendingReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceTrendingReportResponse());
    }

    /**
     * @param request GetInstanceTrendingReportRequest
     * @return GetInstanceTrendingReportResponse
     */
    public GetInstanceTrendingReportResponse getInstanceTrendingReport(GetInstanceTrendingReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceTrendingReportWithOptions(request, runtime);
    }

    /**
     * @param request GetLoginDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoginDetailsResponse
     */
    public GetLoginDetailsResponse getLoginDetailsWithOptions(GetLoginDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatDeviceId)) {
            query.put("ChatDeviceId", request.chatDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginDetails"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoginDetailsResponse());
    }

    /**
     * @param request GetLoginDetailsRequest
     * @return GetLoginDetailsResponse
     */
    public GetLoginDetailsResponse getLoginDetails(GetLoginDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginDetailsWithOptions(request, runtime);
    }

    /**
     * @param request GetMonoRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMonoRecordingResponse
     */
    public GetMonoRecordingResponse getMonoRecordingWithOptions(GetMonoRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireSeconds)) {
            query.put("ExpireSeconds", request.expireSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonoRecording"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonoRecordingResponse());
    }

    /**
     * @param request GetMonoRecordingRequest
     * @return GetMonoRecordingResponse
     */
    public GetMonoRecordingResponse getMonoRecording(GetMonoRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMonoRecordingWithOptions(request, runtime);
    }

    /**
     * @param request GetMultiChannelRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultiChannelRecordingResponse
     */
    public GetMultiChannelRecordingResponse getMultiChannelRecordingWithOptions(GetMultiChannelRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultiChannelRecording"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMultiChannelRecordingResponse());
    }

    /**
     * @param request GetMultiChannelRecordingRequest
     * @return GetMultiChannelRecordingResponse
     */
    public GetMultiChannelRecordingResponse getMultiChannelRecording(GetMultiChannelRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultiChannelRecordingWithOptions(request, runtime);
    }

    /**
     * @param request GetNumberLocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNumberLocationResponse
     */
    public GetNumberLocationResponse getNumberLocationWithOptions(GetNumberLocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNumberLocation"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNumberLocationResponse());
    }

    /**
     * @param request GetNumberLocationRequest
     * @return GetNumberLocationResponse
     */
    public GetNumberLocationResponse getNumberLocation(GetNumberLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNumberLocationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼实时状态</p>
     * 
     * @param request GetRealtimeCampaignStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealtimeCampaignStatsResponse
     */
    public GetRealtimeCampaignStatsResponse getRealtimeCampaignStatsWithOptions(GetRealtimeCampaignStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeCampaignStats"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeCampaignStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼实时状态</p>
     * 
     * @param request GetRealtimeCampaignStatsRequest
     * @return GetRealtimeCampaignStatsResponse
     */
    public GetRealtimeCampaignStatsResponse getRealtimeCampaignStats(GetRealtimeCampaignStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeCampaignStatsWithOptions(request, runtime);
    }

    /**
     * @param request GetRealtimeInstanceStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealtimeInstanceStatesResponse
     */
    public GetRealtimeInstanceStatesResponse getRealtimeInstanceStatesWithOptions(GetRealtimeInstanceStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeInstanceStates"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeInstanceStatesResponse());
    }

    /**
     * @param request GetRealtimeInstanceStatesRequest
     * @return GetRealtimeInstanceStatesResponse
     */
    public GetRealtimeInstanceStatesResponse getRealtimeInstanceStates(GetRealtimeInstanceStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeInstanceStatesWithOptions(request, runtime);
    }

    /**
     * @param request GetSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSchemaResponse
     */
    public GetSchemaResponse getSchemaWithOptions(GetSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSchema"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSchemaResponse());
    }

    /**
     * @param request GetSchemaRequest
     * @return GetSchemaResponse
     */
    public GetSchemaResponse getSchema(GetSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询技能组</p>
     * 
     * @param request GetSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillGroupResponse
     */
    public GetSkillGroupResponse getSkillGroupWithOptions(GetSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询技能组</p>
     * 
     * @param request GetSkillGroupRequest
     * @return GetSkillGroupResponse
     */
    public GetSkillGroupResponse getSkillGroup(GetSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request GetTurnCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTurnCredentialsResponse
     */
    public GetTurnCredentialsResponse getTurnCredentialsWithOptions(GetTurnCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTurnCredentials"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTurnCredentialsResponse());
    }

    /**
     * @param request GetTurnCredentialsRequest
     * @return GetTurnCredentialsResponse
     */
    public GetTurnCredentialsResponse getTurnCredentials(GetTurnCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTurnCredentialsWithOptions(request, runtime);
    }

    /**
     * @param request GetTurnServerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTurnServerListResponse
     */
    public GetTurnServerListResponse getTurnServerListWithOptions(GetTurnServerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTurnServerList"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTurnServerListResponse());
    }

    /**
     * @param request GetTurnServerListRequest
     * @return GetTurnServerListResponse
     */
    public GetTurnServerListResponse getTurnServerList(GetTurnServerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTurnServerListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检参数</p>
     * 
     * @param request GetUploadAudioDataParamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadAudioDataParamsResponse
     */
    public GetUploadAudioDataParamsResponse getUploadAudioDataParamsWithOptions(GetUploadAudioDataParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadAudioDataParams"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadAudioDataParamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检参数</p>
     * 
     * @param request GetUploadAudioDataParamsRequest
     * @return GetUploadAudioDataParamsResponse
     */
    public GetUploadAudioDataParamsResponse getUploadAudioDataParams(GetUploadAudioDataParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadAudioDataParamsWithOptions(request, runtime);
    }

    /**
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            query.put("Extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频</p>
     * 
     * @param request GetVideoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoResponse
     */
    public GetVideoResponse getVideoWithOptions(GetVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideo"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频</p>
     * 
     * @param request GetVideoRequest
     * @return GetVideoResponse
     */
    public GetVideoResponse getVideo(GetVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoWithOptions(request, runtime);
    }

    /**
     * @param request GetVisitorLoginDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVisitorLoginDetailsResponse
     */
    public GetVisitorLoginDetailsResponse getVisitorLoginDetailsWithOptions(GetVisitorLoginDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatDeviceId)) {
            query.put("ChatDeviceId", request.chatDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visitorId)) {
            query.put("VisitorId", request.visitorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVisitorLoginDetails"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVisitorLoginDetailsResponse());
    }

    /**
     * @param request GetVisitorLoginDetailsRequest
     * @return GetVisitorLoginDetailsResponse
     */
    public GetVisitorLoginDetailsResponse getVisitorLoginDetails(GetVisitorLoginDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVisitorLoginDetailsWithOptions(request, runtime);
    }

    /**
     * @param request GetVoicemailRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVoicemailRecordingResponse
     */
    public GetVoicemailRecordingResponse getVoicemailRecordingWithOptions(GetVoicemailRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVoicemailRecording"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVoicemailRecordingResponse());
    }

    /**
     * @param request GetVoicemailRecordingRequest
     * @return GetVoicemailRecordingResponse
     */
    public GetVoicemailRecordingResponse getVoicemailRecording(GetVoicemailRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVoicemailRecordingWithOptions(request, runtime);
    }

    /**
     * @param request HoldCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HoldCallResponse
     */
    public HoldCallResponse holdCallWithOptions(HoldCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.music)) {
            query.put("Music", request.music);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HoldCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HoldCallResponse());
    }

    /**
     * @param request HoldCallRequest
     * @return HoldCallResponse
     */
    public HoldCallResponse holdCall(HoldCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.holdCallWithOptions(request, runtime);
    }

    /**
     * @param request ImportAdminsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportAdminsResponse
     */
    public ImportAdminsResponse importAdminsWithOptions(ImportAdminsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramIdList)) {
            query.put("RamIdList", request.ramIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportAdmins"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportAdminsResponse());
    }

    /**
     * @param request ImportAdminsRequest
     * @return ImportAdminsResponse
     */
    public ImportAdminsResponse importAdmins(ImportAdminsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importAdminsWithOptions(request, runtime);
    }

    /**
     * @param request ImportCorpNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportCorpNumbersResponse
     */
    public ImportCorpNumbersResponse importCorpNumbersWithOptions(ImportCorpNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            query.put("CorpName", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagList)) {
            query.put("TagList", request.tagList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportCorpNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportCorpNumbersResponse());
    }

    /**
     * @param request ImportCorpNumbersRequest
     * @return ImportCorpNumbersResponse
     */
    public ImportCorpNumbersResponse importCorpNumbers(ImportCorpNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importCorpNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文件导入呼入控制号码</p>
     * 
     * @deprecated OpenAPI ImportCustomCallTagging is deprecated, please use CCC::2020-07-01::ImportCustomCallTaggings instead.
     * 
     * @param request ImportCustomCallTaggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportCustomCallTaggingResponse
     */
    @Deprecated
    // Deprecated
    public ImportCustomCallTaggingResponse importCustomCallTaggingWithOptions(ImportCustomCallTaggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportCustomCallTagging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportCustomCallTaggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文件导入呼入控制号码</p>
     * 
     * @deprecated OpenAPI ImportCustomCallTagging is deprecated, please use CCC::2020-07-01::ImportCustomCallTaggings instead.
     * 
     * @param request ImportCustomCallTaggingRequest
     * @return ImportCustomCallTaggingResponse
     */
    @Deprecated
    // Deprecated
    public ImportCustomCallTaggingResponse importCustomCallTagging(ImportCustomCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importCustomCallTaggingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加黑名单号码</p>
     * 
     * @param request ImportDoNotCallNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportDoNotCallNumbersResponse
     */
    public ImportDoNotCallNumbersResponse importDoNotCallNumbersWithOptions(ImportDoNotCallNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportDoNotCallNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportDoNotCallNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加黑名单号码</p>
     * 
     * @param request ImportDoNotCallNumbersRequest
     * @return ImportDoNotCallNumbersResponse
     */
    public ImportDoNotCallNumbersResponse importDoNotCallNumbers(ImportDoNotCallNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importDoNotCallNumbersWithOptions(request, runtime);
    }

    /**
     * @param request ImportDocumentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportDocumentsResponse
     */
    public ImportDocumentsResponse importDocumentsWithOptions(ImportDocumentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFileKey)) {
            body.put("OssFileKey", request.ossFileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportDocuments"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportDocumentsResponse());
    }

    /**
     * @param request ImportDocumentsRequest
     * @return ImportDocumentsResponse
     */
    public ImportDocumentsResponse importDocuments(ImportDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importDocumentsWithOptions(request, runtime);
    }

    /**
     * @param request InitiateAttendedTransferRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitiateAttendedTransferResponse
     */
    public InitiateAttendedTransferResponse initiateAttendedTransferWithOptions(InitiateAttendedTransferRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callPriority)) {
            query.put("CallPriority", request.callPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingOverflowThreshold)) {
            query.put("QueuingOverflowThreshold", request.queuingOverflowThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingTimeoutSeconds)) {
            query.put("QueuingTimeoutSeconds", request.queuingTimeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingType)) {
            query.put("RoutingType", request.routingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            query.put("StrategyName", request.strategyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyParams)) {
            query.put("StrategyParams", request.strategyParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferee)) {
            query.put("Transferee", request.transferee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transfereeType)) {
            query.put("TransfereeType", request.transfereeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferor)) {
            query.put("Transferor", request.transferor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitiateAttendedTransfer"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitiateAttendedTransferResponse());
    }

    /**
     * @param request InitiateAttendedTransferRequest
     * @return InitiateAttendedTransferResponse
     */
    public InitiateAttendedTransferResponse initiateAttendedTransfer(InitiateAttendedTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initiateAttendedTransferWithOptions(request, runtime);
    }

    /**
     * @param request InterceptCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InterceptCallResponse
     */
    public InterceptCallResponse interceptCallWithOptions(InterceptCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interceptedUserId)) {
            query.put("InterceptedUserId", request.interceptedUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InterceptCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InterceptCallResponse());
    }

    /**
     * @param request InterceptCallRequest
     * @return InterceptCallResponse
     */
    public InterceptCallResponse interceptCall(InterceptCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.interceptCallWithOptions(request, runtime);
    }

    /**
     * @param request LaunchAuthenticationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LaunchAuthenticationResponse
     */
    public LaunchAuthenticationResponse launchAuthenticationWithOptions(LaunchAuthenticationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowVariables)) {
            query.put("ContactFlowVariables", request.contactFlowVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LaunchAuthentication"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LaunchAuthenticationResponse());
    }

    /**
     * @param request LaunchAuthenticationRequest
     * @return LaunchAuthenticationResponse
     */
    public LaunchAuthenticationResponse launchAuthentication(LaunchAuthenticationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchAuthenticationWithOptions(request, runtime);
    }

    /**
     * @param request LaunchSurveyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LaunchSurveyResponse
     */
    public LaunchSurveyResponse launchSurveyWithOptions(LaunchSurveyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowVariables)) {
            query.put("ContactFlowVariables", request.contactFlowVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsMetadataId)) {
            query.put("SmsMetadataId", request.smsMetadataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.surveyChannel)) {
            query.put("SurveyChannel", request.surveyChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.surveyTemplateId)) {
            query.put("SurveyTemplateId", request.surveyTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.surveyTemplateVariables)) {
            query.put("SurveyTemplateVariables", request.surveyTemplateVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LaunchSurvey"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LaunchSurveyResponse());
    }

    /**
     * @param request LaunchSurveyRequest
     * @return LaunchSurveyResponse
     */
    public LaunchSurveyResponse launchSurvey(LaunchSurveyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchSurveyWithOptions(request, runtime);
    }

    /**
     * @param request ListAgentStateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentStateLogsResponse
     */
    public ListAgentStateLogsResponse listAgentStateLogsWithOptions(ListAgentStateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentStateLogs"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentStateLogsResponse());
    }

    /**
     * @param request ListAgentStateLogsRequest
     * @return ListAgentStateLogsResponse
     */
    public ListAgentStateLogsResponse listAgentStateLogs(ListAgentStateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentStateLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentStates for ACC</p>
     * 
     * @deprecated OpenAPI ListAgentStates is deprecated, please use CCC::2020-07-01::ListRealtimeAgentStates instead.
     * 
     * @param request ListAgentStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentStatesResponse
     */
    @Deprecated
    // Deprecated
    public ListAgentStatesResponse listAgentStatesWithOptions(ListAgentStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIds)) {
            query.put("AgentIds", request.agentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeOfflineUsers)) {
            query.put("ExcludeOfflineUsers", request.excludeOfflineUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentStates"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentStatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentStates for ACC</p>
     * 
     * @deprecated OpenAPI ListAgentStates is deprecated, please use CCC::2020-07-01::ListRealtimeAgentStates instead.
     * 
     * @param request ListAgentStatesRequest
     * @return ListAgentStatesResponse
     */
    @Deprecated
    // Deprecated
    public ListAgentStatesResponse listAgentStates(ListAgentStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentStatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentSummaryReportsSinceMidnight for acc</p>
     * 
     * @deprecated OpenAPI ListAgentSummaryReportsSinceMidnight is deprecated, please use CCC::2020-07-01::ListHistoricalAgentReport instead.
     * 
     * @param request ListAgentSummaryReportsSinceMidnightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentSummaryReportsSinceMidnightResponse
     */
    @Deprecated
    // Deprecated
    public ListAgentSummaryReportsSinceMidnightResponse listAgentSummaryReportsSinceMidnightWithOptions(ListAgentSummaryReportsSinceMidnightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentSummaryReportsSinceMidnight"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentSummaryReportsSinceMidnightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentSummaryReportsSinceMidnight for acc</p>
     * 
     * @deprecated OpenAPI ListAgentSummaryReportsSinceMidnight is deprecated, please use CCC::2020-07-01::ListHistoricalAgentReport instead.
     * 
     * @param request ListAgentSummaryReportsSinceMidnightRequest
     * @return ListAgentSummaryReportsSinceMidnightResponse
     */
    @Deprecated
    // Deprecated
    public ListAgentSummaryReportsSinceMidnightResponse listAgentSummaryReportsSinceMidnight(ListAgentSummaryReportsSinceMidnightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentSummaryReportsSinceMidnightWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼呼叫记录</p>
     * 
     * @param request ListAttemptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAttemptsResponse
     */
    public ListAttemptsResponse listAttemptsWithOptions(ListAttemptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAttempts"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAttemptsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼呼叫记录</p>
     * 
     * @param request ListAttemptsRequest
     * @return ListAttemptsResponse
     */
    public ListAttemptsResponse listAttempts(ListAttemptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAttemptsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取音频文件列表</p>
     * 
     * @param request ListAudioFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAudioFilesResponse
     */
    public ListAudioFilesResponse listAudioFilesWithOptions(ListAudioFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAudioFiles"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAudioFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取音频文件列表</p>
     * 
     * @param request ListAudioFilesRequest
     * @return ListAudioFilesResponse
     */
    public ListAudioFilesResponse listAudioFiles(ListAudioFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAudioFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑呼入控制号码</p>
     * 
     * @param request ListBlacklistCallTaggingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBlacklistCallTaggingsResponse
     */
    public ListBlacklistCallTaggingsResponse listBlacklistCallTaggingsWithOptions(ListBlacklistCallTaggingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBlacklistCallTaggings"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBlacklistCallTaggingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑呼入控制号码</p>
     * 
     * @param request ListBlacklistCallTaggingsRequest
     * @return ListBlacklistCallTaggingsResponse
     */
    public ListBlacklistCallTaggingsResponse listBlacklistCallTaggings(ListBlacklistCallTaggingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBlacklistCallTaggingsWithOptions(request, runtime);
    }

    /**
     * @param request ListBriefSkillGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBriefSkillGroupsResponse
     */
    public ListBriefSkillGroupsResponse listBriefSkillGroupsWithOptions(ListBriefSkillGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBriefSkillGroups"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBriefSkillGroupsResponse());
    }

    /**
     * @param request ListBriefSkillGroupsRequest
     * @return ListBriefSkillGroupsResponse
     */
    public ListBriefSkillGroupsResponse listBriefSkillGroups(ListBriefSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBriefSkillGroupsWithOptions(request, runtime);
    }

    /**
     * @param request ListCallDetailRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallDetailRecordsResponse
     */
    public ListCallDetailRecordsResponse listCallDetailRecordsWithOptions(ListCallDetailRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDisposition)) {
            query.put("ContactDisposition", request.contactDisposition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDispositionList)) {
            query.put("ContactDispositionList", request.contactDispositionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactTypeList)) {
            query.put("ContactTypeList", request.contactTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.criteria)) {
            query.put("Criteria", request.criteria);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earlyMediaStateList)) {
            query.put("EarlyMediaStateList", request.earlyMediaStateList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByField)) {
            query.put("OrderByField", request.orderByField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.satisfactionDescriptionList)) {
            query.put("SatisfactionDescriptionList", request.satisfactionDescriptionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.satisfactionList)) {
            query.put("SatisfactionList", request.satisfactionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.satisfactionSurveyChannel)) {
            query.put("SatisfactionSurveyChannel", request.satisfactionSurveyChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallDetailRecords"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallDetailRecordsResponse());
    }

    /**
     * @param request ListCallDetailRecordsRequest
     * @return ListCallDetailRecordsResponse
     */
    public ListCallDetailRecordsResponse listCallDetailRecords(ListCallDetailRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallDetailRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出号码标签</p>
     * 
     * @param request ListCallTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallTagsResponse
     */
    public ListCallTagsResponse listCallTagsWithOptions(ListCallTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallTags"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出号码标签</p>
     * 
     * @param request ListCallTagsRequest
     * @return ListCallTagsResponse
     */
    public ListCallTagsResponse listCallTags(ListCallTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动趋势报表</p>
     * 
     * @param request ListCampaignTrendingReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCampaignTrendingReportResponse
     */
    public ListCampaignTrendingReportResponse listCampaignTrendingReportWithOptions(ListCampaignTrendingReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCampaignTrendingReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCampaignTrendingReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动趋势报表</p>
     * 
     * @param request ListCampaignTrendingReportRequest
     * @return ListCampaignTrendingReportResponse
     */
    public ListCampaignTrendingReportResponse listCampaignTrendingReport(ListCampaignTrendingReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCampaignTrendingReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动列表</p>
     * 
     * @param request ListCampaignsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCampaignsResponse
     */
    public ListCampaignsResponse listCampaignsWithOptions(ListCampaignsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actualStartTimeFrom)) {
            query.put("ActualStartTimeFrom", request.actualStartTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actualStartTimeTo)) {
            query.put("ActualStartTimeTo", request.actualStartTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planedStartTimeFrom)) {
            query.put("PlanedStartTimeFrom", request.planedStartTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planedStartTimeTo)) {
            query.put("PlanedStartTimeTo", request.planedStartTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueId)) {
            query.put("QueueId", request.queueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCampaigns"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCampaignsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动列表</p>
     * 
     * @param request ListCampaignsRequest
     * @return ListCampaignsResponse
     */
    public ListCampaignsResponse listCampaigns(ListCampaignsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCampaignsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动的联系人呼叫详情</p>
     * 
     * @param request ListCasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCasesResponse
     */
    public ListCasesResponse listCasesWithOptions(ListCasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCases"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动的联系人呼叫详情</p>
     * 
     * @param request ListCasesRequest
     * @return ListCasesResponse
     */
    public ListCasesResponse listCases(ListCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCasesWithOptions(request, runtime);
    }

    /**
     * @param request ListConfigItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigItemsResponse
     */
    public ListConfigItemsResponse listConfigItemsWithOptions(ListConfigItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigItems"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigItemsResponse());
    }

    /**
     * @param request ListConfigItemsRequest
     * @return ListConfigItemsResponse
     */
    public ListConfigItemsResponse listConfigItems(ListConfigItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigItemsWithOptions(request, runtime);
    }

    /**
     * @param request ListContactFlowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContactFlowsResponse
     */
    public ListContactFlowsResponse listContactFlowsWithOptions(ListContactFlowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByField)) {
            query.put("OrderByField", request.orderByField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContactFlows"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContactFlowsResponse());
    }

    /**
     * @param request ListContactFlowsRequest
     * @return ListContactFlowsResponse
     */
    public ListContactFlowsResponse listContactFlows(ListContactFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContactFlowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出呼入控制号码</p>
     * 
     * @deprecated OpenAPI ListCustomCallTagging is deprecated, please use CCC::2020-07-01::ListCustomCallTaggings instead.
     * 
     * @param request ListCustomCallTaggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomCallTaggingResponse
     */
    @Deprecated
    // Deprecated
    public ListCustomCallTaggingResponse listCustomCallTaggingWithOptions(ListCustomCallTaggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callTagNameList)) {
            query.put("CallTagNameList", request.callTagNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomCallTagging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomCallTaggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出呼入控制号码</p>
     * 
     * @deprecated OpenAPI ListCustomCallTagging is deprecated, please use CCC::2020-07-01::ListCustomCallTaggings instead.
     * 
     * @param request ListCustomCallTaggingRequest
     * @return ListCustomCallTaggingResponse
     */
    @Deprecated
    // Deprecated
    public ListCustomCallTaggingResponse listCustomCallTagging(ListCustomCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomCallTaggingWithOptions(request, runtime);
    }

    /**
     * @param request ListDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDevices"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDevicesResponse());
    }

    /**
     * @param request ListDevicesRequest
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询黑名单号码</p>
     * 
     * @param request ListDoNotCallNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoNotCallNumbersResponse
     */
    public ListDoNotCallNumbersResponse listDoNotCallNumbersWithOptions(ListDoNotCallNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoNotCallNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoNotCallNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询黑名单号码</p>
     * 
     * @param request ListDoNotCallNumbersRequest
     * @return ListDoNotCallNumbersResponse
     */
    public ListDoNotCallNumbersResponse listDoNotCallNumbers(ListDoNotCallNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoNotCallNumbersWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ListDocumentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDocumentsResponse
     */
    public ListDocumentsResponse listDocumentsWithOptions(ListDocumentsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDocumentsShrinkRequest request = new ListDocumentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sorts)) {
            request.sortsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sorts, "Sorts", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            body.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            body.put("SearchPattern", request.searchPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortsShrink)) {
            body.put("Sorts", request.sortsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDocuments"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDocumentsResponse());
    }

    /**
     * @param request ListDocumentsRequest
     * @return ListDocumentsResponse
     */
    public ListDocumentsResponse listDocuments(ListDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDocumentsWithOptions(request, runtime);
    }

    /**
     * @param request ListHistoricalAgentReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHistoricalAgentReportResponse
     */
    public ListHistoricalAgentReportResponse listHistoricalAgentReportWithOptions(ListHistoricalAgentReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("StopTime", request.stopTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIdList)) {
            body.put("AgentIdList", request.agentIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHistoricalAgentReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHistoricalAgentReportResponse());
    }

    /**
     * @param request ListHistoricalAgentReportRequest
     * @return ListHistoricalAgentReportResponse
     */
    public ListHistoricalAgentReportResponse listHistoricalAgentReport(ListHistoricalAgentReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalAgentReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListHistoricalAgentSkillGroupReport</p>
     * 
     * @param request ListHistoricalAgentSkillGroupReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHistoricalAgentSkillGroupReportResponse
     */
    public ListHistoricalAgentSkillGroupReportResponse listHistoricalAgentSkillGroupReportWithOptions(ListHistoricalAgentSkillGroupReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIdList)) {
            body.put("AgentIdList", request.agentIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHistoricalAgentSkillGroupReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHistoricalAgentSkillGroupReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListHistoricalAgentSkillGroupReport</p>
     * 
     * @param request ListHistoricalAgentSkillGroupReportRequest
     * @return ListHistoricalAgentSkillGroupReportResponse
     */
    public ListHistoricalAgentSkillGroupReportResponse listHistoricalAgentSkillGroupReport(ListHistoricalAgentSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalAgentSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * @param request ListHistoricalSkillGroupReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHistoricalSkillGroupReportResponse
     */
    public ListHistoricalSkillGroupReportResponse listHistoricalSkillGroupReportWithOptions(ListHistoricalSkillGroupReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            body.put("SkillGroupIdList", request.skillGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHistoricalSkillGroupReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHistoricalSkillGroupReportResponse());
    }

    /**
     * @param request ListHistoricalSkillGroupReportRequest
     * @return ListHistoricalSkillGroupReportResponse
     */
    public ListHistoricalSkillGroupReportResponse listHistoricalSkillGroupReport(ListHistoricalSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * @param request ListInstancesOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesOfUserResponse
     */
    public ListInstancesOfUserResponse listInstancesOfUserWithOptions(ListInstancesOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancesOfUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesOfUserResponse());
    }

    /**
     * @param request ListInstancesOfUserRequest
     * @return ListInstancesOfUserResponse
     */
    public ListInstancesOfUserResponse listInstancesOfUser(ListInstancesOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesOfUserWithOptions(request, runtime);
    }

    /**
     * @param request ListIntervalAgentReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntervalAgentReportResponse
     */
    public ListIntervalAgentReportResponse listIntervalAgentReportWithOptions(ListIntervalAgentReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntervalAgentReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntervalAgentReportResponse());
    }

    /**
     * @param request ListIntervalAgentReportRequest
     * @return ListIntervalAgentReportResponse
     */
    public ListIntervalAgentReportResponse listIntervalAgentReport(ListIntervalAgentReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalAgentReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListIntervalAgentSkillGroupReport</p>
     * 
     * @param request ListIntervalAgentSkillGroupReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntervalAgentSkillGroupReportResponse
     */
    public ListIntervalAgentSkillGroupReportResponse listIntervalAgentSkillGroupReportWithOptions(ListIntervalAgentSkillGroupReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntervalAgentSkillGroupReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntervalAgentSkillGroupReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListIntervalAgentSkillGroupReport</p>
     * 
     * @param request ListIntervalAgentSkillGroupReportRequest
     * @return ListIntervalAgentSkillGroupReportResponse
     */
    public ListIntervalAgentSkillGroupReportResponse listIntervalAgentSkillGroupReport(ListIntervalAgentSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalAgentSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * @param request ListIntervalInstanceReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntervalInstanceReportResponse
     */
    public ListIntervalInstanceReportResponse listIntervalInstanceReportWithOptions(ListIntervalInstanceReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntervalInstanceReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntervalInstanceReportResponse());
    }

    /**
     * @param request ListIntervalInstanceReportRequest
     * @return ListIntervalInstanceReportResponse
     */
    public ListIntervalInstanceReportResponse listIntervalInstanceReport(ListIntervalInstanceReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalInstanceReportWithOptions(request, runtime);
    }

    /**
     * @param request ListIntervalSkillGroupReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntervalSkillGroupReportResponse
     */
    public ListIntervalSkillGroupReportResponse listIntervalSkillGroupReportWithOptions(ListIntervalSkillGroupReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntervalSkillGroupReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntervalSkillGroupReportResponse());
    }

    /**
     * @param request ListIntervalSkillGroupReportRequest
     * @return ListIntervalSkillGroupReportResponse
     */
    public ListIntervalSkillGroupReportResponse listIntervalSkillGroupReport(ListIntervalSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * @param request ListIvrTrackingDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIvrTrackingDetailsResponse
     */
    public ListIvrTrackingDetailsResponse listIvrTrackingDetailsWithOptions(ListIvrTrackingDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIvrTrackingDetails"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIvrTrackingDetailsResponse());
    }

    /**
     * @param request ListIvrTrackingDetailsRequest
     * @return ListIvrTrackingDetailsResponse
     */
    public ListIvrTrackingDetailsResponse listIvrTrackingDetails(ListIvrTrackingDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIvrTrackingDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListLegacyAgentEventLogs</p>
     * 
     * @deprecated OpenAPI ListLegacyAgentEventLogs is deprecated, please use CCC::2020-07-01::ListAgentStateLogs instead.
     * 
     * @param request ListLegacyAgentEventLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLegacyAgentEventLogsResponse
     */
    @Deprecated
    // Deprecated
    public ListLegacyAgentEventLogsResponse listLegacyAgentEventLogsWithOptions(ListLegacyAgentEventLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLegacyAgentEventLogs"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLegacyAgentEventLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListLegacyAgentEventLogs</p>
     * 
     * @deprecated OpenAPI ListLegacyAgentEventLogs is deprecated, please use CCC::2020-07-01::ListAgentStateLogs instead.
     * 
     * @param request ListLegacyAgentEventLogsRequest
     * @return ListLegacyAgentEventLogsResponse
     */
    @Deprecated
    // Deprecated
    public ListLegacyAgentEventLogsResponse listLegacyAgentEventLogs(ListLegacyAgentEventLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLegacyAgentEventLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListLegacyAgentStatusLogs</p>
     * 
     * @deprecated OpenAPI ListLegacyAgentStatusLogs is deprecated, please use CCC::2020-07-01::ListAgentStateLogs instead.
     * 
     * @param request ListLegacyAgentStatusLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLegacyAgentStatusLogsResponse
     */
    @Deprecated
    // Deprecated
    public ListLegacyAgentStatusLogsResponse listLegacyAgentStatusLogsWithOptions(ListLegacyAgentStatusLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLegacyAgentStatusLogs"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLegacyAgentStatusLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListLegacyAgentStatusLogs</p>
     * 
     * @deprecated OpenAPI ListLegacyAgentStatusLogs is deprecated, please use CCC::2020-07-01::ListAgentStateLogs instead.
     * 
     * @param request ListLegacyAgentStatusLogsRequest
     * @return ListLegacyAgentStatusLogsResponse
     */
    @Deprecated
    // Deprecated
    public ListLegacyAgentStatusLogsResponse listLegacyAgentStatusLogs(ListLegacyAgentStatusLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLegacyAgentStatusLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListLegacyAppraiseLogs</p>
     * 
     * @param request ListLegacyAppraiseLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLegacyAppraiseLogsResponse
     */
    public ListLegacyAppraiseLogsResponse listLegacyAppraiseLogsWithOptions(ListLegacyAppraiseLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLegacyAppraiseLogs"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLegacyAppraiseLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListLegacyAppraiseLogs</p>
     * 
     * @param request ListLegacyAppraiseLogsRequest
     * @return ListLegacyAppraiseLogsResponse
     */
    public ListLegacyAppraiseLogsResponse listLegacyAppraiseLogs(ListLegacyAppraiseLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLegacyAppraiseLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListLegacyQueueEventLogs</p>
     * 
     * @param request ListLegacyQueueEventLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLegacyQueueEventLogsResponse
     */
    public ListLegacyQueueEventLogsResponse listLegacyQueueEventLogsWithOptions(ListLegacyQueueEventLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLegacyQueueEventLogs"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLegacyQueueEventLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListLegacyQueueEventLogs</p>
     * 
     * @param request ListLegacyQueueEventLogsRequest
     * @return ListLegacyQueueEventLogsResponse
     */
    public ListLegacyQueueEventLogsResponse listLegacyQueueEventLogs(ListLegacyQueueEventLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLegacyQueueEventLogsWithOptions(request, runtime);
    }

    /**
     * @param request ListMonoRecordingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonoRecordingsResponse
     */
    public ListMonoRecordingsResponse listMonoRecordingsWithOptions(ListMonoRecordingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonoRecordings"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonoRecordingsResponse());
    }

    /**
     * @param request ListMonoRecordingsRequest
     * @return ListMonoRecordingsResponse
     */
    public ListMonoRecordingsResponse listMonoRecordings(ListMonoRecordingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMonoRecordingsWithOptions(request, runtime);
    }

    /**
     * @param request ListMultiChannelRecordingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultiChannelRecordingsResponse
     */
    public ListMultiChannelRecordingsResponse listMultiChannelRecordingsWithOptions(ListMultiChannelRecordingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultiChannelRecordings"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultiChannelRecordingsResponse());
    }

    /**
     * @param request ListMultiChannelRecordingsRequest
     * @return ListMultiChannelRecordingsResponse
     */
    public ListMultiChannelRecordingsResponse listMultiChannelRecordings(ListMultiChannelRecordingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultiChannelRecordingsWithOptions(request, runtime);
    }

    /**
     * @param request ListOutboundNumbersOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOutboundNumbersOfUserResponse
     */
    public ListOutboundNumbersOfUserResponse listOutboundNumbersOfUserWithOptions(ListOutboundNumbersOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOutboundNumbersOfUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOutboundNumbersOfUserResponse());
    }

    /**
     * @param request ListOutboundNumbersOfUserRequest
     * @return ListOutboundNumbersOfUserResponse
     */
    public ListOutboundNumbersOfUserResponse listOutboundNumbersOfUser(ListOutboundNumbersOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutboundNumbersOfUserWithOptions(request, runtime);
    }

    /**
     * @param request ListPersonalNumbersOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPersonalNumbersOfUserResponse
     */
    public ListPersonalNumbersOfUserResponse listPersonalNumbersOfUserWithOptions(ListPersonalNumbersOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMember)) {
            query.put("IsMember", request.isMember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersonalNumbersOfUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersonalNumbersOfUserResponse());
    }

    /**
     * @param request ListPersonalNumbersOfUserRequest
     * @return ListPersonalNumbersOfUserResponse
     */
    public ListPersonalNumbersOfUserResponse listPersonalNumbersOfUser(ListPersonalNumbersOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonalNumbersOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取号码列表</p>
     * 
     * @param request ListPhoneNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPhoneNumbersResponse
     */
    public ListPhoneNumbersResponse listPhoneNumbersWithOptions(ListPhoneNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPhoneNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPhoneNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取号码列表</p>
     * 
     * @param request ListPhoneNumbersRequest
     * @return ListPhoneNumbersResponse
     */
    public ListPhoneNumbersResponse listPhoneNumbers(ListPhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhoneNumbersWithOptions(request, runtime);
    }

    /**
     * @param request ListPhoneNumbersOfSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPhoneNumbersOfSkillGroupResponse
     */
    public ListPhoneNumbersOfSkillGroupResponse listPhoneNumbersOfSkillGroupWithOptions(ListPhoneNumbersOfSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMember)) {
            query.put("IsMember", request.isMember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPhoneNumbersOfSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPhoneNumbersOfSkillGroupResponse());
    }

    /**
     * @param request ListPhoneNumbersOfSkillGroupRequest
     * @return ListPhoneNumbersOfSkillGroupResponse
     */
    public ListPhoneNumbersOfSkillGroupResponse listPhoneNumbersOfSkillGroup(ListPhoneNumbersOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhoneNumbersOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request ListPrivilegesOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivilegesOfUserResponse
     */
    public ListPrivilegesOfUserResponse listPrivilegesOfUserWithOptions(ListPrivilegesOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivilegesOfUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivilegesOfUserResponse());
    }

    /**
     * @param request ListPrivilegesOfUserRequest
     * @return ListPrivilegesOfUserResponse
     */
    public ListPrivilegesOfUserResponse listPrivilegesOfUser(ListPrivilegesOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivilegesOfUserWithOptions(request, runtime);
    }

    /**
     * @param request ListRamUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRamUsersResponse
     */
    public ListRamUsersResponse listRamUsersWithOptions(ListRamUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRamUsers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRamUsersResponse());
    }

    /**
     * @param request ListRamUsersRequest
     * @return ListRamUsersResponse
     */
    public ListRamUsersResponse listRamUsers(ListRamUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRamUsersWithOptions(request, runtime);
    }

    /**
     * @param request ListRealtimeAgentStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRealtimeAgentStatesResponse
     */
    public ListRealtimeAgentStatesResponse listRealtimeAgentStatesWithOptions(ListRealtimeAgentStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            query.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTypeList)) {
            query.put("CallTypeList", request.callTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundScenario)) {
            query.put("OutboundScenario", request.outboundScenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workModeList)) {
            query.put("WorkModeList", request.workModeList);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIdList)) {
            body.put("AgentIdList", request.agentIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateList)) {
            body.put("StateList", request.stateList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRealtimeAgentStates"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRealtimeAgentStatesResponse());
    }

    /**
     * @param request ListRealtimeAgentStatesRequest
     * @return ListRealtimeAgentStatesResponse
     */
    public ListRealtimeAgentStatesResponse listRealtimeAgentStates(ListRealtimeAgentStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRealtimeAgentStatesWithOptions(request, runtime);
    }

    /**
     * @param request ListRealtimeSkillGroupStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRealtimeSkillGroupStatesResponse
     */
    public ListRealtimeSkillGroupStatesResponse listRealtimeSkillGroupStatesWithOptions(ListRealtimeSkillGroupStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            body.put("SkillGroupIdList", request.skillGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRealtimeSkillGroupStates"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRealtimeSkillGroupStatesResponse());
    }

    /**
     * @param request ListRealtimeSkillGroupStatesRequest
     * @return ListRealtimeSkillGroupStatesResponse
     */
    public ListRealtimeSkillGroupStatesResponse listRealtimeSkillGroupStates(ListRealtimeSkillGroupStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRealtimeSkillGroupStatesWithOptions(request, runtime);
    }

    /**
     * @param request ListRecentCallDetailRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecentCallDetailRecordsResponse
     */
    public ListRecentCallDetailRecordsResponse listRecentCallDetailRecordsWithOptions(ListRecentCallDetailRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.criteria)) {
            query.put("Criteria", request.criteria);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecentCallDetailRecords"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecentCallDetailRecordsResponse());
    }

    /**
     * @param request ListRecentCallDetailRecordsRequest
     * @return ListRecentCallDetailRecordsResponse
     */
    public ListRecentCallDetailRecordsResponse listRecentCallDetailRecords(ListRecentCallDetailRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecentCallDetailRecordsWithOptions(request, runtime);
    }

    /**
     * @param request ListRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupStates for acc</p>
     * 
     * @deprecated OpenAPI ListSkillGroupStates is deprecated, please use CCC::2020-07-01::ListRealtimeSkillGroupStates instead.
     * 
     * @param request ListSkillGroupStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupStatesResponse
     */
    @Deprecated
    // Deprecated
    public ListSkillGroupStatesResponse listSkillGroupStatesWithOptions(ListSkillGroupStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroupStates"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupStatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupStates for acc</p>
     * 
     * @deprecated OpenAPI ListSkillGroupStates is deprecated, please use CCC::2020-07-01::ListRealtimeSkillGroupStates instead.
     * 
     * @param request ListSkillGroupStatesRequest
     * @return ListSkillGroupStatesResponse
     */
    @Deprecated
    // Deprecated
    public ListSkillGroupStatesResponse listSkillGroupStates(ListSkillGroupStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupStatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupSummaryReportsSinceMidnight for acc</p>
     * 
     * @deprecated OpenAPI ListSkillGroupSummaryReportsSinceMidnight is deprecated, please use CCC::2020-07-01::ListHistoricalSkillGroupReport instead.
     * 
     * @param request ListSkillGroupSummaryReportsSinceMidnightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupSummaryReportsSinceMidnightResponse
     */
    @Deprecated
    // Deprecated
    public ListSkillGroupSummaryReportsSinceMidnightResponse listSkillGroupSummaryReportsSinceMidnightWithOptions(ListSkillGroupSummaryReportsSinceMidnightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroupSummaryReportsSinceMidnight"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupSummaryReportsSinceMidnightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupSummaryReportsSinceMidnight for acc</p>
     * 
     * @deprecated OpenAPI ListSkillGroupSummaryReportsSinceMidnight is deprecated, please use CCC::2020-07-01::ListHistoricalSkillGroupReport instead.
     * 
     * @param request ListSkillGroupSummaryReportsSinceMidnightRequest
     * @return ListSkillGroupSummaryReportsSinceMidnightResponse
     */
    @Deprecated
    // Deprecated
    public ListSkillGroupSummaryReportsSinceMidnightResponse listSkillGroupSummaryReportsSinceMidnight(ListSkillGroupSummaryReportsSinceMidnightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupSummaryReportsSinceMidnightWithOptions(request, runtime);
    }

    /**
     * @param request ListSkillGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupsResponse
     */
    public ListSkillGroupsResponse listSkillGroupsWithOptions(ListSkillGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroups"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupsResponse());
    }

    /**
     * @param request ListSkillGroupsRequest
     * @return ListSkillGroupsResponse
     */
    public ListSkillGroupsResponse listSkillGroups(ListSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupsWithOptions(request, runtime);
    }

    /**
     * @param request ListSkillLevelsOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillLevelsOfUserResponse
     */
    public ListSkillLevelsOfUserResponse listSkillLevelsOfUserWithOptions(ListSkillLevelsOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMember)) {
            query.put("IsMember", request.isMember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillLevelsOfUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillLevelsOfUserResponse());
    }

    /**
     * @param request ListSkillLevelsOfUserRequest
     * @return ListSkillLevelsOfUserResponse
     */
    public ListSkillLevelsOfUserResponse listSkillLevelsOfUser(ListSkillLevelsOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillLevelsOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取未分配号码列表</p>
     * 
     * @param request ListUnassignedNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUnassignedNumbersResponse
     */
    public ListUnassignedNumbersResponse listUnassignedNumbersWithOptions(ListUnassignedNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUnassignedNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUnassignedNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取未分配号码列表</p>
     * 
     * @param request ListUnassignedNumbersRequest
     * @return ListUnassignedNumbersResponse
     */
    public ListUnassignedNumbersResponse listUnassignedNumbers(ListUnassignedNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUnassignedNumbersWithOptions(request, runtime);
    }

    /**
     * @param request ListUserLevelsOfSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserLevelsOfSkillGroupResponse
     */
    public ListUserLevelsOfSkillGroupResponse listUserLevelsOfSkillGroupWithOptions(ListUserLevelsOfSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMember)) {
            query.put("IsMember", request.isMember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserLevelsOfSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserLevelsOfSkillGroupResponse());
    }

    /**
     * @param request ListUserLevelsOfSkillGroupRequest
     * @return ListUserLevelsOfSkillGroupResponse
     */
    public ListUserLevelsOfSkillGroupResponse listUserLevelsOfSkillGroup(ListUserLevelsOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserLevelsOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * @param request ListVoicemailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVoicemailsResponse
     */
    public ListVoicemailsResponse listVoicemailsWithOptions(ListVoicemailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVoicemails"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVoicemailsResponse());
    }

    /**
     * @param request ListVoicemailsRequest
     * @return ListVoicemailsResponse
     */
    public ListVoicemailsResponse listVoicemails(ListVoicemailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVoicemailsWithOptions(request, runtime);
    }

    /**
     * @param request MakeCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MakeCallResponse
     */
    public MakeCallResponse makeCallWithOptions(MakeCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maskedCallee)) {
            query.put("MaskedCallee", request.maskedCallee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MakeCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MakeCallResponse());
    }

    /**
     * @param request MakeCallRequest
     * @return MakeCallResponse
     */
    public MakeCallResponse makeCall(MakeCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.makeCallWithOptions(request, runtime);
    }

    /**
     * @param request ModifyAudioFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAudioFileResponse
     */
    public ModifyAudioFileResponse modifyAudioFileWithOptions(ModifyAudioFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFileName)) {
            query.put("AudioFileName", request.audioFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioResourceId)) {
            query.put("AudioResourceId", request.audioResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFileKey)) {
            query.put("OssFileKey", request.ossFileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAudioFile"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAudioFileResponse());
    }

    /**
     * @param request ModifyAudioFileRequest
     * @return ModifyAudioFileResponse
     */
    public ModifyAudioFileResponse modifyAudioFile(ModifyAudioFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAudioFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑呼入控制号码</p>
     * 
     * @param request ModifyCustomCallTaggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustomCallTaggingResponse
     */
    public ModifyCustomCallTaggingResponse modifyCustomCallTaggingWithOptions(ModifyCustomCallTaggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callTagNameList)) {
            query.put("CallTagNameList", request.callTagNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustomCallTagging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustomCallTaggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑呼入控制号码</p>
     * 
     * @param request ModifyCustomCallTaggingRequest
     * @return ModifyCustomCallTaggingResponse
     */
    public ModifyCustomCallTaggingResponse modifyCustomCallTagging(ModifyCustomCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomCallTaggingWithOptions(request, runtime);
    }

    /**
     * @param request ModifyInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstance"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceResponse());
    }

    /**
     * @param request ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    /**
     * @param request ModifyPhoneNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPhoneNumberResponse
     */
    public ModifyPhoneNumberResponse modifyPhoneNumberWithOptions(ModifyPhoneNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPhoneNumber"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPhoneNumberResponse());
    }

    /**
     * @param request ModifyPhoneNumberRequest
     * @return ModifyPhoneNumberResponse
     */
    public ModifyPhoneNumberResponse modifyPhoneNumber(ModifyPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPhoneNumberWithOptions(request, runtime);
    }

    /**
     * @param request ModifySkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySkillGroupResponse
     */
    public ModifySkillGroupResponse modifySkillGroupWithOptions(ModifySkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySkillGroupResponse());
    }

    /**
     * @param request ModifySkillGroupRequest
     * @return ModifySkillGroupResponse
     */
    public ModifySkillGroupResponse modifySkillGroup(ModifySkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request ModifySkillLevelsOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySkillLevelsOfUserResponse
     */
    public ModifySkillLevelsOfUserResponse modifySkillLevelsOfUserWithOptions(ModifySkillLevelsOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevelList)) {
            query.put("SkillLevelList", request.skillLevelList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySkillLevelsOfUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySkillLevelsOfUserResponse());
    }

    /**
     * @param request ModifySkillLevelsOfUserRequest
     * @return ModifySkillLevelsOfUserResponse
     */
    public ModifySkillLevelsOfUserResponse modifySkillLevelsOfUser(ModifySkillLevelsOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySkillLevelsOfUserWithOptions(request, runtime);
    }

    /**
     * @param request ModifyUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarUrl)) {
            query.put("AvatarUrl", request.avatarUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayId)) {
            query.put("DisplayId", request.displayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickname)) {
            query.put("Nickname", request.nickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workMode)) {
            query.put("WorkMode", request.workMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserResponse());
    }

    /**
     * @param request ModifyUserRequest
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    /**
     * @param request ModifyUserLevelsOfSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserLevelsOfSkillGroupResponse
     */
    public ModifyUserLevelsOfSkillGroupResponse modifyUserLevelsOfSkillGroupWithOptions(ModifyUserLevelsOfSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userLevelList)) {
            query.put("UserLevelList", request.userLevelList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserLevelsOfSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserLevelsOfSkillGroupResponse());
    }

    /**
     * @param request ModifyUserLevelsOfSkillGroupRequest
     * @return ModifyUserLevelsOfSkillGroupResponse
     */
    public ModifyUserLevelsOfSkillGroupResponse modifyUserLevelsOfSkillGroup(ModifyUserLevelsOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserLevelsOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request MonitorCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MonitorCallResponse
     */
    public MonitorCallResponse monitorCallWithOptions(MonitorCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitoredUserId)) {
            query.put("MonitoredUserId", request.monitoredUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MonitorCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MonitorCallResponse());
    }

    /**
     * @param request MonitorCallRequest
     * @return MonitorCallResponse
     */
    public MonitorCallResponse monitorCall(MonitorCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.monitorCallWithOptions(request, runtime);
    }

    /**
     * @param request MuteCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MuteCallResponse
     */
    public MuteCallResponse muteCallWithOptions(MuteCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MuteCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MuteCallResponse());
    }

    /**
     * @param request MuteCallRequest
     * @return MuteCallResponse
     */
    public MuteCallResponse muteCall(MuteCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.muteCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂停预测式外呼活动</p>
     * 
     * @param request PauseCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseCampaignResponse
     */
    public PauseCampaignResponse pauseCampaignWithOptions(PauseCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂停预测式外呼活动</p>
     * 
     * @param request PauseCampaignRequest
     * @return PauseCampaignResponse
     */
    public PauseCampaignResponse pauseCampaign(PauseCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseCampaignWithOptions(request, runtime);
    }

    /**
     * @param request PickOutboundNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PickOutboundNumbersResponse
     */
    public PickOutboundNumbersResponse pickOutboundNumbersWithOptions(PickOutboundNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PickOutboundNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PickOutboundNumbersResponse());
    }

    /**
     * @param request PickOutboundNumbersRequest
     * @return PickOutboundNumbersResponse
     */
    public PickOutboundNumbersResponse pickOutboundNumbers(PickOutboundNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pickOutboundNumbersWithOptions(request, runtime);
    }

    /**
     * @param request PollUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PollUserStatusResponse
     */
    public PollUserStatusResponse pollUserStatusWithOptions(PollUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PollUserStatus"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PollUserStatusResponse());
    }

    /**
     * @param request PollUserStatusRequest
     * @return PollUserStatusResponse
     */
    public PollUserStatusResponse pollUserStatus(PollUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pollUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ProcessAliMeCallbackOfStaging</p>
     * 
     * @param request ProcessAliMeCallbackOfStagingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProcessAliMeCallbackOfStagingResponse
     */
    public ProcessAliMeCallbackOfStagingResponse processAliMeCallbackOfStagingWithOptions(ProcessAliMeCallbackOfStagingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessAliMeCallbackOfStaging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessAliMeCallbackOfStagingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ProcessAliMeCallbackOfStaging</p>
     * 
     * @param request ProcessAliMeCallbackOfStagingRequest
     * @return ProcessAliMeCallbackOfStagingResponse
     */
    public ProcessAliMeCallbackOfStagingResponse processAliMeCallbackOfStaging(ProcessAliMeCallbackOfStagingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.processAliMeCallbackOfStagingWithOptions(request, runtime);
    }

    /**
     * @param request PublishContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishContactFlowResponse
     */
    public PublishContactFlowResponse publishContactFlowWithOptions(PublishContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draftId)) {
            query.put("DraftId", request.draftId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishContactFlowResponse());
    }

    /**
     * @param request PublishContactFlowRequest
     * @return PublishContactFlowResponse
     */
    public PublishContactFlowResponse publishContactFlow(PublishContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishContactFlowWithOptions(request, runtime);
    }

    /**
     * @param request ReadyForServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadyForServiceResponse
     */
    public ReadyForServiceResponse readyForServiceWithOptions(ReadyForServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundScenario)) {
            query.put("OutboundScenario", request.outboundScenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadyForService"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadyForServiceResponse());
    }

    /**
     * @param request ReadyForServiceRequest
     * @return ReadyForServiceResponse
     */
    public ReadyForServiceResponse readyForService(ReadyForServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readyForServiceWithOptions(request, runtime);
    }

    /**
     * @param request RedialCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RedialCallResponse
     */
    public RedialCallResponse redialCallWithOptions(RedialCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RedialCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RedialCallResponse());
    }

    /**
     * @param request RedialCallRequest
     * @return RedialCallResponse
     */
    public RedialCallResponse redialCall(RedialCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.redialCallWithOptions(request, runtime);
    }

    /**
     * @param request RegisterDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterDeviceResponse
     */
    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDevice"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDeviceResponse());
    }

    /**
     * @param request RegisterDeviceRequest
     * @return RegisterDeviceResponse
     */
    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    /**
     * @param request RegisterDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterDevicesResponse
     */
    public RegisterDevicesResponse registerDevicesWithOptions(RegisterDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdListJson)) {
            query.put("UserIdListJson", request.userIdListJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDevices"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDevicesResponse());
    }

    /**
     * @param request RegisterDevicesRequest
     * @return RegisterDevicesResponse
     */
    public RegisterDevicesResponse registerDevices(RegisterDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDevicesWithOptions(request, runtime);
    }

    /**
     * @param request ReleaseCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseCallResponse
     */
    public ReleaseCallResponse releaseCallWithOptions(ReleaseCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseCallResponse());
    }

    /**
     * @param request ReleaseCallRequest
     * @return ReleaseCallResponse
     */
    public ReleaseCallResponse releaseCall(ReleaseCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑呼入控制号码</p>
     * 
     * @param request RemoveBlacklistCallTaggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveBlacklistCallTaggingResponse
     */
    public RemoveBlacklistCallTaggingResponse removeBlacklistCallTaggingWithOptions(RemoveBlacklistCallTaggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveBlacklistCallTagging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveBlacklistCallTaggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑呼入控制号码</p>
     * 
     * @param request RemoveBlacklistCallTaggingRequest
     * @return RemoveBlacklistCallTaggingResponse
     */
    public RemoveBlacklistCallTaggingResponse removeBlacklistCallTagging(RemoveBlacklistCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBlacklistCallTaggingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除黑名单号码</p>
     * 
     * @param request RemoveDoNotCallNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDoNotCallNumbersResponse
     */
    public RemoveDoNotCallNumbersResponse removeDoNotCallNumbersWithOptions(RemoveDoNotCallNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDoNotCallNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDoNotCallNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除黑名单号码</p>
     * 
     * @param request RemoveDoNotCallNumbersRequest
     * @return RemoveDoNotCallNumbersResponse
     */
    public RemoveDoNotCallNumbersResponse removeDoNotCallNumbers(RemoveDoNotCallNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDoNotCallNumbersWithOptions(request, runtime);
    }

    /**
     * @param request RemovePersonalNumbersFromUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePersonalNumbersFromUserResponse
     */
    public RemovePersonalNumbersFromUserResponse removePersonalNumbersFromUserWithOptions(RemovePersonalNumbersFromUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePersonalNumbersFromUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePersonalNumbersFromUserResponse());
    }

    /**
     * @param request RemovePersonalNumbersFromUserRequest
     * @return RemovePersonalNumbersFromUserResponse
     */
    public RemovePersonalNumbersFromUserResponse removePersonalNumbersFromUser(RemovePersonalNumbersFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePersonalNumbersFromUserWithOptions(request, runtime);
    }

    /**
     * @param request RemovePhoneNumberFromSkillGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePhoneNumberFromSkillGroupsResponse
     */
    public RemovePhoneNumberFromSkillGroupsResponse removePhoneNumberFromSkillGroupsWithOptions(RemovePhoneNumberFromSkillGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePhoneNumberFromSkillGroups"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePhoneNumberFromSkillGroupsResponse());
    }

    /**
     * @param request RemovePhoneNumberFromSkillGroupsRequest
     * @return RemovePhoneNumberFromSkillGroupsResponse
     */
    public RemovePhoneNumberFromSkillGroupsResponse removePhoneNumberFromSkillGroups(RemovePhoneNumberFromSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePhoneNumberFromSkillGroupsWithOptions(request, runtime);
    }

    /**
     * @param request RemovePhoneNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePhoneNumbersResponse
     */
    public RemovePhoneNumbersResponse removePhoneNumbersWithOptions(RemovePhoneNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePhoneNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePhoneNumbersResponse());
    }

    /**
     * @param request RemovePhoneNumbersRequest
     * @return RemovePhoneNumbersResponse
     */
    public RemovePhoneNumbersResponse removePhoneNumbers(RemovePhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePhoneNumbersWithOptions(request, runtime);
    }

    /**
     * @param request RemovePhoneNumbersFromSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePhoneNumbersFromSkillGroupResponse
     */
    public RemovePhoneNumbersFromSkillGroupResponse removePhoneNumbersFromSkillGroupWithOptions(RemovePhoneNumbersFromSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePhoneNumbersFromSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePhoneNumbersFromSkillGroupResponse());
    }

    /**
     * @param request RemovePhoneNumbersFromSkillGroupRequest
     * @return RemovePhoneNumbersFromSkillGroupResponse
     */
    public RemovePhoneNumbersFromSkillGroupResponse removePhoneNumbersFromSkillGroup(RemovePhoneNumbersFromSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePhoneNumbersFromSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request RemoveSkillGroupsFromUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSkillGroupsFromUserResponse
     */
    public RemoveSkillGroupsFromUserResponse removeSkillGroupsFromUserWithOptions(RemoveSkillGroupsFromUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSkillGroupsFromUser"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSkillGroupsFromUserResponse());
    }

    /**
     * @param request RemoveSkillGroupsFromUserRequest
     * @return RemoveSkillGroupsFromUserResponse
     */
    public RemoveSkillGroupsFromUserResponse removeSkillGroupsFromUser(RemoveSkillGroupsFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeSkillGroupsFromUserWithOptions(request, runtime);
    }

    /**
     * @param request RemoveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsersWithOptions(RemoveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationEmail)) {
            query.put("NotificationEmail", request.notificationEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            query.put("UserIdList", request.userIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUsers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUsersResponse());
    }

    /**
     * @param request RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsers(RemoveUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersWithOptions(request, runtime);
    }

    /**
     * @param request RemoveUsersFromSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersFromSkillGroupResponse
     */
    public RemoveUsersFromSkillGroupResponse removeUsersFromSkillGroupWithOptions(RemoveUsersFromSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            query.put("UserIdList", request.userIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUsersFromSkillGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUsersFromSkillGroupResponse());
    }

    /**
     * @param request RemoveUsersFromSkillGroupRequest
     * @return RemoveUsersFromSkillGroupResponse
     */
    public RemoveUsersFromSkillGroupResponse removeUsersFromSkillGroup(RemoveUsersFromSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersFromSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request ResetAgentStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAgentStateResponse
     */
    public ResetAgentStateResponse resetAgentStateWithOptions(ResetAgentStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAgentState"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAgentStateResponse());
    }

    /**
     * @param request ResetAgentStateRequest
     * @return ResetAgentStateResponse
     */
    public ResetAgentStateResponse resetAgentState(ResetAgentStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAgentStateWithOptions(request, runtime);
    }

    /**
     * @param request ResetUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPasswordWithOptions(ResetUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetUserPassword"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserPasswordResponse());
    }

    /**
     * @param request ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>录音解冻</p>
     * 
     * @param request RestoreArchivedRecordingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreArchivedRecordingsResponse
     */
    public RestoreArchivedRecordingsResponse restoreArchivedRecordingsWithOptions(RestoreArchivedRecordingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            query.put("ContactIds", request.contactIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreArchivedRecordings"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreArchivedRecordingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>录音解冻</p>
     * 
     * @param request RestoreArchivedRecordingsRequest
     * @return RestoreArchivedRecordingsResponse
     */
    public RestoreArchivedRecordingsResponse restoreArchivedRecordings(RestoreArchivedRecordingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreArchivedRecordingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复预测式外呼活动</p>
     * 
     * @param request ResumeCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeCampaignResponse
     */
    public ResumeCampaignResponse resumeCampaignWithOptions(ResumeCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>恢复预测式外呼活动</p>
     * 
     * @param request ResumeCampaignRequest
     * @return ResumeCampaignResponse
     */
    public ResumeCampaignResponse resumeCampaign(ResumeCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeCampaignWithOptions(request, runtime);
    }

    /**
     * @param request RetrieveCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetrieveCallResponse
     */
    public RetrieveCallResponse retrieveCallWithOptions(RetrieveCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetrieveCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetrieveCallResponse());
    }

    /**
     * @param request RetrieveCallRequest
     * @return RetrieveCallResponse
     */
    public RetrieveCallResponse retrieveCall(RetrieveCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retrieveCallWithOptions(request, runtime);
    }

    /**
     * @param request SaveDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveDocumentResponse
     */
    public SaveDocumentResponse saveDocumentWithOptions(SaveDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            body.put("DocumentId", request.documentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentJson)) {
            body.put("DocumentJson", request.documentJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveDocument"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveDocumentResponse());
    }

    /**
     * @param request SaveDocumentRequest
     * @return SaveDocumentResponse
     */
    public SaveDocumentResponse saveDocument(SaveDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveDocumentWithOptions(request, runtime);
    }

    /**
     * @param request SaveRTCStatsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveRTCStatsV2Response
     */
    public SaveRTCStatsV2Response saveRTCStatsV2WithOptions(SaveRTCStatsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generalInfo)) {
            query.put("GeneralInfo", request.generalInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.googAddress)) {
            query.put("GoogAddress", request.googAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverReport)) {
            query.put("ReceiverReport", request.receiverReport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderReport)) {
            query.put("SenderReport", request.senderReport);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveRTCStatsV2"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveRTCStatsV2Response());
    }

    /**
     * @param request SaveRTCStatsV2Request
     * @return SaveRTCStatsV2Response
     */
    public SaveRTCStatsV2Response saveRTCStatsV2(SaveRTCStatsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveRTCStatsV2WithOptions(request, runtime);
    }

    /**
     * @param request SaveTerminalLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTerminalLogResponse
     */
    public SaveTerminalLogResponse saveTerminalLogWithOptions(SaveTerminalLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            query.put("MethodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueRequestId)) {
            query.put("UniqueRequestId", request.uniqueRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTerminalLog"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTerminalLogResponse());
    }

    /**
     * @param request SaveTerminalLogRequest
     * @return SaveTerminalLogResponse
     */
    public SaveTerminalLogResponse saveTerminalLog(SaveTerminalLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTerminalLogWithOptions(request, runtime);
    }

    /**
     * @param request SaveWebRTCStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveWebRTCStatsResponse
     */
    public SaveWebRTCStatsResponse saveWebRTCStatsWithOptions(SaveWebRTCStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generalInfo)) {
            query.put("GeneralInfo", request.generalInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.googAddress)) {
            query.put("GoogAddress", request.googAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverReport)) {
            query.put("ReceiverReport", request.receiverReport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderReport)) {
            query.put("SenderReport", request.senderReport);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveWebRTCStats"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveWebRTCStatsResponse());
    }

    /**
     * @param request SaveWebRTCStatsRequest
     * @return SaveWebRTCStatsResponse
     */
    public SaveWebRTCStatsResponse saveWebRTCStats(SaveWebRTCStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveWebRTCStatsWithOptions(request, runtime);
    }

    /**
     * @param request SaveWebRtcInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveWebRtcInfoResponse
     */
    public SaveWebRtcInfoResponse saveWebRtcInfoWithOptions(SaveWebRtcInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveWebRtcInfo"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveWebRtcInfoResponse());
    }

    /**
     * @param request SaveWebRtcInfoRequest
     * @return SaveWebRtcInfoResponse
     */
    public SaveWebRtcInfoResponse saveWebRtcInfo(SaveWebRtcInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveWebRtcInfoWithOptions(request, runtime);
    }

    /**
     * @param request SendDtmfSignalingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendDtmfSignalingResponse
     */
    public SendDtmfSignalingResponse sendDtmfSignalingWithOptions(SendDtmfSignalingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmf)) {
            query.put("Dtmf", request.dtmf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendDtmfSignaling"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendDtmfSignalingResponse());
    }

    /**
     * @param request SendDtmfSignalingRequest
     * @return SendDtmfSignalingResponse
     */
    public SendDtmfSignalingResponse sendDtmfSignaling(SendDtmfSignalingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendDtmfSignalingWithOptions(request, runtime);
    }

    /**
     * @param request SignInGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SignInGroupResponse
     */
    public SignInGroupResponse signInGroupWithOptions(SignInGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additivity)) {
            query.put("Additivity", request.additivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatDeviceId)) {
            query.put("ChatDeviceId", request.chatDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signedSkillGroupIdList)) {
            query.put("SignedSkillGroupIdList", request.signedSkillGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SignInGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SignInGroupResponse());
    }

    /**
     * @param request SignInGroupRequest
     * @return SignInGroupResponse
     */
    public SignInGroupResponse signInGroup(SignInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signInGroupWithOptions(request, runtime);
    }

    /**
     * @param request SignOutGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SignOutGroupResponse
     */
    public SignOutGroupResponse signOutGroupWithOptions(SignOutGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SignOutGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SignOutGroupResponse());
    }

    /**
     * @param request SignOutGroupRequest
     * @return SignOutGroupResponse
     */
    public SignOutGroupResponse signOutGroup(SignOutGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signOutGroupWithOptions(request, runtime);
    }

    /**
     * @param request StartBack2BackCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartBack2BackCallResponse
     */
    public StartBack2BackCallResponse startBack2BackCallWithOptions(StartBack2BackCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalBroker)) {
            query.put("AdditionalBroker", request.additionalBroker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.broker)) {
            query.put("Broker", request.broker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartBack2BackCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartBack2BackCallResponse());
    }

    /**
     * @param request StartBack2BackCallRequest
     * @return StartBack2BackCallResponse
     */
    public StartBack2BackCallResponse startBack2BackCall(StartBack2BackCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startBack2BackCallWithOptions(request, runtime);
    }

    /**
     * @param tmpReq StartChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartChatResponse
     */
    public StartChatResponse startChatWithOptions(StartChatRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartChatShrinkRequest request = new StartChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userList)) {
            request.userListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userList, "UserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelId)) {
            query.put("AccessChannelId", request.accessChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userListShrink)) {
            query.put("UserList", request.userListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartChat"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartChatResponse());
    }

    /**
     * @param request StartChatRequest
     * @return StartChatResponse
     */
    public StartChatResponse startChat(StartChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startChatWithOptions(request, runtime);
    }

    /**
     * @param request StartConferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartConferenceResponse
     */
    public StartConferenceResponse startConferenceWithOptions(StartConferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantListJson)) {
            query.put("ParticipantListJson", request.participantListJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartConference"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartConferenceResponse());
    }

    /**
     * @param request StartConferenceRequest
     * @return StartConferenceResponse
     */
    public StartConferenceResponse startConference(StartConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConferenceWithOptions(request, runtime);
    }

    /**
     * @param request StartEditContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartEditContactFlowResponse
     */
    public StartEditContactFlowResponse startEditContactFlowWithOptions(StartEditContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartEditContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartEditContactFlowResponse());
    }

    /**
     * @param request StartEditContactFlowRequest
     * @return StartEditContactFlowResponse
     */
    public StartEditContactFlowResponse startEditContactFlow(StartEditContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEditContactFlowWithOptions(request, runtime);
    }

    /**
     * @param request StartPredictiveCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartPredictiveCallResponse
     */
    public StartPredictiveCallResponse startPredictiveCallWithOptions(StartPredictiveCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowVariables)) {
            query.put("ContactFlowVariables", request.contactFlowVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maskedCallee)) {
            query.put("MaskedCallee", request.maskedCallee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartPredictiveCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartPredictiveCallResponse());
    }

    /**
     * @param request StartPredictiveCallRequest
     * @return StartPredictiveCallResponse
     */
    public StartPredictiveCallResponse startPredictiveCall(StartPredictiveCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startPredictiveCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发起隐私呼叫</p>
     * 
     * @param request StartPrivacyCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartPrivacyCallResponse
     */
    public StartPrivacyCallResponse startPrivacyCallWithOptions(StartPrivacyCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartPrivacyCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartPrivacyCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发起隐私呼叫</p>
     * 
     * @param request StartPrivacyCallRequest
     * @return StartPrivacyCallResponse
     */
    public StartPrivacyCallResponse startPrivacyCall(StartPrivacyCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startPrivacyCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交预测式外呼活动</p>
     * 
     * @param request SubmitCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitCampaignResponse
     */
    public SubmitCampaignResponse submitCampaignWithOptions(SubmitCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交预测式外呼活动</p>
     * 
     * @param request SubmitCampaignRequest
     * @return SubmitCampaignResponse
     */
    public SubmitCampaignResponse submitCampaign(SubmitCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCampaignWithOptions(request, runtime);
    }

    /**
     * @param request SwitchToConferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchToConferenceResponse
     */
    public SwitchToConferenceResponse switchToConferenceWithOptions(SwitchToConferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchToConference"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchToConferenceResponse());
    }

    /**
     * @param request SwitchToConferenceRequest
     * @return SwitchToConferenceResponse
     */
    public SwitchToConferenceResponse switchToConference(SwitchToConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchToConferenceWithOptions(request, runtime);
    }

    /**
     * @param request TakeBreakRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TakeBreakResponse
     */
    public TakeBreakResponse takeBreakWithOptions(TakeBreakRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TakeBreak"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TakeBreakResponse());
    }

    /**
     * @param request TakeBreakRequest
     * @return TakeBreakResponse
     */
    public TakeBreakResponse takeBreak(TakeBreakRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.takeBreakWithOptions(request, runtime);
    }

    /**
     * @param request UnmuteCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnmuteCallResponse
     */
    public UnmuteCallResponse unmuteCallWithOptions(UnmuteCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnmuteCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnmuteCallResponse());
    }

    /**
     * @param request UnmuteCallRequest
     * @return UnmuteCallResponse
     */
    public UnmuteCallResponse unmuteCall(UnmuteCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unmuteCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除注册设备</p>
     * 
     * @param request UnregisterDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnregisterDeviceResponse
     */
    public UnregisterDeviceResponse unregisterDeviceWithOptions(UnregisterDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnregisterDevice"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnregisterDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除注册设备</p>
     * 
     * @param request UnregisterDeviceRequest
     * @return UnregisterDeviceResponse
     */
    public UnregisterDeviceResponse unregisterDevice(UnregisterDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unregisterDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update campaign</p>
     * 
     * @param request UpdateCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCampaignResponse
     */
    public UpdateCampaignResponse updateCampaignWithOptions(UpdateCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callableTime)) {
            query.put("CallableTime", request.callableTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyParameters)) {
            query.put("StrategyParameters", request.strategyParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update campaign</p>
     * 
     * @param request UpdateCampaignRequest
     * @return UpdateCampaignResponse
     */
    public UpdateCampaignResponse updateCampaign(UpdateCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCampaignWithOptions(request, runtime);
    }

    /**
     * @param request UpdateConfigItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConfigItemsResponse
     */
    public UpdateConfigItemsResponse updateConfigItemsWithOptions(UpdateConfigItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configItems)) {
            query.put("ConfigItems", request.configItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfigItems"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigItemsResponse());
    }

    /**
     * @param request UpdateConfigItemsRequest
     * @return UpdateConfigItemsResponse
     */
    public UpdateConfigItemsResponse updateConfigItems(UpdateConfigItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigItemsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq UpdateSchemaPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSchemaPropertyResponse
     */
    public UpdateSchemaPropertyResponse updateSchemaPropertyWithOptions(UpdateSchemaPropertyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSchemaPropertyShrinkRequest request = new UpdateSchemaPropertyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.property)) {
            request.propertyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.property, "Property", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyShrink)) {
            body.put("Property", request.propertyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSchemaProperty"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSchemaPropertyResponse());
    }

    /**
     * @param request UpdateSchemaPropertyRequest
     * @return UpdateSchemaPropertyResponse
     */
    public UpdateSchemaPropertyResponse updateSchemaProperty(UpdateSchemaPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSchemaPropertyWithOptions(request, runtime);
    }
}

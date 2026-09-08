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
     * <p>Invoke AbortCampaign to stop the predictive outbound calling Activity corresponding to the specified Activity ID under the specified instance.</p>
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
     * <p>Invoke AbortCampaign to stop the predictive outbound calling Activity corresponding to the specified Activity ID under the specified instance.</p>
     * 
     * @param request AbortCampaignRequest
     * @return AbortCampaignResponse
     */
    public AbortCampaignResponse abortCampaign(AbortCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abortCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call this operation to accept a chat.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Call this operation to accept a chat.</p>
     * 
     * @param request AcceptChatRequest
     * @return AcceptChatResponse
     */
    public AcceptChatResponse acceptChat(AcceptChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a blacklist tag to a specified phone number. You can use this feature with your Interactive Voice Response (IVR) settings to block frequent harassing calls.</p>
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
     * <p>Adds a blacklist tag to a specified phone number. You can use this feature with your Interactive Voice Response (IVR) settings to block frequent harassing calls.</p>
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
     * <p>Invoke AddCases to add an outbound call list to a predictive dialing activity identified by a specified ID under a specified instance.</p>
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
     * <p>Invoke AddCases to add an outbound call list to a predictive dialing activity identified by a specified ID under a specified instance.</p>
     * 
     * @param request AddCasesRequest
     * @return AddCasesResponse
     */
    public AddCasesResponse addCases(AddCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can use the AddFeedback API to evaluate and rate AI features.</p>
     * 
     * @param request AddFeedbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFeedbackResponse
     */
    public AddFeedbackResponse addFeedbackWithOptions(AddFeedbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            query.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rating)) {
            query.put("Rating", request.rating);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFeedback"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can use the AddFeedback API to evaluate and rate AI features.</p>
     * 
     * @param request AddFeedbackRequest
     * @return AddFeedbackResponse
     */
    public AddFeedbackResponse addFeedback(AddFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFeedbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds one or more phone numbers to a skill group by calling AddNumbersToSkillGroup.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Adds one or more phone numbers to a skill group by calling AddNumbersToSkillGroup.</p>
     * 
     * @param request AddNumbersToSkillGroupRequest
     * @return AddNumbersToSkillGroupResponse
     */
    public AddNumbersToSkillGroupResponse addNumbersToSkillGroup(AddNumbersToSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addNumbersToSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke AddPersonalNumbersToUser to add one or more personal outbound numbers to a specified agent under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke AddPersonalNumbersToUser to add one or more personal outbound numbers to a specified agent under a specified instance.</p>
     * 
     * @param request AddPersonalNumbersToUserRequest
     * @return AddPersonalNumbersToUserResponse
     */
    public AddPersonalNumbersToUserResponse addPersonalNumbersToUser(AddPersonalNumbersToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPersonalNumbersToUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke AddPhoneNumberToSkillGroups to associate a phone number with one or more skill groups under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke AddPhoneNumberToSkillGroups to associate a phone number with one or more skill groups under a specified instance.</p>
     * 
     * @param request AddPhoneNumberToSkillGroupsRequest
     * @return AddPhoneNumberToSkillGroupsResponse
     */
    public AddPhoneNumberToSkillGroupsResponse addPhoneNumberToSkillGroups(AddPhoneNumberToSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPhoneNumberToSkillGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke AddPhoneNumbers to add one or more phone numbers to a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke AddPhoneNumbers to add one or more phone numbers to a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke AddSkillGroupsToUser to add one or more skill groups to a specified agent under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke AddSkillGroupsToUser to add one or more skill groups to a specified agent under a specified instance.</p>
     * 
     * @param request AddSkillGroupsToUserRequest
     * @return AddSkillGroupsToUserResponse
     */
    public AddSkillGroupsToUserResponse addSkillGroupsToUser(AddSkillGroupsToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSkillGroupsToUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use AddTicketTask to add a signature and assign an assignee.</p>
     * 
     * @param request AddTicketTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTicketTaskResponse
     */
    public AddTicketTaskResponse addTicketTaskWithOptions(AddTicketTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignee)) {
            query.put("Assignee", request.assignee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("Position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTicketTask"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTicketTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use AddTicketTask to add a signature and assign an assignee.</p>
     * 
     * @param request AddTicketTaskRequest
     * @return AddTicketTaskResponse
     */
    public AddTicketTaskResponse addTicketTask(AddTicketTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTicketTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke AddUsersToSkillGroup to add one or more agents to the same skill group.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke AddUsersToSkillGroup to add one or more agents to the same skill group.</p>
     * 
     * @param request AddUsersToSkillGroupRequest
     * @return AddUsersToSkillGroupResponse
     */
    public AddUsersToSkillGroupResponse addUsersToSkillGroup(AddUsersToSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUsersToSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API can be used for both online chat sessions and voice sessions. When used for voice sessions, the real-time speech-to-text transcription feature must be enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Analyze the specified text-based conversation content and extract summary-related information, such as the title, keywords, summary, and other specified details.</p>
     * 
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
     * <b>description</b> :
     * <p>This API can be used for both online chat sessions and voice sessions. When used for voice sessions, the real-time speech-to-text transcription feature must be enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Analyze the specified text-based conversation content and extract summary-related information, such as the title, keywords, summary, and other specified details.</p>
     * 
     * @param request AnalyzeConversationRequest
     * @return AnalyzeConversationResponse
     */
    public AnalyzeConversationResponse analyzeConversation(AnalyzeConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.analyzeConversationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke AnswerCall to answer the call associated with a specified call ID under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke AnswerCall to answer the call associated with a specified call ID under a specified instance.</p>
     * 
     * @param request AnswerCallRequest
     * @return AnswerCallResponse
     */
    public AnswerCallResponse answerCall(AnswerCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.answerCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds cases to a predictive campaign in a specified instance.</p>
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
     * <p>Adds cases to a predictive campaign in a specified instance.</p>
     * 
     * @param request AppendCasesRequest
     * @return AppendCasesResponse
     */
    public AppendCasesResponse appendCases(AppendCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.appendCasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Accounts with RAM permissions can view all RAM users under an Alibaba Cloud account in the RAM console. You can access the RAM console at https\://ram.console.aliyun.com/users.</p>
     * 
     * <b>summary</b> : 
     * <p>Call AssignUsers to import one or more RAM users into a specified instance. After the import, the RAM users become agents in the instance.</p>
     * 
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
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

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
     * <b>description</b> :
     * <p>Accounts with RAM permissions can view all RAM users under an Alibaba Cloud account in the RAM console. You can access the RAM console at https\://ram.console.aliyun.com/users.</p>
     * 
     * <b>summary</b> : 
     * <p>Call AssignUsers to import one or more RAM users into a specified instance. After the import, the RAM users become agents in the instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke BargeInCall to forcibly insert into an ongoing call associated with a specified call ID under a specified instance. After the forced insertion succeeds, the original two-party call becomes a three-party conference call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke BargeInCall to forcibly insert into an ongoing call associated with a specified call ID under a specified instance. After the forced insertion succeeds, the original two-party call becomes a three-party conference call.</p>
     * 
     * @param request BargeInCallRequest
     * @return BargeInCallResponse
     */
    public BargeInCallResponse bargeInCall(BargeInCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bargeInCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Directly transfer a call to another agent, a skill group queue, or an external number. Direct transfer is also known as blind transfer or single-step transfer.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
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
     * <b>summary</b> : 
     * <p>Directly transfer a call to another agent, a skill group queue, or an external number. Direct transfer is also known as blind transfer or single-step transfer.</p>
     * 
     * @param request BlindTransferRequest
     * @return BlindTransferResponse
     */
    public BlindTransferResponse blindTransfer(BlindTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.blindTransferWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>BridgeRtcCall</p>
     * 
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
     * <b>summary</b> : 
     * <p>BridgeRtcCall</p>
     * 
     * @param request BridgeRtcCallRequest
     * @return BridgeRtcCallResponse
     */
    public BridgeRtcCallResponse bridgeRtcCall(BridgeRtcCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bridgeRtcCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke the CancelAttendedTransfer API to cancel an attended transfer. You can call this API at any time after initiating the attended transfer and before completing it, even if the transferee has already answered the call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke the CancelAttendedTransfer API to cancel an attended transfer. You can call this API at any time after initiating the attended transfer and before completing it, even if the transferee has already answered the call.</p>
     * 
     * @param request CancelAttendedTransferRequest
     * @return CancelAttendedTransferResponse
     */
    public CancelAttendedTransferResponse cancelAttendedTransfer(CancelAttendedTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAttendedTransferWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes an agent\&quot;s status to invisible. This is equivalent to the outbound-only mode.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Changes an agent\&quot;s status to invisible. This is equivalent to the outbound-only mode.</p>
     * 
     * @param request ChangeVisibilityRequest
     * @return ChangeVisibilityResponse
     */
    public ChangeVisibilityResponse changeVisibility(ChangeVisibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeVisibilityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ChangeWorkMode to change the agent\&quot;s work mode.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ChangeWorkMode to change the agent\&quot;s work mode.</p>
     * 
     * @param request ChangeWorkModeRequest
     * @return ChangeWorkModeResponse
     */
    public ChangeWorkModeResponse changeWorkMode(ChangeWorkModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeWorkModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the <code>ClaimCall</code> API to assign a call to an agent.</p>
     * 
     * @param request ClaimCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClaimCallResponse
     */
    public ClaimCallResponse claimCallWithOptions(ClaimCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.candidateUserListJson)) {
            query.put("CandidateUserListJson", request.candidateUserListJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClaimCall"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClaimCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the <code>ClaimCall</code> API to assign a call to an agent.</p>
     * 
     * @param request ClaimCallRequest
     * @return ClaimCallResponse
     */
    public ClaimCallResponse claimCall(ClaimCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.claimCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call ClaimChat to claim the chat for a specified Job ID in a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can call ClaimChat to claim the chat for a specified Job ID in a specified instance.</p>
     * 
     * @param request ClaimChatRequest
     * @return ClaimChatResponse
     */
    public ClaimChatResponse claimChat(ClaimChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.claimChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke CoachCall to coach a specified agent in a specified call (identified by a call ID) under a specified instance. During the coaching session, the coached agent can hear the coach\&quot;s voice, but the customer cannot hear the coach\&quot;s voice.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke CoachCall to coach a specified agent in a specified call (identified by a call ID) under a specified instance. During the coaching session, the coached agent can hear the coach\&quot;s voice, but the customer cannot hear the coach\&quot;s voice.</p>
     * 
     * @param request CoachCallRequest
     * @return CoachCallResponse
     */
    public CoachCallResponse coachCall(CoachCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.coachCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Commits a contact flow.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Commits a contact flow.</p>
     * 
     * @param request CommitContactFlowRequest
     * @return CommitContactFlowResponse
     */
    public CommitContactFlowResponse commitContactFlow(CommitContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke CompleteAttendedTransfer to complete a consultative transfer.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke CompleteAttendedTransfer to complete a consultative transfer.</p>
     * 
     * @param request CompleteAttendedTransferRequest
     * @return CompleteAttendedTransferResponse
     */
    public CompleteAttendedTransferResponse completeAttendedTransfer(CompleteAttendedTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeAttendedTransferWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke CreateAudioFile to create an audio resource under a specified instance. The created audio resource can be used in the instance, such as selecting the audio file for playback during IVR.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke CreateAudioFile to create an audio resource under a specified instance. The created audio resource can be used in the instance, such as selecting the audio file for playback during IVR.</p>
     * 
     * @param request CreateAudioFileRequest
     * @return CreateAudioFileResponse
     */
    public CreateAudioFileResponse createAudioFile(CreateAudioFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAudioFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use the CreateCallSummary operation to create a call summary.</p>
     * 
     * @param request CreateCallSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCallSummaryResponse
     */
    public CreateCallSummaryResponse createCallSummaryWithOptions(CreateCallSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("Context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCallSummary"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCallSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use the CreateCallSummary operation to create a call summary.</p>
     * 
     * @param request CreateCallSummaryRequest
     * @return CreateCallSummaryResponse
     */
    public CreateCallSummaryResponse createCallSummary(CreateCallSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCallSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke CreateCallTags to create multiple call tags under a specified instance.</p>
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
     * <p>You can invoke CreateCallTags to create multiple call tags under a specified instance.</p>
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
     * <p>You can invoke CreateCampaign to create a predictive outbound calling activity under a specified instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numberList)) {
            request.numberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numberList, "NumberList", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.flashSmsParameters)) {
            query.put("FlashSmsParameters", request.flashSmsParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instGroupId)) {
            query.put("InstGroupId", request.instGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.numberListShrink)) {
            query.put("NumberList", request.numberListShrink);
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
     * <p>You can invoke CreateCampaign to create a predictive outbound calling activity under a specified instance.</p>
     * 
     * @param request CreateCampaignRequest
     * @return CreateCampaignResponse
     */
    public CreateCampaignResponse createCampaign(CreateCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCampaignWithOptions(request, runtime);
    }

    /**
     * @param request CreateChatMediaUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatMediaUrlResponse
     */
    public CreateChatMediaUrlResponse createChatMediaUrlWithOptions(CreateChatMediaUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mimeType)) {
            body.put("MimeType", request.mimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatMediaUrl"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatMediaUrlResponse());
    }

    /**
     * @param request CreateChatMediaUrlRequest
     * @return CreateChatMediaUrlResponse
     */
    public CreateChatMediaUrlResponse createChatMediaUrl(CreateChatMediaUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatMediaUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an IVR flow.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates an IVR flow.</p>
     * 
     * @param request CreateContactFlowRequest
     * @return CreateContactFlowResponse
     */
    public CreateContactFlowResponse createContactFlow(CreateContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke CreateCustomCallTagging to create one or more inbound number tags under a specified instance.</p>
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
     * <p>You can invoke CreateCustomCallTagging to create one or more inbound number tags under a specified instance.</p>
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
     * <b>summary</b> : 
     * <p>Invoke CreateInstance to create a Cloud Contact Center instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke CreateInstance to create a Cloud Contact Center instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can call CreateSkillGroup to create a skill group under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can call CreateSkillGroup to create a skill group under a specified instance.</p>
     * 
     * @param request CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use CreateTicket to create a ticket.</p>
     * 
     * @param request CreateTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("Context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTicket"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use CreateTicket to create a ticket.</p>
     * 
     * @param request CreateTicketRequest
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTicketWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creating an agent is equivalent to creating a Resource Access Management (RAM) sub-account. Agents in Cloud Contact Center are mapped to RAM sub-accounts. Therefore, the parameters for creating an agent are similar to those for creating a RAM account. For example, LoginName is the logon name for the RAM account. Email is the email address associated with the RAM account. This email address receives an email containing the initial logon password for the RAM account.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the CreateUser operation to create a new agent in a specified instance.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.needEmailNotification)) {
            query.put("NeedEmailNotification", request.needEmailNotification);
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
     * <b>description</b> :
     * <p>Creating an agent is equivalent to creating a Resource Access Management (RAM) sub-account. Agents in Cloud Contact Center are mapped to RAM sub-accounts. Therefore, the parameters for creating an agent are similar to those for creating a RAM account. For example, LoginName is the logon name for the RAM account. Email is the email address associated with the RAM account. This email address receives an email containing the initial logon password for the RAM account.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the CreateUser operation to create a new agent in a specified instance.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke DeleteAudioFile to delete the audio file associated with a specified audio resource ID under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke DeleteAudioFile to delete the audio file associated with a specified audio resource ID under a specified instance.</p>
     * 
     * @param request DeleteAudioFileRequest
     * @return DeleteAudioFileResponse
     */
    public DeleteAudioFileResponse deleteAudioFile(DeleteAudioFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAudioFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke DeleteCallTag to delete a phone number tag under a specified instance.</p>
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
     * <p>You can invoke DeleteCallTag to delete a phone number tag under a specified instance.</p>
     * 
     * @param request DeleteCallTagRequest
     * @return DeleteCallTagResponse
     */
    public DeleteCallTagResponse deleteCallTag(DeleteCallTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCallTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified contact flow.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
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
     * <b>summary</b> : 
     * <p>Deletes the specified contact flow.</p>
     * 
     * @param request DeleteContactFlowRequest
     * @return DeleteContactFlowResponse
     */
    public DeleteContactFlowResponse deleteContactFlow(DeleteContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke DeleteCustomCallTagging to delete the inbound number tag associated with a specified number under a specified instance.</p>
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
     * <p>You can invoke DeleteCustomCallTagging to delete the inbound number tag associated with a specified number under a specified instance.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2020-07-01"),
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
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
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
     * <b>summary</b> : 
     * <p>Invoke DeleteSkillGroup to delete the skill group associated with the specified skill group ID under the specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke DeleteSkillGroup to delete the skill group associated with the specified skill group ID under the specified instance.</p>
     * 
     * @param request DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    public DeleteSkillGroupResponse deleteSkillGroup(DeleteSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified ticket.</p>
     * 
     * @param request DeleteTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTicketResponse
     */
    public DeleteTicketResponse deleteTicketWithOptions(DeleteTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTicket"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified ticket.</p>
     * 
     * @param request DeleteTicketRequest
     * @return DeleteTicketResponse
     */
    public DeleteTicketResponse deleteTicket(DeleteTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified ticket template.</p>
     * 
     * @param request DeleteTicketTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTicketTemplateResponse
     */
    public DeleteTicketTemplateResponse deleteTicketTemplateWithOptions(DeleteTicketTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTicketTemplate"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTicketTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified ticket template.</p>
     * 
     * @param request DeleteTicketTemplateRequest
     * @return DeleteTicketTemplateResponse
     */
    public DeleteTicketTemplateResponse deleteTicketTemplate(DeleteTicketTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTicketTemplateWithOptions(request, runtime);
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
     * <b>summary</b> : 
     * <p>Use the DisableTicketTemplate operation to disable a ticket template. A disabled template cannot be selected when you create a new ticket.</p>
     * 
     * @param request DisableTicketTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableTicketTemplateResponse
     */
    public DisableTicketTemplateResponse disableTicketTemplateWithOptions(DisableTicketTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableTicketTemplate"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableTicketTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use the DisableTicketTemplate operation to disable a ticket template. A disabled template cannot be selected when you create a new ticket.</p>
     * 
     * @param request DisableTicketTemplateRequest
     * @return DisableTicketTemplateResponse
     */
    public DisableTicketTemplateResponse disableTicketTemplate(DisableTicketTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableTicketTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revoke contact flow editing and discard the associated draft.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Revoke contact flow editing and discard the associated draft.</p>
     * 
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
     * <b>summary</b> : 
     * <p>The EnableTicketTemplate operation publishes a ticket template. Published ticket templates can be used to create tickets.</p>
     * 
     * @param request EnableTicketTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableTicketTemplateResponse
     */
    public EnableTicketTemplateResponse enableTicketTemplateWithOptions(EnableTicketTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableTicketTemplate"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableTicketTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The EnableTicketTemplate operation publishes a ticket template. Published ticket templates can be used to create tickets.</p>
     * 
     * @param request EnableTicketTemplateRequest
     * @return EnableTicketTemplateResponse
     */
    public EnableTicketTemplateResponse enableTicketTemplate(EnableTicketTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableTicketTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke EndConference to make the specified agent exit the call associated with the specified call ID under the specified instance. The call must be in a conference state.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke EndConference to make the specified agent exit the call associated with the specified call ID under the specified instance. The call must be in a conference state.</p>
     * 
     * @param request EndConferenceRequest
     * @return EndConferenceResponse
     */
    public EndConferenceResponse endConference(EndConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.endConferenceWithOptions(request, runtime);
    }

    /**
     * @param request ExportContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportContactFlowResponse
     */
    public ExportContactFlowResponse exportContactFlowWithOptions(ExportContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
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
            new TeaPair("action", "ExportContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportContactFlowResponse());
    }

    /**
     * @param request ExportContactFlowRequest
     * @return ExportContactFlowResponse
     */
    public ExportContactFlowResponse exportContactFlow(ExportContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ExportCustomCallTagging to export all inbound number tags under a specified instance.</p>
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
     * <p>You can invoke ExportCustomCallTagging to export all inbound number tags under a specified instance.</p>
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
     * <p>The ExportDoNotCallNumbers operation exports a filtered list of do-not-call numbers from a specified instance.</p>
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
     * <p>The ExportDoNotCallNumbers operation exports a filtered list of do-not-call numbers from a specified instance.</p>
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
     * <p>Use the FinishTicketTask operation to process tickets.</p>
     * 
     * @param request FinishTicketTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FinishTicketTaskResponse
     */
    public FinishTicketTaskResponse finishTicketTaskWithOptions(FinishTicketTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishTicketTask"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishTicketTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use the FinishTicketTask operation to process tickets.</p>
     * 
     * @param request FinishTicketTaskRequest
     * @return FinishTicketTaskResponse
     */
    public FinishTicketTaskResponse finishTicketTask(FinishTicketTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.finishTicketTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定Chat渠道配置</p>
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
     * <p>获取指定Chat渠道配置</p>
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
     * <p>Invoke GetAudioFile to obtain the audio file information corresponding to a specified audio resource ID under a specified instance.</p>
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
     * <p>Invoke GetAudioFile to obtain the audio file information corresponding to a specified audio resource ID under a specified instance.</p>
     * 
     * @param request GetAudioFileRequest
     * @return GetAudioFileResponse
     */
    public GetAudioFileResponse getAudioFile(GetAudioFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAudioFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetAudioFileDownloadUrl to obtain the OSS download link for a specified audio resource under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke GetAudioFileDownloadUrl to obtain the OSS download link for a specified audio resource under a specified instance.</p>
     * 
     * @param request GetAudioFileDownloadUrlRequest
     * @return GetAudioFileDownloadUrlResponse
     */
    public GetAudioFileDownloadUrlResponse getAudioFileDownloadUrl(GetAudioFileDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAudioFileDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the GetAudioFileUploadParameters API to obtain audio file upload parameters. Before creating an audio file, you must first call this API to retrieve the upload parameters and then call CreateAudioFile to create the audio file. This API is typically invoked by the default public cloud CRM system provided by Cloud Contact Center. It is not recommended for integration customers to call this API directly, because file upload must be performed through a Page operation first; only after the upload is complete can the GetAudioFileUploadParameters API be called.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the GetAudioFileUploadParameters API to obtain audio file upload parameters. Before creating an audio file, you must first call this API to retrieve the upload parameters and then call CreateAudioFile to create the audio file. This API is typically invoked by the default public cloud CRM system provided by Cloud Contact Center. It is not recommended for integration customers to call this API directly, because file upload must be performed through a Page operation first; only after the upload is complete can the GetAudioFileUploadParameters API be called.</p>
     * 
     * @param request GetAudioFileUploadParametersRequest
     * @return GetAudioFileUploadParametersResponse
     */
    public GetAudioFileUploadParametersResponse getAudioFileUploadParameters(GetAudioFileUploadParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAudioFileUploadParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke the GetCallDetailRecord operation to retrieve call details for a specific call ID within a specific instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke the GetCallDetailRecord operation to retrieve call details for a specific call ID within a specific instance.</p>
     * 
     * @param request GetCallDetailRecordRequest
     * @return GetCallDetailRecordResponse
     */
    public GetCallDetailRecordResponse getCallDetailRecord(GetCallDetailRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallDetailRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets a predictive outbound campaign by its ID from a specified instance.</p>
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
     * <p>Gets a predictive outbound campaign by its ID from a specified instance.</p>
     * 
     * @param request GetCampaignRequest
     * @return GetCampaignResponse
     */
    public GetCampaignResponse getCampaign(GetCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetCaseFileUploadUrl to obtain the OSS upload parameters for a predictive outbound calling list file under a specified instance. When creating a predictive outbound calling Activity by importing a file, you must first invoke this API to retrieve the file upload parameters and then invoke the CreateCampaign API.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke GetCaseFileUploadUrl to obtain the OSS upload parameters for a predictive outbound calling list file under a specified instance. When creating a predictive outbound calling Activity by importing a file, you must first invoke this API to retrieve the file upload parameters and then invoke the CreateCampaign API.</p>
     * 
     * @param request GetCaseFileUploadUrlRequest
     * @return GetCaseFileUploadUrlResponse
     */
    public GetCaseFileUploadUrlResponse getCaseFileUploadUrl(GetCaseFileUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCaseFileUploadUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetChatMediaUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatMediaUrlResponse
     */
    public GetChatMediaUrlResponse getChatMediaUrlWithOptions(GetChatMediaUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            body.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatMediaUrl"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatMediaUrlResponse());
    }

    /**
     * @param request GetChatMediaUrlRequest
     * @return GetChatMediaUrlResponse
     */
    public GetChatMediaUrlResponse getChatMediaUrl(GetChatMediaUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatMediaUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use GetChatRoutingProfile to retrieve the chat routing configuration.</p>
     * 
     * @param request GetChatRoutingProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatRoutingProfileResponse
     */
    public GetChatRoutingProfileResponse getChatRoutingProfileWithOptions(GetChatRoutingProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatRoutingProfile"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatRoutingProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use GetChatRoutingProfile to retrieve the chat routing configuration.</p>
     * 
     * @param request GetChatRoutingProfileRequest
     * @return GetChatRoutingProfileResponse
     */
    public GetChatRoutingProfileResponse getChatRoutingProfile(GetChatRoutingProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatRoutingProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve a specified contact flow.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve a specified contact flow.</p>
     * 
     * @param request GetContactFlowRequest
     * @return GetContactFlowResponse
     */
    public GetContactFlowResponse getContactFlow(GetContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetConversationDetail to obtain the conversation details for the call corresponding to the specified contact ID within the specified instance. The instance and skill group must have quality inspection push enabled to obtain these details.</p>
     * 
     * @param request GetConversationDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConversationDetailResponse
     */
    public GetConversationDetailResponse getConversationDetailWithOptions(GetConversationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

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
     * <p>Call GetConversationDetail to obtain the conversation details for the call corresponding to the specified contact ID within the specified instance. The instance and skill group must have quality inspection push enabled to obtain these details.</p>
     * 
     * @param request GetConversationDetailRequest
     * @return GetConversationDetailResponse
     */
    public GetConversationDetailResponse getConversationDetail(GetConversationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConversationDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取DataChannel通道的Token信息</p>
     * 
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
     * <b>summary</b> : 
     * <p>获取DataChannel通道的Token信息</p>
     * 
     * @param request GetDataChannelCredentialsRequest
     * @return GetDataChannelCredentialsResponse
     */
    public GetDataChannelCredentialsResponse getDataChannelCredentials(GetDataChannelCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataChannelCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetDoNotCallFileUploadParameters to obtain the upload parameters for a do-not-call file. When importing prohibited outbound call numbers through a file, you must first invoke this API to upload the do-not-call number file to the public OSS space of Cloud Contact Center, and then invoke ImportDoNotCallNumbers to execute the import.</p>
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
     * <p>Invoke GetDoNotCallFileUploadParameters to obtain the upload parameters for a do-not-call file. When importing prohibited outbound call numbers through a file, you must first invoke this API to upload the do-not-call number file to the public OSS space of Cloud Contact Center, and then invoke ImportDoNotCallNumbers to execute the import.</p>
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
     * <p>Retrieve early-media audio recordings for a call in a specified Cloud Contact Center instance.</p>
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
     * <p>Retrieve early-media audio recordings for a call in a specified Cloud Contact Center instance.</p>
     * 
     * @param request GetEarlyMediaRecordingRequest
     * @return GetEarlyMediaRecordingResponse
     */
    public GetEarlyMediaRecordingResponse getEarlyMediaRecording(GetEarlyMediaRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEarlyMediaRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetHistoricalCallerReport to retrieve the historical inbound call report for a specified calling number under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke GetHistoricalCallerReport to retrieve the historical inbound call report for a specified calling number under a specified instance.</p>
     * 
     * @param request GetHistoricalCallerReportRequest
     * @return GetHistoricalCallerReportResponse
     */
    public GetHistoricalCallerReportResponse getHistoricalCallerReport(GetHistoricalCallerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoricalCallerReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke the GetHistoricalCampaignReport API to retrieve the historical data report of a predictive outbound calling activity corresponding to a specified ID under a specified instance.</p>
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
     * <p>You can invoke the GetHistoricalCampaignReport API to retrieve the historical data report of a predictive outbound calling activity corresponding to a specified ID under a specified instance.</p>
     * 
     * @param request GetHistoricalCampaignReportRequest
     * @return GetHistoricalCampaignReportResponse
     */
    public GetHistoricalCampaignReportResponse getHistoricalCampaignReport(GetHistoricalCampaignReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoricalCampaignReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke GetHistoricalInstanceReport to obtain the historical data report for a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke GetHistoricalInstanceReport to obtain the historical data report for a specified instance.</p>
     * 
     * @param request GetHistoricalInstanceReportRequest
     * @return GetHistoricalInstanceReportResponse
     */
    public GetHistoricalInstanceReportResponse getHistoricalInstanceReport(GetHistoricalInstanceReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoricalInstanceReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a Cloud Contact Center instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the details of a Cloud Contact Center instance.</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call GetInstanceTrendingReport to retrieve the trend report for a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can call GetInstanceTrendingReport to retrieve the trend report for a specified instance.</p>
     * 
     * @param request GetInstanceTrendingReportRequest
     * @return GetInstanceTrendingReportResponse
     */
    public GetInstanceTrendingReportResponse getInstanceTrendingReport(GetInstanceTrendingReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceTrendingReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the IVR tracking summary.</p>
     * 
     * @param request GetIvrTrackingSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIvrTrackingSummaryResponse
     */
    public GetIvrTrackingSummaryResponse getIvrTrackingSummaryWithOptions(GetIvrTrackingSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetIvrTrackingSummary"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIvrTrackingSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the IVR tracking summary.</p>
     * 
     * @param request GetIvrTrackingSummaryRequest
     * @return GetIvrTrackingSummaryResponse
     */
    public GetIvrTrackingSummaryResponse getIvrTrackingSummary(GetIvrTrackingSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIvrTrackingSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetLoginDetails to obtain the agent\&quot;s logon information, including basic agent information, server address information, authentication information, and more. This API can only be invoked by the agent themselves; administrators are not permitted to invoke it on behalf of others.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke GetLoginDetails to obtain the agent\&quot;s logon information, including basic agent information, server address information, authentication information, and more. This API can only be invoked by the agent themselves; administrators are not permitted to invoke it on behalf of others.</p>
     * 
     * @param request GetLoginDetailsRequest
     * @return GetLoginDetailsResponse
     */
    public GetLoginDetailsResponse getLoginDetails(GetLoginDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke GetMonoRecording to obtain the single-track recording of a specified call under a specified instance. A single-track recording contains only one audio track, with both the agent-side and customer-side recordings merged into the same track in WAV format.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke GetMonoRecording to obtain the single-track recording of a specified call under a specified instance. A single-track recording contains only one audio track, with both the agent-side and customer-side recordings merged into the same track in WAV format.</p>
     * 
     * @param request GetMonoRecordingRequest
     * @return GetMonoRecordingResponse
     */
    public GetMonoRecordingResponse getMonoRecording(GetMonoRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMonoRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke GetMultiChannelRecording to obtain the multi-track recording of a specified call under a specified instance. In the multi-track recording, the agent\&quot;s and customer\&quot;s audio are distributed across different sound channels. During each playback, only one sound channel can be played, meaning you can hear only one party\&quot;s voice. The format is MKV.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke GetMultiChannelRecording to obtain the multi-track recording of a specified call under a specified instance. In the multi-track recording, the agent\&quot;s and customer\&quot;s audio are distributed across different sound channels. During each playback, only one sound channel can be played, meaning you can hear only one party\&quot;s voice. The format is MKV.</p>
     * 
     * @param request GetMultiChannelRecordingRequest
     * @return GetMultiChannelRecordingResponse
     */
    public GetMultiChannelRecordingResponse getMultiChannelRecording(GetMultiChannelRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultiChannelRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the GetNumberLocation API to obtain number location information.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the GetNumberLocation API to obtain number location information.</p>
     * 
     * @param request GetNumberLocationRequest
     * @return GetNumberLocationResponse
     */
    public GetNumberLocationResponse getNumberLocation(GetNumberLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNumberLocationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke GetRealtimeCampaignStats to retrieve real-time agent status data for a predictive outbound calling Activity with a specified ID under a specified instance.</p>
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
     * <p>You can invoke GetRealtimeCampaignStats to retrieve real-time agent status data for a predictive outbound calling Activity with a specified ID under a specified instance.</p>
     * 
     * @param request GetRealtimeCampaignStatsRequest
     * @return GetRealtimeCampaignStatsResponse
     */
    public GetRealtimeCampaignStatsResponse getRealtimeCampaignStats(GetRealtimeCampaignStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeCampaignStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke GetRealtimeInstanceStates to obtain the real-time status of a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke GetRealtimeInstanceStates to obtain the real-time status of a specified instance.</p>
     * 
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
     * <p>You can invoke GetSkillGroup to obtain information about the skill group corresponding to a specified skill group ID under a specified instance.</p>
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
     * <p>You can invoke GetSkillGroup to obtain information about the skill group corresponding to a specified skill group ID under a specified instance.</p>
     * 
     * @param request GetSkillGroupRequest
     * @return GetSkillGroupResponse
     */
    public GetSkillGroupResponse getSkillGroup(GetSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the content of a session summary template.</p>
     * 
     * @param request GetSummaryTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSummaryTemplateResponse
     */
    public GetSummaryTemplateResponse getSummaryTemplateWithOptions(GetSummaryTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSummaryTemplate"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSummaryTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the content of a session summary template.</p>
     * 
     * @param request GetSummaryTemplateRequest
     * @return GetSummaryTemplateResponse
     */
    public GetSummaryTemplateResponse getSummaryTemplate(GetSummaryTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSummaryTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a specific ticket.</p>
     * 
     * @param request GetTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTicketResponse
     */
    public GetTicketResponse getTicketWithOptions(GetTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTicket"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a specific ticket.</p>
     * 
     * @param request GetTicketRequest
     * @return GetTicketResponse
     */
    public GetTicketResponse getTicket(GetTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call GetTicketSummaryReport to retrieve a summary of ticket statuses.</p>
     * 
     * @param request GetTicketSummaryReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTicketSummaryReportResponse
     */
    public GetTicketSummaryReportResponse getTicketSummaryReportWithOptions(GetTicketSummaryReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignee)) {
            query.put("Assignee", request.assignee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assigneeType)) {
            query.put("AssigneeType", request.assigneeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
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

        if (!com.aliyun.teautil.Common.isUnset(request.participant)) {
            query.put("Participant", request.participant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTicketSummaryReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTicketSummaryReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call GetTicketSummaryReport to retrieve a summary of ticket statuses.</p>
     * 
     * @param request GetTicketSummaryReportRequest
     * @return GetTicketSummaryReportResponse
     */
    public GetTicketSummaryReportResponse getTicketSummaryReport(GetTicketSummaryReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTicketSummaryReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetTicketTemplate to retrieve ticket template definitions.</p>
     * 
     * @param request GetTicketTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTicketTemplateResponse
     */
    public GetTicketTemplateResponse getTicketTemplateWithOptions(GetTicketTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTicketTemplate"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTicketTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetTicketTemplate to retrieve ticket template definitions.</p>
     * 
     * @param request GetTicketTemplateRequest
     * @return GetTicketTemplateResponse
     */
    public GetTicketTemplateResponse getTicketTemplate(GetTicketTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTicketTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetTurnCredentials to get the connection credentials for a Cloud Contact Center Point of Presence (PoP). These credentials include a username and password for authentication. Connecting to Cloud Contact Center through a PoP improves network quality and stability.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Call GetTurnCredentials to get the connection credentials for a Cloud Contact Center Point of Presence (PoP). These credentials include a username and password for authentication. Connecting to Cloud Contact Center through a PoP improves network quality and stability.</p>
     * 
     * @param request GetTurnCredentialsRequest
     * @return GetTurnCredentialsResponse
     */
    public GetTurnCredentialsResponse getTurnCredentials(GetTurnCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTurnCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetTurnServerList to get a list of front-end access points for Alibaba Cloud Contact Center. Connecting through these access points improves network quality and stability.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Call GetTurnServerList to get a list of front-end access points for Alibaba Cloud Contact Center. Connecting through these access points improves network quality and stability.</p>
     * 
     * @param request GetTurnServerListRequest
     * @return GetTurnServerListResponse
     */
    public GetTurnServerListResponse getTurnServerList(GetTurnServerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTurnServerListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the parameters related to offline quality inspection audio files. Normally, if the Customer has configured the quality inspection feature in Cloud Contact Center, the audio files requiring offline quality inspection and their corresponding parameters are automatically passed to Intelligent Quality Inspection. You only need to invoke this API to obtain the parameters for pushing quality inspection recordings when the Customer has not configured the quality inspection feature in Cloud Contact Center and wishes to manually push Cloud Contact Center call recordings to the quality inspection system.</p>
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
     * <p>Obtain the parameters related to offline quality inspection audio files. Normally, if the Customer has configured the quality inspection feature in Cloud Contact Center, the audio files requiring offline quality inspection and their corresponding parameters are automatically passed to Intelligent Quality Inspection. You only need to invoke this API to obtain the parameters for pushing quality inspection recordings when the Customer has not configured the quality inspection feature in Cloud Contact Center and wishes to manually push Cloud Contact Center call recordings to the quality inspection system.</p>
     * 
     * @param request GetUploadAudioDataParamsRequest
     * @return GetUploadAudioDataParamsResponse
     */
    public GetUploadAudioDataParamsResponse getUploadAudioDataParams(GetUploadAudioDataParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadAudioDataParamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke GetUser to obtain the agent information corresponding to a specified agent ID under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke GetUser to obtain the agent information corresponding to a specified agent ID under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Call GetVisitorLoginDetails to retrieve login, server address, and authentication information for network service visitors.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Call GetVisitorLoginDetails to retrieve login, server address, and authentication information for network service visitors.</p>
     * 
     * @param request GetVisitorLoginDetailsRequest
     * @return GetVisitorLoginDetailsResponse
     */
    public GetVisitorLoginDetailsResponse getVisitorLoginDetails(GetVisitorLoginDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVisitorLoginDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke GetVoicemailRecording to obtain the voicemail recording of a specified call under a specified instance. The recording is single-track and in WAV format.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke GetVoicemailRecording to obtain the voicemail recording of a specified call under a specified instance. The recording is single-track and in WAV format.</p>
     * 
     * @param request GetVoicemailRecordingRequest
     * @return GetVoicemailRecordingResponse
     */
    public GetVoicemailRecordingResponse getVoicemailRecording(GetVoicemailRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVoicemailRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke HoldCall to hold the call associated with a specified call ID under a specified instance. After the call is held, it will be temporarily suspended, and the held party will hear hold music.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke HoldCall to hold the call associated with a specified call ID under a specified instance. After the call is held, it will be temporarily suspended, and the held party will hear hold music.</p>
     * 
     * @param request HoldCallRequest
     * @return HoldCallResponse
     */
    public HoldCallResponse holdCall(HoldCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.holdCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports one or more admins to a specified instance. The caller must have the <code>AliyunCCCFullAccess</code> permission, which you can grant in the RAM console.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Imports one or more admins to a specified instance. The caller must have the <code>AliyunCCCFullAccess</code> permission, which you can grant in the RAM console.</p>
     * 
     * @param request ImportAdminsRequest
     * @return ImportAdminsResponse
     */
    public ImportAdminsResponse importAdmins(ImportAdminsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importAdminsWithOptions(request, runtime);
    }

    /**
     * @param request ImportContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportContactFlowResponse
     */
    public ImportContactFlowResponse importContactFlowWithOptions(ImportContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowPackageData)) {
            body.put("FlowPackageData", request.flowPackageData);
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
            new TeaPair("action", "ImportContactFlow"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportContactFlowResponse());
    }

    /**
     * @param request ImportContactFlowRequest
     * @return ImportContactFlowResponse
     */
    public ImportContactFlowResponse importContactFlow(ImportContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports your organization’s telephone line numbers. Before performing the first import, contact Cloud Contact Center technical support to add the numbers to the allowlist.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Imports your organization’s telephone line numbers. Before performing the first import, contact Cloud Contact Center technical support to add the numbers to the allowlist.</p>
     * 
     * @param request ImportCorpNumbersRequest
     * @return ImportCorpNumbersResponse
     */
    public ImportCorpNumbersResponse importCorpNumbers(ImportCorpNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importCorpNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ImportCustomCallTagging to import multiple inbound number tags into a specified instance.</p>
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
     * <p>You can invoke ImportCustomCallTagging to import multiple inbound number tags into a specified instance.</p>
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
     * <p>Imports one or more do-not-call numbers to a specified instance. You can import numbers by manual entry or file upload.</p>
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
     * <p>Imports one or more do-not-call numbers to a specified instance. You can import numbers by manual entry or file upload.</p>
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
     * <b>summary</b> : 
     * <p>Import existing RAM users as contact center agents.</p>
     * 
     * @param request ImportRamUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportRamUsersResponse
     */
    public ImportRamUsersResponse importRamUsersWithOptions(ImportRamUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ImportRamUsers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportRamUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Import existing RAM users as contact center agents.</p>
     * 
     * @param request ImportRamUsersRequest
     * @return ImportRamUsersResponse
     */
    public ImportRamUsersResponse importRamUsers(ImportRamUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importRamUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Consultation transfer refers to transferring a call to another agent, a skill group queue, or an external number. It is also known as follow transfer or two-step transfer.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Consultation transfer refers to transferring a call to another agent, a skill group queue, or an external number. It is also known as follow transfer or two-step transfer.</p>
     * 
     * @param request InitiateAttendedTransferRequest
     * @return InitiateAttendedTransferResponse
     */
    public InitiateAttendedTransferResponse initiateAttendedTransfer(InitiateAttendedTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initiateAttendedTransferWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke InterceptCall to forcibly disconnect the call associated with a specified call ID under a given instance. The call must be in the listener state, and the forced disconnection must be initiated by the listener. After the forced disconnection succeeds, the agent who was originally talking with the customer will be disconnected, and the agent who initiated the forced disconnection will replace the original agent and continue the conversation with the customer.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke InterceptCall to forcibly disconnect the call associated with a specified call ID under a given instance. The call must be in the listener state, and the forced disconnection must be initiated by the listener. After the forced disconnection succeeds, the agent who was originally talking with the customer will be disconnected, and the agent who initiated the forced disconnection will replace the original agent and continue the conversation with the customer.</p>
     * 
     * @param request InterceptCallRequest
     * @return InterceptCallResponse
     */
    public InterceptCallResponse interceptCall(InterceptCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.interceptCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke LaunchAuthentication to temporarily transfer a call into a specified IVR flow. After invoking this API, the call enters an IVR interaction phase, which is commonly used for identity verification operations.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke LaunchAuthentication to temporarily transfer a call into a specified IVR flow. After invoking this API, the call enters an IVR interaction phase, which is commonly used for identity verification operations.</p>
     * 
     * @param request LaunchAuthenticationRequest
     * @return LaunchAuthenticationResponse
     */
    public LaunchAuthenticationResponse launchAuthentication(LaunchAuthenticationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchAuthenticationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke LaunchSurvey to send a satisfaction survey. This operation causes the agent to hang up. If it is a voice-based satisfaction survey, the customer enters the IVR satisfaction survey flow after the agent hangs up and completes the satisfaction collection within the IVR flow. If it is an SMS-based satisfaction survey, the call ends and the customer receives a satisfaction survey text message.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke LaunchSurvey to send a satisfaction survey. This operation causes the agent to hang up. If it is a voice-based satisfaction survey, the customer enters the IVR satisfaction survey flow after the agent hangs up and completes the satisfaction collection within the IVR flow. If it is an SMS-based satisfaction survey, the call ends and the customer receives a satisfaction survey text message.</p>
     * 
     * @param request LaunchSurveyRequest
     * @return LaunchSurveyResponse
     */
    public LaunchSurveyResponse launchSurvey(LaunchSurveyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchSurveyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke ListAgentStateLogs to obtain the status log list of a specified agent under a specified instance. Note that this API will soon expire. Use the override API ListRealtimeAgentStates instead.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke ListAgentStateLogs to obtain the status log list of a specified agent under a specified instance. Note that this API will soon expire. Use the override API ListRealtimeAgentStates instead.</p>
     * 
     * @param request ListAgentStateLogsRequest
     * @return ListAgentStateLogsResponse
     */
    public ListAgentStateLogsResponse listAgentStateLogs(ListAgentStateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentStateLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke the ListAgentStates API to retrieve a list of agent statuses under a specified instance, filtered by specified conditions. This API is available only to specific Users. Other Customers are not recommended to invoke it.</p>
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
     * <p>You can invoke the ListAgentStates API to retrieve a list of agent statuses under a specified instance, filtered by specified conditions. This API is available only to specific Users. Other Customers are not recommended to invoke it.</p>
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
     * <p>You can invoke the ListAgentSummaryReportsSinceMidnight API to retrieve agent historical data reports under a specified instance, filtered by given conditions. The statistics cover data from 00:00 of the current day up to the current time. This API is available only to specific users; other customers are not recommended to invoke it.</p>
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
     * <p>You can invoke the ListAgentSummaryReportsSinceMidnight API to retrieve agent historical data reports under a specified instance, filtered by given conditions. The statistics cover data from 00:00 of the current day up to the current time. This API is available only to specific users; other customers are not recommended to invoke it.</p>
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
     * <p>You can invoke ListAttempts to obtain the list of contact dialing records for a specified predictive outbound calling Activity under a specified instance.</p>
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
     * <p>You can invoke ListAttempts to obtain the list of contact dialing records for a specified predictive outbound calling Activity under a specified instance.</p>
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
     * <p>Invoke ListAudioFiles to obtain the list of audio files under a specified instance.</p>
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
     * <p>Invoke ListAudioFiles to obtain the list of audio files under a specified instance.</p>
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
     * <p>Queries the blacklist tag status of specified numbers in a batch.</p>
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
     * <p>Queries the blacklist tag status of specified numbers in a batch.</p>
     * 
     * @param request ListBlacklistCallTaggingsRequest
     * @return ListBlacklistCallTaggingsResponse
     */
    public ListBlacklistCallTaggingsResponse listBlacklistCallTaggings(ListBlacklistCallTaggingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBlacklistCallTaggingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListBriefSkillGroups to obtain the list of skill group summary information under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListBriefSkillGroups to obtain the list of skill group summary information under a specified instance.</p>
     * 
     * @param request ListBriefSkillGroupsRequest
     * @return ListBriefSkillGroupsResponse
     */
    public ListBriefSkillGroupsResponse listBriefSkillGroups(ListBriefSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBriefSkillGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To ensure query efficiency, the TotalCount field in the response data is populated only when the first page is queried. For other pages, this field returns 0.</p>
     * 
     * <b>summary</b> : 
     * <p>You can invoke ListCallDetailRecords to obtain a list of call details filtered by specified search conditions under a specified instance. This API is no longer iteratively updated. We recommend that you use the ListCallDetailRecordsV2 API instead.</p>
     * 
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
     * <b>description</b> :
     * <p>To ensure query efficiency, the TotalCount field in the response data is populated only when the first page is queried. For other pages, this field returns 0.</p>
     * 
     * <b>summary</b> : 
     * <p>You can invoke ListCallDetailRecords to obtain a list of call details filtered by specified search conditions under a specified instance. This API is no longer iteratively updated. We recommend that you use the ListCallDetailRecordsV2 API instead.</p>
     * 
     * @param request ListCallDetailRecordsRequest
     * @return ListCallDetailRecordsResponse
     */
    public ListCallDetailRecordsResponse listCallDetailRecords(ListCallDetailRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallDetailRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>ListCallDetailRecordsV2 is used to override the ListCallDetailRecords operation. New fields and query conditions will undergo continuous optimization in ListCallDetailRecordsV2. To ensure query efficiency, the TotalCount field in the response is populated only when you query the first page. For other pages, the value 0 is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of call detail records that match the specified filter criteria for a specified instance.</p>
     * 
     * @param request ListCallDetailRecordsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallDetailRecordsV2Response
     */
    public ListCallDetailRecordsV2Response listCallDetailRecordsV2WithOptions(ListCallDetailRecordsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelTypeList)) {
            query.put("AccessChannelTypeList", request.accessChannelTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.analyticsReportReady)) {
            query.put("AnalyticsReportReady", request.analyticsReportReady);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.broker)) {
            query.put("Broker", request.broker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDispositionList)) {
            query.put("ContactDispositionList", request.contactDispositionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactIdList)) {
            query.put("ContactIdList", request.contactIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactTypeList)) {
            query.put("ContactTypeList", request.contactTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earlyMediaStateList)) {
            query.put("EarlyMediaStateList", request.earlyMediaStateList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstAgentId)) {
            query.put("FirstAgentId", request.firstAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
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

        if (!com.aliyun.teautil.Common.isUnset(request.releaseInitiatorList)) {
            query.put("ReleaseInitiatorList", request.releaseInitiatorList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseReasonList)) {
            query.put("ReleaseReasonList", request.releaseReasonList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.satisfactionDescriptionList)) {
            query.put("SatisfactionDescriptionList", request.satisfactionDescriptionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.satisfactionRateList)) {
            query.put("SatisfactionRateList", request.satisfactionRateList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.satisfactionSurveyChannel)) {
            query.put("SatisfactionSurveyChannel", request.satisfactionSurveyChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
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
            new TeaPair("action", "ListCallDetailRecordsV2"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallDetailRecordsV2Response());
    }

    /**
     * <b>description</b> :
     * <p>ListCallDetailRecordsV2 is used to override the ListCallDetailRecords operation. New fields and query conditions will undergo continuous optimization in ListCallDetailRecordsV2. To ensure query efficiency, the TotalCount field in the response is populated only when you query the first page. For other pages, the value 0 is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of call detail records that match the specified filter criteria for a specified instance.</p>
     * 
     * @param request ListCallDetailRecordsV2Request
     * @return ListCallDetailRecordsV2Response
     */
    public ListCallDetailRecordsV2Response listCallDetailRecordsV2(ListCallDetailRecordsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallDetailRecordsV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use the ListCallSummaries operation to retrieve call summaries.</p>
     * 
     * @param tmpReq ListCallSummariesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallSummariesResponse
     */
    public ListCallSummariesResponse listCallSummariesWithOptions(ListCallSummariesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCallSummariesShrinkRequest request = new ListCallSummariesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactIdList)) {
            request.contactIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactIdList, "ContactIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactIdListShrink)) {
            query.put("ContactIdList", request.contactIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallSummaries"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallSummariesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use the ListCallSummaries operation to retrieve call summaries.</p>
     * 
     * @param request ListCallSummariesRequest
     * @return ListCallSummariesResponse
     */
    public ListCallSummariesResponse listCallSummaries(ListCallSummariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallSummariesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListCallTags to obtain all number tags under a specified instance.</p>
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
     * <p>You can invoke ListCallTags to obtain all number tags under a specified instance.</p>
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
     * <p>Obtain the trend report of the predictive outbound calling activity with the specified ID under the specified instance.</p>
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
     * <p>Obtain the trend report of the predictive outbound calling activity with the specified ID under the specified instance.</p>
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
     * <p>Calls ListCampaigns to obtain the list of predictive dialing campaigns under a specified instance.</p>
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
     * <p>Calls ListCampaigns to obtain the list of predictive dialing campaigns under a specified instance.</p>
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
     * <p>Invoke ListCases to obtain the execution details list of the outbound contact list for the predictive dialing Activity corresponding to the specified ID under the specified instance.</p>
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
     * <p>Invoke ListCases to obtain the execution details list of the outbound contact list for the predictive dialing Activity corresponding to the specified ID under the specified instance.</p>
     * 
     * @param request ListCasesRequest
     * @return ListCasesResponse
     */
    public ListCasesResponse listCases(ListCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can use ListCategories to retrieve category information.</p>
     * 
     * @param request ListCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCategoriesResponse
     */
    public ListCategoriesResponse listCategoriesWithOptions(ListCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCategories"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can use ListCategories to retrieve category information.</p>
     * 
     * @param request ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the ticket field types that are defined for an instance.</p>
     * 
     * @param request ListCommonTicketFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommonTicketFieldsResponse
     */
    public ListCommonTicketFieldsResponse listCommonTicketFieldsWithOptions(ListCommonTicketFieldsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommonTicketFields"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommonTicketFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the ticket field types that are defined for an instance.</p>
     * 
     * @param request ListCommonTicketFieldsRequest
     * @return ListCommonTicketFieldsResponse
     */
    public ListCommonTicketFieldsResponse listCommonTicketFields(ListCommonTicketFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCommonTicketFieldsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the config items for a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the config items for a specified instance.</p>
     * 
     * @param request ListConfigItemsRequest
     * @return ListConfigItemsResponse
     */
    public ListConfigItemsResponse listConfigItems(ListConfigItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call ListContactFlows to retrieve the IVR contact flows for a specified instance.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            query.put("SearchPattern", request.searchPattern);
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
     * <b>summary</b> : 
     * <p>Call ListContactFlows to retrieve the IVR contact flows for a specified instance.</p>
     * 
     * @param request ListContactFlowsRequest
     * @return ListContactFlowsResponse
     */
    public ListContactFlowsResponse listContactFlows(ListContactFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContactFlowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListCustomCallTagging to obtain the list of inbound number marks under a specified instance.</p>
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
     * <p>You can invoke ListCustomCallTagging to obtain the list of inbound number marks under a specified instance.</p>
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
     * <b>summary</b> : 
     * <p>Obtain the device list of a specified agent under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Obtain the device list of a specified agent under a specified instance.</p>
     * 
     * @param request ListDevicesRequest
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of prohibited outbound call numbers under a specified instance, filtered by specified search conditions.</p>
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
     * <p>Retrieves the list of prohibited outbound call numbers under a specified instance, filtered by specified search conditions.</p>
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
     * <b>summary</b> : 
     * <p>Queries feedback records.</p>
     * 
     * @param request ListFeedbacksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeedbacksResponse
     */
    public ListFeedbacksResponse listFeedbacksWithOptions(ListFeedbacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdList)) {
            query.put("TaskIdList", request.taskIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeedbacks"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeedbacksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries feedback records.</p>
     * 
     * @param request ListFeedbacksRequest
     * @return ListFeedbacksResponse
     */
    public ListFeedbacksResponse listFeedbacks(ListFeedbacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFeedbacksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can use ListFlashSmsApplication to obtain third-party flash SMS configuration information.</p>
     * 
     * @param request ListFlashSmsApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlashSmsApplicationsResponse
     */
    public ListFlashSmsApplicationsResponse listFlashSmsApplicationsWithOptions(ListFlashSmsApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            query.put("ProviderId", request.providerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlashSmsApplications"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlashSmsApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can use ListFlashSmsApplication to obtain third-party flash SMS configuration information.</p>
     * 
     * @param request ListFlashSmsApplicationsRequest
     * @return ListFlashSmsApplicationsResponse
     */
    public ListFlashSmsApplicationsResponse listFlashSmsApplications(ListFlashSmsApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlashSmsApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the ListFlashSmsSettings operation to retrieve the flash SMS configurations for a specified skill group.</p>
     * 
     * @param tmpReq ListFlashSmsSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlashSmsSettingsResponse
     */
    public ListFlashSmsSettingsResponse listFlashSmsSettingsWithOptions(ListFlashSmsSettingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFlashSmsSettingsShrinkRequest request = new ListFlashSmsSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.skillGroupIdList)) {
            request.skillGroupIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.skillGroupIdList, "SkillGroupIdList", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdListShrink)) {
            query.put("SkillGroupIdList", request.skillGroupIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            query.put("SkillGroupName", request.skillGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlashSmsSettings"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlashSmsSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the ListFlashSmsSettings operation to retrieve the flash SMS configurations for a specified skill group.</p>
     * 
     * @param request ListFlashSmsSettingsRequest
     * @return ListFlashSmsSettingsResponse
     */
    public ListFlashSmsSettingsResponse listFlashSmsSettings(ListFlashSmsSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlashSmsSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use ListFlashSmsTemplates to retrieve flash SMS template information.</p>
     * 
     * @param request ListFlashSmsTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlashSmsTemplatesResponse
     */
    public ListFlashSmsTemplatesResponse listFlashSmsTemplatesWithOptions(ListFlashSmsTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            query.put("ProviderId", request.providerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlashSmsTemplates"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlashSmsTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use ListFlashSmsTemplates to retrieve flash SMS template information.</p>
     * 
     * @param request ListFlashSmsTemplatesRequest
     * @return ListFlashSmsTemplatesResponse
     */
    public ListFlashSmsTemplatesResponse listFlashSmsTemplates(ListFlashSmsTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlashSmsTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the records of group chat messages.</p>
     * 
     * @param request ListGroupChatMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupChatMessagesResponse
     */
    public ListGroupChatMessagesResponse listGroupChatMessagesWithOptions(ListGroupChatMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupChatMessages"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupChatMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the records of group chat messages.</p>
     * 
     * @param request ListGroupChatMessagesRequest
     * @return ListGroupChatMessagesResponse
     */
    public ListGroupChatMessagesResponse listGroupChatMessages(ListGroupChatMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupChatMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves historical data reports for one or more agents in a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves historical data reports for one or more agents in a specified instance.</p>
     * 
     * @param request ListHistoricalAgentReportRequest
     * @return ListHistoricalAgentReportResponse
     */
    public ListHistoricalAgentReportResponse listHistoricalAgentReport(ListHistoricalAgentReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalAgentReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call ListHistoricalAgentSkillGroupReport to retrieve historical skill group reports for one or more agents in a specified instance.</p>
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
     * <p>You can call ListHistoricalAgentSkillGroupReport to retrieve historical skill group reports for one or more agents in a specified instance.</p>
     * 
     * @param request ListHistoricalAgentSkillGroupReportRequest
     * @return ListHistoricalAgentSkillGroupReportResponse
     */
    public ListHistoricalAgentSkillGroupReportResponse listHistoricalAgentSkillGroupReport(ListHistoricalAgentSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalAgentSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListHistoricalSkillGroupReport to obtain historical data reports for one or more skill groups under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListHistoricalSkillGroupReport to obtain historical data reports for one or more skill groups under a specified instance.</p>
     * 
     * @param request ListHistoricalSkillGroupReportRequest
     * @return ListHistoricalSkillGroupReportResponse
     */
    public ListHistoricalSkillGroupReportResponse listHistoricalSkillGroupReport(ListHistoricalSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a RAM user needs to invoke this API, the RAM user must have the &quot;Manage Cloud Call Center (CCC)&quot; permission (AliyunCCCFullAccess).</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the ListInstances API to obtain the list of Cloud Contact Center instances under the current Alibaba Cloud account.</p>
     * 
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
     * <b>description</b> :
     * <p>If a RAM user needs to invoke this API, the RAM user must have the &quot;Manage Cloud Call Center (CCC)&quot; permission (AliyunCCCFullAccess).</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the ListInstances API to obtain the list of Cloud Contact Center instances under the current Alibaba Cloud account.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListInstancesOfUser to obtain the list of Cloud Contact Center instances to which the User belongs.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListInstancesOfUser to obtain the list of Cloud Contact Center instances to which the User belongs.</p>
     * 
     * @param request ListInstancesOfUserRequest
     * @return ListInstancesOfUserResponse
     */
    public ListInstancesOfUserResponse listInstancesOfUser(ListInstancesOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListIntervalAgentReport to obtain the segment statistical report of a specified agent under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListIntervalAgentReport to obtain the segment statistical report of a specified agent under a specified instance.</p>
     * 
     * @param request ListIntervalAgentReportRequest
     * @return ListIntervalAgentReportResponse
     */
    public ListIntervalAgentReportResponse listIntervalAgentReport(ListIntervalAgentReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalAgentReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the interval-based statistical report for a specified agent in a specified instance.</p>
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
     * <p>Retrieves the interval-based statistical report for a specified agent in a specified instance.</p>
     * 
     * @param request ListIntervalAgentSkillGroupReportRequest
     * @return ListIntervalAgentSkillGroupReportResponse
     */
    public ListIntervalAgentSkillGroupReportResponse listIntervalAgentSkillGroupReport(ListIntervalAgentSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalAgentSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListIntervalInstanceReport to obtain the segment statistical report for a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListIntervalInstanceReport to obtain the segment statistical report for a specified instance.</p>
     * 
     * @param request ListIntervalInstanceReportRequest
     * @return ListIntervalInstanceReportResponse
     */
    public ListIntervalInstanceReportResponse listIntervalInstanceReport(ListIntervalInstanceReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalInstanceReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListIntervalSkillGroupReport to obtain the segment-based statistical report of a specified skill group under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListIntervalSkillGroupReport to obtain the segment-based statistical report of a specified skill group under a specified instance.</p>
     * 
     * @param request ListIntervalSkillGroupReportRequest
     * @return ListIntervalSkillGroupReportResponse
     */
    public ListIntervalSkillGroupReportResponse listIntervalSkillGroupReport(ListIntervalSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke ListIvrTrackingDetails to obtain the IVR tracking details of a specified call under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke ListIvrTrackingDetails to obtain the IVR tracking details of a specified call under a specified instance.</p>
     * 
     * @param request ListIvrTrackingDetailsRequest
     * @return ListIvrTrackingDetailsResponse
     */
    public ListIvrTrackingDetailsResponse listIvrTrackingDetails(ListIvrTrackingDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIvrTrackingDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListLegacyAgentEventLogs to obtain the list of 1.0 legacy agent event logs. This API is available only to specific Users, and other Customers are not recommended to invoke it.</p>
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
     * <p>You can invoke ListLegacyAgentEventLogs to obtain the list of 1.0 legacy agent event logs. This API is available only to specific Users, and other Customers are not recommended to invoke it.</p>
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
     * <p>You can invoke ListLegacyAgentStatusLogs to obtain the list of legacy agent status logs for version 1.0. This API is available only to specific Users, and other Customers are not recommended to invoke it.</p>
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
     * <p>You can invoke ListLegacyAgentStatusLogs to obtain the list of legacy agent status logs for version 1.0. This API is available only to specific Users, and other Customers are not recommended to invoke it.</p>
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
     * <p>You can invoke ListLegacyQueueEventLogs to obtain the list of 1.0 legacy queue event logs. This API is available only to specific Users, and other Customers are not recommended to invoke it.</p>
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
     * <p>You can invoke ListLegacyQueueEventLogs to obtain the list of 1.0 legacy queue event logs. This API is available only to specific Users, and other Customers are not recommended to invoke it.</p>
     * 
     * @param request ListLegacyQueueEventLogsRequest
     * @return ListLegacyQueueEventLogsResponse
     */
    public ListLegacyQueueEventLogsResponse listLegacyQueueEventLogs(ListLegacyQueueEventLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLegacyQueueEventLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call ListMonoRecordings to retrieve single-track recordings for each party in a specified call under a specified instance. During a call, each party has a channel, and each channel generates a combined track recording in WAV format.</p>
     * 
     * @param request ListMonoRecordingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonoRecordingsResponse
     */
    public ListMonoRecordingsResponse listMonoRecordingsWithOptions(ListMonoRecordingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentChannelId)) {
            query.put("AgentChannelId", request.agentChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

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
     * <b>summary</b> : 
     * <p>Call ListMonoRecordings to retrieve single-track recordings for each party in a specified call under a specified instance. During a call, each party has a channel, and each channel generates a combined track recording in WAV format.</p>
     * 
     * @param request ListMonoRecordingsRequest
     * @return ListMonoRecordingsResponse
     */
    public ListMonoRecordingsResponse listMonoRecordings(ListMonoRecordingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMonoRecordingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call ListMultiChannelRecordings to retrieve the multi-channel recordings for each party in a specified call and instance. Each party has a call channel that corresponds to a multi-channel recording in MKV format.</p>
     * 
     * @param request ListMultiChannelRecordingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultiChannelRecordingsResponse
     */
    public ListMultiChannelRecordingsResponse listMultiChannelRecordingsWithOptions(ListMultiChannelRecordingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentChannelId)) {
            query.put("AgentChannelId", request.agentChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

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
     * <b>summary</b> : 
     * <p>Call ListMultiChannelRecordings to retrieve the multi-channel recordings for each party in a specified call and instance. Each party has a call channel that corresponds to a multi-channel recording in MKV format.</p>
     * 
     * @param request ListMultiChannelRecordingsRequest
     * @return ListMultiChannelRecordingsResponse
     */
    public ListMultiChannelRecordingsResponse listMultiChannelRecordings(ListMultiChannelRecordingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultiChannelRecordingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query notification records that were not sent using Message Queue (MQ).</p>
     * 
     * @param request ListNotificationRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNotificationRecordsResponse
     */
    public ListNotificationRecordsResponse listNotificationRecordsWithOptions(ListNotificationRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationKeys)) {
            query.put("NotificationKeys", request.notificationKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNotificationRecords"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNotificationRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query notification records that were not sent using Message Queue (MQ).</p>
     * 
     * @param request ListNotificationRecordsRequest
     * @return ListNotificationRecordsResponse
     */
    public ListNotificationRecordsResponse listNotificationRecords(ListNotificationRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNotificationRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p><code>ListOutboundNumbersOfUser</code> retrieves the outbound numbers for a specified agent in a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p><code>ListOutboundNumbersOfUser</code> retrieves the outbound numbers for a specified agent in a specified instance.</p>
     * 
     * @param request ListOutboundNumbersOfUserRequest
     * @return ListOutboundNumbersOfUserResponse
     */
    public ListOutboundNumbersOfUserResponse listOutboundNumbersOfUser(ListOutboundNumbersOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutboundNumbersOfUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Note: If a number is already attached to a skill group, it will not appear in the list of numbers available as personal outbound numbers.</p>
     * 
     * <b>summary</b> : 
     * <p>You can invoke ListPersonalNumbersOfUser to obtain the list of personal outbound numbers for a specified agent under a specified instance. You can also use this API to retrieve the list of numbers that can be added as personal outbound numbers for an agent.</p>
     * 
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
     * <b>description</b> :
     * <p>Note: If a number is already attached to a skill group, it will not appear in the list of numbers available as personal outbound numbers.</p>
     * 
     * <b>summary</b> : 
     * <p>You can invoke ListPersonalNumbersOfUser to obtain the list of personal outbound numbers for a specified agent under a specified instance. You can also use this API to retrieve the list of numbers that can be added as personal outbound numbers for an agent.</p>
     * 
     * @param request ListPersonalNumbersOfUserRequest
     * @return ListPersonalNumbersOfUserResponse
     */
    public ListPersonalNumbersOfUserResponse listPersonalNumbersOfUser(ListPersonalNumbersOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonalNumbersOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListPhoneNumbers to obtain the phone number list under a specified instance.</p>
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
     * <p>You can invoke ListPhoneNumbers to obtain the phone number list under a specified instance.</p>
     * 
     * @param request ListPhoneNumbersRequest
     * @return ListPhoneNumbersResponse
     */
    public ListPhoneNumbersResponse listPhoneNumbers(ListPhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhoneNumbersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Note: If a phone number is already used as a personal outbound number, it will not appear in the list of numbers available for association with a skill group.</p>
     * 
     * <b>summary</b> : 
     * <p>You can invoke the ListPhoneNumbersOfSkillGroup API to obtain the list of phone numbers associated with a specified skill group under a specified instance. You can also use this API to query phone numbers that are not currently associated with the skill group but can be associated with it.</p>
     * 
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
     * <b>description</b> :
     * <p>Note: If a phone number is already used as a personal outbound number, it will not appear in the list of numbers available for association with a skill group.</p>
     * 
     * <b>summary</b> : 
     * <p>You can invoke the ListPhoneNumbersOfSkillGroup API to obtain the list of phone numbers associated with a specified skill group under a specified instance. You can also use this API to query phone numbers that are not currently associated with the skill group but can be associated with it.</p>
     * 
     * @param request ListPhoneNumbersOfSkillGroupRequest
     * @return ListPhoneNumbersOfSkillGroupResponse
     */
    public ListPhoneNumbersOfSkillGroupResponse listPhoneNumbersOfSkillGroup(ListPhoneNumbersOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhoneNumbersOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke ListPrivilegesOfUser to obtain the permissions owned by the current User.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke ListPrivilegesOfUser to obtain the permissions owned by the current User.</p>
     * 
     * @param request ListPrivilegesOfUserRequest
     * @return ListPrivilegesOfUserResponse
     */
    public ListPrivilegesOfUserResponse listPrivilegesOfUser(ListPrivilegesOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivilegesOfUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A Resource Access Management (RAM) user can be imported as an agent into multiple Cloud Contact Center (CCC) instances. However, an agent can be associated with only one RAM account. When you create an agent in a CCC instance, a corresponding RAM account is also created. To avoid creating redundant RAM accounts when you set up a new instance, you can call the ListRamUsers operation to list RAM users that have not been imported into the instance. You can then call the operation that imports RAM users to add them to the new instance. This prevents creating unnecessary RAM accounts and conserves resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists RAM users that have not been imported into a specified instance.</p>
     * 
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
     * <b>description</b> :
     * <p>A Resource Access Management (RAM) user can be imported as an agent into multiple Cloud Contact Center (CCC) instances. However, an agent can be associated with only one RAM account. When you create an agent in a CCC instance, a corresponding RAM account is also created. To avoid creating redundant RAM accounts when you set up a new instance, you can call the ListRamUsers operation to list RAM users that have not been imported into the instance. You can then call the operation that imports RAM users to add them to the new instance. This prevents creating unnecessary RAM accounts and conserves resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists RAM users that have not been imported into a specified instance.</p>
     * 
     * @param request ListRamUsersRequest
     * @return ListRamUsersResponse
     */
    public ListRamUsersResponse listRamUsers(ListRamUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRamUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListRealtimeAgentStates to obtain a real-time status data report for one or more specified agents in a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListRealtimeAgentStates to obtain a real-time status data report for one or more specified agents in a specified instance.</p>
     * 
     * @param request ListRealtimeAgentStatesRequest
     * @return ListRealtimeAgentStatesResponse
     */
    public ListRealtimeAgentStatesResponse listRealtimeAgentStates(ListRealtimeAgentStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRealtimeAgentStatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListRealtimeSkillGroupStates to obtain the real-time skill group status report for a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListRealtimeSkillGroupStates to obtain the real-time skill group status report for a specified instance.</p>
     * 
     * @param request ListRealtimeSkillGroupStatesRequest
     * @return ListRealtimeSkillGroupStatesResponse
     */
    public ListRealtimeSkillGroupStatesResponse listRealtimeSkillGroupStates(ListRealtimeSkillGroupStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRealtimeSkillGroupStatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListRecentCallDetailRecords to obtain the list of recent call detail records for agents mapped to the current Resource Access Management (RAM) user under the specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListRecentCallDetailRecords to obtain the list of recent call detail records for agents mapped to the current Resource Access Management (RAM) user under the specified instance.</p>
     * 
     * @param request ListRecentCallDetailRecordsRequest
     * @return ListRecentCallDetailRecordsResponse
     */
    public ListRecentCallDetailRecordsResponse listRecentCallDetailRecords(ListRecentCallDetailRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecentCallDetailRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListRoles to obtain all roles under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListRoles to obtain all roles under a specified instance.</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke the ListSkillgroupStates API to obtain the status list of specified skill groups under a specified instance. This API is only available to specific Users, and other Customers are not recommended to invoke it.</p>
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
     * <p>You can invoke the ListSkillgroupStates API to obtain the status list of specified skill groups under a specified instance. This API is only available to specific Users, and other Customers are not recommended to invoke it.</p>
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
     * <p>The <code>ListSkillgroupSummaryReportsSinceMidnight</code> operation retrieves historical summary reports, filtered by specified conditions, for skill groups in a specified instance. The report contains data from 00:00 (midnight) today to the time of the request. This operation is available to specific users only.</p>
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
     * <p>The <code>ListSkillgroupSummaryReportsSinceMidnight</code> operation retrieves historical summary reports, filtered by specified conditions, for skill groups in a specified instance. The report contains data from 00:00 (midnight) today to the time of the request. This operation is available to specific users only.</p>
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
     * <b>summary</b> : 
     * <p>You can invoke ListSkillGroups to obtain the list of skill groups under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ListSkillGroups to obtain the list of skill groups under a specified instance.</p>
     * 
     * @param request ListSkillGroupsRequest
     * @return ListSkillGroupsResponse
     */
    public ListSkillGroupsResponse listSkillGroups(ListSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can use this API to retrieve the list of skill levels for skill groups associated with a specified agent under a specified instance. You can also use this API to query the list of skill groups that the agent can be associated with but is not currently associated with.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can use this API to retrieve the list of skill levels for skill groups associated with a specified agent under a specified instance. You can also use this API to query the list of skill groups that the agent can be associated with but is not currently associated with.</p>
     * 
     * @param request ListSkillLevelsOfUserRequest
     * @return ListSkillLevelsOfUserResponse
     */
    public ListSkillLevelsOfUserResponse listSkillLevelsOfUser(ListSkillLevelsOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillLevelsOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of SMS configurations.</p>
     * 
     * @param request ListSmsMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSmsMetadataResponse
     */
    public ListSmsMetadataResponse listSmsMetadataWithOptions(ListSmsMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioListJson)) {
            query.put("ScenarioListJson", request.scenarioListJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSmsMetadata"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSmsMetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of SMS configurations.</p>
     * 
     * @param request ListSmsMetadataRequest
     * @return ListSmsMetadataResponse
     */
    public ListSmsMetadataResponse listSmsMetadata(ListSmsMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSmsMetadataWithOptions(request, runtime);
    }

    /**
     * @param request ListTicketTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTicketTasksResponse
     */
    public ListTicketTasksResponse listTicketTasksWithOptions(ListTicketTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTicketTasks"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTicketTasksResponse());
    }

    /**
     * @param request ListTicketTasksRequest
     * @return ListTicketTasksResponse
     */
    public ListTicketTasksResponse listTicketTasks(ListTicketTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTicketTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of ticket templates.</p>
     * 
     * @param request ListTicketTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTicketTemplatesResponse
     */
    public ListTicketTemplatesResponse listTicketTemplatesWithOptions(ListTicketTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTicketTemplates"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTicketTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of ticket templates.</p>
     * 
     * @param request ListTicketTemplatesRequest
     * @return ListTicketTemplatesResponse
     */
    public ListTicketTemplatesResponse listTicketTemplates(ListTicketTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTicketTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of tickets for an instance.</p>
     * 
     * @param request ListTicketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTicketsResponse
     */
    public ListTicketsResponse listTicketsWithOptions(ListTicketsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignee)) {
            query.put("Assignee", request.assignee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assigneeType)) {
            query.put("AssigneeType", request.assigneeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIdList)) {
            query.put("JobIdList", request.jobIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participant)) {
            query.put("Participant", request.participant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTickets"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTicketsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of tickets for an instance.</p>
     * 
     * @param request ListTicketsRequest
     * @return ListTicketsResponse
     */
    public ListTicketsResponse listTickets(ListTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTicketsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ListUnassignedNumbers to obtain the list of numbers under your Alibaba Cloud account that have not been assigned to an instance.</p>
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
     * <p>You can invoke ListUnassignedNumbers to obtain the list of numbers under your Alibaba Cloud account that have not been assigned to an instance.</p>
     * 
     * @param request ListUnassignedNumbersRequest
     * @return ListUnassignedNumbersResponse
     */
    public ListUnassignedNumbersResponse listUnassignedNumbers(ListUnassignedNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUnassignedNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke the ListUserLevelsOfSkillGroup API to retrieve the list of agent skill levels under a specified skill group in a given instance. You can also use this API to retrieve the list of agents who can be associated with but are not currently associated with the specified skill group.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke the ListUserLevelsOfSkillGroup API to retrieve the list of agent skill levels under a specified skill group in a given instance. You can also use this API to retrieve the list of agents who can be associated with but are not currently associated with the specified skill group.</p>
     * 
     * @param request ListUserLevelsOfSkillGroupRequest
     * @return ListUserLevelsOfSkillGroupResponse
     */
    public ListUserLevelsOfSkillGroupResponse listUserLevelsOfSkillGroup(ListUserLevelsOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserLevelsOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke ListUsers to obtain the agent list under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke ListUsers to obtain the agent list under a specified instance.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can use ListVisitorChatMessages to retrieve visitor chat records.</p>
     * 
     * @param request ListVisitorChatMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVisitorChatMessagesResponse
     */
    public ListVisitorChatMessagesResponse listVisitorChatMessagesWithOptions(ListVisitorChatMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelId)) {
            query.put("AccessChannelId", request.accessChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visitorId)) {
            query.put("VisitorId", request.visitorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVisitorChatMessages"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVisitorChatMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can use ListVisitorChatMessages to retrieve visitor chat records.</p>
     * 
     * @param request ListVisitorChatMessagesRequest
     * @return ListVisitorChatMessagesResponse
     */
    public ListVisitorChatMessagesResponse listVisitorChatMessages(ListVisitorChatMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVisitorChatMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the ListVoicemails operation to retrieve a list of voicemails for a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can call the ListVoicemails operation to retrieve a list of voicemails for a specified instance.</p>
     * 
     * @param request ListVoicemailsRequest
     * @return ListVoicemailsResponse
     */
    public ListVoicemailsResponse listVoicemails(ListVoicemailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVoicemailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ListWaitingChats operation allows agents to retrieve chats that are waiting in a queue to be assigned or claimed.</p>
     * 
     * @param request ListWaitingChatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWaitingChatsResponse
     */
    public ListWaitingChatsResponse listWaitingChatsWithOptions(ListWaitingChatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListWaitingChats"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWaitingChatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ListWaitingChats operation allows agents to retrieve chats that are waiting in a queue to be assigned or claimed.</p>
     * 
     * @param request ListWaitingChatsRequest
     * @return ListWaitingChatsResponse
     */
    public ListWaitingChatsResponse listWaitingChats(ListWaitingChatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWaitingChatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke MakeCall to initiate a call. The callee can be an internal agent or an external customer.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.flashSmsVariables)) {
            query.put("FlashSmsVariables", request.flashSmsVariables);
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
     * <b>summary</b> : 
     * <p>You can invoke MakeCall to initiate a call. The callee can be an internal agent or an external customer.</p>
     * 
     * @param request MakeCallRequest
     * @return MakeCallResponse
     */
    public MakeCallResponse makeCall(MakeCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.makeCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ModifyAudioFile to modify the audio file associated with a specified audio resource ID under a given instance. You can update the audio file name, display name, and the OSS key of the audio file.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ModifyAudioFile to modify the audio file associated with a specified audio resource ID under a given instance. You can update the audio file name, display name, and the OSS key of the audio file.</p>
     * 
     * @param request ModifyAudioFileRequest
     * @return ModifyAudioFileResponse
     */
    public ModifyAudioFileResponse modifyAudioFile(ModifyAudioFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAudioFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the calling numbers for a batch prediction outbound campaign.</p>
     * 
     * @param tmpReq ModifyCampaignNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCampaignNumbersResponse
     */
    public ModifyCampaignNumbersResponse modifyCampaignNumbersWithOptions(ModifyCampaignNumbersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyCampaignNumbersShrinkRequest request = new ModifyCampaignNumbersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numberList)) {
            request.numberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numberList, "NumberList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instGroupId)) {
            query.put("InstGroupId", request.instGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberListShrink)) {
            query.put("NumberList", request.numberListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCampaignNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCampaignNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the calling numbers for a batch prediction outbound campaign.</p>
     * 
     * @param request ModifyCampaignNumbersRequest
     * @return ModifyCampaignNumbersResponse
     */
    public ModifyCampaignNumbersResponse modifyCampaignNumbers(ModifyCampaignNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCampaignNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ModifyCustomCallTagging to modify the description and attached number tags of an inbound number mark for a specified number under a specified instance.</p>
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
     * <p>You can invoke ModifyCustomCallTagging to modify the description and attached number tags of an inbound number mark for a specified number under a specified instance.</p>
     * 
     * @param request ModifyCustomCallTaggingRequest
     * @return ModifyCustomCallTaggingResponse
     */
    public ModifyCustomCallTaggingResponse modifyCustomCallTagging(ModifyCustomCallTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomCallTaggingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ModifyInstance to modify a Cloud Contact Center instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ModifyInstance to modify a Cloud Contact Center instance.</p>
     * 
     * @param request ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ModifyPhoneNumber to modify the information of a specified phone number under a specified instance, primarily to update the number\&quot;s usage and the attached contact flow ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ModifyPhoneNumber to modify the information of a specified phone number under a specified instance, primarily to update the number\&quot;s usage and the attached contact flow ID.</p>
     * 
     * @param request ModifyPhoneNumberRequest
     * @return ModifyPhoneNumberResponse
     */
    public ModifyPhoneNumberResponse modifyPhoneNumber(ModifyPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ModifySkillGroup to modify the information of a skill group associated with a specified skill group ID under a specified instance, primarily updating the skill group\&quot;s display name and description.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ModifySkillGroup to modify the information of a skill group associated with a specified skill group ID under a specified instance, primarily updating the skill group\&quot;s display name and description.</p>
     * 
     * @param request ModifySkillGroupRequest
     * @return ModifySkillGroupResponse
     */
    public ModifySkillGroupResponse modifySkillGroup(ModifySkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the skill level of a specified agent in one or more skill groups under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Modify the skill level of a specified agent in one or more skill groups under a specified instance.</p>
     * 
     * @param request ModifySkillLevelsOfUserRequest
     * @return ModifySkillLevelsOfUserResponse
     */
    public ModifySkillLevelsOfUserResponse modifySkillLevelsOfUser(ModifySkillLevelsOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySkillLevelsOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ModifyUser to modify the information of a specified agent under a specified instance. You can modify the phone number, work mode, role, and agent ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ModifyUser to modify the information of a specified agent under a specified instance. You can modify the phone number, work mode, role, and agent ID.</p>
     * 
     * @param request ModifyUserRequest
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ModifyUserLevelsOfSkillGroup to modify the skill levels of one or more agents under a specified skill group in a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ModifyUserLevelsOfSkillGroup to modify the skill levels of one or more agents under a specified skill group in a specified instance.</p>
     * 
     * @param request ModifyUserLevelsOfSkillGroupRequest
     * @return ModifyUserLevelsOfSkillGroupResponse
     */
    public ModifyUserLevelsOfSkillGroupResponse modifyUserLevelsOfSkillGroup(ModifyUserLevelsOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserLevelsOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke MonitorCall to listen to a call associated with a specified call ID under a specified instance. The call must be in a state where both the agent and the customer are normally connected, and the agent initiating the listening must have permission to monitor the target agent.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke MonitorCall to listen to a call associated with a specified call ID under a specified instance. The call must be in a state where both the agent and the customer are normally connected, and the agent initiating the listening must have permission to monitor the target agent.</p>
     * 
     * @param request MonitorCallRequest
     * @return MonitorCallResponse
     */
    public MonitorCallResponse monitorCall(MonitorCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.monitorCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke MuteCall to mute the call associated with a specified call ID under a specified instance. This operation can only be invoked by an agent who is in a talking state, and the agent can only mute themselves. After the agent mutes themselves, the customer will no longer hear the agent\&quot;s voice.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke MuteCall to mute the call associated with a specified call ID under a specified instance. This operation can only be invoked by an agent who is in a talking state, and the agent can only mute themselves. After the agent mutes themselves, the customer will no longer hear the agent\&quot;s voice.</p>
     * 
     * @param request MuteCallRequest
     * @return MuteCallResponse
     */
    public MuteCallResponse muteCall(MuteCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.muteCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke PauseCampaign to pause the predictive outbound calling Activity corresponding to the specified ID under the specified instance.</p>
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
     * <p>Invoke PauseCampaign to pause the predictive outbound calling Activity corresponding to the specified ID under the specified instance.</p>
     * 
     * @param request PauseCampaignRequest
     * @return PauseCampaignResponse
     */
    public PauseCampaignResponse pauseCampaign(PauseCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke PickOutboundNumbers to select an appropriate caller number based on the provided callee number. The number selection logic is controlled by an Intelligent algorithm.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke PickOutboundNumbers to select an appropriate caller number based on the provided callee number. The number selection logic is controlled by an Intelligent algorithm.</p>
     * 
     * @param request PickOutboundNumbersRequest
     * @return PickOutboundNumbersResponse
     */
    public PickOutboundNumbersResponse pickOutboundNumbers(PickOutboundNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pickOutboundNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Polls the agent status of a specified agent under a specified instance. This operation is typically invoked by the frontend agent Workbench to synchronize agent status.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Polls the agent status of a specified agent under a specified instance. This operation is typically invoked by the frontend agent Workbench to synchronize agent status.</p>
     * 
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
     * @param request ProcessCustomIMCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProcessCustomIMCallbackResponse
     */
    public ProcessCustomIMCallbackResponse processCustomIMCallbackWithOptions(ProcessCustomIMCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelId)) {
            body.put("AccessChannelId", request.accessChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageContent)) {
            body.put("MessageContent", request.messageContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderAvatarMediaId)) {
            body.put("SenderAvatarMediaId", request.senderAvatarMediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            body.put("SenderId", request.senderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderName)) {
            body.put("SenderName", request.senderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessCustomIMCallback"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessCustomIMCallbackResponse());
    }

    /**
     * @param request ProcessCustomIMCallbackRequest
     * @return ProcessCustomIMCallbackResponse
     */
    public ProcessCustomIMCallbackResponse processCustomIMCallback(ProcessCustomIMCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.processCustomIMCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Publishes a contact flow.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Publishes a contact flow.</p>
     * 
     * @param request PublishContactFlowRequest
     * @return PublishContactFlowResponse
     */
    public PublishContactFlowResponse publishContactFlow(PublishContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ReadyForService to make a specified agent under a specified instance ready. After becoming ready, the agent enters the idle status.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ReadyForService to make a specified agent under a specified instance ready. After becoming ready, the agent enters the idle status.</p>
     * 
     * @param request ReadyForServiceRequest
     * @return ReadyForServiceResponse
     */
    public ReadyForServiceResponse readyForService(ReadyForServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readyForServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Redial the number in the desensitized call record</p>
     * 
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
     * <b>summary</b> : 
     * <p>Redial the number in the desensitized call record</p>
     * 
     * @param request RedialCallRequest
     * @return RedialCallResponse
     */
    public RedialCallResponse redialCall(RedialCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.redialCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers a Session Initiation Protocol (SIP) device with a specified agent in an instance. A SIP device can be a physical SIP phone or a softphone.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Registers a Session Initiation Protocol (SIP) device with a specified agent in an instance. A SIP device can be a physical SIP phone or a softphone.</p>
     * 
     * @param request RegisterDeviceRequest
     * @return RegisterDeviceResponse
     */
    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers one or more SIP devices to specified agents in an instance. A SIP device can be a SIP phone or a SIP softphone.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Registers one or more SIP devices to specified agents in an instance. A SIP device can be a SIP phone or a SIP softphone.</p>
     * 
     * @param request RegisterDevicesRequest
     * @return RegisterDevicesResponse
     */
    public RegisterDevicesResponse registerDevices(RegisterDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rejects a chat assigned to an agent.</p>
     * 
     * @param request RejectChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectChatResponse
     */
    public RejectChatResponse rejectChatWithOptions(RejectChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "RejectChat"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rejects a chat assigned to an agent.</p>
     * 
     * @param request RejectChatRequest
     * @return RejectChatResponse
     */
    public RejectChatResponse rejectChat(RejectChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use the RejectTicket operation to reject a ticket. The ticket creator can add information to a rejected ticket and then resubmit it.</p>
     * 
     * @param request RejectTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectTicketResponse
     */
    public RejectTicketResponse rejectTicketWithOptions(RejectTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectTicket"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use the RejectTicket operation to reject a ticket. The ticket creator can add information to a rejected ticket and then resubmit it.</p>
     * 
     * @param request RejectTicketRequest
     * @return RejectTicketResponse
     */
    public RejectTicketResponse rejectTicket(RejectTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke ReleaseCall to hang up the call associated with a specified call ID under a specified instance. The invoker must be an agent and currently in a call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke ReleaseCall to hang up the call associated with a specified call ID under a specified instance. The invoker must be an agent and currently in a call.</p>
     * 
     * @param request ReleaseCallRequest
     * @return ReleaseCallResponse
     */
    public ReleaseCallResponse releaseCall(ReleaseCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ReleaseChat operation ends the current chat.</p>
     * 
     * @param request ReleaseChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseChatResponse
     */
    public ReleaseChatResponse releaseChatWithOptions(ReleaseChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseChat"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ReleaseChat operation ends the current chat.</p>
     * 
     * @param request ReleaseChatRequest
     * @return ReleaseChatResponse
     */
    public ReleaseChatResponse releaseChat(ReleaseChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes the blacklist tag from a specified phone number.</p>
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
     * <p>Removes the blacklist tag from a specified phone number.</p>
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
     * <p>You can invoke RemoveDoNotCallNumbers to delete one or more Do Not Call number configuration items under a specified instance.</p>
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
     * <p>You can invoke RemoveDoNotCallNumbers to delete one or more Do Not Call number configuration items under a specified instance.</p>
     * 
     * @param request RemoveDoNotCallNumbersRequest
     * @return RemoveDoNotCallNumbersResponse
     */
    public RemoveDoNotCallNumbersResponse removeDoNotCallNumbers(RemoveDoNotCallNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDoNotCallNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke RemovePersonalNumbersFromUser to delete one or more personal outbound numbers associated with a specified agent under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke RemovePersonalNumbersFromUser to delete one or more personal outbound numbers associated with a specified agent under a specified instance.</p>
     * 
     * @param request RemovePersonalNumbersFromUserRequest
     * @return RemovePersonalNumbersFromUserResponse
     */
    public RemovePersonalNumbersFromUserResponse removePersonalNumbersFromUser(RemovePersonalNumbersFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePersonalNumbersFromUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke RemovePhoneNumberFromSkillGroups to delete the binding relationship between a specified phone number and one or more skill groups under a given instance. This operation removes only the association between the phone number and the skill groups, not the actual phone number itself.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke RemovePhoneNumberFromSkillGroups to delete the binding relationship between a specified phone number and one or more skill groups under a given instance. This operation removes only the association between the phone number and the skill groups, not the actual phone number itself.</p>
     * 
     * @param request RemovePhoneNumberFromSkillGroupsRequest
     * @return RemovePhoneNumberFromSkillGroupsResponse
     */
    public RemovePhoneNumberFromSkillGroupsResponse removePhoneNumberFromSkillGroups(RemovePhoneNumberFromSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePhoneNumberFromSkillGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes one or more numbers from an instance. This action disassociates the numbers from the instance but does not permanently delete them. It also disassociates all associated resources, such as skill groups, contact flows, and agents.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Removes one or more numbers from an instance. This action disassociates the numbers from the instance but does not permanently delete them. It also disassociates all associated resources, such as skill groups, contact flows, and agents.</p>
     * 
     * @param request RemovePhoneNumbersRequest
     * @return RemovePhoneNumbersResponse
     */
    public RemovePhoneNumbersResponse removePhoneNumbers(RemovePhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePhoneNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke RemovePhoneNumbersFromSkillGroup to delete the association between one or more phone numbers and a specified skill group under a given instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke RemovePhoneNumbersFromSkillGroup to delete the association between one or more phone numbers and a specified skill group under a given instance.</p>
     * 
     * @param request RemovePhoneNumbersFromSkillGroupRequest
     * @return RemovePhoneNumbersFromSkillGroupResponse
     */
    public RemovePhoneNumbersFromSkillGroupResponse removePhoneNumbersFromSkillGroup(RemovePhoneNumbersFromSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePhoneNumbersFromSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke RemoveSkillGroupsFromUser to delete the association between one or more skill groups and a specified agent under a specified instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke RemoveSkillGroupsFromUser to delete the association between one or more skill groups and a specified agent under a specified instance.</p>
     * 
     * @param request RemoveSkillGroupsFromUserRequest
     * @return RemoveSkillGroupsFromUserResponse
     */
    public RemoveSkillGroupsFromUserResponse removeSkillGroupsFromUser(RemoveSkillGroupsFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeSkillGroupsFromUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke RemoveUsers to delete one or more agents from a specified instance. This operation only detaches the RAM accounts from the instance and removes the agents mapped to those RAM accounts from the instance. It does not delete the RAM accounts themselves.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke RemoveUsers to delete one or more agents from a specified instance. This operation only detaches the RAM accounts from the instance and removes the agents mapped to those RAM accounts from the instance. It does not delete the RAM accounts themselves.</p>
     * 
     * @param request RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsers(RemoveUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke RemoveUsersFromSkillGroup to delete the association between one or more agents and a specified skill group under a specified instance. This operation only removes the association between the skill group and the agents and does not delete the agents themselves.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke RemoveUsersFromSkillGroup to delete the association between one or more agents and a specified skill group under a specified instance. This operation only removes the association between the skill group and the agents and does not delete the agents themselves.</p>
     * 
     * @param request RemoveUsersFromSkillGroupRequest
     * @return RemoveUsersFromSkillGroupResponse
     */
    public RemoveUsersFromSkillGroupResponse removeUsersFromSkillGroup(RemoveUsersFromSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersFromSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the state of a specific agent in a specific instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Resets the state of a specific agent in a specific instance.</p>
     * 
     * @param request ResetAgentStateRequest
     * @return ResetAgentStateResponse
     */
    public ResetAgentStateResponse resetAgentState(ResetAgentStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAgentStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke ResetUserPassword to reset the logon password of a specified agent under a specified instance. In practice, agents do not have logon passwords; this operation actually modifies the logon password of the RAM account associated with the agent. This is typically used in scenarios where a customer service representative forgets the logon password of their RAM account.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke ResetUserPassword to reset the logon password of a specified agent under a specified instance. In practice, agents do not have logon passwords; this operation actually modifies the logon password of the RAM account associated with the agent. This is typically used in scenarios where a customer service representative forgets the logon password of their RAM account.</p>
     * 
     * @param request ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restores call recordings for the specified instance.</p>
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
     * <p>Restores call recordings for the specified instance.</p>
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
     * <p>You can use the ResubmitTicket API to resubmit a rejected or returned ticket.</p>
     * 
     * @param request ResubmitTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResubmitTicketResponse
     */
    public ResubmitTicketResponse resubmitTicketWithOptions(ResubmitTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResubmitTicket"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResubmitTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can use the ResubmitTicket API to resubmit a rejected or returned ticket.</p>
     * 
     * @param request ResubmitTicketRequest
     * @return ResubmitTicketResponse
     */
    public ResubmitTicketResponse resubmitTicket(ResubmitTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resubmitTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke ResumeCampaign to recover the predictive outbound calling Activity corresponding to the specified ID under the specified instance.</p>
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
     * <p>Invoke ResumeCampaign to recover the predictive outbound calling Activity corresponding to the specified ID under the specified instance.</p>
     * 
     * @param request ResumeCampaignRequest
     * @return ResumeCampaignResponse
     */
    public ResumeCampaignResponse resumeCampaign(ResumeCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke RetrieveCall to retrieve a call associated with a specified call ID under a specified instance. The call must be on hold for the retrieve operation to be performed.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke RetrieveCall to retrieve a call associated with a specified call ID under a specified instance. The call must be on hold for the retrieve operation to be performed.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke SaveRTCStatsV2 to report Web Real-Time Communication (WebRTC) voice transmission statistics information from the agent side. This API is not relevant for regular customers.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke SaveRTCStatsV2 to report Web Real-Time Communication (WebRTC) voice transmission statistics information from the agent side. This API is not relevant for regular customers.</p>
     * 
     * @param request SaveRTCStatsV2Request
     * @return SaveRTCStatsV2Response
     */
    public SaveRTCStatsV2Response saveRTCStatsV2(SaveRTCStatsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveRTCStatsV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SaveTerminalLog API to report agent-side log information. Regular customers do not need to be concerned with this API.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the SaveTerminalLog API to report agent-side log information. Regular customers do not need to be concerned with this API.</p>
     * 
     * @param request SaveTerminalLogRequest
     * @return SaveTerminalLogResponse
     */
    public SaveTerminalLogResponse saveTerminalLog(SaveTerminalLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTerminalLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SaveWebRTCStats API to report Web Real-Time Communication (WebRTC) voice transmission statistics information from the agent side. Regular customers do not need to concern themselves with this API.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the SaveWebRTCStats API to report Web Real-Time Communication (WebRTC) voice transmission statistics information from the agent side. Regular customers do not need to concern themselves with this API.</p>
     * 
     * @param request SaveWebRTCStatsRequest
     * @return SaveWebRTCStatsResponse
     */
    public SaveWebRTCStatsResponse saveWebRTCStats(SaveWebRTCStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveWebRTCStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SaveWebRtcInfo API to report WebRTC call status information from the agent side, including call quality monitoring data, for backend statistics and monitoring. Customers do not need to concern themselves with this API.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the SaveWebRtcInfo API to report WebRTC call status information from the agent side, including call quality monitoring data, for backend statistics and monitoring. Customers do not need to concern themselves with this API.</p>
     * 
     * @param request SaveWebRtcInfoRequest
     * @return SaveWebRtcInfoResponse
     */
    public SaveWebRtcInfoResponse saveWebRtcInfo(SaveWebRtcInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveWebRtcInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke SendDtmfSignaling to send DTMF keypress information during a call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke SendDtmfSignaling to send DTMF keypress information during a call.</p>
     * 
     * @param request SendDtmfSignalingRequest
     * @return SendDtmfSignalingResponse
     */
    public SendDtmfSignalingResponse sendDtmfSignaling(SendDtmfSignalingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendDtmfSignalingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送消息</p>
     * 
     * @param request SendNotificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendNotificationResponse
     */
    public SendNotificationResponse sendNotificationWithOptions(SendNotificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageBody)) {
            query.put("MessageBody", request.messageBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationTarget)) {
            query.put("NotificationTarget", request.notificationTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationType)) {
            query.put("NotificationType", request.notificationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardingKey)) {
            query.put("ShardingKey", request.shardingKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendNotification"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendNotificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送消息</p>
     * 
     * @param request SendNotificationRequest
     * @return SendNotificationResponse
     */
    public SendNotificationResponse sendNotification(SendNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendNotificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke SignInGroup to sign an agent into a specified skill group under a specified instance, which is the operation for publishing the agent online.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke SignInGroup to sign an agent into a specified skill group under a specified instance, which is the operation for publishing the agent online.</p>
     * 
     * @param request SignInGroupRequest
     * @return SignInGroupResponse
     */
    public SignInGroupResponse signInGroup(SignInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signInGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call SignOutGroup to check out an agent from the skill group they are currently signed into, which is equivalent to performing an unpublish operation for the agent.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can call SignOutGroup to check out an agent from the skill group they are currently signed into, which is equivalent to performing an unpublish operation for the agent.</p>
     * 
     * @param request SignOutGroupRequest
     * @return SignOutGroupResponse
     */
    public SignOutGroupResponse signOutGroup(SignOutGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signOutGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A back-to-back call differs from a traditional two-party call in that the caller does not directly call the callee. Instead, a Back-to-Back Agent is used. The Back-to-Back Agent first calls the caller, and after the connection is established, it calls the callee and then joins both parties into a single conference. In this mode, because all message streams of each call pass through the Back-to-Back Agent, the service provider (SP) can offer value-added services such as call timing, call recording, and number masking.</p>
     * 
     * <b>summary</b> : 
     * <p>You can invoke StartBack2BackCall to initiate a back-to-back call.</p>
     * 
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
     * <b>description</b> :
     * <p>A back-to-back call differs from a traditional two-party call in that the caller does not directly call the callee. Instead, a Back-to-Back Agent is used. The Back-to-Back Agent first calls the caller, and after the connection is established, it calls the callee and then joins both parties into a single conference. In this mode, because all message streams of each call pass through the Back-to-Back Agent, the service provider (SP) can offer value-added services such as call timing, call recording, and number masking.</p>
     * 
     * <b>summary</b> : 
     * <p>You can invoke StartBack2BackCall to initiate a back-to-back call.</p>
     * 
     * @param request StartBack2BackCallRequest
     * @return StartBack2BackCallResponse
     */
    public StartBack2BackCallResponse startBack2BackCall(StartBack2BackCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startBack2BackCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a chat session.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Starts a chat session.</p>
     * 
     * @param request StartChatRequest
     * @return StartChatResponse
     */
    public StartChatResponse startChat(StartChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke StartConference to initiate a conference.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke StartConference to initiate a conference.</p>
     * 
     * @param request StartConferenceRequest
     * @return StartConferenceResponse
     */
    public StartConferenceResponse startConference(StartConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Start editing a contact flow and generate a draft version.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Start editing a contact flow and generate a draft version.</p>
     * 
     * @param request StartEditContactFlowRequest
     * @return StartEditContactFlowResponse
     */
    public StartEditContactFlowResponse startEditContactFlow(StartEditContactFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEditContactFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In addition to supporting agents initiating outbound calls from the agent Workbench, Cloud Call Center also enables your Operational System backend to initiate outbound calls and transfer the call to an agent after it is answered. This allows you to seamlessly embed Cloud Call Center features into your Business Process.
     * For example, your Customer can enter their phone number on your WeChat Official Account and click a button to inquire about a product. Your backend system then invokes this API to call the Customer’s Phone. After the call is connected, the system plays back the message: “We have received your inquiry about our product via the Official Account. We are now connecting you to an advisor. Please wait.” The call is then transferred to an appropriate agent.
     * Compared with the DialEX API in version 1.0, this API offers greater flexibility in configuration. In addition to customizing the IVR for transfer-in, you can also pass custom parameters, which can be played back by voice within the IVR to support notification scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke StartPredictiveCall to initiate predictive outbound calling.</p>
     * 
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
     * <b>description</b> :
     * <p>In addition to supporting agents initiating outbound calls from the agent Workbench, Cloud Call Center also enables your Operational System backend to initiate outbound calls and transfer the call to an agent after it is answered. This allows you to seamlessly embed Cloud Call Center features into your Business Process.
     * For example, your Customer can enter their phone number on your WeChat Official Account and click a button to inquire about a product. Your backend system then invokes this API to call the Customer’s Phone. After the call is connected, the system plays back the message: “We have received your inquiry about our product via the Official Account. We are now connecting you to an advisor. Please wait.” The call is then transferred to an appropriate agent.
     * Compared with the DialEX API in version 1.0, this API offers greater flexibility in configuration. In addition to customizing the IVR for transfer-in, you can also pass custom parameters, which can be played back by voice within the IVR to support notification scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke StartPredictiveCall to initiate predictive outbound calling.</p>
     * 
     * @param request StartPredictiveCallRequest
     * @return StartPredictiveCallResponse
     */
    public StartPredictiveCallResponse startPredictiveCall(StartPredictiveCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startPredictiveCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a privacy call.</p>
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
     * <p>Starts a privacy call.</p>
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
     * <p>Invoke SubmitCampaign to start the predictive outbound calling activity corresponding to the specified ID under the specified instance.</p>
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
     * <p>Invoke SubmitCampaign to start the predictive outbound calling activity corresponding to the specified ID under the specified instance.</p>
     * 
     * @param request SubmitCampaignRequest
     * @return SubmitCampaignResponse
     */
    public SubmitCampaignResponse submitCampaign(SubmitCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke SwitchToConference to switch the status of a specified call under a specified instance to a three-party conference. This is typically used in scenarios where a consultation is converted into a conference.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke SwitchToConference to switch the status of a specified call under a specified instance to a three-party conference. This is typically used in scenarios where a consultation is converted into a conference.</p>
     * 
     * @param request SwitchToConferenceRequest
     * @return SwitchToConferenceResponse
     */
    public SwitchToConferenceResponse switchToConference(SwitchToConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchToConferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke TakeBreak to set a specified agent in a specified instance to the break state.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can invoke TakeBreak to set a specified agent in a specified instance to the break state.</p>
     * 
     * @param request TakeBreakRequest
     * @return TakeBreakResponse
     */
    public TakeBreakResponse takeBreak(TakeBreakRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.takeBreakWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Closes a ticket.</p>
     * 
     * @param request TerminateTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateTicketResponse
     */
    public TerminateTicketResponse terminateTicketWithOptions(TerminateTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateTicket"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Closes a ticket.</p>
     * 
     * @param request TerminateTicketRequest
     * @return TerminateTicketResponse
     */
    public TerminateTicketResponse terminateTicket(TerminateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call TransferTicketTask to transfer a ticket to another user.</p>
     * 
     * @param request TransferTicketTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferTicketTaskResponse
     */
    public TransferTicketTaskResponse transferTicketTaskWithOptions(TransferTicketTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignee)) {
            query.put("Assignee", request.assignee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferTicketTask"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferTicketTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call TransferTicketTask to transfer a ticket to another user.</p>
     * 
     * @param request TransferTicketTaskRequest
     * @return TransferTicketTaskResponse
     */
    public TransferTicketTaskResponse transferTicketTask(TransferTicketTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferTicketTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_UserState_type]string</p>
     * 
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
     * <b>summary</b> : 
     * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_UserState_type]string</p>
     * 
     * @param request UnmuteCallRequest
     * @return UnmuteCallResponse
     */
    public UnmuteCallResponse unmuteCall(UnmuteCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unmuteCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke UnregisterDevice to delete the device registration record of a specified agent under a specified instance. After deletion, the SIP phone or SIP softphone associated with the agent becomes inactive.</p>
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
     * <p>You can invoke UnregisterDevice to delete the device registration record of a specified agent under a specified instance. After deletion, the SIP phone or SIP softphone associated with the agent becomes inactive.</p>
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
     * <p>Updates a call summary.</p>
     * 
     * @param request UpdateCallSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCallSummaryResponse
     */
    public UpdateCallSummaryResponse updateCallSummaryWithOptions(UpdateCallSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("Context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCallSummary"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCallSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a call summary.</p>
     * 
     * @param request UpdateCallSummaryRequest
     * @return UpdateCallSummaryResponse
     */
    public UpdateCallSummaryResponse updateCallSummary(UpdateCallSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCallSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates outbound campaign parameters.</p>
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
     * <p>Updates outbound campaign parameters.</p>
     * 
     * @param request UpdateCampaignRequest
     * @return UpdateCampaignResponse
     */
    public UpdateCampaignResponse updateCampaign(UpdateCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can use UpdateChatRoutingProfile to configure session transfers.</p>
     * 
     * @param request UpdateChatRoutingProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChatRoutingProfileResponse
     */
    public UpdateChatRoutingProfileResponse updateChatRoutingProfileWithOptions(UpdateChatRoutingProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingProfiles)) {
            query.put("RoutingProfiles", request.routingProfiles);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChatRoutingProfile"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChatRoutingProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can use UpdateChatRoutingProfile to configure session transfers.</p>
     * 
     * @param request UpdateChatRoutingProfileRequest
     * @return UpdateChatRoutingProfileResponse
     */
    public UpdateChatRoutingProfileResponse updateChatRoutingProfile(UpdateChatRoutingProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateChatRoutingProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use the UpdateConfigItems operation to add or modify configuration items for an instance, such as hiding the caller ID for inbound calls or allowing agents to hang up.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Use the UpdateConfigItems operation to add or modify configuration items for an instance, such as hiding the caller ID for inbound calls or allowing agents to hang up.</p>
     * 
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

    /**
     * <b>summary</b> : 
     * <p>Use the UpdateSubscription operation to configure message subscriptions.</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscriptionWithOptions(UpdateSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPoint)) {
            query.put("AccessPoint", request.accessPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultTopic)) {
            query.put("DefaultTopic", request.defaultTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSubscriptionsJson)) {
            query.put("EventSubscriptionsJson", request.eventSubscriptionsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqInstanceId)) {
            query.put("MqInstanceId", request.mqInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqType)) {
            query.put("MqType", request.mqType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.producerId)) {
            query.put("ProducerId", request.producerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscription"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use the UpdateSubscription operation to configure message subscriptions.</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateTicket updates the content of a ticket.</p>
     * 
     * @param request UpdateTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTicketResponse
     */
    public UpdateTicketResponse updateTicketWithOptions(UpdateTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("Context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTicket"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateTicket updates the content of a ticket.</p>
     * 
     * @param request UpdateTicketRequest
     * @return UpdateTicketResponse
     */
    public UpdateTicketResponse updateTicket(UpdateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can use WithdrawTicket to withdraw a ticket.</p>
     * 
     * @param request WithdrawTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WithdrawTicketResponse
     */
    public WithdrawTicketResponse withdrawTicketWithOptions(WithdrawTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WithdrawTicket"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WithdrawTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can use WithdrawTicket to withdraw a ticket.</p>
     * 
     * @param request WithdrawTicketRequest
     * @return WithdrawTicketResponse
     */
    public WithdrawTicketResponse withdrawTicket(WithdrawTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.withdrawTicketWithOptions(request, runtime);
    }
}

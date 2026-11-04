// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705;

import com.aliyun.tea.*;
import com.aliyun.ccc20170705.models.*;

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
     * <p>添加坐席的设备信息</p>
     * 
     * @param request AddAgentDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAgentDeviceResponse
     */
    public AddAgentDeviceResponse addAgentDeviceWithOptions(AddAgentDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPort)) {
            query.put("ClientPort", request.clientPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.browserVersion)) {
            body.put("BrowserVersion", request.browserVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAgentDevice"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAgentDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加坐席的设备信息</p>
     * 
     * @param request AddAgentDeviceRequest
     * @return AddAgentDeviceResponse
     */
    public AddAgentDeviceResponse addAgentDevice(AddAgentDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAgentDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AddBulkPhoneNumbers</p>
     * 
     * @param request AddBulkPhoneNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBulkPhoneNumbersResponse
     */
    public AddBulkPhoneNumbersResponse addBulkPhoneNumbersWithOptions(AddBulkPhoneNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBulkPhoneNumbers"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBulkPhoneNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AddBulkPhoneNumbers</p>
     * 
     * @param request AddBulkPhoneNumbersRequest
     * @return AddBulkPhoneNumbersResponse
     */
    public AddBulkPhoneNumbersResponse addBulkPhoneNumbers(AddBulkPhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBulkPhoneNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AddPhoneNumber</p>
     * 
     * @param request AddPhoneNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPhoneNumberResponse
     */
    public AddPhoneNumberResponse addPhoneNumberWithOptions(AddPhoneNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPhoneNumber"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPhoneNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AddPhoneNumber</p>
     * 
     * @param request AddPhoneNumberRequest
     * @return AddPhoneNumberResponse
     */
    public AddPhoneNumberResponse addPhoneNumber(AddPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AddPhoneTags</p>
     * 
     * @param request AddPhoneTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPhoneTagsResponse
     */
    public AddPhoneTagsResponse addPhoneTagsWithOptions(AddPhoneTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            query.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberList)) {
            query.put("PhoneNumberList", request.phoneNumberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNameCity)) {
            query.put("RegionNameCity", request.regionNameCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNameProvince)) {
            query.put("RegionNameProvince", request.regionNameProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTag)) {
            query.put("ServiceTag", request.serviceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sipTag)) {
            query.put("SipTag", request.sipTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPhoneTags"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPhoneTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AddPhoneTags</p>
     * 
     * @param request AddPhoneTagsRequest
     * @return AddPhoneTagsResponse
     */
    public AddPhoneTagsResponse addPhoneTags(AddPhoneTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPhoneTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>把目录服务中的一组用户添加到一个呼叫中心实例中。添加完成后，需要为每一个用户分配一个分机号码</p>
     * 
     * @param request AssignUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignUsersResponse
     */
    public AssignUsersResponse assignUsersWithOptions(AssignUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevel)) {
            query.put("SkillLevel", request.skillLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userRamId)) {
            query.put("UserRamId", request.userRamId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignUsers"),
            new TeaPair("version", "2017-07-05"),
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
     * <b>summary</b> : 
     * <p>把目录服务中的一组用户添加到一个呼叫中心实例中。添加完成后，需要为每一个用户分配一个分机号码</p>
     * 
     * @param request AssignUsersRequest
     * @return AssignUsersResponse
     */
    public AssignUsersResponse assignUsers(AssignUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CallOnlinePrivacyNumber</p>
     * 
     * @param request CallOnlinePrivacyNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CallOnlinePrivacyNumberResponse
     */
    public CallOnlinePrivacyNumberResponse callOnlinePrivacyNumberWithOptions(CallOnlinePrivacyNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CallOnlinePrivacyNumber"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CallOnlinePrivacyNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CallOnlinePrivacyNumber</p>
     * 
     * @param request CallOnlinePrivacyNumberRequest
     * @return CallOnlinePrivacyNumberResponse
     */
    public CallOnlinePrivacyNumberResponse callOnlinePrivacyNumber(CallOnlinePrivacyNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.callOnlinePrivacyNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CheckNumberAvaliable</p>
     * 
     * @param request CheckNumberAvaliableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckNumberAvaliableResponse
     */
    public CheckNumberAvaliableResponse checkNumberAvaliableWithOptions(CheckNumberAvaliableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "CheckNumberAvaliable"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckNumberAvaliableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CheckNumberAvaliable</p>
     * 
     * @param request CheckNumberAvaliableRequest
     * @return CheckNumberAvaliableResponse
     */
    public CheckNumberAvaliableResponse checkNumberAvaliable(CheckNumberAvaliableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkNumberAvaliableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CommitContactFlowVersionModification</p>
     * 
     * @param request CommitContactFlowVersionModificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommitContactFlowVersionModificationResponse
     */
    public CommitContactFlowVersionModificationResponse commitContactFlowVersionModificationWithOptions(CommitContactFlowVersionModificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowVersionId)) {
            query.put("ContactFlowVersionId", request.contactFlowVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canvas)) {
            body.put("Canvas", request.canvas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitContactFlowVersionModification"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitContactFlowVersionModificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CommitContactFlowVersionModification</p>
     * 
     * @param request CommitContactFlowVersionModificationRequest
     * @return CommitContactFlowVersionModificationResponse
     */
    public CommitContactFlowVersionModificationResponse commitContactFlowVersionModification(CommitContactFlowVersionModificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitContactFlowVersionModificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateContactFlow</p>
     * 
     * @param request CreateContactFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContactFlowResponse
     */
    public CreateContactFlowResponse createContactFlowWithOptions(CreateContactFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canvas)) {
            body.put("Canvas", request.canvas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContactFlow"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>CreateContactFlow</p>
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
     * <p>CreateFault</p>
     * 
     * @param request CreateFaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFaultResponse
     */
    public CreateFaultResponse createFaultWithOptions(CreateFaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentFilePath)) {
            query.put("AgentFilePath", request.agentFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentOssFileName)) {
            query.put("AgentOssFileName", request.agentOssFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserVersion)) {
            query.put("BrowserVersion", request.browserVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPort)) {
            query.put("ClientPort", request.clientPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectId)) {
            query.put("ConnectId", request.connectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customFilePath)) {
            query.put("CustomFilePath", request.customFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customOssFileName)) {
            query.put("CustomOssFileName", request.customOssFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microphoneEquipment)) {
            query.put("MicrophoneEquipment", request.microphoneEquipment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microphoneList)) {
            query.put("MicrophoneList", request.microphoneList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingSystemVersion)) {
            query.put("OperatingSystemVersion", request.operatingSystemVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIp)) {
            query.put("ServiceIp", request.serviceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePort)) {
            query.put("ServicePort", request.servicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speakerEquipment)) {
            query.put("SpeakerEquipment", request.speakerEquipment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speakerList)) {
            query.put("SpeakerList", request.speakerList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFault"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFaultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateFault</p>
     * 
     * @param request CreateFaultRequest
     * @return CreateFaultResponse
     */
    public CreateFaultResponse createFault(CreateFaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFaultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateInstance</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminRamId)) {
            query.put("AdminRamId", request.adminRamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            query.put("PhoneNumbers", request.phoneNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageMaxDays)) {
            query.put("StorageMaxDays", request.storageMaxDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageMaxSize)) {
            query.put("StorageMaxSize", request.storageMaxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userObject)) {
            query.put("UserObject", request.userObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>CreateInstance</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateMedia</p>
     * 
     * @param request CreateMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMediaResponse
     */
    public CreateMediaResponse createMediaWithOptions(CreateMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFileName)) {
            query.put("OssFileName", request.ossFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFilePath)) {
            query.put("OssFilePath", request.ossFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadResult)) {
            query.put("UploadResult", request.uploadResult);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMedia"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMediaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateMedia</p>
     * 
     * @param request CreateMediaRequest
     * @return CreateMediaResponse
     */
    public CreateMediaResponse createMedia(CreateMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateSkillGroup</p>
     * 
     * @param request CreateSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillGroupResponse
     */
    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowPrivateOutboundNumber)) {
            query.put("AllowPrivateOutboundNumber", request.allowPrivateOutboundNumber);
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

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPhoneNumberId)) {
            query.put("OutboundPhoneNumberId", request.outboundPhoneNumberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingStrategy)) {
            query.put("RoutingStrategy", request.routingStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevel)) {
            query.put("SkillLevel", request.skillLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillGroup"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>CreateSkillGroup</p>
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
     * <p>CreateUser</p>
     * 
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateOutboundNumberId)) {
            query.put("PrivateOutboundNumberId", request.privateOutboundNumberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevel)) {
            query.put("SkillLevel", request.skillLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2017-07-05"),
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
     * <b>summary</b> : 
     * <p>CreateUser</p>
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
     * <p>CreateVoiceAppraise</p>
     * 
     * @param request CreateVoiceAppraiseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVoiceAppraiseResponse
     */
    public CreateVoiceAppraiseResponse createVoiceAppraiseWithOptions(CreateVoiceAppraiseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowVersionId)) {
            query.put("ContactFlowVersionId", request.contactFlowVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAppraise)) {
            query.put("IsAppraise", request.isAppraise);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVoiceAppraise"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVoiceAppraiseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateVoiceAppraise</p>
     * 
     * @param request CreateVoiceAppraiseRequest
     * @return CreateVoiceAppraiseResponse
     */
    public CreateVoiceAppraiseResponse createVoiceAppraise(CreateVoiceAppraiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVoiceAppraiseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteInstance</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>DeleteInstance</p>
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
     * <p>DeleteMedia</p>
     * 
     * @param request DeleteMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMediaResponse
     */
    public DeleteMediaResponse deleteMediaWithOptions(DeleteMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMedia"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMediaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteMedia</p>
     * 
     * @param request DeleteMediaRequest
     * @return DeleteMediaResponse
     */
    public DeleteMediaResponse deleteMedia(DeleteMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeletePhoneTags</p>
     * 
     * @param request DeletePhoneTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePhoneTagsResponse
     */
    public DeletePhoneTagsResponse deletePhoneTagsWithOptions(DeletePhoneTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberList)) {
            query.put("PhoneNumberList", request.phoneNumberList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePhoneTags"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePhoneTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeletePhoneTags</p>
     * 
     * @param request DeletePhoneTagsRequest
     * @return DeletePhoneTagsResponse
     */
    public DeletePhoneTagsResponse deletePhoneTags(DeletePhoneTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePhoneTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteSkillGroup</p>
     * 
     * @param request DeleteSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillGroupResponse
     */
    public DeleteSkillGroupResponse deleteSkillGroupWithOptions(DeleteSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteSkillGroup"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>DeleteSkillGroup</p>
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
     * <p>DialEx</p>
     * 
     * @param request DialExRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DialExResponse
     */
    public DialExResponse dialExWithOptions(DialExRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answerMode)) {
            query.put("AnswerMode", request.answerMode);
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

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routPoint)) {
            query.put("RoutPoint", request.routPoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DialEx"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DialExResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DialEx</p>
     * 
     * @param request DialExRequest
     * @return DialExResponse
     */
    public DialExResponse dialEx(DialExRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dialExWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DisableTrunkProviders</p>
     * 
     * @param request DisableTrunkProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableTrunkProvidersResponse
     */
    public DisableTrunkProvidersResponse disableTrunkProvidersWithOptions(DisableTrunkProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            query.put("ProviderName", request.providerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableTrunkProviders"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableTrunkProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DisableTrunkProviders</p>
     * 
     * @param request DisableTrunkProvidersRequest
     * @return DisableTrunkProvidersResponse
     */
    public DisableTrunkProvidersResponse disableTrunkProviders(DisableTrunkProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableTrunkProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载MKV音频文件</p>
     * 
     * @param request DownloadAllTypeRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadAllTypeRecordingResponse
     */
    public DownloadAllTypeRecordingResponse downloadAllTypeRecordingWithOptions(DownloadAllTypeRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
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
            new TeaPair("action", "DownloadAllTypeRecording"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadAllTypeRecordingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载MKV音频文件</p>
     * 
     * @param request DownloadAllTypeRecordingRequest
     * @return DownloadAllTypeRecordingResponse
     */
    public DownloadAllTypeRecordingResponse downloadAllTypeRecording(DownloadAllTypeRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadAllTypeRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载录音文件</p>
     * 
     * @param request DownloadRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadRecordingResponse
     */
    public DownloadRecordingResponse downloadRecordingWithOptions(DownloadRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

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
            new TeaPair("action", "DownloadRecording"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadRecordingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载录音文件</p>
     * 
     * @param request DownloadRecordingRequest
     * @return DownloadRecordingResponse
     */
    public DownloadRecordingResponse downloadRecording(DownloadRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>FindUsers</p>
     * 
     * @param request FindUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindUsersResponse
     */
    public FindUsersResponse findUsersWithOptions(FindUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.criteria)) {
            query.put("Criteria", request.criteria);
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
            new TeaPair("action", "FindUsers"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>FindUsers</p>
     * 
     * @param request FindUsersRequest
     * @return FindUsersResponse
     */
    public FindUsersResponse findUsers(FindUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GenerateAgentStatisticReport</p>
     * 
     * @param request GenerateAgentStatisticReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateAgentStatisticReportResponse
     */
    public GenerateAgentStatisticReportResponse generateAgentStatisticReportWithOptions(GenerateAgentStatisticReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAgentStatisticReport"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAgentStatisticReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GenerateAgentStatisticReport</p>
     * 
     * @param request GenerateAgentStatisticReportRequest
     * @return GenerateAgentStatisticReportResponse
     */
    public GenerateAgentStatisticReportResponse generateAgentStatisticReport(GenerateAgentStatisticReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAgentStatisticReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetAgentData</p>
     * 
     * @param request GetAgentDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentDataResponse
     */
    public GetAgentDataResponse getAgentDataWithOptions(GetAgentDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDay)) {
            query.put("EndDay", request.endDay);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDay)) {
            query.put("StartDay", request.startDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentData"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetAgentData</p>
     * 
     * @param request GetAgentDataRequest
     * @return GetAgentDataResponse
     */
    public GetAgentDataResponse getAgentData(GetAgentDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetCallMeasureSummaryReport</p>
     * 
     * @param request GetCallMeasureSummaryReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCallMeasureSummaryReportResponse
     */
    public GetCallMeasureSummaryReportResponse getCallMeasureSummaryReportWithOptions(GetCallMeasureSummaryReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.day)) {
            query.put("Day", request.day);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalType)) {
            query.put("IntervalType", request.intervalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.month)) {
            query.put("Month", request.month);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            query.put("Year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallMeasureSummaryReport"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallMeasureSummaryReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetCallMeasureSummaryReport</p>
     * 
     * @param request GetCallMeasureSummaryReportRequest
     * @return GetCallMeasureSummaryReportResponse
     */
    public GetCallMeasureSummaryReportResponse getCallMeasureSummaryReport(GetCallMeasureSummaryReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallMeasureSummaryReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetConfig</p>
     * 
     * @param request GetConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConfigResponse
     */
    public GetConfigResponse getConfigWithOptions(GetConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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
            new TeaPair("action", "GetConfig"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetConfig</p>
     * 
     * @param request GetConfigRequest
     * @return GetConfigResponse
     */
    public GetConfigResponse getConfig(GetConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetConversationDetailByContactId</p>
     * 
     * @param request GetConversationDetailByContactIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConversationDetailByContactIdResponse
     */
    public GetConversationDetailByContactIdResponse getConversationDetailByContactIdWithOptions(GetConversationDetailByContactIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetConversationDetailByContactId"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConversationDetailByContactIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetConversationDetailByContactId</p>
     * 
     * @param request GetConversationDetailByContactIdRequest
     * @return GetConversationDetailByContactIdResponse
     */
    public GetConversationDetailByContactIdResponse getConversationDetailByContactId(GetConversationDetailByContactIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConversationDetailByContactIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetInstance</p>
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
            new TeaPair("version", "2017-07-05"),
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
     * <p>GetInstance</p>
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
     * <p>GetInstanceState</p>
     * 
     * @param request GetInstanceStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceStateResponse
     */
    public GetInstanceStateResponse getInstanceStateWithOptions(GetInstanceStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceState"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetInstanceState</p>
     * 
     * @param request GetInstanceStateRequest
     * @return GetInstanceStateResponse
     */
    public GetInstanceStateResponse getInstanceState(GetInstanceStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetInstanceSummaryReport</p>
     * 
     * @param request GetInstanceSummaryReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceSummaryReportResponse
     */
    public GetInstanceSummaryReportResponse getInstanceSummaryReportWithOptions(GetInstanceSummaryReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetInstanceSummaryReport"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSummaryReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetInstanceSummaryReport</p>
     * 
     * @param request GetInstanceSummaryReportRequest
     * @return GetInstanceSummaryReportResponse
     */
    public GetInstanceSummaryReportResponse getInstanceSummaryReport(GetInstanceSummaryReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceSummaryReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetInstanceSummaryReportByInterval</p>
     * 
     * @param request GetInstanceSummaryReportByIntervalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceSummaryReportByIntervalResponse
     */
    public GetInstanceSummaryReportByIntervalResponse getInstanceSummaryReportByIntervalWithOptions(GetInstanceSummaryReportByIntervalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetInstanceSummaryReportByInterval"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSummaryReportByIntervalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetInstanceSummaryReportByInterval</p>
     * 
     * @param request GetInstanceSummaryReportByIntervalRequest
     * @return GetInstanceSummaryReportByIntervalResponse
     */
    public GetInstanceSummaryReportByIntervalResponse getInstanceSummaryReportByInterval(GetInstanceSummaryReportByIntervalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceSummaryReportByIntervalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetInstanceSummaryReportSinceMidnight</p>
     * 
     * @param request GetInstanceSummaryReportSinceMidnightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceSummaryReportSinceMidnightResponse
     */
    public GetInstanceSummaryReportSinceMidnightResponse getInstanceSummaryReportSinceMidnightWithOptions(GetInstanceSummaryReportSinceMidnightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetInstanceSummaryReportSinceMidnight"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSummaryReportSinceMidnightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetInstanceSummaryReportSinceMidnight</p>
     * 
     * @param request GetInstanceSummaryReportSinceMidnightRequest
     * @return GetInstanceSummaryReportSinceMidnightResponse
     */
    public GetInstanceSummaryReportSinceMidnightResponse getInstanceSummaryReportSinceMidnight(GetInstanceSummaryReportSinceMidnightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceSummaryReportSinceMidnightWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetNumberRegionInfo</p>
     * 
     * @param request GetNumberRegionInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNumberRegionInfoResponse
     */
    public GetNumberRegionInfoResponse getNumberRegionInfoWithOptions(GetNumberRegionInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetNumberRegionInfo"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNumberRegionInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetNumberRegionInfo</p>
     * 
     * @param request GetNumberRegionInfoRequest
     * @return GetNumberRegionInfoResponse
     */
    public GetNumberRegionInfoResponse getNumberRegionInfo(GetNumberRegionInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNumberRegionInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetRecordOssUploadParam</p>
     * 
     * @param request GetRecordOssUploadParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecordOssUploadParamResponse
     */
    public GetRecordOssUploadParamResponse getRecordOssUploadParamWithOptions(GetRecordOssUploadParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetRecordOssUploadParam"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordOssUploadParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetRecordOssUploadParam</p>
     * 
     * @param request GetRecordOssUploadParamRequest
     * @return GetRecordOssUploadParamResponse
     */
    public GetRecordOssUploadParamResponse getRecordOssUploadParam(GetRecordOssUploadParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordOssUploadParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetRoutePoint</p>
     * 
     * @param request GetRoutePointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutePointResponse
     */
    public GetRoutePointResponse getRoutePointWithOptions(GetRoutePointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetRoutePoint"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutePointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetRoutePoint</p>
     * 
     * @param request GetRoutePointRequest
     * @return GetRoutePointResponse
     */
    public GetRoutePointResponse getRoutePoint(GetRoutePointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutePointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务号码，比如满意度调查分机号码（实际是满意度调查IVR的路由点，该路由点由ACC核心服务根据IVR的Project ID提供），或者是其他技能组号码。</p>
     * 
     * @param request GetServiceExtensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceExtensionsResponse
     */
    public GetServiceExtensionsResponse getServiceExtensionsWithOptions(GetServiceExtensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceExtensions"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceExtensionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务号码，比如满意度调查分机号码（实际是满意度调查IVR的路由点，该路由点由ACC核心服务根据IVR的Project ID提供），或者是其他技能组号码。</p>
     * 
     * @param request GetServiceExtensionsRequest
     * @return GetServiceExtensionsResponse
     */
    public GetServiceExtensionsResponse getServiceExtensions(GetServiceExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceExtensionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetSmsConfig</p>
     * 
     * @param request GetSmsConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmsConfigResponse
     */
    public GetSmsConfigResponse getSmsConfigWithOptions(GetSmsConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            query.put("Scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmsConfig"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmsConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetSmsConfig</p>
     * 
     * @param request GetSmsConfigRequest
     * @return GetSmsConfigResponse
     */
    public GetSmsConfigResponse getSmsConfig(GetSmsConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmsConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetTURNCredentials</p>
     * 
     * @param request GetTURNCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTURNCredentialsResponse
     */
    public GetTURNCredentialsResponse getTURNCredentialsWithOptions(GetTURNCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTURNCredentials"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTURNCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetTURNCredentials</p>
     * 
     * @param request GetTURNCredentialsRequest
     * @return GetTURNCredentialsResponse
     */
    public GetTURNCredentialsResponse getTURNCredentials(GetTURNCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTURNCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetTURNServerList</p>
     * 
     * @param request GetTURNServerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTURNServerListResponse
     */
    public GetTURNServerListResponse getTURNServerListWithOptions(GetTURNServerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTURNServerList"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTURNServerListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetTURNServerList</p>
     * 
     * @param request GetTURNServerListRequest
     * @return GetTURNServerListResponse
     */
    public GetTURNServerListResponse getTURNServerList(GetTURNServerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTURNServerListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetUser</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>GetUser</p>
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
     * <p>GetUserByExtension</p>
     * 
     * @param request GetUserByExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserByExtensionResponse
     */
    public GetUserByExtensionResponse getUserByExtensionWithOptions(GetUserByExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            query.put("Extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserByExtension"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserByExtensionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetUserByExtension</p>
     * 
     * @param request GetUserByExtensionRequest
     * @return GetUserByExtensionResponse
     */
    public GetUserByExtensionResponse getUserByExtension(GetUserByExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserByExtensionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>LaunchAppraise</p>
     * 
     * @param request LaunchAppraiseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LaunchAppraiseResponse
     */
    public LaunchAppraiseResponse launchAppraiseWithOptions(LaunchAppraiseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acid)) {
            query.put("Acid", request.acid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LaunchAppraise"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LaunchAppraiseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>LaunchAppraise</p>
     * 
     * @param request LaunchAppraiseRequest
     * @return LaunchAppraiseResponse
     */
    public LaunchAppraiseResponse launchAppraise(LaunchAppraiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchAppraiseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>LaunchShortMessageAppraise</p>
     * 
     * @param request LaunchShortMessageAppraiseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LaunchShortMessageAppraiseResponse
     */
    public LaunchShortMessageAppraiseResponse launchShortMessageAppraiseWithOptions(LaunchShortMessageAppraiseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acid)) {
            query.put("Acid", request.acid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            query.put("PhoneNumbers", request.phoneNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LaunchShortMessageAppraise"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LaunchShortMessageAppraiseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>LaunchShortMessageAppraise</p>
     * 
     * @param request LaunchShortMessageAppraiseRequest
     * @return LaunchShortMessageAppraiseResponse
     */
    public LaunchShortMessageAppraiseResponse launchShortMessageAppraise(LaunchShortMessageAppraiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchShortMessageAppraiseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentDevices</p>
     * 
     * @param request ListAgentDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentDevicesResponse
     */
    public ListAgentDevicesResponse listAgentDevicesWithOptions(ListAgentDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramIds)) {
            query.put("RamIds", request.ramIds);
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
            new TeaPair("action", "ListAgentDevices"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentDevices</p>
     * 
     * @param request ListAgentDevicesRequest
     * @return ListAgentDevicesResponse
     */
    public ListAgentDevicesResponse listAgentDevices(ListAgentDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取坐席的事件信息</p>
     * 
     * @param request ListAgentEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentEventsResponse
     */
    public ListAgentEventsResponse listAgentEventsWithOptions(ListAgentEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.event)) {
            query.put("Event", request.event);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramId)) {
            query.put("RamId", request.ramId);
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
            new TeaPair("action", "ListAgentEvents"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取坐席的事件信息</p>
     * 
     * @param request ListAgentEventsRequest
     * @return ListAgentEventsResponse
     */
    public ListAgentEventsResponse listAgentEvents(ListAgentEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentStateLogs</p>
     * 
     * @param request ListAgentStateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentStateLogsResponse
     */
    public ListAgentStateLogsResponse listAgentStateLogsWithOptions(ListAgentStateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.ramId)) {
            query.put("RamId", request.ramId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentStateLogs"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ListAgentStateLogs</p>
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
     * <p>ListAgentStates</p>
     * 
     * @param request ListAgentStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentStatesResponse
     */
    public ListAgentStatesResponse listAgentStatesWithOptions(ListAgentStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIds)) {
            query.put("AgentIds", request.agentIds);
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
            new TeaPair("version", "2017-07-05"),
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
     * <p>ListAgentStates</p>
     * 
     * @param request ListAgentStatesRequest
     * @return ListAgentStatesResponse
     */
    public ListAgentStatesResponse listAgentStates(ListAgentStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentStatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentSummaryReports</p>
     * 
     * @param request ListAgentSummaryReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentSummaryReportsResponse
     */
    public ListAgentSummaryReportsResponse listAgentSummaryReportsWithOptions(ListAgentSummaryReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIds)) {
            query.put("AgentIds", request.agentIds);
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
            new TeaPair("action", "ListAgentSummaryReports"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentSummaryReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentSummaryReports</p>
     * 
     * @param request ListAgentSummaryReportsRequest
     * @return ListAgentSummaryReportsResponse
     */
    public ListAgentSummaryReportsResponse listAgentSummaryReports(ListAgentSummaryReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentSummaryReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentSummaryReportsByInterval</p>
     * 
     * @param request ListAgentSummaryReportsByIntervalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentSummaryReportsByIntervalResponse
     */
    public ListAgentSummaryReportsByIntervalResponse listAgentSummaryReportsByIntervalWithOptions(ListAgentSummaryReportsByIntervalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIds)) {
            query.put("AgentIds", request.agentIds);
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
            new TeaPair("action", "ListAgentSummaryReportsByInterval"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentSummaryReportsByIntervalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentSummaryReportsByInterval</p>
     * 
     * @param request ListAgentSummaryReportsByIntervalRequest
     * @return ListAgentSummaryReportsByIntervalResponse
     */
    public ListAgentSummaryReportsByIntervalResponse listAgentSummaryReportsByInterval(ListAgentSummaryReportsByIntervalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentSummaryReportsByIntervalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentSummaryReportsSinceMidnight</p>
     * 
     * @param request ListAgentSummaryReportsSinceMidnightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentSummaryReportsSinceMidnightResponse
     */
    public ListAgentSummaryReportsSinceMidnightResponse listAgentSummaryReportsSinceMidnightWithOptions(ListAgentSummaryReportsSinceMidnightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIds)) {
            query.put("AgentIds", request.agentIds);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentSummaryReportsSinceMidnight"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentSummaryReportsSinceMidnightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentSummaryReportsSinceMidnight</p>
     * 
     * @param request ListAgentSummaryReportsSinceMidnightRequest
     * @return ListAgentSummaryReportsSinceMidnightResponse
     */
    public ListAgentSummaryReportsSinceMidnightResponse listAgentSummaryReportsSinceMidnight(ListAgentSummaryReportsSinceMidnightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentSummaryReportsSinceMidnightWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取通话详单。</p>
     * 
     * @param request ListCallDetailRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallDetailRecordsResponse
     */
    public ListCallDetailRecordsResponse listCallDetailRecordsWithOptions(ListCallDetailRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactDisposition)) {
            query.put("ContactDisposition", request.contactDisposition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.criteria)) {
            query.put("Criteria", request.criteria);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("StopTime", request.stopTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withRecording)) {
            query.put("WithRecording", request.withRecording);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallDetailRecords"),
            new TeaPair("version", "2017-07-05"),
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
     * <b>summary</b> : 
     * <p>获取通话详单。</p>
     * 
     * @param request ListCallDetailRecordsRequest
     * @return ListCallDetailRecordsResponse
     */
    public ListCallDetailRecordsResponse listCallDetailRecords(ListCallDetailRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallDetailRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListCallEventDetailByContactId</p>
     * 
     * @param request ListCallEventDetailByContactIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallEventDetailByContactIdResponse
     */
    public ListCallEventDetailByContactIdResponse listCallEventDetailByContactIdWithOptions(ListCallEventDetailByContactIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListCallEventDetailByContactId"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallEventDetailByContactIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListCallEventDetailByContactId</p>
     * 
     * @param request ListCallEventDetailByContactIdRequest
     * @return ListCallEventDetailByContactIdResponse
     */
    public ListCallEventDetailByContactIdResponse listCallEventDetailByContactId(ListCallEventDetailByContactIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallEventDetailByContactIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListCallMeasureSummaryReports</p>
     * 
     * @param request ListCallMeasureSummaryReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallMeasureSummaryReportsResponse
     */
    public ListCallMeasureSummaryReportsResponse listCallMeasureSummaryReportsWithOptions(ListCallMeasureSummaryReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.intervalType)) {
            query.put("IntervalType", request.intervalType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallMeasureSummaryReports"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallMeasureSummaryReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListCallMeasureSummaryReports</p>
     * 
     * @param request ListCallMeasureSummaryReportsRequest
     * @return ListCallMeasureSummaryReportsResponse
     */
    public ListCallMeasureSummaryReportsResponse listCallMeasureSummaryReports(ListCallMeasureSummaryReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallMeasureSummaryReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListConfig</p>
     * 
     * @param request ListConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigResponse
     */
    public ListConfigResponse listConfigWithOptions(ListConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configItem)) {
            query.put("ConfigItem", request.configItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfig"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListConfig</p>
     * 
     * @param request ListConfigRequest
     * @return ListConfigResponse
     */
    public ListConfigResponse listConfig(ListConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListContactFlows</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContactFlows"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ListContactFlows</p>
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
     * <p>ListInstancesOfUser</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesOfUserResponse
     */
    public ListInstancesOfUserResponse listInstancesOfUserWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancesOfUser"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ListInstancesOfUser</p>
     * @return ListInstancesOfUserResponse
     */
    public ListInstancesOfUserResponse listInstancesOfUser() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesOfUserWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListIvrTrackingDetail</p>
     * 
     * @param request ListIvrTrackingDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIvrTrackingDetailResponse
     */
    public ListIvrTrackingDetailResponse listIvrTrackingDetailWithOptions(ListIvrTrackingDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

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
            new TeaPair("action", "ListIvrTrackingDetail"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIvrTrackingDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListIvrTrackingDetail</p>
     * 
     * @param request ListIvrTrackingDetailRequest
     * @return ListIvrTrackingDetailResponse
     */
    public ListIvrTrackingDetailResponse listIvrTrackingDetail(ListIvrTrackingDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIvrTrackingDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListMedias</p>
     * 
     * @param request ListMediasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMediasResponse
     */
    public ListMediasResponse listMediasWithOptions(ListMediasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePrefix)) {
            query.put("NamePrefix", request.namePrefix);
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
            new TeaPair("action", "ListMedias"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListMedias</p>
     * 
     * @param request ListMediasRequest
     * @return ListMediasResponse
     */
    public ListMediasResponse listMedias(ListMediasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMediasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListOutboundPhoneNumberOfUser</p>
     * 
     * @param request ListOutboundPhoneNumberOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOutboundPhoneNumberOfUserResponse
     */
    public ListOutboundPhoneNumberOfUserResponse listOutboundPhoneNumberOfUserWithOptions(ListOutboundPhoneNumberOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOutboundPhoneNumberOfUser"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOutboundPhoneNumberOfUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListOutboundPhoneNumberOfUser</p>
     * 
     * @param request ListOutboundPhoneNumberOfUserRequest
     * @return ListOutboundPhoneNumberOfUserResponse
     */
    public ListOutboundPhoneNumberOfUserResponse listOutboundPhoneNumberOfUser(ListOutboundPhoneNumberOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutboundPhoneNumberOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListPhoneNumbers</p>
     * 
     * @param request ListPhoneNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPhoneNumbersResponse
     */
    public ListPhoneNumbersResponse listPhoneNumbersWithOptions(ListPhoneNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundOnly)) {
            query.put("OutboundOnly", request.outboundOnly);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPhoneNumbers"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ListPhoneNumbers</p>
     * 
     * @param request ListPhoneNumbersRequest
     * @return ListPhoneNumbersResponse
     */
    public ListPhoneNumbersResponse listPhoneNumbers(ListPhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhoneNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListPhoneTags</p>
     * 
     * @param request ListPhoneTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPhoneTagsResponse
     */
    public ListPhoneTagsResponse listPhoneTagsWithOptions(ListPhoneTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberGroupIds)) {
            query.put("NumberGroupIds", request.numberGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundOnly)) {
            query.put("OutboundOnly", request.outboundOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPhoneTags"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPhoneTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListPhoneTags</p>
     * 
     * @param request ListPhoneTagsRequest
     * @return ListPhoneTagsResponse
     */
    public ListPhoneTagsResponse listPhoneTags(ListPhoneTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhoneTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListRealTimeAgent</p>
     * 
     * @param request ListRealTimeAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRealTimeAgentResponse
     */
    public ListRealTimeAgentResponse listRealTimeAgentWithOptions(ListRealTimeAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRealTimeAgent"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRealTimeAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListRealTimeAgent</p>
     * 
     * @param request ListRealTimeAgentRequest
     * @return ListRealTimeAgentResponse
     */
    public ListRealTimeAgentResponse listRealTimeAgent(ListRealTimeAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRealTimeAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListRecentCallRecords</p>
     * 
     * @param request ListRecentCallRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecentCallRecordsResponse
     */
    public ListRecentCallRecordsResponse listRecentCallRecordsWithOptions(ListRecentCallRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.criteria)) {
            query.put("Criteria", request.criteria);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("StopTime", request.stopTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecentCallRecords"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecentCallRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListRecentCallRecords</p>
     * 
     * @param request ListRecentCallRecordsRequest
     * @return ListRecentCallRecordsResponse
     */
    public ListRecentCallRecordsResponse listRecentCallRecords(ListRecentCallRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecentCallRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListRecordingOfDualTrack</p>
     * 
     * @param request ListRecordingOfDualTrackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecordingOfDualTrackResponse
     */
    public ListRecordingOfDualTrackResponse listRecordingOfDualTrackWithOptions(ListRecordingOfDualTrackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.connectId)) {
            query.put("ConnectId", request.connectId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("StopTime", request.stopTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecordingOfDualTrack"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecordingOfDualTrackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListRecordingOfDualTrack</p>
     * 
     * @param request ListRecordingOfDualTrackRequest
     * @return ListRecordingOfDualTrackResponse
     */
    public ListRecordingOfDualTrackResponse listRecordingOfDualTrack(ListRecordingOfDualTrackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecordingOfDualTrackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListRecordings</p>
     * 
     * @param request ListRecordingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecordingsResponse
     */
    public ListRecordingsResponse listRecordingsWithOptions(ListRecordingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.criteria)) {
            query.put("Criteria", request.criteria);
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
            new TeaPair("action", "ListRecordings"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecordingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListRecordings</p>
     * 
     * @param request ListRecordingsRequest
     * @return ListRecordingsResponse
     */
    public ListRecordingsResponse listRecordings(ListRecordingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecordingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListRecordingsByContactId</p>
     * 
     * @param request ListRecordingsByContactIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecordingsByContactIdResponse
     */
    public ListRecordingsByContactIdResponse listRecordingsByContactIdWithOptions(ListRecordingsByContactIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListRecordingsByContactId"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecordingsByContactIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListRecordingsByContactId</p>
     * 
     * @param request ListRecordingsByContactIdRequest
     * @return ListRecordingsByContactIdResponse
     */
    public ListRecordingsByContactIdResponse listRecordingsByContactId(ListRecordingsByContactIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecordingsByContactIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListRoles</p>
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
            new TeaPair("version", "2017-07-05"),
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
     * <p>ListRoles</p>
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
     * <p>ListSkillGroupStates</p>
     * 
     * @param request ListSkillGroupStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupStatesResponse
     */
    public ListSkillGroupStatesResponse listSkillGroupStatesWithOptions(ListSkillGroupStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIds)) {
            query.put("SkillGroupIds", request.skillGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroupStates"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupStatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupStates</p>
     * 
     * @param request ListSkillGroupStatesRequest
     * @return ListSkillGroupStatesResponse
     */
    public ListSkillGroupStatesResponse listSkillGroupStates(ListSkillGroupStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupStatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupSummaryReports</p>
     * 
     * @param request ListSkillGroupSummaryReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupSummaryReportsResponse
     */
    public ListSkillGroupSummaryReportsResponse listSkillGroupSummaryReportsWithOptions(ListSkillGroupSummaryReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIds)) {
            query.put("SkillGroupIds", request.skillGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroupSummaryReports"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupSummaryReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupSummaryReports</p>
     * 
     * @param request ListSkillGroupSummaryReportsRequest
     * @return ListSkillGroupSummaryReportsResponse
     */
    public ListSkillGroupSummaryReportsResponse listSkillGroupSummaryReports(ListSkillGroupSummaryReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupSummaryReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupSummaryReportsByInterval</p>
     * 
     * @param request ListSkillGroupSummaryReportsByIntervalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupSummaryReportsByIntervalResponse
     */
    public ListSkillGroupSummaryReportsByIntervalResponse listSkillGroupSummaryReportsByIntervalWithOptions(ListSkillGroupSummaryReportsByIntervalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIds)) {
            query.put("SkillGroupIds", request.skillGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroupSummaryReportsByInterval"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupSummaryReportsByIntervalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupSummaryReportsByInterval</p>
     * 
     * @param request ListSkillGroupSummaryReportsByIntervalRequest
     * @return ListSkillGroupSummaryReportsByIntervalResponse
     */
    public ListSkillGroupSummaryReportsByIntervalResponse listSkillGroupSummaryReportsByInterval(ListSkillGroupSummaryReportsByIntervalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupSummaryReportsByIntervalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupSummaryReportsByInterval</p>
     * 
     * @param request ListSkillGroupSummaryReportsSinceMidnightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupSummaryReportsSinceMidnightResponse
     */
    public ListSkillGroupSummaryReportsSinceMidnightResponse listSkillGroupSummaryReportsSinceMidnightWithOptions(ListSkillGroupSummaryReportsSinceMidnightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroups)) {
            query.put("SkillGroups", request.skillGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroupSummaryReportsSinceMidnight"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupSummaryReportsSinceMidnightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupSummaryReportsByInterval</p>
     * 
     * @param request ListSkillGroupSummaryReportsSinceMidnightRequest
     * @return ListSkillGroupSummaryReportsSinceMidnightResponse
     */
    public ListSkillGroupSummaryReportsSinceMidnightResponse listSkillGroupSummaryReportsSinceMidnight(ListSkillGroupSummaryReportsSinceMidnightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupSummaryReportsSinceMidnightWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroups</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            query.put("SkillGroupName", request.skillGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroups"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ListSkillGroups</p>
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
     * <p>ListSkillGroupsOfUser</p>
     * 
     * @param request ListSkillGroupsOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupsOfUserResponse
     */
    public ListSkillGroupsOfUserResponse listSkillGroupsOfUserWithOptions(ListSkillGroupsOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListSkillGroupsOfUser"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupsOfUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSkillGroupsOfUser</p>
     * 
     * @param request ListSkillGroupsOfUserRequest
     * @return ListSkillGroupsOfUserResponse
     */
    public ListSkillGroupsOfUserResponse listSkillGroupsOfUser(ListSkillGroupsOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupsOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListTransferableSkillGroups</p>
     * 
     * @param request ListTransferableSkillGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransferableSkillGroupsResponse
     */
    public ListTransferableSkillGroupsResponse listTransferableSkillGroupsWithOptions(ListTransferableSkillGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransferableSkillGroups"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransferableSkillGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListTransferableSkillGroups</p>
     * 
     * @param request ListTransferableSkillGroupsRequest
     * @return ListTransferableSkillGroupsResponse
     */
    public ListTransferableSkillGroupsResponse listTransferableSkillGroups(ListTransferableSkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransferableSkillGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListTrunkProviders</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrunkProvidersResponse
     */
    public ListTrunkProvidersResponse listTrunkProvidersWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrunkProviders"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrunkProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListTrunkProviders</p>
     * @return ListTrunkProvidersResponse
     */
    public ListTrunkProvidersResponse listTrunkProviders() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrunkProvidersWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListTrunksOfSkillGroup</p>
     * 
     * @param request ListTrunksOfSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrunksOfSkillGroupResponse
     */
    public ListTrunksOfSkillGroupResponse listTrunksOfSkillGroupWithOptions(ListTrunksOfSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListTrunksOfSkillGroup"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrunksOfSkillGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListTrunksOfSkillGroup</p>
     * 
     * @param request ListTrunksOfSkillGroupRequest
     * @return ListTrunksOfSkillGroupResponse
     */
    public ListTrunksOfSkillGroupResponse listTrunksOfSkillGroup(ListTrunksOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrunksOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListUsers</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ListUsers</p>
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
     * <p>ListUsersOfSkillGroup</p>
     * 
     * @param request ListUsersOfSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersOfSkillGroupResponse
     */
    public ListUsersOfSkillGroupResponse listUsersOfSkillGroupWithOptions(ListUsersOfSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersOfSkillGroup"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersOfSkillGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListUsersOfSkillGroup</p>
     * 
     * @param request ListUsersOfSkillGroupRequest
     * @return ListUsersOfSkillGroupResponse
     */
    public ListUsersOfSkillGroupResponse listUsersOfSkillGroup(ListUsersOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListVoiceAppraise</p>
     * 
     * @param request ListVoiceAppraiseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVoiceAppraiseResponse
     */
    public ListVoiceAppraiseResponse listVoiceAppraiseWithOptions(ListVoiceAppraiseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVoiceAppraise"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVoiceAppraiseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListVoiceAppraise</p>
     * 
     * @param request ListVoiceAppraiseRequest
     * @return ListVoiceAppraiseResponse
     */
    public ListVoiceAppraiseResponse listVoiceAppraise(ListVoiceAppraiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVoiceAppraiseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyAgentDevice</p>
     * 
     * @param request ModifyAgentDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAgentDeviceResponse
     */
    public ModifyAgentDeviceResponse modifyAgentDeviceWithOptions(ModifyAgentDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentDeviceId)) {
            query.put("AgentDeviceId", request.agentDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isLogin)) {
            query.put("IsLogin", request.isLogin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAgentDevice"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAgentDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyAgentDevice</p>
     * 
     * @param request ModifyAgentDeviceRequest
     * @return ModifyAgentDeviceResponse
     */
    public ModifyAgentDeviceResponse modifyAgentDevice(ModifyAgentDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAgentDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyPhoneNumber</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberId)) {
            query.put("PhoneNumberId", request.phoneNumberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("Usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPhoneNumber"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ModifyPhoneNumber</p>
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
     * <p>ModifyPhoneTags</p>
     * 
     * @param request ModifyPhoneTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPhoneTagsResponse
     */
    public ModifyPhoneTagsResponse modifyPhoneTagsWithOptions(ModifyPhoneTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTag)) {
            query.put("ServiceTag", request.serviceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPhoneTags"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPhoneTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyPhoneTags</p>
     * 
     * @param request ModifyPhoneTagsRequest
     * @return ModifyPhoneTagsResponse
     */
    public ModifyPhoneTagsResponse modifyPhoneTags(ModifyPhoneTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPhoneTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyPrimaryTrunksOfSkillGroup</p>
     * 
     * @param request ModifyPrimaryTrunksOfSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPrimaryTrunksOfSkillGroupResponse
     */
    public ModifyPrimaryTrunksOfSkillGroupResponse modifyPrimaryTrunksOfSkillGroupWithOptions(ModifyPrimaryTrunksOfSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryProviderName)) {
            query.put("PrimaryProviderName", request.primaryProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPrimaryTrunksOfSkillGroup"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrimaryTrunksOfSkillGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyPrimaryTrunksOfSkillGroup</p>
     * 
     * @param request ModifyPrimaryTrunksOfSkillGroupRequest
     * @return ModifyPrimaryTrunksOfSkillGroupResponse
     */
    public ModifyPrimaryTrunksOfSkillGroupResponse modifyPrimaryTrunksOfSkillGroup(ModifyPrimaryTrunksOfSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrimaryTrunksOfSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyPrivacyNumberCallDetail</p>
     * 
     * @param request ModifyPrivacyNumberCallDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPrivacyNumberCallDetailResponse
     */
    public ModifyPrivacyNumberCallDetailResponse modifyPrivacyNumberCallDetailWithOptions(ModifyPrivacyNumberCallDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
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
            new TeaPair("action", "ModifyPrivacyNumberCallDetail"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrivacyNumberCallDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyPrivacyNumberCallDetail</p>
     * 
     * @param request ModifyPrivacyNumberCallDetailRequest
     * @return ModifyPrivacyNumberCallDetailResponse
     */
    public ModifyPrivacyNumberCallDetailResponse modifyPrivacyNumberCallDetail(ModifyPrivacyNumberCallDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrivacyNumberCallDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifySkillGroup</p>
     * 
     * @param request ModifySkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySkillGroupResponse
     */
    public ModifySkillGroupResponse modifySkillGroupWithOptions(ModifySkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowPrivateOutboundNumber)) {
            query.put("AllowPrivateOutboundNumber", request.allowPrivateOutboundNumber);
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

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPhoneNumberId)) {
            query.put("OutboundPhoneNumberId", request.outboundPhoneNumberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingStrategy)) {
            query.put("RoutingStrategy", request.routingStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevel)) {
            query.put("SkillLevel", request.skillLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySkillGroup"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ModifySkillGroup</p>
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
     * <p>修改技能组基础信息,包括技能组名称、技能组描述、匹配模式、个人外呼号码标识等基础信息</p>
     * 
     * @param request ModifySkillGroupBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySkillGroupBasicInfoResponse
     */
    public ModifySkillGroupBasicInfoResponse modifySkillGroupBasicInfoWithOptions(ModifySkillGroupBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowPrivateOutboundNumber)) {
            query.put("AllowPrivateOutboundNumber", request.allowPrivateOutboundNumber);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routingStrategy)) {
            query.put("RoutingStrategy", request.routingStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySkillGroupBasicInfo"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySkillGroupBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改技能组基础信息,包括技能组名称、技能组描述、匹配模式、个人外呼号码标识等基础信息</p>
     * 
     * @param request ModifySkillGroupBasicInfoRequest
     * @return ModifySkillGroupBasicInfoResponse
     */
    public ModifySkillGroupBasicInfoResponse modifySkillGroupBasicInfo(ModifySkillGroupBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySkillGroupBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifySkillGroupOfUser</p>
     * 
     * @param request ModifySkillGroupOfUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySkillGroupOfUserResponse
     */
    public ModifySkillGroupOfUserResponse modifySkillGroupOfUserWithOptions(ModifySkillGroupOfUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevel)) {
            query.put("SkillLevel", request.skillLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySkillGroupOfUser"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySkillGroupOfUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifySkillGroupOfUser</p>
     * 
     * @param request ModifySkillGroupOfUserRequest
     * @return ModifySkillGroupOfUserResponse
     */
    public ModifySkillGroupOfUserResponse modifySkillGroupOfUser(ModifySkillGroupOfUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySkillGroupOfUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifySkillGroupOutboundNumbers</p>
     * 
     * @param request ModifySkillGroupOutboundNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySkillGroupOutboundNumbersResponse
     */
    public ModifySkillGroupOutboundNumbersResponse modifySkillGroupOutboundNumbersWithOptions(ModifySkillGroupOutboundNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPhoneNumberId)) {
            query.put("OutboundPhoneNumberId", request.outboundPhoneNumberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySkillGroupOutboundNumbers"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySkillGroupOutboundNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifySkillGroupOutboundNumbers</p>
     * 
     * @param request ModifySkillGroupOutboundNumbersRequest
     * @return ModifySkillGroupOutboundNumbersResponse
     */
    public ModifySkillGroupOutboundNumbersResponse modifySkillGroupOutboundNumbers(ModifySkillGroupOutboundNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySkillGroupOutboundNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyUser</p>
     * 
     * @param request ModifyUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateOutboundNumberId)) {
            query.put("PrivateOutboundNumberId", request.privateOutboundNumberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevel)) {
            query.put("SkillLevel", request.skillLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUser"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>ModifyUser</p>
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
     * <p>PickGlobalOutboundNumbers</p>
     * 
     * @param request PickGlobalOutboundNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PickGlobalOutboundNumbersResponse
     */
    public PickGlobalOutboundNumbersResponse pickGlobalOutboundNumbersWithOptions(PickGlobalOutboundNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calleeNumber)) {
            query.put("CalleeNumber", request.calleeNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVirtual)) {
            query.put("IsVirtual", request.isVirtual);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PickGlobalOutboundNumbers"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PickGlobalOutboundNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>PickGlobalOutboundNumbers</p>
     * 
     * @param request PickGlobalOutboundNumbersRequest
     * @return PickGlobalOutboundNumbersResponse
     */
    public PickGlobalOutboundNumbersResponse pickGlobalOutboundNumbers(PickGlobalOutboundNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pickGlobalOutboundNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>PickLocalNumber</p>
     * 
     * @param request PickLocalNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PickLocalNumberResponse
     */
    public PickLocalNumberResponse pickLocalNumberWithOptions(PickLocalNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calleeNumber)) {
            query.put("CalleeNumber", request.calleeNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.candidateNumber)) {
            query.put("CandidateNumber", request.candidateNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PickLocalNumber"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PickLocalNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>PickLocalNumber</p>
     * 
     * @param request PickLocalNumberRequest
     * @return PickLocalNumberResponse
     */
    public PickLocalNumberResponse pickLocalNumber(PickLocalNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pickLocalNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>PickOutboundNumbers</p>
     * 
     * @param request PickOutboundNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PickOutboundNumbersResponse
     */
    public PickOutboundNumbersResponse pickOutboundNumbersWithOptions(PickOutboundNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calleeNumber)) {
            query.put("CalleeNumber", request.calleeNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.candidateNumber)) {
            query.put("CandidateNumber", request.candidateNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PickOutboundNumbers"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>PickOutboundNumbers</p>
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
     * <p>PublishContactFlowVersion</p>
     * 
     * @param request PublishContactFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishContactFlowVersionResponse
     */
    public PublishContactFlowVersionResponse publishContactFlowVersionWithOptions(PublishContactFlowVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowVersionId)) {
            query.put("ContactFlowVersionId", request.contactFlowVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useTianGong)) {
            query.put("UseTianGong", request.useTianGong);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishContactFlowVersion"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishContactFlowVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>PublishContactFlowVersion</p>
     * 
     * @param request PublishContactFlowVersionRequest
     * @return PublishContactFlowVersionResponse
     */
    public PublishContactFlowVersionResponse publishContactFlowVersion(PublishContactFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishContactFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>RefreshToken</p>
     * 
     * @param request RefreshTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshTokenResponse
     */
    public RefreshTokenResponse refreshTokenWithOptions(RefreshTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshToken"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>RefreshToken</p>
     * 
     * @param request RefreshTokenRequest
     * @return RefreshTokenResponse
     */
    public RefreshTokenResponse refreshToken(RefreshTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除电话号码</p>
     * 
     * @param request RemovePhoneNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePhoneNumberResponse
     */
    public RemovePhoneNumberResponse removePhoneNumberWithOptions(RemovePhoneNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberId)) {
            query.put("PhoneNumberId", request.phoneNumberId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePhoneNumber"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePhoneNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除电话号码</p>
     * 
     * @param request RemovePhoneNumberRequest
     * @return RemovePhoneNumberResponse
     */
    public RemovePhoneNumberResponse removePhoneNumber(RemovePhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>RemoveUsers</p>
     * 
     * @param request RemoveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsersWithOptions(RemoveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "RemoveUsers"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>RemoveUsers</p>
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
     * <p>RemoveUsersFromSkillGroup</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUsersFromSkillGroup"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>RemoveUsersFromSkillGroup</p>
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
     * <p>RequestLoginInfo</p>
     * 
     * @param request RequestLoginInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequestLoginInfoResponse
     */
    public RequestLoginInfoResponse requestLoginInfoWithOptions(RequestLoginInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "RequestLoginInfo"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestLoginInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>RequestLoginInfo</p>
     * 
     * @param request RequestLoginInfoRequest
     * @return RequestLoginInfoResponse
     */
    public RequestLoginInfoResponse requestLoginInfo(RequestLoginInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestLoginInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ResetUserStatus</p>
     * 
     * @param request ResetUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserStatusResponse
     */
    public ResetUserStatusResponse resetUserStatusWithOptions(ResetUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ResetUserStatus"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ResetUserStatus</p>
     * 
     * @param request ResetUserStatusRequest
     * @return ResetUserStatusResponse
     */
    public ResetUserStatusResponse resetUserStatus(ResetUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SaveWebRTCStats</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.callStartTime)) {
            query.put("CallStartTime", request.callStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calleeNumber)) {
            query.put("CalleeNumber", request.calleeNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerNumber)) {
            query.put("CallerNumber", request.callerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordTime)) {
            query.put("RecordTime", request.recordTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stats)) {
            query.put("Stats", request.stats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveWebRTCStats"),
            new TeaPair("version", "2017-07-05"),
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
     * <p>SaveWebRTCStats</p>
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
     * <p>SendPredefinedShortMessage</p>
     * 
     * @param request SendPredefinedShortMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendPredefinedShortMessageResponse
     */
    public SendPredefinedShortMessageResponse sendPredefinedShortMessageWithOptions(SendPredefinedShortMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            query.put("PhoneNumbers", request.phoneNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParam)) {
            query.put("TemplateParam", request.templateParam);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendPredefinedShortMessage"),
            new TeaPair("version", "2017-07-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendPredefinedShortMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SendPredefinedShortMessage</p>
     * 
     * @param request SendPredefinedShortMessageRequest
     * @return SendPredefinedShortMessageResponse
     */
    public SendPredefinedShortMessageResponse sendPredefinedShortMessage(SendPredefinedShortMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendPredefinedShortMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发起双向呼叫</p>
     * 
     * @param request StartBack2BackCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartBack2BackCallResponse
     */
    public StartBack2BackCallResponse startBack2BackCallWithOptions(StartBack2BackCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callCenterNumber)) {
            query.put("CallCenterNumber", request.callCenterNumber);
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

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartBack2BackCall"),
            new TeaPair("version", "2017-07-05"),
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
     * <b>summary</b> : 
     * <p>发起双向呼叫</p>
     * 
     * @param request StartBack2BackCallRequest
     * @return StartBack2BackCallResponse
     */
    public StartBack2BackCallResponse startBack2BackCall(StartBack2BackCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startBack2BackCallWithOptions(request, runtime);
    }
}

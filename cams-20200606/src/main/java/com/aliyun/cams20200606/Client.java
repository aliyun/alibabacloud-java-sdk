// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606;

import com.aliyun.tea.*;
import com.aliyun.cams20200606.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cams", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddChatappPhoneNumberResponse addChatappPhoneNumberWithOptions(AddChatappPhoneNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cc)) {
            body.put("Cc", request.cc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preValidateId)) {
            body.put("PreValidateId", request.preValidateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifiedName)) {
            body.put("VerifiedName", request.verifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddChatappPhoneNumber"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddChatappPhoneNumberResponse());
    }

    public AddChatappPhoneNumberResponse addChatappPhoneNumber(AddChatappPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addChatappPhoneNumberWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param tmpReq BeeBotAssociateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BeeBotAssociateResponse
     */
    public BeeBotAssociateResponse beeBotAssociateWithOptions(BeeBotAssociateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BeeBotAssociateShrinkRequest request = new BeeBotAssociateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.perspective)) {
            request.perspectiveShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.perspective, "Perspective", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatBotInstanceId)) {
            body.put("ChatBotInstanceId", request.chatBotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            body.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveShrink)) {
            body.put("Perspective", request.perspectiveShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommendNum)) {
            body.put("RecommendNum", request.recommendNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            body.put("Utterance", request.utterance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BeeBotAssociate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BeeBotAssociateResponse());
    }

    /**
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request BeeBotAssociateRequest
      * @return BeeBotAssociateResponse
     */
    public BeeBotAssociateResponse beeBotAssociate(BeeBotAssociateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.beeBotAssociateWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param tmpReq BeeBotChatRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BeeBotChatResponse
     */
    public BeeBotChatResponse beeBotChatWithOptions(BeeBotChatRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BeeBotChatShrinkRequest request = new BeeBotChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.perspective)) {
            request.perspectiveShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.perspective, "Perspective", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vendorParam)) {
            request.vendorParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vendorParam, "VendorParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatBotInstanceId)) {
            body.put("ChatBotInstanceId", request.chatBotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentName)) {
            body.put("IntentName", request.intentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            body.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveShrink)) {
            body.put("Perspective", request.perspectiveShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            body.put("SenderId", request.senderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderNick)) {
            body.put("SenderNick", request.senderNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            body.put("Utterance", request.utterance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorParamShrink)) {
            body.put("VendorParam", request.vendorParamShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BeeBotChat"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BeeBotChatResponse());
    }

    /**
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request BeeBotChatRequest
      * @return BeeBotChatResponse
     */
    public BeeBotChatResponse beeBotChat(BeeBotChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.beeBotChatWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappBindWabaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ChatappBindWabaResponse
     */
    public ChatappBindWabaResponse chatappBindWabaWithOptions(ChatappBindWabaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            body.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappBindWaba"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappBindWabaResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappBindWabaRequest
      * @return ChatappBindWabaResponse
     */
    public ChatappBindWabaResponse chatappBindWaba(ChatappBindWabaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappBindWabaWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappEmbedSignUpRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ChatappEmbedSignUpResponse
     */
    public ChatappEmbedSignUpResponse chatappEmbedSignUpWithOptions(ChatappEmbedSignUpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputToken)) {
            body.put("InputToken", request.inputToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappEmbedSignUp"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappEmbedSignUpResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappEmbedSignUpRequest
      * @return ChatappEmbedSignUpResponse
     */
    public ChatappEmbedSignUpResponse chatappEmbedSignUp(ChatappEmbedSignUpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappEmbedSignUpWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappMigrationRegisterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ChatappMigrationRegisterResponse
     */
    public ChatappMigrationRegisterResponse chatappMigrationRegisterWithOptions(ChatappMigrationRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappMigrationRegister"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappMigrationRegisterResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappMigrationRegisterRequest
      * @return ChatappMigrationRegisterResponse
     */
    public ChatappMigrationRegisterResponse chatappMigrationRegister(ChatappMigrationRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappMigrationRegisterWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappMigrationVerifiedRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ChatappMigrationVerifiedResponse
     */
    public ChatappMigrationVerifiedResponse chatappMigrationVerifiedWithOptions(ChatappMigrationVerifiedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappMigrationVerified"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappMigrationVerifiedResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappMigrationVerifiedRequest
      * @return ChatappMigrationVerifiedResponse
     */
    public ChatappMigrationVerifiedResponse chatappMigrationVerified(ChatappMigrationVerifiedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappMigrationVerifiedWithOptions(request, runtime);
    }

    public ChatappPhoneNumberDeregisterResponse chatappPhoneNumberDeregisterWithOptions(ChatappPhoneNumberDeregisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappPhoneNumberDeregister"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappPhoneNumberDeregisterResponse());
    }

    public ChatappPhoneNumberDeregisterResponse chatappPhoneNumberDeregister(ChatappPhoneNumberDeregisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappPhoneNumberDeregisterWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappPhoneNumberRegisterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ChatappPhoneNumberRegisterResponse
     */
    public ChatappPhoneNumberRegisterResponse chatappPhoneNumberRegisterWithOptions(ChatappPhoneNumberRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappPhoneNumberRegister"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappPhoneNumberRegisterResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappPhoneNumberRegisterRequest
      * @return ChatappPhoneNumberRegisterResponse
     */
    public ChatappPhoneNumberRegisterResponse chatappPhoneNumberRegister(ChatappPhoneNumberRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappPhoneNumberRegisterWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappSyncPhoneNumberRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ChatappSyncPhoneNumberResponse
     */
    public ChatappSyncPhoneNumberResponse chatappSyncPhoneNumberWithOptions(ChatappSyncPhoneNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappSyncPhoneNumber"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappSyncPhoneNumberResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappSyncPhoneNumberRequest
      * @return ChatappSyncPhoneNumberResponse
     */
    public ChatappSyncPhoneNumberResponse chatappSyncPhoneNumber(ChatappSyncPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappSyncPhoneNumberWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappVerifyAndRegisterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ChatappVerifyAndRegisterResponse
     */
    public ChatappVerifyAndRegisterResponse chatappVerifyAndRegisterWithOptions(ChatappVerifyAndRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            body.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappVerifyAndRegister"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappVerifyAndRegisterResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ChatappVerifyAndRegisterRequest
      * @return ChatappVerifyAndRegisterResponse
     */
    public ChatappVerifyAndRegisterResponse chatappVerifyAndRegister(ChatappVerifyAndRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappVerifyAndRegisterWithOptions(request, runtime);
    }

    /**
      * The status of the phone number.
      *
      * @param request CreateChatappMigrationInitiateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateChatappMigrationInitiateResponse
     */
    public CreateChatappMigrationInitiateResponse createChatappMigrationInitiateWithOptions(CreateChatappMigrationInitiateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNumber)) {
            query.put("MobileNumber", request.mobileNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatappMigrationInitiate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatappMigrationInitiateResponse());
    }

    /**
      * The status of the phone number.
      *
      * @param request CreateChatappMigrationInitiateRequest
      * @return CreateChatappMigrationInitiateResponse
     */
    public CreateChatappMigrationInitiateResponse createChatappMigrationInitiate(CreateChatappMigrationInitiateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatappMigrationInitiateWithOptions(request, runtime);
    }

    /**
      * The error message.
      *
      * @param tmpReq CreateChatappTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateChatappTemplateResponse
     */
    public CreateChatappTemplateResponse createChatappTemplateWithOptions(CreateChatappTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateChatappTemplateShrinkRequest request = new CreateChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.example)) {
            request.exampleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.example, "Example", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowCategoryChange)) {
            body.put("AllowCategoryChange", request.allowCategoryChange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            body.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exampleShrink)) {
            body.put("Example", request.exampleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            body.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageSendTtlSeconds)) {
            body.put("MessageSendTtlSeconds", request.messageSendTtlSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatappTemplateResponse());
    }

    /**
      * The error message.
      *
      * @param request CreateChatappTemplateRequest
      * @return CreateChatappTemplateResponse
     */
    public CreateChatappTemplateResponse createChatappTemplate(CreateChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatappTemplateWithOptions(request, runtime);
    }

    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFlowShrinkRequest request = new CreateFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categories)) {
            request.categoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categories, "Categories", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoriesShrink)) {
            body.put("Categories", request.categoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowResponse());
    }

    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    public CreatePhoneMessageQrdlResponse createPhoneMessageQrdlWithOptions(CreatePhoneMessageQrdlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateQrImage)) {
            body.put("GenerateQrImage", request.generateQrImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefilledMessage)) {
            body.put("PrefilledMessage", request.prefilledMessage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePhoneMessageQrdl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePhoneMessageQrdlResponse());
    }

    public CreatePhoneMessageQrdlResponse createPhoneMessageQrdl(CreatePhoneMessageQrdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPhoneMessageQrdlWithOptions(request, runtime);
    }

    /**
      * ### QPS limit
      * You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request DeleteChatappTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteChatappTemplateResponse
     */
    public DeleteChatappTemplateResponse deleteChatappTemplateWithOptions(DeleteChatappTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatappTemplateResponse());
    }

    /**
      * ### QPS limit
      * You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request DeleteChatappTemplateRequest
      * @return DeleteChatappTemplateResponse
     */
    public DeleteChatappTemplateResponse deleteChatappTemplate(DeleteChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChatappTemplateWithOptions(request, runtime);
    }

    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowResponse());
    }

    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    public DeletePhoneMessageQrdlResponse deletePhoneMessageQrdlWithOptions(DeletePhoneMessageQrdlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qrdlCode)) {
            body.put("QrdlCode", request.qrdlCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePhoneMessageQrdl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePhoneMessageQrdlResponse());
    }

    public DeletePhoneMessageQrdlResponse deletePhoneMessageQrdl(DeletePhoneMessageQrdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePhoneMessageQrdlWithOptions(request, runtime);
    }

    public DeprecateFlowResponse deprecateFlowWithOptions(DeprecateFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeprecateFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeprecateFlowResponse());
    }

    public DeprecateFlowResponse deprecateFlow(DeprecateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deprecateFlowWithOptions(request, runtime);
    }

    public EnableWhatsappROIMetricResponse enableWhatsappROIMetricWithOptions(EnableWhatsappROIMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableWhatsappROIMetric"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableWhatsappROIMetricResponse());
    }

    public EnableWhatsappROIMetricResponse enableWhatsappROIMetric(EnableWhatsappROIMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableWhatsappROIMetricWithOptions(request, runtime);
    }

    public GetChatappPhoneNumberMetricResponse getChatappPhoneNumberMetricWithOptions(GetChatappPhoneNumberMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappPhoneNumberMetric"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappPhoneNumberMetricResponse());
    }

    public GetChatappPhoneNumberMetricResponse getChatappPhoneNumberMetric(GetChatappPhoneNumberMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappPhoneNumberMetricWithOptions(request, runtime);
    }

    /**
      * ### QPS limit
      * You can call this API operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetChatappTemplateDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetChatappTemplateDetailResponse
     */
    public GetChatappTemplateDetailResponse getChatappTemplateDetailWithOptions(GetChatappTemplateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappTemplateDetail"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappTemplateDetailResponse());
    }

    /**
      * ### QPS limit
      * You can call this API operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetChatappTemplateDetailRequest
      * @return GetChatappTemplateDetailResponse
     */
    public GetChatappTemplateDetailResponse getChatappTemplateDetail(GetChatappTemplateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappTemplateDetailWithOptions(request, runtime);
    }

    public GetChatappTemplateMetricResponse getChatappTemplateMetricWithOptions(GetChatappTemplateMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappTemplateMetric"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappTemplateMetricResponse());
    }

    public GetChatappTemplateMetricResponse getChatappTemplateMetric(GetChatappTemplateMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappTemplateMetricWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetChatappUploadAuthorizationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetChatappUploadAuthorizationResponse
     */
    public GetChatappUploadAuthorizationResponse getChatappUploadAuthorizationWithOptions(GetChatappUploadAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappUploadAuthorization"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappUploadAuthorizationResponse());
    }

    /**
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetChatappUploadAuthorizationRequest
      * @return GetChatappUploadAuthorizationResponse
     */
    public GetChatappUploadAuthorizationResponse getChatappUploadAuthorization(GetChatappUploadAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappUploadAuthorizationWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetChatappVerifyCodeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetChatappVerifyCodeResponse
     */
    public GetChatappVerifyCodeResponse getChatappVerifyCodeWithOptions(GetChatappVerifyCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            body.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappVerifyCode"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappVerifyCodeResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetChatappVerifyCodeRequest
      * @return GetChatappVerifyCodeResponse
     */
    public GetChatappVerifyCodeResponse getChatappVerifyCode(GetChatappVerifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappVerifyCodeWithOptions(request, runtime);
    }

    public GetCommerceSettingResponse getCommerceSettingWithOptions(GetCommerceSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCommerceSetting"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCommerceSettingResponse());
    }

    public GetCommerceSettingResponse getCommerceSetting(GetCommerceSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCommerceSettingWithOptions(request, runtime);
    }

    public GetFlowResponse getFlowWithOptions(GetFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowResponse());
    }

    public GetFlowResponse getFlow(GetFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowWithOptions(request, runtime);
    }

    public GetFlowJSONAssestResponse getFlowJSONAssestWithOptions(GetFlowJSONAssestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowJSONAssest"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowJSONAssestResponse());
    }

    public GetFlowJSONAssestResponse getFlowJSONAssest(GetFlowJSONAssestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowJSONAssestWithOptions(request, runtime);
    }

    public GetFlowPreviewUrlResponse getFlowPreviewUrlWithOptions(GetFlowPreviewUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowPreviewUrl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowPreviewUrlResponse());
    }

    public GetFlowPreviewUrlResponse getFlowPreviewUrl(GetFlowPreviewUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowPreviewUrlWithOptions(request, runtime);
    }

    /**
      * The ID of the phone number.
      *
      * @param request GetMigrationVerifyCodeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetMigrationVerifyCodeResponse
     */
    public GetMigrationVerifyCodeResponse getMigrationVerifyCodeWithOptions(GetMigrationVerifyCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMigrationVerifyCode"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMigrationVerifyCodeResponse());
    }

    /**
      * The ID of the phone number.
      *
      * @param request GetMigrationVerifyCodeRequest
      * @return GetMigrationVerifyCodeResponse
     */
    public GetMigrationVerifyCodeResponse getMigrationVerifyCode(GetMigrationVerifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMigrationVerifyCodeWithOptions(request, runtime);
    }

    public GetPermissionByCodeResponse getPermissionByCodeWithOptions(GetPermissionByCodeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPermissionByCodeShrinkRequest request = new GetPermissionByCodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.permissions)) {
            request.permissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.permissions, "Permissions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionsShrink)) {
            body.put("Permissions", request.permissionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPermissionByCode"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPermissionByCodeResponse());
    }

    public GetPermissionByCodeResponse getPermissionByCode(GetPermissionByCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermissionByCodeWithOptions(request, runtime);
    }

    public GetPhoneEncryptionPublicKeyResponse getPhoneEncryptionPublicKeyWithOptions(GetPhoneEncryptionPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhoneEncryptionPublicKey"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhoneEncryptionPublicKeyResponse());
    }

    public GetPhoneEncryptionPublicKeyResponse getPhoneEncryptionPublicKey(GetPhoneEncryptionPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhoneEncryptionPublicKeyWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetPhoneNumberVerificationStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetPhoneNumberVerificationStatusResponse
     */
    public GetPhoneNumberVerificationStatusResponse getPhoneNumberVerificationStatusWithOptions(GetPhoneNumberVerificationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhoneNumberVerificationStatus"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhoneNumberVerificationStatusResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetPhoneNumberVerificationStatusRequest
      * @return GetPhoneNumberVerificationStatusResponse
     */
    public GetPhoneNumberVerificationStatusResponse getPhoneNumberVerificationStatus(GetPhoneNumberVerificationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhoneNumberVerificationStatusWithOptions(request, runtime);
    }

    public GetPreValidatePhoneIdResponse getPreValidatePhoneIdWithOptions(GetPreValidatePhoneIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            body.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPreValidatePhoneId"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPreValidatePhoneIdResponse());
    }

    public GetPreValidatePhoneIdResponse getPreValidatePhoneId(GetPreValidatePhoneIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPreValidatePhoneIdWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetWhatsappConnectionCatalogRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetWhatsappConnectionCatalogResponse
     */
    public GetWhatsappConnectionCatalogResponse getWhatsappConnectionCatalogWithOptions(GetWhatsappConnectionCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWhatsappConnectionCatalog"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWhatsappConnectionCatalogResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request GetWhatsappConnectionCatalogRequest
      * @return GetWhatsappConnectionCatalogResponse
     */
    public GetWhatsappConnectionCatalogResponse getWhatsappConnectionCatalog(GetWhatsappConnectionCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWhatsappConnectionCatalogWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request IsvGetAppIdRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return IsvGetAppIdResponse
     */
    public IsvGetAppIdResponse isvGetAppIdWithOptions(IsvGetAppIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissions)) {
            body.put("Permissions", request.permissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsvGetAppId"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsvGetAppIdResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request IsvGetAppIdRequest
      * @return IsvGetAppIdResponse
     */
    public IsvGetAppIdResponse isvGetAppId(IsvGetAppIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.isvGetAppIdWithOptions(request, runtime);
    }

    /**
      * ### QPS limit
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param tmpReq ListChatappTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListChatappTemplateResponse
     */
    public ListChatappTemplateResponse listChatappTemplateWithOptions(ListChatappTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChatappTemplateShrinkRequest request = new ListChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatappTemplateResponse());
    }

    /**
      * ### QPS limit
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ListChatappTemplateRequest
      * @return ListChatappTemplateResponse
     */
    public ListChatappTemplateResponse listChatappTemplate(ListChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatappTemplateWithOptions(request, runtime);
    }

    public ListFlowResponse listFlowWithOptions(ListFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFlowShrinkRequest request = new ListFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            body.put("Page", request.pageShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowResponse());
    }

    public ListFlowResponse listFlow(ListFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowWithOptions(request, runtime);
    }

    public ListPhoneMessageQrdlResponse listPhoneMessageQrdlWithOptions(ListPhoneMessageQrdlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPhoneMessageQrdl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPhoneMessageQrdlResponse());
    }

    public ListPhoneMessageQrdlResponse listPhoneMessageQrdl(ListPhoneMessageQrdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhoneMessageQrdlWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ListProductRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListProductResponse
     */
    public ListProductResponse listProductWithOptions(ListProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.after)) {
            query.put("After", request.after);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.before)) {
            query.put("Before", request.before);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            query.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProduct"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ListProductRequest
      * @return ListProductResponse
     */
    public ListProductResponse listProduct(ListProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ListProductCatalogRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListProductCatalogResponse
     */
    public ListProductCatalogResponse listProductCatalogWithOptions(ListProductCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.after)) {
            query.put("After", request.after);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.before)) {
            query.put("Before", request.before);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            query.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductCatalog"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductCatalogResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request ListProductCatalogRequest
      * @return ListProductCatalogResponse
     */
    public ListProductCatalogResponse listProductCatalog(ListProductCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductCatalogWithOptions(request, runtime);
    }

    /**
      * The name of the message template.
      *
      * @param tmpReq ModifyChatappTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyChatappTemplateResponse
     */
    public ModifyChatappTemplateResponse modifyChatappTemplateWithOptions(ModifyChatappTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyChatappTemplateShrinkRequest request = new ModifyChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.example)) {
            request.exampleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.example, "Example", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            body.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exampleShrink)) {
            body.put("Example", request.exampleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            body.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageSendTtlSeconds)) {
            body.put("MessageSendTtlSeconds", request.messageSendTtlSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyChatappTemplateResponse());
    }

    /**
      * The name of the message template.
      *
      * @param request ModifyChatappTemplateRequest
      * @return ModifyChatappTemplateResponse
     */
    public ModifyChatappTemplateResponse modifyChatappTemplate(ModifyChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyChatappTemplateWithOptions(request, runtime);
    }

    public ModifyFlowResponse modifyFlowWithOptions(ModifyFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyFlowShrinkRequest request = new ModifyFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categories)) {
            request.categoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categories, "Categories", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoriesShrink)) {
            body.put("Categories", request.categoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowResponse());
    }

    public ModifyFlowResponse modifyFlow(ModifyFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFlowWithOptions(request, runtime);
    }

    /**
      * ModifyPhoneBusinessProfile
      *
      * @param tmpReq ModifyPhoneBusinessProfileRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyPhoneBusinessProfileResponse
     */
    public ModifyPhoneBusinessProfileResponse modifyPhoneBusinessProfileWithOptions(ModifyPhoneBusinessProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPhoneBusinessProfileShrinkRequest request = new ModifyPhoneBusinessProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.websites)) {
            request.websitesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.websites, "Websites", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profilePictureUrl)) {
            query.put("ProfilePictureUrl", request.profilePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vertical)) {
            query.put("Vertical", request.vertical);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websitesShrink)) {
            query.put("Websites", request.websitesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPhoneBusinessProfile"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPhoneBusinessProfileResponse());
    }

    /**
      * ModifyPhoneBusinessProfile
      *
      * @param request ModifyPhoneBusinessProfileRequest
      * @return ModifyPhoneBusinessProfileResponse
     */
    public ModifyPhoneBusinessProfileResponse modifyPhoneBusinessProfile(ModifyPhoneBusinessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPhoneBusinessProfileWithOptions(request, runtime);
    }

    public PublishFlowResponse publishFlowWithOptions(PublishFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishFlowResponse());
    }

    public PublishFlowResponse publishFlow(PublishFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishFlowWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request QueryChatappBindWabaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return QueryChatappBindWabaResponse
     */
    public QueryChatappBindWabaResponse queryChatappBindWabaWithOptions(QueryChatappBindWabaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChatappBindWaba"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChatappBindWabaResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request QueryChatappBindWabaRequest
      * @return QueryChatappBindWabaResponse
     */
    public QueryChatappBindWabaResponse queryChatappBindWaba(QueryChatappBindWabaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryChatappBindWabaWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request QueryChatappPhoneNumbersRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return QueryChatappPhoneNumbersResponse
     */
    public QueryChatappPhoneNumbersResponse queryChatappPhoneNumbersWithOptions(QueryChatappPhoneNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChatappPhoneNumbers"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChatappPhoneNumbersResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request QueryChatappPhoneNumbersRequest
      * @return QueryChatappPhoneNumbersResponse
     */
    public QueryChatappPhoneNumbersResponse queryChatappPhoneNumbers(QueryChatappPhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryChatappPhoneNumbersWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request QueryPhoneBusinessProfileRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return QueryPhoneBusinessProfileResponse
     */
    public QueryPhoneBusinessProfileResponse queryPhoneBusinessProfileWithOptions(QueryPhoneBusinessProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPhoneBusinessProfile"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPhoneBusinessProfileResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request QueryPhoneBusinessProfileRequest
      * @return QueryPhoneBusinessProfileResponse
     */
    public QueryPhoneBusinessProfileResponse queryPhoneBusinessProfile(QueryPhoneBusinessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPhoneBusinessProfileWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request QueryWabaBusinessInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return QueryWabaBusinessInfoResponse
     */
    public QueryWabaBusinessInfoResponse queryWabaBusinessInfoWithOptions(QueryWabaBusinessInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWabaBusinessInfo"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWabaBusinessInfoResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request QueryWabaBusinessInfoRequest
      * @return QueryWabaBusinessInfoResponse
     */
    public QueryWabaBusinessInfoResponse queryWabaBusinessInfo(QueryWabaBusinessInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWabaBusinessInfoWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      * You can send messages to up to 1,000 phone numbers in a single request.
      *
      * @param tmpReq SendChatappMassMessageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SendChatappMassMessageResponse
     */
    public SendChatappMassMessageResponse sendChatappMassMessageWithOptions(SendChatappMassMessageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendChatappMassMessageShrinkRequest request = new SendChatappMassMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.senderList)) {
            request.senderListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.senderList, "SenderList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackContent)) {
            body.put("FallBackContent", request.fallBackContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackDuration)) {
            body.put("FallBackDuration", request.fallBackDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackId)) {
            body.put("FallBackId", request.fallBackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackRule)) {
            body.put("FallBackRule", request.fallBackRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            body.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderListShrink)) {
            body.put("SenderList", request.senderListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendChatappMassMessage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendChatappMassMessageResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      * You can send messages to up to 1,000 phone numbers in a single request.
      *
      * @param request SendChatappMassMessageRequest
      * @return SendChatappMassMessageResponse
     */
    public SendChatappMassMessageResponse sendChatappMassMessage(SendChatappMassMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendChatappMassMessageWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param tmpReq SendChatappMessageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SendChatappMessageResponse
     */
    public SendChatappMessageResponse sendChatappMessageWithOptions(SendChatappMessageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendChatappMessageShrinkRequest request = new SendChatappMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.flowAction)) {
            request.flowActionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.flowAction, "FlowAction", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productAction)) {
            request.productActionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productAction, "ProductAction", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateParams)) {
            request.templateParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateParams, "TemplateParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextMessageId)) {
            body.put("ContextMessageId", request.contextMessageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackContent)) {
            body.put("FallBackContent", request.fallBackContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackDuration)) {
            body.put("FallBackDuration", request.fallBackDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackId)) {
            body.put("FallBackId", request.fallBackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackRule)) {
            body.put("FallBackRule", request.fallBackRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowActionShrink)) {
            body.put("FlowAction", request.flowActionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            body.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            body.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productActionShrink)) {
            body.put("ProductAction", request.productActionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParamsShrink)) {
            body.put("TemplateParams", request.templateParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trackingData)) {
            body.put("TrackingData", request.trackingData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendChatappMessage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendChatappMessageResponse());
    }

    /**
      * You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request SendChatappMessageRequest
      * @return SendChatappMessageResponse
     */
    public SendChatappMessageResponse sendChatappMessage(SendChatappMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendChatappMessageWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request SubmitIsvCustomerTermsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitIsvCustomerTermsResponse
     */
    public SubmitIsvCustomerTermsResponse submitIsvCustomerTermsWithOptions(SubmitIsvCustomerTermsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessDesc)) {
            query.put("BusinessDesc", request.businessDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactMail)) {
            query.put("ContactMail", request.contactMail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custName)) {
            query.put("CustName", request.custName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvTerms)) {
            query.put("IsvTerms", request.isvTerms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeAddress)) {
            query.put("OfficeAddress", request.officeAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIsvCustomerTerms"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIsvCustomerTermsResponse());
    }

    /**
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request SubmitIsvCustomerTermsRequest
      * @return SubmitIsvCustomerTermsResponse
     */
    public SubmitIsvCustomerTermsResponse submitIsvCustomerTerms(SubmitIsvCustomerTermsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitIsvCustomerTermsWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request UpdateAccountWebhookRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAccountWebhookResponse
     */
    public UpdateAccountWebhookResponse updateAccountWebhookWithOptions(UpdateAccountWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpFlag)) {
            query.put("HttpFlag", request.httpFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueFlag)) {
            query.put("QueueFlag", request.queueFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCallbackUrl)) {
            query.put("StatusCallbackUrl", request.statusCallbackUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccountWebhook"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccountWebhookResponse());
    }

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
      * @param request UpdateAccountWebhookRequest
      * @return UpdateAccountWebhookResponse
     */
    public UpdateAccountWebhookResponse updateAccountWebhook(UpdateAccountWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccountWebhookWithOptions(request, runtime);
    }

    public UpdateCommerceSettingResponse updateCommerceSettingWithOptions(UpdateCommerceSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cartEnable)) {
            query.put("CartEnable", request.cartEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogVisible)) {
            query.put("CatalogVisible", request.catalogVisible);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCommerceSetting"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCommerceSettingResponse());
    }

    public UpdateCommerceSettingResponse updateCommerceSetting(UpdateCommerceSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCommerceSettingWithOptions(request, runtime);
    }

    public UpdateFlowJSONAssetResponse updateFlowJSONAssetWithOptions(UpdateFlowJSONAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowJSONAsset"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowJSONAssetResponse());
    }

    public UpdateFlowJSONAssetResponse updateFlowJSONAsset(UpdateFlowJSONAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlowJSONAssetWithOptions(request, runtime);
    }

    public UpdatePhoneEncryptionPublicKeyResponse updatePhoneEncryptionPublicKeyWithOptions(UpdatePhoneEncryptionPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionPublicKey)) {
            body.put("EncryptionPublicKey", request.encryptionPublicKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhoneEncryptionPublicKey"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhoneEncryptionPublicKeyResponse());
    }

    public UpdatePhoneEncryptionPublicKeyResponse updatePhoneEncryptionPublicKey(UpdatePhoneEncryptionPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePhoneEncryptionPublicKeyWithOptions(request, runtime);
    }

    public UpdatePhoneMessageQrdlResponse updatePhoneMessageQrdlWithOptions(UpdatePhoneMessageQrdlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateQrImage)) {
            body.put("GenerateQrImage", request.generateQrImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefilledMessage)) {
            body.put("PrefilledMessage", request.prefilledMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qrdlCode)) {
            body.put("QrdlCode", request.qrdlCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhoneMessageQrdl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhoneMessageQrdlResponse());
    }

    public UpdatePhoneMessageQrdlResponse updatePhoneMessageQrdl(UpdatePhoneMessageQrdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePhoneMessageQrdlWithOptions(request, runtime);
    }

    /**
      * The error message returned.
      *
      * @param request UpdatePhoneWebhookRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdatePhoneWebhookResponse
     */
    public UpdatePhoneWebhookResponse updatePhoneWebhookWithOptions(UpdatePhoneWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpFlag)) {
            query.put("HttpFlag", request.httpFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueFlag)) {
            query.put("QueueFlag", request.queueFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCallbackUrl)) {
            query.put("StatusCallbackUrl", request.statusCallbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upCallbackUrl)) {
            query.put("UpCallbackUrl", request.upCallbackUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhoneWebhook"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhoneWebhookResponse());
    }

    /**
      * The error message returned.
      *
      * @param request UpdatePhoneWebhookRequest
      * @return UpdatePhoneWebhookResponse
     */
    public UpdatePhoneWebhookResponse updatePhoneWebhook(UpdatePhoneWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePhoneWebhookWithOptions(request, runtime);
    }
}

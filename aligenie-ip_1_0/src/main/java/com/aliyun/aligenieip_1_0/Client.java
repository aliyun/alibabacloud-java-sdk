// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0;

import com.aliyun.tea.*;
import com.aliyun.aligenieip_1_0.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aligenie", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddCartoonResponse addCartoonWithOptions(AddCartoonRequest request, AddCartoonHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startVideoMd5)) {
            body.put("StartVideoMd5", request.startVideoMd5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startVideoUrl)) {
            body.put("StartVideoUrl", request.startVideoUrl);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCartoon"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addCartoon"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCartoonResponse());
    }

    public AddCartoonResponse addCartoon(AddCartoonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddCartoonHeaders headers = new AddCartoonHeaders();
        return this.addCartoonWithOptions(request, headers, runtime);
    }

    public AddCustomQAResponse addCustomQAWithOptions(AddCustomQARequest tmpReq, AddCustomQAHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddCustomQAShrinkRequest request = new AddCustomQAShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.answers)) {
            request.answersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.answers, "Answers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keyWords)) {
            request.keyWordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keyWords, "KeyWords", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.supplementaryQuestions)) {
            request.supplementaryQuestionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.supplementaryQuestions, "SupplementaryQuestions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answersShrink)) {
            body.put("Answers", request.answersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWordsShrink)) {
            body.put("KeyWords", request.keyWordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.majorQuestion)) {
            body.put("MajorQuestion", request.majorQuestion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplementaryQuestionsShrink)) {
            body.put("SupplementaryQuestions", request.supplementaryQuestionsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomQA"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addCustomQA"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomQAResponse());
    }

    public AddCustomQAResponse addCustomQA(AddCustomQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddCustomQAHeaders headers = new AddCustomQAHeaders();
        return this.addCustomQAWithOptions(request, headers, runtime);
    }

    public AddMessageTemplateResponse addMessageTemplateWithOptions(AddMessageTemplateRequest request, AddMessageTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateDetail)) {
            body.put("TemplateDetail", request.templateDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMessageTemplate"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addMessageTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMessageTemplateResponse());
    }

    public AddMessageTemplateResponse addMessageTemplate(AddMessageTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddMessageTemplateHeaders headers = new AddMessageTemplateHeaders();
        return this.addMessageTemplateWithOptions(request, headers, runtime);
    }

    public AddOrUpdateDisPlayModesResponse addOrUpdateDisPlayModesWithOptions(AddOrUpdateDisPlayModesRequest tmpReq, AddOrUpdateDisPlayModesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddOrUpdateDisPlayModesShrinkRequest request = new AddOrUpdateDisPlayModesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelDeviceModeList)) {
            request.hotelDeviceModeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelDeviceModeList, "HotelDeviceModeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelDeviceModeListShrink)) {
            body.put("HotelDeviceModeList", request.hotelDeviceModeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOrUpdateDisPlayModes"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addOrUpdateDisPlayModes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddOrUpdateDisPlayModesResponse());
    }

    public AddOrUpdateDisPlayModesResponse addOrUpdateDisPlayModes(AddOrUpdateDisPlayModesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrUpdateDisPlayModesHeaders headers = new AddOrUpdateDisPlayModesHeaders();
        return this.addOrUpdateDisPlayModesWithOptions(request, headers, runtime);
    }

    public AddOrUpdateHotelSettingResponse addOrUpdateHotelSettingWithOptions(AddOrUpdateHotelSettingRequest tmpReq, AddOrUpdateHotelSettingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddOrUpdateHotelSettingShrinkRequest request = new AddOrUpdateHotelSettingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelDeviceModeList)) {
            request.hotelDeviceModeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelDeviceModeList, "HotelDeviceModeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelScreenSaver)) {
            request.hotelScreenSaverShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelScreenSaver, "HotelScreenSaver", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nightMode)) {
            request.nightModeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nightMode, "NightMode", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelDeviceModeListShrink)) {
            body.put("HotelDeviceModeList", request.hotelDeviceModeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelScreenSaverShrink)) {
            body.put("HotelScreenSaver", request.hotelScreenSaverShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nightModeShrink)) {
            body.put("NightMode", request.nightModeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settingType)) {
            body.put("SettingType", request.settingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOrUpdateHotelSetting"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addOrUpdateHotelSetting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddOrUpdateHotelSettingResponse());
    }

    public AddOrUpdateHotelSettingResponse addOrUpdateHotelSetting(AddOrUpdateHotelSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrUpdateHotelSettingHeaders headers = new AddOrUpdateHotelSettingHeaders();
        return this.addOrUpdateHotelSettingWithOptions(request, headers, runtime);
    }

    public AddOrUpdateScreenSaverResponse addOrUpdateScreenSaverWithOptions(AddOrUpdateScreenSaverRequest tmpReq, AddOrUpdateScreenSaverHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddOrUpdateScreenSaverShrinkRequest request = new AddOrUpdateScreenSaverShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelScreenSaver)) {
            request.hotelScreenSaverShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelScreenSaver, "HotelScreenSaver", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelScreenSaverShrink)) {
            body.put("HotelScreenSaver", request.hotelScreenSaverShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOrUpdateScreenSaver"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addOrUpdateScreenSaver"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddOrUpdateScreenSaverResponse());
    }

    public AddOrUpdateScreenSaverResponse addOrUpdateScreenSaver(AddOrUpdateScreenSaverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrUpdateScreenSaverHeaders headers = new AddOrUpdateScreenSaverHeaders();
        return this.addOrUpdateScreenSaverWithOptions(request, headers, runtime);
    }

    public AddOrUpdateWelcomeTextResponse addOrUpdateWelcomeTextWithOptions(AddOrUpdateWelcomeTextRequest request, AddOrUpdateWelcomeTextHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.musicUrl)) {
            body.put("MusicUrl", request.musicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.welcomeText)) {
            body.put("WelcomeText", request.welcomeText);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOrUpdateWelcomeText"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addOrUpdateWelcomeText"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddOrUpdateWelcomeTextResponse());
    }

    public AddOrUpdateWelcomeTextResponse addOrUpdateWelcomeText(AddOrUpdateWelcomeTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrUpdateWelcomeTextHeaders headers = new AddOrUpdateWelcomeTextHeaders();
        return this.addOrUpdateWelcomeTextWithOptions(request, headers, runtime);
    }

    public AuditHotelResponse auditHotelWithOptions(AuditHotelRequest tmpReq, AuditHotelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AuditHotelShrinkRequest request = new AuditHotelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.auditHotelReq)) {
            request.auditHotelReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.auditHotelReq, "AuditHotelReq", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditHotelReqShrink)) {
            query.put("AuditHotelReq", request.auditHotelReqShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuditHotel"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/auditHotel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuditHotelResponse());
    }

    public AuditHotelResponse auditHotel(AuditHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AuditHotelHeaders headers = new AuditHotelHeaders();
        return this.auditHotelWithOptions(request, headers, runtime);
    }

    public BatchAddHotelRoomResponse batchAddHotelRoomWithOptions(BatchAddHotelRoomRequest tmpReq, BatchAddHotelRoomHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchAddHotelRoomShrinkRequest request = new BatchAddHotelRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomNoList)) {
            request.roomNoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomNoList, "RoomNoList", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNoListShrink)) {
            body.put("RoomNoList", request.roomNoListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddHotelRoom"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/batchAddHotelRoom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddHotelRoomResponse());
    }

    public BatchAddHotelRoomResponse batchAddHotelRoom(BatchAddHotelRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchAddHotelRoomHeaders headers = new BatchAddHotelRoomHeaders();
        return this.batchAddHotelRoomWithOptions(request, headers, runtime);
    }

    public BatchDeleteHotelRoomResponse batchDeleteHotelRoomWithOptions(BatchDeleteHotelRoomRequest tmpReq, BatchDeleteHotelRoomHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteHotelRoomShrinkRequest request = new BatchDeleteHotelRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomNoList)) {
            request.roomNoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomNoList, "RoomNoList", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNoListShrink)) {
            body.put("RoomNoList", request.roomNoListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteHotelRoom"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/batchDeleteHotelRoom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteHotelRoomResponse());
    }

    public BatchDeleteHotelRoomResponse batchDeleteHotelRoom(BatchDeleteHotelRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchDeleteHotelRoomHeaders headers = new BatchDeleteHotelRoomHeaders();
        return this.batchDeleteHotelRoomWithOptions(request, headers, runtime);
    }

    public CheckoutWithAKResponse checkoutWithAKWithOptions(CheckoutWithAKRequest request, CheckoutWithAKHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckoutWithAK"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/checkoutWithAK"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckoutWithAKResponse());
    }

    public CheckoutWithAKResponse checkoutWithAK(CheckoutWithAKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CheckoutWithAKHeaders headers = new CheckoutWithAKHeaders();
        return this.checkoutWithAKWithOptions(request, headers, runtime);
    }

    public ChildAccountAuthResponse childAccountAuthWithOptions(ChildAccountAuthRequest request, ChildAccountAuthHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbOpenId)) {
            body.put("TbOpenId", request.tbOpenId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChildAccountAuth"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/childAccountAuth"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChildAccountAuthResponse());
    }

    public ChildAccountAuthResponse childAccountAuth(ChildAccountAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChildAccountAuthHeaders headers = new ChildAccountAuthHeaders();
        return this.childAccountAuthWithOptions(request, headers, runtime);
    }

    public CreateHotelResponse createHotelWithOptions(CreateHotelRequest tmpReq, CreateHotelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateHotelShrinkRequest request = new CreateHotelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedPks)) {
            request.relatedPksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedPks, "RelatedPks", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.estOpenTime)) {
            body.put("EstOpenTime", request.estOpenTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelAddress)) {
            body.put("HotelAddress", request.hotelAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelEmail)) {
            body.put("HotelEmail", request.hotelEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelName)) {
            body.put("HotelName", request.hotelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedPk)) {
            body.put("RelatedPk", request.relatedPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedPksShrink)) {
            body.put("RelatedPks", request.relatedPksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNum)) {
            body.put("RoomNum", request.roomNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbOpenId)) {
            body.put("TbOpenId", request.tbOpenId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHotel"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/createHotel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHotelResponse());
    }

    public CreateHotelResponse createHotel(CreateHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateHotelHeaders headers = new CreateHotelHeaders();
        return this.createHotelWithOptions(request, headers, runtime);
    }

    public CreateHotelAlarmResponse createHotelAlarmWithOptions(CreateHotelAlarmRequest tmpReq, CreateHotelAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateHotelAlarmShrinkRequest request = new CreateHotelAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rooms)) {
            request.roomsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rooms, "Rooms", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleInfo)) {
            request.scheduleInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleInfo, "ScheduleInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.musicType)) {
            body.put("MusicType", request.musicType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomsShrink)) {
            body.put("Rooms", request.roomsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleInfoShrink)) {
            body.put("ScheduleInfo", request.scheduleInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHotelAlarm"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/createHotelAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHotelAlarmResponse());
    }

    public CreateHotelAlarmResponse createHotelAlarm(CreateHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateHotelAlarmHeaders headers = new CreateHotelAlarmHeaders();
        return this.createHotelAlarmWithOptions(request, headers, runtime);
    }

    public DeleteCartoonResponse deleteCartoonWithOptions(DeleteCartoonRequest request, DeleteCartoonHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCartoon"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deleteCartoon"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCartoonResponse());
    }

    public DeleteCartoonResponse deleteCartoon(DeleteCartoonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteCartoonHeaders headers = new DeleteCartoonHeaders();
        return this.deleteCartoonWithOptions(request, headers, runtime);
    }

    public DeleteCustomQAResponse deleteCustomQAWithOptions(DeleteCustomQARequest tmpReq, DeleteCustomQAHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteCustomQAShrinkRequest request = new DeleteCustomQAShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customQAIds)) {
            request.customQAIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customQAIds, "CustomQAIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customQAIdsShrink)) {
            body.put("CustomQAIds", request.customQAIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomQA"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deleteCustomQA"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomQAResponse());
    }

    public DeleteCustomQAResponse deleteCustomQA(DeleteCustomQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteCustomQAHeaders headers = new DeleteCustomQAHeaders();
        return this.deleteCustomQAWithOptions(request, headers, runtime);
    }

    public DeleteHotelAlarmResponse deleteHotelAlarmWithOptions(DeleteHotelAlarmRequest tmpReq, DeleteHotelAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteHotelAlarmShrinkRequest request = new DeleteHotelAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alarms)) {
            request.alarmsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alarms, "Alarms", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmsShrink)) {
            body.put("Alarms", request.alarmsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHotelAlarm"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deleteHotelAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHotelAlarmResponse());
    }

    public DeleteHotelAlarmResponse deleteHotelAlarm(DeleteHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteHotelAlarmHeaders headers = new DeleteHotelAlarmHeaders();
        return this.deleteHotelAlarmWithOptions(request, headers, runtime);
    }

    public DeleteHotelSceneBookItemResponse deleteHotelSceneBookItemWithOptions(DeleteHotelSceneBookItemRequest request, DeleteHotelSceneBookItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHotelSceneBookItem"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deleteHotelSceneBookItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHotelSceneBookItemResponse());
    }

    public DeleteHotelSceneBookItemResponse deleteHotelSceneBookItem(DeleteHotelSceneBookItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteHotelSceneBookItemHeaders headers = new DeleteHotelSceneBookItemHeaders();
        return this.deleteHotelSceneBookItemWithOptions(request, headers, runtime);
    }

    public DeleteHotelSettingResponse deleteHotelSettingWithOptions(DeleteHotelSettingRequest request, DeleteHotelSettingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settingType)) {
            body.put("SettingType", request.settingType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHotelSetting"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deleteHotelSetting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHotelSettingResponse());
    }

    public DeleteHotelSettingResponse deleteHotelSetting(DeleteHotelSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteHotelSettingHeaders headers = new DeleteHotelSettingHeaders();
        return this.deleteHotelSettingWithOptions(request, headers, runtime);
    }

    public DeleteMessageTemplateResponse deleteMessageTemplateWithOptions(DeleteMessageTemplateRequest request, DeleteMessageTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMessageTemplate"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deleteMessageTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMessageTemplateResponse());
    }

    public DeleteMessageTemplateResponse deleteMessageTemplate(DeleteMessageTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMessageTemplateHeaders headers = new DeleteMessageTemplateHeaders();
        return this.deleteMessageTemplateWithOptions(request, headers, runtime);
    }

    public DeviceControlResponse deviceControlWithOptions(DeviceControlRequest tmpReq, DeviceControlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeviceControlShrinkRequest request = new DeviceControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeviceControl"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deviceControl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeviceControlResponse());
    }

    public DeviceControlResponse deviceControl(DeviceControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeviceControlHeaders headers = new DeviceControlHeaders();
        return this.deviceControlWithOptions(request, headers, runtime);
    }

    public GetBasicInfoQAResponse getBasicInfoQAWithOptions(GetBasicInfoQARequest request, GetBasicInfoQAHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicInfoQA"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getBasicInfoQA"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicInfoQAResponse());
    }

    public GetBasicInfoQAResponse getBasicInfoQA(GetBasicInfoQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetBasicInfoQAHeaders headers = new GetBasicInfoQAHeaders();
        return this.getBasicInfoQAWithOptions(request, headers, runtime);
    }

    public GetCartoonResponse getCartoonWithOptions(GetCartoonRequest request, GetCartoonHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCartoon"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getCartoon"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCartoonResponse());
    }

    public GetCartoonResponse getCartoon(GetCartoonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCartoonHeaders headers = new GetCartoonHeaders();
        return this.getCartoonWithOptions(request, headers, runtime);
    }

    public GetHotelContactByGenieDeviceResponse getHotelContactByGenieDeviceWithOptions(GetHotelContactByGenieDeviceRequest tmpReq, GetHotelContactByGenieDeviceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelContactByGenieDeviceShrinkRequest request = new GetHotelContactByGenieDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelContactByGenieDevice"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelContactByGenieDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelContactByGenieDeviceResponse());
    }

    public GetHotelContactByGenieDeviceResponse getHotelContactByGenieDevice(GetHotelContactByGenieDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelContactByGenieDeviceHeaders headers = new GetHotelContactByGenieDeviceHeaders();
        return this.getHotelContactByGenieDeviceWithOptions(request, headers, runtime);
    }

    public GetHotelContactByNumberResponse getHotelContactByNumberWithOptions(GetHotelContactByNumberRequest tmpReq, GetHotelContactByNumberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelContactByNumberShrinkRequest request = new GetHotelContactByNumberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            body.put("Number", request.number);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelContactByNumber"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelContactByNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelContactByNumberResponse());
    }

    public GetHotelContactByNumberResponse getHotelContactByNumber(GetHotelContactByNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelContactByNumberHeaders headers = new GetHotelContactByNumberHeaders();
        return this.getHotelContactByNumberWithOptions(request, headers, runtime);
    }

    public GetHotelContactsResponse getHotelContactsWithOptions(GetHotelContactsRequest tmpReq, GetHotelContactsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelContactsShrinkRequest request = new GetHotelContactsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelContacts"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelContacts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelContactsResponse());
    }

    public GetHotelContactsResponse getHotelContacts(GetHotelContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelContactsHeaders headers = new GetHotelContactsHeaders();
        return this.getHotelContactsWithOptions(request, headers, runtime);
    }

    public GetHotelHomeBackImageAndModesResponse getHotelHomeBackImageAndModesWithOptions(GetHotelHomeBackImageAndModesRequest tmpReq, GetHotelHomeBackImageAndModesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelHomeBackImageAndModesShrinkRequest request = new GetHotelHomeBackImageAndModesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelHomeBackImageAndModes"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelHomeBackImageAndModes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelHomeBackImageAndModesResponse());
    }

    public GetHotelHomeBackImageAndModesResponse getHotelHomeBackImageAndModes(GetHotelHomeBackImageAndModesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelHomeBackImageAndModesHeaders headers = new GetHotelHomeBackImageAndModesHeaders();
        return this.getHotelHomeBackImageAndModesWithOptions(request, headers, runtime);
    }

    public GetHotelNoticeResponse getHotelNoticeWithOptions(GetHotelNoticeRequest tmpReq, GetHotelNoticeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelNoticeShrinkRequest request = new GetHotelNoticeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelNotice"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelNotice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelNoticeResponse());
    }

    public GetHotelNoticeResponse getHotelNotice(GetHotelNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelNoticeHeaders headers = new GetHotelNoticeHeaders();
        return this.getHotelNoticeWithOptions(request, headers, runtime);
    }

    public GetHotelNoticeV2Response getHotelNoticeV2WithOptions(GetHotelNoticeV2Request tmpReq, GetHotelNoticeV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelNoticeV2ShrinkRequest request = new GetHotelNoticeV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelNoticeV2"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelNoticeV2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelNoticeV2Response());
    }

    public GetHotelNoticeV2Response getHotelNoticeV2(GetHotelNoticeV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelNoticeV2Headers headers = new GetHotelNoticeV2Headers();
        return this.getHotelNoticeV2WithOptions(request, headers, runtime);
    }

    public GetHotelOrderDetailResponse getHotelOrderDetailWithOptions(GetHotelOrderDetailRequest tmpReq, GetHotelOrderDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelOrderDetailShrinkRequest request = new GetHotelOrderDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelOrderDetail"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelOrderDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelOrderDetailResponse());
    }

    public GetHotelOrderDetailResponse getHotelOrderDetail(GetHotelOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelOrderDetailHeaders headers = new GetHotelOrderDetailHeaders();
        return this.getHotelOrderDetailWithOptions(request, headers, runtime);
    }

    public GetHotelRoomDeviceResponse getHotelRoomDeviceWithOptions(GetHotelRoomDeviceRequest request, GetHotelRoomDeviceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            query.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            query.put("RoomNo", request.roomNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelRoomDevice"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelRoomDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelRoomDeviceResponse());
    }

    public GetHotelRoomDeviceResponse getHotelRoomDevice(GetHotelRoomDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelRoomDeviceHeaders headers = new GetHotelRoomDeviceHeaders();
        return this.getHotelRoomDeviceWithOptions(request, headers, runtime);
    }

    public GetHotelSampleUtterancesResponse getHotelSampleUtterancesWithOptions(GetHotelSampleUtterancesRequest tmpReq, GetHotelSampleUtterancesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelSampleUtterancesShrinkRequest request = new GetHotelSampleUtterancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelSampleUtterances"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelSampleUtterances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelSampleUtterancesResponse());
    }

    public GetHotelSampleUtterancesResponse getHotelSampleUtterances(GetHotelSampleUtterancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelSampleUtterancesHeaders headers = new GetHotelSampleUtterancesHeaders();
        return this.getHotelSampleUtterancesWithOptions(request, headers, runtime);
    }

    public GetHotelSceneItemDetailResponse getHotelSceneItemDetailWithOptions(GetHotelSceneItemDetailRequest request, GetHotelSceneItemDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelSceneItemDetail"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelSceneItemDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelSceneItemDetailResponse());
    }

    public GetHotelSceneItemDetailResponse getHotelSceneItemDetail(GetHotelSceneItemDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelSceneItemDetailHeaders headers = new GetHotelSceneItemDetailHeaders();
        return this.getHotelSceneItemDetailWithOptions(request, headers, runtime);
    }

    public GetHotelScreenSaverResponse getHotelScreenSaverWithOptions(GetHotelScreenSaverRequest tmpReq, GetHotelScreenSaverHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelScreenSaverShrinkRequest request = new GetHotelScreenSaverShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelScreenSaver"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelScreenSaver"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelScreenSaverResponse());
    }

    public GetHotelScreenSaverResponse getHotelScreenSaver(GetHotelScreenSaverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelScreenSaverHeaders headers = new GetHotelScreenSaverHeaders();
        return this.getHotelScreenSaverWithOptions(request, headers, runtime);
    }

    public GetHotelScreenSaverStyleResponse getHotelScreenSaverStyleWithOptions(GetHotelScreenSaverStyleRequest request, GetHotelScreenSaverStyleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelScreenSaverStyle"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelScreenSaverStyle"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelScreenSaverStyleResponse());
    }

    public GetHotelScreenSaverStyleResponse getHotelScreenSaverStyle(GetHotelScreenSaverStyleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelScreenSaverStyleHeaders headers = new GetHotelScreenSaverStyleHeaders();
        return this.getHotelScreenSaverStyleWithOptions(request, headers, runtime);
    }

    public GetHotelSettingResponse getHotelSettingWithOptions(GetHotelSettingRequest request, GetHotelSettingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settingType)) {
            body.put("SettingType", request.settingType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotelSetting"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelSetting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelSettingResponse());
    }

    public GetHotelSettingResponse getHotelSetting(GetHotelSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelSettingHeaders headers = new GetHotelSettingHeaders();
        return this.getHotelSettingWithOptions(request, headers, runtime);
    }

    public GetRelationProductListResponse getRelationProductListWithOptions(GetRelationProductListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRelationProductList"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getRelationProductList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRelationProductListResponse());
    }

    public GetRelationProductListResponse getRelationProductList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRelationProductListHeaders headers = new GetRelationProductListHeaders();
        return this.getRelationProductListWithOptions(headers, runtime);
    }

    public GetUnionIdResponse getUnionIdWithOptions(GetUnionIdRequest request, GetUnionIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodeKey)) {
            body.put("EncodeKey", request.encodeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeType)) {
            body.put("EncodeType", request.encodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            body.put("IdType", request.idType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUnionId"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getUnionId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUnionIdResponse());
    }

    public GetUnionIdResponse getUnionId(GetUnionIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUnionIdHeaders headers = new GetUnionIdHeaders();
        return this.getUnionIdWithOptions(request, headers, runtime);
    }

    public GetWelcomeTextAndMusicResponse getWelcomeTextAndMusicWithOptions(GetWelcomeTextAndMusicRequest request, GetWelcomeTextAndMusicHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWelcomeTextAndMusic"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getWelcomeTextAndMusic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWelcomeTextAndMusicResponse());
    }

    public GetWelcomeTextAndMusicResponse getWelcomeTextAndMusic(GetWelcomeTextAndMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetWelcomeTextAndMusicHeaders headers = new GetWelcomeTextAndMusicHeaders();
        return this.getWelcomeTextAndMusicWithOptions(request, headers, runtime);
    }

    public ImportRoomControlDevicesResponse importRoomControlDevicesWithOptions(ImportRoomControlDevicesRequest tmpReq, ImportRoomControlDevicesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportRoomControlDevicesShrinkRequest request = new ImportRoomControlDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.locationDevices)) {
            request.locationDevicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.locationDevices, "LocationDevices", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationDevicesShrink)) {
            body.put("LocationDevices", request.locationDevicesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportRoomControlDevices"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/importRoomControlDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportRoomControlDevicesResponse());
    }

    public ImportRoomControlDevicesResponse importRoomControlDevices(ImportRoomControlDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ImportRoomControlDevicesHeaders headers = new ImportRoomControlDevicesHeaders();
        return this.importRoomControlDevicesWithOptions(request, headers, runtime);
    }

    public InsertHotelSceneBookItemResponse insertHotelSceneBookItemWithOptions(InsertHotelSceneBookItemRequest tmpReq, InsertHotelSceneBookItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertHotelSceneBookItemShrinkRequest request = new InsertHotelSceneBookItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addHotelSceneItemReq)) {
            request.addHotelSceneItemReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addHotelSceneItemReq, "AddHotelSceneItemReq", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addHotelSceneItemReqShrink)) {
            query.put("AddHotelSceneItemReq", request.addHotelSceneItemReqShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertHotelSceneBookItem"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/insertHotelSceneBookItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertHotelSceneBookItemResponse());
    }

    public InsertHotelSceneBookItemResponse insertHotelSceneBookItem(InsertHotelSceneBookItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsertHotelSceneBookItemHeaders headers = new InsertHotelSceneBookItemHeaders();
        return this.insertHotelSceneBookItemWithOptions(request, headers, runtime);
    }

    public InvokeRobotPushResponse invokeRobotPushWithOptions(InvokeRobotPushRequest request, InvokeRobotPushHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushType)) {
            body.put("PushType", request.pushType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeRobotPush"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/invokeRobotPush"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeRobotPushResponse());
    }

    public InvokeRobotPushResponse invokeRobotPush(InvokeRobotPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvokeRobotPushHeaders headers = new InvokeRobotPushHeaders();
        return this.invokeRobotPushWithOptions(request, headers, runtime);
    }

    public ListCustomQAResponse listCustomQAWithOptions(ListCustomQARequest tmpReq, ListCustomQAHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCustomQAShrinkRequest request = new ListCustomQAShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            body.put("Page", request.pageShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomQA"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listCustomQA"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomQAResponse());
    }

    public ListCustomQAResponse listCustomQA(ListCustomQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCustomQAHeaders headers = new ListCustomQAHeaders();
        return this.listCustomQAWithOptions(request, headers, runtime);
    }

    public ListDialogueTemplateResponse listDialogueTemplateWithOptions(ListDialogueTemplateRequest request, ListDialogueTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDialogueTemplate"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listDialogueTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDialogueTemplateResponse());
    }

    public ListDialogueTemplateResponse listDialogueTemplate(ListDialogueTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDialogueTemplateHeaders headers = new ListDialogueTemplateHeaders();
        return this.listDialogueTemplateWithOptions(request, headers, runtime);
    }

    public ListHotelAlarmResponse listHotelAlarmWithOptions(ListHotelAlarmRequest tmpReq, ListHotelAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelAlarmShrinkRequest request = new ListHotelAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rooms)) {
            request.roomsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rooms, "Rooms", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomsShrink)) {
            body.put("Rooms", request.roomsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelAlarm"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelAlarmList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelAlarmResponse());
    }

    public ListHotelAlarmResponse listHotelAlarm(ListHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelAlarmHeaders headers = new ListHotelAlarmHeaders();
        return this.listHotelAlarmWithOptions(request, headers, runtime);
    }

    public ListHotelControlDeviceResponse listHotelControlDeviceWithOptions(ListHotelControlDeviceRequest tmpReq, ListHotelControlDeviceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelControlDeviceShrinkRequest request = new ListHotelControlDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelControlDevice"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelControlDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelControlDeviceResponse());
    }

    public ListHotelControlDeviceResponse listHotelControlDevice(ListHotelControlDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelControlDeviceHeaders headers = new ListHotelControlDeviceHeaders();
        return this.listHotelControlDeviceWithOptions(request, headers, runtime);
    }

    public ListHotelInfoResponse listHotelInfoWithOptions(ListHotelInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelInfo"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelInfoResponse());
    }

    public ListHotelInfoResponse listHotelInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelInfoHeaders headers = new ListHotelInfoHeaders();
        return this.listHotelInfoWithOptions(headers, runtime);
    }

    public ListHotelMessageTemplateResponse listHotelMessageTemplateWithOptions(ListHotelMessageTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelMessageTemplate"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelMessageTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelMessageTemplateResponse());
    }

    public ListHotelMessageTemplateResponse listHotelMessageTemplate() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelMessageTemplateHeaders headers = new ListHotelMessageTemplateHeaders();
        return this.listHotelMessageTemplateWithOptions(headers, runtime);
    }

    public ListHotelOrderResponse listHotelOrderWithOptions(ListHotelOrderRequest tmpReq, ListHotelOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelOrderShrinkRequest request = new ListHotelOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelOrder"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelOrderResponse());
    }

    public ListHotelOrderResponse listHotelOrder(ListHotelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelOrderHeaders headers = new ListHotelOrderHeaders();
        return this.listHotelOrderWithOptions(request, headers, runtime);
    }

    public ListHotelRoomsResponse listHotelRoomsWithOptions(ListHotelRoomsRequest request, ListHotelRoomsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelRooms"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelRooms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelRoomsResponse());
    }

    public ListHotelRoomsResponse listHotelRooms(ListHotelRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelRoomsHeaders headers = new ListHotelRoomsHeaders();
        return this.listHotelRoomsWithOptions(request, headers, runtime);
    }

    public ListHotelSceneBookItemsResponse listHotelSceneBookItemsWithOptions(ListHotelSceneBookItemsRequest tmpReq, ListHotelSceneBookItemsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelSceneBookItemsShrinkRequest request = new ListHotelSceneBookItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelSceneBookItems"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelSceneBookItems"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelSceneBookItemsResponse());
    }

    public ListHotelSceneBookItemsResponse listHotelSceneBookItems(ListHotelSceneBookItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelSceneBookItemsHeaders headers = new ListHotelSceneBookItemsHeaders();
        return this.listHotelSceneBookItemsWithOptions(request, headers, runtime);
    }

    public ListHotelSceneItemResponse listHotelSceneItemWithOptions(ListHotelSceneItemRequest tmpReq, ListHotelSceneItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelSceneItemShrinkRequest request = new ListHotelSceneItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelSceneItem"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelSceneItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelSceneItemResponse());
    }

    public ListHotelSceneItemResponse listHotelSceneItem(ListHotelSceneItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelSceneItemHeaders headers = new ListHotelSceneItemHeaders();
        return this.listHotelSceneItemWithOptions(request, headers, runtime);
    }

    public ListHotelSceneItemsResponse listHotelSceneItemsWithOptions(ListHotelSceneItemsRequest tmpReq, ListHotelSceneItemsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelSceneItemsShrinkRequest request = new ListHotelSceneItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listHotelSceneReq)) {
            request.listHotelSceneReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listHotelSceneReq, "ListHotelSceneReq", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listHotelSceneReqShrink)) {
            query.put("ListHotelSceneReq", request.listHotelSceneReqShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelSceneItems"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelSceneItems"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelSceneItemsResponse());
    }

    public ListHotelSceneItemsResponse listHotelSceneItems(ListHotelSceneItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelSceneItemsHeaders headers = new ListHotelSceneItemsHeaders();
        return this.listHotelSceneItemsWithOptions(request, headers, runtime);
    }

    public ListHotelServiceCategoryResponse listHotelServiceCategoryWithOptions(ListHotelServiceCategoryRequest tmpReq, ListHotelServiceCategoryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelServiceCategoryShrinkRequest request = new ListHotelServiceCategoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelServiceCategory"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelServiceCategory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelServiceCategoryResponse());
    }

    public ListHotelServiceCategoryResponse listHotelServiceCategory(ListHotelServiceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelServiceCategoryHeaders headers = new ListHotelServiceCategoryHeaders();
        return this.listHotelServiceCategoryWithOptions(request, headers, runtime);
    }

    public ListHotelsResponse listHotelsWithOptions(ListHotelsRequest tmpReq, ListHotelsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelsShrinkRequest request = new ListHotelsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotels"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelsResponse());
    }

    public ListHotelsResponse listHotels(ListHotelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelsHeaders headers = new ListHotelsHeaders();
        return this.listHotelsWithOptions(request, headers, runtime);
    }

    public ListSceneCategoryResponse listSceneCategoryWithOptions(ListSceneCategoryRequest request, ListSceneCategoryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSceneCategory"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listSceneCategory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSceneCategoryResponse());
    }

    public ListSceneCategoryResponse listSceneCategory(ListSceneCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSceneCategoryHeaders headers = new ListSceneCategoryHeaders();
        return this.listSceneCategoryWithOptions(request, headers, runtime);
    }

    public ListServiceQAResponse listServiceQAWithOptions(ListServiceQARequest tmpReq, ListServiceQAHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListServiceQAShrinkRequest request = new ListServiceQAShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            body.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            body.put("Page", request.pageShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceQA"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listServiceQA"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceQAResponse());
    }

    public ListServiceQAResponse listServiceQA(ListServiceQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListServiceQAHeaders headers = new ListServiceQAHeaders();
        return this.listServiceQAWithOptions(request, headers, runtime);
    }

    public ListTicketsResponse listTicketsWithOptions(ListTicketsRequest tmpReq, ListTicketsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTicketsShrinkRequest request = new ListTicketsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDesc)) {
            body.put("IsDesc", request.isDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isNeedCallback)) {
            body.put("IsNeedCallback", request.isNeedCallback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isNeedCharges)) {
            body.put("IsNeedCharges", request.isNeedCharges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            body.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTickets"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listTickets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTicketsResponse());
    }

    public ListTicketsResponse listTickets(ListTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTicketsHeaders headers = new ListTicketsHeaders();
        return this.listTicketsWithOptions(request, headers, runtime);
    }

    public PageGetHotelRoomDevicesResponse pageGetHotelRoomDevicesWithOptions(PageGetHotelRoomDevicesRequest request, PageGetHotelRoomDevicesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageGetHotelRoomDevices"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/pageGetHotelRoomDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageGetHotelRoomDevicesResponse());
    }

    public PageGetHotelRoomDevicesResponse pageGetHotelRoomDevices(PageGetHotelRoomDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PageGetHotelRoomDevicesHeaders headers = new PageGetHotelRoomDevicesHeaders();
        return this.pageGetHotelRoomDevicesWithOptions(request, headers, runtime);
    }

    public PushHotelMessageResponse pushHotelMessageWithOptions(PushHotelMessageRequest tmpReq, PushHotelMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushHotelMessageShrinkRequest request = new PushHotelMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pushHotelMessageReq)) {
            request.pushHotelMessageReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pushHotelMessageReq, "PushHotelMessageReq", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pushHotelMessageReqShrink)) {
            query.put("PushHotelMessageReq", request.pushHotelMessageReqShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushHotelMessage"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/pushHotelMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushHotelMessageResponse());
    }

    public PushHotelMessageResponse pushHotelMessage(PushHotelMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PushHotelMessageHeaders headers = new PushHotelMessageHeaders();
        return this.pushHotelMessageWithOptions(request, headers, runtime);
    }

    public PushWelcomeTextAndMusicResponse pushWelcomeTextAndMusicWithOptions(PushWelcomeTextAndMusicRequest tmpReq, PushWelcomeTextAndMusicHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushWelcomeTextAndMusicShrinkRequest request = new PushWelcomeTextAndMusicShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateVariable)) {
            request.templateVariableShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateVariable, "TemplateVariable", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVariableShrink)) {
            body.put("TemplateVariable", request.templateVariableShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushWelcomeTextAndMusic"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/pushWelcomeTextAndMusic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushWelcomeTextAndMusicResponse());
    }

    public PushWelcomeTextAndMusicResponse pushWelcomeTextAndMusic(PushWelcomeTextAndMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PushWelcomeTextAndMusicHeaders headers = new PushWelcomeTextAndMusicHeaders();
        return this.pushWelcomeTextAndMusicWithOptions(request, headers, runtime);
    }

    public QueryDeviceStatusResponse queryDeviceStatusWithOptions(QueryDeviceStatusRequest tmpReq, QueryDeviceStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryDeviceStatusShrinkRequest request = new QueryDeviceStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceStatus"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/queryDeviceStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceStatusResponse());
    }

    public QueryDeviceStatusResponse queryDeviceStatus(QueryDeviceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryDeviceStatusHeaders headers = new QueryDeviceStatusHeaders();
        return this.queryDeviceStatusWithOptions(request, headers, runtime);
    }

    public QueryHotelRoomDetailResponse queryHotelRoomDetailWithOptions(QueryHotelRoomDetailRequest request, QueryHotelRoomDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            body.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            body.put("Sn", request.sn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotelRoomDetail"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/queryHotelRoomDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotelRoomDetailResponse());
    }

    public QueryHotelRoomDetailResponse queryHotelRoomDetail(QueryHotelRoomDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryHotelRoomDetailHeaders headers = new QueryHotelRoomDetailHeaders();
        return this.queryHotelRoomDetailWithOptions(request, headers, runtime);
    }

    public QueryRoomControlDevicesResponse queryRoomControlDevicesWithOptions(QueryRoomControlDevicesRequest request, QueryRoomControlDevicesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            query.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            query.put("RoomNo", request.roomNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRoomControlDevices"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/queryRoomControlDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRoomControlDevicesResponse());
    }

    public QueryRoomControlDevicesResponse queryRoomControlDevices(QueryRoomControlDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryRoomControlDevicesHeaders headers = new QueryRoomControlDevicesHeaders();
        return this.queryRoomControlDevicesWithOptions(request, headers, runtime);
    }

    public RemoveChildAccountAuthResponse removeChildAccountAuthWithOptions(RemoveChildAccountAuthRequest request, RemoveChildAccountAuthHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childAccountName)) {
            body.put("ChildAccountName", request.childAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbOpenId)) {
            body.put("TbOpenId", request.tbOpenId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveChildAccountAuth"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/removeChildAccountAuth"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveChildAccountAuthResponse());
    }

    public RemoveChildAccountAuthResponse removeChildAccountAuth(RemoveChildAccountAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveChildAccountAuthHeaders headers = new RemoveChildAccountAuthHeaders();
        return this.removeChildAccountAuthWithOptions(request, headers, runtime);
    }

    public RemoveHotelResponse removeHotelWithOptions(RemoveHotelRequest request, RemoveHotelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbOpenId)) {
            body.put("TbOpenId", request.tbOpenId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveHotel"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/removeHotel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveHotelResponse());
    }

    public RemoveHotelResponse removeHotel(RemoveHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveHotelHeaders headers = new RemoveHotelHeaders();
        return this.removeHotelWithOptions(request, headers, runtime);
    }

    public ResetWelcomeTextAndMusicResponse resetWelcomeTextAndMusicWithOptions(ResetWelcomeTextAndMusicRequest request, ResetWelcomeTextAndMusicHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetWelcomeTextAndMusic"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/resetWelcomeTextAndMusic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetWelcomeTextAndMusicResponse());
    }

    public ResetWelcomeTextAndMusicResponse resetWelcomeTextAndMusic(ResetWelcomeTextAndMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ResetWelcomeTextAndMusicHeaders headers = new ResetWelcomeTextAndMusicHeaders();
        return this.resetWelcomeTextAndMusicWithOptions(request, headers, runtime);
    }

    public RoomCheckOutResponse roomCheckOutWithOptions(RoomCheckOutRequest tmpReq, RoomCheckOutHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RoomCheckOutShrinkRequest request = new RoomCheckOutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RoomCheckOut"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/roomCheckOut"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RoomCheckOutResponse());
    }

    public RoomCheckOutResponse roomCheckOut(RoomCheckOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RoomCheckOutHeaders headers = new RoomCheckOutHeaders();
        return this.roomCheckOutWithOptions(request, headers, runtime);
    }

    public SubmitHotelOrderResponse submitHotelOrderWithOptions(SubmitHotelOrderRequest tmpReq, SubmitHotelOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitHotelOrderShrinkRequest request = new SubmitHotelOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitHotelOrder"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/submitHotelOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHotelOrderResponse());
    }

    public SubmitHotelOrderResponse submitHotelOrder(SubmitHotelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SubmitHotelOrderHeaders headers = new SubmitHotelOrderHeaders();
        return this.submitHotelOrderWithOptions(request, headers, runtime);
    }

    public SyncDeviceStatusWithAkResponse syncDeviceStatusWithAkWithOptions(SyncDeviceStatusWithAkRequest request, SyncDeviceStatusWithAkHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryCnName)) {
            body.put("CategoryCnName", request.categoryCnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryEnName)) {
            body.put("CategoryEnName", request.categoryEnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationCnName)) {
            body.put("LocationCnName", request.locationCnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            body.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._switch)) {
            body.put("Switch", request._switch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fanSpeed)) {
            body.put("fanSpeed", request.fanSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomTemperature)) {
            body.put("roomTemperature", request.roomTemperature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.temperature)) {
            body.put("temperature", request.temperature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncDeviceStatusWithAk"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/syncDeviceStatusWithAk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncDeviceStatusWithAkResponse());
    }

    public SyncDeviceStatusWithAkResponse syncDeviceStatusWithAk(SyncDeviceStatusWithAkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SyncDeviceStatusWithAkHeaders headers = new SyncDeviceStatusWithAkHeaders();
        return this.syncDeviceStatusWithAkWithOptions(request, headers, runtime);
    }

    public UpdateBasicInfoQAResponse updateBasicInfoQAWithOptions(UpdateBasicInfoQARequest request, UpdateBasicInfoQAHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkInTime)) {
            body.put("CheckInTime", request.checkInTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOutTime)) {
            body.put("CheckOutTime", request.checkOutTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelAddress)) {
            body.put("HotelAddress", request.hotelAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelIntroduction)) {
            body.put("HotelIntroduction", request.hotelIntroduction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelMember)) {
            body.put("HotelMember", request.hotelMember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelService)) {
            body.put("HotelService", request.hotelService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parkingExpenses)) {
            body.put("ParkingExpenses", request.parkingExpenses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parkingPosition)) {
            body.put("ParkingPosition", request.parkingPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wifiName)) {
            body.put("WifiName", request.wifiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wifiPassword)) {
            body.put("WifiPassword", request.wifiPassword);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBasicInfoQA"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateBasicInfoQA"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBasicInfoQAResponse());
    }

    public UpdateBasicInfoQAResponse updateBasicInfoQA(UpdateBasicInfoQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateBasicInfoQAHeaders headers = new UpdateBasicInfoQAHeaders();
        return this.updateBasicInfoQAWithOptions(request, headers, runtime);
    }

    public UpdateCustomQAResponse updateCustomQAWithOptions(UpdateCustomQARequest tmpReq, UpdateCustomQAHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCustomQAShrinkRequest request = new UpdateCustomQAShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.answers)) {
            request.answersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.answers, "Answers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keyWords)) {
            request.keyWordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keyWords, "KeyWords", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.supplementaryQuestions)) {
            request.supplementaryQuestionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.supplementaryQuestions, "SupplementaryQuestions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answersShrink)) {
            body.put("Answers", request.answersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customQAId)) {
            body.put("CustomQAId", request.customQAId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWordsShrink)) {
            body.put("KeyWords", request.keyWordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.majorQuestion)) {
            body.put("MajorQuestion", request.majorQuestion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplementaryQuestionsShrink)) {
            body.put("SupplementaryQuestions", request.supplementaryQuestionsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomQA"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateCustomQA"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomQAResponse());
    }

    public UpdateCustomQAResponse updateCustomQA(UpdateCustomQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateCustomQAHeaders headers = new UpdateCustomQAHeaders();
        return this.updateCustomQAWithOptions(request, headers, runtime);
    }

    public UpdateHotelResponse updateHotelWithOptions(UpdateHotelRequest tmpReq, UpdateHotelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateHotelShrinkRequest request = new UpdateHotelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedPks)) {
            request.relatedPksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedPks, "RelatedPks", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.estOpenTime)) {
            body.put("EstOpenTime", request.estOpenTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelAddress)) {
            body.put("HotelAddress", request.hotelAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelEmail)) {
            body.put("HotelEmail", request.hotelEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelName)) {
            body.put("HotelName", request.hotelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedPksShrink)) {
            body.put("RelatedPks", request.relatedPksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNum)) {
            body.put("RoomNum", request.roomNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbOpenId)) {
            body.put("TbOpenId", request.tbOpenId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHotel"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateHotel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHotelResponse());
    }

    public UpdateHotelResponse updateHotel(UpdateHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelHeaders headers = new UpdateHotelHeaders();
        return this.updateHotelWithOptions(request, headers, runtime);
    }

    public UpdateHotelAlarmResponse updateHotelAlarmWithOptions(UpdateHotelAlarmRequest tmpReq, UpdateHotelAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateHotelAlarmShrinkRequest request = new UpdateHotelAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alarms)) {
            request.alarmsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alarms, "Alarms", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleInfo)) {
            request.scheduleInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleInfo, "ScheduleInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmsShrink)) {
            body.put("Alarms", request.alarmsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleInfoShrink)) {
            body.put("ScheduleInfo", request.scheduleInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHotelAlarm"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateHotelAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHotelAlarmResponse());
    }

    public UpdateHotelAlarmResponse updateHotelAlarm(UpdateHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelAlarmHeaders headers = new UpdateHotelAlarmHeaders();
        return this.updateHotelAlarmWithOptions(request, headers, runtime);
    }

    public UpdateHotelSceneBookItemResponse updateHotelSceneBookItemWithOptions(UpdateHotelSceneBookItemRequest tmpReq, UpdateHotelSceneBookItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateHotelSceneBookItemShrinkRequest request = new UpdateHotelSceneBookItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateHotelSceneBookReq)) {
            request.updateHotelSceneBookReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateHotelSceneBookReq, "UpdateHotelSceneBookReq", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateHotelSceneBookReqShrink)) {
            query.put("UpdateHotelSceneBookReq", request.updateHotelSceneBookReqShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHotelSceneBookItem"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateHotelSceneBookItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHotelSceneBookItemResponse());
    }

    public UpdateHotelSceneBookItemResponse updateHotelSceneBookItem(UpdateHotelSceneBookItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelSceneBookItemHeaders headers = new UpdateHotelSceneBookItemHeaders();
        return this.updateHotelSceneBookItemWithOptions(request, headers, runtime);
    }

    public UpdateHotelSceneItemResponse updateHotelSceneItemWithOptions(UpdateHotelSceneItemRequest tmpReq, UpdateHotelSceneItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateHotelSceneItemShrinkRequest request = new UpdateHotelSceneItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateHotelSceneOperateReq)) {
            request.updateHotelSceneOperateReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateHotelSceneOperateReq, "UpdateHotelSceneOperateReq", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateHotelSceneReq)) {
            request.updateHotelSceneReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateHotelSceneReq, "UpdateHotelSceneReq", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateHotelSceneOperateReqShrink)) {
            query.put("UpdateHotelSceneOperateReq", request.updateHotelSceneOperateReqShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateHotelSceneReqShrink)) {
            query.put("UpdateHotelSceneReq", request.updateHotelSceneReqShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHotelSceneItem"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateHotelSceneItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHotelSceneItemResponse());
    }

    public UpdateHotelSceneItemResponse updateHotelSceneItem(UpdateHotelSceneItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelSceneItemHeaders headers = new UpdateHotelSceneItemHeaders();
        return this.updateHotelSceneItemWithOptions(request, headers, runtime);
    }

    public UpdateMessageTemplateResponse updateMessageTemplateWithOptions(UpdateMessageTemplateRequest request, UpdateMessageTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateDetail)) {
            body.put("TemplateDetail", request.templateDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMessageTemplate"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateMessageTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMessageTemplateResponse());
    }

    public UpdateMessageTemplateResponse updateMessageTemplate(UpdateMessageTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMessageTemplateHeaders headers = new UpdateMessageTemplateHeaders();
        return this.updateMessageTemplateWithOptions(request, headers, runtime);
    }

    public UpdateServiceQAResponse updateServiceQAWithOptions(UpdateServiceQARequest request, UpdateServiceQAHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answer)) {
            body.put("Answer", request.answer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceQAId)) {
            body.put("ServiceQAId", request.serviceQAId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isActive)) {
            body.put("isActive", request.isActive);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceQA"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateServiceQA"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceQAResponse());
    }

    public UpdateServiceQAResponse updateServiceQA(UpdateServiceQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateServiceQAHeaders headers = new UpdateServiceQAHeaders();
        return this.updateServiceQAWithOptions(request, headers, runtime);
    }

    public UpdateTicketResponse updateTicketWithOptions(UpdateTicketRequest request, UpdateTicketHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupKey)) {
            body.put("GroupKey", request.groupKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTicket"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateTicket"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTicketResponse());
    }

    public UpdateTicketResponse updateTicket(UpdateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTicketHeaders headers = new UpdateTicketHeaders();
        return this.updateTicketWithOptions(request, headers, runtime);
    }
}

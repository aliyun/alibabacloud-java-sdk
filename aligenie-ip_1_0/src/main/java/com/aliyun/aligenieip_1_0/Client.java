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

    /**
     * <b>summary</b> : 
     * <p>添加动画</p>
     * 
     * @param request AddCartoonRequest
     * @param headers AddCartoonHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCartoonResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>添加动画</p>
     * 
     * @param request AddCartoonRequest
     * @return AddCartoonResponse
     */
    public AddCartoonResponse addCartoon(AddCartoonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddCartoonHeaders headers = new AddCartoonHeaders();
        return this.addCartoonWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增自定义问答</p>
     * 
     * @param tmpReq AddCustomQARequest
     * @param headers AddCustomQAHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomQAResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>新增自定义问答</p>
     * 
     * @param request AddCustomQARequest
     * @return AddCustomQAResponse
     */
    public AddCustomQAResponse addCustomQA(AddCustomQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddCustomQAHeaders headers = new AddCustomQAHeaders();
        return this.addCustomQAWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加问答V2</p>
     * 
     * @param tmpReq AddCustomQAV2Request
     * @param headers AddCustomQAV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomQAV2Response
     */
    public AddCustomQAV2Response addCustomQAV2WithOptions(AddCustomQAV2Request tmpReq, AddCustomQAV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddCustomQAV2ShrinkRequest request = new AddCustomQAV2ShrinkRequest();
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
            new TeaPair("action", "AddCustomQAV2"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addQAV2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomQAV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>添加问答V2</p>
     * 
     * @param request AddCustomQAV2Request
     * @return AddCustomQAV2Response
     */
    public AddCustomQAV2Response addCustomQAV2(AddCustomQAV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddCustomQAV2Headers headers = new AddCustomQAV2Headers();
        return this.addCustomQAV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加消息模板</p>
     * 
     * @param request AddMessageTemplateRequest
     * @param headers AddMessageTemplateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMessageTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>添加消息模板</p>
     * 
     * @param request AddMessageTemplateRequest
     * @return AddMessageTemplateResponse
     */
    public AddMessageTemplateResponse addMessageTemplate(AddMessageTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddMessageTemplateHeaders headers = new AddMessageTemplateHeaders();
        return this.addMessageTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增或者编辑带屏展示模式</p>
     * 
     * @param tmpReq AddOrUpdateDisPlayModesRequest
     * @param headers AddOrUpdateDisPlayModesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOrUpdateDisPlayModesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>新增或者编辑带屏展示模式</p>
     * 
     * @param request AddOrUpdateDisPlayModesRequest
     * @return AddOrUpdateDisPlayModesResponse
     */
    public AddOrUpdateDisPlayModesResponse addOrUpdateDisPlayModes(AddOrUpdateDisPlayModesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrUpdateDisPlayModesHeaders headers = new AddOrUpdateDisPlayModesHeaders();
        return this.addOrUpdateDisPlayModesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增或者编辑定制配置</p>
     * 
     * @param tmpReq AddOrUpdateHotelSettingRequest
     * @param headers AddOrUpdateHotelSettingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOrUpdateHotelSettingResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>新增或者编辑定制配置</p>
     * 
     * @param request AddOrUpdateHotelSettingRequest
     * @return AddOrUpdateHotelSettingResponse
     */
    public AddOrUpdateHotelSettingResponse addOrUpdateHotelSetting(AddOrUpdateHotelSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrUpdateHotelSettingHeaders headers = new AddOrUpdateHotelSettingHeaders();
        return this.addOrUpdateHotelSettingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增或者编辑带屏屏保</p>
     * 
     * @param tmpReq AddOrUpdateScreenSaverRequest
     * @param headers AddOrUpdateScreenSaverHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOrUpdateScreenSaverResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>新增或者编辑带屏屏保</p>
     * 
     * @param request AddOrUpdateScreenSaverRequest
     * @return AddOrUpdateScreenSaverResponse
     */
    public AddOrUpdateScreenSaverResponse addOrUpdateScreenSaver(AddOrUpdateScreenSaverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrUpdateScreenSaverHeaders headers = new AddOrUpdateScreenSaverHeaders();
        return this.addOrUpdateScreenSaverWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加/更新欢迎语信息</p>
     * 
     * @param request AddOrUpdateWelcomeTextRequest
     * @param headers AddOrUpdateWelcomeTextHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOrUpdateWelcomeTextResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>添加/更新欢迎语信息</p>
     * 
     * @param request AddOrUpdateWelcomeTextRequest
     * @return AddOrUpdateWelcomeTextResponse
     */
    public AddOrUpdateWelcomeTextResponse addOrUpdateWelcomeText(AddOrUpdateWelcomeTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrUpdateWelcomeTextHeaders headers = new AddOrUpdateWelcomeTextHeaders();
        return this.addOrUpdateWelcomeTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>审批酒店</p>
     * 
     * @param tmpReq AuditHotelRequest
     * @param headers AuditHotelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuditHotelResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>审批酒店</p>
     * 
     * @param request AuditHotelRequest
     * @return AuditHotelResponse
     */
    public AuditHotelResponse auditHotel(AuditHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AuditHotelHeaders headers = new AuditHotelHeaders();
        return this.auditHotelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建房间</p>
     * 
     * @param tmpReq BatchAddHotelRoomRequest
     * @param headers BatchAddHotelRoomHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchAddHotelRoomResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>批量创建房间</p>
     * 
     * @param request BatchAddHotelRoomRequest
     * @return BatchAddHotelRoomResponse
     */
    public BatchAddHotelRoomResponse batchAddHotelRoom(BatchAddHotelRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchAddHotelRoomHeaders headers = new BatchAddHotelRoomHeaders();
        return this.batchAddHotelRoomWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除房间</p>
     * 
     * @param tmpReq BatchDeleteHotelRoomRequest
     * @param headers BatchDeleteHotelRoomHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteHotelRoomResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>批量删除房间</p>
     * 
     * @param request BatchDeleteHotelRoomRequest
     * @return BatchDeleteHotelRoomResponse
     */
    public BatchDeleteHotelRoomResponse batchDeleteHotelRoom(BatchDeleteHotelRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchDeleteHotelRoomHeaders headers = new BatchDeleteHotelRoomHeaders();
        return this.batchDeleteHotelRoomWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店退房，清楚例如闹钟等定时信息</p>
     * 
     * @param request CheckoutWithAKRequest
     * @param headers CheckoutWithAKHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckoutWithAKResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店退房，清楚例如闹钟等定时信息</p>
     * 
     * @param request CheckoutWithAKRequest
     * @return CheckoutWithAKResponse
     */
    public CheckoutWithAKResponse checkoutWithAK(CheckoutWithAKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CheckoutWithAKHeaders headers = new CheckoutWithAKHeaders();
        return this.checkoutWithAKWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>子账号授权</p>
     * 
     * @param request ChildAccountAuthRequest
     * @param headers ChildAccountAuthHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChildAccountAuthResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>子账号授权</p>
     * 
     * @param request ChildAccountAuthRequest
     * @return ChildAccountAuthResponse
     */
    public ChildAccountAuthResponse childAccountAuth(ChildAccountAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChildAccountAuthHeaders headers = new ChildAccountAuthHeaders();
        return this.childAccountAuthWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>控制房间内设备</p>
     * 
     * @param tmpReq ControlRoomDeviceRequest
     * @param headers ControlRoomDeviceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ControlRoomDeviceResponse
     */
    public ControlRoomDeviceResponse controlRoomDeviceWithOptions(ControlRoomDeviceRequest tmpReq, ControlRoomDeviceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ControlRoomDeviceShrinkRequest request = new ControlRoomDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.properties)) {
            request.propertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.properties, "Properties", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cmd)) {
            body.put("Cmd", request.cmd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIndex)) {
            body.put("DeviceIndex", request.deviceIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceNumber)) {
            body.put("DeviceNumber", request.deviceNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertiesShrink)) {
            body.put("Properties", request.propertiesShrink);
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
            new TeaPair("action", "ControlRoomDevice"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/controlRoomDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ControlRoomDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>控制房间内设备</p>
     * 
     * @param request ControlRoomDeviceRequest
     * @return ControlRoomDeviceResponse
     */
    public ControlRoomDeviceResponse controlRoomDevice(ControlRoomDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ControlRoomDeviceHeaders headers = new ControlRoomDeviceHeaders();
        return this.controlRoomDeviceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建酒店项目</p>
     * 
     * @param tmpReq CreateHotelRequest
     * @param headers CreateHotelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHotelResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>创建酒店项目</p>
     * 
     * @param request CreateHotelRequest
     * @return CreateHotelResponse
     */
    public CreateHotelResponse createHotel(CreateHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateHotelHeaders headers = new CreateHotelHeaders();
        return this.createHotelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建闹钟</p>
     * 
     * @param tmpReq CreateHotelAlarmRequest
     * @param headers CreateHotelAlarmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHotelAlarmResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>批量创建闹钟</p>
     * 
     * @param request CreateHotelAlarmRequest
     * @return CreateHotelAlarmResponse
     */
    public CreateHotelAlarmResponse createHotelAlarm(CreateHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateHotelAlarmHeaders headers = new CreateHotelAlarmHeaders();
        return this.createHotelAlarmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店rcu自定义场景创建</p>
     * 
     * @param tmpReq CreateRcuSceneRequest
     * @param headers CreateRcuSceneHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRcuSceneResponse
     */
    public CreateRcuSceneResponse createRcuSceneWithOptions(CreateRcuSceneRequest tmpReq, CreateRcuSceneHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRcuSceneShrinkRequest request = new CreateRcuSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sceneRelationExtDTO)) {
            request.sceneRelationExtDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sceneRelationExtDTO, "SceneRelationExtDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneRelationExtDTOShrink)) {
            body.put("SceneRelationExtDTO", request.sceneRelationExtDTOShrink);
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
            new TeaPair("action", "CreateRcuScene"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/createRcuScene"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRcuSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店rcu自定义场景创建</p>
     * 
     * @param request CreateRcuSceneRequest
     * @return CreateRcuSceneResponse
     */
    public CreateRcuSceneResponse createRcuScene(CreateRcuSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateRcuSceneHeaders headers = new CreateRcuSceneHeaders();
        return this.createRcuSceneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除动画</p>
     * 
     * @param request DeleteCartoonRequest
     * @param headers DeleteCartoonHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCartoonResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>删除动画</p>
     * 
     * @param request DeleteCartoonRequest
     * @return DeleteCartoonResponse
     */
    public DeleteCartoonResponse deleteCartoon(DeleteCartoonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteCartoonHeaders headers = new DeleteCartoonHeaders();
        return this.deleteCartoonWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义问答</p>
     * 
     * @param tmpReq DeleteCustomQARequest
     * @param headers DeleteCustomQAHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomQAResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>删除自定义问答</p>
     * 
     * @param request DeleteCustomQARequest
     * @return DeleteCustomQAResponse
     */
    public DeleteCustomQAResponse deleteCustomQA(DeleteCustomQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteCustomQAHeaders headers = new DeleteCustomQAHeaders();
        return this.deleteCustomQAWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除酒店闹钟</p>
     * 
     * @param tmpReq DeleteHotelAlarmRequest
     * @param headers DeleteHotelAlarmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHotelAlarmResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>删除酒店闹钟</p>
     * 
     * @param request DeleteHotelAlarmRequest
     * @return DeleteHotelAlarmResponse
     */
    public DeleteHotelAlarmResponse deleteHotelAlarm(DeleteHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteHotelAlarmHeaders headers = new DeleteHotelAlarmHeaders();
        return this.deleteHotelAlarmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景预订删除</p>
     * 
     * @param request DeleteHotelSceneBookItemRequest
     * @param headers DeleteHotelSceneBookItemHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHotelSceneBookItemResponse
     */
    public DeleteHotelSceneBookItemResponse deleteHotelSceneBookItemWithOptions(DeleteHotelSceneBookItemRequest request, DeleteHotelSceneBookItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景预订删除</p>
     * 
     * @param request DeleteHotelSceneBookItemRequest
     * @return DeleteHotelSceneBookItemResponse
     */
    public DeleteHotelSceneBookItemResponse deleteHotelSceneBookItem(DeleteHotelSceneBookItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteHotelSceneBookItemHeaders headers = new DeleteHotelSceneBookItemHeaders();
        return this.deleteHotelSceneBookItemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除定制配置</p>
     * 
     * @param request DeleteHotelSettingRequest
     * @param headers DeleteHotelSettingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHotelSettingResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>删除定制配置</p>
     * 
     * @param request DeleteHotelSettingRequest
     * @return DeleteHotelSettingResponse
     */
    public DeleteHotelSettingResponse deleteHotelSetting(DeleteHotelSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteHotelSettingHeaders headers = new DeleteHotelSettingHeaders();
        return this.deleteHotelSettingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除消息通知模板</p>
     * 
     * @param request DeleteMessageTemplateRequest
     * @param headers DeleteMessageTemplateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMessageTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>删除消息通知模板</p>
     * 
     * @param request DeleteMessageTemplateRequest
     * @return DeleteMessageTemplateResponse
     */
    public DeleteMessageTemplateResponse deleteMessageTemplate(DeleteMessageTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMessageTemplateHeaders headers = new DeleteMessageTemplateHeaders();
        return this.deleteMessageTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除酒店自定义rcu场景</p>
     * 
     * @param request DeleteRcuSceneRequest
     * @param headers DeleteRcuSceneHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRcuSceneResponse
     */
    public DeleteRcuSceneResponse deleteRcuSceneWithOptions(DeleteRcuSceneRequest request, DeleteRcuSceneHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
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
            new TeaPair("action", "DeleteRcuScene"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deleteRcuScene"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRcuSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除酒店自定义rcu场景</p>
     * 
     * @param request DeleteRcuSceneRequest
     * @return DeleteRcuSceneResponse
     */
    public DeleteRcuSceneResponse deleteRcuScene(DeleteRcuSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteRcuSceneHeaders headers = new DeleteRcuSceneHeaders();
        return this.deleteRcuSceneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备控制</p>
     * 
     * @param tmpReq DeviceControlRequest
     * @param headers DeviceControlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeviceControlResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>设备控制</p>
     * 
     * @param request DeviceControlRequest
     * @return DeviceControlResponse
     */
    public DeviceControlResponse deviceControl(DeviceControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeviceControlHeaders headers = new DeviceControlHeaders();
        return this.deviceControlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>控制房间场景</p>
     * 
     * @param request ExecuteSceneRequest
     * @param headers ExecuteSceneHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteSceneResponse
     */
    public ExecuteSceneResponse executeSceneWithOptions(ExecuteSceneRequest request, ExecuteSceneHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            body.put("SceneName", request.sceneName);
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
            new TeaPair("action", "ExecuteScene"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/executeScene"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>控制房间场景</p>
     * 
     * @param request ExecuteSceneRequest
     * @return ExecuteSceneResponse
     */
    public ExecuteSceneResponse executeScene(ExecuteSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExecuteSceneHeaders headers = new ExecuteSceneHeaders();
        return this.executeSceneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取基础信息问答</p>
     * 
     * @param request GetBasicInfoQARequest
     * @param headers GetBasicInfoQAHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBasicInfoQAResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取基础信息问答</p>
     * 
     * @param request GetBasicInfoQARequest
     * @return GetBasicInfoQAResponse
     */
    public GetBasicInfoQAResponse getBasicInfoQA(GetBasicInfoQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetBasicInfoQAHeaders headers = new GetBasicInfoQAHeaders();
        return this.getBasicInfoQAWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询动画</p>
     * 
     * @param request GetCartoonRequest
     * @param headers GetCartoonHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCartoonResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询动画</p>
     * 
     * @param request GetCartoonRequest
     * @return GetCartoonResponse
     */
    public GetCartoonResponse getCartoon(GetCartoonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCartoonHeaders headers = new GetCartoonHeaders();
        return this.getCartoonWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前设备的通话信息</p>
     * 
     * @param tmpReq GetHotelContactByGenieDeviceRequest
     * @param headers GetHotelContactByGenieDeviceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelContactByGenieDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取当前设备的通话信息</p>
     * 
     * @param request GetHotelContactByGenieDeviceRequest
     * @return GetHotelContactByGenieDeviceResponse
     */
    public GetHotelContactByGenieDeviceResponse getHotelContactByGenieDevice(GetHotelContactByGenieDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelContactByGenieDeviceHeaders headers = new GetHotelContactByGenieDeviceHeaders();
        return this.getHotelContactByGenieDeviceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据号码获取酒店联系人</p>
     * 
     * @param tmpReq GetHotelContactByNumberRequest
     * @param headers GetHotelContactByNumberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelContactByNumberResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>根据号码获取酒店联系人</p>
     * 
     * @param request GetHotelContactByNumberRequest
     * @return GetHotelContactByNumberResponse
     */
    public GetHotelContactByNumberResponse getHotelContactByNumber(GetHotelContactByNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelContactByNumberHeaders headers = new GetHotelContactByNumberHeaders();
        return this.getHotelContactByNumberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店联系人</p>
     * 
     * @param tmpReq GetHotelContactsRequest
     * @param headers GetHotelContactsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelContactsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取酒店联系人</p>
     * 
     * @param request GetHotelContactsRequest
     * @return GetHotelContactsResponse
     */
    public GetHotelContactsResponse getHotelContacts(GetHotelContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelContactsHeaders headers = new GetHotelContactsHeaders();
        return this.getHotelContactsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取首页背景图和场景模式</p>
     * 
     * @param tmpReq GetHotelHomeBackImageAndModesRequest
     * @param headers GetHotelHomeBackImageAndModesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelHomeBackImageAndModesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取首页背景图和场景模式</p>
     * 
     * @param request GetHotelHomeBackImageAndModesRequest
     * @return GetHotelHomeBackImageAndModesResponse
     */
    public GetHotelHomeBackImageAndModesResponse getHotelHomeBackImageAndModes(GetHotelHomeBackImageAndModesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelHomeBackImageAndModesHeaders headers = new GetHotelHomeBackImageAndModesHeaders();
        return this.getHotelHomeBackImageAndModesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店通知</p>
     * 
     * @param tmpReq GetHotelNoticeRequest
     * @param headers GetHotelNoticeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelNoticeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取酒店通知</p>
     * 
     * @param request GetHotelNoticeRequest
     * @return GetHotelNoticeResponse
     */
    public GetHotelNoticeResponse getHotelNotice(GetHotelNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelNoticeHeaders headers = new GetHotelNoticeHeaders();
        return this.getHotelNoticeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店通知</p>
     * 
     * @param tmpReq GetHotelNoticeV2Request
     * @param headers GetHotelNoticeV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelNoticeV2Response
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取酒店通知</p>
     * 
     * @param request GetHotelNoticeV2Request
     * @return GetHotelNoticeV2Response
     */
    public GetHotelNoticeV2Response getHotelNoticeV2(GetHotelNoticeV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelNoticeV2Headers headers = new GetHotelNoticeV2Headers();
        return this.getHotelNoticeV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店订单详情</p>
     * 
     * @param tmpReq GetHotelOrderDetailRequest
     * @param headers GetHotelOrderDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelOrderDetailResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取酒店订单详情</p>
     * 
     * @param request GetHotelOrderDetailRequest
     * @return GetHotelOrderDetailResponse
     */
    public GetHotelOrderDetailResponse getHotelOrderDetail(GetHotelOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelOrderDetailHeaders headers = new GetHotelOrderDetailHeaders();
        return this.getHotelOrderDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店房间猫精设备信息</p>
     * 
     * @param request GetHotelRoomDeviceRequest
     * @param headers GetHotelRoomDeviceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelRoomDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取酒店房间猫精设备信息</p>
     * 
     * @param request GetHotelRoomDeviceRequest
     * @return GetHotelRoomDeviceResponse
     */
    public GetHotelRoomDeviceResponse getHotelRoomDevice(GetHotelRoomDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelRoomDeviceHeaders headers = new GetHotelRoomDeviceHeaders();
        return this.getHotelRoomDeviceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取推荐语料</p>
     * 
     * @param tmpReq GetHotelSampleUtterancesRequest
     * @param headers GetHotelSampleUtterancesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelSampleUtterancesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取推荐语料</p>
     * 
     * @param request GetHotelSampleUtterancesRequest
     * @return GetHotelSampleUtterancesResponse
     */
    public GetHotelSampleUtterancesResponse getHotelSampleUtterances(GetHotelSampleUtterancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelSampleUtterancesHeaders headers = new GetHotelSampleUtterancesHeaders();
        return this.getHotelSampleUtterancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景详情</p>
     * 
     * @param request GetHotelSceneItemDetailRequest
     * @param headers GetHotelSceneItemDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelSceneItemDetailResponse
     */
    public GetHotelSceneItemDetailResponse getHotelSceneItemDetailWithOptions(GetHotelSceneItemDetailRequest request, GetHotelSceneItemDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景详情</p>
     * 
     * @param request GetHotelSceneItemDetailRequest
     * @return GetHotelSceneItemDetailResponse
     */
    public GetHotelSceneItemDetailResponse getHotelSceneItemDetail(GetHotelSceneItemDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelSceneItemDetailHeaders headers = new GetHotelSceneItemDetailHeaders();
        return this.getHotelSceneItemDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店屏保</p>
     * 
     * @param tmpReq GetHotelScreenSaverRequest
     * @param headers GetHotelScreenSaverHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelScreenSaverResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取酒店屏保</p>
     * 
     * @param request GetHotelScreenSaverRequest
     * @return GetHotelScreenSaverResponse
     */
    public GetHotelScreenSaverResponse getHotelScreenSaver(GetHotelScreenSaverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelScreenSaverHeaders headers = new GetHotelScreenSaverHeaders();
        return this.getHotelScreenSaverWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取屏保列表</p>
     * 
     * @param request GetHotelScreenSaverStyleRequest
     * @param headers GetHotelScreenSaverStyleHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelScreenSaverStyleResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取屏保列表</p>
     * 
     * @param request GetHotelScreenSaverStyleRequest
     * @return GetHotelScreenSaverStyleResponse
     */
    public GetHotelScreenSaverStyleResponse getHotelScreenSaverStyle(GetHotelScreenSaverStyleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelScreenSaverStyleHeaders headers = new GetHotelScreenSaverStyleHeaders();
        return this.getHotelScreenSaverStyleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询定制配置</p>
     * 
     * @param request GetHotelSettingRequest
     * @param headers GetHotelSettingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotelSettingResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询定制配置</p>
     * 
     * @param request GetHotelSettingRequest
     * @return GetHotelSettingResponse
     */
    public GetHotelSettingResponse getHotelSetting(GetHotelSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelSettingHeaders headers = new GetHotelSettingHeaders();
        return this.getHotelSettingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关联产品列表查看</p>
     * 
     * @param headers GetRelationProductListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRelationProductListResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>关联产品列表查看</p>
     * @return GetRelationProductListResponse
     */
    public GetRelationProductListResponse getRelationProductList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRelationProductListHeaders headers = new GetRelationProductListHeaders();
        return this.getRelationProductListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取组织下unionId列表</p>
     * 
     * @param request GetUnionIdRequest
     * @param headers GetUnionIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUnionIdResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取组织下unionId列表</p>
     * 
     * @param request GetUnionIdRequest
     * @return GetUnionIdResponse
     */
    public GetUnionIdResponse getUnionId(GetUnionIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUnionIdHeaders headers = new GetUnionIdHeaders();
        return this.getUnionIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询欢迎语信息</p>
     * 
     * @param request GetWelcomeTextAndMusicRequest
     * @param headers GetWelcomeTextAndMusicHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWelcomeTextAndMusicResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询欢迎语信息</p>
     * 
     * @param request GetWelcomeTextAndMusicRequest
     * @return GetWelcomeTextAndMusicResponse
     */
    public GetWelcomeTextAndMusicResponse getWelcomeTextAndMusic(GetWelcomeTextAndMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetWelcomeTextAndMusicHeaders headers = new GetWelcomeTextAndMusicHeaders();
        return this.getWelcomeTextAndMusicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店带屏设备扫码绑定</p>
     * 
     * @param request HotelQrBindRequest
     * @param headers HotelQrBindHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelQrBindResponse
     */
    public HotelQrBindResponse hotelQrBindWithOptions(HotelQrBindRequest request, HotelQrBindHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

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
            new TeaPair("action", "HotelQrBind"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/hotelQrBind"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelQrBindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店带屏设备扫码绑定</p>
     * 
     * @param request HotelQrBindRequest
     * @return HotelQrBindResponse
     */
    public HotelQrBindResponse hotelQrBind(HotelQrBindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelQrBindHeaders headers = new HotelQrBindHeaders();
        return this.hotelQrBindWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量导入酒店配置</p>
     * 
     * @param tmpReq ImportHotelConfigRequest
     * @param headers ImportHotelConfigHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportHotelConfigResponse
     */
    public ImportHotelConfigResponse importHotelConfigWithOptions(ImportHotelConfigRequest tmpReq, ImportHotelConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportHotelConfigShrinkRequest request = new ImportHotelConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.importHotelConfig)) {
            request.importHotelConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.importHotelConfig, "ImportHotelConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importHotelConfigShrink)) {
            body.put("ImportHotelConfig", request.importHotelConfigShrink);
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
            new TeaPair("action", "ImportHotelConfig"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/importHotelConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportHotelConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量导入酒店配置</p>
     * 
     * @param request ImportHotelConfigRequest
     * @return ImportHotelConfigResponse
     */
    public ImportHotelConfigResponse importHotelConfig(ImportHotelConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ImportHotelConfigHeaders headers = new ImportHotelConfigHeaders();
        return this.importHotelConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量导入设备（同时补充房型）</p>
     * 
     * @param tmpReq ImportRoomControlDevicesRequest
     * @param headers ImportRoomControlDevicesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportRoomControlDevicesResponse
     */
    public ImportRoomControlDevicesResponse importRoomControlDevicesWithOptions(ImportRoomControlDevicesRequest tmpReq, ImportRoomControlDevicesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportRoomControlDevicesShrinkRequest request = new ImportRoomControlDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.locationDevices)) {
            request.locationDevicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.locationDevices, "LocationDevices", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableInfraredDeviceImport)) {
            body.put("EnableInfraredDeviceImport", request.enableInfraredDeviceImport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableMeshDeviceImport)) {
            body.put("EnableMeshDeviceImport", request.enableMeshDeviceImport);
        }

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

    /**
     * <b>summary</b> : 
     * <p>批量导入设备（同时补充房型）</p>
     * 
     * @param request ImportRoomControlDevicesRequest
     * @return ImportRoomControlDevicesResponse
     */
    public ImportRoomControlDevicesResponse importRoomControlDevices(ImportRoomControlDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ImportRoomControlDevicesHeaders headers = new ImportRoomControlDevicesHeaders();
        return this.importRoomControlDevicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导入房间内精灵场景</p>
     * 
     * @param tmpReq ImportRoomGenieScenesRequest
     * @param headers ImportRoomGenieScenesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportRoomGenieScenesResponse
     */
    public ImportRoomGenieScenesResponse importRoomGenieScenesWithOptions(ImportRoomGenieScenesRequest tmpReq, ImportRoomGenieScenesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportRoomGenieScenesShrinkRequest request = new ImportRoomGenieScenesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sceneList)) {
            request.sceneListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sceneList, "SceneList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneListShrink)) {
            body.put("SceneList", request.sceneListShrink);
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
            new TeaPair("action", "ImportRoomGenieScenes"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/importRoomGenieScenes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportRoomGenieScenesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导入房间内精灵场景</p>
     * 
     * @param request ImportRoomGenieScenesRequest
     * @return ImportRoomGenieScenesResponse
     */
    public ImportRoomGenieScenesResponse importRoomGenieScenes(ImportRoomGenieScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ImportRoomGenieScenesHeaders headers = new ImportRoomGenieScenesHeaders();
        return this.importRoomGenieScenesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景预订新增</p>
     * 
     * @param tmpReq InsertHotelSceneBookItemRequest
     * @param headers InsertHotelSceneBookItemHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertHotelSceneBookItemResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景预订新增</p>
     * 
     * @param request InsertHotelSceneBookItemRequest
     * @return InsertHotelSceneBookItemResponse
     */
    public InsertHotelSceneBookItemResponse insertHotelSceneBookItem(InsertHotelSceneBookItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsertHotelSceneBookItemHeaders headers = new InsertHotelSceneBookItemHeaders();
        return this.insertHotelSceneBookItemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人服务，消息推送</p>
     * 
     * @param request InvokeRobotPushRequest
     * @param headers InvokeRobotPushHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeRobotPushResponse
     */
    public InvokeRobotPushResponse invokeRobotPushWithOptions(InvokeRobotPushRequest request, InvokeRobotPushHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushType)) {
            body.put("PushType", request.pushType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomName)) {
            body.put("RoomName", request.roomName);
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

    /**
     * <b>summary</b> : 
     * <p>机器人服务，消息推送</p>
     * 
     * @param request InvokeRobotPushRequest
     * @return InvokeRobotPushResponse
     */
    public InvokeRobotPushResponse invokeRobotPush(InvokeRobotPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvokeRobotPushHeaders headers = new InvokeRobotPushHeaders();
        return this.invokeRobotPushWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询省份</p>
     * 
     * @param headers ListAllProvincesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllProvincesResponse
     */
    public ListAllProvincesResponse listAllProvincesWithOptions(ListAllProvincesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListAllProvinces"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listAllProvinces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllProvincesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询省份</p>
     * @return ListAllProvincesResponse
     */
    public ListAllProvincesResponse listAllProvinces() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAllProvincesHeaders headers = new ListAllProvincesHeaders();
        return this.listAllProvincesWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询城市</p>
     * 
     * @param request ListCitiesByProvinceRequest
     * @param headers ListCitiesByProvinceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCitiesByProvinceResponse
     */
    public ListCitiesByProvinceResponse listCitiesByProvinceWithOptions(ListCitiesByProvinceRequest request, ListCitiesByProvinceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            body.put("Province", request.province);
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
            new TeaPair("action", "ListCitiesByProvince"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listCitiesByProvince"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCitiesByProvinceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询城市</p>
     * 
     * @param request ListCitiesByProvinceRequest
     * @return ListCitiesByProvinceResponse
     */
    public ListCitiesByProvinceResponse listCitiesByProvince(ListCitiesByProvinceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCitiesByProvinceHeaders headers = new ListCitiesByProvinceHeaders();
        return this.listCitiesByProvinceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义问答列表</p>
     * 
     * @param tmpReq ListCustomQARequest
     * @param headers ListCustomQAHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomQAResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询自定义问答列表</p>
     * 
     * @param request ListCustomQARequest
     * @return ListCustomQAResponse
     */
    public ListCustomQAResponse listCustomQA(ListCustomQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCustomQAHeaders headers = new ListCustomQAHeaders();
        return this.listCustomQAWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景对话模板</p>
     * 
     * @param request ListDialogueTemplateRequest
     * @param headers ListDialogueTemplateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDialogueTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景对话模板</p>
     * 
     * @param request ListDialogueTemplateRequest
     * @return ListDialogueTemplateResponse
     */
    public ListDialogueTemplateResponse listDialogueTemplate(ListDialogueTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDialogueTemplateHeaders headers = new ListDialogueTemplateHeaders();
        return this.listDialogueTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店闹钟</p>
     * 
     * @param tmpReq ListHotelAlarmRequest
     * @param headers ListHotelAlarmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelAlarmResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询酒店闹钟</p>
     * 
     * @param request ListHotelAlarmRequest
     * @return ListHotelAlarmResponse
     */
    public ListHotelAlarmResponse listHotelAlarm(ListHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelAlarmHeaders headers = new ListHotelAlarmHeaders();
        return this.listHotelAlarmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店设备列表</p>
     * 
     * @param tmpReq ListHotelControlDeviceRequest
     * @param headers ListHotelControlDeviceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelControlDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店设备列表</p>
     * 
     * @param request ListHotelControlDeviceRequest
     * @return ListHotelControlDeviceResponse
     */
    public ListHotelControlDeviceResponse listHotelControlDevice(ListHotelControlDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelControlDeviceHeaders headers = new ListHotelControlDeviceHeaders();
        return this.listHotelControlDeviceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店列表</p>
     * 
     * @param headers ListHotelInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelInfoResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取酒店列表</p>
     * @return ListHotelInfoResponse
     */
    public ListHotelInfoResponse listHotelInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelInfoHeaders headers = new ListHotelInfoHeaders();
        return this.listHotelInfoWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取消息模板</p>
     * 
     * @param headers ListHotelMessageTemplateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelMessageTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取消息模板</p>
     * @return ListHotelMessageTemplateResponse
     */
    public ListHotelMessageTemplateResponse listHotelMessageTemplate() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelMessageTemplateHeaders headers = new ListHotelMessageTemplateHeaders();
        return this.listHotelMessageTemplateWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单列表</p>
     * 
     * @param tmpReq ListHotelOrderRequest
     * @param headers ListHotelOrderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelOrderResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店订单列表</p>
     * 
     * @param request ListHotelOrderRequest
     * @return ListHotelOrderResponse
     */
    public ListHotelOrderResponse listHotelOrder(ListHotelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelOrderHeaders headers = new ListHotelOrderHeaders();
        return this.listHotelOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店的所有房间</p>
     * 
     * @param tmpReq ListHotelRoomsRequest
     * @param headers ListHotelRoomsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelRoomsResponse
     */
    public ListHotelRoomsResponse listHotelRoomsWithOptions(ListHotelRoomsRequest tmpReq, ListHotelRoomsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelRoomsShrinkRequest request = new ListHotelRoomsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelAdminRoom)) {
            request.hotelAdminRoomShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelAdminRoom, "HotelAdminRoom", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelAdminRoomShrink)) {
            body.put("HotelAdminRoom", request.hotelAdminRoomShrink);
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

    /**
     * <b>summary</b> : 
     * <p>获取酒店的所有房间</p>
     * 
     * @param request ListHotelRoomsRequest
     * @return ListHotelRoomsResponse
     */
    public ListHotelRoomsResponse listHotelRooms(ListHotelRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelRoomsHeaders headers = new ListHotelRoomsHeaders();
        return this.listHotelRoomsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景预订列表（餐饮/SPA休闲/打车）</p>
     * 
     * @param tmpReq ListHotelSceneBookItemsRequest
     * @param headers ListHotelSceneBookItemsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelSceneBookItemsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景预订列表（餐饮/SPA休闲/打车）</p>
     * 
     * @param request ListHotelSceneBookItemsRequest
     * @return ListHotelSceneBookItemsResponse
     */
    public ListHotelSceneBookItemsResponse listHotelSceneBookItems(ListHotelSceneBookItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelSceneBookItemsHeaders headers = new ListHotelSceneBookItemsHeaders();
        return this.listHotelSceneBookItemsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>服务项目</p>
     * 
     * @param tmpReq ListHotelSceneItemRequest
     * @param headers ListHotelSceneItemHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelSceneItemResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>服务项目</p>
     * 
     * @param request ListHotelSceneItemRequest
     * @return ListHotelSceneItemResponse
     */
    public ListHotelSceneItemResponse listHotelSceneItem(ListHotelSceneItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelSceneItemHeaders headers = new ListHotelSceneItemHeaders();
        return this.listHotelSceneItemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景列表（物品/服务/维修）</p>
     * 
     * @param tmpReq ListHotelSceneItemsRequest
     * @param headers ListHotelSceneItemsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelSceneItemsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景列表（物品/服务/维修）</p>
     * 
     * @param request ListHotelSceneItemsRequest
     * @return ListHotelSceneItemsResponse
     */
    public ListHotelSceneItemsResponse listHotelSceneItems(ListHotelSceneItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelSceneItemsHeaders headers = new ListHotelSceneItemsHeaders();
        return this.listHotelSceneItemsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>服务分类列表</p>
     * 
     * @param tmpReq ListHotelServiceCategoryRequest
     * @param headers ListHotelServiceCategoryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelServiceCategoryResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>服务分类列表</p>
     * 
     * @param request ListHotelServiceCategoryRequest
     * @return ListHotelServiceCategoryResponse
     */
    public ListHotelServiceCategoryResponse listHotelServiceCategory(ListHotelServiceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelServiceCategoryHeaders headers = new ListHotelServiceCategoryHeaders();
        return this.listHotelServiceCategoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店列表(待审批/已拒绝/已通过)</p>
     * 
     * @param tmpReq ListHotelsRequest
     * @param headers ListHotelsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotelsResponse
     */
    public ListHotelsResponse listHotelsWithOptions(ListHotelsRequest tmpReq, ListHotelsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelsShrinkRequest request = new ListHotelsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelRequest)) {
            request.hotelRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelRequest, "HotelRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelRequestShrink)) {
            query.put("HotelRequest", request.hotelRequestShrink);
        }

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

    /**
     * <b>summary</b> : 
     * <p>酒店列表(待审批/已拒绝/已通过)</p>
     * 
     * @param request ListHotelsRequest
     * @return ListHotelsResponse
     */
    public ListHotelsResponse listHotels(ListHotelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelsHeaders headers = new ListHotelsHeaders();
        return this.listHotelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询红外品牌列表</p>
     * 
     * @param request ListInfraredDeviceBrandsRequest
     * @param headers ListInfraredDeviceBrandsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInfraredDeviceBrandsResponse
     */
    public ListInfraredDeviceBrandsResponse listInfraredDeviceBrandsWithOptions(ListInfraredDeviceBrandsRequest request, ListInfraredDeviceBrandsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceProvider)) {
            body.put("ServiceProvider", request.serviceProvider);
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
            new TeaPair("action", "ListInfraredDeviceBrands"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listInfraredDeviceBrands"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInfraredDeviceBrandsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询红外品牌列表</p>
     * 
     * @param request ListInfraredDeviceBrandsRequest
     * @return ListInfraredDeviceBrandsResponse
     */
    public ListInfraredDeviceBrandsResponse listInfraredDeviceBrands(ListInfraredDeviceBrandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListInfraredDeviceBrandsHeaders headers = new ListInfraredDeviceBrandsHeaders();
        return this.listInfraredDeviceBrandsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询红外码库列表</p>
     * 
     * @param request ListInfraredRemoteControllersRequest
     * @param headers ListInfraredRemoteControllersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInfraredRemoteControllersResponse
     */
    public ListInfraredRemoteControllersResponse listInfraredRemoteControllersWithOptions(ListInfraredRemoteControllersRequest request, ListInfraredRemoteControllersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brand)) {
            body.put("Brand", request.brand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            body.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceProvider)) {
            body.put("ServiceProvider", request.serviceProvider);
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
            new TeaPair("action", "ListInfraredRemoteControllers"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listInfraredRemoteControllers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInfraredRemoteControllersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询红外码库列表</p>
     * 
     * @param request ListInfraredRemoteControllersRequest
     * @return ListInfraredRemoteControllersResponse
     */
    public ListInfraredRemoteControllersResponse listInfraredRemoteControllers(ListInfraredRemoteControllersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListInfraredRemoteControllersHeaders headers = new ListInfraredRemoteControllersHeaders();
        return this.listInfraredRemoteControllersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务提供商</p>
     * 
     * @param request ListSTBServiceProvidersRequest
     * @param headers ListSTBServiceProvidersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSTBServiceProvidersResponse
     */
    public ListSTBServiceProvidersResponse listSTBServiceProvidersWithOptions(ListSTBServiceProvidersRequest request, ListSTBServiceProvidersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            body.put("Province", request.province);
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
            new TeaPair("action", "ListSTBServiceProviders"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listSTBServiceProviders"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSTBServiceProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务提供商</p>
     * 
     * @param request ListSTBServiceProvidersRequest
     * @return ListSTBServiceProvidersResponse
     */
    public ListSTBServiceProvidersResponse listSTBServiceProviders(ListSTBServiceProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSTBServiceProvidersHeaders headers = new ListSTBServiceProvidersHeaders();
        return this.listSTBServiceProvidersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景分类</p>
     * 
     * @param request ListSceneCategoryRequest
     * @param headers ListSceneCategoryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSceneCategoryResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景分类</p>
     * 
     * @param request ListSceneCategoryRequest
     * @return ListSceneCategoryResponse
     */
    public ListSceneCategoryResponse listSceneCategory(ListSceneCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSceneCategoryHeaders headers = new ListSceneCategoryHeaders();
        return this.listSceneCategoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务设施问答列表</p>
     * 
     * @param tmpReq ListServiceQARequest
     * @param headers ListServiceQAHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceQAResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询服务设施问答列表</p>
     * 
     * @param request ListServiceQARequest
     * @return ListServiceQAResponse
     */
    public ListServiceQAResponse listServiceQA(ListServiceQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListServiceQAHeaders headers = new ListServiceQAHeaders();
        return this.listServiceQAWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询工单列表</p>
     * 
     * @param tmpReq ListTicketsRequest
     * @param headers ListTicketsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTicketsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询工单列表</p>
     * 
     * @param request ListTicketsRequest
     * @return ListTicketsResponse
     */
    public ListTicketsResponse listTickets(ListTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTicketsHeaders headers = new ListTicketsHeaders();
        return this.listTicketsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询酒店房间主控设备</p>
     * 
     * @param request PageGetHotelRoomDevicesRequest
     * @param headers PageGetHotelRoomDevicesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageGetHotelRoomDevicesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>分页查询酒店房间主控设备</p>
     * 
     * @param request PageGetHotelRoomDevicesRequest
     * @return PageGetHotelRoomDevicesResponse
     */
    public PageGetHotelRoomDevicesResponse pageGetHotelRoomDevices(PageGetHotelRoomDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PageGetHotelRoomDevicesHeaders headers = new PageGetHotelRoomDevicesHeaders();
        return this.pageGetHotelRoomDevicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>pms事件上报</p>
     * 
     * @param request PmsEventReportRequest
     * @param headers PmsEventReportHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PmsEventReportResponse
     */
    public PmsEventReportResponse pmsEventReportWithOptions(PmsEventReportRequest request, PmsEventReportHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payload)) {
            body.put("Payload", request.payload);
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
            new TeaPair("action", "PmsEventReport"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/pmsEventReport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PmsEventReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>pms事件上报</p>
     * 
     * @param request PmsEventReportRequest
     * @return PmsEventReportResponse
     */
    public PmsEventReportResponse pmsEventReport(PmsEventReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PmsEventReportHeaders headers = new PmsEventReportHeaders();
        return this.pmsEventReportWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送酒店消息</p>
     * 
     * @param tmpReq PushHotelMessageRequest
     * @param headers PushHotelMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushHotelMessageResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>推送酒店消息</p>
     * 
     * @param request PushHotelMessageRequest
     * @return PushHotelMessageResponse
     */
    public PushHotelMessageResponse pushHotelMessage(PushHotelMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PushHotelMessageHeaders headers = new PushHotelMessageHeaders();
        return this.pushHotelMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送音箱指令</p>
     * 
     * @param tmpReq PushVoiceBoxCommandsRequest
     * @param headers PushVoiceBoxCommandsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushVoiceBoxCommandsResponse
     */
    public PushVoiceBoxCommandsResponse pushVoiceBoxCommandsWithOptions(PushVoiceBoxCommandsRequest tmpReq, PushVoiceBoxCommandsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushVoiceBoxCommandsShrinkRequest request = new PushVoiceBoxCommandsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commands)) {
            request.commandsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commands, "Commands", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandsShrink)) {
            body.put("Commands", request.commandsShrink);
        }

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
            new TeaPair("action", "PushVoiceBoxCommands"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/pushVoiceBoxCommands"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushVoiceBoxCommandsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送音箱指令</p>
     * 
     * @param request PushVoiceBoxCommandsRequest
     * @return PushVoiceBoxCommandsResponse
     */
    public PushVoiceBoxCommandsResponse pushVoiceBoxCommands(PushVoiceBoxCommandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PushVoiceBoxCommandsHeaders headers = new PushVoiceBoxCommandsHeaders();
        return this.pushVoiceBoxCommandsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>直接推送欢迎语</p>
     * 
     * @param request PushWelcomeRequest
     * @param headers PushWelcomeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushWelcomeResponse
     */
    public PushWelcomeResponse pushWelcomeWithOptions(PushWelcomeRequest request, PushWelcomeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomName)) {
            body.put("RoomName", request.roomName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.welcomeMusicUrl)) {
            body.put("WelcomeMusicUrl", request.welcomeMusicUrl);
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
            new TeaPair("action", "PushWelcome"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/pushWelcome"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushWelcomeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>直接推送欢迎语</p>
     * 
     * @param request PushWelcomeRequest
     * @return PushWelcomeResponse
     */
    public PushWelcomeResponse pushWelcome(PushWelcomeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PushWelcomeHeaders headers = new PushWelcomeHeaders();
        return this.pushWelcomeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送欢迎语</p>
     * 
     * @param tmpReq PushWelcomeTextAndMusicRequest
     * @param headers PushWelcomeTextAndMusicHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushWelcomeTextAndMusicResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.roomName)) {
            body.put("RoomName", request.roomName);
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

    /**
     * <b>summary</b> : 
     * <p>推送欢迎语</p>
     * 
     * @param request PushWelcomeTextAndMusicRequest
     * @return PushWelcomeTextAndMusicResponse
     */
    public PushWelcomeTextAndMusicResponse pushWelcomeTextAndMusic(PushWelcomeTextAndMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PushWelcomeTextAndMusicHeaders headers = new PushWelcomeTextAndMusicHeaders();
        return this.pushWelcomeTextAndMusicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店设备状态/模式状态查询</p>
     * 
     * @param tmpReq QueryDeviceStatusRequest
     * @param headers QueryDeviceStatusHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceStatusResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询酒店设备状态/模式状态查询</p>
     * 
     * @param request QueryDeviceStatusRequest
     * @return QueryDeviceStatusResponse
     */
    public QueryDeviceStatusResponse queryDeviceStatus(QueryDeviceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryDeviceStatusHeaders headers = new QueryDeviceStatusHeaders();
        return this.queryDeviceStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询房间详细信息</p>
     * 
     * @param request QueryHotelRoomDetailRequest
     * @param headers QueryHotelRoomDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryHotelRoomDetailResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询房间详细信息</p>
     * 
     * @param request QueryHotelRoomDetailRequest
     * @return QueryHotelRoomDetailResponse
     */
    public QueryHotelRoomDetailResponse queryHotelRoomDetail(QueryHotelRoomDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryHotelRoomDetailHeaders headers = new QueryHotelRoomDetailHeaders();
        return this.queryHotelRoomDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店房间客控设备</p>
     * 
     * @param request QueryRoomControlDevicesRequest
     * @param headers QueryRoomControlDevicesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRoomControlDevicesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询酒店房间客控设备</p>
     * 
     * @param request QueryRoomControlDevicesRequest
     * @return QueryRoomControlDevicesResponse
     */
    public QueryRoomControlDevicesResponse queryRoomControlDevices(QueryRoomControlDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryRoomControlDevicesHeaders headers = new QueryRoomControlDevicesHeaders();
        return this.queryRoomControlDevicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询房间被控设备包含设备状态</p>
     * 
     * @param request QueryRoomControlDevicesAndStatusRequest
     * @param headers QueryRoomControlDevicesAndStatusHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRoomControlDevicesAndStatusResponse
     */
    public QueryRoomControlDevicesAndStatusResponse queryRoomControlDevicesAndStatusWithOptions(QueryRoomControlDevicesAndStatusRequest request, QueryRoomControlDevicesAndStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryRoomControlDevicesAndStatus"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/queryRoomControlDevicesAndStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRoomControlDevicesAndStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询房间被控设备包含设备状态</p>
     * 
     * @param request QueryRoomControlDevicesAndStatusRequest
     * @return QueryRoomControlDevicesAndStatusResponse
     */
    public QueryRoomControlDevicesAndStatusResponse queryRoomControlDevicesAndStatus(QueryRoomControlDevicesAndStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryRoomControlDevicesAndStatusHeaders headers = new QueryRoomControlDevicesAndStatusHeaders();
        return this.queryRoomControlDevicesAndStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询房态信息</p>
     * 
     * @param request QueryRoomStatusRequest
     * @param headers QueryRoomStatusHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRoomStatusResponse
     */
    public QueryRoomStatusResponse queryRoomStatusWithOptions(QueryRoomStatusRequest request, QueryRoomStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryRoomStatus"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/queryRoomStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRoomStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询房态信息</p>
     * 
     * @param request QueryRoomStatusRequest
     * @return QueryRoomStatusResponse
     */
    public QueryRoomStatusResponse queryRoomStatus(QueryRoomStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryRoomStatusHeaders headers = new QueryRoomStatusHeaders();
        return this.queryRoomStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店场景列表</p>
     * 
     * @param tmpReq QuerySceneListRequest
     * @param headers QuerySceneListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySceneListResponse
     */
    public QuerySceneListResponse querySceneListWithOptions(QuerySceneListRequest tmpReq, QuerySceneListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QuerySceneListShrinkRequest request = new QuerySceneListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sceneStates)) {
            request.sceneStatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sceneStates, "SceneStates", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sceneTypes)) {
            request.sceneTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sceneTypes, "SceneTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateInfoIds)) {
            request.templateInfoIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateInfoIds, "TemplateInfoIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneStatesShrink)) {
            body.put("SceneStates", request.sceneStatesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneTypesShrink)) {
            body.put("SceneTypes", request.sceneTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateInfoIdsShrink)) {
            body.put("TemplateInfoIds", request.templateInfoIdsShrink);
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
            new TeaPair("action", "QuerySceneList"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/querySceneList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySceneListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店场景列表</p>
     * 
     * @param request QuerySceneListRequest
     * @return QuerySceneListResponse
     */
    public QuerySceneListResponse querySceneList(QuerySceneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QuerySceneListHeaders headers = new QuerySceneListHeaders();
        return this.querySceneListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除子账号授权</p>
     * 
     * @param request RemoveChildAccountAuthRequest
     * @param headers RemoveChildAccountAuthHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveChildAccountAuthResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>删除子账号授权</p>
     * 
     * @param request RemoveChildAccountAuthRequest
     * @return RemoveChildAccountAuthResponse
     */
    public RemoveChildAccountAuthResponse removeChildAccountAuth(RemoveChildAccountAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveChildAccountAuthHeaders headers = new RemoveChildAccountAuthHeaders();
        return this.removeChildAccountAuthWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除酒店项目</p>
     * 
     * @param request RemoveHotelRequest
     * @param headers RemoveHotelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveHotelResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>删除酒店项目</p>
     * 
     * @param request RemoveHotelRequest
     * @return RemoveHotelResponse
     */
    public RemoveHotelResponse removeHotel(RemoveHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveHotelHeaders headers = new RemoveHotelHeaders();
        return this.removeHotelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置欢迎语信息</p>
     * 
     * @param request ResetWelcomeTextAndMusicRequest
     * @param headers ResetWelcomeTextAndMusicHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetWelcomeTextAndMusicResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>重置欢迎语信息</p>
     * 
     * @param request ResetWelcomeTextAndMusicRequest
     * @return ResetWelcomeTextAndMusicResponse
     */
    public ResetWelcomeTextAndMusicResponse resetWelcomeTextAndMusic(ResetWelcomeTextAndMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ResetWelcomeTextAndMusicHeaders headers = new ResetWelcomeTextAndMusicHeaders();
        return this.resetWelcomeTextAndMusicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>退房</p>
     * 
     * @param tmpReq RoomCheckOutRequest
     * @param headers RoomCheckOutHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RoomCheckOutResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>退房</p>
     * 
     * @param request RoomCheckOutRequest
     * @return RoomCheckOutResponse
     */
    public RoomCheckOutResponse roomCheckOut(RoomCheckOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RoomCheckOutHeaders headers = new RoomCheckOutHeaders();
        return this.roomCheckOutWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交酒店订单</p>
     * 
     * @param tmpReq SubmitHotelOrderRequest
     * @param headers SubmitHotelOrderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitHotelOrderResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>提交酒店订单</p>
     * 
     * @param request SubmitHotelOrderRequest
     * @return SubmitHotelOrderResponse
     */
    public SubmitHotelOrderResponse submitHotelOrder(SubmitHotelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SubmitHotelOrderHeaders headers = new SubmitHotelOrderHeaders();
        return this.submitHotelOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步客控设备状态到主控设备</p>
     * 
     * @param request SyncDeviceStatusWithAkRequest
     * @param headers SyncDeviceStatusWithAkHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncDeviceStatusWithAkResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>同步客控设备状态到主控设备</p>
     * 
     * @param request SyncDeviceStatusWithAkRequest
     * @return SyncDeviceStatusWithAkResponse
     */
    public SyncDeviceStatusWithAkResponse syncDeviceStatusWithAk(SyncDeviceStatusWithAkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SyncDeviceStatusWithAkHeaders headers = new SyncDeviceStatusWithAkHeaders();
        return this.syncDeviceStatusWithAkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改基础信息问答</p>
     * 
     * @param request UpdateBasicInfoQARequest
     * @param headers UpdateBasicInfoQAHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBasicInfoQAResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>修改基础信息问答</p>
     * 
     * @param request UpdateBasicInfoQARequest
     * @return UpdateBasicInfoQAResponse
     */
    public UpdateBasicInfoQAResponse updateBasicInfoQA(UpdateBasicInfoQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateBasicInfoQAHeaders headers = new UpdateBasicInfoQAHeaders();
        return this.updateBasicInfoQAWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改自定义问答</p>
     * 
     * @param tmpReq UpdateCustomQARequest
     * @param headers UpdateCustomQAHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomQAResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>修改自定义问答</p>
     * 
     * @param request UpdateCustomQARequest
     * @return UpdateCustomQAResponse
     */
    public UpdateCustomQAResponse updateCustomQA(UpdateCustomQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateCustomQAHeaders headers = new UpdateCustomQAHeaders();
        return this.updateCustomQAWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改酒店项目</p>
     * 
     * @param tmpReq UpdateHotelRequest
     * @param headers UpdateHotelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHotelResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>修改酒店项目</p>
     * 
     * @param request UpdateHotelRequest
     * @return UpdateHotelResponse
     */
    public UpdateHotelResponse updateHotel(UpdateHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelHeaders headers = new UpdateHotelHeaders();
        return this.updateHotelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改酒店闹钟</p>
     * 
     * @param tmpReq UpdateHotelAlarmRequest
     * @param headers UpdateHotelAlarmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHotelAlarmResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>修改酒店闹钟</p>
     * 
     * @param request UpdateHotelAlarmRequest
     * @return UpdateHotelAlarmResponse
     */
    public UpdateHotelAlarmResponse updateHotelAlarm(UpdateHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelAlarmHeaders headers = new UpdateHotelAlarmHeaders();
        return this.updateHotelAlarmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景预订编辑</p>
     * 
     * @param tmpReq UpdateHotelSceneBookItemRequest
     * @param headers UpdateHotelSceneBookItemHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHotelSceneBookItemResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景预订编辑</p>
     * 
     * @param request UpdateHotelSceneBookItemRequest
     * @return UpdateHotelSceneBookItemResponse
     */
    public UpdateHotelSceneBookItemResponse updateHotelSceneBookItem(UpdateHotelSceneBookItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelSceneBookItemHeaders headers = new UpdateHotelSceneBookItemHeaders();
        return this.updateHotelSceneBookItemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店场景修改（开启/关闭/编辑）</p>
     * 
     * @param tmpReq UpdateHotelSceneItemRequest
     * @param headers UpdateHotelSceneItemHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHotelSceneItemResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>酒店场景修改（开启/关闭/编辑）</p>
     * 
     * @param request UpdateHotelSceneItemRequest
     * @return UpdateHotelSceneItemResponse
     */
    public UpdateHotelSceneItemResponse updateHotelSceneItem(UpdateHotelSceneItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelSceneItemHeaders headers = new UpdateHotelSceneItemHeaders();
        return this.updateHotelSceneItemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新消息通知模板</p>
     * 
     * @param request UpdateMessageTemplateRequest
     * @param headers UpdateMessageTemplateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMessageTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>更新消息通知模板</p>
     * 
     * @param request UpdateMessageTemplateRequest
     * @return UpdateMessageTemplateResponse
     */
    public UpdateMessageTemplateResponse updateMessageTemplate(UpdateMessageTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMessageTemplateHeaders headers = new UpdateMessageTemplateHeaders();
        return this.updateMessageTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改酒店自定义rcu场景</p>
     * 
     * @param tmpReq UpdateRcuSceneRequest
     * @param headers UpdateRcuSceneHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRcuSceneResponse
     */
    public UpdateRcuSceneResponse updateRcuSceneWithOptions(UpdateRcuSceneRequest tmpReq, UpdateRcuSceneHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRcuSceneShrinkRequest request = new UpdateRcuSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sceneRelationExtDTO)) {
            request.sceneRelationExtDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sceneRelationExtDTO, "SceneRelationExtDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneRelationExtDTOShrink)) {
            body.put("SceneRelationExtDTO", request.sceneRelationExtDTOShrink);
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
            new TeaPair("action", "UpdateRcuScene"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateRcuScene"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRcuSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改酒店自定义rcu场景</p>
     * 
     * @param request UpdateRcuSceneRequest
     * @return UpdateRcuSceneResponse
     */
    public UpdateRcuSceneResponse updateRcuScene(UpdateRcuSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateRcuSceneHeaders headers = new UpdateRcuSceneHeaders();
        return this.updateRcuSceneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改服务设施问答</p>
     * 
     * @param request UpdateServiceQARequest
     * @param headers UpdateServiceQAHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceQAResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>修改服务设施问答</p>
     * 
     * @param request UpdateServiceQARequest
     * @return UpdateServiceQAResponse
     */
    public UpdateServiceQAResponse updateServiceQA(UpdateServiceQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateServiceQAHeaders headers = new UpdateServiceQAHeaders();
        return this.updateServiceQAWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改工单</p>
     * 
     * @param request UpdateTicketRequest
     * @param headers UpdateTicketHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTicketResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>修改工单</p>
     * 
     * @param request UpdateTicketRequest
     * @return UpdateTicketResponse
     */
    public UpdateTicketResponse updateTicket(UpdateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTicketHeaders headers = new UpdateTicketHeaders();
        return this.updateTicketWithOptions(request, headers, runtime);
    }
}

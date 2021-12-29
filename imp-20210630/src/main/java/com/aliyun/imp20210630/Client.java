// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630;

import com.aliyun.tea.*;
import com.aliyun.imp20210630.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddMemberResponse addMemberWithOptions(AddMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromUserId)) {
            body.put("FromUserId", request.fromUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toUserId)) {
            body.put("ToUserId", request.toUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMember"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMemberResponse());
    }

    public AddMemberResponse addMember(AddMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMemberWithOptions(request, runtime);
    }

    public AgreeLinkMicResponse agreeLinkMicWithOptions(AgreeLinkMicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromUserId)) {
            body.put("FromUserId", request.fromUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toUserId)) {
            body.put("ToUserId", request.toUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AgreeLinkMic"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AgreeLinkMicResponse());
    }

    public AgreeLinkMicResponse agreeLinkMic(AgreeLinkMicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.agreeLinkMicWithOptions(request, runtime);
    }

    public ApplyLinkMicResponse applyLinkMicWithOptions(ApplyLinkMicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyLinkMic"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyLinkMicResponse());
    }

    public ApplyLinkMicResponse applyLinkMic(ApplyLinkMicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyLinkMicWithOptions(request, runtime);
    }

    public AttachStandardRoomHttpsCertificateResponse attachStandardRoomHttpsCertificateWithOptions(AttachStandardRoomHttpsCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificatePrivateKey)) {
            body.put("CertificatePrivateKey", request.certificatePrivateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificatePublicKey)) {
            body.put("CertificatePublicKey", request.certificatePublicKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachStandardRoomHttpsCertificate"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachStandardRoomHttpsCertificateResponse());
    }

    public AttachStandardRoomHttpsCertificateResponse attachStandardRoomHttpsCertificate(AttachStandardRoomHttpsCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachStandardRoomHttpsCertificateWithOptions(request, runtime);
    }

    public BanAllCommentResponse banAllCommentWithOptions(BanAllCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BanAllComment"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BanAllCommentResponse());
    }

    public BanAllCommentResponse banAllComment(BanAllCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.banAllCommentWithOptions(request, runtime);
    }

    public BanCommentResponse banCommentWithOptions(BanCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.banCommentTime)) {
            body.put("BanCommentTime", request.banCommentTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.banCommentUser)) {
            body.put("BanCommentUser", request.banCommentUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BanComment"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BanCommentResponse());
    }

    public BanCommentResponse banComment(BanCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.banCommentWithOptions(request, runtime);
    }

    public CancelApplyLinkMicResponse cancelApplyLinkMicWithOptions(CancelApplyLinkMicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelApplyLinkMic"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelApplyLinkMicResponse());
    }

    public CancelApplyLinkMicResponse cancelApplyLinkMic(CancelApplyLinkMicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelApplyLinkMicWithOptions(request, runtime);
    }

    public CancelBanAllCommentResponse cancelBanAllCommentWithOptions(CancelBanAllCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelBanAllComment"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelBanAllCommentResponse());
    }

    public CancelBanAllCommentResponse cancelBanAllComment(CancelBanAllCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelBanAllCommentWithOptions(request, runtime);
    }

    public CancelBanCommentResponse cancelBanCommentWithOptions(CancelBanCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.banCommentUser)) {
            body.put("BanCommentUser", request.banCommentUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelBanComment"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelBanCommentResponse());
    }

    public CancelBanCommentResponse cancelBanComment(CancelBanCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelBanCommentWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateId)) {
            body.put("AppTemplateId", request.appTemplateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateAppTemplateResponse createAppTemplateWithOptions(CreateAppTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppTemplateShrinkRequest request = new CreateAppTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.componentList)) {
            request.componentListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.componentList, "ComponentList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateName)) {
            body.put("AppTemplateName", request.appTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentListShrink)) {
            body.put("ComponentList", request.componentListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationMode)) {
            body.put("IntegrationMode", request.integrationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppTemplate"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppTemplateResponse());
    }

    public CreateAppTemplateResponse createAppTemplate(CreateAppTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppTemplateWithOptions(request, runtime);
    }

    public CreateClassResponse createClassWithOptions(CreateClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createNickname)) {
            body.put("CreateNickname", request.createNickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserId)) {
            body.put("CreateUserId", request.createUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClass"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClassResponse());
    }

    public CreateClassResponse createClass(CreateClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClassWithOptions(request, runtime);
    }

    public CreateConferenceResponse createConferenceWithOptions(CreateConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConference"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConferenceResponse());
    }

    public CreateConferenceResponse createConference(CreateConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConferenceWithOptions(request, runtime);
    }

    public CreateLiveResponse createLiveWithOptions(CreateLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anchorId)) {
            body.put("AnchorId", request.anchorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeLevel)) {
            body.put("CodeLevel", request.codeLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.introduction)) {
            body.put("Introduction", request.introduction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLive"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLiveResponse());
    }

    public CreateLiveResponse createLive(CreateLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLiveWithOptions(request, runtime);
    }

    public CreateLiveRoomResponse createLiveRoomWithOptions(CreateLiveRoomRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLiveRoomShrinkRequest request = new CreateLiveRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extension)) {
            request.extensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extension, "Extension", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anchorId)) {
            body.put("AnchorId", request.anchorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anchorNick)) {
            body.put("AnchorNick", request.anchorNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            body.put("CoverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionShrink)) {
            body.put("Extension", request.extensionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notice)) {
            body.put("Notice", request.notice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLiveRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLiveRoomResponse());
    }

    public CreateLiveRoomResponse createLiveRoom(CreateLiveRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLiveRoomWithOptions(request, runtime);
    }

    public CreateRoomResponse createRoomWithOptions(CreateRoomRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRoomShrinkRequest request = new CreateRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extension)) {
            request.extensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extension, "Extension", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionShrink)) {
            body.put("Extension", request.extensionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notice)) {
            body.put("Notice", request.notice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomOwnerId)) {
            body.put("RoomOwnerId", request.roomOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoomResponse());
    }

    public CreateRoomResponse createRoom(CreateRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoomWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public DeleteAppTemplateResponse deleteAppTemplateWithOptions(DeleteAppTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateId)) {
            body.put("AppTemplateId", request.appTemplateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppTemplate"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppTemplateResponse());
    }

    public DeleteAppTemplateResponse deleteAppTemplate(DeleteAppTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppTemplateWithOptions(request, runtime);
    }

    public DeleteClassResponse deleteClassWithOptions(DeleteClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClass"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClassResponse());
    }

    public DeleteClassResponse deleteClass(DeleteClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClassWithOptions(request, runtime);
    }

    public DeleteCommentResponse deleteCommentWithOptions(DeleteCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commentIdList)) {
            bodyFlat.put("CommentIdList", request.commentIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComment"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCommentResponse());
    }

    public DeleteCommentResponse deleteComment(DeleteCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCommentWithOptions(request, runtime);
    }

    public DeleteConferenceResponse deleteConferenceWithOptions(DeleteConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConference"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConferenceResponse());
    }

    public DeleteConferenceResponse deleteConference(DeleteConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConferenceWithOptions(request, runtime);
    }

    public DeleteLiveResponse deleteLiveWithOptions(DeleteLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLive"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveResponse());
    }

    public DeleteLiveResponse deleteLive(DeleteLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveWithOptions(request, runtime);
    }

    public DeleteLiveRoomResponse deleteLiveRoomWithOptions(DeleteLiveRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveRoomResponse());
    }

    public DeleteLiveRoomResponse deleteLiveRoom(DeleteLiveRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveRoomWithOptions(request, runtime);
    }

    public DeleteRoomResponse deleteRoomWithOptions(DeleteRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoomResponse());
    }

    public DeleteRoomResponse deleteRoom(DeleteRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRoomWithOptions(request, runtime);
    }

    public GetAppResponse getAppWithOptions(GetAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApp"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppResponse());
    }

    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    public GetAppTemplateResponse getAppTemplateWithOptions(GetAppTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateId)) {
            body.put("AppTemplateId", request.appTemplateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppTemplate"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppTemplateResponse());
    }

    public GetAppTemplateResponse getAppTemplate(GetAppTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppTemplateWithOptions(request, runtime);
    }

    public GetAuthTokenResponse getAuthTokenWithOptions(GetAuthTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthToken"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthTokenResponse());
    }

    public GetAuthTokenResponse getAuthToken(GetAuthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthTokenWithOptions(request, runtime);
    }

    public GetClassDetailResponse getClassDetailWithOptions(GetClassDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClassDetail"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClassDetailResponse());
    }

    public GetClassDetailResponse getClassDetail(GetClassDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClassDetailWithOptions(request, runtime);
    }

    public GetClassRecordResponse getClassRecordWithOptions(GetClassRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClassRecord"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClassRecordResponse());
    }

    public GetClassRecordResponse getClassRecord(GetClassRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClassRecordWithOptions(request, runtime);
    }

    public GetConferenceResponse getConferenceWithOptions(GetConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConference"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConferenceResponse());
    }

    public GetConferenceResponse getConference(GetConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConferenceWithOptions(request, runtime);
    }

    public GetDomainOwnerVerifyContentResponse getDomainOwnerVerifyContentWithOptions(GetDomainOwnerVerifyContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveDomainName)) {
            body.put("LiveDomainName", request.liveDomainName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainOwnerVerifyContent"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainOwnerVerifyContentResponse());
    }

    public GetDomainOwnerVerifyContentResponse getDomainOwnerVerifyContent(GetDomainOwnerVerifyContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainOwnerVerifyContentWithOptions(request, runtime);
    }

    public GetImpProductStatusResponse getImpProductStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImpProductStatus"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImpProductStatusResponse());
    }

    public GetImpProductStatusResponse getImpProductStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImpProductStatusWithOptions(runtime);
    }

    public GetLiveResponse getLiveWithOptions(GetLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLive"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveResponse());
    }

    public GetLiveResponse getLive(GetLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveWithOptions(request, runtime);
    }

    public GetLiveDomainStatusResponse getLiveDomainStatusWithOptions(GetLiveDomainStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetLiveDomainStatusShrinkRequest request = new GetLiveDomainStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.liveDomainList)) {
            request.liveDomainListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.liveDomainList, "LiveDomainList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveDomainListShrink)) {
            body.put("LiveDomainList", request.liveDomainListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveDomainType)) {
            body.put("LiveDomainType", request.liveDomainType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveDomainStatus"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveDomainStatusResponse());
    }

    public GetLiveDomainStatusResponse getLiveDomainStatus(GetLiveDomainStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveDomainStatusWithOptions(request, runtime);
    }

    public GetLiveRoomResponse getLiveRoomWithOptions(GetLiveRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveRoomResponse());
    }

    public GetLiveRoomResponse getLiveRoom(GetLiveRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveRoomWithOptions(request, runtime);
    }

    public GetLiveRoomStatisticsResponse getLiveRoomStatisticsWithOptions(GetLiveRoomStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveRoomStatistics"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveRoomStatisticsResponse());
    }

    public GetLiveRoomStatisticsResponse getLiveRoomStatistics(GetLiveRoomStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveRoomStatisticsWithOptions(request, runtime);
    }

    public GetLiveRoomUserStatisticsResponse getLiveRoomUserStatisticsWithOptions(GetLiveRoomUserStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveRoomUserStatistics"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveRoomUserStatisticsResponse());
    }

    public GetLiveRoomUserStatisticsResponse getLiveRoomUserStatistics(GetLiveRoomUserStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveRoomUserStatisticsWithOptions(request, runtime);
    }

    public GetRoomResponse getRoomWithOptions(GetRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoomResponse());
    }

    public GetRoomResponse getRoom(GetRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoomWithOptions(request, runtime);
    }

    public GetStandardRoomHttpsCertificateResponse getStandardRoomHttpsCertificateWithOptions(GetStandardRoomHttpsCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            body.put("CertificateId", request.certificateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandardRoomHttpsCertificate"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardRoomHttpsCertificateResponse());
    }

    public GetStandardRoomHttpsCertificateResponse getStandardRoomHttpsCertificate(GetStandardRoomHttpsCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStandardRoomHttpsCertificateWithOptions(request, runtime);
    }

    public GetStandardRoomJumpUrlResponse getStandardRoomJumpUrlWithOptions(GetStandardRoomJumpUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("UserNick", request.userNick);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandardRoomJumpUrl"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardRoomJumpUrlResponse());
    }

    public GetStandardRoomJumpUrlResponse getStandardRoomJumpUrl(GetStandardRoomJumpUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStandardRoomJumpUrlWithOptions(request, runtime);
    }

    public ListAppTemplatesResponse listAppTemplatesWithOptions(ListAppTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppTemplates"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppTemplatesResponse());
    }

    public ListAppTemplatesResponse listAppTemplates(ListAppTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppTemplatesWithOptions(request, runtime);
    }

    public ListApplyLinkMicUsersResponse listApplyLinkMicUsersWithOptions(ListApplyLinkMicUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplyLinkMicUsers"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplyLinkMicUsersResponse());
    }

    public ListApplyLinkMicUsersResponse listApplyLinkMicUsers(ListApplyLinkMicUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApplyLinkMicUsersWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.integrationMode)) {
            body.put("IntegrationMode", request.integrationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApps"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public ListClassesResponse listClassesWithOptions(ListClassesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClasses"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClassesResponse());
    }

    public ListClassesResponse listClasses(ListClassesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClassesWithOptions(request, runtime);
    }

    public ListCommentsResponse listCommentsWithOptions(ListCommentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            body.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComments"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommentsResponse());
    }

    public ListCommentsResponse listComments(ListCommentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCommentsWithOptions(request, runtime);
    }

    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateId)) {
            body.put("AppTemplateId", request.appTemplateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponents"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentsResponse());
    }

    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listComponentsWithOptions(request, runtime);
    }

    public ListConferenceUsersResponse listConferenceUsersWithOptions(ListConferenceUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConferenceUsers"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConferenceUsersResponse());
    }

    public ListConferenceUsersResponse listConferenceUsers(ListConferenceUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConferenceUsersWithOptions(request, runtime);
    }

    public ListLiveRoomsResponse listLiveRoomsWithOptions(ListLiveRoomsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveRooms"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveRoomsResponse());
    }

    public ListLiveRoomsResponse listLiveRooms(ListLiveRoomsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLiveRoomsWithOptions(request, runtime);
    }

    public ListLiveRoomsByIdResponse listLiveRoomsByIdWithOptions(ListLiveRoomsByIdRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListLiveRoomsByIdShrinkRequest request = new ListLiveRoomsByIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.liveIdList)) {
            request.liveIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.liveIdList, "LiveIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveIdListShrink)) {
            body.put("LiveIdList", request.liveIdListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveRoomsById"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveRoomsByIdResponse());
    }

    public ListLiveRoomsByIdResponse listLiveRoomsById(ListLiveRoomsByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLiveRoomsByIdWithOptions(request, runtime);
    }

    public ListRoomLivesResponse listRoomLivesWithOptions(ListRoomLivesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListRoomLivesShrinkRequest request = new ListRoomLivesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomIdList)) {
            request.roomIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomIdList, "RoomIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTimestamp)) {
            body.put("QueryTimestamp", request.queryTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomIdListShrink)) {
            body.put("RoomIdList", request.roomIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoomLives"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoomLivesResponse());
    }

    public ListRoomLivesResponse listRoomLives(ListRoomLivesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRoomLivesWithOptions(request, runtime);
    }

    public ListRoomUsersResponse listRoomUsersWithOptions(ListRoomUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoomUsers"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoomUsersResponse());
    }

    public ListRoomUsersResponse listRoomUsers(ListRoomUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRoomUsersWithOptions(request, runtime);
    }

    public ListRoomsResponse listRoomsWithOptions(ListRoomsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRooms"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoomsResponse());
    }

    public ListRoomsResponse listRooms(ListRoomsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRoomsWithOptions(request, runtime);
    }

    public PublishLiveResponse publishLiveWithOptions(PublishLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishLive"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishLiveResponse());
    }

    public PublishLiveResponse publishLive(PublishLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishLiveWithOptions(request, runtime);
    }

    public PublishLiveRoomResponse publishLiveRoomWithOptions(PublishLiveRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishLiveRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishLiveRoomResponse());
    }

    public PublishLiveRoomResponse publishLiveRoom(PublishLiveRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishLiveRoomWithOptions(request, runtime);
    }

    public RejectLinkMicResponse rejectLinkMicWithOptions(RejectLinkMicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromUserId)) {
            body.put("FromUserId", request.fromUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toUserId)) {
            body.put("ToUserId", request.toUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectLinkMic"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectLinkMicResponse());
    }

    public RejectLinkMicResponse rejectLinkMic(RejectLinkMicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rejectLinkMicWithOptions(request, runtime);
    }

    public RemoveMemberResponse removeMemberWithOptions(RemoveMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromUserId)) {
            body.put("FromUserId", request.fromUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toUserId)) {
            body.put("ToUserId", request.toUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveMember"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveMemberResponse());
    }

    public RemoveMemberResponse removeMember(RemoveMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeMemberWithOptions(request, runtime);
    }

    public SendCommentResponse sendCommentWithOptions(SendCommentRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendCommentShrinkRequest request = new SendCommentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extension)) {
            request.extensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extension, "Extension", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionShrink)) {
            body.put("Extension", request.extensionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            body.put("SenderId", request.senderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderNick)) {
            body.put("SenderNick", request.senderNick);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendComment"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCommentResponse());
    }

    public SendCommentResponse sendComment(SendCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCommentWithOptions(request, runtime);
    }

    public SendCustomMessageToAllResponse sendCustomMessageToAllWithOptions(SendCustomMessageToAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCustomMessageToAll"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCustomMessageToAllResponse());
    }

    public SendCustomMessageToAllResponse sendCustomMessageToAll(SendCustomMessageToAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCustomMessageToAllWithOptions(request, runtime);
    }

    public SendCustomMessageToUsersResponse sendCustomMessageToUsersWithOptions(SendCustomMessageToUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("Body", request.body);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.receiverList)) {
            bodyFlat.put("ReceiverList", request.receiverList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCustomMessageToUsers"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCustomMessageToUsersResponse());
    }

    public SendCustomMessageToUsersResponse sendCustomMessageToUsers(SendCustomMessageToUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCustomMessageToUsersWithOptions(request, runtime);
    }

    public StopClassResponse stopClassWithOptions(StopClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopClass"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopClassResponse());
    }

    public StopClassResponse stopClass(StopClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopClassWithOptions(request, runtime);
    }

    public StopLiveResponse stopLiveWithOptions(StopLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopLive"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLiveResponse());
    }

    public StopLiveResponse stopLive(StopLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLiveWithOptions(request, runtime);
    }

    public StopLiveRoomResponse stopLiveRoomWithOptions(StopLiveRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopLiveRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLiveRoomResponse());
    }

    public StopLiveRoomResponse stopLiveRoom(StopLiveRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLiveRoomWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appStatus)) {
            body.put("AppStatus", request.appStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApp"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }

    public UpdateAppTemplateResponse updateAppTemplateWithOptions(UpdateAppTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAppTemplateShrinkRequest request = new UpdateAppTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.componentList)) {
            request.componentListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.componentList, "ComponentList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateId)) {
            body.put("AppTemplateId", request.appTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateName)) {
            body.put("AppTemplateName", request.appTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentListShrink)) {
            body.put("ComponentList", request.componentListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppTemplate"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppTemplateResponse());
    }

    public UpdateAppTemplateResponse updateAppTemplate(UpdateAppTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppTemplateWithOptions(request, runtime);
    }

    public UpdateAppTemplateConfigResponse updateAppTemplateConfigWithOptions(UpdateAppTemplateConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAppTemplateConfigShrinkRequest request = new UpdateAppTemplateConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configList)) {
            request.configListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configList, "ConfigList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateId)) {
            body.put("AppTemplateId", request.appTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configListShrink)) {
            body.put("ConfigList", request.configListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppTemplateConfig"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppTemplateConfigResponse());
    }

    public UpdateAppTemplateConfigResponse updateAppTemplateConfig(UpdateAppTemplateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppTemplateConfigWithOptions(request, runtime);
    }

    public UpdateClassResponse updateClassWithOptions(UpdateClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createNickname)) {
            body.put("CreateNickname", request.createNickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserId)) {
            body.put("CreateUserId", request.createUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClass"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClassResponse());
    }

    public UpdateClassResponse updateClass(UpdateClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClassWithOptions(request, runtime);
    }

    public UpdateConferenceResponse updateConferenceWithOptions(UpdateConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConference"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConferenceResponse());
    }

    public UpdateConferenceResponse updateConference(UpdateConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConferenceWithOptions(request, runtime);
    }

    public UpdateLiveResponse updateLiveWithOptions(UpdateLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.introduction)) {
            body.put("Introduction", request.introduction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLive"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLiveResponse());
    }

    public UpdateLiveResponse updateLive(UpdateLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveWithOptions(request, runtime);
    }

    public UpdateLiveRoomResponse updateLiveRoomWithOptions(UpdateLiveRoomRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLiveRoomShrinkRequest request = new UpdateLiveRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extension)) {
            request.extensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extension, "Extension", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anchorId)) {
            body.put("AnchorId", request.anchorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anchorNick)) {
            body.put("AnchorNick", request.anchorNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            body.put("CoverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionShrink)) {
            body.put("Extension", request.extensionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notice)) {
            body.put("Notice", request.notice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLiveRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLiveRoomResponse());
    }

    public UpdateLiveRoomResponse updateLiveRoom(UpdateLiveRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveRoomWithOptions(request, runtime);
    }

    public UpdateRoomResponse updateRoomWithOptions(UpdateRoomRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRoomShrinkRequest request = new UpdateRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extension)) {
            request.extensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extension, "Extension", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionShrink)) {
            body.put("Extension", request.extensionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notice)) {
            body.put("Notice", request.notice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomOwnerId)) {
            body.put("RoomOwnerId", request.roomOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRoom"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoomResponse());
    }

    public UpdateRoomResponse updateRoom(UpdateRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRoomWithOptions(request, runtime);
    }

    public VerifyDomainOwnerResponse verifyDomainOwnerWithOptions(VerifyDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveDomainName)) {
            body.put("LiveDomainName", request.liveDomainName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyDomainOwner"),
            new TeaPair("version", "2021-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyDomainOwnerResponse());
    }

    public VerifyDomainOwnerResponse verifyDomainOwner(VerifyDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyDomainOwnerWithOptions(request, runtime);
    }
}

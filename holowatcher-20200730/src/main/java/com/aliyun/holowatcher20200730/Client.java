// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730;

import com.aliyun.tea.*;
import com.aliyun.holowatcher20200730.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "holowatcher.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("holowatcher", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivateUserResponse activateUserWithOptions(ActivateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateUser"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateUserResponse());
    }

    public ActivateUserResponse activateUser(ActivateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateUserWithOptions(request, runtime);
    }

    public AddQRCodeResponse addQRCodeWithOptions(AddQRCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddQRCode"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddQRCodeResponse());
    }

    public AddQRCodeResponse addQRCode(AddQRCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addQRCodeWithOptions(request, runtime);
    }

    public AlgorithmCallBackResponse algorithmCallBackWithOptions(AlgorithmCallBackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestNumber)) {
            body.put("RequestNumber", request.requestNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AlgorithmCallBack"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AlgorithmCallBackResponse());
    }

    public AlgorithmCallBackResponse algorithmCallBack(AlgorithmCallBackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.algorithmCallBackWithOptions(request, runtime);
    }

    public AlgorithmQueryModelResponse algorithmQueryModelWithOptions(AlgorithmQueryModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestNumber)) {
            body.put("RequestNumber", request.requestNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AlgorithmQueryModel"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AlgorithmQueryModelResponse());
    }

    public AlgorithmQueryModelResponse algorithmQueryModel(AlgorithmQueryModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.algorithmQueryModelWithOptions(request, runtime);
    }

    public AliyunJwtCreateCommonResponse aliyunJwtCreateCommonWithOptions(AliyunJwtCreateCommonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunAccountName)) {
            query.put("AliyunAccountName", request.aliyunAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUidType)) {
            query.put("AliyunUidType", request.aliyunUidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUid)) {
            query.put("ParentUid", request.parentUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AliyunJwtCreateCommon"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AliyunJwtCreateCommonResponse());
    }

    public AliyunJwtCreateCommonResponse aliyunJwtCreateCommon(AliyunJwtCreateCommonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.aliyunJwtCreateCommonWithOptions(request, runtime);
    }

    public AliyunMainJwtCreateResponse aliyunMainJwtCreateWithOptions(AliyunMainJwtCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUidType)) {
            query.put("AliyunUidType", request.aliyunUidType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AliyunMainJwtCreate"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AliyunMainJwtCreateResponse());
    }

    public AliyunMainJwtCreateResponse aliyunMainJwtCreate(AliyunMainJwtCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.aliyunMainJwtCreateWithOptions(request, runtime);
    }

    public AliyunRamJwtCreateResponse aliyunRamJwtCreateWithOptions(AliyunRamJwtCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUidType)) {
            query.put("AliyunUidType", request.aliyunUidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUid)) {
            query.put("ParentUid", request.parentUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AliyunRamJwtCreate"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AliyunRamJwtCreateResponse());
    }

    public AliyunRamJwtCreateResponse aliyunRamJwtCreate(AliyunRamJwtCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.aliyunRamJwtCreateWithOptions(request, runtime);
    }

    public AliyunTicketJwtCreateResponse aliyunTicketJwtCreateWithOptions(AliyunTicketJwtCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AliyunTicketJwtCreate"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AliyunTicketJwtCreateResponse());
    }

    public AliyunTicketJwtCreateResponse aliyunTicketJwtCreate(AliyunTicketJwtCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.aliyunTicketJwtCreateWithOptions(request, runtime);
    }

    public AliyunUidWhiteListResponse aliyunUidWhiteListWithOptions(AliyunUidWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AliyunUidWhiteList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AliyunUidWhiteListResponse());
    }

    public AliyunUidWhiteListResponse aliyunUidWhiteList(AliyunUidWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.aliyunUidWhiteListWithOptions(request, runtime);
    }

    public AuthorizationSaveResponse authorizationSaveWithOptions(AuthorizationSaveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationCode)) {
            body.put("AuthorizationCode", request.authorizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwt)) {
            body.put("Jwt", request.jwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneModel)) {
            body.put("PhoneModel", request.phoneModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemVersion)) {
            body.put("SystemVersion", request.systemVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizationSave"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizationSaveResponse());
    }

    public AuthorizationSaveResponse authorizationSave(AuthorizationSaveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizationSaveWithOptions(request, runtime);
    }

    public BimBuildModelResponse bimBuildModelWithOptions(BimBuildModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimBuildModel"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimBuildModelResponse());
    }

    public BimBuildModelResponse bimBuildModel(BimBuildModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimBuildModelWithOptions(request, runtime);
    }

    public BimGetStsTokenResponse bimGetStsTokenWithOptions(BimGetStsTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimGetStsToken"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimGetStsTokenResponse());
    }

    public BimGetStsTokenResponse bimGetStsToken(BimGetStsTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimGetStsTokenWithOptions(request, runtime);
    }

    public BimPreStepResponse bimPreStepWithOptions(BimPreStepRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimPreStep"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimPreStepResponse());
    }

    public BimPreStepResponse bimPreStep(BimPreStepRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimPreStepWithOptions(request, runtime);
    }

    public BimProAgainBuildModeResponse bimProAgainBuildModeWithOptions(BimProAgainBuildModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimProAgainBuildMode"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimProAgainBuildModeResponse());
    }

    public BimProAgainBuildModeResponse bimProAgainBuildMode(BimProAgainBuildModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimProAgainBuildModeWithOptions(request, runtime);
    }

    public BimProjectDeleteFileResponse bimProjectDeleteFileWithOptions(BimProjectDeleteFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimProjectDeleteFile"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimProjectDeleteFileResponse());
    }

    public BimProjectDeleteFileResponse bimProjectDeleteFile(BimProjectDeleteFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimProjectDeleteFileWithOptions(request, runtime);
    }

    public BimProjectShareModelResponse bimProjectShareModelWithOptions(BimProjectShareModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimProjectShareModel"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimProjectShareModelResponse());
    }

    public BimProjectShareModelResponse bimProjectShareModel(BimProjectShareModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimProjectShareModelWithOptions(request, runtime);
    }

    public BimRetryTransResponse bimRetryTransWithOptions(BimRetryTransRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimRetryTrans"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimRetryTransResponse());
    }

    public BimRetryTransResponse bimRetryTrans(BimRetryTransRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimRetryTransWithOptions(request, runtime);
    }

    public BimStandardAutoSalbInfoResponse bimStandardAutoSalbInfoWithOptions(BimStandardAutoSalbInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimStandardAutoSalbInfo"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimStandardAutoSalbInfoResponse());
    }

    public BimStandardAutoSalbInfoResponse bimStandardAutoSalbInfo(BimStandardAutoSalbInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimStandardAutoSalbInfoWithOptions(request, runtime);
    }

    public BimStandardDetailResponse bimStandardDetailWithOptions(BimStandardDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimStandardDetail"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimStandardDetailResponse());
    }

    public BimStandardDetailResponse bimStandardDetail(BimStandardDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimStandardDetailWithOptions(request, runtime);
    }

    public BimStandardElevationResponse bimStandardElevationWithOptions(BimStandardElevationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimStandardElevation"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimStandardElevationResponse());
    }

    public BimStandardElevationResponse bimStandardElevation(BimStandardElevationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimStandardElevationWithOptions(request, runtime);
    }

    public BimTransModelResponse bimTransModelWithOptions(BimTransModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimTransModel"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimTransModelResponse());
    }

    public BimTransModelResponse bimTransModel(BimTransModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimTransModelWithOptions(request, runtime);
    }

    public BimTransModelStatusResponse bimTransModelStatusWithOptions(BimTransModelStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BimTransModelStatusShrinkRequest request = new BimTransModelStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimTransModelStatus"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimTransModelStatusResponse());
    }

    public BimTransModelStatusResponse bimTransModelStatus(BimTransModelStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimTransModelStatusWithOptions(request, runtime);
    }

    public BimUpdateProjectResponse bimUpdateProjectWithOptions(BimUpdateProjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BimUpdateProjectShrinkRequest request = new BimUpdateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.component)) {
            request.componentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.component, "Component", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentShrink)) {
            query.put("Component", request.componentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            query.put("Remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BimUpdateProject"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BimUpdateProjectResponse());
    }

    public BimUpdateProjectResponse bimUpdateProject(BimUpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bimUpdateProjectWithOptions(request, runtime);
    }

    public CheckImageResponse checkImageWithOptions(CheckImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imagePath)) {
            query.put("ImagePath", request.imagePath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckImage"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckImageResponse());
    }

    public CheckImageResponse checkImage(CheckImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkImageWithOptions(request, runtime);
    }

    public CommonRequestResponse commonRequestWithOptions(CommonRequestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizOrderNo)) {
            query.put("BizOrderNo", request.bizOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommonRequest"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommonRequestResponse());
    }

    public CommonRequestResponse commonRequest(CommonRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commonRequestWithOptions(request, runtime);
    }

    public CompanyActivateOneResponse companyActivateOneWithOptions(CompanyActivateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyActivateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyActivateOneResponse());
    }

    public CompanyActivateOneResponse companyActivateOne(CompanyActivateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyActivateOneWithOptions(request, runtime);
    }

    public CompanyAndMainUserCreateResponse companyAndMainUserCreateWithOptions(CompanyAndMainUserCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyParams)) {
            query.put("CompanyParams", request.companyParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userParams)) {
            query.put("UserParams", request.userParams);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyAndMainUserCreate"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyAndMainUserCreateResponse());
    }

    public CompanyAndMainUserCreateResponse companyAndMainUserCreate(CompanyAndMainUserCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyAndMainUserCreateWithOptions(request, runtime);
    }

    public CompanyCreateOneResponse companyCreateOneWithOptions(CompanyCreateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyCreateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyCreateOneResponse());
    }

    public CompanyCreateOneResponse companyCreateOne(CompanyCreateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyCreateOneWithOptions(request, runtime);
    }

    public CompanyDisableOneResponse companyDisableOneWithOptions(CompanyDisableOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyDisableOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyDisableOneResponse());
    }

    public CompanyDisableOneResponse companyDisableOne(CompanyDisableOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyDisableOneWithOptions(request, runtime);
    }

    public CompanyFindAllResponse companyFindAllWithOptions(CompanyFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyFindAllResponse());
    }

    public CompanyFindAllResponse companyFindAll(CompanyFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyFindAllWithOptions(request, runtime);
    }

    public CompanyFindByIsvTypeResponse companyFindByIsvTypeWithOptions(CompanyFindByIsvTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvType)) {
            query.put("IsvType", request.isvType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyFindByIsvType"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyFindByIsvTypeResponse());
    }

    public CompanyFindByIsvTypeResponse companyFindByIsvType(CompanyFindByIsvTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyFindByIsvTypeWithOptions(request, runtime);
    }

    public CompanyFindOneResponse companyFindOneWithOptions(CompanyFindOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("CompanyId", request.companyId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyFindOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyFindOneResponse());
    }

    public CompanyFindOneResponse companyFindOne(CompanyFindOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyFindOneWithOptions(request, runtime);
    }

    public CompanyListByConditionResponse companyListByConditionWithOptions(CompanyListByConditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSeeSelf)) {
            query.put("CustomSeeSelf", request.customSeeSelf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvType)) {
            query.put("IsvType", request.isvType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportType)) {
            query.put("SupportType", request.supportType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyListByCondition"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyListByConditionResponse());
    }

    public CompanyListByConditionResponse companyListByCondition(CompanyListByConditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyListByConditionWithOptions(request, runtime);
    }

    public CompanyUpdateOneResponse companyUpdateOneWithOptions(CompanyUpdateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyUpdateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyUpdateOneResponse());
    }

    public CompanyUpdateOneResponse companyUpdateOne(CompanyUpdateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.companyUpdateOneWithOptions(request, runtime);
    }

    public CreateBimProjectResponse createBimProjectWithOptions(CreateBimProjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBimProjectShrinkRequest request = new CreateBimProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.component)) {
            request.componentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.component, "Component", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentShrink)) {
            query.put("Component", request.componentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            query.put("Remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBimProject"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBimProjectResponse());
    }

    public CreateBimProjectResponse createBimProject(CreateBimProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBimProjectWithOptions(request, runtime);
    }

    public CreateMainUserResponse createMainUserWithOptions(CreateMainUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMainUser"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMainUserResponse());
    }

    public CreateMainUserResponse createMainUser(CreateMainUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMainUserWithOptions(request, runtime);
    }

    public CreateMaterialResponse createMaterialWithOptions(CreateMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMaterial"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMaterialResponse());
    }

    public CreateMaterialResponse createMaterial(CreateMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMaterialWithOptions(request, runtime);
    }

    public CreateOrUpdateExtInfoResponse createOrUpdateExtInfoWithOptions(CreateOrUpdateExtInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateExtInfo"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateExtInfoResponse());
    }

    public CreateOrUpdateExtInfoResponse createOrUpdateExtInfo(CreateOrUpdateExtInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrUpdateExtInfoWithOptions(request, runtime);
    }

    public CreatePipelineNodeInstanceResponse createPipelineNodeInstanceWithOptions(CreatePipelineNodeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipelineNodeInstance"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineNodeInstanceResponse());
    }

    public CreatePipelineNodeInstanceResponse createPipelineNodeInstance(CreatePipelineNodeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPipelineNodeInstanceWithOptions(request, runtime);
    }

    public CreateRamUserResponse createRamUserWithOptions(CreateRamUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRamUser"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRamUserResponse());
    }

    public CreateRamUserResponse createRamUser(CreateRamUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRamUserWithOptions(request, runtime);
    }

    public CustomCreateOrderResponse customCreateOrderWithOptions(CustomCreateOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemType)) {
            query.put("ItemType", request.itemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderName)) {
            query.put("OrderName", request.orderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderPhotoContact)) {
            query.put("OrderPhotoContact", request.orderPhotoContact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.photoAddress)) {
            query.put("PhotoAddress", request.photoAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.photoEnvironment)) {
            query.put("PhotoEnvironment", request.photoEnvironment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.photoFloorNum)) {
            query.put("PhotoFloorNum", request.photoFloorNum);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CustomCreateOrder"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CustomCreateOrderResponse());
    }

    public CustomCreateOrderResponse customCreateOrder(CustomCreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.customCreateOrderWithOptions(request, runtime);
    }

    public CustomFindOrderResponse customFindOrderWithOptions(CustomFindOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderIdCipher)) {
            query.put("OrderIdCipher", request.orderIdCipher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderName)) {
            query.put("OrderName", request.orderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderState)) {
            query.put("OrderState", request.orderState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CustomFindOrder"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CustomFindOrderResponse());
    }

    public CustomFindOrderResponse customFindOrder(CustomFindOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.customFindOrderWithOptions(request, runtime);
    }

    public CustomFindOrderStatusResponse customFindOrderStatusWithOptions(CustomFindOrderStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderIdCipher)) {
            query.put("OrderIdCipher", request.orderIdCipher);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CustomFindOrderStatus"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CustomFindOrderStatusResponse());
    }

    public CustomFindOrderStatusResponse customFindOrderStatus(CustomFindOrderStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.customFindOrderStatusWithOptions(request, runtime);
    }

    public CustomGetCdnModelPathResponse customGetCdnModelPathWithOptions(CustomGetCdnModelPathRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderIdCipher)) {
            query.put("OrderIdCipher", request.orderIdCipher);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CustomGetCdnModelPath"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CustomGetCdnModelPathResponse());
    }

    public CustomGetCdnModelPathResponse customGetCdnModelPath(CustomGetCdnModelPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.customGetCdnModelPathWithOptions(request, runtime);
    }

    public DataStoreCredentialResponse dataStoreCredentialWithOptions(DataStoreCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DataStoreCredential"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DataStoreCredentialResponse());
    }

    public DataStoreCredentialResponse dataStoreCredential(DataStoreCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dataStoreCredentialWithOptions(request, runtime);
    }

    public DatasetConfigFindAllResponse datasetConfigFindAllWithOptions(DatasetConfigFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetConfigFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetConfigFindAllResponse());
    }

    public DatasetConfigFindAllResponse datasetConfigFindAll(DatasetConfigFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetConfigFindAllWithOptions(request, runtime);
    }

    public DatasetConfigFindOneResponse datasetConfigFindOneWithOptions(DatasetConfigFindOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetConfigFindOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetConfigFindOneResponse());
    }

    public DatasetConfigFindOneResponse datasetConfigFindOne(DatasetConfigFindOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetConfigFindOneWithOptions(request, runtime);
    }

    public DatasetConfigUpdateOneResponse datasetConfigUpdateOneWithOptions(DatasetConfigUpdateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetConfigUpdateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetConfigUpdateOneResponse());
    }

    public DatasetConfigUpdateOneResponse datasetConfigUpdateOne(DatasetConfigUpdateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetConfigUpdateOneWithOptions(request, runtime);
    }

    public DatasetCreateOneResponse datasetCreateOneWithOptions(DatasetCreateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.body))) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetCreateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetCreateOneResponse());
    }

    public DatasetCreateOneResponse datasetCreateOne(DatasetCreateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetCreateOneWithOptions(request, runtime);
    }

    public DatasetDeteleOneResponse datasetDeteleOneWithOptions(DatasetDeteleOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("DatasetId", request.datasetId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetDeteleOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetDeteleOneResponse());
    }

    public DatasetDeteleOneResponse datasetDeteleOne(DatasetDeteleOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetDeteleOneWithOptions(request, runtime);
    }

    public DatasetFindAllResponse datasetFindAllWithOptions(DatasetFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noProject)) {
            query.put("NoProject", request.noProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notProjectId)) {
            query.put("NotProjectId", request.notProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeId)) {
            query.put("TypeId", request.typeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetFindAllResponse());
    }

    public DatasetFindAllResponse datasetFindAll(DatasetFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetFindAllWithOptions(request, runtime);
    }

    public DatasetPublishPublishResponse datasetPublishPublishWithOptions(DatasetPublishPublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwriteLatest)) {
            query.put("OverwriteLatest", request.overwriteLatest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetPublishPublish"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetPublishPublishResponse());
    }

    public DatasetPublishPublishResponse datasetPublishPublish(DatasetPublishPublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetPublishPublishWithOptions(request, runtime);
    }

    public DatasetTypeFindAllResponse datasetTypeFindAllWithOptions(DatasetTypeFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetTypeFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetTypeFindAllResponse());
    }

    public DatasetTypeFindAllResponse datasetTypeFindAll(DatasetTypeFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetTypeFindAllWithOptions(request, runtime);
    }

    public DatasetUnbindProjectResponse datasetUnbindProjectWithOptions(DatasetUnbindProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetUnbindProject"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetUnbindProjectResponse());
    }

    public DatasetUnbindProjectResponse datasetUnbindProject(DatasetUnbindProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetUnbindProjectWithOptions(request, runtime);
    }

    public DatasetUpdateOneResponse datasetUpdateOneWithOptions(DatasetUpdateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeId)) {
            query.put("TypeId", request.typeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetUpdateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetUpdateOneResponse());
    }

    public DatasetUpdateOneResponse datasetUpdateOne(DatasetUpdateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetUpdateOneWithOptions(request, runtime);
    }

    public DatasetUploadCreateOneResponse datasetUploadCreateOneWithOptions(DatasetUploadCreateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceKey)) {
            query.put("DeviceKey", request.deviceKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetUploadCreateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetUploadCreateOneResponse());
    }

    public DatasetUploadCreateOneResponse datasetUploadCreateOne(DatasetUploadCreateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetUploadCreateOneWithOptions(request, runtime);
    }

    public DatasetUploadDeleteOneResponse datasetUploadDeleteOneWithOptions(DatasetUploadDeleteOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("UploadId", request.uploadId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetUploadDeleteOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetUploadDeleteOneResponse());
    }

    public DatasetUploadDeleteOneResponse datasetUploadDeleteOne(DatasetUploadDeleteOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetUploadDeleteOneWithOptions(request, runtime);
    }

    public DatasetUploadDeleteOssFileResponse datasetUploadDeleteOssFileWithOptions(DatasetUploadDeleteOssFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("UploadId", request.uploadId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetUploadDeleteOssFile"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetUploadDeleteOssFileResponse());
    }

    public DatasetUploadDeleteOssFileResponse datasetUploadDeleteOssFile(DatasetUploadDeleteOssFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetUploadDeleteOssFileWithOptions(request, runtime);
    }

    public DatasetUploadFindByDatasetIdResponse datasetUploadFindByDatasetIdWithOptions(DatasetUploadFindByDatasetIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetUploadFindByDatasetId"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetUploadFindByDatasetIdResponse());
    }

    public DatasetUploadFindByDatasetIdResponse datasetUploadFindByDatasetId(DatasetUploadFindByDatasetIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetUploadFindByDatasetIdWithOptions(request, runtime);
    }

    public DatasetUploadFindByProjectIdResponse datasetUploadFindByProjectIdWithOptions(DatasetUploadFindByProjectIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeId)) {
            query.put("TypeId", request.typeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetUploadFindByProjectId"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetUploadFindByProjectIdResponse());
    }

    public DatasetUploadFindByProjectIdResponse datasetUploadFindByProjectId(DatasetUploadFindByProjectIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetUploadFindByProjectIdWithOptions(request, runtime);
    }

    public DatasetUploadFindByProjectIdAppResponse datasetUploadFindByProjectIdAppWithOptions(DatasetUploadFindByProjectIdAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeId)) {
            query.put("TypeId", request.typeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DatasetUploadFindByProjectIdApp"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DatasetUploadFindByProjectIdAppResponse());
    }

    public DatasetUploadFindByProjectIdAppResponse datasetUploadFindByProjectIdApp(DatasetUploadFindByProjectIdAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.datasetUploadFindByProjectIdAppWithOptions(request, runtime);
    }

    public DelBimDrawingResponse delBimDrawingWithOptions(DelBimDrawingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelBimDrawing"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelBimDrawingResponse());
    }

    public DelBimDrawingResponse delBimDrawing(DelBimDrawingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delBimDrawingWithOptions(request, runtime);
    }

    public DelBimProjectResponse delBimProjectWithOptions(DelBimProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelBimProject"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelBimProjectResponse());
    }

    public DelBimProjectResponse delBimProject(DelBimProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delBimProjectWithOptions(request, runtime);
    }

    public DeleteMaterialResponse deleteMaterialWithOptions(DeleteMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaterial"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMaterialResponse());
    }

    public DeleteMaterialResponse deleteMaterial(DeleteMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMaterialWithOptions(request, runtime);
    }

    public DeleteMaterialsResponse deleteMaterialsWithOptions(DeleteMaterialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaterials"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMaterialsResponse());
    }

    public DeleteMaterialsResponse deleteMaterials(DeleteMaterialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMaterialsWithOptions(request, runtime);
    }

    public DeleteOneResponse deleteOneWithOptions(DeleteOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOneResponse());
    }

    public DeleteOneResponse deleteOne(DeleteOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOneWithOptions(request, runtime);
    }

    public DeleteProjectTransModelResponse deleteProjectTransModelWithOptions(DeleteProjectTransModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transModelId)) {
            query.put("TransModelId", request.transModelId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProjectTransModel"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectTransModelResponse());
    }

    public DeleteProjectTransModelResponse deleteProjectTransModel(DeleteProjectTransModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectTransModelWithOptions(request, runtime);
    }

    public DeleteQRCodeResponse deleteQRCodeWithOptions(DeleteQRCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SId)) {
            query.put("SId", request.SId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQRCode"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQRCodeResponse());
    }

    public DeleteQRCodeResponse deleteQRCode(DeleteQRCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQRCodeWithOptions(request, runtime);
    }

    public DisabelUserResponse disabelUserWithOptions(DisabelUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisabelUser"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisabelUserResponse());
    }

    public DisabelUserResponse disabelUser(DisabelUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disabelUserWithOptions(request, runtime);
    }

    public FindRegionResponse findRegionWithOptions(FindRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindRegion"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindRegionResponse());
    }

    public FindRegionResponse findRegion(FindRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findRegionWithOptions(request, runtime);
    }

    public FloorPlanResponse floorPlanWithOptions(FloorPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FloorPlan"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FloorPlanResponse());
    }

    public FloorPlanResponse floorPlan(FloorPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.floorPlanWithOptions(request, runtime);
    }

    public GetBimDrawingDetailResponse getBimDrawingDetailWithOptions(GetBimDrawingDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drawingId)) {
            query.put("DrawingId", request.drawingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimDrawingDetail"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimDrawingDetailResponse());
    }

    public GetBimDrawingDetailResponse getBimDrawingDetail(GetBimDrawingDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimDrawingDetailWithOptions(request, runtime);
    }

    public GetBimDrawingListResponse getBimDrawingListWithOptions(GetBimDrawingListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimDrawingList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimDrawingListResponse());
    }

    public GetBimDrawingListResponse getBimDrawingList(GetBimDrawingListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimDrawingListWithOptions(request, runtime);
    }

    public GetBimDrawingRenderResponse getBimDrawingRenderWithOptions(GetBimDrawingRenderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drawingId)) {
            query.put("DrawingId", request.drawingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimDrawingRender"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimDrawingRenderResponse());
    }

    public GetBimDrawingRenderResponse getBimDrawingRender(GetBimDrawingRenderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimDrawingRenderWithOptions(request, runtime);
    }

    public GetBimDrawingStatusResponse getBimDrawingStatusWithOptions(GetBimDrawingStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetBimDrawingStatusShrinkRequest request = new GetBimDrawingStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimDrawingStatus"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimDrawingStatusResponse());
    }

    public GetBimDrawingStatusResponse getBimDrawingStatus(GetBimDrawingStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimDrawingStatusWithOptions(request, runtime);
    }

    public GetBimFragmentListResponse getBimFragmentListWithOptions(GetBimFragmentListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drawingId)) {
            query.put("DrawingId", request.drawingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimFragmentList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimFragmentListResponse());
    }

    public GetBimFragmentListResponse getBimFragmentList(GetBimFragmentListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimFragmentListWithOptions(request, runtime);
    }

    public GetBimGlbModelListResponse getBimGlbModelListWithOptions(GetBimGlbModelListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimGlbModelList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimGlbModelListResponse());
    }

    public GetBimGlbModelListResponse getBimGlbModelList(GetBimGlbModelListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimGlbModelListWithOptions(request, runtime);
    }

    public GetBimModelConfigResponse getBimModelConfigWithOptions(GetBimModelConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimModelConfig"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimModelConfigResponse());
    }

    public GetBimModelConfigResponse getBimModelConfig(GetBimModelConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimModelConfigWithOptions(request, runtime);
    }

    public GetBimOriginModelResponse getBimOriginModelWithOptions(GetBimOriginModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimOriginModel"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimOriginModelResponse());
    }

    public GetBimOriginModelResponse getBimOriginModel(GetBimOriginModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimOriginModelWithOptions(request, runtime);
    }

    public GetBimProjectDetailResponse getBimProjectDetailWithOptions(GetBimProjectDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimProjectDetail"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimProjectDetailResponse());
    }

    public GetBimProjectDetailResponse getBimProjectDetail(GetBimProjectDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimProjectDetailWithOptions(request, runtime);
    }

    public GetBimProjectDrawFilesResponse getBimProjectDrawFilesWithOptions(GetBimProjectDrawFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimProjectDrawFiles"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimProjectDrawFilesResponse());
    }

    public GetBimProjectDrawFilesResponse getBimProjectDrawFiles(GetBimProjectDrawFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimProjectDrawFilesWithOptions(request, runtime);
    }

    public GetBimProjectListResponse getBimProjectListWithOptions(GetBimProjectListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimProjectList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimProjectListResponse());
    }

    public GetBimProjectListResponse getBimProjectList(GetBimProjectListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimProjectListWithOptions(request, runtime);
    }

    public GetBimProjectListStatusResponse getBimProjectListStatusWithOptions(GetBimProjectListStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetBimProjectListStatusShrinkRequest request = new GetBimProjectListStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimProjectListStatus"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimProjectListStatusResponse());
    }

    public GetBimProjectListStatusResponse getBimProjectListStatus(GetBimProjectListStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimProjectListStatusWithOptions(request, runtime);
    }

    public GetBimProjectShareModelListResponse getBimProjectShareModelListWithOptions(GetBimProjectShareModelListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            query.put("ShareId", request.shareId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimProjectShareModelList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimProjectShareModelListResponse());
    }

    public GetBimProjectShareModelListResponse getBimProjectShareModelList(GetBimProjectShareModelListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimProjectShareModelListWithOptions(request, runtime);
    }

    public GetBimStandardAutoMarkResponse getBimStandardAutoMarkWithOptions(GetBimStandardAutoMarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimStandardAutoMark"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimStandardAutoMarkResponse());
    }

    public GetBimStandardAutoMarkResponse getBimStandardAutoMark(GetBimStandardAutoMarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimStandardAutoMarkWithOptions(request, runtime);
    }

    public GetBimStandardListResponse getBimStandardListWithOptions(GetBimStandardListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimStandardList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimStandardListResponse());
    }

    public GetBimStandardListResponse getBimStandardList(GetBimStandardListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimStandardListWithOptions(request, runtime);
    }

    public GetBimStandardPlanResponse getBimStandardPlanWithOptions(GetBimStandardPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.standard)) {
            query.put("Standard", request.standard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimStandardPlan"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimStandardPlanResponse());
    }

    public GetBimStandardPlanResponse getBimStandardPlan(GetBimStandardPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimStandardPlanWithOptions(request, runtime);
    }

    public GetBimStandardRenderResponse getBimStandardRenderWithOptions(GetBimStandardRenderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimStandardRender"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimStandardRenderResponse());
    }

    public GetBimStandardRenderResponse getBimStandardRender(GetBimStandardRenderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimStandardRenderWithOptions(request, runtime);
    }

    public GetBimStandardSampleResponse getBimStandardSampleWithOptions(GetBimStandardSampleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimStandardSample"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimStandardSampleResponse());
    }

    public GetBimStandardSampleResponse getBimStandardSample(GetBimStandardSampleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimStandardSampleWithOptions(request, runtime);
    }

    public GetBimStandardStatusByIdsResponse getBimStandardStatusByIdsWithOptions(GetBimStandardStatusByIdsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetBimStandardStatusByIdsShrinkRequest request = new GetBimStandardStatusByIdsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimStandardStatusByIds"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimStandardStatusByIdsResponse());
    }

    public GetBimStandardStatusByIdsResponse getBimStandardStatusByIds(GetBimStandardStatusByIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimStandardStatusByIdsWithOptions(request, runtime);
    }

    public GetBimTaskDetailResponse getBimTaskDetailWithOptions(GetBimTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimTaskDetail"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimTaskDetailResponse());
    }

    public GetBimTaskDetailResponse getBimTaskDetail(GetBimTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimTaskDetailWithOptions(request, runtime);
    }

    public GetBimTenantFlowResponse getBimTenantFlowWithOptions(GetBimTenantFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimTenantFlow"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimTenantFlowResponse());
    }

    public GetBimTenantFlowResponse getBimTenantFlow(GetBimTenantFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimTenantFlowWithOptions(request, runtime);
    }

    public GetBimTransModelListResponse getBimTransModelListWithOptions(GetBimTransModelListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimTransModelList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimTransModelListResponse());
    }

    public GetBimTransModelListResponse getBimTransModelList(GetBimTransModelListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimTransModelListWithOptions(request, runtime);
    }

    public GetBimUploadStsTokenResponse getBimUploadStsTokenWithOptions(GetBimUploadStsTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBimUploadStsToken"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBimUploadStsTokenResponse());
    }

    public GetBimUploadStsTokenResponse getBimUploadStsToken(GetBimUploadStsTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBimUploadStsTokenWithOptions(request, runtime);
    }

    public GetCurrentUserResponse getCurrentUserWithOptions(GetCurrentUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCurrentUser"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCurrentUserResponse());
    }

    public GetCurrentUserResponse getCurrentUser(GetCurrentUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCurrentUserWithOptions(request, runtime);
    }

    public GetFormatFilePathResponse getFormatFilePathWithOptions(GetFormatFilePathRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwt)) {
            query.put("Jwt", request.jwt);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFormatFilePath"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFormatFilePathResponse());
    }

    public GetFormatFilePathResponse getFormatFilePath(GetFormatFilePathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFormatFilePathWithOptions(request, runtime);
    }

    public GetInstancesResponse getInstancesWithOptions(GetInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineNodeId)) {
            query.put("PipelineNodeId", request.pipelineNodeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstances"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstancesResponse());
    }

    public GetInstancesResponse getInstances(GetInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstancesWithOptions(request, runtime);
    }

    public GetJwtCommonResponse getJwtCommonWithOptions(GetJwtCommonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loginType)) {
            body.put("LoginType", request.loginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantUid)) {
            body.put("TenantUid", request.tenantUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJwtCommon"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJwtCommonResponse());
    }

    public GetJwtCommonResponse getJwtCommon(GetJwtCommonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJwtCommonWithOptions(request, runtime);
    }

    public GetLatestNodeByTypeResponse getLatestNodeByTypeWithOptions(GetLatestNodeByTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLatestNodeByType"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLatestNodeByTypeResponse());
    }

    public GetLatestNodeByTypeResponse getLatestNodeByType(GetLatestNodeByTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLatestNodeByTypeWithOptions(request, runtime);
    }

    public GetMaterialListResponse getMaterialListWithOptions(GetMaterialListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMaterialList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMaterialListResponse());
    }

    public GetMaterialListResponse getMaterialList(GetMaterialListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMaterialListWithOptions(request, runtime);
    }

    public GetOssCredentialResponse getOssCredentialWithOptions(GetOssCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCdn)) {
            query.put("IsCdn", request.isCdn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssCredential"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssCredentialResponse());
    }

    public GetOssCredentialResponse getOssCredential(GetOssCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOssCredentialWithOptions(request, runtime);
    }

    public GetOssCredentialsResponse getOssCredentialsWithOptions(GetOssCredentialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwt)) {
            body.put("Jwt", request.jwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssCredentials"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssCredentialsResponse());
    }

    public GetOssCredentialsResponse getOssCredentials(GetOssCredentialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOssCredentialsWithOptions(request, runtime);
    }

    public GetProjectPhaseDetailResponse getProjectPhaseDetailWithOptions(GetProjectPhaseDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectPhaseDetail"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectPhaseDetailResponse());
    }

    public GetProjectPhaseDetailResponse getProjectPhaseDetail(GetProjectPhaseDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProjectPhaseDetailWithOptions(request, runtime);
    }

    public GetStatusAndOssResponse getStatusAndOssWithOptions(GetStatusAndOssRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStatusAndOss"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStatusAndOssResponse());
    }

    public GetStatusAndOssResponse getStatusAndOss(GetStatusAndOssRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStatusAndOssWithOptions(request, runtime);
    }

    public GetTemplateListResponse getTemplateListWithOptions(GetTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.style)) {
            query.put("Style", request.style);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateList"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateListResponse());
    }

    public GetTemplateListResponse getTemplateList(GetTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateListWithOptions(request, runtime);
    }

    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pathType)) {
            query.put("PathType", request.pathType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenWithOptions(request, runtime);
    }

    public LogOperationResponse logOperationWithOptions(LogOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogOperation"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogOperationResponse());
    }

    public LogOperationResponse logOperation(LogOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.logOperationWithOptions(request, runtime);
    }

    public MaterialCreateOnePictureResponse materialCreateOnePictureWithOptions(MaterialCreateOnePictureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialCreateOnePicture"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialCreateOnePictureResponse());
    }

    public MaterialCreateOnePictureResponse materialCreateOnePicture(MaterialCreateOnePictureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialCreateOnePictureWithOptions(request, runtime);
    }

    public MaterialCreateOneVideoResponse materialCreateOneVideoWithOptions(MaterialCreateOneVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialCreateOneVideo"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialCreateOneVideoResponse());
    }

    public MaterialCreateOneVideoResponse materialCreateOneVideo(MaterialCreateOneVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialCreateOneVideoWithOptions(request, runtime);
    }

    public MaterialDeleteOneResponse materialDeleteOneWithOptions(MaterialDeleteOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialDeleteOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialDeleteOneResponse());
    }

    public MaterialDeleteOneResponse materialDeleteOne(MaterialDeleteOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialDeleteOneWithOptions(request, runtime);
    }

    public MaterialFindAllResponse materialFindAllWithOptions(MaterialFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialType)) {
            query.put("MaterialType", request.materialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialFindAllResponse());
    }

    public MaterialFindAllResponse materialFindAll(MaterialFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialFindAllWithOptions(request, runtime);
    }

    public MaterialFindAllPictureResponse materialFindAllPictureWithOptions(MaterialFindAllPictureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialFindAllPicture"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialFindAllPictureResponse());
    }

    public MaterialFindAllPictureResponse materialFindAllPicture(MaterialFindAllPictureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialFindAllPictureWithOptions(request, runtime);
    }

    public MaterialFindAllVideoResponse materialFindAllVideoWithOptions(MaterialFindAllVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialFindAllVideo"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialFindAllVideoResponse());
    }

    public MaterialFindAllVideoResponse materialFindAllVideo(MaterialFindAllVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialFindAllVideoWithOptions(request, runtime);
    }

    public MaterialFindOneResponse materialFindOneWithOptions(MaterialFindOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialFindOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialFindOneResponse());
    }

    public MaterialFindOneResponse materialFindOne(MaterialFindOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialFindOneWithOptions(request, runtime);
    }

    public MaterialFlushUploadResponse materialFlushUploadWithOptions(MaterialFlushUploadRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialFlushUpload"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialFlushUploadResponse());
    }

    public MaterialFlushUploadResponse materialFlushUpload(MaterialFlushUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialFlushUploadWithOptions(request, runtime);
    }

    public MaterialGetOssCreadentialsResponse materialGetOssCreadentialsWithOptions(MaterialGetOssCreadentialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialGetOssCreadentials"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialGetOssCreadentialsResponse());
    }

    public MaterialGetOssCreadentialsResponse materialGetOssCreadentials(MaterialGetOssCreadentialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialGetOssCreadentialsWithOptions(request, runtime);
    }

    public MaterialUpdateOneResponse materialUpdateOneWithOptions(MaterialUpdateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialUpdateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialUpdateOneResponse());
    }

    public MaterialUpdateOneResponse materialUpdateOne(MaterialUpdateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.materialUpdateOneWithOptions(request, runtime);
    }

    public OrderAssignedScanISVResponse orderAssignedScanISVWithOptions(OrderAssignedScanISVRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderAssignedScanISV"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderAssignedScanISVResponse());
    }

    public OrderAssignedScanISVResponse orderAssignedScanISV(OrderAssignedScanISVRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderAssignedScanISVWithOptions(request, runtime);
    }

    public OrderBatchCreateResponse orderBatchCreateWithOptions(OrderBatchCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderBatchCreate"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderBatchCreateResponse());
    }

    public OrderBatchCreateResponse orderBatchCreate(OrderBatchCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderBatchCreateWithOptions(request, runtime);
    }

    public OrderBatchDeleteResponse orderBatchDeleteWithOptions(OrderBatchDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderBatchDelete"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderBatchDeleteResponse());
    }

    public OrderBatchDeleteResponse orderBatchDelete(OrderBatchDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderBatchDeleteWithOptions(request, runtime);
    }

    public OrderBatchUpdateOrderStateResponse orderBatchUpdateOrderStateWithOptions(OrderBatchUpdateOrderStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderBatchUpdateOrderState"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderBatchUpdateOrderStateResponse());
    }

    public OrderBatchUpdateOrderStateResponse orderBatchUpdateOrderState(OrderBatchUpdateOrderStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderBatchUpdateOrderStateWithOptions(request, runtime);
    }

    public OrderCancelResponse orderCancelWithOptions(OrderCancelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwt)) {
            body.put("Jwt", request.jwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderCancel"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderCancelResponse());
    }

    public OrderCancelResponse orderCancel(OrderCancelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderCancelWithOptions(request, runtime);
    }

    public OrderCreateResponse orderCreateWithOptions(OrderCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwt)) {
            body.put("Jwt", request.jwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.photoPath)) {
            body.put("PhotoPath", request.photoPath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderCreate"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderCreateResponse());
    }

    public OrderCreateResponse orderCreate(OrderCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderCreateWithOptions(request, runtime);
    }

    public OrderFindAllResponse orderFindAllWithOptions(OrderFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderFindAllResponse());
    }

    public OrderFindAllResponse orderFindAll(OrderFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderFindAllWithOptions(request, runtime);
    }

    public OrderQueryByUserResponse orderQueryByUserWithOptions(OrderQueryByUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwt)) {
            body.put("Jwt", request.jwt);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderQueryByUser"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderQueryByUserResponse());
    }

    public OrderQueryByUserResponse orderQueryByUser(OrderQueryByUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderQueryByUserWithOptions(request, runtime);
    }

    public OrderQueryOneResponse orderQueryOneWithOptions(OrderQueryOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderQueryOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderQueryOneResponse());
    }

    public OrderQueryOneResponse orderQueryOne(OrderQueryOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderQueryOneWithOptions(request, runtime);
    }

    public OrderQueryOneAppResponse orderQueryOneAppWithOptions(OrderQueryOneAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderQueryOneApp"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderQueryOneAppResponse());
    }

    public OrderQueryOneAppResponse orderQueryOneApp(OrderQueryOneAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderQueryOneAppWithOptions(request, runtime);
    }

    public OrderQueryStatusResponse orderQueryStatusWithOptions(OrderQueryStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwt)) {
            body.put("Jwt", request.jwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderQueryStatus"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderQueryStatusResponse());
    }

    public OrderQueryStatusResponse orderQueryStatus(OrderQueryStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderQueryStatusWithOptions(request, runtime);
    }

    public OrderUpdateOneResponse orderUpdateOneWithOptions(OrderUpdateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderUpdateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderUpdateOneResponse());
    }

    public OrderUpdateOneResponse orderUpdateOne(OrderUpdateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderUpdateOneWithOptions(request, runtime);
    }

    public PCDatasetCreateOneResponse pCDatasetCreateOneWithOptions(PCDatasetCreateOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PCDatasetCreateOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PCDatasetCreateOneResponse());
    }

    public PCDatasetCreateOneResponse pCDatasetCreateOne(PCDatasetCreateOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pCDatasetCreateOneWithOptions(request, runtime);
    }

    public PCUploadBuildResponse pCUploadBuildWithOptions(PCUploadBuildRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PCUploadBuild"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PCUploadBuildResponse());
    }

    public PCUploadBuildResponse pCUploadBuild(PCUploadBuildRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pCUploadBuildWithOptions(request, runtime);
    }

    public PCUploadPublishResponse pCUploadPublishWithOptions(PCUploadPublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PCUploadPublish"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PCUploadPublishResponse());
    }

    public PCUploadPublishResponse pCUploadPublish(PCUploadPublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pCUploadPublishWithOptions(request, runtime);
    }

    public PipelineFindAllResponse pipelineFindAllWithOptions(PipelineFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exposed)) {
            query.put("Exposed", request.exposed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRoot)) {
            query.put("IsRoot", request.isRoot);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PipelineFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PipelineFindAllResponse());
    }

    public PipelineFindAllResponse pipelineFindAll(PipelineFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pipelineFindAllWithOptions(request, runtime);
    }

    public ProduceExpoNoticeResponse produceExpoNoticeWithOptions(ProduceExpoNoticeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProduceExpoNotice"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProduceExpoNoticeResponse());
    }

    public ProduceExpoNoticeResponse produceExpoNotice(ProduceExpoNoticeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.produceExpoNoticeWithOptions(request, runtime);
    }

    public ProduceNoticeResponse produceNoticeWithOptions(ProduceNoticeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProduceNotice"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProduceNoticeResponse());
    }

    public ProduceNoticeResponse produceNotice(ProduceNoticeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.produceNoticeWithOptions(request, runtime);
    }

    public ProjectCreateOneAPPResponse projectCreateOneAPPWithOptions(ProjectCreateOneAPPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectCreateOneAPP"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectCreateOneAPPResponse());
    }

    public ProjectCreateOneAPPResponse projectCreateOneAPP(ProjectCreateOneAPPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectCreateOneAPPWithOptions(request, runtime);
    }

    public ProjectCreateOrUpdateExtInfoResponse projectCreateOrUpdateExtInfoWithOptions(ProjectCreateOrUpdateExtInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfoStr)) {
            query.put("ExtInfoStr", request.extInfoStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectCreateOrUpdateExtInfo"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectCreateOrUpdateExtInfoResponse());
    }

    public ProjectCreateOrUpdateExtInfoResponse projectCreateOrUpdateExtInfo(ProjectCreateOrUpdateExtInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectCreateOrUpdateExtInfoWithOptions(request, runtime);
    }

    public ProjectCreateOrUpdateExtInfoAppResponse projectCreateOrUpdateExtInfoAppWithOptions(ProjectCreateOrUpdateExtInfoAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfoStr)) {
            query.put("ExtInfoStr", request.extInfoStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectCreateOrUpdateExtInfoApp"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectCreateOrUpdateExtInfoAppResponse());
    }

    public ProjectCreateOrUpdateExtInfoAppResponse projectCreateOrUpdateExtInfoApp(ProjectCreateOrUpdateExtInfoAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectCreateOrUpdateExtInfoAppWithOptions(request, runtime);
    }

    public ProjectFindAllResponse projectFindAllWithOptions(ProjectFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonParams)) {
            query.put("JsonParams", request.jsonParams);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectFindAllResponse());
    }

    public ProjectFindAllResponse projectFindAll(ProjectFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectFindAllWithOptions(request, runtime);
    }

    public ProjectFindUploadsResponse projectFindUploadsWithOptions(ProjectFindUploadsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdByCurrentUser)) {
            query.put("CreatedByCurrentUser", request.createdByCurrentUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.live)) {
            query.put("Live", request.live);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectFindUploads"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectFindUploadsResponse());
    }

    public ProjectFindUploadsResponse projectFindUploads(ProjectFindUploadsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectFindUploadsWithOptions(request, runtime);
    }

    public ProjectGetOneResponse projectGetOneWithOptions(ProjectGetOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectGetOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectGetOneResponse());
    }

    public ProjectGetOneResponse projectGetOne(ProjectGetOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectGetOneWithOptions(request, runtime);
    }

    public ProjectGetOneAppResponse projectGetOneAppWithOptions(ProjectGetOneAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectGetOneApp"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectGetOneAppResponse());
    }

    public ProjectGetOneAppResponse projectGetOneApp(ProjectGetOneAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectGetOneAppWithOptions(request, runtime);
    }

    public ProjectGetStatusAndOssResponse projectGetStatusAndOssWithOptions(ProjectGetStatusAndOssRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectGetStatusAndOss"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectGetStatusAndOssResponse());
    }

    public ProjectGetStatusAndOssResponse projectGetStatusAndOss(ProjectGetStatusAndOssRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectGetStatusAndOssWithOptions(request, runtime);
    }

    public ProjectSyncProjectStatusResponse projectSyncProjectStatusWithOptions(ProjectSyncProjectStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectSyncProjectStatus"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectSyncProjectStatusResponse());
    }

    public ProjectSyncProjectStatusResponse projectSyncProjectStatus(ProjectSyncProjectStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.projectSyncProjectStatusWithOptions(request, runtime);
    }

    public PublishGalleryResponse publishGalleryWithOptions(PublishGalleryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishGallery"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishGalleryResponse());
    }

    public PublishGalleryResponse publishGallery(PublishGalleryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishGalleryWithOptions(request, runtime);
    }

    public PublishRealResponse publishRealWithOptions(PublishRealRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishReal"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRealResponse());
    }

    public PublishRealResponse publishReal(PublishRealRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishRealWithOptions(request, runtime);
    }

    public QueryAccountLabelResponse queryAccountLabelWithOptions(QueryAccountLabelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelSeries)) {
            query.put("LabelSeries", request.labelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountLabel"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountLabelResponse());
    }

    public QueryAccountLabelResponse queryAccountLabel(QueryAccountLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountLabelWithOptions(request, runtime);
    }

    public QueryBizLogByOpTypeAndTimeResponse queryBizLogByOpTypeAndTimeWithOptions(QueryBizLogByOpTypeAndTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizLogByOpTypeAndTime"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizLogByOpTypeAndTimeResponse());
    }

    public QueryBizLogByOpTypeAndTimeResponse queryBizLogByOpTypeAndTime(QueryBizLogByOpTypeAndTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBizLogByOpTypeAndTimeWithOptions(request, runtime);
    }

    public QueryQRCodeInfoResponse queryQRCodeInfoWithOptions(QueryQRCodeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SId)) {
            query.put("SId", request.SId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQRCodeInfo"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQRCodeInfoResponse());
    }

    public QueryQRCodeInfoResponse queryQRCodeInfo(QueryQRCodeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQRCodeInfoWithOptions(request, runtime);
    }

    public ScanDataCreateProjectResponse scanDataCreateProjectWithOptions(ScanDataCreateProjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanDataCreateProjectShrinkRequest request = new ScanDataCreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createScanUserDataRequest))) {
            request.createScanUserDataRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createScanUserDataRequest), "CreateScanUserDataRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizOrderNo)) {
            query.put("BizOrderNo", request.bizOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createScanUserDataRequestShrink)) {
            query.put("CreateScanUserDataRequest", request.createScanUserDataRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectDesc)) {
            query.put("ProjectDesc", request.projectDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanDataCreateProject"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanDataCreateProjectResponse());
    }

    public ScanDataCreateProjectResponse scanDataCreateProject(ScanDataCreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataCreateProjectWithOptions(request, runtime);
    }

    public ScanDataQueryProjectResponse scanDataQueryProjectWithOptions(ScanDataQueryProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanDataQueryProject"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanDataQueryProjectResponse());
    }

    public ScanDataQueryProjectResponse scanDataQueryProject(ScanDataQueryProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataQueryProjectWithOptions(request, runtime);
    }

    public ScanDataRemoveRoleResponse scanDataRemoveRoleWithOptions(ScanDataRemoveRoleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanDataRemoveRoleShrinkRequest request = new ScanDataRemoveRoleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.removeUserDataRequest))) {
            request.removeUserDataRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.removeUserDataRequest), "RemoveUserDataRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizOrderNo)) {
            query.put("BizOrderNo", request.bizOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeUserDataRequestShrink)) {
            query.put("RemoveUserDataRequest", request.removeUserDataRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanDataRemoveRole"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanDataRemoveRoleResponse());
    }

    public ScanDataRemoveRoleResponse scanDataRemoveRole(ScanDataRemoveRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataRemoveRoleWithOptions(request, runtime);
    }

    public ScanDataShareProjectResponse scanDataShareProjectWithOptions(ScanDataShareProjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanDataShareProjectShrinkRequest request = new ScanDataShareProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.shareUserDataRequest))) {
            request.shareUserDataRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.shareUserDataRequest), "ShareUserDataRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizOrderNo)) {
            query.put("BizOrderNo", request.bizOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareUserDataRequestShrink)) {
            query.put("ShareUserDataRequest", request.shareUserDataRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanDataShareProject"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanDataShareProjectResponse());
    }

    public ScanDataShareProjectResponse scanDataShareProject(ScanDataShareProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataShareProjectWithOptions(request, runtime);
    }

    public ScanDataUpdateProjectResponse scanDataUpdateProjectWithOptions(ScanDataUpdateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizOrderNo)) {
            query.put("BizOrderNo", request.bizOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectDesc)) {
            query.put("ProjectDesc", request.projectDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMobNum)) {
            query.put("UserMobNum", request.userMobNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            query.put("UserNick", request.userNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanDataUpdateProject"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanDataUpdateProjectResponse());
    }

    public ScanDataUpdateProjectResponse scanDataUpdateProject(ScanDataUpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataUpdateProjectWithOptions(request, runtime);
    }

    public SpiltBimDrawingResponse spiltBimDrawingWithOptions(SpiltBimDrawingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drawingId)) {
            query.put("DrawingId", request.drawingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SpiltBimDrawing"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SpiltBimDrawingResponse());
    }

    public SpiltBimDrawingResponse spiltBimDrawing(SpiltBimDrawingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.spiltBimDrawingWithOptions(request, runtime);
    }

    public TestPopParamsResponse testPopParamsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestPopParams"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestPopParamsResponse());
    }

    public TestPopParamsResponse testPopParams() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testPopParamsWithOptions(runtime);
    }

    public TransTextToAudioResponse transTextToAudioWithOptions(TransTextToAudioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransTextToAudio"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransTextToAudioResponse());
    }

    public TransTextToAudioResponse transTextToAudio(TransTextToAudioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transTextToAudioWithOptions(request, runtime);
    }

    public UpdateBimFragmentResponse updateBimFragmentWithOptions(UpdateBimFragmentRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBimFragmentShrinkRequest request = new UpdateBimFragmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.coordinates)) {
            request.coordinatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.coordinates, "Coordinates", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.floorInfo))) {
            request.floorInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.floorInfo), "FloorInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildingNo)) {
            query.put("BuildingNo", request.buildingNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coordinatesShrink)) {
            query.put("Coordinates", request.coordinatesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drawingId)) {
            query.put("DrawingId", request.drawingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.floorInfoShrink)) {
            query.put("FloorInfo", request.floorInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectionMode)) {
            query.put("SelectionMode", request.selectionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subType)) {
            query.put("SubType", request.subType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suffix)) {
            query.put("Suffix", request.suffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBimFragment"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBimFragmentResponse());
    }

    public UpdateBimFragmentResponse updateBimFragment(UpdateBimFragmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBimFragmentWithOptions(request, runtime);
    }

    public UpdateBimModelConfigResponse updateBimModelConfigWithOptions(UpdateBimModelConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beamHeight)) {
            query.put("BeamHeight", request.beamHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beamMode)) {
            query.put("BeamMode", request.beamMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beamOffset)) {
            query.put("BeamOffset", request.beamOffset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.doorHeight)) {
            query.put("DoorHeight", request.doorHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.doorOffset)) {
            query.put("DoorOffset", request.doorOffset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomMode)) {
            query.put("RoomMode", request.roomMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slabMode)) {
            query.put("SlabMode", request.slabMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slabThickness)) {
            query.put("SlabThickness", request.slabThickness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.windowHeight)) {
            query.put("WindowHeight", request.windowHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.windowOffset)) {
            query.put("WindowOffset", request.windowOffset);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBimModelConfig"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBimModelConfigResponse());
    }

    public UpdateBimModelConfigResponse updateBimModelConfig(UpdateBimModelConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBimModelConfigWithOptions(request, runtime);
    }

    public UpdateBimProjectDrawFilesResponse updateBimProjectDrawFilesWithOptions(UpdateBimProjectDrawFilesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBimProjectDrawFilesShrinkRequest request = new UpdateBimProjectDrawFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.architectureFiles)) {
            request.architectureFilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.architectureFiles, "ArchitectureFiles", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.structureFiles)) {
            request.structureFilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.structureFiles, "StructureFiles", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architectureFilesShrink)) {
            query.put("ArchitectureFiles", request.architectureFilesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureFilesShrink)) {
            query.put("StructureFiles", request.structureFilesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBimProjectDrawFiles"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBimProjectDrawFilesResponse());
    }

    public UpdateBimProjectDrawFilesResponse updateBimProjectDrawFiles(UpdateBimProjectDrawFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBimProjectDrawFilesWithOptions(request, runtime);
    }

    public UpdateBimStandardDwInfoResponse updateBimStandardDwInfoWithOptions(UpdateBimStandardDwInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBimStandardDwInfoShrinkRequest request = new UpdateBimStandardDwInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            query.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            query.put("Keys", request.keysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBimStandardDwInfo"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBimStandardDwInfoResponse());
    }

    public UpdateBimStandardDwInfoResponse updateBimStandardDwInfo(UpdateBimStandardDwInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBimStandardDwInfoWithOptions(request, runtime);
    }

    public UpdateBimStandardElevationResponse updateBimStandardElevationWithOptions(UpdateBimStandardElevationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBimStandardElevationShrinkRequest request = new UpdateBimStandardElevationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.floors)) {
            request.floorsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.floors, "Floors", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.floorsShrink)) {
            query.put("Floors", request.floorsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraceHeight)) {
            query.put("TerraceHeight", request.terraceHeight);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBimStandardElevation"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBimStandardElevationResponse());
    }

    public UpdateBimStandardElevationResponse updateBimStandardElevation(UpdateBimStandardElevationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBimStandardElevationWithOptions(request, runtime);
    }

    public UpdateBimStandardSlabInfoResponse updateBimStandardSlabInfoWithOptions(UpdateBimStandardSlabInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBimStandardSlabInfoShrinkRequest request = new UpdateBimStandardSlabInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.legends)) {
            request.legendsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.legends, "Legends", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.legendsShrink)) {
            query.put("Legends", request.legendsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDir)) {
            query.put("RootDir", request.rootDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardId)) {
            query.put("StandardId", request.standardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thickness)) {
            query.put("Thickness", request.thickness);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBimStandardSlabInfo"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBimStandardSlabInfoResponse());
    }

    public UpdateBimStandardSlabInfoResponse updateBimStandardSlabInfo(UpdateBimStandardSlabInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBimStandardSlabInfoWithOptions(request, runtime);
    }

    public UpdateNoteResponse updateNoteWithOptions(UpdateNoteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNote"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNoteResponse());
    }

    public UpdateNoteResponse updateNote(UpdateNoteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNoteWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public UserFindAllResponse userFindAllWithOptions(UserFindAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserFindAll"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserFindAllResponse());
    }

    public UserFindAllResponse userFindAll(UserFindAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userFindAllWithOptions(request, runtime);
    }

    public UserFindByRolesResponse userFindByRolesWithOptions(UserFindByRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            query.put("RoleNames", request.roleNames);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserFindByRoles"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserFindByRolesResponse());
    }

    public UserFindByRolesResponse userFindByRoles(UserFindByRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userFindByRolesWithOptions(request, runtime);
    }

    public UserGetOneResponse userGetOneWithOptions(UserGetOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserGetOne"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserGetOneResponse());
    }

    public UserGetOneResponse userGetOne(UserGetOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userGetOneWithOptions(request, runtime);
    }

    public UserListMenusResponse userListMenusWithOptions(UserListMenusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserListMenus"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserListMenusResponse());
    }

    public UserListMenusResponse userListMenus(UserListMenusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userListMenusWithOptions(request, runtime);
    }

    public UserListPermissionsResponse userListPermissionsWithOptions(UserListPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserListPermissions"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserListPermissionsResponse());
    }

    public UserListPermissionsResponse userListPermissions(UserListPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userListPermissionsWithOptions(request, runtime);
    }

    public UserListRolesResponse userListRolesWithOptions(UserListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserListRoles"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserListRolesResponse());
    }

    public UserListRolesResponse userListRoles(UserListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userListRolesWithOptions(request, runtime);
    }

    public UserListSubRolesResponse userListSubRolesWithOptions(UserListSubRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserListSubRoles"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserListSubRolesResponse());
    }

    public UserListSubRolesResponse userListSubRoles(UserListSubRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userListSubRolesWithOptions(request, runtime);
    }

    public UserQueryCreatePermissionResponse userQueryCreatePermissionWithOptions(UserQueryCreatePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwt)) {
            body.put("Jwt", request.jwt);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserQueryCreatePermission"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserQueryCreatePermissionResponse());
    }

    public UserQueryCreatePermissionResponse userQueryCreatePermission(UserQueryCreatePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userQueryCreatePermissionWithOptions(request, runtime);
    }

    public ValidAliyunUidResponse validAliyunUidWithOptions(ValidAliyunUidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidAliyunUid"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidAliyunUidResponse());
    }

    public ValidAliyunUidResponse validAliyunUid(ValidAliyunUidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validAliyunUidWithOptions(request, runtime);
    }

    public ValidCompanyNameResponse validCompanyNameWithOptions(ValidCompanyNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunJwt)) {
            query.put("AliyunJwt", request.aliyunJwt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidCompanyName"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidCompanyNameResponse());
    }

    public ValidCompanyNameResponse validCompanyName(ValidCompanyNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validCompanyNameWithOptions(request, runtime);
    }

    public VrUserCreateScanUserResponse vrUserCreateScanUserWithOptions(VrUserCreateScanUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizOrderNo)) {
            query.put("BizOrderNo", request.bizOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VrUserCreateScanUser"),
            new TeaPair("version", "2020-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VrUserCreateScanUserResponse());
    }

    public VrUserCreateScanUserResponse vrUserCreateScanUser(VrUserCreateScanUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.vrUserCreateScanUserWithOptions(request, runtime);
    }
}

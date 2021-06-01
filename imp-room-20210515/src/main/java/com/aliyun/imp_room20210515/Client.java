// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515;

import com.aliyun.tea.*;
import com.aliyun.imp_room20210515.models.*;
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
        this._endpoint = this.getEndpoint("imp-room", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetLoginTokenResponse getLoginTokenWithOptions(GetLoginTokenRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetLoginTokenShrinkRequest request = new GetLoginTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLoginToken", "2021-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetLoginTokenResponse());
    }

    public GetLoginTokenResponse getLoginToken(GetLoginTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoginTokenWithOptions(request, runtime);
    }

    public CreateRoomResponse createRoomWithOptions(CreateRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRoom", "2021-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRoomResponse());
    }

    public CreateRoomResponse createRoom(CreateRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoomWithOptions(request, runtime);
    }

    public DestroyRoomResponse destroyRoomWithOptions(DestroyRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DestroyRoom", "2021-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DestroyRoomResponse());
    }

    public DestroyRoomResponse destroyRoom(DestroyRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.destroyRoomWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2021-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public GetRoomDetailResponse getRoomDetailWithOptions(GetRoomDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRoomDetail", "2021-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetRoomDetailResponse());
    }

    public GetRoomDetailResponse getRoomDetail(GetRoomDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoomDetailWithOptions(request, runtime);
    }

    public GetRoomListResponse getRoomListWithOptions(GetRoomListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRoomList", "2021-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetRoomListResponse());
    }

    public GetRoomListResponse getRoomList(GetRoomListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoomListWithOptions(request, runtime);
    }
}

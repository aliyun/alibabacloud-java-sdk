// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104;

import com.aliyun.tea.*;
import com.aliyun.lvwangwatermark20210104.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("lvwangwatermark", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAudioAsyncResponse addAudioAsyncWithOptions(AddAudioAsyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAudioAsync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new AddAudioAsyncResponse());
    }

    public AddAudioAsyncResponse addAudioAsync(AddAudioAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAudioAsyncWithOptions(request, runtime);
    }

    public AddDocAsyncResponse addDocAsyncWithOptions(AddDocAsyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDocAsync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new AddDocAsyncResponse());
    }

    public AddDocAsyncResponse addDocAsync(AddDocAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDocAsyncWithOptions(request, runtime);
    }

    public AddImageAsyncResponse addImageAsyncWithOptions(AddImageAsyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddImageAsync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new AddImageAsyncResponse());
    }

    public AddImageAsyncResponse addImageAsync(AddImageAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addImageAsyncWithOptions(request, runtime);
    }

    public AddImageSyncResponse addImageSyncWithOptions(AddImageSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddImageSync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new AddImageSyncResponse());
    }

    public AddImageSyncResponse addImageSync(AddImageSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addImageSyncWithOptions(request, runtime);
    }

    public AddVideoAsyncResponse addVideoAsyncWithOptions(AddVideoAsyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVideoAsync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new AddVideoAsyncResponse());
    }

    public AddVideoAsyncResponse addVideoAsync(AddVideoAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVideoAsyncWithOptions(request, runtime);
    }

    public GetAudioAddResponse getAudioAddWithOptions(GetAudioAddRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAudioAdd", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetAudioAddResponse());
    }

    public GetAudioAddResponse getAudioAdd(GetAudioAddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAudioAddWithOptions(request, runtime);
    }

    public GetAudioAsyncResponse getAudioAsyncWithOptions(GetAudioAsyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAudioAsync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetAudioAsyncResponse());
    }

    public GetAudioAsyncResponse getAudioAsync(GetAudioAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAudioAsyncWithOptions(request, runtime);
    }

    public GetAudioExtractResponse getAudioExtractWithOptions(GetAudioExtractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAudioExtract", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetAudioExtractResponse());
    }

    public GetAudioExtractResponse getAudioExtract(GetAudioExtractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAudioExtractWithOptions(request, runtime);
    }

    public GetAudioTraceResponse getAudioTraceWithOptions(GetAudioTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAudioTrace", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetAudioTraceResponse());
    }

    public GetAudioTraceResponse getAudioTrace(GetAudioTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAudioTraceWithOptions(request, runtime);
    }

    public GetDocAddResponse getDocAddWithOptions(GetDocAddRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDocAdd", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetDocAddResponse());
    }

    public GetDocAddResponse getDocAdd(GetDocAddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDocAddWithOptions(request, runtime);
    }

    public GetDocAsyncResponse getDocAsyncWithOptions(GetDocAsyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDocAsync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetDocAsyncResponse());
    }

    public GetDocAsyncResponse getDocAsync(GetDocAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDocAsyncWithOptions(request, runtime);
    }

    public GetDocExtractResponse getDocExtractWithOptions(GetDocExtractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDocExtract", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetDocExtractResponse());
    }

    public GetDocExtractResponse getDocExtract(GetDocExtractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDocExtractWithOptions(request, runtime);
    }

    public GetImageAsyncResponse getImageAsyncWithOptions(GetImageAsyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImageAsync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageAsyncResponse());
    }

    public GetImageAsyncResponse getImageAsync(GetImageAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageAsyncWithOptions(request, runtime);
    }

    public GetImageSyncResponse getImageSyncWithOptions(GetImageSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImageSync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageSyncResponse());
    }

    public GetImageSyncResponse getImageSync(GetImageSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageSyncWithOptions(request, runtime);
    }

    public GetQueryTraceFileResponse getQueryTraceFileWithOptions(GetQueryTraceFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQueryTraceFile", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetQueryTraceFileResponse());
    }

    public GetQueryTraceFileResponse getQueryTraceFile(GetQueryTraceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQueryTraceFileWithOptions(request, runtime);
    }

    public GetVideoAddResponse getVideoAddWithOptions(GetVideoAddRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoAdd", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoAddResponse());
    }

    public GetVideoAddResponse getVideoAdd(GetVideoAddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoAddWithOptions(request, runtime);
    }

    public GetVideoAsyncResponse getVideoAsyncWithOptions(GetVideoAsyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoAsync", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoAsyncResponse());
    }

    public GetVideoAsyncResponse getVideoAsync(GetVideoAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoAsyncWithOptions(request, runtime);
    }

    public GetVideoExtractResponse getVideoExtractWithOptions(GetVideoExtractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoExtract", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoExtractResponse());
    }

    public GetVideoExtractResponse getVideoExtract(GetVideoExtractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoExtractWithOptions(request, runtime);
    }

    public GetVideoTraceResponse getVideoTraceWithOptions(GetVideoTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoTrace", "2021-01-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoTraceResponse());
    }

    public GetVideoTraceResponse getVideoTrace(GetVideoTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoTraceWithOptions(request, runtime);
    }
}

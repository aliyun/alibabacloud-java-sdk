// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308;

import com.aliyun.tea.*;
import com.aliyun.ivision20190308.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ivision", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public StartStreamPredictResponse startStreamPredictWithOptions(StartStreamPredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartStreamPredict", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new StartStreamPredictResponse());
    }

    public StartStreamPredictResponse startStreamPredict(StartStreamPredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startStreamPredictWithOptions(request, runtime);
    }

    public CreateFilePredictResponse createFilePredictWithOptions(CreateFilePredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFilePredict", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFilePredictResponse());
    }

    public CreateFilePredictResponse createFilePredict(CreateFilePredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFilePredictWithOptions(request, runtime);
    }

    public StopStreamPredictResponse stopStreamPredictWithOptions(StopStreamPredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopStreamPredict", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new StopStreamPredictResponse());
    }

    public StopStreamPredictResponse stopStreamPredict(StopStreamPredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopStreamPredictWithOptions(request, runtime);
    }

    public DescribeStreamPredictsResponse describeStreamPredictsWithOptions(DescribeStreamPredictsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStreamPredicts", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStreamPredictsResponse());
    }

    public DescribeStreamPredictsResponse describeStreamPredicts(DescribeStreamPredictsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStreamPredictsWithOptions(request, runtime);
    }

    public DescribeFaceGroupsResponse describeFaceGroupsWithOptions(DescribeFaceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFaceGroups", "2019-03-08", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeFaceGroupsResponse());
    }

    public DescribeFaceGroupsResponse describeFaceGroups(DescribeFaceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFaceGroupsWithOptions(request, runtime);
    }

    public CreateFaceGroupResponse createFaceGroupWithOptions(CreateFaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFaceGroup", "2019-03-08", "HTTPS", "GET", "AK", "json", req, runtime), new CreateFaceGroupResponse());
    }

    public CreateFaceGroupResponse createFaceGroup(CreateFaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFaceGroupWithOptions(request, runtime);
    }

    public SearchFaceResponse searchFaceWithOptions(SearchFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchFace", "2019-03-08", "HTTPS", "GET", "AK", "json", req, runtime), new SearchFaceResponse());
    }

    public SearchFaceResponse searchFace(SearchFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchFaceWithOptions(request, runtime);
    }

    public RegisterFaceResponse registerFaceWithOptions(RegisterFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterFace", "2019-03-08", "HTTPS", "GET", "AK", "json", req, runtime), new RegisterFaceResponse());
    }

    public RegisterFaceResponse registerFace(RegisterFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerFaceWithOptions(request, runtime);
    }

    public DeleteFilePredictResponse deleteFilePredictWithOptions(DeleteFilePredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFilePredict", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFilePredictResponse());
    }

    public DeleteFilePredictResponse deleteFilePredict(DeleteFilePredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFilePredictWithOptions(request, runtime);
    }

    public ListMyAlgorithmResponse listMyAlgorithmWithOptions(ListMyAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMyAlgorithm", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListMyAlgorithmResponse());
    }

    public ListMyAlgorithmResponse listMyAlgorithm(ListMyAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMyAlgorithmWithOptions(request, runtime);
    }

    public DeleteFaceGroupResponse deleteFaceGroupWithOptions(DeleteFaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFaceGroup", "2019-03-08", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteFaceGroupResponse());
    }

    public DeleteFaceGroupResponse deleteFaceGroup(DeleteFaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceGroupWithOptions(request, runtime);
    }

    public DescribeStreamPredictResultResponse describeStreamPredictResultWithOptions(DescribeStreamPredictResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStreamPredictResult", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStreamPredictResultResponse());
    }

    public DescribeStreamPredictResultResponse describeStreamPredictResult(DescribeStreamPredictResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStreamPredictResultWithOptions(request, runtime);
    }

    public CreateStreamPredictResponse createStreamPredictWithOptions(CreateStreamPredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateStreamPredict", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateStreamPredictResponse());
    }

    public CreateStreamPredictResponse createStreamPredict(CreateStreamPredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStreamPredictWithOptions(request, runtime);
    }

    public ImagePredictResponse imagePredictWithOptions(ImagePredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ImagePredict", "2019-03-08", "HTTPS", "GET", "AK", "json", req, runtime), new ImagePredictResponse());
    }

    public ImagePredictResponse imagePredict(ImagePredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.imagePredictWithOptions(request, runtime);
    }

    public DeleteStreamPredictResponse deleteStreamPredictWithOptions(DeleteStreamPredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteStreamPredict", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteStreamPredictResponse());
    }

    public DeleteStreamPredictResponse deleteStreamPredict(DeleteStreamPredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStreamPredictWithOptions(request, runtime);
    }

    public GetAlgorithmDetailResponse getAlgorithmDetailWithOptions(GetAlgorithmDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlgorithmDetail", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetAlgorithmDetailResponse());
    }

    public GetAlgorithmDetailResponse getAlgorithmDetail(GetAlgorithmDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlgorithmDetailWithOptions(request, runtime);
    }

    public GetAlgorithmHistogramsResponse getAlgorithmHistogramsWithOptions(GetAlgorithmHistogramsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlgorithmHistograms", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetAlgorithmHistogramsResponse());
    }

    public GetAlgorithmHistogramsResponse getAlgorithmHistograms(GetAlgorithmHistogramsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlgorithmHistogramsWithOptions(request, runtime);
    }

    public UnregisterFaceResponse unregisterFaceWithOptions(UnregisterFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UnregisterFace", "2019-03-08", "HTTPS", "GET", "AK", "json", req, runtime), new UnregisterFaceResponse());
    }

    public UnregisterFaceResponse unregisterFace(UnregisterFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unregisterFaceWithOptions(request, runtime);
    }

    public PredictPictureResponse predictPictureWithOptions(PredictPictureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PredictPicture", "2019-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new PredictPictureResponse());
    }

    public PredictPictureResponse predictPicture(PredictPictureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.predictPictureWithOptions(request, runtime);
    }
}

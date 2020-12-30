// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810;

import com.aliyun.tea.*;
import com.aliyun.multimediaai20190810.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("multimediaai", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateCoverTaskResponse createCoverTaskWithOptions(CreateCoverTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCoverTask", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCoverTaskResponse());
    }

    public CreateCoverTaskResponse createCoverTask(CreateCoverTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCoverTaskWithOptions(request, runtime);
    }

    public CreateFaceGroupResponse createFaceGroupWithOptions(CreateFaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFaceGroup", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFaceGroupResponse());
    }

    public CreateFaceGroupResponse createFaceGroup(CreateFaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFaceGroupWithOptions(request, runtime);
    }

    public CreateFacePersonResponse createFacePersonWithOptions(CreateFacePersonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFacePerson", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFacePersonResponse());
    }

    public CreateFacePersonResponse createFacePerson(CreateFacePersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFacePersonWithOptions(request, runtime);
    }

    public CreateGifTaskResponse createGifTaskWithOptions(CreateGifTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGifTask", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGifTaskResponse());
    }

    public CreateGifTaskResponse createGifTask(CreateGifTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGifTaskWithOptions(request, runtime);
    }

    public CreateLabelTaskResponse createLabelTaskWithOptions(CreateLabelTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLabelTask", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLabelTaskResponse());
    }

    public CreateLabelTaskResponse createLabelTask(CreateLabelTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLabelTaskWithOptions(request, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTemplate", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    public DeleteFaceGroupResponse deleteFaceGroupWithOptions(DeleteFaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFaceGroup", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFaceGroupResponse());
    }

    public DeleteFaceGroupResponse deleteFaceGroup(DeleteFaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceGroupWithOptions(request, runtime);
    }

    public DeleteFaceImageResponse deleteFaceImageWithOptions(DeleteFaceImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFaceImage", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFaceImageResponse());
    }

    public DeleteFaceImageResponse deleteFaceImage(DeleteFaceImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceImageWithOptions(request, runtime);
    }

    public DeleteFacePersonResponse deleteFacePersonWithOptions(DeleteFacePersonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFacePerson", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFacePersonResponse());
    }

    public DeleteFacePersonResponse deleteFacePerson(DeleteFacePersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFacePersonWithOptions(request, runtime);
    }

    public GetTaskResultResponse getTaskResultWithOptions(GetTaskResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskResult", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskResultResponse());
    }

    public GetTaskResultResponse getTaskResult(GetTaskResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskResultWithOptions(request, runtime);
    }

    public GetTaskStatusResponse getTaskStatusWithOptions(GetTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskStatus", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskStatusResponse());
    }

    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskStatusWithOptions(request, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTemplate", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new GetTemplateResponse());
    }

    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    public ListFaceGroupsResponse listFaceGroupsWithOptions(ListFaceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFaceGroups", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListFaceGroupsResponse());
    }

    public ListFaceGroupsResponse listFaceGroups(ListFaceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFaceGroupsWithOptions(request, runtime);
    }

    public ListFaceImagesResponse listFaceImagesWithOptions(ListFaceImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFaceImages", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListFaceImagesResponse());
    }

    public ListFaceImagesResponse listFaceImages(ListFaceImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFaceImagesWithOptions(request, runtime);
    }

    public ListFacePersonsResponse listFacePersonsWithOptions(ListFacePersonsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFacePersons", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListFacePersonsResponse());
    }

    public ListFacePersonsResponse listFacePersons(ListFacePersonsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFacePersonsWithOptions(request, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplates", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListTemplatesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    public ProcessFaceAlgorithmResponse processFaceAlgorithmWithOptions(ProcessFaceAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessFaceAlgorithm", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessFaceAlgorithmResponse());
    }

    public ProcessFaceAlgorithmResponse processFaceAlgorithm(ProcessFaceAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processFaceAlgorithmWithOptions(request, runtime);
    }

    public ProcessImageTagAlgorithmResponse processImageTagAlgorithmWithOptions(ProcessImageTagAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessImageTagAlgorithm", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessImageTagAlgorithmResponse());
    }

    public ProcessImageTagAlgorithmResponse processImageTagAlgorithm(ProcessImageTagAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processImageTagAlgorithmWithOptions(request, runtime);
    }

    public ProcessLandmarkAlgorithmResponse processLandmarkAlgorithmWithOptions(ProcessLandmarkAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessLandmarkAlgorithm", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessLandmarkAlgorithmResponse());
    }

    public ProcessLandmarkAlgorithmResponse processLandmarkAlgorithm(ProcessLandmarkAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processLandmarkAlgorithmWithOptions(request, runtime);
    }

    public ProcessLogoAlgorithmResponse processLogoAlgorithmWithOptions(ProcessLogoAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessLogoAlgorithm", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessLogoAlgorithmResponse());
    }

    public ProcessLogoAlgorithmResponse processLogoAlgorithm(ProcessLogoAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processLogoAlgorithmWithOptions(request, runtime);
    }

    public ProcessNewsAlgorithmResponse processNewsAlgorithmWithOptions(ProcessNewsAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessNewsAlgorithm", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessNewsAlgorithmResponse());
    }

    public ProcessNewsAlgorithmResponse processNewsAlgorithm(ProcessNewsAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processNewsAlgorithmWithOptions(request, runtime);
    }

    public ProcessNlpAlgorithmResponse processNlpAlgorithmWithOptions(ProcessNlpAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessNlpAlgorithm", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessNlpAlgorithmResponse());
    }

    public ProcessNlpAlgorithmResponse processNlpAlgorithm(ProcessNlpAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processNlpAlgorithmWithOptions(request, runtime);
    }

    public ProcessOcrAlgorithmResponse processOcrAlgorithmWithOptions(ProcessOcrAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessOcrAlgorithm", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessOcrAlgorithmResponse());
    }

    public ProcessOcrAlgorithmResponse processOcrAlgorithm(ProcessOcrAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processOcrAlgorithmWithOptions(request, runtime);
    }

    public RegisterFaceImageResponse registerFaceImageWithOptions(RegisterFaceImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterFaceImage", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterFaceImageResponse());
    }

    public RegisterFaceImageResponse registerFaceImage(RegisterFaceImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerFaceImageWithOptions(request, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTemplate", "2019-08-10", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }
}

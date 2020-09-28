// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920;

import com.aliyun.tea.*;
import com.aliyun.brain_industrial20200920.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("brain-industrial", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetOpPvCustomValuesResponse getOpPvCustomValues(GetOpPvCustomValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOpPvCustomValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetOpPvCustomValuesResponse());
    }

    public SubmitPidLoopEvaluationResponse submitPidLoopEvaluation(SubmitPidLoopEvaluationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitPidLoopEvaluation", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new SubmitPidLoopEvaluationResponse());
    }

    public GetDefaultAdjustValuesResponse getDefaultAdjustValues(GetDefaultAdjustValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDefaultAdjustValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDefaultAdjustValuesResponse());
    }

    public GetPvOpAdjustValuesResponse getPvOpAdjustValues(GetPvOpAdjustValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPvOpAdjustValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPvOpAdjustValuesResponse());
    }

    public GetPvCustomSimulationValuesResponse getPvCustomSimulationValues(GetPvCustomSimulationValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPvCustomSimulationValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPvCustomSimulationValuesResponse());
    }

    public GetIdentificateValuesResponse getIdentificateValues(GetIdentificateValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetIdentificateValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetIdentificateValuesResponse());
    }

    public GetPvIdentSimulationValuesResponse getPvIdentSimulationValues(GetPvIdentSimulationValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPvIdentSimulationValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPvIdentSimulationValuesResponse());
    }

    public GetCustomIdentValuesResponse getCustomIdentValues(GetCustomIdentValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCustomIdentValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetCustomIdentValuesResponse());
    }

    public GetPidProjectReportOverviewResponse getPidProjectReportOverview(GetPidProjectReportOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPidProjectReportOverview", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPidProjectReportOverviewResponse());
    }

    public GetLowModelPerformValuesResponse getLowModelPerformValues(GetLowModelPerformValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetLowModelPerformValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetLowModelPerformValuesResponse());
    }

    public ListPidLoopEvaluationsResponse listPidLoopEvaluations(ListPidLoopEvaluationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPidLoopEvaluations", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListPidLoopEvaluationsResponse());
    }

    public ListLoopParameterTagValuesResponse listLoopParameterTagValues(ListLoopParameterTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListLoopParameterTagValues", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListLoopParameterTagValuesResponse());
    }

    public GetPidLoopParameterResponse getPidLoopParameter(GetPidLoopParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPidLoopParameter", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPidLoopParameterResponse());
    }

    public GetDailyReportInfoResponse getDailyReportInfo(GetDailyReportInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDailyReportInfo", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDailyReportInfoResponse());
    }

    public GetPidLoopResponse getPidLoop(GetPidLoopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPidLoop", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPidLoopResponse());
    }

    public CreatePidProjectResponse createPidProject(CreatePidProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePidProject", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new CreatePidProjectResponse());
    }

    public ListIdentModelsResponse listIdentModels(ListIdentModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListIdentModels", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListIdentModelsResponse());
    }

    public ListPidDataProcessResponse listPidDataProcess(ListPidDataProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPidDataProcess", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListPidDataProcessResponse());
    }

    public AddCustomIdentModelResponse addCustomIdentModel(AddCustomIdentModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCustomIdentModel", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new AddCustomIdentModelResponse());
    }

    public GetLoopParameterStepResponse getLoopParameterStep(GetLoopParameterStepRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetLoopParameterStep", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetLoopParameterStepResponse());
    }

    public ListPidLoopsResponse listPidLoops(ListPidLoopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPidLoops", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListPidLoopsResponse());
    }

    public MovePidOrganizationResponse movePidOrganization(MovePidOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MovePidOrganization", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new MovePidOrganizationResponse());
    }

    public UpdatePidLoopResponse updatePidLoop(UpdatePidLoopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdatePidLoop", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdatePidLoopResponse());
    }

    public AddPidLoopToScheduleResponse addPidLoopToSchedule(AddPidLoopToScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddPidLoopToSchedule", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new AddPidLoopToScheduleResponse());
    }

    public GetParsingTagTaskResponse getParsingTagTask(GetParsingTagTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetParsingTagTask", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetParsingTagTaskResponse());
    }

    public GetPidLoopLatestTaskStatusResponse getPidLoopLatestTaskStatus(GetPidLoopLatestTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPidLoopLatestTaskStatus", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPidLoopLatestTaskStatusResponse());
    }

    public DeletePidLoopResponse deletePidLoop(DeletePidLoopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePidLoop", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new DeletePidLoopResponse());
    }

    public GetSummaryReportInfoResponse getSummaryReportInfo(GetSummaryReportInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSummaryReportInfo", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetSummaryReportInfoResponse());
    }

    public GetSummaryReportDataTrendResponse getSummaryReportDataTrend(GetSummaryReportDataTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSummaryReportDataTrend", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetSummaryReportDataTrendResponse());
    }

    public GetSummaryReportChartResponse getSummaryReportChart(GetSummaryReportChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSummaryReportChart", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetSummaryReportChartResponse());
    }

    public GetDailyReportDataTrendResponse getDailyReportDataTrend(GetDailyReportDataTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDailyReportDataTrend", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDailyReportDataTrendResponse());
    }

    public ListTagValueTrendResponse listTagValueTrend(ListTagValueTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagValueTrend", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListTagValueTrendResponse());
    }

    public GetDailyReportChartResponse getDailyReportChart(GetDailyReportChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDailyReportChart", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDailyReportChartResponse());
    }

    public ListPidOrganizationsResponse listPidOrganizations(ListPidOrganizationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPidOrganizations", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListPidOrganizationsResponse());
    }

    public CreatePidDataProcessesResponse createPidDataProcesses(CreatePidDataProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePidDataProcesses", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new CreatePidDataProcessesResponse());
    }

    public GetDailyReportPidParamResponse getDailyReportPidParam(GetDailyReportPidParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDailyReportPidParam", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDailyReportPidParamResponse());
    }

    public AddParameterToPidLoopResponse addParameterToPidLoop(AddParameterToPidLoopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddParameterToPidLoop", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new AddParameterToPidLoopResponse());
    }

    public ListPidProjectsResponse listPidProjects(ListPidProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPidProjects", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListPidProjectsResponse());
    }

    public DeletePidOrganizationResponse deletePidOrganization(DeletePidOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePidOrganization", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new DeletePidOrganizationResponse());
    }

    public SetPidLoopDefaultParameterResponse setPidLoopDefaultParameter(SetPidLoopDefaultParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetPidLoopDefaultParameter", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new SetPidLoopDefaultParameterResponse());
    }

    public GetPidOrganizationParentIdsResponse getPidOrganizationParentIds(GetPidOrganizationParentIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPidOrganizationParentIds", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPidOrganizationParentIdsResponse());
    }

    public CreatePidOrganizationResponse createPidOrganization(CreatePidOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePidOrganization", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new CreatePidOrganizationResponse());
    }

    public UpdatePidOrganizationResponse updatePidOrganization(UpdatePidOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdatePidOrganization", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdatePidOrganizationResponse());
    }

    public CreatePidLoopResponse createPidLoop(CreatePidLoopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePidLoop", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new CreatePidLoopResponse());
    }

    public UpdatePidProjectResponse updatePidProject(UpdatePidProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdatePidProject", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdatePidProjectResponse());
    }

    public ListPidTagsResponse listPidTags(ListPidTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPidTags", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new ListPidTagsResponse());
    }

    public DeletePidDataProcessResponse deletePidDataProcess(DeletePidDataProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePidDataProcess", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new DeletePidDataProcessResponse());
    }

    public CreatePidDataSourceResponse createPidDataSource(CreatePidDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePidDataSource", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new CreatePidDataSourceResponse());
    }

    public CreatePidDataSourceResponse createPidDataSourceAdvance(CreatePidDataSourceAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "brain-industrial"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        CreatePidDataSourceRequest createPidDataSourcereq = new CreatePidDataSourceRequest();
        com.aliyun.common.Common.convert(request, createPidDataSourcereq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.ossPathObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        createPidDataSourcereq.ossPath = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        CreatePidDataSourceResponse createPidDataSourceResp = this.createPidDataSource(createPidDataSourcereq, runtime);
        return createPidDataSourceResp;
    }

    public DeletePidProjectResponse deletePidProject(DeletePidProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePidProject", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new DeletePidProjectResponse());
    }

    public DeletePidTagResponse deletePidTag(DeletePidTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePidTag", "HTTPS", "POST", "2020-09-20", "AK", null, TeaModel.buildMap(request), runtime), new DeletePidTagResponse());
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
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618;

import com.aliyun.tea.*;
import com.aliyun.mts20140618.models.*;
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
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "mts.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mts.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mts.aliyuncs.com"),
            new TeaPair("cn-fujian", "mts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "mts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mts.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mts.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "mts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mts.aliyuncs.com"),
            new TeaPair("me-east-1", "mts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mts.aliyuncs.com"),
            new TeaPair("us-east-1", "mts.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public QueryAuthConfigResponse queryAuthConfigWithOptions(QueryAuthConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAuthConfig", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAuthConfigResponse());
    }

    public QueryAuthConfigResponse queryAuthConfig(QueryAuthConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAuthConfigWithOptions(request, runtime);
    }

    public QueryAsrPipelineListResponse queryAsrPipelineListWithOptions(QueryAsrPipelineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAsrPipelineList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAsrPipelineListResponse());
    }

    public QueryAsrPipelineListResponse queryAsrPipelineList(QueryAsrPipelineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAsrPipelineListWithOptions(request, runtime);
    }

    public SubmitMediaCensorJobResponse submitMediaCensorJobWithOptions(SubmitMediaCensorJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMediaCensorJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMediaCensorJobResponse());
    }

    public SubmitMediaCensorJobResponse submitMediaCensorJob(SubmitMediaCensorJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMediaCensorJobWithOptions(request, runtime);
    }

    public CreateSessionResponse createSessionWithOptions(CreateSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSession", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSessionResponse());
    }

    public CreateSessionResponse createSession(CreateSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSessionWithOptions(request, runtime);
    }

    public ListAsrPipelineResponse listAsrPipelineWithOptions(ListAsrPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAsrPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListAsrPipelineResponse());
    }

    public ListAsrPipelineResponse listAsrPipeline(ListAsrPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAsrPipelineWithOptions(request, runtime);
    }

    public ListJobResponse listJobWithOptions(ListJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobResponse());
    }

    public ListJobResponse listJob(ListJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobWithOptions(request, runtime);
    }

    public QueryIProductionJobListResponse queryIProductionJobListWithOptions(QueryIProductionJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIProductionJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIProductionJobListResponse());
    }

    public QueryIProductionJobListResponse queryIProductionJobList(QueryIProductionJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIProductionJobListWithOptions(request, runtime);
    }

    public UpdateMediaPublishStateResponse updateMediaPublishStateWithOptions(UpdateMediaPublishStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMediaPublishState", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMediaPublishStateResponse());
    }

    public UpdateMediaPublishStateResponse updateMediaPublishState(UpdateMediaPublishStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMediaPublishStateWithOptions(request, runtime);
    }

    public SubmitFpFileDeleteJobResponse submitFpFileDeleteJobWithOptions(SubmitFpFileDeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFpFileDeleteJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFpFileDeleteJobResponse());
    }

    public SubmitFpFileDeleteJobResponse submitFpFileDeleteJob(SubmitFpFileDeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFpFileDeleteJobWithOptions(request, runtime);
    }

    public QueryAnalysisJobListResponse queryAnalysisJobListWithOptions(QueryAnalysisJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAnalysisJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAnalysisJobListResponse());
    }

    public QueryAnalysisJobListResponse queryAnalysisJobList(QueryAnalysisJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAnalysisJobListWithOptions(request, runtime);
    }

    public SubmitInferenceJobResponse submitInferenceJobWithOptions(SubmitInferenceJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitInferenceJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitInferenceJobResponse());
    }

    public SubmitInferenceJobResponse submitInferenceJob(SubmitInferenceJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInferenceJobWithOptions(request, runtime);
    }

    public ReportCensorJobResultResponse reportCensorJobResultWithOptions(ReportCensorJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportCensorJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportCensorJobResultResponse());
    }

    public ReportCensorJobResultResponse reportCensorJobResult(ReportCensorJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportCensorJobResultWithOptions(request, runtime);
    }

    public DeleteMcuJobResponse deleteMcuJobWithOptions(DeleteMcuJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMcuJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMcuJobResponse());
    }

    public DeleteMcuJobResponse deleteMcuJob(DeleteMcuJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMcuJobWithOptions(request, runtime);
    }

    public QueryInferenceServerResponse queryInferenceServerWithOptions(QueryInferenceServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInferenceServer", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryInferenceServerResponse());
    }

    public QueryInferenceServerResponse queryInferenceServer(QueryInferenceServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInferenceServerWithOptions(request, runtime);
    }

    public CheckResourceResponse checkResourceWithOptions(CheckResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckResource", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CheckResourceResponse());
    }

    public CheckResourceResponse checkResource(CheckResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkResourceWithOptions(request, runtime);
    }

    public ListTerrorismPipelineResponse listTerrorismPipelineWithOptions(ListTerrorismPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTerrorismPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListTerrorismPipelineResponse());
    }

    public ListTerrorismPipelineResponse listTerrorismPipeline(ListTerrorismPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTerrorismPipelineWithOptions(request, runtime);
    }

    public ReportTerrorismJobResultResponse reportTerrorismJobResultWithOptions(ReportTerrorismJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportTerrorismJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportTerrorismJobResultResponse());
    }

    public ReportTerrorismJobResultResponse reportTerrorismJobResult(ReportTerrorismJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportTerrorismJobResultWithOptions(request, runtime);
    }

    public ListAllMediaBucketResponse listAllMediaBucketWithOptions(ListAllMediaBucketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAllMediaBucket", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListAllMediaBucketResponse());
    }

    public ListAllMediaBucketResponse listAllMediaBucket(ListAllMediaBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllMediaBucketWithOptions(request, runtime);
    }

    public SearchPipelineResponse searchPipelineWithOptions(SearchPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SearchPipelineResponse());
    }

    public SearchPipelineResponse searchPipeline(SearchPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchPipelineWithOptions(request, runtime);
    }

    public UnbindOutputBucketResponse unbindOutputBucketWithOptions(UnbindOutputBucketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindOutputBucket", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindOutputBucketResponse());
    }

    public UnbindOutputBucketResponse unbindOutputBucket(UnbindOutputBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindOutputBucketWithOptions(request, runtime);
    }

    public UpdateMediaCategoryResponse updateMediaCategoryWithOptions(UpdateMediaCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMediaCategory", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMediaCategoryResponse());
    }

    public UpdateMediaCategoryResponse updateMediaCategory(UpdateMediaCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMediaCategoryWithOptions(request, runtime);
    }

    public QueryComplexJobListResponse queryComplexJobListWithOptions(QueryComplexJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryComplexJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryComplexJobListResponse());
    }

    public QueryComplexJobListResponse queryComplexJobList(QueryComplexJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryComplexJobListWithOptions(request, runtime);
    }

    public ListInferenceJobResponse listInferenceJobWithOptions(ListInferenceJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInferenceJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListInferenceJobResponse());
    }

    public ListInferenceJobResponse listInferenceJob(ListInferenceJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInferenceJobWithOptions(request, runtime);
    }

    public QueryJobListResponse queryJobListWithOptions(QueryJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryJobListResponse());
    }

    public QueryJobListResponse queryJobList(QueryJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobListWithOptions(request, runtime);
    }

    public SearchMediaWorkflowResponse searchMediaWorkflowWithOptions(SearchMediaWorkflowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchMediaWorkflow", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SearchMediaWorkflowResponse());
    }

    public SearchMediaWorkflowResponse searchMediaWorkflow(SearchMediaWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchMediaWorkflowWithOptions(request, runtime);
    }

    public QueryCoverPipelineListResponse queryCoverPipelineListWithOptions(QueryCoverPipelineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCoverPipelineList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCoverPipelineListResponse());
    }

    public QueryCoverPipelineListResponse queryCoverPipelineList(QueryCoverPipelineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCoverPipelineListWithOptions(request, runtime);
    }

    public QueryFpShotJobListResponse queryFpShotJobListWithOptions(QueryFpShotJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFpShotJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFpShotJobListResponse());
    }

    public QueryFpShotJobListResponse queryFpShotJobList(QueryFpShotJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFpShotJobListWithOptions(request, runtime);
    }

    public DeleteMediaTagResponse deleteMediaTagWithOptions(DeleteMediaTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMediaTag", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMediaTagResponse());
    }

    public DeleteMediaTagResponse deleteMediaTag(DeleteMediaTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMediaTagWithOptions(request, runtime);
    }

    public DeletePipelineResponse deletePipelineWithOptions(DeletePipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePipelineResponse());
    }

    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePipelineWithOptions(request, runtime);
    }

    public UpdateSmarttagTemplateResponse updateSmarttagTemplateWithOptions(UpdateSmarttagTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSmarttagTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSmarttagTemplateResponse());
    }

    public UpdateSmarttagTemplateResponse updateSmarttagTemplate(UpdateSmarttagTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSmarttagTemplateWithOptions(request, runtime);
    }

    public UpdateAsrPipelineResponse updateAsrPipelineWithOptions(UpdateAsrPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAsrPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAsrPipelineResponse());
    }

    public UpdateAsrPipelineResponse updateAsrPipeline(UpdateAsrPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAsrPipelineWithOptions(request, runtime);
    }

    public QueryVideoQualityJobResponse queryVideoQualityJobWithOptions(QueryVideoQualityJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryVideoQualityJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryVideoQualityJobResponse());
    }

    public QueryVideoQualityJobResponse queryVideoQualityJob(QueryVideoQualityJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVideoQualityJobWithOptions(request, runtime);
    }

    public DecryptKeyResponse decryptKeyWithOptions(DecryptKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DecryptKey", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DecryptKeyResponse());
    }

    public DecryptKeyResponse decryptKey(DecryptKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.decryptKeyWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public QueryTemplateListResponse queryTemplateListWithOptions(QueryTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTemplateList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTemplateListResponse());
    }

    public QueryTemplateListResponse queryTemplateList(QueryTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTemplateListWithOptions(request, runtime);
    }

    public ReportFacerecogJobResultResponse reportFacerecogJobResultWithOptions(ReportFacerecogJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportFacerecogJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportFacerecogJobResultResponse());
    }

    public ReportFacerecogJobResultResponse reportFacerecogJobResult(ReportFacerecogJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportFacerecogJobResultWithOptions(request, runtime);
    }

    public QueryMCTemplateListResponse queryMCTemplateListWithOptions(QueryMCTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMCTemplateList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMCTemplateListResponse());
    }

    public QueryMCTemplateListResponse queryMCTemplateList(QueryMCTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMCTemplateListWithOptions(request, runtime);
    }

    public UpdateMediaResponse updateMediaWithOptions(UpdateMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMedia", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMediaResponse());
    }

    public UpdateMediaResponse updateMedia(UpdateMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMediaWithOptions(request, runtime);
    }

    public ListCensorPipelineResponse listCensorPipelineWithOptions(ListCensorPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCensorPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListCensorPipelineResponse());
    }

    public ListCensorPipelineResponse listCensorPipeline(ListCensorPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCensorPipelineWithOptions(request, runtime);
    }

    public QuerySubtitleJobListResponse querySubtitleJobListWithOptions(QuerySubtitleJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySubtitleJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySubtitleJobListResponse());
    }

    public QuerySubtitleJobListResponse querySubtitleJobList(QuerySubtitleJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubtitleJobListWithOptions(request, runtime);
    }

    public QueryVideoGifJobListResponse queryVideoGifJobListWithOptions(QueryVideoGifJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryVideoGifJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryVideoGifJobListResponse());
    }

    public QueryVideoGifJobListResponse queryVideoGifJobList(QueryVideoGifJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVideoGifJobListWithOptions(request, runtime);
    }

    public QueryEditingJobListResponse queryEditingJobListWithOptions(QueryEditingJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEditingJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEditingJobListResponse());
    }

    public QueryEditingJobListResponse queryEditingJobList(QueryEditingJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEditingJobListWithOptions(request, runtime);
    }

    public UpdateMCTemplateResponse updateMCTemplateWithOptions(UpdateMCTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMCTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMCTemplateResponse());
    }

    public UpdateMCTemplateResponse updateMCTemplate(UpdateMCTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMCTemplateWithOptions(request, runtime);
    }

    public ReportCoverJobResultResponse reportCoverJobResultWithOptions(ReportCoverJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportCoverJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportCoverJobResultResponse());
    }

    public ReportCoverJobResultResponse reportCoverJobResult(ReportCoverJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportCoverJobResultWithOptions(request, runtime);
    }

    public SubmitImageQualityJobResponse submitImageQualityJobWithOptions(SubmitImageQualityJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitImageQualityJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitImageQualityJobResponse());
    }

    public SubmitImageQualityJobResponse submitImageQualityJob(SubmitImageQualityJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitImageQualityJobWithOptions(request, runtime);
    }

    public AddMCTemplateResponse addMCTemplateWithOptions(AddMCTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMCTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddMCTemplateResponse());
    }

    public AddMCTemplateResponse addMCTemplate(AddMCTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMCTemplateWithOptions(request, runtime);
    }

    public SearchTemplateResponse searchTemplateWithOptions(SearchTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTemplateResponse());
    }

    public SearchTemplateResponse searchTemplate(SearchTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTemplateWithOptions(request, runtime);
    }

    public UpdateMcuTemplateResponse updateMcuTemplateWithOptions(UpdateMcuTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMcuTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMcuTemplateResponse());
    }

    public UpdateMcuTemplateResponse updateMcuTemplate(UpdateMcuTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMcuTemplateWithOptions(request, runtime);
    }

    public SubmitFacerecogJobResponse submitFacerecogJobWithOptions(SubmitFacerecogJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFacerecogJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFacerecogJobResponse());
    }

    public SubmitFacerecogJobResponse submitFacerecogJob(SubmitFacerecogJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFacerecogJobWithOptions(request, runtime);
    }

    public SubmitEditingJobsResponse submitEditingJobsWithOptions(SubmitEditingJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitEditingJobs", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitEditingJobsResponse());
    }

    public SubmitEditingJobsResponse submitEditingJobs(SubmitEditingJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitEditingJobsWithOptions(request, runtime);
    }

    public ReportVideoSplitJobResultResponse reportVideoSplitJobResultWithOptions(ReportVideoSplitJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportVideoSplitJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportVideoSplitJobResultResponse());
    }

    public ReportVideoSplitJobResultResponse reportVideoSplitJobResult(ReportVideoSplitJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportVideoSplitJobResultWithOptions(request, runtime);
    }

    public QueryMediaCensorJobDetailResponse queryMediaCensorJobDetailWithOptions(QueryMediaCensorJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaCensorJobDetail", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaCensorJobDetailResponse());
    }

    public QueryMediaCensorJobDetailResponse queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaCensorJobDetailWithOptions(request, runtime);
    }

    public TagCustomPersonResponse tagCustomPersonWithOptions(TagCustomPersonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagCustomPerson", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new TagCustomPersonResponse());
    }

    public TagCustomPersonResponse tagCustomPerson(TagCustomPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagCustomPersonWithOptions(request, runtime);
    }

    public CreateMcuTemplateResponse createMcuTemplateWithOptions(CreateMcuTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMcuTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMcuTemplateResponse());
    }

    public CreateMcuTemplateResponse createMcuTemplate(CreateMcuTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMcuTemplateWithOptions(request, runtime);
    }

    public ListFpShotNotaryResponse listFpShotNotaryWithOptions(ListFpShotNotaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFpShotNotary", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListFpShotNotaryResponse());
    }

    public ListFpShotNotaryResponse listFpShotNotary(ListFpShotNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFpShotNotaryWithOptions(request, runtime);
    }

    public ReportFpShotJobResultResponse reportFpShotJobResultWithOptions(ReportFpShotJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportFpShotJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportFpShotJobResultResponse());
    }

    public ReportFpShotJobResultResponse reportFpShotJobResult(ReportFpShotJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportFpShotJobResultWithOptions(request, runtime);
    }

    public SubmitVideoGifJobResponse submitVideoGifJobWithOptions(SubmitVideoGifJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitVideoGifJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitVideoGifJobResponse());
    }

    public SubmitVideoGifJobResponse submitVideoGifJob(SubmitVideoGifJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitVideoGifJobWithOptions(request, runtime);
    }

    public QueryAnnotationJobListResponse queryAnnotationJobListWithOptions(QueryAnnotationJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAnnotationJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAnnotationJobListResponse());
    }

    public QueryAnnotationJobListResponse queryAnnotationJobList(QueryAnnotationJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAnnotationJobListWithOptions(request, runtime);
    }

    public SubmitPornJobResponse submitPornJobWithOptions(SubmitPornJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitPornJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitPornJobResponse());
    }

    public SubmitPornJobResponse submitPornJob(SubmitPornJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitPornJobWithOptions(request, runtime);
    }

    public DescribeMtsUserResourcePackageResponse describeMtsUserResourcePackageWithOptions(DescribeMtsUserResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMtsUserResourcePackage", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMtsUserResourcePackageResponse());
    }

    public DescribeMtsUserResourcePackageResponse describeMtsUserResourcePackage(DescribeMtsUserResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMtsUserResourcePackageWithOptions(request, runtime);
    }

    public AddTemplateResponse addTemplateWithOptions(AddTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddTemplateResponse());
    }

    public AddTemplateResponse addTemplate(AddTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTemplateWithOptions(request, runtime);
    }

    public SubmitMCJobResponse submitMCJobWithOptions(SubmitMCJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMCJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMCJobResponse());
    }

    public SubmitMCJobResponse submitMCJob(SubmitMCJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMCJobWithOptions(request, runtime);
    }

    public ReportPornJobResultResponse reportPornJobResultWithOptions(ReportPornJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportPornJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportPornJobResultResponse());
    }

    public ReportPornJobResultResponse reportPornJobResult(ReportPornJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportPornJobResultWithOptions(request, runtime);
    }

    public UpdateMediaWorkflowResponse updateMediaWorkflowWithOptions(UpdateMediaWorkflowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMediaWorkflow", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMediaWorkflowResponse());
    }

    public UpdateMediaWorkflowResponse updateMediaWorkflow(UpdateMediaWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMediaWorkflowWithOptions(request, runtime);
    }

    public DeleteSmarttagTemplateResponse deleteSmarttagTemplateWithOptions(DeleteSmarttagTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSmarttagTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSmarttagTemplateResponse());
    }

    public DeleteSmarttagTemplateResponse deleteSmarttagTemplate(DeleteSmarttagTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmarttagTemplateWithOptions(request, runtime);
    }

    public QueryMediaWorkflowListResponse queryMediaWorkflowListWithOptions(QueryMediaWorkflowListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaWorkflowList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaWorkflowListResponse());
    }

    public QueryMediaWorkflowListResponse queryMediaWorkflowList(QueryMediaWorkflowListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaWorkflowListWithOptions(request, runtime);
    }

    public SubmitIProductionJobResponse submitIProductionJobWithOptions(SubmitIProductionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitIProductionJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitIProductionJobResponse());
    }

    public SubmitIProductionJobResponse submitIProductionJob(SubmitIProductionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitIProductionJobWithOptions(request, runtime);
    }

    public GetLicenseResponse getLicenseWithOptions(GetLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLicense", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetLicenseResponse());
    }

    public GetLicenseResponse getLicense(GetLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLicenseWithOptions(request, runtime);
    }

    public QueryVideoSummaryJobListResponse queryVideoSummaryJobListWithOptions(QueryVideoSummaryJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryVideoSummaryJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryVideoSummaryJobListResponse());
    }

    public QueryVideoSummaryJobListResponse queryVideoSummaryJobList(QueryVideoSummaryJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVideoSummaryJobListWithOptions(request, runtime);
    }

    public SubmitSmarttagJobResponse submitSmarttagJobWithOptions(SubmitSmarttagJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitSmarttagJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitSmarttagJobResponse());
    }

    public SubmitSmarttagJobResponse submitSmarttagJob(SubmitSmarttagJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSmarttagJobWithOptions(request, runtime);
    }

    public QuerySmarttagJobResponse querySmarttagJobWithOptions(QuerySmarttagJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySmarttagJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySmarttagJobResponse());
    }

    public QuerySmarttagJobResponse querySmarttagJob(QuerySmarttagJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySmarttagJobWithOptions(request, runtime);
    }

    public UpdateMediaCoverResponse updateMediaCoverWithOptions(UpdateMediaCoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMediaCover", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMediaCoverResponse());
    }

    public UpdateMediaCoverResponse updateMediaCover(UpdateMediaCoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMediaCoverWithOptions(request, runtime);
    }

    public QueryIProductionJobResponse queryIProductionJobWithOptions(QueryIProductionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIProductionJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIProductionJobResponse());
    }

    public QueryIProductionJobResponse queryIProductionJob(QueryIProductionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIProductionJobWithOptions(request, runtime);
    }

    public ListMediaResponse listMediaWithOptions(ListMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMedia", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListMediaResponse());
    }

    public ListMediaResponse listMedia(ListMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaWithOptions(request, runtime);
    }

    public GetPackageResponse getPackageWithOptions(GetPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPackage", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetPackageResponse());
    }

    public GetPackageResponse getPackage(GetPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPackageWithOptions(request, runtime);
    }

    public UpdateWaterMarkTemplateResponse updateWaterMarkTemplateWithOptions(UpdateWaterMarkTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateWaterMarkTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateWaterMarkTemplateResponse());
    }

    public UpdateWaterMarkTemplateResponse updateWaterMarkTemplate(UpdateWaterMarkTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateWaterMarkTemplateWithOptions(request, runtime);
    }

    public QueryMcuTemplateResponse queryMcuTemplateWithOptions(QueryMcuTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMcuTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMcuTemplateResponse());
    }

    public QueryMcuTemplateResponse queryMcuTemplate(QueryMcuTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMcuTemplateWithOptions(request, runtime);
    }

    public ActivateMediaWorkflowResponse activateMediaWorkflowWithOptions(ActivateMediaWorkflowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivateMediaWorkflow", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ActivateMediaWorkflowResponse());
    }

    public ActivateMediaWorkflowResponse activateMediaWorkflow(ActivateMediaWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateMediaWorkflowWithOptions(request, runtime);
    }

    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchMedia", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SearchMediaResponse());
    }

    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    public SubmitTerrorismJobResponse submitTerrorismJobWithOptions(SubmitTerrorismJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitTerrorismJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitTerrorismJobResponse());
    }

    public SubmitTerrorismJobResponse submitTerrorismJob(SubmitTerrorismJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTerrorismJobWithOptions(request, runtime);
    }

    public AddCategoryResponse addCategoryWithOptions(AddCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCategory", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddCategoryResponse());
    }

    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    public QueryInnerJobResponse queryInnerJobWithOptions(QueryInnerJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInnerJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryInnerJobResponse());
    }

    public QueryInnerJobResponse queryInnerJob(QueryInnerJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInnerJobWithOptions(request, runtime);
    }

    public ListFpShotFilesResponse listFpShotFilesWithOptions(ListFpShotFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFpShotFiles", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListFpShotFilesResponse());
    }

    public ListFpShotFilesResponse listFpShotFiles(ListFpShotFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFpShotFilesWithOptions(request, runtime);
    }

    public QueryTerrorismPipelineListResponse queryTerrorismPipelineListWithOptions(QueryTerrorismPipelineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTerrorismPipelineList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTerrorismPipelineListResponse());
    }

    public QueryTerrorismPipelineListResponse queryTerrorismPipelineList(QueryTerrorismPipelineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTerrorismPipelineListWithOptions(request, runtime);
    }

    public AddMediaResponse addMediaWithOptions(AddMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMedia", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddMediaResponse());
    }

    public AddMediaResponse addMedia(AddMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMediaWithOptions(request, runtime);
    }

    public StopIProductionJobResponse stopIProductionJobWithOptions(StopIProductionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopIProductionJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new StopIProductionJobResponse());
    }

    public StopIProductionJobResponse stopIProductionJob(StopIProductionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopIProductionJobWithOptions(request, runtime);
    }

    public DeleteMcuTemplateResponse deleteMcuTemplateWithOptions(DeleteMcuTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMcuTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMcuTemplateResponse());
    }

    public DeleteMcuTemplateResponse deleteMcuTemplate(DeleteMcuTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMcuTemplateWithOptions(request, runtime);
    }

    public QueryMediaCensorJobListResponse queryMediaCensorJobListWithOptions(QueryMediaCensorJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaCensorJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaCensorJobListResponse());
    }

    public QueryMediaCensorJobListResponse queryMediaCensorJobList(QueryMediaCensorJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaCensorJobListWithOptions(request, runtime);
    }

    public ListPornPipelineResponse listPornPipelineWithOptions(ListPornPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPornPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListPornPipelineResponse());
    }

    public ListPornPipelineResponse listPornPipeline(ListPornPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPornPipelineWithOptions(request, runtime);
    }

    public AddTerrorismPipelineResponse addTerrorismPipelineWithOptions(AddTerrorismPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTerrorismPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddTerrorismPipelineResponse());
    }

    public AddTerrorismPipelineResponse addTerrorismPipeline(AddTerrorismPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTerrorismPipelineWithOptions(request, runtime);
    }

    public CreateFpShotDBResponse createFpShotDBWithOptions(CreateFpShotDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFpShotDB", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFpShotDBResponse());
    }

    public CreateFpShotDBResponse createFpShotDB(CreateFpShotDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFpShotDBWithOptions(request, runtime);
    }

    public UnregisterCustomFaceResponse unregisterCustomFaceWithOptions(UnregisterCustomFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnregisterCustomFace", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UnregisterCustomFaceResponse());
    }

    public UnregisterCustomFaceResponse unregisterCustomFace(UnregisterCustomFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unregisterCustomFaceWithOptions(request, runtime);
    }

    public QuerySmarttagTemplateListResponse querySmarttagTemplateListWithOptions(QuerySmarttagTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySmarttagTemplateList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySmarttagTemplateListResponse());
    }

    public QuerySmarttagTemplateListResponse querySmarttagTemplateList(QuerySmarttagTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySmarttagTemplateListWithOptions(request, runtime);
    }

    public SubmitFpShotJobResponse submitFpShotJobWithOptions(SubmitFpShotJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFpShotJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFpShotJobResponse());
    }

    public SubmitFpShotJobResponse submitFpShotJob(SubmitFpShotJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFpShotJobWithOptions(request, runtime);
    }

    public QueryCensorPipelineListResponse queryCensorPipelineListWithOptions(QueryCensorPipelineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCensorPipelineList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCensorPipelineListResponse());
    }

    public QueryCensorPipelineListResponse queryCensorPipelineList(QueryCensorPipelineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCensorPipelineListWithOptions(request, runtime);
    }

    public SubmitMcuJobResponse submitMcuJobWithOptions(SubmitMcuJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMcuJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMcuJobResponse());
    }

    public SubmitMcuJobResponse submitMcuJob(SubmitMcuJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMcuJobWithOptions(request, runtime);
    }

    public CategoryTreeResponse categoryTreeWithOptions(CategoryTreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CategoryTree", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CategoryTreeResponse());
    }

    public CategoryTreeResponse categoryTree(CategoryTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.categoryTreeWithOptions(request, runtime);
    }

    public SubmitTagJobResponse submitTagJobWithOptions(SubmitTagJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitTagJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitTagJobResponse());
    }

    public SubmitTagJobResponse submitTagJob(SubmitTagJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTagJobWithOptions(request, runtime);
    }

    public SubmitCoverJobResponse submitCoverJobWithOptions(SubmitCoverJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitCoverJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitCoverJobResponse());
    }

    public SubmitCoverJobResponse submitCoverJob(SubmitCoverJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitCoverJobWithOptions(request, runtime);
    }

    public AddCensorPipelineResponse addCensorPipelineWithOptions(AddCensorPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCensorPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddCensorPipelineResponse());
    }

    public AddCensorPipelineResponse addCensorPipeline(AddCensorPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCensorPipelineWithOptions(request, runtime);
    }

    public SearchWaterMarkTemplateResponse searchWaterMarkTemplateWithOptions(SearchWaterMarkTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchWaterMarkTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SearchWaterMarkTemplateResponse());
    }

    public SearchWaterMarkTemplateResponse searchWaterMarkTemplate(SearchWaterMarkTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchWaterMarkTemplateWithOptions(request, runtime);
    }

    public SubmitAsrJobResponse submitAsrJobWithOptions(SubmitAsrJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAsrJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAsrJobResponse());
    }

    public SubmitAsrJobResponse submitAsrJob(SubmitAsrJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAsrJobWithOptions(request, runtime);
    }

    public AddMediaWorkflowResponse addMediaWorkflowWithOptions(AddMediaWorkflowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMediaWorkflow", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddMediaWorkflowResponse());
    }

    public AddMediaWorkflowResponse addMediaWorkflow(AddMediaWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMediaWorkflowWithOptions(request, runtime);
    }

    public QueryAsrJobListResponse queryAsrJobListWithOptions(QueryAsrJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAsrJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAsrJobListResponse());
    }

    public QueryAsrJobListResponse queryAsrJobList(QueryAsrJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAsrJobListWithOptions(request, runtime);
    }

    public SubmitVideoPoseJobResponse submitVideoPoseJobWithOptions(SubmitVideoPoseJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitVideoPoseJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitVideoPoseJobResponse());
    }

    public SubmitVideoPoseJobResponse submitVideoPoseJob(SubmitVideoPoseJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitVideoPoseJobWithOptions(request, runtime);
    }

    public RegisterMediaDetailPersonResponse registerMediaDetailPersonWithOptions(RegisterMediaDetailPersonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterMediaDetailPerson", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterMediaDetailPersonResponse());
    }

    public RegisterMediaDetailPersonResponse registerMediaDetailPerson(RegisterMediaDetailPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerMediaDetailPersonWithOptions(request, runtime);
    }

    public QueryCensorJobListResponse queryCensorJobListWithOptions(QueryCensorJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCensorJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCensorJobListResponse());
    }

    public QueryCensorJobListResponse queryCensorJobList(QueryCensorJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCensorJobListWithOptions(request, runtime);
    }

    public SubmitFpCompareJobResponse submitFpCompareJobWithOptions(SubmitFpCompareJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFpCompareJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFpCompareJobResponse());
    }

    public SubmitFpCompareJobResponse submitFpCompareJob(SubmitFpCompareJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFpCompareJobWithOptions(request, runtime);
    }

    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCategory", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCategoryResponse());
    }

    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    public QuerySnapshotJobListResponse querySnapshotJobListWithOptions(QuerySnapshotJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySnapshotJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySnapshotJobListResponse());
    }

    public QuerySnapshotJobListResponse querySnapshotJobList(QuerySnapshotJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySnapshotJobListWithOptions(request, runtime);
    }

    public QueryTagJobListResponse queryTagJobListWithOptions(QueryTagJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTagJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTagJobListResponse());
    }

    public QueryTagJobListResponse queryTagJobList(QueryTagJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTagJobListWithOptions(request, runtime);
    }

    public SubmitFpDBDeleteJobResponse submitFpDBDeleteJobWithOptions(SubmitFpDBDeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFpDBDeleteJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFpDBDeleteJobResponse());
    }

    public SubmitFpDBDeleteJobResponse submitFpDBDeleteJob(SubmitFpDBDeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFpDBDeleteJobWithOptions(request, runtime);
    }

    public GetJobInfoResponse getJobInfoWithOptions(GetJobInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobInfo", "2014-06-18", "HTTPS", "GET", "AK", "json", req, runtime), new GetJobInfoResponse());
    }

    public GetJobInfoResponse getJobInfo(GetJobInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobInfoWithOptions(request, runtime);
    }

    public AddMediaTagResponse addMediaTagWithOptions(AddMediaTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMediaTag", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddMediaTagResponse());
    }

    public AddMediaTagResponse addMediaTag(AddMediaTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMediaTagWithOptions(request, runtime);
    }

    public UnbindInputBucketResponse unbindInputBucketWithOptions(UnbindInputBucketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindInputBucket", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindInputBucketResponse());
    }

    public UnbindInputBucketResponse unbindInputBucket(UnbindInputBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindInputBucketWithOptions(request, runtime);
    }

    public QueryMediaWorkflowExecutionListResponse queryMediaWorkflowExecutionListWithOptions(QueryMediaWorkflowExecutionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaWorkflowExecutionList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaWorkflowExecutionListResponse());
    }

    public QueryMediaWorkflowExecutionListResponse queryMediaWorkflowExecutionList(QueryMediaWorkflowExecutionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaWorkflowExecutionListWithOptions(request, runtime);
    }

    public SubmitComplexJobResponse submitComplexJobWithOptions(SubmitComplexJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitComplexJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitComplexJobResponse());
    }

    public SubmitComplexJobResponse submitComplexJob(SubmitComplexJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitComplexJobWithOptions(request, runtime);
    }

    public AddAsrPipelineResponse addAsrPipelineWithOptions(AddAsrPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAsrPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddAsrPipelineResponse());
    }

    public AddAsrPipelineResponse addAsrPipeline(AddAsrPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAsrPipelineWithOptions(request, runtime);
    }

    public CancelJobResponse cancelJobWithOptions(CancelJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CancelJobResponse());
    }

    public CancelJobResponse cancelJob(CancelJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelJobWithOptions(request, runtime);
    }

    public ListAllCategoryResponse listAllCategoryWithOptions(ListAllCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAllCategory", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListAllCategoryResponse());
    }

    public ListAllCategoryResponse listAllCategory(ListAllCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllCategoryWithOptions(request, runtime);
    }

    public ListFpShotDBResponse listFpShotDBWithOptions(ListFpShotDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFpShotDB", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListFpShotDBResponse());
    }

    public ListFpShotDBResponse listFpShotDB(ListFpShotDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFpShotDBWithOptions(request, runtime);
    }

    public AddSmarttagTemplateResponse addSmarttagTemplateWithOptions(AddSmarttagTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSmarttagTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddSmarttagTemplateResponse());
    }

    public AddSmarttagTemplateResponse addSmarttagTemplate(AddSmarttagTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSmarttagTemplateWithOptions(request, runtime);
    }

    public LogicalDeleteResourceResponse logicalDeleteResourceWithOptions(LogicalDeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LogicalDeleteResource", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new LogicalDeleteResourceResponse());
    }

    public LogicalDeleteResourceResponse logicalDeleteResource(LogicalDeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.logicalDeleteResourceWithOptions(request, runtime);
    }

    public ListMediaWorkflowExecutionsResponse listMediaWorkflowExecutionsWithOptions(ListMediaWorkflowExecutionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMediaWorkflowExecutions", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListMediaWorkflowExecutionsResponse());
    }

    public ListMediaWorkflowExecutionsResponse listMediaWorkflowExecutions(ListMediaWorkflowExecutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaWorkflowExecutionsWithOptions(request, runtime);
    }

    public SubmitInnerJobResponse submitInnerJobWithOptions(SubmitInnerJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitInnerJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitInnerJobResponse());
    }

    public SubmitInnerJobResponse submitInnerJob(SubmitInnerJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInnerJobWithOptions(request, runtime);
    }

    public QueryMediaDetailJobListResponse queryMediaDetailJobListWithOptions(QueryMediaDetailJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaDetailJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaDetailJobListResponse());
    }

    public QueryMediaDetailJobListResponse queryMediaDetailJobList(QueryMediaDetailJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaDetailJobListWithOptions(request, runtime);
    }

    public UpdatePornPipelineResponse updatePornPipelineWithOptions(UpdatePornPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePornPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePornPipelineResponse());
    }

    public UpdatePornPipelineResponse updatePornPipeline(UpdatePornPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePornPipelineWithOptions(request, runtime);
    }

    public DeleteWaterMarkTemplateResponse deleteWaterMarkTemplateWithOptions(DeleteWaterMarkTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWaterMarkTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWaterMarkTemplateResponse());
    }

    public DeleteWaterMarkTemplateResponse deleteWaterMarkTemplate(DeleteWaterMarkTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWaterMarkTemplateWithOptions(request, runtime);
    }

    public SubmitVideoQualityJobResponse submitVideoQualityJobWithOptions(SubmitVideoQualityJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitVideoQualityJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitVideoQualityJobResponse());
    }

    public SubmitVideoQualityJobResponse submitVideoQualityJob(SubmitVideoQualityJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitVideoQualityJobWithOptions(request, runtime);
    }

    public AddCoverPipelineResponse addCoverPipelineWithOptions(AddCoverPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCoverPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddCoverPipelineResponse());
    }

    public AddCoverPipelineResponse addCoverPipeline(AddCoverPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCoverPipelineWithOptions(request, runtime);
    }

    public SubmitURLUploadJobResponse submitURLUploadJobWithOptions(SubmitURLUploadJobRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitURLUploadJobShrinkRequest request = new SubmitURLUploadJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.targetStorage))) {
            request.targetStorageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.targetStorage), "TargetStorage", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitURLUploadJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitURLUploadJobResponse());
    }

    public SubmitURLUploadJobResponse submitURLUploadJob(SubmitURLUploadJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitURLUploadJobWithOptions(request, runtime);
    }

    public QueryMediaListByURLResponse queryMediaListByURLWithOptions(QueryMediaListByURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaListByURL", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaListByURLResponse());
    }

    public QueryMediaListByURLResponse queryMediaListByURL(QueryMediaListByURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaListByURLWithOptions(request, runtime);
    }

    public SubmitMediaFpDeleteJobResponse submitMediaFpDeleteJobWithOptions(SubmitMediaFpDeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMediaFpDeleteJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMediaFpDeleteJobResponse());
    }

    public SubmitMediaFpDeleteJobResponse submitMediaFpDeleteJob(SubmitMediaFpDeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMediaFpDeleteJobWithOptions(request, runtime);
    }

    public DeactivateMediaWorkflowResponse deactivateMediaWorkflowWithOptions(DeactivateMediaWorkflowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeactivateMediaWorkflow", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeactivateMediaWorkflowResponse());
    }

    public DeactivateMediaWorkflowResponse deactivateMediaWorkflow(DeactivateMediaWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactivateMediaWorkflowWithOptions(request, runtime);
    }

    public PhysicalDeleteResourceResponse physicalDeleteResourceWithOptions(PhysicalDeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PhysicalDeleteResource", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new PhysicalDeleteResourceResponse());
    }

    public PhysicalDeleteResourceResponse physicalDeleteResource(PhysicalDeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.physicalDeleteResourceWithOptions(request, runtime);
    }

    public DeleteMCTemplateResponse deleteMCTemplateWithOptions(DeleteMCTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMCTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMCTemplateResponse());
    }

    public DeleteMCTemplateResponse deleteMCTemplate(DeleteMCTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMCTemplateWithOptions(request, runtime);
    }

    public UpdatePipelineResponse updatePipelineWithOptions(UpdatePipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePipelineResponse());
    }

    public UpdatePipelineResponse updatePipeline(UpdatePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePipelineWithOptions(request, runtime);
    }

    public DeleteMediaResponse deleteMediaWithOptions(DeleteMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMedia", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMediaResponse());
    }

    public DeleteMediaResponse deleteMedia(DeleteMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMediaWithOptions(request, runtime);
    }

    public QueryFpCompareJobListResponse queryFpCompareJobListWithOptions(QueryFpCompareJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFpCompareJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFpCompareJobListResponse());
    }

    public QueryFpCompareJobListResponse queryFpCompareJobList(QueryFpCompareJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFpCompareJobListWithOptions(request, runtime);
    }

    public BindOutputBucketResponse bindOutputBucketWithOptions(BindOutputBucketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindOutputBucket", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new BindOutputBucketResponse());
    }

    public BindOutputBucketResponse bindOutputBucket(BindOutputBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindOutputBucketWithOptions(request, runtime);
    }

    public AddPipelineResponse addPipelineWithOptions(AddPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddPipelineResponse());
    }

    public AddPipelineResponse addPipeline(AddPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPipelineWithOptions(request, runtime);
    }

    public QueryMCJobListResponse queryMCJobListWithOptions(QueryMCJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMCJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMCJobListResponse());
    }

    public QueryMCJobListResponse queryMCJobList(QueryMCJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMCJobListWithOptions(request, runtime);
    }

    public QueryMediaListResponse queryMediaListWithOptions(QueryMediaListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaListResponse());
    }

    public QueryMediaListResponse queryMediaList(QueryMediaListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaListWithOptions(request, runtime);
    }

    public QueryFpDBDeleteJobListResponse queryFpDBDeleteJobListWithOptions(QueryFpDBDeleteJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFpDBDeleteJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFpDBDeleteJobListResponse());
    }

    public QueryFpDBDeleteJobListResponse queryFpDBDeleteJobList(QueryFpDBDeleteJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFpDBDeleteJobListWithOptions(request, runtime);
    }

    public RegisterCustomFaceResponse registerCustomFaceWithOptions(RegisterCustomFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterCustomFace", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterCustomFaceResponse());
    }

    public RegisterCustomFaceResponse registerCustomFace(RegisterCustomFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerCustomFaceWithOptions(request, runtime);
    }

    public SubmitMediaInfoJobResponse submitMediaInfoJobWithOptions(SubmitMediaInfoJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMediaInfoJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMediaInfoJobResponse());
    }

    public SubmitMediaInfoJobResponse submitMediaInfoJob(SubmitMediaInfoJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMediaInfoJobWithOptions(request, runtime);
    }

    public QueryPornJobListResponse queryPornJobListWithOptions(QueryPornJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPornJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPornJobListResponse());
    }

    public QueryPornJobListResponse queryPornJobList(QueryPornJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPornJobListWithOptions(request, runtime);
    }

    public UpdateCategoryNameResponse updateCategoryNameWithOptions(UpdateCategoryNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCategoryName", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCategoryNameResponse());
    }

    public UpdateCategoryNameResponse updateCategoryName(UpdateCategoryNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCategoryNameWithOptions(request, runtime);
    }

    public DeleteMediaWorkflowResponse deleteMediaWorkflowWithOptions(DeleteMediaWorkflowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMediaWorkflow", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMediaWorkflowResponse());
    }

    public DeleteMediaWorkflowResponse deleteMediaWorkflow(DeleteMediaWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMediaWorkflowWithOptions(request, runtime);
    }

    public QueryMcuJobResponse queryMcuJobWithOptions(QueryMcuJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMcuJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMcuJobResponse());
    }

    public QueryMcuJobResponse queryMcuJob(QueryMcuJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMcuJobWithOptions(request, runtime);
    }

    public ListCoverPipelineResponse listCoverPipelineWithOptions(ListCoverPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCoverPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListCoverPipelineResponse());
    }

    public ListCoverPipelineResponse listCoverPipeline(ListCoverPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCoverPipelineWithOptions(request, runtime);
    }

    public SubmitBeautifyJobsResponse submitBeautifyJobsWithOptions(SubmitBeautifyJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitBeautifyJobs", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitBeautifyJobsResponse());
    }

    public SubmitBeautifyJobsResponse submitBeautifyJobs(SubmitBeautifyJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitBeautifyJobsWithOptions(request, runtime);
    }

    public QueryImageSearchJobListResponse queryImageSearchJobListWithOptions(QueryImageSearchJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryImageSearchJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryImageSearchJobListResponse());
    }

    public QueryImageSearchJobListResponse queryImageSearchJobList(QueryImageSearchJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryImageSearchJobListWithOptions(request, runtime);
    }

    public SubmitVideoSummaryJobResponse submitVideoSummaryJobWithOptions(SubmitVideoSummaryJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitVideoSummaryJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitVideoSummaryJobResponse());
    }

    public SubmitVideoSummaryJobResponse submitVideoSummaryJob(SubmitVideoSummaryJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitVideoSummaryJobWithOptions(request, runtime);
    }

    public SubmitMediaDetailJobResponse submitMediaDetailJobWithOptions(SubmitMediaDetailJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMediaDetailJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMediaDetailJobResponse());
    }

    public SubmitMediaDetailJobResponse submitMediaDetailJob(SubmitMediaDetailJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMediaDetailJobWithOptions(request, runtime);
    }

    public QueryFpImportResultResponse queryFpImportResultWithOptions(QueryFpImportResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFpImportResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFpImportResultResponse());
    }

    public QueryFpImportResultResponse queryFpImportResult(QueryFpImportResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFpImportResultWithOptions(request, runtime);
    }

    public QueryWaterMarkTemplateListResponse queryWaterMarkTemplateListWithOptions(QueryWaterMarkTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryWaterMarkTemplateList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryWaterMarkTemplateListResponse());
    }

    public QueryWaterMarkTemplateListResponse queryWaterMarkTemplateList(QueryWaterMarkTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryWaterMarkTemplateListWithOptions(request, runtime);
    }

    public QueryMediaInfoJobListResponse queryMediaInfoJobListWithOptions(QueryMediaInfoJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaInfoJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaInfoJobListResponse());
    }

    public QueryMediaInfoJobListResponse queryMediaInfoJobList(QueryMediaInfoJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaInfoJobListWithOptions(request, runtime);
    }

    public QueryMediaFpDeleteJobListResponse queryMediaFpDeleteJobListWithOptions(QueryMediaFpDeleteJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaFpDeleteJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaFpDeleteJobListResponse());
    }

    public QueryMediaFpDeleteJobListResponse queryMediaFpDeleteJobList(QueryMediaFpDeleteJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaFpDeleteJobListWithOptions(request, runtime);
    }

    public ReportTagJobResultResponse reportTagJobResultWithOptions(ReportTagJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportTagJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportTagJobResultResponse());
    }

    public ReportTagJobResultResponse reportTagJobResult(ReportTagJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportTagJobResultWithOptions(request, runtime);
    }

    public AddPornPipelineResponse addPornPipelineWithOptions(AddPornPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPornPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddPornPipelineResponse());
    }

    public AddPornPipelineResponse addPornPipeline(AddPornPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPornPipelineWithOptions(request, runtime);
    }

    public QueryPornPipelineListResponse queryPornPipelineListWithOptions(QueryPornPipelineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPornPipelineList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPornPipelineListResponse());
    }

    public QueryPornPipelineListResponse queryPornPipelineList(QueryPornPipelineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPornPipelineListWithOptions(request, runtime);
    }

    public QueryTerrorismJobListResponse queryTerrorismJobListWithOptions(QueryTerrorismJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTerrorismJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTerrorismJobListResponse());
    }

    public QueryTerrorismJobListResponse queryTerrorismJobList(QueryTerrorismJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTerrorismJobListWithOptions(request, runtime);
    }

    public SubmitJobsResponse submitJobsWithOptions(SubmitJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitJobs", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitJobsResponse());
    }

    public SubmitJobsResponse submitJobs(SubmitJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitJobsWithOptions(request, runtime);
    }

    public RefreshCdnDomainConfigsCacheResponse refreshCdnDomainConfigsCacheWithOptions(RefreshCdnDomainConfigsCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshCdnDomainConfigsCache", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshCdnDomainConfigsCacheResponse());
    }

    public RefreshCdnDomainConfigsCacheResponse refreshCdnDomainConfigsCache(RefreshCdnDomainConfigsCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshCdnDomainConfigsCacheWithOptions(request, runtime);
    }

    public QueryFpFileDeleteJobListResponse queryFpFileDeleteJobListWithOptions(QueryFpFileDeleteJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFpFileDeleteJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFpFileDeleteJobListResponse());
    }

    public QueryFpFileDeleteJobListResponse queryFpFileDeleteJobList(QueryFpFileDeleteJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFpFileDeleteJobListWithOptions(request, runtime);
    }

    public SubmitImageSearchJobResponse submitImageSearchJobWithOptions(SubmitImageSearchJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitImageSearchJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitImageSearchJobResponse());
    }

    public SubmitImageSearchJobResponse submitImageSearchJob(SubmitImageSearchJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitImageSearchJobWithOptions(request, runtime);
    }

    public UpdateMediaWorkflowTriggerModeResponse updateMediaWorkflowTriggerModeWithOptions(UpdateMediaWorkflowTriggerModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMediaWorkflowTriggerMode", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMediaWorkflowTriggerModeResponse());
    }

    public UpdateMediaWorkflowTriggerModeResponse updateMediaWorkflowTriggerMode(UpdateMediaWorkflowTriggerModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMediaWorkflowTriggerModeWithOptions(request, runtime);
    }

    public SetAuthConfigResponse setAuthConfigWithOptions(SetAuthConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAuthConfig", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetAuthConfigResponse());
    }

    public SetAuthConfigResponse setAuthConfig(SetAuthConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAuthConfigWithOptions(request, runtime);
    }

    public UpdateCensorPipelineResponse updateCensorPipelineWithOptions(UpdateCensorPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCensorPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCensorPipelineResponse());
    }

    public UpdateCensorPipelineResponse updateCensorPipeline(UpdateCensorPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCensorPipelineWithOptions(request, runtime);
    }

    public SubmitSnapshotJobResponse submitSnapshotJobWithOptions(SubmitSnapshotJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitSnapshotJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitSnapshotJobResponse());
    }

    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    public ListCustomPersonsResponse listCustomPersonsWithOptions(ListCustomPersonsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCustomPersons", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListCustomPersonsResponse());
    }

    public ListCustomPersonsResponse listCustomPersons(ListCustomPersonsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCustomPersonsWithOptions(request, runtime);
    }

    public QueryFacerecogJobListResponse queryFacerecogJobListWithOptions(QueryFacerecogJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFacerecogJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFacerecogJobListResponse());
    }

    public QueryFacerecogJobListResponse queryFacerecogJobList(QueryFacerecogJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFacerecogJobListWithOptions(request, runtime);
    }

    public CreateInferenceServerResponse createInferenceServerWithOptions(CreateInferenceServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInferenceServer", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInferenceServerResponse());
    }

    public CreateInferenceServerResponse createInferenceServer(CreateInferenceServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInferenceServerWithOptions(request, runtime);
    }

    public ReportMediaDetailJobResultResponse reportMediaDetailJobResultWithOptions(ReportMediaDetailJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportMediaDetailJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportMediaDetailJobResultResponse());
    }

    public ReportMediaDetailJobResultResponse reportMediaDetailJobResult(ReportMediaDetailJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportMediaDetailJobResultWithOptions(request, runtime);
    }

    public SubmitAnnotationJobResponse submitAnnotationJobWithOptions(SubmitAnnotationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAnnotationJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAnnotationJobResponse());
    }

    public SubmitAnnotationJobResponse submitAnnotationJob(SubmitAnnotationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAnnotationJobWithOptions(request, runtime);
    }

    public RegisterMediaDetailScenarioResponse registerMediaDetailScenarioWithOptions(RegisterMediaDetailScenarioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterMediaDetailScenario", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterMediaDetailScenarioResponse());
    }

    public RegisterMediaDetailScenarioResponse registerMediaDetailScenario(RegisterMediaDetailScenarioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerMediaDetailScenarioWithOptions(request, runtime);
    }

    public QueryVideoSplitJobListResponse queryVideoSplitJobListWithOptions(QueryVideoSplitJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryVideoSplitJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryVideoSplitJobListResponse());
    }

    public QueryVideoSplitJobListResponse queryVideoSplitJobList(QueryVideoSplitJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVideoSplitJobListWithOptions(request, runtime);
    }

    public ReportAnnotationJobResultResponse reportAnnotationJobResultWithOptions(ReportAnnotationJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportAnnotationJobResult", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new ReportAnnotationJobResultResponse());
    }

    public ReportAnnotationJobResultResponse reportAnnotationJobResult(ReportAnnotationJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportAnnotationJobResultWithOptions(request, runtime);
    }

    public BindInputBucketResponse bindInputBucketWithOptions(BindInputBucketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindInputBucket", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new BindInputBucketResponse());
    }

    public BindInputBucketResponse bindInputBucket(BindInputBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindInputBucketWithOptions(request, runtime);
    }

    public QueryPipelineListResponse queryPipelineListWithOptions(QueryPipelineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPipelineList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPipelineListResponse());
    }

    public QueryPipelineListResponse queryPipelineList(QueryPipelineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPipelineListWithOptions(request, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    public UpdateCoverPipelineResponse updateCoverPipelineWithOptions(UpdateCoverPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCoverPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCoverPipelineResponse());
    }

    public UpdateCoverPipelineResponse updateCoverPipeline(UpdateCoverPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCoverPipelineWithOptions(request, runtime);
    }

    public UpdateTerrorismPipelineResponse updateTerrorismPipelineWithOptions(UpdateTerrorismPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTerrorismPipeline", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTerrorismPipelineResponse());
    }

    public UpdateTerrorismPipelineResponse updateTerrorismPipeline(UpdateTerrorismPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTerrorismPipelineWithOptions(request, runtime);
    }

    public QueryInferenceJobResponse queryInferenceJobWithOptions(QueryInferenceJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInferenceJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryInferenceJobResponse());
    }

    public QueryInferenceJobResponse queryInferenceJob(QueryInferenceJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInferenceJobWithOptions(request, runtime);
    }

    public QueryVideoPoseJobListResponse queryVideoPoseJobListWithOptions(QueryVideoPoseJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryVideoPoseJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryVideoPoseJobListResponse());
    }

    public QueryVideoPoseJobListResponse queryVideoPoseJobList(QueryVideoPoseJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVideoPoseJobListWithOptions(request, runtime);
    }

    public SubmitAnalysisJobResponse submitAnalysisJobWithOptions(SubmitAnalysisJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAnalysisJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAnalysisJobResponse());
    }

    public SubmitAnalysisJobResponse submitAnalysisJob(SubmitAnalysisJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAnalysisJobWithOptions(request, runtime);
    }

    public SubmitVideoSplitJobResponse submitVideoSplitJobWithOptions(SubmitVideoSplitJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitVideoSplitJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitVideoSplitJobResponse());
    }

    public SubmitVideoSplitJobResponse submitVideoSplitJob(SubmitVideoSplitJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitVideoSplitJobWithOptions(request, runtime);
    }

    public PlayInfoResponse playInfoWithOptions(PlayInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PlayInfo", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new PlayInfoResponse());
    }

    public PlayInfoResponse playInfo(PlayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.playInfoWithOptions(request, runtime);
    }

    public SubmitSubtitleJobResponse submitSubtitleJobWithOptions(SubmitSubtitleJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitSubtitleJob", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitSubtitleJobResponse());
    }

    public SubmitSubtitleJobResponse submitSubtitleJob(SubmitSubtitleJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSubtitleJobWithOptions(request, runtime);
    }

    public QueryCoverJobListResponse queryCoverJobListWithOptions(QueryCoverJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCoverJobList", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCoverJobListResponse());
    }

    public QueryCoverJobListResponse queryCoverJobList(QueryCoverJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCoverJobListWithOptions(request, runtime);
    }

    public AddWaterMarkTemplateResponse addWaterMarkTemplateWithOptions(AddWaterMarkTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddWaterMarkTemplate", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddWaterMarkTemplateResponse());
    }

    public AddWaterMarkTemplateResponse addWaterMarkTemplate(AddWaterMarkTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addWaterMarkTemplateWithOptions(request, runtime);
    }

    public PlayerAuthResponse playerAuthWithOptions(PlayerAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PlayerAuth", "2014-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new PlayerAuthResponse());
    }

    public PlayerAuthResponse playerAuth(PlayerAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.playerAuthWithOptions(request, runtime);
    }
}

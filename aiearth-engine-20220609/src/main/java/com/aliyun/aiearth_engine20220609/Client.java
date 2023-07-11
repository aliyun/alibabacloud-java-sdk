// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609;

import com.aliyun.tea.*;
import com.aliyun.aiearth_engine20220609.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aiearth-engine", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateAIJobResponse createAIJobWithOptions(CreateAIJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAIJobShrinkRequest request = new CreateAIJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.app)) {
            body.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areaThreshold)) {
            body.put("AreaThreshold", request.areaThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.confidence)) {
            body.put("Confidence", request.confidence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputsShrink)) {
            body.put("Inputs", request.inputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelProjectId)) {
            body.put("ModelProjectId", request.modelProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            body.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shapeDataId)) {
            body.put("ShapeDataId", request.shapeDataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shapeWkt)) {
            body.put("ShapeWkt", request.shapeWkt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAIJob"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAIJobResponse());
    }

    public CreateAIJobResponse createAIJob(CreateAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAIJobWithOptions(request, runtime);
    }

    public DeleteJobsResponse deleteJobsWithOptions(DeleteJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteJobsShrinkRequest request = new DeleteJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            body.put("JobIds", request.jobIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJobs"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobsResponse());
    }

    public DeleteJobsResponse deleteJobs(DeleteJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJobsWithOptions(request, runtime);
    }

    public DeleteUserRasterDatasResponse deleteUserRasterDatasWithOptions(DeleteUserRasterDatasRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteUserRasterDatasShrinkRequest request = new DeleteUserRasterDatasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIds)) {
            request.dataIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIds, "DataIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIdsShrink)) {
            body.put("DataIds", request.dataIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserRasterDatas"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserRasterDatasResponse());
    }

    public DeleteUserRasterDatasResponse deleteUserRasterDatas(DeleteUserRasterDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserRasterDatasWithOptions(request, runtime);
    }

    public DeleteUserVectorDatasResponse deleteUserVectorDatasWithOptions(DeleteUserVectorDatasRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteUserVectorDatasShrinkRequest request = new DeleteUserVectorDatasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIds)) {
            request.dataIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIds, "DataIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIdsShrink)) {
            body.put("DataIds", request.dataIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserVectorDatas"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserVectorDatasResponse());
    }

    public DeleteUserVectorDatasResponse deleteUserVectorDatas(DeleteUserVectorDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserVectorDatasWithOptions(request, runtime);
    }

    public DownloadDataResponse downloadDataWithOptions(DownloadDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandNo)) {
            body.put("BandNo", request.bandNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compress)) {
            body.put("Compress", request.compress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("DataId", request.dataId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadData"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadDataResponse());
    }

    public DownloadDataResponse downloadData(DownloadDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadDataWithOptions(request, runtime);
    }

    public GetJobsResponse getJobsWithOptions(GetJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetJobsShrinkRequest request = new GetJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            body.put("JobIds", request.jobIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            body.put("NameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobs"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobsResponse());
    }

    public GetJobsResponse getJobs(GetJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobsWithOptions(request, runtime);
    }

    public GetUserTokenResponse getUserTokenWithOptions(GetUserTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceCreate)) {
            body.put("ForceCreate", request.forceCreate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserToken"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserTokenResponse());
    }

    public GetUserTokenResponse getUserToken(GetUserTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserTokenWithOptions(request, runtime);
    }

    public ListDatasResponse listDatasWithOptions(ListDatasRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDatasShrinkRequest request = new ListDatasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTypeList)) {
            request.sourceTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTypeList, "SourceTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudageMax)) {
            body.put("CloudageMax", request.cloudageMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudageMin)) {
            body.put("CloudageMin", request.cloudageMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateEnd)) {
            body.put("DateEnd", request.dateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateStart)) {
            body.put("DateStart", request.dateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionWkt)) {
            body.put("RegionWkt", request.regionWkt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypeListShrink)) {
            body.put("SourceTypeList", request.sourceTypeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatas"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasResponse());
    }

    public ListDatasResponse listDatas(ListDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatasWithOptions(request, runtime);
    }

    public ListUserMapServiceDatasResponse listUserMapServiceDatasWithOptions(ListUserMapServiceDatasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createDay)) {
            body.put("CreateDay", request.createDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserMapServiceDatas"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserMapServiceDatasResponse());
    }

    public ListUserMapServiceDatasResponse listUserMapServiceDatas(ListUserMapServiceDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserMapServiceDatasWithOptions(request, runtime);
    }

    public ListUserRasterDatasResponse listUserRasterDatasWithOptions(ListUserRasterDatasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acquisitionDate)) {
            body.put("AcquisitionDate", request.acquisitionDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromType)) {
            body.put("FromType", request.fromType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            body.put("Resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadDate)) {
            body.put("UploadDate", request.uploadDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserRasterDatas"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserRasterDatasResponse());
    }

    public ListUserRasterDatasResponse listUserRasterDatas(ListUserRasterDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserRasterDatasWithOptions(request, runtime);
    }

    public ListUserVectorDatasResponse listUserVectorDatasWithOptions(ListUserVectorDatasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromType)) {
            body.put("FromType", request.fromType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadDate)) {
            body.put("UploadDate", request.uploadDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserVectorDatas"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserVectorDatasResponse());
    }

    public ListUserVectorDatasResponse listUserVectorDatas(ListUserVectorDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserVectorDatasWithOptions(request, runtime);
    }

    public PublishMapserviceResponse publishMapserviceWithOptions(PublishMapserviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectionType)) {
            body.put("ProjectionType", request.projectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoomLevelMax)) {
            body.put("ZoomLevelMax", request.zoomLevelMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoomLevelMin)) {
            body.put("ZoomLevelMin", request.zoomLevelMin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishMapservice"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishMapserviceResponse());
    }

    public PublishMapserviceResponse publishMapservice(PublishMapserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishMapserviceWithOptions(request, runtime);
    }

    public PublishRasterResponse publishRasterWithOptions(PublishRasterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acquisitionDate)) {
            body.put("AcquisitionDate", request.acquisitionDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachDownloadUrl)) {
            body.put("AttachDownloadUrl", request.attachDownloadUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachFileType)) {
            body.put("AttachFileType", request.attachFileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadUrl)) {
            body.put("DownloadUrl", request.downloadUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRaster"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRasterResponse());
    }

    public PublishRasterResponse publishRaster(PublishRasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishRasterWithOptions(request, runtime);
    }

    public PublishVectorResponse publishVectorWithOptions(PublishVectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downloadUrl)) {
            body.put("DownloadUrl", request.downloadUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishVector"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishVectorResponse());
    }

    public PublishVectorResponse publishVector(PublishVectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishVectorWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801;

import com.aliyun.tea.*;
import com.aliyun.datatrust20220801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("datatrust", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateMpcPrivateIdJobResponse createMpcPrivateIdJobWithOptions(CreateMpcPrivateIdJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMpcPrivateIdJobShrinkRequest request = new CreateMpcPrivateIdJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantList)) {
            body.put("ParticipantList", request.participantList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMpcPrivateIdJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMpcPrivateIdJobResponse());
    }

    public CreateMpcPrivateIdJobResponse createMpcPrivateIdJob(CreateMpcPrivateIdJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMpcPrivateIdJobWithOptions(request, runtime);
    }

    public CreateMpcSqlJobResponse createMpcSqlJobWithOptions(CreateMpcSqlJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMpcSqlJobShrinkRequest request = new CreateMpcSqlJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputs)) {
            request.outputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputs, "Outputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputsShrink)) {
            body.put("Inputs", request.inputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputsShrink)) {
            body.put("Outputs", request.outputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMpcSqlJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMpcSqlJobResponse());
    }

    public CreateMpcSqlJobResponse createMpcSqlJob(CreateMpcSqlJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMpcSqlJobWithOptions(request, runtime);
    }

    public CreatePrivateIdJobResponse createPrivateIdJobWithOptions(CreatePrivateIdJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePrivateIdJobShrinkRequest request = new CreatePrivateIdJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantList)) {
            body.put("ParticipantList", request.participantList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivateIdJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivateIdJobResponse());
    }

    public CreatePrivateIdJobResponse createPrivateIdJob(CreatePrivateIdJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateIdJobWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectShrinkRequest request = new CreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.projectModeList)) {
            request.projectModeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.projectModeList, "ProjectModeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectModeListShrink)) {
            body.put("ProjectModeList", request.projectModeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public CreateProjectMetaResponse createProjectMetaWithOptions(CreateProjectMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectType)) {
            body.put("ProjectType", request.projectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTableId)) {
            body.put("SourceTableId", request.sourceTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProjectId)) {
            body.put("TargetProjectId", request.targetProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTableName)) {
            body.put("TargetTableName", request.targetTableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProjectMeta"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectMetaResponse());
    }

    public CreateProjectMetaResponse createProjectMeta(CreateProjectMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectMetaWithOptions(request, runtime);
    }

    public CreateTrustDaPsiJobResponse createTrustDaPsiJobWithOptions(CreateTrustDaPsiJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTrustDaPsiJobShrinkRequest request = new CreateTrustDaPsiJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.psiPreCacheConfig))) {
            request.psiPreCacheConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.psiPreCacheConfig), "PsiPreCacheConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.psiPreCacheConfigShrink)) {
            body.put("PsiPreCacheConfig", request.psiPreCacheConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrustDaPsiJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrustDaPsiJobResponse());
    }

    public CreateTrustDaPsiJobResponse createTrustDaPsiJob(CreateTrustDaPsiJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrustDaPsiJobWithOptions(request, runtime);
    }

    public CreateTrustDaPsiPreCacheJobResponse createTrustDaPsiPreCacheJobWithOptions(CreateTrustDaPsiPreCacheJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTrustDaPsiPreCacheJobShrinkRequest request = new CreateTrustDaPsiPreCacheJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.psiPreCacheConfig))) {
            request.psiPreCacheConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.psiPreCacheConfig), "PsiPreCacheConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.psiPreCacheConfigShrink)) {
            body.put("PsiPreCacheConfig", request.psiPreCacheConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrustDaPsiPreCacheJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrustDaPsiPreCacheJobResponse());
    }

    public CreateTrustDaPsiPreCacheJobResponse createTrustDaPsiPreCacheJob(CreateTrustDaPsiPreCacheJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrustDaPsiPreCacheJobWithOptions(request, runtime);
    }

    public CreateTrustDaSqlJobResponse createTrustDaSqlJobWithOptions(CreateTrustDaSqlJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTrustDaSqlJobShrinkRequest request = new CreateTrustDaSqlJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputs)) {
            request.outputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputs, "Outputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputsShrink)) {
            body.put("Inputs", request.inputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputsShrink)) {
            body.put("Outputs", request.outputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrustDaSqlJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrustDaSqlJobResponse());
    }

    public CreateTrustDaSqlJobResponse createTrustDaSqlJob(CreateTrustDaSqlJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrustDaSqlJobWithOptions(request, runtime);
    }

    public CreateTrustMlDataProcessConfigResponse createTrustMlDataProcessConfigWithOptions(CreateTrustMlDataProcessConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessDtoList)) {
            body.put("DataProcessDtoList", request.dataProcessDtoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobMode)) {
            body.put("JobMode", request.jobMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrustMlDataProcessConfig"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrustMlDataProcessConfigResponse());
    }

    public CreateTrustMlDataProcessConfigResponse createTrustMlDataProcessConfig(CreateTrustMlDataProcessConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrustMlDataProcessConfigWithOptions(request, runtime);
    }

    public CreateTrustMlPredictionJobResponse createTrustMlPredictionJobWithOptions(CreateTrustMlPredictionJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTrustMlPredictionJobShrinkRequest request = new CreateTrustMlPredictionJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataProcessTypeOrder)) {
            request.dataProcessTypeOrderShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataProcessTypeOrder, "DataProcessTypeOrder", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessDtoList)) {
            body.put("DataProcessDtoList", request.dataProcessDtoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessTypeOrderShrink)) {
            body.put("DataProcessTypeOrder", request.dataProcessTypeOrderShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureDistribution)) {
            body.put("FeatureDistribution", request.featureDistribution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureFormat)) {
            body.put("FeatureFormat", request.featureFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostFeatureNum)) {
            body.put("HostFeatureNum", request.hostFeatureNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputDs)) {
            body.put("OutputDs", request.outputDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputId)) {
            body.put("OutputId", request.outputId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputName)) {
            body.put("OutputName", request.outputName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionType)) {
            body.put("PartitionType", request.partitionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictionResultTo)) {
            body.put("PredictionResultTo", request.predictionResultTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceApiId)) {
            body.put("ServiceApiId", request.serviceApiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveFeatureNum)) {
            body.put("SlaveFeatureNum", request.slaveFeatureNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobId)) {
            body.put("TrainingJobId", request.trainingJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobName)) {
            body.put("TrainingJobName", request.trainingJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelId)) {
            body.put("TrainingModelId", request.trainingModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelName)) {
            body.put("TrainingModelName", request.trainingModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelVersion)) {
            body.put("TrainingModelVersion", request.trainingModelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelVersionName)) {
            body.put("TrainingModelVersionName", request.trainingModelVersionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrustMlPredictionJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrustMlPredictionJobResponse());
    }

    public CreateTrustMlPredictionJobResponse createTrustMlPredictionJob(CreateTrustMlPredictionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrustMlPredictionJobWithOptions(request, runtime);
    }

    public CreateTrustMlTrainingJobResponse createTrustMlTrainingJobWithOptions(CreateTrustMlTrainingJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTrustMlTrainingJobShrinkRequest request = new CreateTrustMlTrainingJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataProcessTypeOrder)) {
            request.dataProcessTypeOrderShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataProcessTypeOrder, "DataProcessTypeOrder", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trainingModelVersion)) {
            request.trainingModelVersionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trainingModelVersion, "TrainingModelVersion", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trainingModelVersionName)) {
            request.trainingModelVersionNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trainingModelVersionName, "TrainingModelVersionName", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algId)) {
            body.put("AlgId", request.algId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algName)) {
            body.put("AlgName", request.algName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algRound)) {
            body.put("AlgRound", request.algRound);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algTypeId)) {
            body.put("AlgTypeId", request.algTypeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algTypeName)) {
            body.put("AlgTypeName", request.algTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algVersion)) {
            body.put("AlgVersion", request.algVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessDtoList)) {
            body.put("DataProcessDtoList", request.dataProcessDtoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessTypeOrderShrink)) {
            body.put("DataProcessTypeOrder", request.dataProcessTypeOrderShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicParams)) {
            body.put("DynamicParams", request.dynamicParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureDistribution)) {
            body.put("FeatureDistribution", request.featureDistribution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureFormat)) {
            body.put("FeatureFormat", request.featureFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostFeatureNum)) {
            body.put("HostFeatureNum", request.hostFeatureNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionType)) {
            body.put("PartitionType", request.partitionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeList)) {
            body.put("ProtocolTypeList", request.protocolTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomSeed)) {
            body.put("RandomSeed", request.randomSeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveFeatureNum)) {
            body.put("SlaveFeatureNum", request.slaveFeatureNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelId)) {
            body.put("TrainingModelId", request.trainingModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelName)) {
            body.put("TrainingModelName", request.trainingModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelVersionShrink)) {
            body.put("TrainingModelVersion", request.trainingModelVersionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelVersionNameShrink)) {
            body.put("TrainingModelVersionName", request.trainingModelVersionNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingSetProportion)) {
            body.put("TrainingSetProportion", request.trainingSetProportion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrustMlTrainingJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrustMlTrainingJobResponse());
    }

    public CreateTrustMlTrainingJobResponse createTrustMlTrainingJob(CreateTrustMlTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrustMlTrainingJobWithOptions(request, runtime);
    }

    public CsccSystemInitResponse csccSystemInitWithOptions(CsccSystemInitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendId)) {
            body.put("ExtendId", request.extendId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CsccSystemInit"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CsccSystemInitResponse());
    }

    public CsccSystemInitResponse csccSystemInit(CsccSystemInitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.csccSystemInitWithOptions(request, runtime);
    }

    public DeleteBatchProjectMetaResponse deleteBatchProjectMetaWithOptions(DeleteBatchProjectMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdList)) {
            body.put("TableIdList", request.tableIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBatchProjectMeta"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBatchProjectMetaResponse());
    }

    public DeleteBatchProjectMetaResponse deleteBatchProjectMeta(DeleteBatchProjectMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBatchProjectMetaWithOptions(request, runtime);
    }

    public DeleteCsccJobResponse deleteCsccJobWithOptions(DeleteCsccJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorName)) {
            body.put("CreatorName", request.creatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteStatus)) {
            body.put("DeleteStatus", request.deleteStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            body.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runStatus)) {
            body.put("RunStatus", request.runStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStatus)) {
            body.put("UpdateStatus", request.updateStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCsccJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCsccJobResponse());
    }

    public DeleteCsccJobResponse deleteCsccJob(DeleteCsccJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCsccJobWithOptions(request, runtime);
    }

    public DeleteMetaResponse deleteMetaWithOptions(DeleteMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lsccTableId)) {
            body.put("LsccTableId", request.lsccTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMeta"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetaResponse());
    }

    public DeleteMetaResponse deleteMeta(DeleteMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaWithOptions(request, runtime);
    }

    public DeleteOnlineServiceResponse deleteOnlineServiceWithOptions(DeleteOnlineServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorName)) {
            body.put("CreatorName", request.creatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteStatus)) {
            body.put("DeleteStatus", request.deleteStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            body.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runStatus)) {
            body.put("RunStatus", request.runStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStatus)) {
            body.put("UpdateStatus", request.updateStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOnlineService"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOnlineServiceResponse());
    }

    public DeleteOnlineServiceResponse deleteOnlineService(DeleteOnlineServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOnlineServiceWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public DeleteProjectMetaResponse deleteProjectMetaWithOptions(DeleteProjectMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            body.put("TableId", request.tableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProjectMeta"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectMetaResponse());
    }

    public DeleteProjectMetaResponse deleteProjectMeta(DeleteProjectMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectMetaWithOptions(request, runtime);
    }

    public ExitProjectResponse exitProjectWithOptions(ExitProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExitProject"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExitProjectResponse());
    }

    public ExitProjectResponse exitProject(ExitProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exitProjectWithOptions(request, runtime);
    }

    public GetCsccApprovalDetailResponse getCsccApprovalDetailWithOptions(GetCsccApprovalDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCsccApprovalDetail"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCsccApprovalDetailResponse());
    }

    public GetCsccApprovalDetailResponse getCsccApprovalDetail(GetCsccApprovalDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsccApprovalDetailWithOptions(request, runtime);
    }

    public GetCsccApprovalFlowResponse getCsccApprovalFlowWithOptions(GetCsccApprovalFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCsccApprovalFlow"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCsccApprovalFlowResponse());
    }

    public GetCsccApprovalFlowResponse getCsccApprovalFlow(GetCsccApprovalFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsccApprovalFlowWithOptions(request, runtime);
    }

    public GetCsccApprovalInfoResponse getCsccApprovalInfoWithOptions(GetCsccApprovalInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCsccApprovalInfo"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCsccApprovalInfoResponse());
    }

    public GetCsccApprovalInfoResponse getCsccApprovalInfo(GetCsccApprovalInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsccApprovalInfoWithOptions(request, runtime);
    }

    public GetCsccApprovalStatsResponse getCsccApprovalStatsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCsccApprovalStats"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCsccApprovalStatsResponse());
    }

    public GetCsccApprovalStatsResponse getCsccApprovalStats() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsccApprovalStatsWithOptions(runtime);
    }

    public GetCsccInfoResponse getCsccInfoWithOptions(GetCsccInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendId)) {
            body.put("ExtendId", request.extendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCsccInfo"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCsccInfoResponse());
    }

    public GetCsccInfoResponse getCsccInfo(GetCsccInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsccInfoWithOptions(request, runtime);
    }

    public GetCsccJobInstanceResponse getCsccJobInstanceWithOptions(GetCsccJobInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceId)) {
            body.put("JobInstanceId", request.jobInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCsccJobInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCsccJobInstanceResponse());
    }

    public GetCsccJobInstanceResponse getCsccJobInstance(GetCsccJobInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsccJobInstanceWithOptions(request, runtime);
    }

    public GetCsccProposerNameResponse getCsccProposerNameWithOptions(GetCsccProposerNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("MemberId", request.memberId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCsccProposerName"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCsccProposerNameResponse());
    }

    public GetCsccProposerNameResponse getCsccProposerName(GetCsccProposerNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsccProposerNameWithOptions(request, runtime);
    }

    public GetDefaultTrustMlDataProcessConfigResponse getDefaultTrustMlDataProcessConfigWithOptions(GetDefaultTrustMlDataProcessConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algName)) {
            body.put("AlgName", request.algName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureFormat)) {
            body.put("FeatureFormat", request.featureFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobId)) {
            body.put("TrainingJobId", request.trainingJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultTrustMlDataProcessConfig"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDefaultTrustMlDataProcessConfigResponse());
    }

    public GetDefaultTrustMlDataProcessConfigResponse getDefaultTrustMlDataProcessConfig(GetDefaultTrustMlDataProcessConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultTrustMlDataProcessConfigWithOptions(request, runtime);
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponse getHistoryFlTrainingJobInstanceByJobIdWithOptions(GetHistoryFlTrainingJobInstanceByJobIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoryFlTrainingJobInstanceByJobId"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryFlTrainingJobInstanceByJobIdResponse());
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponse getHistoryFlTrainingJobInstanceByJobId(GetHistoryFlTrainingJobInstanceByJobIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoryFlTrainingJobInstanceByJobIdWithOptions(request, runtime);
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponse getHistoryPsiPreCacheJobsForJobMembersWithOptions(GetHistoryPsiPreCacheJobsForJobMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId1)) {
            body.put("MemberId1", request.memberId1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId2)) {
            body.put("MemberId2", request.memberId2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoryPsiPreCacheJobsForJobMembers"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryPsiPreCacheJobsForJobMembersResponse());
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponse getHistoryPsiPreCacheJobsForJobMembers(GetHistoryPsiPreCacheJobsForJobMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoryPsiPreCacheJobsForJobMembersWithOptions(request, runtime);
    }

    public GetJobInfoResponse getJobInfoWithOptions(GetJobInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceId)) {
            body.put("JobInstanceId", request.jobInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobInfo"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobInfoResponse());
    }

    public GetJobInfoResponse getJobInfo(GetJobInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobInfoWithOptions(request, runtime);
    }

    public GetJobInstanceRunLogResponse getJobInstanceRunLogWithOptions(GetJobInstanceRunLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logId)) {
            body.put("LogId", request.logId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            body.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobInstanceRunLog"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobInstanceRunLogResponse());
    }

    public GetJobInstanceRunLogResponse getJobInstanceRunLog(GetJobInstanceRunLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobInstanceRunLogWithOptions(request, runtime);
    }

    public GetJobInstanceSummaryResponse getJobInstanceSummaryWithOptions(GetJobInstanceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logId)) {
            body.put("LogId", request.logId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobInstanceSummary"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobInstanceSummaryResponse());
    }

    public GetJobInstanceSummaryResponse getJobInstanceSummary(GetJobInstanceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobInstanceSummaryWithOptions(request, runtime);
    }

    public GetModelingResponse getModelingWithOptions(GetModelingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelingId)) {
            body.put("ModelingId", request.modelingId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModeling"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelingResponse());
    }

    public GetModelingResponse getModeling(GetModelingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelingWithOptions(request, runtime);
    }

    public GetMpcPrivateIdJobResponse getMpcPrivateIdJobWithOptions(GetMpcPrivateIdJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMpcPrivateIdJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMpcPrivateIdJobResponse());
    }

    public GetMpcPrivateIdJobResponse getMpcPrivateIdJob(GetMpcPrivateIdJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMpcPrivateIdJobWithOptions(request, runtime);
    }

    public GetMpcSqlJobResponse getMpcSqlJobWithOptions(GetMpcSqlJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMpcSqlJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMpcSqlJobResponse());
    }

    public GetMpcSqlJobResponse getMpcSqlJob(GetMpcSqlJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMpcSqlJobWithOptions(request, runtime);
    }

    public GetPrivateDataDetailResponse getPrivateDataDetailWithOptions(GetPrivateDataDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            body.put("TableId", request.tableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrivateDataDetail"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrivateDataDetailResponse());
    }

    public GetPrivateDataDetailResponse getPrivateDataDetail(GetPrivateDataDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrivateDataDetailWithOptions(request, runtime);
    }

    public GetPrivateIdJobResponse getPrivateIdJobWithOptions(GetPrivateIdJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrivateIdJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrivateIdJobResponse());
    }

    public GetPrivateIdJobResponse getPrivateIdJob(GetPrivateIdJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrivateIdJobWithOptions(request, runtime);
    }

    public GetProjectByTokenResponse getProjectByTokenWithOptions(GetProjectByTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectByToken"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectByTokenResponse());
    }

    public GetProjectByTokenResponse getProjectByToken(GetProjectByTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectByTokenWithOptions(request, runtime);
    }

    public GetProjectDetailResponse getProjectDetailWithOptions(GetProjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectType)) {
            body.put("ProjectType", request.projectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectDetail"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectDetailResponse());
    }

    public GetProjectDetailResponse getProjectDetail(GetProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectDetailWithOptions(request, runtime);
    }

    public GetProjectSettingResponse getProjectSettingWithOptions(GetProjectSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectSetting"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectSettingResponse());
    }

    public GetProjectSettingResponse getProjectSetting(GetProjectSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectSettingWithOptions(request, runtime);
    }

    public GetProjectStatsResponse getProjectStatsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectStats"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectStatsResponse());
    }

    public GetProjectStatsResponse getProjectStats() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectStatsWithOptions(runtime);
    }

    public GetStepForwardLogResponse getStepForwardLogWithOptions(GetStepForwardLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            body.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.step)) {
            body.put("Step", request.step);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStepForwardLog"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStepForwardLogResponse());
    }

    public GetStepForwardLogResponse getStepForwardLog(GetStepForwardLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStepForwardLogWithOptions(request, runtime);
    }

    public GetTableIdByNameResponse getTableIdByNameWithOptions(GetTableIdByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableIdByName"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableIdByNameResponse());
    }

    public GetTableIdByNameResponse getTableIdByName(GetTableIdByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableIdByNameWithOptions(request, runtime);
    }

    public GetTrustDaPsiJobResponse getTrustDaPsiJobWithOptions(GetTrustDaPsiJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrustDaPsiJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrustDaPsiJobResponse());
    }

    public GetTrustDaPsiJobResponse getTrustDaPsiJob(GetTrustDaPsiJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrustDaPsiJobWithOptions(request, runtime);
    }

    public GetTrustDaPsiPreCacheJobResponse getTrustDaPsiPreCacheJobWithOptions(GetTrustDaPsiPreCacheJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrustDaPsiPreCacheJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrustDaPsiPreCacheJobResponse());
    }

    public GetTrustDaPsiPreCacheJobResponse getTrustDaPsiPreCacheJob(GetTrustDaPsiPreCacheJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrustDaPsiPreCacheJobWithOptions(request, runtime);
    }

    public GetTrustDaSqlJobResponse getTrustDaSqlJobWithOptions(GetTrustDaSqlJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrustDaSqlJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrustDaSqlJobResponse());
    }

    public GetTrustDaSqlJobResponse getTrustDaSqlJob(GetTrustDaSqlJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrustDaSqlJobWithOptions(request, runtime);
    }

    public GetTrustMlPredictionDataProcessConfigResponse getTrustMlPredictionDataProcessConfigWithOptions(GetTrustMlPredictionDataProcessConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algName)) {
            body.put("AlgName", request.algName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureFormat)) {
            body.put("FeatureFormat", request.featureFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobId)) {
            body.put("TrainingJobId", request.trainingJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrustMlPredictionDataProcessConfig"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrustMlPredictionDataProcessConfigResponse());
    }

    public GetTrustMlPredictionDataProcessConfigResponse getTrustMlPredictionDataProcessConfig(GetTrustMlPredictionDataProcessConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrustMlPredictionDataProcessConfigWithOptions(request, runtime);
    }

    public GetTrustMlPredictionJobResponse getTrustMlPredictionJobWithOptions(GetTrustMlPredictionJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrustMlPredictionJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrustMlPredictionJobResponse());
    }

    public GetTrustMlPredictionJobResponse getTrustMlPredictionJob(GetTrustMlPredictionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrustMlPredictionJobWithOptions(request, runtime);
    }

    public GetTrustMlTrainingJobResponse getTrustMlTrainingJobWithOptions(GetTrustMlTrainingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrustMlTrainingJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrustMlTrainingJobResponse());
    }

    public GetTrustMlTrainingJobResponse getTrustMlTrainingJob(GetTrustMlTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrustMlTrainingJobWithOptions(request, runtime);
    }

    public GetUserDetailResponse getUserDetailWithOptions(GetUserDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserDetail"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserDetailResponse());
    }

    public GetUserDetailResponse getUserDetail(GetUserDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDetailWithOptions(request, runtime);
    }

    public InviteProjectMemberResponse inviteProjectMemberWithOptions(InviteProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InviteProjectMember"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InviteProjectMemberResponse());
    }

    public InviteProjectMemberResponse inviteProjectMember(InviteProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inviteProjectMemberWithOptions(request, runtime);
    }

    public JoinProjectResponse joinProjectWithOptions(JoinProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinProject"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinProjectResponse());
    }

    public JoinProjectResponse joinProject(JoinProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinProjectWithOptions(request, runtime);
    }

    public ListCsccAlgModelingsResponse listCsccAlgModelingsWithOptions(ListCsccAlgModelingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelingClassificationId)) {
            body.put("ModelingClassificationId", request.modelingClassificationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccAlgModelings"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccAlgModelingsResponse());
    }

    public ListCsccAlgModelingsResponse listCsccAlgModelings(ListCsccAlgModelingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccAlgModelingsWithOptions(request, runtime);
    }

    public ListCsccApprovalsResponse listCsccApprovalsWithOptions(ListCsccApprovalsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCsccApprovalsShrinkRequest request = new ListCsccApprovalsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.approvalIds)) {
            request.approvalIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.approvalIds, "ApprovalIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.approvalStates)) {
            request.approvalStatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.approvalStates, "ApprovalStates", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.approvalTypes)) {
            request.approvalTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.approvalTypes, "ApprovalTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalIdsShrink)) {
            body.put("ApprovalIds", request.approvalIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatesShrink)) {
            body.put("ApprovalStates", request.approvalStatesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalTypesShrink)) {
            body.put("ApprovalTypes", request.approvalTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverId)) {
            body.put("ApproverId", request.approverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            body.put("Param", request.paramShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerId)) {
            body.put("ProposerId", request.proposerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccApprovals"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccApprovalsResponse());
    }

    public ListCsccApprovalsResponse listCsccApprovals(ListCsccApprovalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccApprovalsWithOptions(request, runtime);
    }

    public ListCsccClassificationsResponse listCsccClassificationsWithOptions(ListCsccClassificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classificationName)) {
            body.put("ClassificationName", request.classificationName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccClassifications"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccClassificationsResponse());
    }

    public ListCsccClassificationsResponse listCsccClassifications(ListCsccClassificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccClassificationsWithOptions(request, runtime);
    }

    public ListCsccEventResponse listCsccEventWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccEvent"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccEventResponse());
    }

    public ListCsccEventResponse listCsccEvent() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccEventWithOptions(runtime);
    }

    public ListCsccInstancesResponse listCsccInstancesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccInstances"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccInstancesResponse());
    }

    public ListCsccInstancesResponse listCsccInstances() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccInstancesWithOptions(runtime);
    }

    public ListCsccJobClassifyTypesResponse listCsccJobClassifyTypesWithOptions(ListCsccJobClassifyTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccJobClassifyTypes"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccJobClassifyTypesResponse());
    }

    public ListCsccJobClassifyTypesResponse listCsccJobClassifyTypes(ListCsccJobClassifyTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccJobClassifyTypesWithOptions(request, runtime);
    }

    public ListCsccJobInstancesResponse listCsccJobInstancesWithOptions(ListCsccJobInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCsccJobInstancesShrinkRequest request = new ListCsccJobInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceStatus)) {
            body.put("JobInstanceStatus", request.jobInstanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceType)) {
            body.put("JobInstanceType", request.jobInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            body.put("Param", request.paramShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccJobInstances"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccJobInstancesResponse());
    }

    public ListCsccJobInstancesResponse listCsccJobInstances(ListCsccJobInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccJobInstancesWithOptions(request, runtime);
    }

    public ListCsccJobModelsResponse listCsccJobModelsWithOptions(ListCsccJobModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobClassifyType)) {
            body.put("JobClassifyType", request.jobClassifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccJobModels"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccJobModelsResponse());
    }

    public ListCsccJobModelsResponse listCsccJobModels(ListCsccJobModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccJobModelsWithOptions(request, runtime);
    }

    public ListCsccJobScheduleTypesResponse listCsccJobScheduleTypesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccJobScheduleTypes"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccJobScheduleTypesResponse());
    }

    public ListCsccJobScheduleTypesResponse listCsccJobScheduleTypes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccJobScheduleTypesWithOptions(runtime);
    }

    public ListCsccJobsResponse listCsccJobsWithOptions(ListCsccJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccJobs"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccJobsResponse());
    }

    public ListCsccJobsResponse listCsccJobs(ListCsccJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccJobsWithOptions(request, runtime);
    }

    public ListCsccProjectModelsResponse listCsccProjectModelsWithOptions(ListCsccProjectModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccProjectModels"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccProjectModelsResponse());
    }

    public ListCsccProjectModelsResponse listCsccProjectModels(ListCsccProjectModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccProjectModelsWithOptions(request, runtime);
    }

    public ListCsccProjectNamesResponse listCsccProjectNamesWithOptions(ListCsccProjectNamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsccProjectNames"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsccProjectNamesResponse());
    }

    public ListCsccProjectNamesResponse listCsccProjectNames(ListCsccProjectNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsccProjectNamesWithOptions(request, runtime);
    }

    public ListJobInstanceRunLogsResponse listJobInstanceRunLogsWithOptions(ListJobInstanceRunLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceId)) {
            body.put("JobInstanceId", request.jobInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            body.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobInstanceRunLogs"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobInstanceRunLogsResponse());
    }

    public ListJobInstanceRunLogsResponse listJobInstanceRunLogs(ListJobInstanceRunLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobInstanceRunLogsWithOptions(request, runtime);
    }

    public ListModelingClassificationsResponse listModelingClassificationsWithOptions(ListModelingClassificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classificationName)) {
            body.put("ClassificationName", request.classificationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelingClassifications"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelingClassificationsResponse());
    }

    public ListModelingClassificationsResponse listModelingClassifications(ListModelingClassificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelingClassificationsWithOptions(request, runtime);
    }

    public ListOnlineServiceJobClassifyTypesResponse listOnlineServiceJobClassifyTypesWithOptions(ListOnlineServiceJobClassifyTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnlineServiceJobClassifyTypes"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnlineServiceJobClassifyTypesResponse());
    }

    public ListOnlineServiceJobClassifyTypesResponse listOnlineServiceJobClassifyTypes(ListOnlineServiceJobClassifyTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOnlineServiceJobClassifyTypesWithOptions(request, runtime);
    }

    public ListOnlineServicesResponse listOnlineServicesWithOptions(ListOnlineServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineServiceName)) {
            body.put("OnlineServiceName", request.onlineServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineServiceStatus)) {
            body.put("OnlineServiceStatus", request.onlineServiceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnlineServices"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnlineServicesResponse());
    }

    public ListOnlineServicesResponse listOnlineServices(ListOnlineServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOnlineServicesWithOptions(request, runtime);
    }

    public ListPrivateDatasResponse listPrivateDatasWithOptions(ListPrivateDatasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateDatas"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateDatasResponse());
    }

    public ListPrivateDatasResponse listPrivateDatas(ListPrivateDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateDatasWithOptions(request, runtime);
    }

    public ListProjectMembersResponse listProjectMembersWithOptions(ListProjectMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMembers"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMembersResponse());
    }

    public ListProjectMembersResponse listProjectMembers(ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMembersWithOptions(request, runtime);
    }

    public ListProjectMetaColumnsResponse listProjectMetaColumnsWithOptions(ListProjectMetaColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            body.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            body.put("TableId", request.tableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMetaColumns"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMetaColumnsResponse());
    }

    public ListProjectMetaColumnsResponse listProjectMetaColumns(ListProjectMetaColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMetaColumnsWithOptions(request, runtime);
    }

    public ListProjectMetaSourceTypesResponse listProjectMetaSourceTypesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMetaSourceTypes"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMetaSourceTypesResponse());
    }

    public ListProjectMetaSourceTypesResponse listProjectMetaSourceTypes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMetaSourceTypesWithOptions(runtime);
    }

    public ListProjectMetasResponse listProjectMetasWithOptions(ListProjectMetasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            body.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMetas"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMetasResponse());
    }

    public ListProjectMetasResponse listProjectMetas(ListProjectMetasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMetasWithOptions(request, runtime);
    }

    public ListProjectTablesResponse listProjectTablesWithOptions(ListProjectTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectTables"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectTablesResponse());
    }

    public ListProjectTablesResponse listProjectTables(ListProjectTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectTablesWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastProjectId)) {
            body.put("LastProjectId", request.lastProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            body.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectType)) {
            body.put("ProjectType", request.projectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public ModifyMpcPrivateIdJobResponse modifyMpcPrivateIdJobWithOptions(ModifyMpcPrivateIdJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyMpcPrivateIdJobShrinkRequest request = new ModifyMpcPrivateIdJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantList)) {
            body.put("ParticipantList", request.participantList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMpcPrivateIdJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMpcPrivateIdJobResponse());
    }

    public ModifyMpcPrivateIdJobResponse modifyMpcPrivateIdJob(ModifyMpcPrivateIdJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMpcPrivateIdJobWithOptions(request, runtime);
    }

    public ModifyMpcSqlJobResponse modifyMpcSqlJobWithOptions(ModifyMpcSqlJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyMpcSqlJobShrinkRequest request = new ModifyMpcSqlJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputs)) {
            request.outputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputs, "Outputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputsShrink)) {
            body.put("Inputs", request.inputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputsShrink)) {
            body.put("Outputs", request.outputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMpcSqlJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMpcSqlJobResponse());
    }

    public ModifyMpcSqlJobResponse modifyMpcSqlJob(ModifyMpcSqlJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMpcSqlJobWithOptions(request, runtime);
    }

    public ModifyPrivateIdJobResponse modifyPrivateIdJobWithOptions(ModifyPrivateIdJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPrivateIdJobShrinkRequest request = new ModifyPrivateIdJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantList)) {
            body.put("ParticipantList", request.participantList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPrivateIdJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrivateIdJobResponse());
    }

    public ModifyPrivateIdJobResponse modifyPrivateIdJob(ModifyPrivateIdJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrivateIdJobWithOptions(request, runtime);
    }

    public ModifyProjectResponse modifyProjectWithOptions(ModifyProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerName)) {
            body.put("OwnerName", request.ownerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProject"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProjectResponse());
    }

    public ModifyProjectResponse modifyProject(ModifyProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProjectWithOptions(request, runtime);
    }

    public ModifyTrustDaPsiJobResponse modifyTrustDaPsiJobWithOptions(ModifyTrustDaPsiJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTrustDaPsiJobShrinkRequest request = new ModifyTrustDaPsiJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.psiPreCacheConfig))) {
            request.psiPreCacheConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.psiPreCacheConfig), "PsiPreCacheConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.psiPreCacheConfigShrink)) {
            body.put("PsiPreCacheConfig", request.psiPreCacheConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrustDaPsiJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrustDaPsiJobResponse());
    }

    public ModifyTrustDaPsiJobResponse modifyTrustDaPsiJob(ModifyTrustDaPsiJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrustDaPsiJobWithOptions(request, runtime);
    }

    public ModifyTrustDaPsiPreCacheJobResponse modifyTrustDaPsiPreCacheJobWithOptions(ModifyTrustDaPsiPreCacheJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTrustDaPsiPreCacheJobShrinkRequest request = new ModifyTrustDaPsiPreCacheJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.psiPreCacheConfig))) {
            request.psiPreCacheConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.psiPreCacheConfig), "PsiPreCacheConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.psiPreCacheConfigShrink)) {
            body.put("PsiPreCacheConfig", request.psiPreCacheConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrustDaPsiPreCacheJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrustDaPsiPreCacheJobResponse());
    }

    public ModifyTrustDaPsiPreCacheJobResponse modifyTrustDaPsiPreCacheJob(ModifyTrustDaPsiPreCacheJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrustDaPsiPreCacheJobWithOptions(request, runtime);
    }

    public ModifyTrustDaSqlJobResponse modifyTrustDaSqlJobWithOptions(ModifyTrustDaSqlJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTrustDaSqlJobShrinkRequest request = new ModifyTrustDaSqlJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputs)) {
            request.outputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputs, "Outputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputsShrink)) {
            body.put("Inputs", request.inputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputsShrink)) {
            body.put("Outputs", request.outputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrustDaSqlJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrustDaSqlJobResponse());
    }

    public ModifyTrustDaSqlJobResponse modifyTrustDaSqlJob(ModifyTrustDaSqlJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrustDaSqlJobWithOptions(request, runtime);
    }

    public ModifyTrustMlPredictionJobResponse modifyTrustMlPredictionJobWithOptions(ModifyTrustMlPredictionJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTrustMlPredictionJobShrinkRequest request = new ModifyTrustMlPredictionJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataProcessTypeOrder)) {
            request.dataProcessTypeOrderShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataProcessTypeOrder, "DataProcessTypeOrder", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolTypeList)) {
            request.protocolTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolTypeList, "ProtocolTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessDtoList)) {
            body.put("DataProcessDtoList", request.dataProcessDtoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessTypeOrderShrink)) {
            body.put("DataProcessTypeOrder", request.dataProcessTypeOrderShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureDistribution)) {
            body.put("FeatureDistribution", request.featureDistribution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureFormat)) {
            body.put("FeatureFormat", request.featureFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostFeatureNum)) {
            body.put("HostFeatureNum", request.hostFeatureNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputDs)) {
            body.put("OutputDs", request.outputDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputId)) {
            body.put("OutputId", request.outputId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputName)) {
            body.put("OutputName", request.outputName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionType)) {
            body.put("PartitionType", request.partitionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictionResultTo)) {
            body.put("PredictionResultTo", request.predictionResultTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeListShrink)) {
            body.put("ProtocolTypeList", request.protocolTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceApiId)) {
            body.put("ServiceApiId", request.serviceApiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveFeatureNum)) {
            body.put("SlaveFeatureNum", request.slaveFeatureNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobId)) {
            body.put("TrainingJobId", request.trainingJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobName)) {
            body.put("TrainingJobName", request.trainingJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelId)) {
            body.put("TrainingModelId", request.trainingModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelName)) {
            body.put("TrainingModelName", request.trainingModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelVersion)) {
            body.put("TrainingModelVersion", request.trainingModelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelVersionName)) {
            body.put("TrainingModelVersionName", request.trainingModelVersionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrustMlPredictionJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrustMlPredictionJobResponse());
    }

    public ModifyTrustMlPredictionJobResponse modifyTrustMlPredictionJob(ModifyTrustMlPredictionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrustMlPredictionJobWithOptions(request, runtime);
    }

    public ModifyTrustMlTrainingJobResponse modifyTrustMlTrainingJobWithOptions(ModifyTrustMlTrainingJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTrustMlTrainingJobShrinkRequest request = new ModifyTrustMlTrainingJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataProcessTypeOrder)) {
            request.dataProcessTypeOrderShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataProcessTypeOrder, "DataProcessTypeOrder", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planList)) {
            request.planListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planList, "PlanList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trainingModelVersion)) {
            request.trainingModelVersionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trainingModelVersion, "TrainingModelVersion", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trainingModelVersionName)) {
            request.trainingModelVersionNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trainingModelVersionName, "TrainingModelVersionName", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algId)) {
            body.put("AlgId", request.algId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algName)) {
            body.put("AlgName", request.algName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algRound)) {
            body.put("AlgRound", request.algRound);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algTypeId)) {
            body.put("AlgTypeId", request.algTypeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algTypeName)) {
            body.put("AlgTypeName", request.algTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algVersion)) {
            body.put("AlgVersion", request.algVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessDtoList)) {
            body.put("DataProcessDtoList", request.dataProcessDtoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessTypeOrderShrink)) {
            body.put("DataProcessTypeOrder", request.dataProcessTypeOrderShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDtos)) {
            body.put("DataSetDtos", request.dataSetDtos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicParams)) {
            body.put("DynamicParams", request.dynamicParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureDistribution)) {
            body.put("FeatureDistribution", request.featureDistribution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureFormat)) {
            body.put("FeatureFormat", request.featureFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostFeatureNum)) {
            body.put("HostFeatureNum", request.hostFeatureNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modeName)) {
            body.put("ModeName", request.modeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionType)) {
            body.put("PartitionType", request.partitionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planListShrink)) {
            body.put("PlanList", request.planListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolTypeList)) {
            body.put("ProtocolTypeList", request.protocolTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomSeed)) {
            body.put("RandomSeed", request.randomSeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCron)) {
            body.put("ScheduleCron", request.scheduleCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTypeName)) {
            body.put("ScheduleTypeName", request.scheduleTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveFeatureNum)) {
            body.put("SlaveFeatureNum", request.slaveFeatureNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelId)) {
            body.put("TrainingModelId", request.trainingModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelName)) {
            body.put("TrainingModelName", request.trainingModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelVersionShrink)) {
            body.put("TrainingModelVersion", request.trainingModelVersionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingModelVersionNameShrink)) {
            body.put("TrainingModelVersionName", request.trainingModelVersionNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingSetProportion)) {
            body.put("TrainingSetProportion", request.trainingSetProportion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrustMlTrainingJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrustMlTrainingJobResponse());
    }

    public ModifyTrustMlTrainingJobResponse modifyTrustMlTrainingJob(ModifyTrustMlTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrustMlTrainingJobWithOptions(request, runtime);
    }

    public OnlineServiceApiTestResponse onlineServiceApiTestWithOptions(OnlineServiceApiTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineServiceApiTest"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineServiceApiTestResponse());
    }

    public OnlineServiceApiTestResponse onlineServiceApiTest(OnlineServiceApiTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onlineServiceApiTestWithOptions(request, runtime);
    }

    public ReportInstanceProgressResponse reportInstanceProgressWithOptions(ReportInstanceProgressRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReportInstanceProgressShrinkRequest request = new ReportInstanceProgressShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.progressInfo)) {
            request.progressInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.progressInfo, "ProgressInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.progressInfoShrink)) {
            body.put("ProgressInfo", request.progressInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportInstanceProgress"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportInstanceProgressResponse());
    }

    public ReportInstanceProgressResponse reportInstanceProgress(ReportInstanceProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportInstanceProgressWithOptions(request, runtime);
    }

    public SaveProjectSettingResponse saveProjectSettingWithOptions(SaveProjectSettingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveProjectSettingShrinkRequest request = new SaveProjectSettingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.switchs)) {
            request.switchsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.switchs, "Switchs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchsShrink)) {
            body.put("Switchs", request.switchsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveProjectSetting"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveProjectSettingResponse());
    }

    public SaveProjectSettingResponse saveProjectSetting(SaveProjectSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveProjectSettingWithOptions(request, runtime);
    }

    public SearchCsccApprovalDetailsResponse searchCsccApprovalDetailsWithOptions(SearchCsccApprovalDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalAction)) {
            body.put("ApprovalAction", request.approvalAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalState)) {
            body.put("ApprovalState", request.approvalState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStateName)) {
            body.put("ApprovalStateName", request.approvalStateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            body.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalTypeName)) {
            body.put("ApprovalTypeName", request.approvalTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverId)) {
            body.put("ApproverId", request.approverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverName)) {
            body.put("ApproverName", request.approverName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverUserId)) {
            body.put("ApproverUserId", request.approverUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            body.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            body.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullCompanyName)) {
            body.put("FullCompanyName", request.fullCompanyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            body.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerId)) {
            body.put("ProposerId", request.proposerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerName)) {
            body.put("ProposerName", request.proposerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runEnvApprovalId)) {
            body.put("RunEnvApprovalId", request.runEnvApprovalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runEnvJobId)) {
            body.put("RunEnvJobId", request.runEnvJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceHost)) {
            body.put("ServiceHost", request.serviceHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePort)) {
            body.put("ServicePort", request.servicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            body.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapShot)) {
            body.put("SnapShot", request.snapShot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportHost)) {
            body.put("TransportHost", request.transportHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportPort)) {
            body.put("TransportPort", request.transportPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCsccApprovalDetails"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCsccApprovalDetailsResponse());
    }

    public SearchCsccApprovalDetailsResponse searchCsccApprovalDetails(SearchCsccApprovalDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchCsccApprovalDetailsWithOptions(request, runtime);
    }

    public SearchCsccApprovalsResponse searchCsccApprovalsWithOptions(SearchCsccApprovalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalState)) {
            body.put("ApprovalState", request.approvalState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStateName)) {
            body.put("ApprovalStateName", request.approvalStateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            body.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalTypeName)) {
            body.put("ApprovalTypeName", request.approvalTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            body.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullCompanyName)) {
            body.put("FullCompanyName", request.fullCompanyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerId)) {
            body.put("ProposerId", request.proposerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerName)) {
            body.put("ProposerName", request.proposerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceHost)) {
            body.put("ServiceHost", request.serviceHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePort)) {
            body.put("ServicePort", request.servicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapShot)) {
            body.put("SnapShot", request.snapShot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportHost)) {
            body.put("TransportHost", request.transportHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportPort)) {
            body.put("TransportPort", request.transportPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCsccApprovals"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCsccApprovalsResponse());
    }

    public SearchCsccApprovalsResponse searchCsccApprovals(SearchCsccApprovalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchCsccApprovalsWithOptions(request, runtime);
    }

    public ShareBatchPrivateDataResponse shareBatchPrivateDataWithOptions(ShareBatchPrivateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectType)) {
            body.put("ProjectType", request.projectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTargetList)) {
            body.put("SourceTargetList", request.sourceTargetList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProjectId)) {
            body.put("TargetProjectId", request.targetProjectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ShareBatchPrivateData"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ShareBatchPrivateDataResponse());
    }

    public ShareBatchPrivateDataResponse shareBatchPrivateData(ShareBatchPrivateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.shareBatchPrivateDataWithOptions(request, runtime);
    }

    public SharePrivateDataResponse sharePrivateDataWithOptions(SharePrivateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectType)) {
            body.put("ProjectType", request.projectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTableId)) {
            body.put("SourceTableId", request.sourceTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProjectId)) {
            body.put("TargetProjectId", request.targetProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTableName)) {
            body.put("TargetTableName", request.targetTableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SharePrivateData"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SharePrivateDataResponse());
    }

    public SharePrivateDataResponse sharePrivateData(SharePrivateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sharePrivateDataWithOptions(request, runtime);
    }

    public StartCsccJobResponse startCsccJobWithOptions(StartCsccJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorName)) {
            body.put("CreatorName", request.creatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteStatus)) {
            body.put("DeleteStatus", request.deleteStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            body.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTypeName)) {
            body.put("JobTypeName", request.jobTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runStatus)) {
            body.put("RunStatus", request.runStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStatus)) {
            body.put("UpdateStatus", request.updateStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCsccJob"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCsccJobResponse());
    }

    public StartCsccJobResponse startCsccJob(StartCsccJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCsccJobWithOptions(request, runtime);
    }

    public StartJobInstanceResponse startJobInstanceWithOptions(StartJobInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceId)) {
            body.put("JobInstanceId", request.jobInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartJobInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobInstanceResponse());
    }

    public StartJobInstanceResponse startJobInstance(StartJobInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startJobInstanceWithOptions(request, runtime);
    }

    public StopJobInstanceResponse stopJobInstanceWithOptions(StopJobInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceId)) {
            body.put("JobInstanceId", request.jobInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopJobInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopJobInstanceResponse());
    }

    public StopJobInstanceResponse stopJobInstance(StopJobInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopJobInstanceWithOptions(request, runtime);
    }

    public SubmitCsccApprovalResponse submitCsccApprovalWithOptions(SubmitCsccApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalAction)) {
            body.put("ApprovalAction", request.approvalAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalState)) {
            body.put("ApprovalState", request.approvalState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStateName)) {
            body.put("ApprovalStateName", request.approvalStateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            body.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalTypeName)) {
            body.put("ApprovalTypeName", request.approvalTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverId)) {
            body.put("ApproverId", request.approverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverName)) {
            body.put("ApproverName", request.approverName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverUserId)) {
            body.put("ApproverUserId", request.approverUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            body.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            body.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullCompanyName)) {
            body.put("FullCompanyName", request.fullCompanyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            body.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerId)) {
            body.put("ProposerId", request.proposerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerName)) {
            body.put("ProposerName", request.proposerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runEnvApprovalId)) {
            body.put("RunEnvApprovalId", request.runEnvApprovalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runEnvJobId)) {
            body.put("RunEnvJobId", request.runEnvJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceHost)) {
            body.put("ServiceHost", request.serviceHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePort)) {
            body.put("ServicePort", request.servicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            body.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapShot)) {
            body.put("SnapShot", request.snapShot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportHost)) {
            body.put("TransportHost", request.transportHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportPort)) {
            body.put("TransportPort", request.transportPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitCsccApproval"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitCsccApprovalResponse());
    }

    public SubmitCsccApprovalResponse submitCsccApproval(SubmitCsccApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCsccApprovalWithOptions(request, runtime);
    }

    public SubmitProjectResponse submitProjectWithOptions(SubmitProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalAction)) {
            body.put("ApprovalAction", request.approvalAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            body.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalState)) {
            body.put("ApprovalState", request.approvalState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStateName)) {
            body.put("ApprovalStateName", request.approvalStateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            body.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalTypeName)) {
            body.put("ApprovalTypeName", request.approvalTypeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverId)) {
            body.put("ApproverId", request.approverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverName)) {
            body.put("ApproverName", request.approverName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approverUserId)) {
            body.put("ApproverUserId", request.approverUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            body.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            body.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullCompanyName)) {
            body.put("FullCompanyName", request.fullCompanyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            body.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerId)) {
            body.put("ProposerId", request.proposerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposerName)) {
            body.put("ProposerName", request.proposerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runEnvApprovalId)) {
            body.put("RunEnvApprovalId", request.runEnvApprovalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runEnvJobId)) {
            body.put("RunEnvJobId", request.runEnvJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceHost)) {
            body.put("ServiceHost", request.serviceHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePort)) {
            body.put("ServicePort", request.servicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            body.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapShot)) {
            body.put("SnapShot", request.snapShot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportHost)) {
            body.put("TransportHost", request.transportHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportPort)) {
            body.put("TransportPort", request.transportPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitProject"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitProjectResponse());
    }

    public SubmitProjectResponse submitProject(SubmitProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitProjectWithOptions(request, runtime);
    }

    public UploadMetaResponse uploadMetaWithOptions(UploadMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadMetaShrinkRequest request = new UploadMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTargetList)) {
            request.sourceTargetListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTargetList, "SourceTargetList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lsccTableDesc)) {
            body.put("LsccTableDesc", request.lsccTableDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lsccTableId)) {
            body.put("LsccTableId", request.lsccTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lsccTableName)) {
            body.put("LsccTableName", request.lsccTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTargetListShrink)) {
            body.put("SourceTargetList", request.sourceTargetListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMeta"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMetaResponse());
    }

    public UploadMetaResponse uploadMeta(UploadMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMetaWithOptions(request, runtime);
    }
}

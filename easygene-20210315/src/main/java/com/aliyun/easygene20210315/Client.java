// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315;

import com.aliyun.tea.*;
import com.aliyun.easygene20210315.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("easygene", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>暂停任务</p>
     * 
     * @param request AbortRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbortRunResponse
     */
    public AbortRunResponse abortRunWithOptions(AbortRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("RunId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortRun"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂停任务</p>
     * 
     * @param request AbortRunRequest
     * @return AbortRunResponse
     */
    public AbortRunResponse abortRun(AbortRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abortRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消投递</p>
     * 
     * @param request AbortSubmissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbortSubmissionResponse
     */
    public AbortSubmissionResponse abortSubmissionWithOptions(AbortSubmissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.submissionId)) {
            query.put("SubmissionId", request.submissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortSubmission"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortSubmissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消投递</p>
     * 
     * @param request AbortSubmissionRequest
     * @return AbortSubmissionResponse
     */
    public AbortSubmissionResponse abortSubmission(AbortSubmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abortSubmissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>拷贝公共数据集的数据表格</p>
     * 
     * @param request CopyPublicEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyPublicEntityResponse
     */
    public CopyPublicEntityResponse copyPublicEntityWithOptions(CopyPublicEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataset)) {
            query.put("Dataset", request.dataset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyPublicEntity"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyPublicEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>拷贝公共数据集的数据表格</p>
     * 
     * @param request CopyPublicEntityRequest
     * @return CopyPublicEntityResponse
     */
    public CopyPublicEntityResponse copyPublicEntity(CopyPublicEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyPublicEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param tmpReq CreateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppShrinkRequest request = new CreateAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configs)) {
            request.configsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configs, "Configs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dependencies)) {
            request.dependenciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dependencies, "Dependencies", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageVersion)) {
            query.put("LanguageVersion", request.languageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionComment)) {
            query.put("RevisionComment", request.revisionComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionTag)) {
            query.put("RevisionTag", request.revisionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsShrink)) {
            body.put("Configs", request.configsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            body.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependenciesShrink)) {
            body.put("Dependencies", request.dependenciesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentation)) {
            body.put("Documentation", request.documentation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2021-03-15"),
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

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据表格</p>
     * 
     * @param tmpReq CreateEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEntityResponse
     */
    public CreateEntityResponse createEntityWithOptions(CreateEntityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEntityShrinkRequest request = new CreateEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityItems)) {
            request.entityItemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityItems, "EntityItems", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityItemsShrink)) {
            body.put("EntityItems", request.entityItemsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEntity"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据表格</p>
     * 
     * @param request CreateEntityRequest
     * @return CreateEntityResponse
     */
    public CreateEntityResponse createEntity(CreateEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param tmpReq CreateRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRunResponse
     */
    public CreateRunResponse createRunWithOptions(CreateRunRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRunShrinkRequest request = new CreateRunShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executeOptions)) {
            request.executeOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executeOptions, "ExecuteOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appRevision)) {
            query.put("AppRevision", request.appRevision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRuntime)) {
            query.put("DefaultRuntime", request.defaultRuntime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeDirectory)) {
            query.put("ExecuteDirectory", request.executeDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeOptionsShrink)) {
            query.put("ExecuteOptions", request.executeOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputs)) {
            query.put("Inputs", request.inputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFolder)) {
            query.put("OutputFolder", request.outputFolder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionTag)) {
            query.put("RevisionTag", request.revisionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runName)) {
            query.put("RunName", request.runName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRun"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateRunRequest
     * @return CreateRunResponse
     */
    public CreateRunResponse createRun(CreateRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建提交</p>
     * 
     * @param tmpReq CreateSubmissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubmissionResponse
     */
    public CreateSubmissionResponse createSubmissionWithOptions(CreateSubmissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSubmissionShrinkRequest request = new CreateSubmissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityNames)) {
            request.entityNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityNames, "EntityNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRuntime)) {
            query.put("DefaultRuntime", request.defaultRuntime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityNamesShrink)) {
            query.put("EntityNames", request.entityNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeDirectory)) {
            query.put("ExecuteDirectory", request.executeDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeOptions)) {
            query.put("ExecuteOptions", request.executeOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputs)) {
            query.put("Inputs", request.inputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFolder)) {
            query.put("OutputFolder", request.outputFolder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("Outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revision)) {
            query.put("Revision", request.revision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionTag)) {
            query.put("RevisionTag", request.revisionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubmission"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubmissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建提交</p>
     * 
     * @param request CreateSubmissionRequest
     * @return CreateSubmissionResponse
     */
    public CreateSubmissionResponse createSubmission(CreateSubmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubmissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用模板</p>
     * 
     * @param tmpReq CreateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTemplateShrinkRequest request = new CreateTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputsExpression)) {
            request.inputsExpressionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputsExpression, "InputsExpression", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputsExpression)) {
            request.outputsExpressionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputsExpression, "OutputsExpression", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appRevision)) {
            query.put("AppRevision", request.appRevision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionTag)) {
            query.put("RevisionTag", request.revisionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootEntity)) {
            query.put("RootEntity", request.rootEntity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputsExpressionShrink)) {
            body.put("InputsExpression", request.inputsExpressionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputsExpressionShrink)) {
            body.put("OutputsExpression", request.outputsExpressionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用模板</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作空间</p>
     * 
     * @param request CreateWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobLifecycle)) {
            query.put("JobLifecycle", request.jobLifecycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storage)) {
            query.put("Storage", request.storage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作空间</p>
     * 
     * @param request CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除应用</p>
     * 
     * @param request DeleteAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revision)) {
            query.put("Revision", request.revision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2021-03-15"),
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

    /**
     * <b>summary</b> : 
     * <p>删除应用</p>
     * 
     * @param request DeleteAppRequest
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实体表格</p>
     * 
     * @param request DeleteEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEntityResponse
     */
    public DeleteEntityResponse deleteEntityWithOptions(DeleteEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEntity"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实体表格</p>
     * 
     * @param request DeleteEntityRequest
     * @return DeleteEntityResponse
     */
    public DeleteEntityResponse deleteEntity(DeleteEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据表格的条目</p>
     * 
     * @param tmpReq DeleteEntityItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEntityItemsResponse
     */
    public DeleteEntityItemsResponse deleteEntityItemsWithOptions(DeleteEntityItemsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEntityItemsShrinkRequest request = new DeleteEntityItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityNames)) {
            request.entityNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityNames, "EntityNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityNamesShrink)) {
            query.put("EntityNames", request.entityNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEntityItems"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEntityItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据表格的条目</p>
     * 
     * @param request DeleteEntityItemsRequest
     * @return DeleteEntityItemsResponse
     */
    public DeleteEntityItemsResponse deleteEntityItems(DeleteEntityItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEntityItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除任务</p>
     * 
     * @param request DeleteRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRunResponse
     */
    public DeleteRunResponse deleteRunWithOptions(DeleteRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("RunId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRun"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除任务</p>
     * 
     * @param request DeleteRunRequest
     * @return DeleteRunResponse
     */
    public DeleteRunResponse deleteRun(DeleteRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除投递</p>
     * 
     * @param request DeleteSubmissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubmissionResponse
     */
    public DeleteSubmissionResponse deleteSubmissionWithOptions(DeleteSubmissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.submissionId)) {
            query.put("SubmissionId", request.submissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubmission"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubmissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除投递</p>
     * 
     * @param request DeleteSubmissionRequest
     * @return DeleteSubmissionResponse
     */
    public DeleteSubmissionResponse deleteSubmission(DeleteSubmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSubmissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除应用模板</p>
     * 
     * @param request DeleteTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除应用模板</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间</p>
     * 
     * @param request DeleteWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(DeleteWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspace"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间</p>
     * 
     * @param request DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载数据表格</p>
     * 
     * @param tmpReq DownloadEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadEntityResponse
     */
    public DownloadEntityResponse downloadEntityWithOptions(DownloadEntityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DownloadEntityShrinkRequest request = new DownloadEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityNames)) {
            request.entityNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityNames, "EntityNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityNamesShrink)) {
            query.put("EntityNames", request.entityNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadEntity"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载数据表格</p>
     * 
     * @param request DownloadEntityRequest
     * @return DownloadEntityResponse
     */
    public DownloadEntityResponse downloadEntity(DownloadEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用详情</p>
     * 
     * @param request GetAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppResponse
     */
    public GetAppResponse getAppWithOptions(GetAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revision)) {
            query.put("Revision", request.revision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionTag)) {
            query.put("RevisionTag", request.revisionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApp"),
            new TeaPair("version", "2021-03-15"),
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

    /**
     * <b>summary</b> : 
     * <p>查询应用详情</p>
     * 
     * @param request GetAppRequest
     * @return GetAppResponse
     */
    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据表格信息</p>
     * 
     * @param request GetEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEntityResponse
     */
    public GetEntityResponse getEntityWithOptions(GetEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntity"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据表格信息</p>
     * 
     * @param request GetEntityRequest
     * @return GetEntityResponse
     */
    public GetEntityResponse getEntity(GetEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共应用详情</p>
     * 
     * @param tmpReq GetGlobalAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGlobalAppResponse
     */
    public GetGlobalAppResponse getGlobalAppWithOptions(GetGlobalAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetGlobalAppShrinkRequest request = new GetGlobalAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributes)) {
            request.attributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributes, "Attributes", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGlobalApp"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGlobalAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共应用详情</p>
     * 
     * @param request GetGlobalAppRequest
     * @return GetGlobalAppResponse
     */
    public GetGlobalAppResponse getGlobalApp(GetGlobalAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGlobalAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共数据集详情</p>
     * 
     * @param tmpReq GetPublicDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublicDatasetResponse
     */
    public GetPublicDatasetResponse getPublicDatasetWithOptions(GetPublicDatasetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPublicDatasetShrinkRequest request = new GetPublicDatasetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributes)) {
            request.attributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributes, "Attributes", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublicDataset"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublicDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共数据集详情</p>
     * 
     * @param request GetPublicDatasetRequest
     * @return GetPublicDatasetResponse
     */
    public GetPublicDatasetResponse getPublicDataset(GetPublicDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共数据集特定的实体定义</p>
     * 
     * @param request GetPublicDatasetEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublicDatasetEntityResponse
     */
    public GetPublicDatasetEntityResponse getPublicDatasetEntityWithOptions(GetPublicDatasetEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublicDatasetEntity"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublicDatasetEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共数据集特定的实体定义</p>
     * 
     * @param request GetPublicDatasetEntityRequest
     * @return GetPublicDatasetEntityResponse
     */
    public GetPublicDatasetEntityResponse getPublicDatasetEntity(GetPublicDatasetEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicDatasetEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务详情</p>
     * 
     * @param request GetRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRunResponse
     */
    public GetRunResponse getRunWithOptions(GetRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRun"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务详情</p>
     * 
     * @param request GetRunRequest
     * @return GetRunResponse
     */
    public GetRunResponse getRun(GetRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取投递详情</p>
     * 
     * @param request GetSubmissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubmissionResponse
     */
    public GetSubmissionResponse getSubmissionWithOptions(GetSubmissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubmission"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubmissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取投递详情</p>
     * 
     * @param request GetSubmissionRequest
     * @return GetSubmissionResponse
     */
    public GetSubmissionResponse getSubmission(GetSubmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubmissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用模板的详情</p>
     * 
     * @param request GetTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用模板的详情</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作空间详情</p>
     * 
     * @param request GetWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspaceWithOptions(GetWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作空间详情</p>
     * 
     * @param request GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导入应用。</p>
     * 
     * @param request ImportAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportAppResponse
     */
    public ImportAppResponse importAppWithOptions(ImportAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportApp"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导入应用。</p>
     * 
     * @param request ImportAppRequest
     * @return ImportAppResponse
     */
    public ImportAppResponse importApp(ImportAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>安装平台公共应用到工作空间中。</p>
     * 
     * @param request InstallGlobalAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallGlobalAppResponse
     */
    public InstallGlobalAppResponse installGlobalAppWithOptions(InstallGlobalAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installedAppName)) {
            query.put("InstalledAppName", request.installedAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallGlobalApp"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallGlobalAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>安装平台公共应用到工作空间中。</p>
     * 
     * @param request InstallGlobalAppRequest
     * @return InstallGlobalAppResponse
     */
    public InstallGlobalAppResponse installGlobalApp(InstallGlobalAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installGlobalAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出应用</p>
     * 
     * @param request ListAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppsResponse
     */
    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReversed)) {
            query.put("IsReversed", request.isReversed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelector)) {
            query.put("LabelSelector", request.labelSelector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApps"),
            new TeaPair("version", "2021-03-15"),
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

    /**
     * <b>summary</b> : 
     * <p>列出应用</p>
     * 
     * @param request ListAppsRequest
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取平台第三方软件列表</p>
     * 
     * @param request ListAuthorizedSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedSoftwareResponse
     */
    public ListAuthorizedSoftwareResponse listAuthorizedSoftwareWithOptions(ListAuthorizedSoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizedSoftware"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取平台第三方软件列表</p>
     * 
     * @param request ListAuthorizedSoftwareRequest
     * @return ListAuthorizedSoftwareResponse
     */
    public ListAuthorizedSoftwareResponse listAuthorizedSoftware(ListAuthorizedSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizedSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取平台公共容器镜像列表</p>
     * 
     * @param request ListContainerImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContainerImagesResponse
     */
    public ListContainerImagesResponse listContainerImagesWithOptions(ListContainerImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContainerImages"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContainerImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取平台公共容器镜像列表</p>
     * 
     * @param request ListContainerImagesRequest
     * @return ListContainerImagesResponse
     */
    public ListContainerImagesResponse listContainerImages(ListContainerImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContainerImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出数据实体列表</p>
     * 
     * @param request ListEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEntitiesResponse
     */
    public ListEntitiesResponse listEntitiesWithOptions(ListEntitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEntities"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEntitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出数据实体列表</p>
     * 
     * @param request ListEntitiesRequest
     * @return ListEntitiesResponse
     */
    public ListEntitiesResponse listEntities(ListEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEntitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出数据表格的条目</p>
     * 
     * @param request ListEntityItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEntityItemsResponse
     */
    public ListEntityItemsResponse listEntityItemsWithOptions(ListEntityItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReversed)) {
            query.put("IsReversed", request.isReversed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEntityItems"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEntityItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出数据表格的条目</p>
     * 
     * @param request ListEntityItemsRequest
     * @return ListEntityItemsResponse
     */
    public ListEntityItemsResponse listEntityItems(ListEntityItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEntityItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取平台公共应用列表</p>
     * 
     * @param request ListGlobalAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGlobalAppsResponse
     */
    public ListGlobalAppsResponse listGlobalAppsWithOptions(ListGlobalAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGlobalApps"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGlobalAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取平台公共应用列表</p>
     * 
     * @param request ListGlobalAppsRequest
     * @return ListGlobalAppsResponse
     */
    public ListGlobalAppsResponse listGlobalApps(ListGlobalAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGlobalAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取平台公共数据集列表</p>
     * 
     * @param request ListPublicDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicDatasetResponse
     */
    public ListPublicDatasetResponse listPublicDatasetWithOptions(ListPublicDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicDataset"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取平台公共数据集列表</p>
     * 
     * @param request ListPublicDatasetRequest
     * @return ListPublicDatasetResponse
     */
    public ListPublicDatasetResponse listPublicDataset(ListPublicDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共数据集包含的实体列表</p>
     * 
     * @param request ListPublicDatasetEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicDatasetEntitiesResponse
     */
    public ListPublicDatasetEntitiesResponse listPublicDatasetEntitiesWithOptions(ListPublicDatasetEntitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicDatasetEntities"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicDatasetEntitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共数据集包含的实体列表</p>
     * 
     * @param request ListPublicDatasetEntitiesRequest
     * @return ListPublicDatasetEntitiesResponse
     */
    public ListPublicDatasetEntitiesResponse listPublicDatasetEntities(ListPublicDatasetEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicDatasetEntitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共数据集特定的实体表格数据</p>
     * 
     * @param request ListPublicDatasetEntityItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicDatasetEntityItemsResponse
     */
    public ListPublicDatasetEntityItemsResponse listPublicDatasetEntityItemsWithOptions(ListPublicDatasetEntityItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicDatasetEntityItems"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicDatasetEntityItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询平台公共数据集特定的实体表格数据</p>
     * 
     * @param request ListPublicDatasetEntityItemsRequest
     * @return ListPublicDatasetEntityItemsResponse
     */
    public ListPublicDatasetEntityItemsResponse listPublicDatasetEntityItems(ListPublicDatasetEntityItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicDatasetEntityItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出所有公共数据集标签</p>
     * 
     * @param request ListPublicDatasetTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicDatasetTagsResponse
     */
    public ListPublicDatasetTagsResponse listPublicDatasetTagsWithOptions(ListPublicDatasetTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicDatasetTags"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicDatasetTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出所有公共数据集标签</p>
     * 
     * @param request ListPublicDatasetTagsRequest
     * @return ListPublicDatasetTagsResponse
     */
    public ListPublicDatasetTagsResponse listPublicDatasetTags(ListPublicDatasetTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicDatasetTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询基因分析平台产品的可用地域。</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询基因分析平台产品的可用地域。</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出任务</p>
     * 
     * @param request ListRunsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRunsResponse
     */
    public ListRunsResponse listRunsWithOptions(ListRunsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRuns"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRunsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出任务</p>
     * 
     * @param request ListRunsRequest
     * @return ListRunsResponse
     */
    public ListRunsResponse listRuns(ListRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRunsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出投递</p>
     * 
     * @param request ListSubmissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubmissionsResponse
     */
    public ListSubmissionsResponse listSubmissionsWithOptions(ListSubmissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubmissions"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubmissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出投递</p>
     * 
     * @param request ListSubmissionsRequest
     * @return ListSubmissionsResponse
     */
    public ListSubmissionsResponse listSubmissions(ListSubmissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubmissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出应用模板</p>
     * 
     * @param request ListTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isReversed)) {
            query.put("IsReversed", request.isReversed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelector)) {
            query.put("LabelSelector", request.labelSelector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出应用模板</p>
     * 
     * @param request ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>最近任务列表</p>
     * 
     * @param request ListUserActiveRunsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserActiveRunsResponse
     */
    public ListUserActiveRunsResponse listUserActiveRunsWithOptions(ListUserActiveRunsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserActiveRuns"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserActiveRunsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>最近任务列表</p>
     * 
     * @param request ListUserActiveRunsRequest
     * @return ListUserActiveRunsResponse
     */
    public ListUserActiveRunsResponse listUserActiveRuns(ListUserActiveRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserActiveRunsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出工作空间</p>
     * 
     * @param request ListWorkspacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出工作空间</p>
     * 
     * @param request ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkspacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复投递</p>
     * 
     * @param request ResumeSubmissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeSubmissionResponse
     */
    public ResumeSubmissionResponse resumeSubmissionWithOptions(ResumeSubmissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.submissionId)) {
            query.put("SubmissionId", request.submissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeSubmission"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeSubmissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>恢复投递</p>
     * 
     * @param request ResumeSubmissionRequest
     * @return ResumeSubmissionResponse
     */
    public ResumeSubmissionResponse resumeSubmission(ResumeSubmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeSubmissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本打标</p>
     * 
     * @param request TagAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagAppResponse
     */
    public TagAppResponse tagAppWithOptions(TagAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appRevision)) {
            query.put("AppRevision", request.appRevision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionTag)) {
            query.put("RevisionTag", request.revisionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagApp"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本打标</p>
     * 
     * @param request TagAppRequest
     * @return TagAppResponse
     */
    public TagAppResponse tagApp(TagAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改数据表格</p>
     * 
     * @deprecated OpenAPI UpdateEntity is deprecated, please use EasyGene::2021-03-15::UpdateEntityItems instead.
     * 
     * @param tmpReq UpdateEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEntityResponse
     */
    @Deprecated
    // Deprecated
    public UpdateEntityResponse updateEntityWithOptions(UpdateEntityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEntityShrinkRequest request = new UpdateEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityItems)) {
            request.entityItemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityItems, "EntityItems", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityItemsShrink)) {
            body.put("EntityItems", request.entityItemsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEntity"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改数据表格</p>
     * 
     * @deprecated OpenAPI UpdateEntity is deprecated, please use EasyGene::2021-03-15::UpdateEntityItems instead.
     * 
     * @param request UpdateEntityRequest
     * @return UpdateEntityResponse
     */
    @Deprecated
    // Deprecated
    public UpdateEntityResponse updateEntity(UpdateEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改表格数据</p>
     * 
     * @param tmpReq UpdateEntityItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEntityItemsResponse
     */
    public UpdateEntityItemsResponse updateEntityItemsWithOptions(UpdateEntityItemsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEntityItemsShrinkRequest request = new UpdateEntityItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityItems)) {
            request.entityItemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityItems, "EntityItems", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityItemsShrink)) {
            body.put("EntityItems", request.entityItemsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEntityItems"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEntityItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改表格数据</p>
     * 
     * @param request UpdateEntityItemsRequest
     * @return UpdateEntityItemsResponse
     */
    public UpdateEntityItemsResponse updateEntityItems(UpdateEntityItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEntityItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改应用模板</p>
     * 
     * @param tmpReq UpdateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTemplateShrinkRequest request = new UpdateTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputsExpression)) {
            request.inputsExpressionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputsExpression, "InputsExpression", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputsExpression)) {
            request.outputsExpressionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputsExpression, "OutputsExpression", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootEntity)) {
            query.put("RootEntity", request.rootEntity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputsExpressionShrink)) {
            body.put("InputsExpression", request.inputsExpressionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputsExpressionShrink)) {
            body.put("OutputsExpression", request.outputsExpressionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改应用模板</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改工作空间</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspaceWithOptions(UpdateWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobLifecycle)) {
            query.put("JobLifecycle", request.jobLifecycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspace"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改工作空间</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传数据表格</p>
     * 
     * @param request UploadEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadEntityResponse
     */
    public UploadEntityResponse uploadEntityWithOptions(UploadEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityCSVFile)) {
            query.put("EntityCSVFile", request.entityCSVFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("Workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadEntity"),
            new TeaPair("version", "2021-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传数据表格</p>
     * 
     * @param request UploadEntityRequest
     * @return UploadEntityResponse
     */
    public UploadEntityResponse uploadEntity(UploadEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadEntityWithOptions(request, runtime);
    }
}

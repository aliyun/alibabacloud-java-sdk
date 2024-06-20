// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204;

import com.aliyun.tea.*;
import com.aliyun.aiworkspace20210204.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aiworkspace", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>增加 Image</p>
     * 
     * @param request AddImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddImageResponse
     */
    public AddImageResponse addImageWithOptions(AddImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            body.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImage"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增加 Image</p>
     * 
     * @param request AddImageRequest
     * @return AddImageResponse
     */
    public AddImageResponse addImage(AddImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addImageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增加 Image 的标签</p>
     * 
     * @param request AddImageLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddImageLabelsResponse
     */
    public AddImageLabelsResponse addImageLabelsWithOptions(String ImageId, AddImageLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImageLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + com.aliyun.openapiutil.Client.getEncodeParam(ImageId) + "/labels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增加 Image 的标签</p>
     * 
     * @param request AddImageLabelsRequest
     * @return AddImageLabelsResponse
     */
    public AddImageLabelsResponse addImageLabels(String ImageId, AddImageLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addImageLabelsWithOptions(ImageId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增加成员角色</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMemberRoleResponse
     */
    public AddMemberRoleResponse addMemberRoleWithOptions(String WorkspaceId, String MemberId, String RoleName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMemberRole"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(MemberId) + "/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(RoleName) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMemberRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增加成员角色</p>
     * @return AddMemberRoleResponse
     */
    public AddMemberRoleResponse addMemberRole(String WorkspaceId, String MemberId, String RoleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMemberRoleWithOptions(WorkspaceId, MemberId, RoleName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个代码源配置</p>
     * 
     * @param request CreateCodeSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCodeSourceResponse
     */
    public CreateCodeSourceResponse createCodeSourceWithOptions(CreateCodeSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeBranch)) {
            body.put("CodeBranch", request.codeBranch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepo)) {
            body.put("CodeRepo", request.codeRepo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoAccessToken)) {
            body.put("CodeRepoAccessToken", request.codeRepoAccessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoUserName)) {
            body.put("CodeRepoUserName", request.codeRepoUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPath)) {
            body.put("MountPath", request.mountPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCodeSource"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/codesources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCodeSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个代码源配置</p>
     * 
     * @param request CreateCodeSourceRequest
     * @return CreateCodeSourceResponse
     */
    public CreateCodeSourceResponse createCodeSource(CreateCodeSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCodeSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDatasetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.property)) {
            body.put("Property", request.property);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerType)) {
            body.put("ProviderType", request.providerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataset"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatasetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新 Dataset 的标签</p>
     * 
     * @param request CreateDatasetLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetLabelsResponse
     */
    public CreateDatasetLabelsResponse createDatasetLabelsWithOptions(String DatasetId, CreateDatasetLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatasetLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasetId) + "/labels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasetLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新 Dataset 的标签</p>
     * 
     * @param request CreateDatasetLabelsRequest
     * @return CreateDatasetLabelsResponse
     */
    public CreateDatasetLabelsResponse createDatasetLabels(String DatasetId, CreateDatasetLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatasetLabelsWithOptions(DatasetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建成员</p>
     * 
     * @param request CreateMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMemberWithOptions(String WorkspaceId, CreateMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.members)) {
            body.put("Members", request.members);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMember"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建成员</p>
     * 
     * @param request CreateMemberRequest
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMember(String WorkspaceId, CreateMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemberWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型</p>
     * 
     * @param request CreateModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelResponse
     */
    public CreateModelResponse createModelWithOptions(CreateModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelDescription)) {
            body.put("ModelDescription", request.modelDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelDoc)) {
            body.put("ModelDoc", request.modelDoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            body.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            body.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNumber)) {
            body.put("OrderNumber", request.orderNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            body.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            body.put("Task", request.task);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModel"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型</p>
     * 
     * @param request CreateModelRequest
     * @return CreateModelResponse
     */
    public CreateModelResponse createModel(CreateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新模型的标签</p>
     * 
     * @param request CreateModelLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelLabelsResponse
     */
    public CreateModelLabelsResponse createModelLabelsWithOptions(String ModelId, CreateModelLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/labels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新模型的标签</p>
     * 
     * @param request CreateModelLabelsRequest
     * @return CreateModelLabelsResponse
     */
    public CreateModelLabelsResponse createModelLabels(String ModelId, CreateModelLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelLabelsWithOptions(ModelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型版本</p>
     * 
     * @param request CreateModelVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelVersionResponse
     */
    public CreateModelVersionResponse createModelVersionWithOptions(String ModelId, CreateModelVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationSpec)) {
            body.put("EvaluationSpec", request.evaluationSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameworkType)) {
            body.put("FrameworkType", request.frameworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inferenceSpec)) {
            body.put("InferenceSpec", request.inferenceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            body.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingSpec)) {
            body.put("TrainingSpec", request.trainingSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionDescription)) {
            body.put("VersionDescription", request.versionDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            body.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelVersion"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型版本</p>
     * 
     * @param request CreateModelVersionRequest
     * @return CreateModelVersionResponse
     */
    public CreateModelVersionResponse createModelVersion(String ModelId, CreateModelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelVersionWithOptions(ModelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新模型版本的标签</p>
     * 
     * @param request CreateModelVersionLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelVersionLabelsResponse
     */
    public CreateModelVersionLabelsResponse createModelVersionLabelsWithOptions(String ModelId, String VersionName, CreateModelVersionLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelVersionLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(VersionName) + "/labels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelVersionLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新模型版本的标签</p>
     * 
     * @param request CreateModelVersionLabelsRequest
     * @return CreateModelVersionLabelsResponse
     */
    public CreateModelVersionLabelsResponse createModelVersionLabels(String ModelId, String VersionName, CreateModelVersionLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelVersionLabelsWithOptions(ModelId, VersionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品订单</p>
     * 
     * @param request CreateProductOrdersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductOrdersResponse
     */
    public CreateProductOrdersResponse createProductOrdersWithOptions(CreateProductOrdersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.products)) {
            body.put("Products", request.products);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductOrders"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/productorders"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductOrdersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品订单</p>
     * 
     * @param request CreateProductOrdersRequest
     * @return CreateProductOrdersResponse
     */
    public CreateProductOrdersResponse createProductOrders(CreateProductOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductOrdersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作空间</p>
     * 
     * @param request CreateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envTypes)) {
            body.put("EnvTypes", request.envTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            body.put("WorkspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
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
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源</p>
     * 
     * @param request CreateWorkspaceResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResourceResponse
     */
    public CreateWorkspaceResourceResponse createWorkspaceResourceWithOptions(String WorkspaceId, CreateWorkspaceResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            body.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspaceResource"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源</p>
     * 
     * @param request CreateWorkspaceResourceRequest
     * @return CreateWorkspaceResourceResponse
     */
    public CreateWorkspaceResourceResponse createWorkspaceResource(String WorkspaceId, CreateWorkspaceResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceResourceWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个代码源配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCodeSourceResponse
     */
    public DeleteCodeSourceResponse deleteCodeSourceWithOptions(String CodeSourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCodeSource"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/codesources/" + com.aliyun.openapiutil.Client.getEncodeParam(CodeSourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCodeSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个代码源配置</p>
     * @return DeleteCodeSourceResponse
     */
    public DeleteCodeSourceResponse deleteCodeSource(String CodeSourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCodeSourceWithOptions(CodeSourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDatasetWithOptions(String DatasetId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataset"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasetId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDataset(String DatasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatasetWithOptions(DatasetId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Dataset 的标签</p>
     * 
     * @param request DeleteDatasetLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasetLabelsResponse
     */
    public DeleteDatasetLabelsResponse deleteDatasetLabelsWithOptions(String DatasetId, DeleteDatasetLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelKeys)) {
            query.put("LabelKeys", request.labelKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatasetLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasetId) + "/labels"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasetLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Dataset 的标签</p>
     * 
     * @param request DeleteDatasetLabelsRequest
     * @return DeleteDatasetLabelsResponse
     */
    public DeleteDatasetLabelsResponse deleteDatasetLabels(String DatasetId, DeleteDatasetLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatasetLabelsWithOptions(DatasetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间成员</p>
     * 
     * @param request DeleteMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMembersResponse
     */
    public DeleteMembersResponse deleteMembersWithOptions(String WorkspaceId, DeleteMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberIds)) {
            query.put("MemberIds", request.memberIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMembers"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/members"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间成员</p>
     * 
     * @param request DeleteMembersRequest
     * @return DeleteMembersResponse
     */
    public DeleteMembersResponse deleteMembers(String WorkspaceId, DeleteMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMembersWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModelWithOptions(String ModelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModel"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型</p>
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModel(String ModelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelWithOptions(ModelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型的标签</p>
     * 
     * @param request DeleteModelLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelLabelsResponse
     */
    public DeleteModelLabelsResponse deleteModelLabelsWithOptions(String ModelId, DeleteModelLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelKeys)) {
            query.put("LabelKeys", request.labelKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/labels"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型的标签</p>
     * 
     * @param request DeleteModelLabelsRequest
     * @return DeleteModelLabelsResponse
     */
    public DeleteModelLabelsResponse deleteModelLabels(String ModelId, DeleteModelLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelLabelsWithOptions(ModelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型版本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelVersionResponse
     */
    public DeleteModelVersionResponse deleteModelVersionWithOptions(String ModelId, String VersionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelVersion"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(VersionName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型版本</p>
     * @return DeleteModelVersionResponse
     */
    public DeleteModelVersionResponse deleteModelVersion(String ModelId, String VersionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelVersionWithOptions(ModelId, VersionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型版本的标签</p>
     * 
     * @param request DeleteModelVersionLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelVersionLabelsResponse
     */
    public DeleteModelVersionLabelsResponse deleteModelVersionLabelsWithOptions(String ModelId, String VersionName, DeleteModelVersionLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelKeys)) {
            query.put("LabelKeys", request.labelKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelVersionLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(VersionName) + "/labels"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelVersionLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型版本的标签</p>
     * 
     * @param request DeleteModelVersionLabelsRequest
     * @return DeleteModelVersionLabelsResponse
     */
    public DeleteModelVersionLabelsResponse deleteModelVersionLabels(String ModelId, String VersionName, DeleteModelVersionLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelVersionLabelsWithOptions(ModelId, VersionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(String WorkspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspace"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间</p>
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(String WorkspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspaceWithOptions(WorkspaceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间资源</p>
     * 
     * @param request DeleteWorkspaceResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResourceResponse
     */
    public DeleteWorkspaceResourceResponse deleteWorkspaceResourceWithOptions(String WorkspaceId, DeleteWorkspaceResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspaceResource"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/resources"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间资源</p>
     * 
     * @param request DeleteWorkspaceResourceRequest
     * @return DeleteWorkspaceResourceResponse
     */
    public DeleteWorkspaceResourceResponse deleteWorkspaceResource(String WorkspaceId, DeleteWorkspaceResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspaceResourceWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个代码源配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCodeSourceResponse
     */
    public GetCodeSourceResponse getCodeSourceWithOptions(String CodeSourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCodeSource"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/codesources/" + com.aliyun.openapiutil.Client.getEncodeParam(CodeSourceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCodeSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个代码源配置</p>
     * @return GetCodeSourceResponse
     */
    public GetCodeSourceResponse getCodeSource(String CodeSourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeSourceWithOptions(CodeSourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDatasetWithOptions(String DatasetId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataset"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasetId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集</p>
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDataset(String DatasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatasetWithOptions(DatasetId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取默认工作空间</p>
     * 
     * @param request GetDefaultWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDefaultWorkspaceResponse
     */
    public GetDefaultWorkspaceResponse getDefaultWorkspaceWithOptions(GetDefaultWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultWorkspace"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/defaultWorkspaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDefaultWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取默认工作空间</p>
     * 
     * @param request GetDefaultWorkspaceRequest
     * @return GetDefaultWorkspaceResponse
     */
    public GetDefaultWorkspaceResponse getDefaultWorkspace(GetDefaultWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDefaultWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取镜像</p>
     * 
     * @param request GetImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageResponse
     */
    public GetImageResponse getImageWithOptions(String ImageId, GetImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImage"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + com.aliyun.openapiutil.Client.getEncodeParam(ImageId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取镜像</p>
     * 
     * @param request GetImageRequest
     * @return GetImageResponse
     */
    public GetImageResponse getImage(String ImageId, GetImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageWithOptions(ImageId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取成员</p>
     * 
     * @param request GetMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemberResponse
     */
    public GetMemberResponse getMemberWithOptions(String WorkspaceId, GetMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMember"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/member"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取成员</p>
     * 
     * @param request GetMemberRequest
     * @return GetMemberResponse
     */
    public GetMemberResponse getMember(String WorkspaceId, GetMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemberWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelResponse
     */
    public GetModelResponse getModelWithOptions(String ModelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModel"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型</p>
     * @return GetModelResponse
     */
    public GetModelResponse getModel(String ModelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelWithOptions(ModelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型版本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelVersionResponse
     */
    public GetModelVersionResponse getModelVersionWithOptions(String ModelId, String VersionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelVersion"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(VersionName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型版本</p>
     * @return GetModelVersionResponse
     */
    public GetModelVersionResponse getModelVersion(String ModelId, String VersionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelVersionWithOptions(ModelId, VersionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取权限，若无权限则返回错误</p>
     * 
     * @param request GetPermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPermissionResponse
     */
    public GetPermissionResponse getPermissionWithOptions(String WorkspaceId, String PermissionCode, GetPermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPermission"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/permissions/" + com.aliyun.openapiutil.Client.getEncodeParam(PermissionCode) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取权限，若无权限则返回错误</p>
     * 
     * @param request GetPermissionRequest
     * @return GetPermissionResponse
     */
    public GetPermissionResponse getPermission(String WorkspaceId, String PermissionCode, GetPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPermissionWithOptions(WorkspaceId, PermissionCode, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务模版</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceTemplateResponse
     */
    public GetServiceTemplateResponse getServiceTemplateWithOptions(String ServiceTemplateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceTemplate"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/servicetemplates/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceTemplateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务模版</p>
     * @return GetServiceTemplateResponse
     */
    public GetServiceTemplateResponse getServiceTemplate(String ServiceTemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceTemplateWithOptions(ServiceTemplateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间</p>
     * 
     * @param request GetWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspaceWithOptions(String WorkspaceId, GetWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间</p>
     * 
     * @param request GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspace(String WorkspaceId, GetWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取代码源配置列表</p>
     * 
     * @param request ListCodeSourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCodeSourcesResponse
     */
    public ListCodeSourcesResponse listCodeSourcesWithOptions(ListCodeSourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCodeSources"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/codesources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCodeSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取代码源配置列表</p>
     * 
     * @param request ListCodeSourcesRequest
     * @return ListCodeSourcesResponse
     */
    public ListCodeSourcesResponse listCodeSources(ListCodeSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCodeSourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集列表</p>
     * 
     * @param request ListDatasetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasetsWithOptions(ListDatasetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTypes)) {
            query.put("DataSourceTypes", request.dataSourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataTypes)) {
            query.put("DataTypes", request.dataTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            query.put("Properties", request.properties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypes)) {
            query.put("SourceTypes", request.sourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatasets"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集列表</p>
     * 
     * @param request ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasets(ListDatasetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatasetsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举标签</p>
     * 
     * @param request ListImageLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageLabelsResponse
     */
    public ListImageLabelsResponse listImageLabelsWithOptions(ListImageLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelFilter)) {
            query.put("LabelFilter", request.labelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelKeys)) {
            query.put("LabelKeys", request.labelKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImageLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/image/labels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举标签</p>
     * 
     * @param request ListImageLabelsRequest
     * @return ListImageLabelsResponse
     */
    public ListImageLabelsResponse listImageLabels(ListImageLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImageLabelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举已注册镜像</p>
     * 
     * @param request ListImagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImagesResponse
     */
    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUserId)) {
            query.put("ParentUserId", request.parentUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImages"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举已注册镜像</p>
     * 
     * @param request ListImagesRequest
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImagesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举工作空间成员</p>
     * 
     * @param request ListMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembersWithOptions(String WorkspaceId, ListMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roles)) {
            query.put("Roles", request.roles);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMembers"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举工作空间成员</p>
     * 
     * @param request ListMembersRequest
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(String WorkspaceId, ListMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMembersWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型版本列表</p>
     * 
     * @param request ListModelVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelVersionsResponse
     */
    public ListModelVersionsResponse listModelVersionsWithOptions(String ModelId, ListModelVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            query.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            query.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameworkType)) {
            query.put("FrameworkType", request.frameworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelVersions"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型版本列表</p>
     * 
     * @param request ListModelVersionsRequest
     * @return ListModelVersionsResponse
     */
    public ListModelVersionsResponse listModelVersions(String ModelId, ListModelVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelVersionsWithOptions(ModelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型列表</p>
     * 
     * @param request ListModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelsResponse
     */
    public ListModelsResponse listModelsWithOptions(ListModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collections)) {
            query.put("Collections", request.collections);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            query.put("Task", request.task);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型列表</p>
     * 
     * @param request ListModelsRequest
     * @return ListModelsResponse
     */
    public ListModelsResponse listModels(ListModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举权限</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissionsWithOptions(String WorkspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissions"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/permissions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举权限</p>
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(String WorkspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionsWithOptions(WorkspaceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举产品</p>
     * 
     * @param request ListProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCodes)) {
            query.put("ProductCodes", request.productCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCodes)) {
            query.put("ServiceCodes", request.serviceCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举产品</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取已有配额列表</p>
     * 
     * @param request ListQuotasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotasWithOptions(ListQuotasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotas"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取已有配额列表</p>
     * 
     * @param request ListQuotasRequest
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotasWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举工作空间资源</p>
     * 
     * @param request ListResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productTypes)) {
            query.put("ProductTypes", request.productTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaIds)) {
            query.put("QuotaIds", request.quotaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verboseFields)) {
            query.put("VerboseFields", request.verboseFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举工作空间资源</p>
     * 
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务模版列表</p>
     * 
     * @param request ListServiceTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceTemplatesResponse
     */
    public ListServiceTemplatesResponse listServiceTemplatesWithOptions(ListServiceTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTemplateName)) {
            query.put("ServiceTemplateName", request.serviceTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceTemplates"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/servicetemplates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务模版列表</p>
     * 
     * @param request ListServiceTemplatesRequest
     * @return ListServiceTemplatesResponse
     */
    public ListServiceTemplatesResponse listServiceTemplates(ListServiceTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出工作空间的可变为成员的用户</p>
     * 
     * @param request ListWorkspaceUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspaceUsersResponse
     */
    public ListWorkspaceUsersResponse listWorkspaceUsersWithOptions(String WorkspaceId, ListWorkspaceUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaceUsers"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspaceUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出工作空间的可变为成员的用户</p>
     * 
     * @param request ListWorkspaceUsersRequest
     * @return ListWorkspaceUsersResponse
     */
    public ListWorkspaceUsersResponse listWorkspaceUsers(String WorkspaceId, ListWorkspaceUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspaceUsersWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得工作空间列表</p>
     * 
     * @param request ListWorkspacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            query.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleList)) {
            query.put("ModuleList", request.moduleList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("WorkspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得工作空间列表</p>
     * 
     * @param request ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布一个代码源配置为本工作空间下所有人可见</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishCodeSourceResponse
     */
    public PublishCodeSourceResponse publishCodeSourceWithOptions(String CodeSourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishCodeSource"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/codesources/" + com.aliyun.openapiutil.Client.getEncodeParam(CodeSourceId) + "/publish"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishCodeSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布一个代码源配置为本工作空间下所有人可见</p>
     * @return PublishCodeSourceResponse
     */
    public PublishCodeSourceResponse publishCodeSource(String CodeSourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishCodeSourceWithOptions(CodeSourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishDatasetResponse
     */
    public PublishDatasetResponse publishDatasetWithOptions(String DatasetId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishDataset"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasetId) + "/publish"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集</p>
     * @return PublishDatasetResponse
     */
    public PublishDatasetResponse publishDataset(String DatasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishDatasetWithOptions(DatasetId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布 Image</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishImageResponse
     */
    public PublishImageResponse publishImageWithOptions(String ImageId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishImage"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + com.aliyun.openapiutil.Client.getEncodeParam(ImageId) + "/publish"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布 Image</p>
     * @return PublishImageResponse
     */
    public PublishImageResponse publishImage(String ImageId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishImageWithOptions(ImageId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Image</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveImageResponse
     */
    public RemoveImageResponse removeImageWithOptions(String ImageId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveImage"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + com.aliyun.openapiutil.Client.getEncodeParam(ImageId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Image</p>
     * @return RemoveImageResponse
     */
    public RemoveImageResponse removeImage(String ImageId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeImageWithOptions(ImageId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Image 的标签</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveImageLabelsResponse
     */
    public RemoveImageLabelsResponse removeImageLabelsWithOptions(String ImageId, String LabelKey, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveImageLabels"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + com.aliyun.openapiutil.Client.getEncodeParam(ImageId) + "/labels/" + com.aliyun.openapiutil.Client.getEncodeParam(LabelKey) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveImageLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Image 的标签</p>
     * @return RemoveImageLabelsResponse
     */
    public RemoveImageLabelsResponse removeImageLabels(String ImageId, String LabelKey) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeImageLabelsWithOptions(ImageId, LabelKey, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除成员角色</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveMemberRoleResponse
     */
    public RemoveMemberRoleResponse removeMemberRoleWithOptions(String WorkspaceId, String MemberId, String RoleName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveMemberRole"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(MemberId) + "/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(RoleName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveMemberRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除成员角色</p>
     * @return RemoveMemberRoleResponse
     */
    public RemoveMemberRoleResponse removeMemberRole(String WorkspaceId, String MemberId, String RoleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeMemberRoleWithOptions(WorkspaceId, MemberId, RoleName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集</p>
     * 
     * @param request UpdateDatasetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDatasetWithOptions(String DatasetId, UpdateDatasetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataset"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasetId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集</p>
     * 
     * @param request UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDataset(String DatasetId, UpdateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatasetWithOptions(DatasetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新默认工作空间</p>
     * 
     * @param request UpdateDefaultWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDefaultWorkspaceResponse
     */
    public UpdateDefaultWorkspaceResponse updateDefaultWorkspaceWithOptions(UpdateDefaultWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDefaultWorkspace"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/defaultWorkspaces"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDefaultWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新默认工作空间</p>
     * 
     * @param request UpdateDefaultWorkspaceRequest
     * @return UpdateDefaultWorkspaceResponse
     */
    public UpdateDefaultWorkspaceResponse updateDefaultWorkspace(UpdateDefaultWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDefaultWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新模型</p>
     * 
     * @param request UpdateModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelResponse
     */
    public UpdateModelResponse updateModelWithOptions(String ModelId, UpdateModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelDescription)) {
            body.put("ModelDescription", request.modelDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelDoc)) {
            body.put("ModelDoc", request.modelDoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            body.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            body.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNumber)) {
            body.put("OrderNumber", request.orderNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            body.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            body.put("Task", request.task);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModel"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新模型</p>
     * 
     * @param request UpdateModelRequest
     * @return UpdateModelResponse
     */
    public UpdateModelResponse updateModel(String ModelId, UpdateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelWithOptions(ModelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新模型版本</p>
     * 
     * @param request UpdateModelVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelVersionResponse
     */
    public UpdateModelVersionResponse updateModelVersionWithOptions(String ModelId, String VersionName, UpdateModelVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            body.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationSpec)) {
            body.put("EvaluationSpec", request.evaluationSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inferenceSpec)) {
            body.put("InferenceSpec", request.inferenceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            body.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingSpec)) {
            body.put("TrainingSpec", request.trainingSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionDescription)) {
            body.put("VersionDescription", request.versionDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelVersion"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/models/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(VersionName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新模型版本</p>
     * 
     * @param request UpdateModelVersionRequest
     * @return UpdateModelVersionResponse
     */
    public UpdateModelVersionResponse updateModelVersion(String ModelId, String VersionName, UpdateModelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelVersionWithOptions(ModelId, VersionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作空间</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspaceWithOptions(String WorkspaceId, UpdateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspace"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作空间</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(String WorkspaceId, UpdateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspaceWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作空间资源</p>
     * 
     * @param request UpdateWorkspaceResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceResourceResponse
     */
    public UpdateWorkspaceResourceResponse updateWorkspaceResourceWithOptions(String WorkspaceId, UpdateWorkspaceResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            body.put("IsDefault", request.isDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceResource"),
            new TeaPair("version", "2021-02-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/resources"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作空间资源</p>
     * 
     * @param request UpdateWorkspaceResourceRequest
     * @return UpdateWorkspaceResourceResponse
     */
    public UpdateWorkspaceResourceResponse updateWorkspaceResource(String WorkspaceId, UpdateWorkspaceResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspaceResourceWithOptions(WorkspaceId, request, headers, runtime);
    }
}

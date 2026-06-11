// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317;

import com.aliyun.tea.*;
import com.aliyun.airegistry20260317.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("airegistry", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建 AI Registry 命名空间</p>
     * 
     * @param request CreateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanPolicy)) {
            query.put("ScanPolicy", request.scanPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNamespace"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 AI Registry 命名空间</p>
     * 
     * @param request CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建 Prompt</p>
     * 
     * @param request CreatePromptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePromptResponse
     */
    public CreatePromptResponse createPromptWithOptions(CreatePromptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizTags)) {
            query.put("BizTags", request.bizTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMsg)) {
            query.put("CommitMsg", request.commitMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("TargetVersion", request.targetVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            query.put("Variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrompt"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePromptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 Prompt</p>
     * 
     * @param request CreatePromptRequest
     * @return CreatePromptResponse
     */
    public CreatePromptResponse createPrompt(CreatePromptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPromptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建 Prompt 草稿版本。Prompt 必须已存在，且当前没有正在编辑的草稿。只对草稿版本生效。</p>
     * 
     * @param request CreatePromptVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePromptVersionResponse
     */
    public CreatePromptVersionResponse createPromptVersionWithOptions(CreatePromptVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basedOnVersion)) {
            query.put("BasedOnVersion", request.basedOnVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMsg)) {
            query.put("CommitMsg", request.commitMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("TargetVersion", request.targetVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            query.put("Variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePromptVersion"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePromptVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 Prompt 草稿版本。Prompt 必须已存在，且当前没有正在编辑的草稿。只对草稿版本生效。</p>
     * 
     * @param request CreatePromptVersionRequest
     * @return CreatePromptVersionResponse
     */
    public CreatePromptVersionResponse createPromptVersion(CreatePromptVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPromptVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建 Skill 草稿版本</p>
     * 
     * @param request CreateSkillDraftRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillDraftResponse
     */
    public CreateSkillDraftResponse createSkillDraftWithOptions(CreateSkillDraftRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basedOnVersion)) {
            query.put("BasedOnVersion", request.basedOnVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMsg)) {
            query.put("CommitMsg", request.commitMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillCard)) {
            query.put("SkillCard", request.skillCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("TargetVersion", request.targetVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillDraft"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillDraftResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 Skill 草稿版本</p>
     * 
     * @param request CreateSkillDraftRequest
     * @return CreateSkillDraftResponse
     */
    public CreateSkillDraftResponse createSkillDraft(CreateSkillDraftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillDraftWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除命名空间</p>
     * 
     * @param request DeleteNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNamespace"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除命名空间</p>
     * 
     * @param request DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Prompt</p>
     * 
     * @param request DeletePromptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePromptResponse
     */
    public DeletePromptResponse deletePromptWithOptions(DeletePromptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrompt"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePromptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Prompt</p>
     * 
     * @param request DeletePromptRequest
     * @return DeletePromptResponse
     */
    public DeletePromptResponse deletePrompt(DeletePromptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePromptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Skill</p>
     * 
     * @param request DeleteSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillResponse
     */
    public DeleteSkillResponse deleteSkillWithOptions(DeleteSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSkill"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Skill</p>
     * 
     * @param request DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    public DeleteSkillResponse deleteSkill(DeleteSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSkillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过 OSS 下载 Skill 版本 - 返回 OSS 下载 URL</p>
     * 
     * @param request DownloadSkillVersionViaOssRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadSkillVersionViaOssResponse
     */
    public DownloadSkillVersionViaOssResponse downloadSkillVersionViaOssWithOptions(DownloadSkillVersionViaOssRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadSkillVersionViaOss"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadSkillVersionViaOssResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过 OSS 下载 Skill 版本 - 返回 OSS 下载 URL</p>
     * 
     * @param request DownloadSkillVersionViaOssRequest
     * @return DownloadSkillVersionViaOssResponse
     */
    public DownloadSkillVersionViaOssResponse downloadSkillVersionViaOss(DownloadSkillVersionViaOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadSkillVersionViaOssWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>强制发布版本</p>
     * 
     * @param request ForcePublishSkillVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ForcePublishSkillVersionResponse
     */
    public ForcePublishSkillVersionResponse forcePublishSkillVersionWithOptions(ForcePublishSkillVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateLatestLabel)) {
            query.put("UpdateLatestLabel", request.updateLatestLabel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForcePublishSkillVersion"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForcePublishSkillVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>强制发布版本</p>
     * 
     * @param request ForcePublishSkillVersionRequest
     * @return ForcePublishSkillVersionResponse
     */
    public ForcePublishSkillVersionResponse forcePublishSkillVersion(ForcePublishSkillVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forcePublishSkillVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取命名空间详细信息</p>
     * 
     * @param request GetNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNamespaceResponse
     */
    public GetNamespaceResponse getNamespaceWithOptions(GetNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNamespace"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取命名空间详细信息</p>
     * 
     * @param request GetNamespaceRequest
     * @return GetNamespaceResponse
     */
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Prompt 详情信息</p>
     * 
     * @param request GetPromptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPromptResponse
     */
    public GetPromptResponse getPromptWithOptions(GetPromptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrompt"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPromptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Prompt 详情信息</p>
     * 
     * @param request GetPromptRequest
     * @return GetPromptResponse
     */
    public GetPromptResponse getPrompt(GetPromptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPromptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Prompt 某个版本的信息</p>
     * 
     * @param request GetPromptVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPromptVersionResponse
     */
    public GetPromptVersionResponse getPromptVersionWithOptions(GetPromptVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptVersion)) {
            query.put("PromptVersion", request.promptVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPromptVersion"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPromptVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Prompt 某个版本的信息</p>
     * 
     * @param request GetPromptVersionRequest
     * @return GetPromptVersionResponse
     */
    public GetPromptVersionResponse getPromptVersion(GetPromptVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPromptVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Skill 详情</p>
     * 
     * @param request GetSkillDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillDetailResponse
     */
    public GetSkillDetailResponse getSkillDetailWithOptions(GetSkillDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillDetail"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Skill 详情</p>
     * 
     * @param request GetSkillDetailRequest
     * @return GetSkillDetailResponse
     */
    public GetSkillDetailResponse getSkillDetail(GetSkillDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Skill 导入用 OSS 上传 URL。客户端使用返回的 uploadUrl 执行 PUT 上传后，</p>
     * 
     * @param request GetSkillImportFileUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillImportFileUrlResponse
     */
    public GetSkillImportFileUrlResponse getSkillImportFileUrlWithOptions(GetSkillImportFileUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillImportFileUrl"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillImportFileUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Skill 导入用 OSS 上传 URL。客户端使用返回的 uploadUrl 执行 PUT 上传后，</p>
     * 
     * @param request GetSkillImportFileUrlRequest
     * @return GetSkillImportFileUrlResponse
     */
    public GetSkillImportFileUrlResponse getSkillImportFileUrl(GetSkillImportFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillImportFileUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定版本详情</p>
     * 
     * @param request GetSkillVersionDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillVersionDetailResponse
     */
    public GetSkillVersionDetailResponse getSkillVersionDetailWithOptions(GetSkillVersionDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillVersionDetail"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillVersionDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定版本详情</p>
     * 
     * @param request GetSkillVersionDetailRequest
     * @return GetSkillVersionDetailResponse
     */
    public GetSkillVersionDetailResponse getSkillVersionDetail(GetSkillVersionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillVersionDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取命名空间列表</p>
     * 
     * @param request ListNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespacesWithOptions(ListNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNamespaces"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamespacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取命名空间列表</p>
     * 
     * @param request ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出Prompt版本列表</p>
     * 
     * @param request ListPromptVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPromptVersionsResponse
     */
    public ListPromptVersionsResponse listPromptVersionsWithOptions(ListPromptVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPromptVersions"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPromptVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出Prompt版本列表</p>
     * 
     * @param request ListPromptVersionsRequest
     * @return ListPromptVersionsResponse
     */
    public ListPromptVersionsResponse listPromptVersions(ListPromptVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPromptVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Prompt列表</p>
     * 
     * @param request ListPromptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPromptsResponse
     */
    public ListPromptsResponse listPromptsWithOptions(ListPromptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizTags)) {
            query.put("BizTags", request.bizTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrompts"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPromptsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Prompt列表</p>
     * 
     * @param request ListPromptsRequest
     * @return ListPromptsResponse
     */
    public ListPromptsResponse listPrompts(ListPromptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPromptsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出 Skills</p>
     * 
     * @param request ListSkillsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkillsWithOptions(ListSkillsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkills"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出 Skills</p>
     * 
     * @param request ListSkillsRequest
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkills(ListSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线版本</p>
     * 
     * @param request OfflineSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineSkillResponse
     */
    public OfflineSkillResponse offlineSkillWithOptions(OfflineSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineSkill"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下线版本</p>
     * 
     * @param request OfflineSkillRequest
     * @return OfflineSkillResponse
     */
    public OfflineSkillResponse offlineSkill(OfflineSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineSkillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上线 Skill</p>
     * 
     * @param request OnlineSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineSkillResponse
     */
    public OnlineSkillResponse onlineSkillWithOptions(OnlineSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineSkill"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上线 Skill</p>
     * 
     * @param request OnlineSkillRequest
     * @return OnlineSkillResponse
     */
    public OnlineSkillResponse onlineSkill(OnlineSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onlineSkillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布版本</p>
     * 
     * @param request PublishSkillVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishSkillVersionResponse
     */
    public PublishSkillVersionResponse publishSkillVersionWithOptions(PublishSkillVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateLatestLabel)) {
            query.put("UpdateLatestLabel", request.updateLatestLabel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishSkillVersion"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishSkillVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布版本</p>
     * 
     * @param request PublishSkillVersionRequest
     * @return PublishSkillVersionResponse
     */
    public PublishSkillVersionResponse publishSkillVersion(PublishSkillVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishSkillVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交 Prompt 版本, 将 Prompt 的草稿版本转化为正式版本</p>
     * 
     * @param request SubmitPromptVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitPromptVersionResponse
     */
    public SubmitPromptVersionResponse submitPromptVersionWithOptions(SubmitPromptVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptVersion)) {
            query.put("PromptVersion", request.promptVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitPromptVersion"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitPromptVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交 Prompt 版本, 将 Prompt 的草稿版本转化为正式版本</p>
     * 
     * @param request SubmitPromptVersionRequest
     * @return SubmitPromptVersionResponse
     */
    public SubmitPromptVersionResponse submitPromptVersion(SubmitPromptVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPromptVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交 Skill Draft 审核</p>
     * 
     * @param request SubmitSkillVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSkillVersionResponse
     */
    public SubmitSkillVersionResponse submitSkillVersionWithOptions(SubmitSkillVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSkillVersion"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSkillVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交 Skill Draft 审核</p>
     * 
     * @param request SubmitSkillVersionRequest
     * @return SubmitSkillVersionResponse
     */
    public SubmitSkillVersionResponse submitSkillVersion(SubmitSkillVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSkillVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新命名空间信息</p>
     * 
     * @param request UpdateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNamespaceResponse
     */
    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanPolicy)) {
            query.put("ScanPolicy", request.scanPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNamespace"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新命名空间信息</p>
     * 
     * @param request UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     */
    public UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Prompt 元数据，支持同时更新 description、bizTags、labels。</p>
     * 
     * @param tmpReq UpdatePromptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePromptResponse
     */
    public UpdatePromptResponse updatePromptWithOptions(UpdatePromptRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePromptShrinkRequest request = new UpdatePromptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizTags)) {
            request.bizTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizTags, "BizTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labels)) {
            request.labelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labels, "Labels", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizTagsShrink)) {
            query.put("BizTags", request.bizTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelsShrink)) {
            query.put("Labels", request.labelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrompt"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePromptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Prompt 元数据，支持同时更新 description、bizTags、labels。</p>
     * 
     * @param request UpdatePromptRequest
     * @return UpdatePromptResponse
     */
    public UpdatePromptResponse updatePrompt(UpdatePromptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePromptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Prompt 草稿版本内容。只对草稿版本生效，已发布的版本不可修改。</p>
     * 
     * @param request UpdatePromptVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePromptVersionResponse
     */
    public UpdatePromptVersionResponse updatePromptVersionWithOptions(UpdatePromptVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commitMsg)) {
            query.put("CommitMsg", request.commitMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptKey)) {
            query.put("PromptKey", request.promptKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            query.put("Variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePromptVersion"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePromptVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Prompt 草稿版本内容。只对草稿版本生效，已发布的版本不可修改。</p>
     * 
     * @param request UpdatePromptVersionRequest
     * @return UpdatePromptVersionResponse
     */
    public UpdatePromptVersionResponse updatePromptVersion(UpdatePromptVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePromptVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新业务标签</p>
     * 
     * @param request UpdateSkillBizTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillBizTagsResponse
     */
    public UpdateSkillBizTagsResponse updateSkillBizTagsWithOptions(UpdateSkillBizTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizTags)) {
            query.put("BizTags", request.bizTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillBizTags"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillBizTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新业务标签</p>
     * 
     * @param request UpdateSkillBizTagsRequest
     * @return UpdateSkillBizTagsResponse
     */
    public UpdateSkillBizTagsResponse updateSkillBizTags(UpdateSkillBizTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillBizTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Draft</p>
     * 
     * @param request UpdateSkillDraftRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillDraftResponse
     */
    public UpdateSkillDraftResponse updateSkillDraftWithOptions(UpdateSkillDraftRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commitMsg)) {
            query.put("CommitMsg", request.commitMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillCard)) {
            query.put("SkillCard", request.skillCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillDraft"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillDraftResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Draft</p>
     * 
     * @param request UpdateSkillDraftRequest
     * @return UpdateSkillDraftResponse
     */
    public UpdateSkillDraftResponse updateSkillDraft(UpdateSkillDraftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillDraftWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新版本标签</p>
     * 
     * @param request UpdateSkillLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillLabelsResponse
     */
    public UpdateSkillLabelsResponse updateSkillLabelsWithOptions(UpdateSkillLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillLabels"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新版本标签</p>
     * 
     * @param request UpdateSkillLabelsRequest
     * @return UpdateSkillLabelsResponse
     */
    public UpdateSkillLabelsResponse updateSkillLabels(UpdateSkillLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新可见性</p>
     * 
     * @param request UpdateSkillScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillScopeResponse
     */
    public UpdateSkillScopeResponse updateSkillScopeWithOptions(UpdateSkillScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("SkillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillScope"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新可见性</p>
     * 
     * @param request UpdateSkillScopeRequest
     * @return UpdateSkillScopeResponse
     */
    public UpdateSkillScopeResponse updateSkillScope(UpdateSkillScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过 OSS 上传 Skill (ZIP) - 从 OSS 拉取文件内容后上传到 Nacos</p>
     * 
     * @param request UploadSkillViaOssRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadSkillViaOssResponse
     */
    public UploadSkillViaOssResponse uploadSkillViaOssWithOptions(UploadSkillViaOssRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commitMsg)) {
            query.put("CommitMsg", request.commitMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectName)) {
            query.put("OssObjectName", request.ossObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadSkillViaOss"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadSkillViaOssResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过 OSS 上传 Skill (ZIP) - 从 OSS 拉取文件内容后上传到 Nacos</p>
     * 
     * @param request UploadSkillViaOssRequest
     * @return UploadSkillViaOssResponse
     */
    public UploadSkillViaOssResponse uploadSkillViaOss(UploadSkillViaOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadSkillViaOssWithOptions(request, runtime);
    }
}

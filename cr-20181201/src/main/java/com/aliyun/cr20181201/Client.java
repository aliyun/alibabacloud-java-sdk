// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201;

import com.aliyun.tea.*;
import com.aliyun.cr20181201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Cancels an artifact building task.</p>
     * 
     * @param request CancelArtifactBuildTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelArtifactBuildTaskResponse
     */
    public CancelArtifactBuildTaskResponse cancelArtifactBuildTaskWithOptions(CancelArtifactBuildTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildTaskId)) {
            query.put("BuildTaskId", request.buildTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelArtifactBuildTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelArtifactBuildTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an artifact building task.</p>
     * 
     * @param request CancelArtifactBuildTaskRequest
     * @return CancelArtifactBuildTaskResponse
     */
    public CancelArtifactBuildTaskResponse cancelArtifactBuildTask(CancelArtifactBuildTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelArtifactBuildTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an image building task of a repository.</p>
     * 
     * @param request CancelRepoBuildRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRepoBuildRecordResponse
     */
    public CancelRepoBuildRecordResponse cancelRepoBuildRecordWithOptions(CancelRepoBuildRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildRecordId)) {
            query.put("BuildRecordId", request.buildRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRepoBuildRecord"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRepoBuildRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an image building task of a repository.</p>
     * 
     * @param request CancelRepoBuildRecordRequest
     * @return CancelRepoBuildRecordResponse
     */
    public CancelRepoBuildRecordResponse cancelRepoBuildRecord(CancelRepoBuildRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRepoBuildRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a single replication task.</p>
     * 
     * @param request CancelRepoSyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRepoSyncTaskResponse
     */
    public CancelRepoSyncTaskResponse cancelRepoSyncTaskWithOptions(CancelRepoSyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncTaskId)) {
            query.put("SyncTaskId", request.syncTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRepoSyncTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRepoSyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a single replication task.</p>
     * 
     * @param request CancelRepoSyncTaskRequest
     * @return CancelRepoSyncTaskResponse
     */
    public CancelRepoSyncTaskResponse cancelRepoSyncTask(CancelRepoSyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRepoSyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create building rules of accelerated images only for image repositories of Container Registry Advanced Edition instances. You cannot create building rules of accelerated images for image repositories of Container Registry Basic Edition instances. For more information, see <a href="https://www.alibabacloud.com/help/en/acr/product-overview/what-is-container-registry?spm=openapi-amp.newDocPublishment.0.0.bf82281fRj7rmV#section-n3q-ps7-x6k">Specifications of different editions</a>.
     * Accelerated images are not supported in Alibaba Finance Cloud regions or Alibaba Gov Cloud regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Create image repository acceleration rules for image building.</p>
     * 
     * @param tmpReq CreateArtifactBuildRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateArtifactBuildRuleResponse
     */
    public CreateArtifactBuildRuleResponse createArtifactBuildRuleWithOptions(CreateArtifactBuildRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateArtifactBuildRuleShrinkRequest request = new CreateArtifactBuildRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactType)) {
            query.put("ArtifactType", request.artifactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeId)) {
            query.put("ScopeId", request.scopeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            query.put("ScopeType", request.scopeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateArtifactBuildRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateArtifactBuildRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create building rules of accelerated images only for image repositories of Container Registry Advanced Edition instances. You cannot create building rules of accelerated images for image repositories of Container Registry Basic Edition instances. For more information, see <a href="https://www.alibabacloud.com/help/en/acr/product-overview/what-is-container-registry?spm=openapi-amp.newDocPublishment.0.0.bf82281fRj7rmV#section-n3q-ps7-x6k">Specifications of different editions</a>.
     * Accelerated images are not supported in Alibaba Finance Cloud regions or Alibaba Gov Cloud regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Create image repository acceleration rules for image building.</p>
     * 
     * @param request CreateArtifactBuildRuleRequest
     * @return CreateArtifactBuildRuleResponse
     */
    public CreateArtifactBuildRuleResponse createArtifactBuildRule(CreateArtifactBuildRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createArtifactBuildRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lifecycle management rule for an artifact.</p>
     * 
     * @param request CreateArtifactLifecycleRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateArtifactLifecycleRuleResponse
     */
    public CreateArtifactLifecycleRuleResponse createArtifactLifecycleRuleWithOptions(CreateArtifactLifecycleRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auto)) {
            query.put("Auto", request.auto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDeleteTag)) {
            query.put("EnableDeleteTag", request.enableDeleteTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionTagCount)) {
            query.put("RetentionTagCount", request.retentionTagCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            query.put("ScheduleTime", request.scheduleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagRegexp)) {
            query.put("TagRegexp", request.tagRegexp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateArtifactLifecycleRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateArtifactLifecycleRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lifecycle management rule for an artifact.</p>
     * 
     * @param request CreateArtifactLifecycleRuleRequest
     * @return CreateArtifactLifecycleRuleResponse
     */
    public CreateArtifactLifecycleRuleResponse createArtifactLifecycleRule(CreateArtifactLifecycleRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createArtifactLifecycleRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an artifact subscription rule.</p>
     * 
     * @param request CreateArtifactSubscriptionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateArtifactSubscriptionRuleResponse
     */
    public CreateArtifactSubscriptionRuleResponse createArtifactSubscriptionRuleWithOptions(CreateArtifactSubscriptionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerate)) {
            query.put("Accelerate", request.accelerate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.override)) {
            query.put("Override", request.override);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceNamespaceName)) {
            query.put("SourceNamespaceName", request.sourceNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProvider)) {
            query.put("SourceProvider", request.sourceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRepoName)) {
            query.put("SourceRepoName", request.sourceRepoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagCount)) {
            query.put("TagCount", request.tagCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagRegexp)) {
            query.put("TagRegexp", request.tagRegexp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateArtifactSubscriptionRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateArtifactSubscriptionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an artifact subscription rule.</p>
     * 
     * @param request CreateArtifactSubscriptionRuleRequest
     * @return CreateArtifactSubscriptionRuleResponse
     */
    public CreateArtifactSubscriptionRuleResponse createArtifactSubscriptionRule(CreateArtifactSubscriptionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createArtifactSubscriptionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an artifact subscription task.</p>
     * 
     * @param request CreateArtifactSubscriptionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateArtifactSubscriptionTaskResponse
     */
    public CreateArtifactSubscriptionTaskResponse createArtifactSubscriptionTaskWithOptions(CreateArtifactSubscriptionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateArtifactSubscriptionTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateArtifactSubscriptionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an artifact subscription task.</p>
     * 
     * @param request CreateArtifactSubscriptionTaskRequest
     * @return CreateArtifactSubscriptionTaskResponse
     */
    public CreateArtifactSubscriptionTaskResponse createArtifactSubscriptionTask(CreateArtifactSubscriptionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createArtifactSubscriptionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image building record based on an existing record.</p>
     * 
     * @param request CreateBuildRecordByRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBuildRecordByRecordResponse
     */
    public CreateBuildRecordByRecordResponse createBuildRecordByRecordWithOptions(CreateBuildRecordByRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildRecordId)) {
            query.put("BuildRecordId", request.buildRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBuildRecordByRecord"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBuildRecordByRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image building record based on an existing record.</p>
     * 
     * @param request CreateBuildRecordByRecordRequest
     * @return CreateBuildRecordByRecordResponse
     */
    public CreateBuildRecordByRecordResponse createBuildRecordByRecord(CreateBuildRecordByRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBuildRecordByRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image building record based on a rule.</p>
     * 
     * @param request CreateBuildRecordByRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBuildRecordByRuleResponse
     */
    public CreateBuildRecordByRuleResponse createBuildRecordByRuleWithOptions(CreateBuildRecordByRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildRuleId)) {
            query.put("BuildRuleId", request.buildRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBuildRecordByRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBuildRecordByRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image building record based on a rule.</p>
     * 
     * @param request CreateBuildRecordByRuleRequest
     * @return CreateBuildRecordByRuleResponse
     */
    public CreateBuildRecordByRuleResponse createBuildRecordByRule(CreateBuildRecordByRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBuildRecordByRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a delivery chain.</p>
     * 
     * @param request CreateChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChainResponse
     */
    public CreateChainResponse createChainWithOptions(CreateChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chainConfig)) {
            query.put("ChainConfig", request.chainConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeExclude)) {
            query.put("ScopeExclude", request.scopeExclude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChain"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a delivery chain.</p>
     * 
     * @param request CreateChainRequest
     * @return CreateChainResponse
     */
    public CreateChainResponse createChain(CreateChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a chart namespace in an instance.</p>
     * 
     * @param request CreateChartNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChartNamespaceResponse
     */
    public CreateChartNamespaceResponse createChartNamespaceWithOptions(CreateChartNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateRepo)) {
            query.put("AutoCreateRepo", request.autoCreateRepo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRepoType)) {
            query.put("DefaultRepoType", request.defaultRepoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChartNamespace"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChartNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a chart namespace in an instance.</p>
     * 
     * @param request CreateChartNamespaceRequest
     * @return CreateChartNamespaceResponse
     */
    public CreateChartNamespaceResponse createChartNamespace(CreateChartNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChartNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a chart repository.</p>
     * 
     * @param request CreateChartRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChartRepositoryResponse
     */
    public CreateChartRepositoryResponse createChartRepositoryWithOptions(CreateChartRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoType)) {
            query.put("RepoType", request.repoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            query.put("Summary", request.summary);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChartRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChartRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a chart repository.</p>
     * 
     * @param request CreateChartRepositoryRequest
     * @return CreateChartRepositoryResponse
     */
    public CreateChartRepositoryResponse createChartRepository(CreateChartRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChartRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a whitelist policy for the public endpoint of the instance.</p>
     * 
     * @param request CreateInstanceEndpointAclPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceEndpointAclPolicyResponse
     */
    public CreateInstanceEndpointAclPolicyResponse createInstanceEndpointAclPolicyWithOptions(CreateInstanceEndpointAclPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entry)) {
            query.put("Entry", request.entry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceEndpointAclPolicy"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceEndpointAclPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a whitelist policy for the public endpoint of the instance.</p>
     * 
     * @param request CreateInstanceEndpointAclPolicyRequest
     * @return CreateInstanceEndpointAclPolicyResponse
     */
    public CreateInstanceEndpointAclPolicyResponse createInstanceEndpointAclPolicy(CreateInstanceEndpointAclPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceEndpointAclPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The VPC quota must be purchased separately.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a virtual private cloud (VPC) with a Container Registry instance.</p>
     * 
     * @param request CreateInstanceVpcEndpointLinkedVpcRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceVpcEndpointLinkedVpcResponse
     */
    public CreateInstanceVpcEndpointLinkedVpcResponse createInstanceVpcEndpointLinkedVpcWithOptions(CreateInstanceVpcEndpointLinkedVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableCreateDNSRecordInPvzt)) {
            query.put("EnableCreateDNSRecordInPvzt", request.enableCreateDNSRecordInPvzt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceVpcEndpointLinkedVpc"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceVpcEndpointLinkedVpcResponse());
    }

    /**
     * <b>description</b> :
     * <p>The VPC quota must be purchased separately.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a virtual private cloud (VPC) with a Container Registry instance.</p>
     * 
     * @param request CreateInstanceVpcEndpointLinkedVpcRequest
     * @return CreateInstanceVpcEndpointLinkedVpcResponse
     */
    public CreateInstanceVpcEndpointLinkedVpcResponse createInstanceVpcEndpointLinkedVpc(CreateInstanceVpcEndpointLinkedVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceVpcEndpointLinkedVpcWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a namespace of image repositories.</p>
     * 
     * @param tmpReq CreateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateNamespaceShrinkRequest request = new CreateNamespaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultRepoConfiguration)) {
            request.defaultRepoConfigurationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultRepoConfiguration, "DefaultRepoConfiguration", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateRepo)) {
            query.put("AutoCreateRepo", request.autoCreateRepo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRepoConfigurationShrink)) {
            query.put("DefaultRepoConfiguration", request.defaultRepoConfigurationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRepoType)) {
            query.put("DefaultRepoType", request.defaultRepoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNamespace"),
            new TeaPair("version", "2018-12-01"),
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
     * <p>Creates a namespace of image repositories.</p>
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
     * <p>Creates an image building rule for a repository.</p>
     * 
     * @param request CreateRepoBuildRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoBuildRuleResponse
     */
    public CreateRepoBuildRuleResponse createRepoBuildRuleWithOptions(CreateRepoBuildRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildArgs)) {
            query.put("BuildArgs", request.buildArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dockerfileLocation)) {
            query.put("DockerfileLocation", request.dockerfileLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dockerfileName)) {
            query.put("DockerfileName", request.dockerfileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageTag)) {
            query.put("ImageTag", request.imageTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platforms)) {
            query.put("Platforms", request.platforms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushName)) {
            query.put("PushName", request.pushName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushType)) {
            query.put("PushType", request.pushType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoBuildRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoBuildRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image building rule for a repository.</p>
     * 
     * @param request CreateRepoBuildRuleRequest
     * @return CreateRepoBuildRuleResponse
     */
    public CreateRepoBuildRuleResponse createRepoBuildRule(CreateRepoBuildRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepoBuildRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a source code repository to an image repository.</p>
     * 
     * @param request CreateRepoSourceCodeRepoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoSourceCodeRepoResponse
     */
    public CreateRepoSourceCodeRepoResponse createRepoSourceCodeRepoWithOptions(CreateRepoSourceCodeRepoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoBuild)) {
            query.put("AutoBuild", request.autoBuild);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoName)) {
            query.put("CodeRepoName", request.codeRepoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoNamespaceName)) {
            query.put("CodeRepoNamespaceName", request.codeRepoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoType)) {
            query.put("CodeRepoType", request.codeRepoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableCacheBuild)) {
            query.put("DisableCacheBuild", request.disableCacheBuild);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overseaBuild)) {
            query.put("OverseaBuild", request.overseaBuild);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoSourceCodeRepo"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoSourceCodeRepoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a source code repository to an image repository.</p>
     * 
     * @param request CreateRepoSourceCodeRepoRequest
     * @return CreateRepoSourceCodeRepoResponse
     */
    public CreateRepoSourceCodeRepoResponse createRepoSourceCodeRepo(CreateRepoSourceCodeRepoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepoSourceCodeRepoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image synchronization rule for an image repository.</p>
     * 
     * @param request CreateRepoSyncRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoSyncRuleResponse
     */
    public CreateRepoSyncRuleResponse createRepoSyncRuleWithOptions(CreateRepoSyncRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNameFilter)) {
            query.put("RepoNameFilter", request.repoNameFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncRuleName)) {
            query.put("SyncRuleName", request.syncRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncScope)) {
            query.put("SyncScope", request.syncScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncTrigger)) {
            query.put("SyncTrigger", request.syncTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagFilter)) {
            query.put("TagFilter", request.tagFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            query.put("TargetInstanceId", request.targetInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNamespaceName)) {
            query.put("TargetNamespaceName", request.targetNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRegionId)) {
            query.put("TargetRegionId", request.targetRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRepoName)) {
            query.put("TargetRepoName", request.targetRepoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoSyncRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoSyncRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image synchronization rule for an image repository.</p>
     * 
     * @param request CreateRepoSyncRuleRequest
     * @return CreateRepoSyncRuleResponse
     */
    public CreateRepoSyncRuleResponse createRepoSyncRule(CreateRepoSyncRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepoSyncRuleWithOptions(request, runtime);
    }

    /**
     * @param request CreateRepoSyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoSyncTaskResponse
     */
    public CreateRepoSyncTaskResponse createRepoSyncTaskWithOptions(CreateRepoSyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.override)) {
            query.put("Override", request.override);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            query.put("TargetInstanceId", request.targetInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNamespace)) {
            query.put("TargetNamespace", request.targetNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRegionId)) {
            query.put("TargetRegionId", request.targetRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRepoName)) {
            query.put("TargetRepoName", request.targetRepoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTag)) {
            query.put("TargetTag", request.targetTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoSyncTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoSyncTaskResponse());
    }

    /**
     * @param request CreateRepoSyncTaskRequest
     * @return CreateRepoSyncTaskResponse
     */
    public CreateRepoSyncTaskResponse createRepoSyncTask(CreateRepoSyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepoSyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image replication task based on a manual replication rule.</p>
     * 
     * @param request CreateRepoSyncTaskByRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoSyncTaskByRuleResponse
     */
    public CreateRepoSyncTaskByRuleResponse createRepoSyncTaskByRuleWithOptions(CreateRepoSyncTaskByRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncRuleId)) {
            query.put("SyncRuleId", request.syncRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoSyncTaskByRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoSyncTaskByRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image replication task based on a manual replication rule.</p>
     * 
     * @param request CreateRepoSyncTaskByRuleRequest
     * @return CreateRepoSyncTaskByRuleResponse
     */
    public CreateRepoSyncTaskByRuleResponse createRepoSyncTaskByRule(CreateRepoSyncTaskByRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepoSyncTaskByRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image tag based on an existing image tag in an image repository.</p>
     * 
     * @param request CreateRepoTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoTagResponse
     */
    public CreateRepoTagResponse createRepoTagWithOptions(CreateRepoTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromTag)) {
            query.put("FromTag", request.fromTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTag)) {
            query.put("ToTag", request.toTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoTag"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image tag based on an existing image tag in an image repository.</p>
     * 
     * @param request CreateRepoTagRequest
     * @return CreateRepoTagResponse
     */
    public CreateRepoTagResponse createRepoTag(CreateRepoTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepoTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image scan task.</p>
     * 
     * @param request CreateRepoTagScanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoTagScanTaskResponse
     */
    public CreateRepoTagScanTaskResponse createRepoTagScanTaskWithOptions(CreateRepoTagScanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("Digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanService)) {
            query.put("ScanService", request.scanService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanType)) {
            query.put("ScanType", request.scanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoTagScanTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoTagScanTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image scan task.</p>
     * 
     * @param request CreateRepoTagScanTaskRequest
     * @return CreateRepoTagScanTaskResponse
     */
    public CreateRepoTagScanTaskResponse createRepoTagScanTask(CreateRepoTagScanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepoTagScanTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a trigger for a repository.</p>
     * 
     * @param request CreateRepoTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoTriggerResponse
     */
    public CreateRepoTriggerResponse createRepoTriggerWithOptions(CreateRepoTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerName)) {
            query.put("TriggerName", request.triggerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerTag)) {
            query.put("TriggerTag", request.triggerTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerUrl)) {
            query.put("TriggerUrl", request.triggerUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoTrigger"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a trigger for a repository.</p>
     * 
     * @param request CreateRepoTriggerRequest
     * @return CreateRepoTriggerResponse
     */
    public CreateRepoTriggerResponse createRepoTrigger(CreateRepoTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepoTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image repository.</p>
     * 
     * @param request CreateRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepositoryResponse
     */
    public CreateRepositoryResponse createRepositoryWithOptions(CreateRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoType)) {
            query.put("RepoType", request.repoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            query.put("Summary", request.summary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagImmutability)) {
            query.put("TagImmutability", request.tagImmutability);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image repository.</p>
     * 
     * @param request CreateRepositoryRequest
     * @return CreateRepositoryResponse
     */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a scan or content analysis rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a scan or content analysis rule.</p>
     * 
     * @param tmpReq CreateScanRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScanRuleResponse
     */
    public CreateScanRuleResponse createScanRuleWithOptions(CreateScanRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScanRuleShrinkRequest request = new CreateScanRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaces)) {
            request.namespacesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaces, "Namespaces", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repoNames)) {
            request.repoNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repoNames, "RepoNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacesShrink)) {
            query.put("Namespaces", request.namespacesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamesShrink)) {
            query.put("RepoNames", request.repoNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoTagFilterPattern)) {
            query.put("RepoTagFilterPattern", request.repoTagFilterPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanScope)) {
            query.put("ScanScope", request.scanScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanType)) {
            query.put("ScanType", request.scanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScanRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScanRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a scan or content analysis rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a scan or content analysis rule.</p>
     * 
     * @param request CreateScanRuleRequest
     * @return CreateScanRuleResponse
     */
    public CreateScanRuleResponse createScanRule(CreateScanRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScanRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The whitelist of this API operation is available. <a href="https://smartservice.console.aliyun.com/service/create-ticket">Submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an instance store domain name routing rule.</p>
     * 
     * @param tmpReq CreateStorageDomainRoutingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStorageDomainRoutingRuleResponse
     */
    public CreateStorageDomainRoutingRuleResponse createStorageDomainRoutingRuleWithOptions(CreateStorageDomainRoutingRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStorageDomainRoutingRuleShrinkRequest request = new CreateStorageDomainRoutingRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.routes)) {
            request.routesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.routes, "Routes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routesShrink)) {
            query.put("Routes", request.routesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStorageDomainRoutingRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStorageDomainRoutingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The whitelist of this API operation is available. <a href="https://smartservice.console.aliyun.com/service/create-ticket">Submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an instance store domain name routing rule.</p>
     * 
     * @param request CreateStorageDomainRoutingRuleRequest
     * @return CreateStorageDomainRoutingRuleResponse
     */
    public CreateStorageDomainRoutingRuleResponse createStorageDomainRoutingRule(CreateStorageDomainRoutingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStorageDomainRoutingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an artifact lifecycle management rule.</p>
     * 
     * @param request DeleteArtifactLifecycleRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteArtifactLifecycleRuleResponse
     */
    public DeleteArtifactLifecycleRuleResponse deleteArtifactLifecycleRuleWithOptions(DeleteArtifactLifecycleRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteArtifactLifecycleRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteArtifactLifecycleRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an artifact lifecycle management rule.</p>
     * 
     * @param request DeleteArtifactLifecycleRuleRequest
     * @return DeleteArtifactLifecycleRuleResponse
     */
    public DeleteArtifactLifecycleRuleResponse deleteArtifactLifecycleRule(DeleteArtifactLifecycleRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteArtifactLifecycleRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an artifact subscription rule.</p>
     * 
     * @param request DeleteArtifactSubscriptionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteArtifactSubscriptionRuleResponse
     */
    public DeleteArtifactSubscriptionRuleResponse deleteArtifactSubscriptionRuleWithOptions(DeleteArtifactSubscriptionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteArtifactSubscriptionRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteArtifactSubscriptionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an artifact subscription rule.</p>
     * 
     * @param request DeleteArtifactSubscriptionRuleRequest
     * @return DeleteArtifactSubscriptionRuleResponse
     */
    public DeleteArtifactSubscriptionRuleResponse deleteArtifactSubscriptionRule(DeleteArtifactSubscriptionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteArtifactSubscriptionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a delivery pipeline.</p>
     * 
     * @param request DeleteChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChainResponse
     */
    public DeleteChainResponse deleteChainWithOptions(DeleteChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chainId)) {
            query.put("ChainId", request.chainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChain"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a delivery pipeline.</p>
     * 
     * @param request DeleteChainRequest
     * @return DeleteChainResponse
     */
    public DeleteChainResponse deleteChain(DeleteChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you delete a chart namespace, all repositories in the namespace and the charts in all repositories are deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a chart namespace from an instance.</p>
     * 
     * @param request DeleteChartNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChartNamespaceResponse
     */
    public DeleteChartNamespaceResponse deleteChartNamespaceWithOptions(DeleteChartNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChartNamespace"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChartNamespaceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you delete a chart namespace, all repositories in the namespace and the charts in all repositories are deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a chart namespace from an instance.</p>
     * 
     * @param request DeleteChartNamespaceRequest
     * @return DeleteChartNamespaceResponse
     */
    public DeleteChartNamespaceResponse deleteChartNamespace(DeleteChartNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChartNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a chart version from a chart repository.</p>
     * 
     * @param request DeleteChartReleaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChartReleaseResponse
     */
    public DeleteChartReleaseResponse deleteChartReleaseWithOptions(DeleteChartReleaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chart)) {
            query.put("Chart", request.chart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChartRelease"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChartReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a chart version from a chart repository.</p>
     * 
     * @param request DeleteChartReleaseRequest
     * @return DeleteChartReleaseResponse
     */
    public DeleteChartReleaseResponse deleteChartRelease(DeleteChartReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChartReleaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a chart repository from an instance.</p>
     * 
     * @param request DeleteChartRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChartRepositoryResponse
     */
    public DeleteChartRepositoryResponse deleteChartRepositoryWithOptions(DeleteChartRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChartRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChartRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a chart repository from an instance.</p>
     * 
     * @param request DeleteChartRepositoryRequest
     * @return DeleteChartRepositoryResponse
     */
    public DeleteChartRepositoryResponse deleteChartRepository(DeleteChartRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChartRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an event notification rule.</p>
     * 
     * @param request DeleteEventCenterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventCenterRuleResponse
     */
    public DeleteEventCenterRuleResponse deleteEventCenterRuleWithOptions(DeleteEventCenterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventCenterRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventCenterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an event notification rule.</p>
     * 
     * @param request DeleteEventCenterRuleRequest
     * @return DeleteEventCenterRuleResponse
     */
    public DeleteEventCenterRuleResponse deleteEventCenterRule(DeleteEventCenterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventCenterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a whitelist policy for the public endpoint of an instance.</p>
     * 
     * @param request DeleteInstanceEndpointAclPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceEndpointAclPolicyResponse
     */
    public DeleteInstanceEndpointAclPolicyResponse deleteInstanceEndpointAclPolicyWithOptions(DeleteInstanceEndpointAclPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entry)) {
            query.put("Entry", request.entry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceEndpointAclPolicy"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceEndpointAclPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a whitelist policy for the public endpoint of an instance.</p>
     * 
     * @param request DeleteInstanceEndpointAclPolicyRequest
     * @return DeleteInstanceEndpointAclPolicyResponse
     */
    public DeleteInstanceEndpointAclPolicyResponse deleteInstanceEndpointAclPolicy(DeleteInstanceEndpointAclPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceEndpointAclPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a virtual private cloud (VPC) from an instance.</p>
     * 
     * @param request DeleteInstanceVpcEndpointLinkedVpcRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceVpcEndpointLinkedVpcResponse
     */
    public DeleteInstanceVpcEndpointLinkedVpcResponse deleteInstanceVpcEndpointLinkedVpcWithOptions(DeleteInstanceVpcEndpointLinkedVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceVpcEndpointLinkedVpc"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceVpcEndpointLinkedVpcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a virtual private cloud (VPC) from an instance.</p>
     * 
     * @param request DeleteInstanceVpcEndpointLinkedVpcRequest
     * @return DeleteInstanceVpcEndpointLinkedVpcResponse
     */
    public DeleteInstanceVpcEndpointLinkedVpcResponse deleteInstanceVpcEndpointLinkedVpc(DeleteInstanceVpcEndpointLinkedVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceVpcEndpointLinkedVpcWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you delete a namespace, all repositories in the namespace and all images in these repositories are deleted as well.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a namespace.</p>
     * 
     * @param request DeleteNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNamespace"),
            new TeaPair("version", "2018-12-01"),
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
     * <b>description</b> :
     * <blockquote>
     * <p>After you delete a namespace, all repositories in the namespace and all images in these repositories are deleted as well.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a namespace.</p>
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
     * <p>Deletes an image building rule of a repository.</p>
     * 
     * @param request DeleteRepoBuildRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepoBuildRuleResponse
     */
    public DeleteRepoBuildRuleResponse deleteRepoBuildRuleWithOptions(DeleteRepoBuildRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildRuleId)) {
            query.put("BuildRuleId", request.buildRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepoBuildRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepoBuildRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an image building rule of a repository.</p>
     * 
     * @param request DeleteRepoBuildRuleRequest
     * @return DeleteRepoBuildRuleResponse
     */
    public DeleteRepoBuildRuleResponse deleteRepoBuildRule(DeleteRepoBuildRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRepoBuildRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an image replication rule of an image repository.</p>
     * 
     * @param request DeleteRepoSyncRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepoSyncRuleResponse
     */
    public DeleteRepoSyncRuleResponse deleteRepoSyncRuleWithOptions(DeleteRepoSyncRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncRuleId)) {
            query.put("SyncRuleId", request.syncRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepoSyncRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepoSyncRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an image replication rule of an image repository.</p>
     * 
     * @param request DeleteRepoSyncRuleRequest
     * @return DeleteRepoSyncRuleResponse
     */
    public DeleteRepoSyncRuleResponse deleteRepoSyncRule(DeleteRepoSyncRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRepoSyncRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an image tag.</p>
     * 
     * @param request DeleteRepoTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepoTagResponse
     */
    public DeleteRepoTagResponse deleteRepoTagWithOptions(DeleteRepoTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepoTag"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepoTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an image tag.</p>
     * 
     * @param request DeleteRepoTagRequest
     * @return DeleteRepoTagResponse
     */
    public DeleteRepoTagResponse deleteRepoTag(DeleteRepoTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRepoTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a trigger of an image repository.</p>
     * 
     * @param request DeleteRepoTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepoTriggerResponse
     */
    public DeleteRepoTriggerResponse deleteRepoTriggerWithOptions(DeleteRepoTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerId)) {
            query.put("TriggerId", request.triggerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepoTrigger"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepoTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a trigger of an image repository.</p>
     * 
     * @param request DeleteRepoTriggerRequest
     * @return DeleteRepoTriggerResponse
     */
    public DeleteRepoTriggerResponse deleteRepoTrigger(DeleteRepoTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRepoTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you delete a repository, all images in the repository are also deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an image repository.</p>
     * 
     * @param request DeleteRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepositoryResponse
     */
    public DeleteRepositoryResponse deleteRepositoryWithOptions(DeleteRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you delete a repository, all images in the repository are also deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an image repository.</p>
     * 
     * @param request DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a scan rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scan rule.</p>
     * 
     * @param request DeleteScanRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScanRuleResponse
     */
    public DeleteScanRuleResponse deleteScanRuleWithOptions(DeleteScanRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanRuleId)) {
            query.put("ScanRuleId", request.scanRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScanRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScanRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a scan rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scan rule.</p>
     * 
     * @param request DeleteScanRuleRequest
     * @return DeleteScanRuleResponse
     */
    public DeleteScanRuleResponse deleteScanRule(DeleteScanRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScanRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The whitelist of this API operation is available. <a href="https://smartservice.console.aliyun.com/service/create-ticket">Submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an instance store domain name routing rule.</p>
     * 
     * @param request DeleteStorageDomainRoutingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStorageDomainRoutingRuleResponse
     */
    public DeleteStorageDomainRoutingRuleResponse deleteStorageDomainRoutingRuleWithOptions(DeleteStorageDomainRoutingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStorageDomainRoutingRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStorageDomainRoutingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The whitelist of this API operation is available. <a href="https://smartservice.console.aliyun.com/service/create-ticket">Submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an instance store domain name routing rule.</p>
     * 
     * @param request DeleteStorageDomainRoutingRuleRequest
     * @return DeleteStorageDomainRoutingRuleResponse
     */
    public DeleteStorageDomainRoutingRuleResponse deleteStorageDomainRoutingRule(DeleteStorageDomainRoutingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStorageDomainRoutingRuleWithOptions(request, runtime);
    }

    /**
     * @param request GetArtifactBuildRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactBuildRuleResponse
     */
    public GetArtifactBuildRuleResponse getArtifactBuildRuleWithOptions(GetArtifactBuildRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifactBuildRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactBuildRuleResponse());
    }

    /**
     * @param request GetArtifactBuildRuleRequest
     * @return GetArtifactBuildRuleResponse
     */
    public GetArtifactBuildRuleResponse getArtifactBuildRule(GetArtifactBuildRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactBuildRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an artifact building task.</p>
     * 
     * @param request GetArtifactBuildTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactBuildTaskResponse
     */
    public GetArtifactBuildTaskResponse getArtifactBuildTaskWithOptions(GetArtifactBuildTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifactBuildTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactBuildTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an artifact building task.</p>
     * 
     * @param request GetArtifactBuildTaskRequest
     * @return GetArtifactBuildTaskResponse
     */
    public GetArtifactBuildTaskResponse getArtifactBuildTask(GetArtifactBuildTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactBuildTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the lifecycle management rules of an artifact.</p>
     * 
     * @param request GetArtifactLifecycleRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactLifecycleRuleResponse
     */
    public GetArtifactLifecycleRuleResponse getArtifactLifecycleRuleWithOptions(GetArtifactLifecycleRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifactLifecycleRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactLifecycleRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the lifecycle management rules of an artifact.</p>
     * 
     * @param request GetArtifactLifecycleRuleRequest
     * @return GetArtifactLifecycleRuleResponse
     */
    public GetArtifactLifecycleRuleResponse getArtifactLifecycleRule(GetArtifactLifecycleRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactLifecycleRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an artifact subscription rule.</p>
     * 
     * @param request GetArtifactSubscriptionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactSubscriptionRuleResponse
     */
    public GetArtifactSubscriptionRuleResponse getArtifactSubscriptionRuleWithOptions(GetArtifactSubscriptionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifactSubscriptionRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactSubscriptionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an artifact subscription rule.</p>
     * 
     * @param request GetArtifactSubscriptionRuleRequest
     * @return GetArtifactSubscriptionRuleResponse
     */
    public GetArtifactSubscriptionRuleResponse getArtifactSubscriptionRule(GetArtifactSubscriptionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactSubscriptionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an artifact subscription task.</p>
     * 
     * @param request GetArtifactSubscriptionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactSubscriptionTaskResponse
     */
    public GetArtifactSubscriptionTaskResponse getArtifactSubscriptionTaskWithOptions(GetArtifactSubscriptionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifactSubscriptionTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactSubscriptionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an artifact subscription task.</p>
     * 
     * @param request GetArtifactSubscriptionTaskRequest
     * @return GetArtifactSubscriptionTaskResponse
     */
    public GetArtifactSubscriptionTaskResponse getArtifactSubscriptionTask(GetArtifactSubscriptionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactSubscriptionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an artifact subscription task.</p>
     * 
     * @param request GetArtifactSubscriptionTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactSubscriptionTaskResultResponse
     */
    public GetArtifactSubscriptionTaskResultResponse getArtifactSubscriptionTaskResultWithOptions(GetArtifactSubscriptionTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifactSubscriptionTaskResult"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactSubscriptionTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an artifact subscription task.</p>
     * 
     * @param request GetArtifactSubscriptionTaskResultRequest
     * @return GetArtifactSubscriptionTaskResultResponse
     */
    public GetArtifactSubscriptionTaskResultResponse getArtifactSubscriptionTaskResult(GetArtifactSubscriptionTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactSubscriptionTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The validity period of the temporary password is 1 hour. If you use STS to request a token, the validity period of the temporary password is the same as the validity period of the STS token.</p>
     * <ul>
     * <li>If you log on to an instance by using the temporary password obtained through an Alibaba Cloud account, you have the same permissions on resources as the user of the Alibaba Cloud account.</li>
     * <li>If you log on to an instance by using the temporary password obtained through a RAM user, you have the same permissions as the RAM user.</li>
     * <li>If you log on to an instance by using the temporary password obtained through STS, you have the same permissions as the STS token.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a pair of temporary username and password that you use to log on to a Container Registry instance.</p>
     * 
     * @param request GetAuthorizationTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthorizationTokenResponse
     */
    public GetAuthorizationTokenResponse getAuthorizationTokenWithOptions(GetAuthorizationTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthorizationToken"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthorizationTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>The validity period of the temporary password is 1 hour. If you use STS to request a token, the validity period of the temporary password is the same as the validity period of the STS token.</p>
     * <ul>
     * <li>If you log on to an instance by using the temporary password obtained through an Alibaba Cloud account, you have the same permissions on resources as the user of the Alibaba Cloud account.</li>
     * <li>If you log on to an instance by using the temporary password obtained through a RAM user, you have the same permissions as the RAM user.</li>
     * <li>If you log on to an instance by using the temporary password obtained through STS, you have the same permissions as the STS token.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a pair of temporary username and password that you use to log on to a Container Registry instance.</p>
     * 
     * @param request GetAuthorizationTokenRequest
     * @return GetAuthorizationTokenResponse
     */
    public GetAuthorizationTokenResponse getAuthorizationToken(GetAuthorizationTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthorizationTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取交付链</p>
     * 
     * @param request GetChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChainResponse
     */
    public GetChainResponse getChainWithOptions(GetChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chainId)) {
            query.put("ChainId", request.chainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChain"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取交付链</p>
     * 
     * @param request GetChainRequest
     * @return GetChainResponse
     */
    public GetChainResponse getChain(GetChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a chart namespace in an instance.</p>
     * 
     * @param request GetChartNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChartNamespaceResponse
     */
    public GetChartNamespaceResponse getChartNamespaceWithOptions(GetChartNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChartNamespace"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChartNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a chart namespace in an instance.</p>
     * 
     * @param request GetChartNamespaceRequest
     * @return GetChartNamespaceResponse
     */
    public GetChartNamespaceResponse getChartNamespace(GetChartNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChartNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a chart repository.</p>
     * 
     * @param request GetChartRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChartRepositoryResponse
     */
    public GetChartRepositoryResponse getChartRepositoryWithOptions(GetChartRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChartRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChartRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a chart repository.</p>
     * 
     * @param request GetChartRepositoryRequest
     * @return GetChartRepositoryResponse
     */
    public GetChartRepositoryResponse getChartRepository(GetChartRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChartRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of instances.</p>
     * 
     * @param request GetInstanceCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceCountResponse
     */
    public GetInstanceCountResponse getInstanceCountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceCount"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of instances.</p>
     * @return GetInstanceCountResponse
     */
    public GetInstanceCountResponse getInstanceCount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceCountWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoint of an instance.</p>
     * 
     * @param request GetInstanceEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceEndpointResponse
     */
    public GetInstanceEndpointResponse getInstanceEndpointWithOptions(GetInstanceEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceEndpoint"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoint of an instance.</p>
     * 
     * @param request GetInstanceEndpointRequest
     * @return GetInstanceEndpointResponse
     */
    public GetInstanceEndpointResponse getInstanceEndpoint(GetInstanceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota usage of an instance.</p>
     * 
     * @param request GetInstanceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceUsageResponse
     */
    public GetInstanceUsageResponse getInstanceUsageWithOptions(GetInstanceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceUsage"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota usage of an instance.</p>
     * 
     * @param request GetInstanceUsageRequest
     * @return GetInstanceUsageResponse
     */
    public GetInstanceUsageResponse getInstanceUsage(GetInstanceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints of the virtual private clouds (VPCs) in which a Container Registry instance is deployed.</p>
     * 
     * @param request GetInstanceVpcEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceVpcEndpointResponse
     */
    public GetInstanceVpcEndpointResponse getInstanceVpcEndpointWithOptions(GetInstanceVpcEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceVpcEndpoint"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceVpcEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints of the virtual private clouds (VPCs) in which a Container Registry instance is deployed.</p>
     * 
     * @param request GetInstanceVpcEndpointRequest
     * @return GetInstanceVpcEndpointResponse
     */
    public GetInstanceVpcEndpointResponse getInstanceVpcEndpoint(GetInstanceVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceVpcEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a namespace.</p>
     * 
     * @param request GetNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNamespaceResponse
     */
    public GetNamespaceResponse getNamespaceWithOptions(GetNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNamespace"),
            new TeaPair("version", "2018-12-01"),
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
     * <p>Queries the information about a namespace.</p>
     * 
     * @param request GetNamespaceRequest
     * @return GetNamespaceResponse
     */
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about image building records of a repository.</p>
     * 
     * @param request GetRepoBuildRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepoBuildRecordResponse
     */
    public GetRepoBuildRecordResponse getRepoBuildRecordWithOptions(GetRepoBuildRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildRecordId)) {
            query.put("BuildRecordId", request.buildRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoBuildRecord"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoBuildRecordResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about image building records of a repository.</p>
     * 
     * @param request GetRepoBuildRecordRequest
     * @return GetRepoBuildRecordResponse
     */
    public GetRepoBuildRecordResponse getRepoBuildRecord(GetRepoBuildRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRepoBuildRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an image building task.</p>
     * 
     * @param request GetRepoBuildRecordStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepoBuildRecordStatusResponse
     */
    public GetRepoBuildRecordStatusResponse getRepoBuildRecordStatusWithOptions(GetRepoBuildRecordStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildRecordId)) {
            query.put("BuildRecordId", request.buildRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoBuildRecordStatus"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoBuildRecordStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an image building task.</p>
     * 
     * @param request GetRepoBuildRecordStatusRequest
     * @return GetRepoBuildRecordStatusResponse
     */
    public GetRepoBuildRecordStatusResponse getRepoBuildRecordStatus(GetRepoBuildRecordStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRepoBuildRecordStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the source code repository that is bound to an image repository.</p>
     * 
     * @param request GetRepoSourceCodeRepoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepoSourceCodeRepoResponse
     */
    public GetRepoSourceCodeRepoResponse getRepoSourceCodeRepoWithOptions(GetRepoSourceCodeRepoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoSourceCodeRepo"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoSourceCodeRepoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the source code repository that is bound to an image repository.</p>
     * 
     * @param request GetRepoSourceCodeRepoRequest
     * @return GetRepoSourceCodeRepoResponse
     */
    public GetRepoSourceCodeRepoResponse getRepoSourceCodeRepo(GetRepoSourceCodeRepoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRepoSourceCodeRepoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an image synchronization task in an instance.</p>
     * 
     * @param request GetRepoSyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepoSyncTaskResponse
     */
    public GetRepoSyncTaskResponse getRepoSyncTaskWithOptions(GetRepoSyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncTaskId)) {
            query.put("SyncTaskId", request.syncTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoSyncTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoSyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an image synchronization task in an instance.</p>
     * 
     * @param request GetRepoSyncTaskRequest
     * @return GetRepoSyncTaskResponse
     */
    public GetRepoSyncTaskResponse getRepoSyncTask(GetRepoSyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRepoSyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The version of the repository.</p>
     * 
     * @param request GetRepoTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepoTagResponse
     */
    public GetRepoTagResponse getRepoTagWithOptions(GetRepoTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTag"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The version of the repository.</p>
     * 
     * @param request GetRepoTagRequest
     * @return GetRepoTagResponse
     */
    public GetRepoTagResponse getRepoTag(GetRepoTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRepoTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scanning status of an image tag.</p>
     * 
     * @param request GetRepoTagScanStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepoTagScanStatusResponse
     */
    public GetRepoTagScanStatusResponse getRepoTagScanStatusWithOptions(GetRepoTagScanStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("Digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanTaskId)) {
            query.put("ScanTaskId", request.scanTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanType)) {
            query.put("ScanType", request.scanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTagScanStatus"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagScanStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scanning status of an image tag.</p>
     * 
     * @param request GetRepoTagScanStatusRequest
     * @return GetRepoTagScanStatusResponse
     */
    public GetRepoTagScanStatusResponse getRepoTagScanStatus(GetRepoTagScanStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRepoTagScanStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetRepoTagScanSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepoTagScanSummaryResponse
     */
    public GetRepoTagScanSummaryResponse getRepoTagScanSummaryWithOptions(GetRepoTagScanSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("Digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanTaskId)) {
            query.put("ScanTaskId", request.scanTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTagScanSummary"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagScanSummaryResponse());
    }

    /**
     * @param request GetRepoTagScanSummaryRequest
     * @return GetRepoTagScanSummaryResponse
     */
    public GetRepoTagScanSummaryResponse getRepoTagScanSummary(GetRepoTagScanSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRepoTagScanSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about an image repository.</p>
     * 
     * @param request GetRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepositoryResponse
     */
    public GetRepositoryResponse getRepositoryWithOptions(GetRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about an image repository.</p>
     * 
     * @param request GetRepositoryRequest
     * @return GetRepositoryResponse
     */
    public GetRepositoryResponse getRepository(GetRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Get scan rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a scan rule.</p>
     * 
     * @param request GetScanRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScanRuleResponse
     */
    public GetScanRuleResponse getScanRuleWithOptions(GetScanRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanRuleId)) {
            query.put("ScanRuleId", request.scanRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScanRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScanRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Get scan rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a scan rule.</p>
     * 
     * @param request GetScanRuleRequest
     * @return GetScanRuleResponse
     */
    public GetScanRuleResponse getScanRule(GetScanRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScanRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is open to a whitelist. Please <a href="https://smartservice.console.aliyun.com/service/create-ticket">submit a ticket</a> for support.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries instance storage domain routing rules</p>
     * 
     * @param request GetStorageDomainRoutingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStorageDomainRoutingRuleResponse
     */
    public GetStorageDomainRoutingRuleResponse getStorageDomainRoutingRuleWithOptions(GetStorageDomainRoutingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorageDomainRoutingRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageDomainRoutingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is open to a whitelist. Please <a href="https://smartservice.console.aliyun.com/service/create-ticket">submit a ticket</a> for support.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries instance storage domain routing rules</p>
     * 
     * @param request GetStorageDomainRoutingRuleRequest
     * @return GetStorageDomainRoutingRuleResponse
     */
    public GetStorageDomainRoutingRuleResponse getStorageDomainRoutingRule(GetStorageDomainRoutingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageDomainRoutingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log entries of an artifact building task.</p>
     * 
     * @param request ListArtifactBuildTaskLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListArtifactBuildTaskLogResponse
     */
    public ListArtifactBuildTaskLogResponse listArtifactBuildTaskLogWithOptions(ListArtifactBuildTaskLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArtifactBuildTaskLog"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArtifactBuildTaskLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log entries of an artifact building task.</p>
     * 
     * @param request ListArtifactBuildTaskLogRequest
     * @return ListArtifactBuildTaskLogResponse
     */
    public ListArtifactBuildTaskLogResponse listArtifactBuildTaskLog(ListArtifactBuildTaskLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listArtifactBuildTaskLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the lifecycle management rules of an artifact.</p>
     * 
     * @param request ListArtifactLifecycleRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListArtifactLifecycleRuleResponse
     */
    public ListArtifactLifecycleRuleResponse listArtifactLifecycleRuleWithOptions(ListArtifactLifecycleRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArtifactLifecycleRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArtifactLifecycleRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the lifecycle management rules of an artifact.</p>
     * 
     * @param request ListArtifactLifecycleRuleRequest
     * @return ListArtifactLifecycleRuleResponse
     */
    public ListArtifactLifecycleRuleResponse listArtifactLifecycleRule(ListArtifactLifecycleRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listArtifactLifecycleRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the subscription rules of artifacts.</p>
     * 
     * @param request ListArtifactSubscriptionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListArtifactSubscriptionRuleResponse
     */
    public ListArtifactSubscriptionRuleResponse listArtifactSubscriptionRuleWithOptions(ListArtifactSubscriptionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArtifactSubscriptionRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArtifactSubscriptionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the subscription rules of artifacts.</p>
     * 
     * @param request ListArtifactSubscriptionRuleRequest
     * @return ListArtifactSubscriptionRuleResponse
     */
    public ListArtifactSubscriptionRuleResponse listArtifactSubscriptionRule(ListArtifactSubscriptionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listArtifactSubscriptionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists artifact subscription tasks.</p>
     * 
     * @param request ListArtifactSubscriptionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListArtifactSubscriptionTaskResponse
     */
    public ListArtifactSubscriptionTaskResponse listArtifactSubscriptionTaskWithOptions(ListArtifactSubscriptionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArtifactSubscriptionTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArtifactSubscriptionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists artifact subscription tasks.</p>
     * 
     * @param request ListArtifactSubscriptionTaskRequest
     * @return ListArtifactSubscriptionTaskResponse
     */
    public ListArtifactSubscriptionTaskResponse listArtifactSubscriptionTask(ListArtifactSubscriptionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listArtifactSubscriptionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries delivery chains.</p>
     * 
     * @param request ListChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChainResponse
     */
    public ListChainResponse listChainWithOptions(ListChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChain"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries delivery chains.</p>
     * 
     * @param request ListChainRequest
     * @return ListChainResponse
     */
    public ListChainResponse listChain(ListChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The response code.</p>
     * 
     * @param request ListChainInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChainInstanceResponse
     */
    public ListChainInstanceResponse listChainInstanceWithOptions(ListChainInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChainInstance"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChainInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The response code.</p>
     * 
     * @param request ListChainInstanceRequest
     * @return ListChainInstanceResponse
     */
    public ListChainInstanceResponse listChainInstance(ListChainInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChainInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the chart namespaces of a Container Registry instance.</p>
     * 
     * @param request ListChartNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChartNamespaceResponse
     */
    public ListChartNamespaceResponse listChartNamespaceWithOptions(ListChartNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceStatus)) {
            query.put("NamespaceStatus", request.namespaceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChartNamespace"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChartNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the chart namespaces of a Container Registry instance.</p>
     * 
     * @param request ListChartNamespaceRequest
     * @return ListChartNamespaceResponse
     */
    public ListChartNamespaceResponse listChartNamespace(ListChartNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChartNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of a chart in a chart repository.</p>
     * 
     * @param request ListChartReleaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChartReleaseResponse
     */
    public ListChartReleaseResponse listChartReleaseWithOptions(ListChartReleaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chart)) {
            query.put("Chart", request.chart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChartRelease"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChartReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of a chart in a chart repository.</p>
     * 
     * @param request ListChartReleaseRequest
     * @return ListChartReleaseResponse
     */
    public ListChartReleaseResponse listChartRelease(ListChartReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChartReleaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the chart repositories of a Container Registry instance.</p>
     * 
     * @param request ListChartRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChartRepositoryResponse
     */
    public ListChartRepositoryResponse listChartRepositoryWithOptions(ListChartRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoStatus)) {
            query.put("RepoStatus", request.repoStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChartRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChartRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the chart repositories of a Container Registry instance.</p>
     * 
     * @param request ListChartRepositoryRequest
     * @return ListChartRepositoryResponse
     */
    public ListChartRepositoryResponse listChartRepository(ListChartRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChartRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical events of an event rule.</p>
     * 
     * @param request ListEventCenterRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventCenterRecordResponse
     */
    public ListEventCenterRecordResponse listEventCenterRecordWithOptions(ListEventCenterRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventCenterRecord"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventCenterRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical events of an event rule.</p>
     * 
     * @param request ListEventCenterRecordRequest
     * @return ListEventCenterRecordResponse
     */
    public ListEventCenterRecordResponse listEventCenterRecord(ListEventCenterRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventCenterRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of event notification rules.</p>
     * 
     * @param request ListEventCenterRuleNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventCenterRuleNameResponse
     */
    public ListEventCenterRuleNameResponse listEventCenterRuleNameWithOptions(ListEventCenterRuleNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventCenterRuleName"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventCenterRuleNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of event notification rules.</p>
     * 
     * @param request ListEventCenterRuleNameRequest
     * @return ListEventCenterRuleNameResponse
     */
    public ListEventCenterRuleNameResponse listEventCenterRuleName(ListEventCenterRuleNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventCenterRuleNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Container Registry instances.</p>
     * 
     * @param request ListInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("InstanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstance"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Container Registry instances.</p>
     * 
     * @param request ListInstanceRequest
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints of a Container Registry instance.</p>
     * 
     * @param request ListInstanceEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceEndpointResponse
     */
    public ListInstanceEndpointResponse listInstanceEndpointWithOptions(ListInstanceEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            query.put("Summary", request.summary);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceEndpoint"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints of a Container Registry instance.</p>
     * 
     * @param request ListInstanceEndpointRequest
     * @return ListInstanceEndpointResponse
     */
    public ListInstanceEndpointResponse listInstanceEndpoint(ListInstanceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions in which you can create Container Registry instances.</p>
     * 
     * @param request ListInstanceRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceRegionResponse
     */
    public ListInstanceRegionResponse listInstanceRegionWithOptions(ListInstanceRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceRegion"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceRegionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions in which you can create Container Registry instances.</p>
     * 
     * @param request ListInstanceRegionRequest
     * @return ListInstanceRegionResponse
     */
    public ListInstanceRegionResponse listInstanceRegion(ListInstanceRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceRegionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries namespaces in a Container Registry instance.</p>
     * 
     * @param request ListNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNamespaceResponse
     */
    public ListNamespaceResponse listNamespaceWithOptions(ListNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceStatus)) {
            query.put("NamespaceStatus", request.namespaceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNamespace"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries namespaces in a Container Registry instance.</p>
     * 
     * @param request ListNamespaceRequest
     * @return ListNamespaceResponse
     */
    public ListNamespaceResponse listNamespace(ListNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image building records of an image repository.</p>
     * 
     * @param request ListRepoBuildRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepoBuildRecordResponse
     */
    public ListRepoBuildRecordResponse listRepoBuildRecordWithOptions(ListRepoBuildRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoBuildRecord"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoBuildRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image building records of an image repository.</p>
     * 
     * @param request ListRepoBuildRecordRequest
     * @return ListRepoBuildRecordResponse
     */
    public ListRepoBuildRecordResponse listRepoBuildRecord(ListRepoBuildRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepoBuildRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log of an image building record.</p>
     * 
     * @param request ListRepoBuildRecordLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepoBuildRecordLogResponse
     */
    public ListRepoBuildRecordLogResponse listRepoBuildRecordLogWithOptions(ListRepoBuildRecordLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildRecordId)) {
            query.put("BuildRecordId", request.buildRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoBuildRecordLog"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoBuildRecordLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log of an image building record.</p>
     * 
     * @param request ListRepoBuildRecordLogRequest
     * @return ListRepoBuildRecordLogResponse
     */
    public ListRepoBuildRecordLogResponse listRepoBuildRecordLog(ListRepoBuildRecordLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepoBuildRecordLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image building rules of a repository.</p>
     * 
     * @param request ListRepoBuildRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepoBuildRuleResponse
     */
    public ListRepoBuildRuleResponse listRepoBuildRuleWithOptions(ListRepoBuildRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoBuildRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoBuildRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image building rules of a repository.</p>
     * 
     * @param request ListRepoBuildRuleRequest
     * @return ListRepoBuildRuleResponse
     */
    public ListRepoBuildRuleResponse listRepoBuildRule(ListRepoBuildRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepoBuildRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image synchronization rules of a repository.</p>
     * 
     * @param request ListRepoSyncRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepoSyncRuleResponse
     */
    public ListRepoSyncRuleResponse listRepoSyncRuleWithOptions(ListRepoSyncRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            query.put("TargetInstanceId", request.targetInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRegionId)) {
            query.put("TargetRegionId", request.targetRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoSyncRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoSyncRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image synchronization rules of a repository.</p>
     * 
     * @param request ListRepoSyncRuleRequest
     * @return ListRepoSyncRuleResponse
     */
    public ListRepoSyncRuleResponse listRepoSyncRule(ListRepoSyncRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepoSyncRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image synchronization tasks in an image repository.</p>
     * 
     * @param request ListRepoSyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepoSyncTaskResponse
     */
    public ListRepoSyncTaskResponse listRepoSyncTaskWithOptions(ListRepoSyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncRecordId)) {
            query.put("SyncRecordId", request.syncRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoSyncTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoSyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image synchronization tasks in an image repository.</p>
     * 
     * @param request ListRepoSyncTaskRequest
     * @return ListRepoSyncTaskResponse
     */
    public ListRepoSyncTaskResponse listRepoSyncTask(ListRepoSyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepoSyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image tags in a repository.</p>
     * 
     * @param request ListRepoTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepoTagResponse
     */
    public ListRepoTagResponse listRepoTagWithOptions(ListRepoTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoTag"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image tags in a repository.</p>
     * 
     * @param request ListRepoTagRequest
     * @return ListRepoTagResponse
     */
    public ListRepoTagResponse listRepoTag(ListRepoTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepoTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the results of a security scan that is created for an image tag.</p>
     * 
     * @param request ListRepoTagScanResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepoTagScanResultResponse
     */
    public ListRepoTagScanResultResponse listRepoTagScanResultWithOptions(ListRepoTagScanResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("Digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanTaskId)) {
            query.put("ScanTaskId", request.scanTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanType)) {
            query.put("ScanType", request.scanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulQueryKey)) {
            query.put("VulQueryKey", request.vulQueryKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoTagScanResult"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoTagScanResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the results of a security scan that is created for an image tag.</p>
     * 
     * @param request ListRepoTagScanResultRequest
     * @return ListRepoTagScanResultResponse
     */
    public ListRepoTagScanResultResponse listRepoTagScanResult(ListRepoTagScanResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepoTagScanResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the triggers of a repository.</p>
     * 
     * @param request ListRepoTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepoTriggerResponse
     */
    public ListRepoTriggerResponse listRepoTriggerWithOptions(ListRepoTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoTrigger"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the triggers of a repository.</p>
     * 
     * @param request ListRepoTriggerRequest
     * @return ListRepoTriggerResponse
     */
    public ListRepoTriggerResponse listRepoTrigger(ListRepoTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepoTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image repositories.</p>
     * 
     * @param request ListRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryResponse
     */
    public ListRepositoryResponse listRepositoryWithOptions(ListRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoStatus)) {
            query.put("RepoStatus", request.repoStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image repositories.</p>
     * 
     * @param request ListRepositoryRequest
     * @return ListRepositoryResponse
     */
    public ListRepositoryResponse listRepository(ListRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, use a Security Center scan engine to scan the image.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the baseline risks of a scan task by page.</p>
     * 
     * @param request ListScanBaselineByTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScanBaselineByTaskResponse
     */
    public ListScanBaselineByTaskResponse listScanBaselineByTaskWithOptions(ListScanBaselineByTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScanBaselineByTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScanBaselineByTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, use a Security Center scan engine to scan the image.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the baseline risks of a scan task by page.</p>
     * 
     * @param request ListScanBaselineByTaskRequest
     * @return ListScanBaselineByTaskResponse
     */
    public ListScanBaselineByTaskResponse listScanBaselineByTask(ListScanBaselineByTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScanBaselineByTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, use a Security Center scan engine to scan the image.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the malicious files of a scan task by page.</p>
     * 
     * @param request ListScanMaliciousFileByTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScanMaliciousFileByTaskResponse
     */
    public ListScanMaliciousFileByTaskResponse listScanMaliciousFileByTaskWithOptions(ListScanMaliciousFileByTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScanMaliciousFileByTask"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScanMaliciousFileByTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, use a Security Center scan engine to scan the image.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the malicious files of a scan task by page.</p>
     * 
     * @param request ListScanMaliciousFileByTaskRequest
     * @return ListScanMaliciousFileByTaskResponse
     */
    public ListScanMaliciousFileByTaskResponse listScanMaliciousFileByTask(ListScanMaliciousFileByTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScanMaliciousFileByTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists the scan rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the scan rules.</p>
     * 
     * @param request ListScanRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScanRuleResponse
     */
    public ListScanRuleResponse listScanRuleWithOptions(ListScanRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScanRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScanRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists the scan rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the scan rules.</p>
     * 
     * @param request ListScanRuleRequest
     * @return ListScanRuleResponse
     */
    public ListScanRuleResponse listScanRule(ListScanRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScanRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to cloud resources. Instance resources are supported.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to cloud resources. Instance resources are supported.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the logon password of a Container Registry instance.</p>
     * 
     * @param request ResetLoginPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetLoginPasswordResponse
     */
    public ResetLoginPasswordResponse resetLoginPasswordWithOptions(ResetLoginPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetLoginPassword"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetLoginPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the logon password of a Container Registry instance.</p>
     * 
     * @param request ResetLoginPasswordRequest
     * @return ResetLoginPasswordResponse
     */
    public ResetLoginPasswordResponse resetLoginPassword(ResetLoginPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetLoginPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources. Instance resources are supported.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources. Instance resources are supported.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources. Instance resources are supported.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources. Instance resources are supported.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a lifecycle management rule of an artifact.</p>
     * 
     * @param request UpdateArtifactLifecycleRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateArtifactLifecycleRuleResponse
     */
    public UpdateArtifactLifecycleRuleResponse updateArtifactLifecycleRuleWithOptions(UpdateArtifactLifecycleRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auto)) {
            query.put("Auto", request.auto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDeleteTag)) {
            query.put("EnableDeleteTag", request.enableDeleteTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionTagCount)) {
            query.put("RetentionTagCount", request.retentionTagCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            query.put("ScheduleTime", request.scheduleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagRegexp)) {
            query.put("TagRegexp", request.tagRegexp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateArtifactLifecycleRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateArtifactLifecycleRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a lifecycle management rule of an artifact.</p>
     * 
     * @param request UpdateArtifactLifecycleRuleRequest
     * @return UpdateArtifactLifecycleRuleResponse
     */
    public UpdateArtifactLifecycleRuleResponse updateArtifactLifecycleRule(UpdateArtifactLifecycleRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateArtifactLifecycleRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an artifact subscription rule.</p>
     * 
     * @param request UpdateArtifactSubscriptionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateArtifactSubscriptionRuleResponse
     */
    public UpdateArtifactSubscriptionRuleResponse updateArtifactSubscriptionRuleWithOptions(UpdateArtifactSubscriptionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerate)) {
            query.put("Accelerate", request.accelerate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.override)) {
            query.put("Override", request.override);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceNamespaceName)) {
            query.put("SourceNamespaceName", request.sourceNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProvider)) {
            query.put("SourceProvider", request.sourceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRepoName)) {
            query.put("SourceRepoName", request.sourceRepoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagCount)) {
            query.put("TagCount", request.tagCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagRegexp)) {
            query.put("TagRegexp", request.tagRegexp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateArtifactSubscriptionRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateArtifactSubscriptionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an artifact subscription rule.</p>
     * 
     * @param request UpdateArtifactSubscriptionRuleRequest
     * @return UpdateArtifactSubscriptionRuleResponse
     */
    public UpdateArtifactSubscriptionRuleResponse updateArtifactSubscriptionRule(UpdateArtifactSubscriptionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateArtifactSubscriptionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a delivery chain, such as the node execution sequence of the delivery chain.</p>
     * 
     * @param request UpdateChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChainResponse
     */
    public UpdateChainResponse updateChainWithOptions(UpdateChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chainConfig)) {
            query.put("ChainConfig", request.chainConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chainId)) {
            query.put("ChainId", request.chainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeExclude)) {
            query.put("ScopeExclude", request.scopeExclude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChain"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a delivery chain, such as the node execution sequence of the delivery chain.</p>
     * 
     * @param request UpdateChainRequest
     * @return UpdateChainResponse
     */
    public UpdateChainResponse updateChain(UpdateChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateChainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a chart namespace.</p>
     * 
     * @param request UpdateChartNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChartNamespaceResponse
     */
    public UpdateChartNamespaceResponse updateChartNamespaceWithOptions(UpdateChartNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateRepo)) {
            query.put("AutoCreateRepo", request.autoCreateRepo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRepoType)) {
            query.put("DefaultRepoType", request.defaultRepoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChartNamespace"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChartNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a chart namespace.</p>
     * 
     * @param request UpdateChartNamespaceRequest
     * @return UpdateChartNamespaceResponse
     */
    public UpdateChartNamespaceResponse updateChartNamespace(UpdateChartNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateChartNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a chart repository of a Container Registry instance.</p>
     * 
     * @param request UpdateChartRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChartRepositoryResponse
     */
    public UpdateChartRepositoryResponse updateChartRepositoryWithOptions(UpdateChartRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoType)) {
            query.put("RepoType", request.repoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            query.put("Summary", request.summary);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChartRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChartRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a chart repository of a Container Registry instance.</p>
     * 
     * @param request UpdateChartRepositoryRequest
     * @return UpdateChartRepositoryResponse
     */
    public UpdateChartRepositoryResponse updateChartRepository(UpdateChartRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateChartRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an event notification rule.</p>
     * 
     * @param tmpReq UpdateEventCenterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventCenterRuleResponse
     */
    public UpdateEventCenterRuleResponse updateEventCenterRuleWithOptions(UpdateEventCenterRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEventCenterRuleShrinkRequest request = new UpdateEventCenterRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaces)) {
            request.namespacesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaces, "Namespaces", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repoNames)) {
            request.repoNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repoNames, "RepoNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventChannel)) {
            query.put("EventChannel", request.eventChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventConfig)) {
            query.put("EventConfig", request.eventConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventScope)) {
            query.put("EventScope", request.eventScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacesShrink)) {
            query.put("Namespaces", request.namespacesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamesShrink)) {
            query.put("RepoNames", request.repoNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoTagFilterPattern)) {
            query.put("RepoTagFilterPattern", request.repoTagFilterPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventCenterRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventCenterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an event notification rule.</p>
     * 
     * @param request UpdateEventCenterRuleRequest
     * @return UpdateEventCenterRuleResponse
     */
    public UpdateEventCenterRuleResponse updateEventCenterRule(UpdateEventCenterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventCenterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of an instance endpoint.</p>
     * 
     * @param request UpdateInstanceEndpointStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceEndpointStatusResponse
     */
    public UpdateInstanceEndpointStatusResponse updateInstanceEndpointStatusWithOptions(UpdateInstanceEndpointStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceEndpointStatus"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceEndpointStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of an instance endpoint.</p>
     * 
     * @param request UpdateInstanceEndpointStatusRequest
     * @return UpdateInstanceEndpointStatusResponse
     */
    public UpdateInstanceEndpointStatusResponse updateInstanceEndpointStatus(UpdateInstanceEndpointStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceEndpointStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a namespace.</p>
     * 
     * @param tmpReq UpdateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNamespaceResponse
     */
    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateNamespaceShrinkRequest request = new UpdateNamespaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultRepoConfiguration)) {
            request.defaultRepoConfigurationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultRepoConfiguration, "DefaultRepoConfiguration", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateRepo)) {
            query.put("AutoCreateRepo", request.autoCreateRepo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRepoConfigurationShrink)) {
            query.put("DefaultRepoConfiguration", request.defaultRepoConfigurationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRepoType)) {
            query.put("DefaultRepoType", request.defaultRepoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNamespace"),
            new TeaPair("version", "2018-12-01"),
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
     * <p>Updates a namespace.</p>
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
     * <p>Updates an image building rule for a repository.</p>
     * 
     * @param request UpdateRepoBuildRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRepoBuildRuleResponse
     */
    public UpdateRepoBuildRuleResponse updateRepoBuildRuleWithOptions(UpdateRepoBuildRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildArgs)) {
            query.put("BuildArgs", request.buildArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildRuleId)) {
            query.put("BuildRuleId", request.buildRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dockerfileLocation)) {
            query.put("DockerfileLocation", request.dockerfileLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dockerfileName)) {
            query.put("DockerfileName", request.dockerfileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageTag)) {
            query.put("ImageTag", request.imageTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platforms)) {
            query.put("Platforms", request.platforms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushName)) {
            query.put("PushName", request.pushName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushType)) {
            query.put("PushType", request.pushType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepoBuildRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepoBuildRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an image building rule for a repository.</p>
     * 
     * @param request UpdateRepoBuildRuleRequest
     * @return UpdateRepoBuildRuleResponse
     */
    public UpdateRepoBuildRuleResponse updateRepoBuildRule(UpdateRepoBuildRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRepoBuildRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the URL of the source code repository that is bound to an image repository.</p>
     * 
     * @param request UpdateRepoSourceCodeRepoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRepoSourceCodeRepoResponse
     */
    public UpdateRepoSourceCodeRepoResponse updateRepoSourceCodeRepoWithOptions(UpdateRepoSourceCodeRepoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoBuild)) {
            query.put("AutoBuild", request.autoBuild);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoId)) {
            query.put("CodeRepoId", request.codeRepoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoName)) {
            query.put("CodeRepoName", request.codeRepoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoNamespaceName)) {
            query.put("CodeRepoNamespaceName", request.codeRepoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoType)) {
            query.put("CodeRepoType", request.codeRepoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableCacheBuild)) {
            query.put("DisableCacheBuild", request.disableCacheBuild);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overseaBuild)) {
            query.put("OverseaBuild", request.overseaBuild);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepoSourceCodeRepo"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepoSourceCodeRepoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the URL of the source code repository that is bound to an image repository.</p>
     * 
     * @param request UpdateRepoSourceCodeRepoRequest
     * @return UpdateRepoSourceCodeRepoResponse
     */
    public UpdateRepoSourceCodeRepoResponse updateRepoSourceCodeRepo(UpdateRepoSourceCodeRepoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRepoSourceCodeRepoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a trigger of an image repository.</p>
     * 
     * @param request UpdateRepoTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRepoTriggerResponse
     */
    public UpdateRepoTriggerResponse updateRepoTriggerWithOptions(UpdateRepoTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerId)) {
            query.put("TriggerId", request.triggerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerName)) {
            query.put("TriggerName", request.triggerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerTag)) {
            query.put("TriggerTag", request.triggerTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerUrl)) {
            query.put("TriggerUrl", request.triggerUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepoTrigger"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepoTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a trigger of an image repository.</p>
     * 
     * @param request UpdateRepoTriggerRequest
     * @return UpdateRepoTriggerResponse
     */
    public UpdateRepoTriggerResponse updateRepoTrigger(UpdateRepoTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRepoTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request UpdateRepositoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRepositoryResponse
     */
    public UpdateRepositoryResponse updateRepositoryWithOptions(UpdateRepositoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamespaceName)) {
            query.put("RepoNamespaceName", request.repoNamespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoType)) {
            query.put("RepoType", request.repoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            query.put("Summary", request.summary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagImmutability)) {
            query.put("TagImmutability", request.tagImmutability);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepository"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepositoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request UpdateRepositoryRequest
     * @return UpdateRepositoryResponse
     */
    public UpdateRepositoryResponse updateRepository(UpdateRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRepositoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The whitelist of this API operation is available. <a href="https://smartservice.console.aliyun.com/service/create-ticket">Submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a scan rule.</p>
     * 
     * @param tmpReq UpdateScanRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScanRuleResponse
     */
    public UpdateScanRuleResponse updateScanRuleWithOptions(UpdateScanRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateScanRuleShrinkRequest request = new UpdateScanRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaces)) {
            request.namespacesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaces, "Namespaces", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repoNames)) {
            request.repoNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repoNames, "RepoNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacesShrink)) {
            query.put("Namespaces", request.namespacesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoNamesShrink)) {
            query.put("RepoNames", request.repoNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoTagFilterPattern)) {
            query.put("RepoTagFilterPattern", request.repoTagFilterPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanRuleId)) {
            query.put("ScanRuleId", request.scanRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanScope)) {
            query.put("ScanScope", request.scanScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScanRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScanRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The whitelist of this API operation is available. <a href="https://smartservice.console.aliyun.com/service/create-ticket">Submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a scan rule.</p>
     * 
     * @param request UpdateScanRuleRequest
     * @return UpdateScanRuleResponse
     */
    public UpdateScanRuleResponse updateScanRule(UpdateScanRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScanRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The whitelist of this API operation is available. <a href="https://smartservice.console.aliyun.com/service/create-ticket">Submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a routing rule for an instance store domain name.</p>
     * 
     * @param tmpReq UpdateStorageDomainRoutingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStorageDomainRoutingRuleResponse
     */
    public UpdateStorageDomainRoutingRuleResponse updateStorageDomainRoutingRuleWithOptions(UpdateStorageDomainRoutingRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStorageDomainRoutingRuleShrinkRequest request = new UpdateStorageDomainRoutingRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.routes)) {
            request.routesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.routes, "Routes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routesShrink)) {
            query.put("Routes", request.routesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStorageDomainRoutingRule"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStorageDomainRoutingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The whitelist of this API operation is available. <a href="https://smartservice.console.aliyun.com/service/create-ticket">Submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a routing rule for an instance store domain name.</p>
     * 
     * @param request UpdateStorageDomainRoutingRuleRequest
     * @return UpdateStorageDomainRoutingRuleResponse
     */
    public UpdateStorageDomainRoutingRuleResponse updateStorageDomainRoutingRule(UpdateStorageDomainRoutingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStorageDomainRoutingRuleWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201;

import com.aliyun.tea.*;
import com.aliyun.cr20181201.models.*;
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

    public CancelArtifactBuildTaskResponse cancelArtifactBuildTaskWithOptions(CancelArtifactBuildTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildTaskId)) {
            query.put("BuildTaskId", request.buildTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelArtifactBuildTaskResponse cancelArtifactBuildTask(CancelArtifactBuildTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelArtifactBuildTaskWithOptions(request, runtime);
    }

    public CancelRepoBuildRecordResponse cancelRepoBuildRecordWithOptions(CancelRepoBuildRecordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelRepoBuildRecordResponse cancelRepoBuildRecord(CancelRepoBuildRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelRepoBuildRecordWithOptions(request, runtime);
    }

    public CreateBuildRecordByRuleResponse createBuildRecordByRuleWithOptions(CreateBuildRecordByRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateBuildRecordByRuleResponse createBuildRecordByRule(CreateBuildRecordByRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBuildRecordByRuleWithOptions(request, runtime);
    }

    public CreateChainResponse createChainWithOptions(CreateChainRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateChainResponse createChain(CreateChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChainWithOptions(request, runtime);
    }

    public CreateChartNamespaceResponse createChartNamespaceWithOptions(CreateChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateChartNamespaceResponse createChartNamespace(CreateChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChartNamespaceWithOptions(request, runtime);
    }

    public CreateChartRepositoryResponse createChartRepositoryWithOptions(CreateChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateChartRepositoryResponse createChartRepository(CreateChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChartRepositoryWithOptions(request, runtime);
    }

    public CreateInstanceEndpointAclPolicyResponse createInstanceEndpointAclPolicyWithOptions(CreateInstanceEndpointAclPolicyRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateInstanceEndpointAclPolicyResponse createInstanceEndpointAclPolicy(CreateInstanceEndpointAclPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceEndpointAclPolicyWithOptions(request, runtime);
    }

    public CreateInstanceVpcEndpointLinkedVpcResponse createInstanceVpcEndpointLinkedVpcWithOptions(CreateInstanceVpcEndpointLinkedVpcRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateInstanceVpcEndpointLinkedVpcResponse createInstanceVpcEndpointLinkedVpc(CreateInstanceVpcEndpointLinkedVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceVpcEndpointLinkedVpcWithOptions(request, runtime);
    }

    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    public CreateRepoBuildRuleResponse createRepoBuildRuleWithOptions(CreateRepoBuildRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepoBuildRuleResponse createRepoBuildRule(CreateRepoBuildRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoBuildRuleWithOptions(request, runtime);
    }

    public CreateRepoSourceCodeRepoResponse createRepoSourceCodeRepoWithOptions(CreateRepoSourceCodeRepoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepoSourceCodeRepoResponse createRepoSourceCodeRepo(CreateRepoSourceCodeRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoSourceCodeRepoWithOptions(request, runtime);
    }

    public CreateRepoSyncRuleResponse createRepoSyncRuleWithOptions(CreateRepoSyncRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepoSyncRuleResponse createRepoSyncRule(CreateRepoSyncRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoSyncRuleWithOptions(request, runtime);
    }

    public CreateRepoSyncTaskResponse createRepoSyncTaskWithOptions(CreateRepoSyncTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepoSyncTaskResponse createRepoSyncTask(CreateRepoSyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoSyncTaskWithOptions(request, runtime);
    }

    public CreateRepoSyncTaskByRuleResponse createRepoSyncTaskByRuleWithOptions(CreateRepoSyncTaskByRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepoSyncTaskByRuleResponse createRepoSyncTaskByRule(CreateRepoSyncTaskByRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoSyncTaskByRuleWithOptions(request, runtime);
    }

    public CreateRepoTagResponse createRepoTagWithOptions(CreateRepoTagRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepoTagResponse createRepoTag(CreateRepoTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoTagWithOptions(request, runtime);
    }

    public CreateRepoTagScanTaskResponse createRepoTagScanTaskWithOptions(CreateRepoTagScanTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepoTagScanTaskResponse createRepoTagScanTask(CreateRepoTagScanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoTagScanTaskWithOptions(request, runtime);
    }

    public CreateRepoTriggerResponse createRepoTriggerWithOptions(CreateRepoTriggerRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepoTriggerResponse createRepoTrigger(CreateRepoTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoTriggerWithOptions(request, runtime);
    }

    public CreateRepositoryResponse createRepositoryWithOptions(CreateRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepositoryWithOptions(request, runtime);
    }

    public DeleteChainResponse deleteChainWithOptions(DeleteChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chainId)) {
            query.put("ChainId", request.chainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteChainResponse deleteChain(DeleteChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChainWithOptions(request, runtime);
    }

    public DeleteChartNamespaceResponse deleteChartNamespaceWithOptions(DeleteChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteChartNamespaceResponse deleteChartNamespace(DeleteChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChartNamespaceWithOptions(request, runtime);
    }

    public DeleteChartReleaseResponse deleteChartReleaseWithOptions(DeleteChartReleaseRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteChartReleaseResponse deleteChartRelease(DeleteChartReleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChartReleaseWithOptions(request, runtime);
    }

    public DeleteChartRepositoryResponse deleteChartRepositoryWithOptions(DeleteChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteChartRepositoryResponse deleteChartRepository(DeleteChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChartRepositoryWithOptions(request, runtime);
    }

    public DeleteEventCenterRuleResponse deleteEventCenterRuleWithOptions(DeleteEventCenterRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteEventCenterRuleResponse deleteEventCenterRule(DeleteEventCenterRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventCenterRuleWithOptions(request, runtime);
    }

    public DeleteInstanceEndpointAclPolicyResponse deleteInstanceEndpointAclPolicyWithOptions(DeleteInstanceEndpointAclPolicyRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteInstanceEndpointAclPolicyResponse deleteInstanceEndpointAclPolicy(DeleteInstanceEndpointAclPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceEndpointAclPolicyWithOptions(request, runtime);
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponse deleteInstanceVpcEndpointLinkedVpcWithOptions(DeleteInstanceVpcEndpointLinkedVpcRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteInstanceVpcEndpointLinkedVpcResponse deleteInstanceVpcEndpointLinkedVpc(DeleteInstanceVpcEndpointLinkedVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceVpcEndpointLinkedVpcWithOptions(request, runtime);
    }

    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    public DeleteRepoBuildRuleResponse deleteRepoBuildRuleWithOptions(DeleteRepoBuildRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRepoBuildRuleResponse deleteRepoBuildRule(DeleteRepoBuildRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepoBuildRuleWithOptions(request, runtime);
    }

    public DeleteRepoSyncRuleResponse deleteRepoSyncRuleWithOptions(DeleteRepoSyncRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncRuleId)) {
            query.put("SyncRuleId", request.syncRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRepoSyncRuleResponse deleteRepoSyncRule(DeleteRepoSyncRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepoSyncRuleWithOptions(request, runtime);
    }

    public DeleteRepoTagResponse deleteRepoTagWithOptions(DeleteRepoTagRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRepoTagResponse deleteRepoTag(DeleteRepoTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepoTagWithOptions(request, runtime);
    }

    public DeleteRepoTriggerResponse deleteRepoTriggerWithOptions(DeleteRepoTriggerRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRepoTriggerResponse deleteRepoTrigger(DeleteRepoTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepoTriggerWithOptions(request, runtime);
    }

    public DeleteRepositoryResponse deleteRepositoryWithOptions(DeleteRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepositoryWithOptions(request, runtime);
    }

    public GetArtifactBuildTaskResponse getArtifactBuildTaskWithOptions(GetArtifactBuildTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetArtifactBuildTaskResponse getArtifactBuildTask(GetArtifactBuildTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getArtifactBuildTaskWithOptions(request, runtime);
    }

    public GetAuthorizationTokenResponse getAuthorizationTokenWithOptions(GetAuthorizationTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAuthorizationTokenResponse getAuthorizationToken(GetAuthorizationTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthorizationTokenWithOptions(request, runtime);
    }

    public GetChainResponse getChainWithOptions(GetChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chainId)) {
            query.put("ChainId", request.chainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetChainResponse getChain(GetChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChainWithOptions(request, runtime);
    }

    public GetChartNamespaceResponse getChartNamespaceWithOptions(GetChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetChartNamespaceResponse getChartNamespace(GetChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChartNamespaceWithOptions(request, runtime);
    }

    public GetChartRepositoryResponse getChartRepositoryWithOptions(GetChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetChartRepositoryResponse getChartRepository(GetChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChartRepositoryWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetInstanceCountResponse getInstanceCountWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetInstanceCountResponse getInstanceCount() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceCountWithOptions(runtime);
    }

    public GetInstanceEndpointResponse getInstanceEndpointWithOptions(GetInstanceEndpointRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetInstanceEndpointResponse getInstanceEndpoint(GetInstanceEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceEndpointWithOptions(request, runtime);
    }

    public GetInstanceUsageResponse getInstanceUsageWithOptions(GetInstanceUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetInstanceUsageResponse getInstanceUsage(GetInstanceUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceUsageWithOptions(request, runtime);
    }

    public GetInstanceVpcEndpointResponse getInstanceVpcEndpointWithOptions(GetInstanceVpcEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetInstanceVpcEndpointResponse getInstanceVpcEndpoint(GetInstanceVpcEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceVpcEndpointWithOptions(request, runtime);
    }

    public GetNamespaceResponse getNamespaceWithOptions(GetNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNamespaceWithOptions(request, runtime);
    }

    public GetRepoBuildRecordResponse getRepoBuildRecordWithOptions(GetRepoBuildRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildRecordId)) {
            query.put("BuildRecordId", request.buildRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRepoBuildRecordResponse getRepoBuildRecord(GetRepoBuildRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoBuildRecordWithOptions(request, runtime);
    }

    public GetRepoBuildRecordStatusResponse getRepoBuildRecordStatusWithOptions(GetRepoBuildRecordStatusRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRepoBuildRecordStatusResponse getRepoBuildRecordStatus(GetRepoBuildRecordStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoBuildRecordStatusWithOptions(request, runtime);
    }

    public GetRepoSourceCodeRepoResponse getRepoSourceCodeRepoWithOptions(GetRepoSourceCodeRepoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRepoSourceCodeRepoResponse getRepoSourceCodeRepo(GetRepoSourceCodeRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoSourceCodeRepoWithOptions(request, runtime);
    }

    public GetRepoSyncTaskResponse getRepoSyncTaskWithOptions(GetRepoSyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncTaskId)) {
            query.put("SyncTaskId", request.syncTaskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRepoSyncTaskResponse getRepoSyncTask(GetRepoSyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoSyncTaskWithOptions(request, runtime);
    }

    public GetRepoTagResponse getRepoTagWithOptions(GetRepoTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRepoTagResponse getRepoTag(GetRepoTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagWithOptions(request, runtime);
    }

    public GetRepoTagLayersResponse getRepoTagLayersWithOptions(GetRepoTagLayersRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTagLayers"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagLayersResponse());
    }

    public GetRepoTagLayersResponse getRepoTagLayers(GetRepoTagLayersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagLayersWithOptions(request, runtime);
    }

    public GetRepoTagManifestResponse getRepoTagManifestWithOptions(GetRepoTagManifestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaVersion)) {
            query.put("SchemaVersion", request.schemaVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTagManifest"),
            new TeaPair("version", "2018-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagManifestResponse());
    }

    public GetRepoTagManifestResponse getRepoTagManifest(GetRepoTagManifestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagManifestWithOptions(request, runtime);
    }

    public GetRepoTagScanStatusResponse getRepoTagScanStatusWithOptions(GetRepoTagScanStatusRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRepoTagScanStatusResponse getRepoTagScanStatus(GetRepoTagScanStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagScanStatusWithOptions(request, runtime);
    }

    public GetRepoTagScanSummaryResponse getRepoTagScanSummaryWithOptions(GetRepoTagScanSummaryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRepoTagScanSummaryResponse getRepoTagScanSummary(GetRepoTagScanSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagScanSummaryWithOptions(request, runtime);
    }

    public GetRepositoryResponse getRepositoryWithOptions(GetRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRepositoryResponse getRepository(GetRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepositoryWithOptions(request, runtime);
    }

    public ListArtifactBuildTaskLogResponse listArtifactBuildTaskLogWithOptions(ListArtifactBuildTaskLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListArtifactBuildTaskLogResponse listArtifactBuildTaskLog(ListArtifactBuildTaskLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listArtifactBuildTaskLogWithOptions(request, runtime);
    }

    public ListChainResponse listChainWithOptions(ListChainRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListChainResponse listChain(ListChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChainWithOptions(request, runtime);
    }

    public ListChainInstanceResponse listChainInstanceWithOptions(ListChainInstanceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListChainInstanceResponse listChainInstance(ListChainInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChainInstanceWithOptions(request, runtime);
    }

    public ListChartNamespaceResponse listChartNamespaceWithOptions(ListChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListChartNamespaceResponse listChartNamespace(ListChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChartNamespaceWithOptions(request, runtime);
    }

    public ListChartReleaseResponse listChartReleaseWithOptions(ListChartReleaseRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListChartReleaseResponse listChartRelease(ListChartReleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChartReleaseWithOptions(request, runtime);
    }

    public ListChartRepositoryResponse listChartRepositoryWithOptions(ListChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListChartRepositoryResponse listChartRepository(ListChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChartRepositoryWithOptions(request, runtime);
    }

    public ListEventCenterRecordResponse listEventCenterRecordWithOptions(ListEventCenterRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListEventCenterRecordResponse listEventCenterRecord(ListEventCenterRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEventCenterRecordWithOptions(request, runtime);
    }

    public ListEventCenterRuleNameResponse listEventCenterRuleNameWithOptions(ListEventCenterRuleNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListEventCenterRuleNameResponse listEventCenterRuleName(ListEventCenterRuleNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEventCenterRuleNameWithOptions(request, runtime);
    }

    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceWithOptions(request, runtime);
    }

    public ListInstanceEndpointResponse listInstanceEndpointWithOptions(ListInstanceEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListInstanceEndpointResponse listInstanceEndpoint(ListInstanceEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceEndpointWithOptions(request, runtime);
    }

    public ListInstanceRegionResponse listInstanceRegionWithOptions(ListInstanceRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListInstanceRegionResponse listInstanceRegion(ListInstanceRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceRegionWithOptions(request, runtime);
    }

    public ListNamespaceResponse listNamespaceWithOptions(ListNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListNamespaceResponse listNamespace(ListNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNamespaceWithOptions(request, runtime);
    }

    public ListRepoBuildRecordResponse listRepoBuildRecordWithOptions(ListRepoBuildRecordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepoBuildRecordResponse listRepoBuildRecord(ListRepoBuildRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoBuildRecordWithOptions(request, runtime);
    }

    public ListRepoBuildRecordLogResponse listRepoBuildRecordLogWithOptions(ListRepoBuildRecordLogRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepoBuildRecordLogResponse listRepoBuildRecordLog(ListRepoBuildRecordLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoBuildRecordLogWithOptions(request, runtime);
    }

    public ListRepoBuildRuleResponse listRepoBuildRuleWithOptions(ListRepoBuildRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepoBuildRuleResponse listRepoBuildRule(ListRepoBuildRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoBuildRuleWithOptions(request, runtime);
    }

    public ListRepoSyncRuleResponse listRepoSyncRuleWithOptions(ListRepoSyncRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepoSyncRuleResponse listRepoSyncRule(ListRepoSyncRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoSyncRuleWithOptions(request, runtime);
    }

    public ListRepoSyncTaskResponse listRepoSyncTaskWithOptions(ListRepoSyncTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepoSyncTaskResponse listRepoSyncTask(ListRepoSyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoSyncTaskWithOptions(request, runtime);
    }

    public ListRepoTagResponse listRepoTagWithOptions(ListRepoTagRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepoTagResponse listRepoTag(ListRepoTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoTagWithOptions(request, runtime);
    }

    public ListRepoTagScanResultResponse listRepoTagScanResultWithOptions(ListRepoTagScanResultRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepoTagScanResultResponse listRepoTagScanResult(ListRepoTagScanResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoTagScanResultWithOptions(request, runtime);
    }

    public ListRepoTriggerResponse listRepoTriggerWithOptions(ListRepoTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepoTriggerResponse listRepoTrigger(ListRepoTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoTriggerWithOptions(request, runtime);
    }

    public ListRepositoryResponse listRepositoryWithOptions(ListRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRepositoryResponse listRepository(ListRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepositoryWithOptions(request, runtime);
    }

    public ResetLoginPasswordResponse resetLoginPasswordWithOptions(ResetLoginPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ResetLoginPasswordResponse resetLoginPassword(ResetLoginPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetLoginPasswordWithOptions(request, runtime);
    }

    public UpdateChainResponse updateChainWithOptions(UpdateChainRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateChainResponse updateChain(UpdateChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateChainWithOptions(request, runtime);
    }

    public UpdateChartNamespaceResponse updateChartNamespaceWithOptions(UpdateChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateChartNamespaceResponse updateChartNamespace(UpdateChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateChartNamespaceWithOptions(request, runtime);
    }

    public UpdateChartRepositoryResponse updateChartRepositoryWithOptions(UpdateChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateChartRepositoryResponse updateChartRepository(UpdateChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateChartRepositoryWithOptions(request, runtime);
    }

    public UpdateEventCenterRuleResponse updateEventCenterRuleWithOptions(UpdateEventCenterRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateEventCenterRuleResponse updateEventCenterRule(UpdateEventCenterRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEventCenterRuleWithOptions(request, runtime);
    }

    public UpdateInstanceEndpointStatusResponse updateInstanceEndpointStatusWithOptions(UpdateInstanceEndpointStatusRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateInstanceEndpointStatusResponse updateInstanceEndpointStatus(UpdateInstanceEndpointStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceEndpointStatusWithOptions(request, runtime);
    }

    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNamespaceWithOptions(request, runtime);
    }

    public UpdateRepoBuildRuleResponse updateRepoBuildRuleWithOptions(UpdateRepoBuildRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRepoBuildRuleResponse updateRepoBuildRule(UpdateRepoBuildRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRepoBuildRuleWithOptions(request, runtime);
    }

    public UpdateRepoSourceCodeRepoResponse updateRepoSourceCodeRepoWithOptions(UpdateRepoSourceCodeRepoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRepoSourceCodeRepoResponse updateRepoSourceCodeRepo(UpdateRepoSourceCodeRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRepoSourceCodeRepoWithOptions(request, runtime);
    }

    public UpdateRepoTriggerResponse updateRepoTriggerWithOptions(UpdateRepoTriggerRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRepoTriggerResponse updateRepoTrigger(UpdateRepoTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRepoTriggerWithOptions(request, runtime);
    }

    public UpdateRepositoryResponse updateRepositoryWithOptions(UpdateRepositoryRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.repoType)) {
            query.put("RepoType", request.repoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            query.put("Summary", request.summary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagImmutability)) {
            query.put("TagImmutability", request.tagImmutability);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRepositoryResponse updateRepository(UpdateRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRepositoryWithOptions(request, runtime);
    }
}

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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelArtifactBuildTask", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CancelArtifactBuildTaskResponse());
    }

    public CancelArtifactBuildTaskResponse cancelArtifactBuildTask(CancelArtifactBuildTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelArtifactBuildTaskWithOptions(request, runtime);
    }

    public CancelRepoBuildRecordResponse cancelRepoBuildRecordWithOptions(CancelRepoBuildRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelRepoBuildRecord", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CancelRepoBuildRecordResponse());
    }

    public CancelRepoBuildRecordResponse cancelRepoBuildRecord(CancelRepoBuildRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelRepoBuildRecordWithOptions(request, runtime);
    }

    public CreateBuildRecordByRuleResponse createBuildRecordByRuleWithOptions(CreateBuildRecordByRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBuildRecordByRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBuildRecordByRuleResponse());
    }

    public CreateBuildRecordByRuleResponse createBuildRecordByRule(CreateBuildRecordByRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBuildRecordByRuleWithOptions(request, runtime);
    }

    public CreateChartNamespaceResponse createChartNamespaceWithOptions(CreateChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateChartNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateChartNamespaceResponse());
    }

    public CreateChartNamespaceResponse createChartNamespace(CreateChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChartNamespaceWithOptions(request, runtime);
    }

    public CreateChartRepositoryResponse createChartRepositoryWithOptions(CreateChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateChartRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateChartRepositoryResponse());
    }

    public CreateChartRepositoryResponse createChartRepository(CreateChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChartRepositoryWithOptions(request, runtime);
    }

    public CreateInstanceEndpointAclPolicyResponse createInstanceEndpointAclPolicyWithOptions(CreateInstanceEndpointAclPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstanceEndpointAclPolicy", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceEndpointAclPolicyResponse());
    }

    public CreateInstanceEndpointAclPolicyResponse createInstanceEndpointAclPolicy(CreateInstanceEndpointAclPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceEndpointAclPolicyWithOptions(request, runtime);
    }

    public CreateInstanceVpcEndpointLinkedVpcResponse createInstanceVpcEndpointLinkedVpcWithOptions(CreateInstanceVpcEndpointLinkedVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstanceVpcEndpointLinkedVpc", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceVpcEndpointLinkedVpcResponse());
    }

    public CreateInstanceVpcEndpointLinkedVpcResponse createInstanceVpcEndpointLinkedVpc(CreateInstanceVpcEndpointLinkedVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceVpcEndpointLinkedVpcWithOptions(request, runtime);
    }

    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNamespaceResponse());
    }

    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    public CreateRepoBuildRuleResponse createRepoBuildRuleWithOptions(CreateRepoBuildRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRepoBuildRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRepoBuildRuleResponse());
    }

    public CreateRepoBuildRuleResponse createRepoBuildRule(CreateRepoBuildRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoBuildRuleWithOptions(request, runtime);
    }

    public CreateRepositoryResponse createRepositoryWithOptions(CreateRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRepositoryResponse());
    }

    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepositoryWithOptions(request, runtime);
    }

    public CreateRepoSourceCodeRepoResponse createRepoSourceCodeRepoWithOptions(CreateRepoSourceCodeRepoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRepoSourceCodeRepo", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRepoSourceCodeRepoResponse());
    }

    public CreateRepoSourceCodeRepoResponse createRepoSourceCodeRepo(CreateRepoSourceCodeRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoSourceCodeRepoWithOptions(request, runtime);
    }

    public CreateRepoSyncRuleResponse createRepoSyncRuleWithOptions(CreateRepoSyncRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRepoSyncRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRepoSyncRuleResponse());
    }

    public CreateRepoSyncRuleResponse createRepoSyncRule(CreateRepoSyncRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoSyncRuleWithOptions(request, runtime);
    }

    public CreateRepoSyncTaskByRuleResponse createRepoSyncTaskByRuleWithOptions(CreateRepoSyncTaskByRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRepoSyncTaskByRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRepoSyncTaskByRuleResponse());
    }

    public CreateRepoSyncTaskByRuleResponse createRepoSyncTaskByRule(CreateRepoSyncTaskByRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoSyncTaskByRuleWithOptions(request, runtime);
    }

    public CreateRepoTagResponse createRepoTagWithOptions(CreateRepoTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRepoTag", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRepoTagResponse());
    }

    public CreateRepoTagResponse createRepoTag(CreateRepoTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoTagWithOptions(request, runtime);
    }

    public CreateRepoTagScanTaskResponse createRepoTagScanTaskWithOptions(CreateRepoTagScanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRepoTagScanTask", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRepoTagScanTaskResponse());
    }

    public CreateRepoTagScanTaskResponse createRepoTagScanTask(CreateRepoTagScanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoTagScanTaskWithOptions(request, runtime);
    }

    public CreateRepoTriggerResponse createRepoTriggerWithOptions(CreateRepoTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRepoTrigger", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRepoTriggerResponse());
    }

    public CreateRepoTriggerResponse createRepoTrigger(CreateRepoTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRepoTriggerWithOptions(request, runtime);
    }

    public DeleteChartNamespaceResponse deleteChartNamespaceWithOptions(DeleteChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteChartNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteChartNamespaceResponse());
    }

    public DeleteChartNamespaceResponse deleteChartNamespace(DeleteChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChartNamespaceWithOptions(request, runtime);
    }

    public DeleteChartReleaseResponse deleteChartReleaseWithOptions(DeleteChartReleaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteChartRelease", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteChartReleaseResponse());
    }

    public DeleteChartReleaseResponse deleteChartRelease(DeleteChartReleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChartReleaseWithOptions(request, runtime);
    }

    public DeleteChartRepositoryResponse deleteChartRepositoryWithOptions(DeleteChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteChartRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteChartRepositoryResponse());
    }

    public DeleteChartRepositoryResponse deleteChartRepository(DeleteChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChartRepositoryWithOptions(request, runtime);
    }

    public DeleteInstanceEndpointAclPolicyResponse deleteInstanceEndpointAclPolicyWithOptions(DeleteInstanceEndpointAclPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstanceEndpointAclPolicy", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceEndpointAclPolicyResponse());
    }

    public DeleteInstanceEndpointAclPolicyResponse deleteInstanceEndpointAclPolicy(DeleteInstanceEndpointAclPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceEndpointAclPolicyWithOptions(request, runtime);
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponse deleteInstanceVpcEndpointLinkedVpcWithOptions(DeleteInstanceVpcEndpointLinkedVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstanceVpcEndpointLinkedVpc", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceVpcEndpointLinkedVpcResponse());
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponse deleteInstanceVpcEndpointLinkedVpc(DeleteInstanceVpcEndpointLinkedVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceVpcEndpointLinkedVpcWithOptions(request, runtime);
    }

    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNamespaceResponse());
    }

    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    public DeleteRepoBuildRuleResponse deleteRepoBuildRuleWithOptions(DeleteRepoBuildRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRepoBuildRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRepoBuildRuleResponse());
    }

    public DeleteRepoBuildRuleResponse deleteRepoBuildRule(DeleteRepoBuildRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepoBuildRuleWithOptions(request, runtime);
    }

    public DeleteRepositoryResponse deleteRepositoryWithOptions(DeleteRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRepositoryResponse());
    }

    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepositoryWithOptions(request, runtime);
    }

    public DeleteRepoSyncRuleResponse deleteRepoSyncRuleWithOptions(DeleteRepoSyncRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRepoSyncRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRepoSyncRuleResponse());
    }

    public DeleteRepoSyncRuleResponse deleteRepoSyncRule(DeleteRepoSyncRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepoSyncRuleWithOptions(request, runtime);
    }

    public DeleteRepoTagResponse deleteRepoTagWithOptions(DeleteRepoTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRepoTag", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRepoTagResponse());
    }

    public DeleteRepoTagResponse deleteRepoTag(DeleteRepoTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepoTagWithOptions(request, runtime);
    }

    public DeleteRepoTriggerResponse deleteRepoTriggerWithOptions(DeleteRepoTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRepoTrigger", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRepoTriggerResponse());
    }

    public DeleteRepoTriggerResponse deleteRepoTrigger(DeleteRepoTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRepoTriggerWithOptions(request, runtime);
    }

    public GetArtifactBuildTaskResponse getArtifactBuildTaskWithOptions(GetArtifactBuildTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetArtifactBuildTask", "2018-12-01", "HTTPS", "GET", "AK", "json", req, runtime), new GetArtifactBuildTaskResponse());
    }

    public GetArtifactBuildTaskResponse getArtifactBuildTask(GetArtifactBuildTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getArtifactBuildTaskWithOptions(request, runtime);
    }

    public GetAuthorizationTokenResponse getAuthorizationTokenWithOptions(GetAuthorizationTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuthorizationToken", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuthorizationTokenResponse());
    }

    public GetAuthorizationTokenResponse getAuthorizationToken(GetAuthorizationTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthorizationTokenWithOptions(request, runtime);
    }

    public GetChartNamespaceResponse getChartNamespaceWithOptions(GetChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetChartNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetChartNamespaceResponse());
    }

    public GetChartNamespaceResponse getChartNamespace(GetChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChartNamespaceWithOptions(request, runtime);
    }

    public GetChartRepositoryResponse getChartRepositoryWithOptions(GetChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetChartRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetChartRepositoryResponse());
    }

    public GetChartRepositoryResponse getChartRepository(GetChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChartRepositoryWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstance", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetInstanceCountResponse getInstanceCountWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetInstanceCount", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceCountResponse());
    }

    public GetInstanceCountResponse getInstanceCount() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceCountWithOptions(runtime);
    }

    public GetInstanceEndpointResponse getInstanceEndpointWithOptions(GetInstanceEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceEndpoint", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceEndpointResponse());
    }

    public GetInstanceEndpointResponse getInstanceEndpoint(GetInstanceEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceEndpointWithOptions(request, runtime);
    }

    public GetInstanceUsageResponse getInstanceUsageWithOptions(GetInstanceUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceUsage", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceUsageResponse());
    }

    public GetInstanceUsageResponse getInstanceUsage(GetInstanceUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceUsageWithOptions(request, runtime);
    }

    public GetInstanceVpcEndpointResponse getInstanceVpcEndpointWithOptions(GetInstanceVpcEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceVpcEndpoint", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceVpcEndpointResponse());
    }

    public GetInstanceVpcEndpointResponse getInstanceVpcEndpoint(GetInstanceVpcEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceVpcEndpointWithOptions(request, runtime);
    }

    public GetNamespaceResponse getNamespaceWithOptions(GetNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetNamespaceResponse());
    }

    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNamespaceWithOptions(request, runtime);
    }

    public GetRepoBuildRecordResponse getRepoBuildRecordWithOptions(GetRepoBuildRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepoBuildRecord", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepoBuildRecordResponse());
    }

    public GetRepoBuildRecordResponse getRepoBuildRecord(GetRepoBuildRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoBuildRecordWithOptions(request, runtime);
    }

    public GetRepoBuildRecordStatusResponse getRepoBuildRecordStatusWithOptions(GetRepoBuildRecordStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepoBuildRecordStatus", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepoBuildRecordStatusResponse());
    }

    public GetRepoBuildRecordStatusResponse getRepoBuildRecordStatus(GetRepoBuildRecordStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoBuildRecordStatusWithOptions(request, runtime);
    }

    public GetRepositoryResponse getRepositoryWithOptions(GetRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepositoryResponse());
    }

    public GetRepositoryResponse getRepository(GetRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepositoryWithOptions(request, runtime);
    }

    public GetRepoSourceCodeRepoResponse getRepoSourceCodeRepoWithOptions(GetRepoSourceCodeRepoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepoSourceCodeRepo", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepoSourceCodeRepoResponse());
    }

    public GetRepoSourceCodeRepoResponse getRepoSourceCodeRepo(GetRepoSourceCodeRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoSourceCodeRepoWithOptions(request, runtime);
    }

    public GetRepoSyncTaskResponse getRepoSyncTaskWithOptions(GetRepoSyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepoSyncTask", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepoSyncTaskResponse());
    }

    public GetRepoSyncTaskResponse getRepoSyncTask(GetRepoSyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoSyncTaskWithOptions(request, runtime);
    }

    public GetRepoTagLayersResponse getRepoTagLayersWithOptions(GetRepoTagLayersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepoTagLayers", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepoTagLayersResponse());
    }

    public GetRepoTagLayersResponse getRepoTagLayers(GetRepoTagLayersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagLayersWithOptions(request, runtime);
    }

    public GetRepoTagManifestResponse getRepoTagManifestWithOptions(GetRepoTagManifestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepoTagManifest", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepoTagManifestResponse());
    }

    public GetRepoTagManifestResponse getRepoTagManifest(GetRepoTagManifestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagManifestWithOptions(request, runtime);
    }

    public GetRepoTagScanStatusResponse getRepoTagScanStatusWithOptions(GetRepoTagScanStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepoTagScanStatus", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepoTagScanStatusResponse());
    }

    public GetRepoTagScanStatusResponse getRepoTagScanStatus(GetRepoTagScanStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagScanStatusWithOptions(request, runtime);
    }

    public GetRepoTagScanSummaryResponse getRepoTagScanSummaryWithOptions(GetRepoTagScanSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRepoTagScanSummary", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRepoTagScanSummaryResponse());
    }

    public GetRepoTagScanSummaryResponse getRepoTagScanSummary(GetRepoTagScanSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRepoTagScanSummaryWithOptions(request, runtime);
    }

    public ListArtifactBuildTaskLogResponse listArtifactBuildTaskLogWithOptions(ListArtifactBuildTaskLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListArtifactBuildTaskLog", "2018-12-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListArtifactBuildTaskLogResponse());
    }

    public ListArtifactBuildTaskLogResponse listArtifactBuildTaskLog(ListArtifactBuildTaskLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listArtifactBuildTaskLogWithOptions(request, runtime);
    }

    public ListChartNamespaceResponse listChartNamespaceWithOptions(ListChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListChartNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListChartNamespaceResponse());
    }

    public ListChartNamespaceResponse listChartNamespace(ListChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChartNamespaceWithOptions(request, runtime);
    }

    public ListChartReleaseResponse listChartReleaseWithOptions(ListChartReleaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListChartRelease", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListChartReleaseResponse());
    }

    public ListChartReleaseResponse listChartRelease(ListChartReleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChartReleaseWithOptions(request, runtime);
    }

    public ListChartRepositoryResponse listChartRepositoryWithOptions(ListChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListChartRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListChartRepositoryResponse());
    }

    public ListChartRepositoryResponse listChartRepository(ListChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChartRepositoryWithOptions(request, runtime);
    }

    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstance", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstanceResponse());
    }

    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceWithOptions(request, runtime);
    }

    public ListInstanceEndpointResponse listInstanceEndpointWithOptions(ListInstanceEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstanceEndpoint", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstanceEndpointResponse());
    }

    public ListInstanceEndpointResponse listInstanceEndpoint(ListInstanceEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceEndpointWithOptions(request, runtime);
    }

    public ListInstanceRegionResponse listInstanceRegionWithOptions(ListInstanceRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstanceRegion", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstanceRegionResponse());
    }

    public ListInstanceRegionResponse listInstanceRegion(ListInstanceRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceRegionWithOptions(request, runtime);
    }

    public ListNamespaceResponse listNamespaceWithOptions(ListNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListNamespaceResponse());
    }

    public ListNamespaceResponse listNamespace(ListNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNamespaceWithOptions(request, runtime);
    }

    public ListRepoBuildRecordResponse listRepoBuildRecordWithOptions(ListRepoBuildRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoBuildRecord", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoBuildRecordResponse());
    }

    public ListRepoBuildRecordResponse listRepoBuildRecord(ListRepoBuildRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoBuildRecordWithOptions(request, runtime);
    }

    public ListRepoBuildRecordLogResponse listRepoBuildRecordLogWithOptions(ListRepoBuildRecordLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoBuildRecordLog", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoBuildRecordLogResponse());
    }

    public ListRepoBuildRecordLogResponse listRepoBuildRecordLog(ListRepoBuildRecordLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoBuildRecordLogWithOptions(request, runtime);
    }

    public ListRepoBuildRuleResponse listRepoBuildRuleWithOptions(ListRepoBuildRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoBuildRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoBuildRuleResponse());
    }

    public ListRepoBuildRuleResponse listRepoBuildRule(ListRepoBuildRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoBuildRuleWithOptions(request, runtime);
    }

    public ListRepositoryResponse listRepositoryWithOptions(ListRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepositoryResponse());
    }

    public ListRepositoryResponse listRepository(ListRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepositoryWithOptions(request, runtime);
    }

    public ListRepoSyncRuleResponse listRepoSyncRuleWithOptions(ListRepoSyncRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoSyncRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoSyncRuleResponse());
    }

    public ListRepoSyncRuleResponse listRepoSyncRule(ListRepoSyncRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoSyncRuleWithOptions(request, runtime);
    }

    public ListRepoSyncTaskResponse listRepoSyncTaskWithOptions(ListRepoSyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoSyncTask", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoSyncTaskResponse());
    }

    public ListRepoSyncTaskResponse listRepoSyncTask(ListRepoSyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoSyncTaskWithOptions(request, runtime);
    }

    public ListRepoTagResponse listRepoTagWithOptions(ListRepoTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoTag", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoTagResponse());
    }

    public ListRepoTagResponse listRepoTag(ListRepoTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoTagWithOptions(request, runtime);
    }

    public ListRepoTagScanResultResponse listRepoTagScanResultWithOptions(ListRepoTagScanResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoTagScanResult", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoTagScanResultResponse());
    }

    public ListRepoTagScanResultResponse listRepoTagScanResult(ListRepoTagScanResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoTagScanResultWithOptions(request, runtime);
    }

    public ListRepoTriggerResponse listRepoTriggerWithOptions(ListRepoTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoTrigger", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoTriggerResponse());
    }

    public ListRepoTriggerResponse listRepoTrigger(ListRepoTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoTriggerWithOptions(request, runtime);
    }

    public ListRepoTriggerRecordResponse listRepoTriggerRecordWithOptions(ListRepoTriggerRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRepoTriggerRecord", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRepoTriggerRecordResponse());
    }

    public ListRepoTriggerRecordResponse listRepoTriggerRecord(ListRepoTriggerRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRepoTriggerRecordWithOptions(request, runtime);
    }

    public ResetLoginPasswordResponse resetLoginPasswordWithOptions(ResetLoginPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetLoginPassword", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetLoginPasswordResponse());
    }

    public ResetLoginPasswordResponse resetLoginPassword(ResetLoginPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetLoginPasswordWithOptions(request, runtime);
    }

    public UpdateChartNamespaceResponse updateChartNamespaceWithOptions(UpdateChartNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateChartNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateChartNamespaceResponse());
    }

    public UpdateChartNamespaceResponse updateChartNamespace(UpdateChartNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateChartNamespaceWithOptions(request, runtime);
    }

    public UpdateChartRepositoryResponse updateChartRepositoryWithOptions(UpdateChartRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateChartRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateChartRepositoryResponse());
    }

    public UpdateChartRepositoryResponse updateChartRepository(UpdateChartRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateChartRepositoryWithOptions(request, runtime);
    }

    public UpdateInstanceEndpointStatusResponse updateInstanceEndpointStatusWithOptions(UpdateInstanceEndpointStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstanceEndpointStatus", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceEndpointStatusResponse());
    }

    public UpdateInstanceEndpointStatusResponse updateInstanceEndpointStatus(UpdateInstanceEndpointStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceEndpointStatusWithOptions(request, runtime);
    }

    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateNamespace", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateNamespaceResponse());
    }

    public UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNamespaceWithOptions(request, runtime);
    }

    public UpdateRepoBuildRuleResponse updateRepoBuildRuleWithOptions(UpdateRepoBuildRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRepoBuildRule", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRepoBuildRuleResponse());
    }

    public UpdateRepoBuildRuleResponse updateRepoBuildRule(UpdateRepoBuildRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRepoBuildRuleWithOptions(request, runtime);
    }

    public UpdateRepositoryResponse updateRepositoryWithOptions(UpdateRepositoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRepository", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRepositoryResponse());
    }

    public UpdateRepositoryResponse updateRepository(UpdateRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRepositoryWithOptions(request, runtime);
    }

    public UpdateRepoSourceCodeRepoResponse updateRepoSourceCodeRepoWithOptions(UpdateRepoSourceCodeRepoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRepoSourceCodeRepo", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRepoSourceCodeRepoResponse());
    }

    public UpdateRepoSourceCodeRepoResponse updateRepoSourceCodeRepo(UpdateRepoSourceCodeRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRepoSourceCodeRepoWithOptions(request, runtime);
    }

    public UpdateRepoTriggerResponse updateRepoTriggerWithOptions(UpdateRepoTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRepoTrigger", "2018-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRepoTriggerResponse());
    }

    public UpdateRepoTriggerResponse updateRepoTrigger(UpdateRepoTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRepoTriggerWithOptions(request, runtime);
    }
}

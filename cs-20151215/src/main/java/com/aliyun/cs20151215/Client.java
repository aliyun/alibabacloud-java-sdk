// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215;

import com.aliyun.tea.*;
import com.aliyun.cs20151215.models.*;

public class Client extends com.aliyun.tearoa.Client {
    public Client(com.aliyun.tearoa.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cs.aliyuncs.com"),
            new TeaPair("cn-fujian", "cs.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cs.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "cs.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cs.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "cs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cs.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cs.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cs.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cs.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpointHost = this.getEndpoint("cs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
    }


    public DeleteKubernetesTriggerResponse deleteKubernetesTriggerWithOptions(String id, DeleteKubernetesTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "DELETE", "AK", "/triggers/revoke/" + id + "", null, request.headers, null, runtime), new DeleteKubernetesTriggerResponse());
    }

    public DeleteKubernetesTriggerResponse deleteKubernetesTrigger(String id, DeleteKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKubernetesTriggerWithOptions(id, request, runtime);
    }

    public CreateKubernetesTriggerResponse createKubernetesTriggerWithOptions(CreateKubernetesTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/triggers", null, request.headers, TeaModel.buildMap(request.body), runtime), new CreateKubernetesTriggerResponse());
    }

    public CreateKubernetesTriggerResponse createKubernetesTrigger(CreateKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKubernetesTriggerWithOptions(request, runtime);
    }

    public GetKubernetesTriggerResponse getKubernetesTriggerWithOptions(String clusterId, GetKubernetesTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/triggers/" + clusterId + "", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new GetKubernetesTriggerResponse());
    }

    public GetKubernetesTriggerResponse getKubernetesTrigger(String clusterId, GetKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKubernetesTriggerWithOptions(clusterId, request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/tags", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ResumeComponentUpgradeResponse resumeComponentUpgradeWithOptions(String clusterid, String componentid, ResumeComponentUpgradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterid + "/components/" + componentid + "/resume", null, request.headers, null, runtime), new ResumeComponentUpgradeResponse());
    }

    public ResumeComponentUpgradeResponse resumeComponentUpgrade(String clusterid, String componentid, ResumeComponentUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeComponentUpgradeWithOptions(clusterid, componentid, request, runtime);
    }

    public PauseComponentUpgradeResponse pauseComponentUpgradeWithOptions(String clusterid, String componentid, PauseComponentUpgradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterid + "/components/" + componentid + "/pause", null, request.headers, null, runtime), new PauseComponentUpgradeResponse());
    }

    public PauseComponentUpgradeResponse pauseComponentUpgrade(String clusterid, String componentid, PauseComponentUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseComponentUpgradeWithOptions(clusterid, componentid, request, runtime);
    }

    public CancelComponentUpgradeResponse cancelComponentUpgradeWithOptions(String clusterid, String componentid, CancelComponentUpgradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterid + "/components/" + componentid + "/cancel", null, request.headers, null, runtime), new CancelComponentUpgradeResponse());
    }

    public CancelComponentUpgradeResponse cancelComponentUpgrade(String clusterid, String componentid, CancelComponentUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelComponentUpgradeWithOptions(clusterid, componentid, request, runtime);
    }

    public CancelWorkflowResponse cancelWorkflowWithOptions(String workflowName, CancelWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "PUT", "AK", "/gs/workflow/" + workflowName + "", null, request.headers, null, runtime), new CancelWorkflowResponse());
    }

    public CancelWorkflowResponse cancelWorkflow(String workflowName, CancelWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelWorkflowWithOptions(workflowName, request, runtime);
    }

    public DescirbeWorkflowResponse descirbeWorkflowWithOptions(String workflowName, DescirbeWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/gs/workflow/" + workflowName + "", null, request.headers, null, runtime), new DescirbeWorkflowResponse());
    }

    public DescirbeWorkflowResponse descirbeWorkflow(String workflowName, DescirbeWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.descirbeWorkflowWithOptions(workflowName, request, runtime);
    }

    public RemoveWorkflowResponse removeWorkflowWithOptions(String workflowName, RemoveWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "DELETE", "AK", "/gs/workflow/" + workflowName + "", null, request.headers, null, runtime), new RemoveWorkflowResponse());
    }

    public RemoveWorkflowResponse removeWorkflow(String workflowName, RemoveWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeWorkflowWithOptions(workflowName, request, runtime);
    }

    public DescribeWorkflowsResponse describeWorkflowsWithOptions(DescribeWorkflowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/gs/workflows", null, request.headers, null, runtime), new DescribeWorkflowsResponse());
    }

    public DescribeWorkflowsResponse describeWorkflows(DescribeWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWorkflowsWithOptions(request, runtime);
    }

    public StartWorkflowResponse startWorkflowWithOptions(StartWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/gs/workflow", null, request.headers, null, runtime), new StartWorkflowResponse());
    }

    public StartWorkflowResponse startWorkflow(StartWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startWorkflowWithOptions(request, runtime);
    }

    public UnInstallClusterAddonsResponse unInstallClusterAddonsWithOptions(String clusterId, UnInstallClusterAddonsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/components/uninstall", null, request.headers, TeaModel.buildMap(request.body), runtime), new UnInstallClusterAddonsResponse());
    }

    public UnInstallClusterAddonsResponse unInstallClusterAddons(String clusterId, UnInstallClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unInstallClusterAddonsWithOptions(clusterId, request, runtime);
    }

    public DescribeAddonsResponse describeAddonsWithOptions(DescribeAddonsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/clusters/components/metadata", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeAddonsResponse());
    }

    public DescribeAddonsResponse describeAddons(DescribeAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAddonsWithOptions(request, runtime);
    }

    public UpdateK8sClusterUserConfigExpireResponse updateK8sClusterUserConfigExpireWithOptions(String clusterId, UpdateK8sClusterUserConfigExpireRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/k8s/" + clusterId + "/user_config/expire", null, request.headers, null, runtime), new UpdateK8sClusterUserConfigExpireResponse());
    }

    public UpdateK8sClusterUserConfigExpireResponse updateK8sClusterUserConfigExpire(String clusterId, UpdateK8sClusterUserConfigExpireRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateK8sClusterUserConfigExpireWithOptions(clusterId, request, runtime);
    }

    public CancelClusterUpgradeResponse cancelClusterUpgradeWithOptions(String clusterId, CancelClusterUpgradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + clusterId + "/upgrade/cancel", null, request.headers, null, runtime), new CancelClusterUpgradeResponse());
    }

    public CancelClusterUpgradeResponse cancelClusterUpgrade(String clusterId, CancelClusterUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelClusterUpgradeWithOptions(clusterId, request, runtime);
    }

    public DescribeUserQuotaResponse describeUserQuotaWithOptions(DescribeUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/quota", null, request.headers, null, runtime), new DescribeUserQuotaResponse());
    }

    public DescribeUserQuotaResponse describeUserQuota(DescribeUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserQuotaWithOptions(request, runtime);
    }

    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfigWithOptions(String clusterId, DescribeClusterV2UserKubeconfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/api/v2/k8s/" + clusterId + "/user_config", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeClusterV2UserKubeconfigResponse());
    }

    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfig(String clusterId, DescribeClusterV2UserKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterV2UserKubeconfigWithOptions(clusterId, request, runtime);
    }

    public RemoveClusterNodesResponse removeClusterNodesWithOptions(String clusterId, RemoveClusterNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + clusterId + "/nodes/remove", null, request.headers, TeaModel.buildMap(request.body), runtime), new RemoveClusterNodesResponse());
    }

    public RemoveClusterNodesResponse removeClusterNodes(String clusterId, RemoveClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeClusterNodesWithOptions(clusterId, request, runtime);
    }

    public UpgradeClusterResponse upgradeClusterWithOptions(String clusterId, UpgradeClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + clusterId + "/upgrade", null, request.headers, TeaModel.buildMap(request.body), runtime), new UpgradeClusterResponse());
    }

    public UpgradeClusterResponse upgradeCluster(String clusterId, UpgradeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeClusterWithOptions(clusterId, request, runtime);
    }

    public PauseClusterUpgradeResponse pauseClusterUpgradeWithOptions(String clusterId, PauseClusterUpgradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + clusterId + "/upgrade/pause", null, request.headers, null, runtime), new PauseClusterUpgradeResponse());
    }

    public PauseClusterUpgradeResponse pauseClusterUpgrade(String clusterId, PauseClusterUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseClusterUpgradeWithOptions(clusterId, request, runtime);
    }

    public ResumeUpgradeClusterResponse resumeUpgradeClusterWithOptions(String clusterId, ResumeUpgradeClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + clusterId + "/upgrade/resume", null, request.headers, null, runtime), new ResumeUpgradeClusterResponse());
    }

    public ResumeUpgradeClusterResponse resumeUpgradeCluster(String clusterId, ResumeUpgradeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeUpgradeClusterWithOptions(clusterId, request, runtime);
    }

    public GetUpgradeStatusResponse getUpgradeStatusWithOptions(String clusterId, GetUpgradeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/api/v2/clusters/" + clusterId + "/upgrade/status", null, request.headers, null, runtime), new GetUpgradeStatusResponse());
    }

    public GetUpgradeStatusResponse getUpgradeStatus(String clusterId, GetUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUpgradeStatusWithOptions(clusterId, request, runtime);
    }

    public ModifyClusterResponse modifyClusterWithOptions(String clusterId, ModifyClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "PUT", "AK", "/api/v2/clusters/" + clusterId + "", null, request.headers, TeaModel.buildMap(request.body), runtime), new ModifyClusterResponse());
    }

    public ModifyClusterResponse modifyCluster(String clusterId, ModifyClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClusterWithOptions(clusterId, request, runtime);
    }

    public InstallClusterAddonsResponse installClusterAddonsWithOptions(String clusterId, InstallClusterAddonsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/components/install", null, request.headers, TeaModel.buildMap(request.body), runtime), new InstallClusterAddonsResponse());
    }

    public InstallClusterAddonsResponse installClusterAddons(String clusterId, InstallClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installClusterAddonsWithOptions(clusterId, request, runtime);
    }

    public ModifyClusterTagsResponse modifyClusterTagsWithOptions(String clusterId, ModifyClusterTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/tags", null, request.headers, TeaModel.buildMap(request.body), runtime), new ModifyClusterTagsResponse());
    }

    public ModifyClusterTagsResponse modifyClusterTags(String clusterId, ModifyClusterTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClusterTagsWithOptions(clusterId, request, runtime);
    }

    public DescribeExternalAgentResponse describeExternalAgentWithOptions(String clusterId, DescribeExternalAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/k8s/" + clusterId + "/external/agent/deployment", null, request.headers, null, runtime), new DescribeExternalAgentResponse());
    }

    public DescribeExternalAgentResponse describeExternalAgent(String clusterId, DescribeExternalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExternalAgentWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterAttachScriptsResponse describeClusterAttachScriptsWithOptions(String clusterId, DescribeClusterAttachScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/attachscript", null, request.headers, null, runtime), new DescribeClusterAttachScriptsResponse());
    }

    public DescribeClusterAttachScriptsResponse describeClusterAttachScripts(String clusterId, DescribeClusterAttachScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterAttachScriptsWithOptions(clusterId, request, runtime);
    }

    public ScaleOutClusterResponse scaleOutClusterWithOptions(String clusterId, ScaleOutClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + clusterId + "", null, request.headers, TeaModel.buildMap(request.body), runtime), new ScaleOutClusterResponse());
    }

    public ScaleOutClusterResponse scaleOutCluster(String clusterId, ScaleOutClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scaleOutClusterWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterResourcesResponse describeClusterResourcesWithOptions(String clusterId, DescribeClusterResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/resources", null, request.headers, null, runtime), new DescribeClusterResourcesResponse());
    }

    public DescribeClusterResourcesResponse describeClusterResources(String clusterId, DescribeClusterResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterResourcesWithOptions(clusterId, request, runtime);
    }

    public UpgradeClusterAddonsResponse upgradeClusterAddonsWithOptions(String clusterId, UpgradeClusterAddonsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/components/upgrade", null, request.headers, TeaModel.buildMap(request.body), runtime), new UpgradeClusterAddonsResponse());
    }

    public UpgradeClusterAddonsResponse upgradeClusterAddons(String clusterId, UpgradeClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeClusterAddonsWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersionWithOptions(String clusterId, DescribeClusterAddonsVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/components/version", null, request.headers, null, runtime), new DescribeClusterAddonsVersionResponse());
    }

    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersion(String clusterId, DescribeClusterAddonsVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterAddonsVersionWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatusWithOptions(String clusterId, String componentId, DescribeClusterAddonUpgradeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/components/" + componentId + "/upgradestatus", null, request.headers, null, runtime), new DescribeClusterAddonUpgradeStatusResponse());
    }

    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatus(String clusterId, String componentId, DescribeClusterAddonUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterAddonUpgradeStatusWithOptions(clusterId, componentId, request, runtime);
    }

    public DeleteClusterNodesResponse deleteClusterNodesWithOptions(String clusterId, DeleteClusterNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/nodes", null, request.headers, TeaModel.buildMap(request.body), runtime), new DeleteClusterNodesResponse());
    }

    public DeleteClusterNodesResponse deleteClusterNodes(String clusterId, DeleteClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterNodesWithOptions(clusterId, request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(String templateId, DeleteTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "DELETE", "AK", "/templates/" + templateId + "", null, request.headers, null, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(String templateId, DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(templateId, request, runtime);
    }

    public DescribeClusterUserKubeconfigResponse describeClusterUserKubeconfigWithOptions(String clusterId, DescribeClusterUserKubeconfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/k8s/" + clusterId + "/user_config", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeClusterUserKubeconfigResponse());
    }

    public DescribeClusterUserKubeconfigResponse describeClusterUserKubeconfig(String clusterId, DescribeClusterUserKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterUserKubeconfigWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterNodesResponse describeClusterNodesWithOptions(String clusterId, DescribeClusterNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/nodes", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeClusterNodesResponse());
    }

    public DescribeClusterNodesResponse describeClusterNodes(String clusterId, DescribeClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterNodesWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterLogsResponse describeClusterLogsWithOptions(String clusterId, DescribeClusterLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/logs", null, request.headers, null, runtime), new DescribeClusterLogsResponse());
    }

    public DescribeClusterLogsResponse describeClusterLogs(String clusterId, DescribeClusterLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterLogsWithOptions(clusterId, request, runtime);
    }

    public AttachInstancesResponse attachInstancesWithOptions(String clusterId, AttachInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/attach", null, request.headers, TeaModel.buildMap(request.body), runtime), new AttachInstancesResponse());
    }

    public AttachInstancesResponse attachInstances(String clusterId, AttachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachInstancesWithOptions(clusterId, request, runtime);
    }

    public DescribeTemplatesResponse describeTemplatesWithOptions(DescribeTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/templates", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeTemplatesResponse());
    }

    public DescribeTemplatesResponse describeTemplates(DescribeTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplatesWithOptions(request, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/templates", null, request.headers, TeaModel.buildMap(request.body), runtime), new CreateTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "POST", "AK", "/clusters", null, request.headers, TeaModel.buildMap(request.body), runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public ScaleClusterResponse scaleClusterWithOptions(String clusterId, ScaleClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "PUT", "AK", "/clusters/" + clusterId + "", null, request.headers, null, runtime), new ScaleClusterResponse());
    }

    public ScaleClusterResponse scaleCluster(String clusterId, ScaleClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scaleClusterWithOptions(clusterId, request, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/clusters", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeClustersResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClustersWithOptions(request, runtime);
    }

    public DescribeClusterDetailResponse describeClusterDetailWithOptions(String clusterId, DescribeClusterDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "", null, request.headers, null, runtime), new DescribeClusterDetailResponse());
    }

    public DescribeClusterDetailResponse describeClusterDetail(String clusterId, DescribeClusterDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterDetailWithOptions(clusterId, request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(String clusterId, DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "DELETE", "AK", "/clusters/" + clusterId + "", null, request.headers, null, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(String clusterId, DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(clusterId, request, runtime);
    }

    public DescribeApiVersionResponse describeApiVersionWithOptions(DescribeApiVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-12-15", "HTTPS", "GET", "AK", "/version", null, request.headers, null, runtime), new DescribeApiVersionResponse());
    }

    public DescribeApiVersionResponse describeApiVersion(DescribeApiVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiVersionWithOptions(request, runtime);
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418;

import com.aliyun.tea.*;
import com.aliyun.cs20180418.models.*;

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


    public GetProjectEventsResponse getProjectEventsWithOptions(String clusterId, String projectId, GetProjectEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("GetProjectEvents", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/projects/" + projectId + "/events", null, request.headers, null, runtime), new GetProjectEventsResponse());
    }

    public GetProjectEventsResponse getProjectEvents(String clusterId, String projectId, GetProjectEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectEventsWithOptions(clusterId, projectId, request, runtime);
    }

    public DescribeKubernetesTemplateResponse describeKubernetesTemplateWithOptions(String clusterId, DescribeKubernetesTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeKubernetesTemplate", "2018-04-18", "HTTPS", "GET", "AK", "/k8s/templates/" + clusterId + "", null, request.headers, null, runtime), new DescribeKubernetesTemplateResponse());
    }

    public DescribeKubernetesTemplateResponse describeKubernetesTemplate(String clusterId, DescribeKubernetesTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKubernetesTemplateWithOptions(clusterId, request, runtime);
    }

    public DescribeAgilityTunnelCertsResponse describeAgilityTunnelCertsWithOptions(String token, DescribeAgilityTunnelCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeAgilityTunnelCerts", "2018-04-18", "HTTPS", "GET", "Anonymous", "/agility/" + token + "/agent_certs", null, request.headers, null, runtime), new DescribeAgilityTunnelCertsResponse());
    }

    public DescribeAgilityTunnelCertsResponse describeAgilityTunnelCerts(String token, DescribeAgilityTunnelCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgilityTunnelCertsWithOptions(token, request, runtime);
    }

    public DescribeClusterTokensResponse describeClusterTokensWithOptions(String clusterId, DescribeClusterTokensRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterTokens", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/tokens", null, request.headers, null, runtime), new DescribeClusterTokensResponse());
    }

    public DescribeClusterTokensResponse describeClusterTokens(String clusterId, DescribeClusterTokensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterTokensWithOptions(clusterId, request, runtime);
    }

    public DownloadClusterNodeCertsResponse downloadClusterNodeCertsWithOptions(String token, String nodeId, DownloadClusterNodeCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DownloadClusterNodeCerts", "2018-04-18", "HTTPS", "GET", "Anonymous", "/token/" + token + "/nodes/" + nodeId + "/certs", null, request.headers, null, runtime), new DownloadClusterNodeCertsResponse());
    }

    public DownloadClusterNodeCertsResponse downloadClusterNodeCerts(String token, String nodeId, DownloadClusterNodeCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadClusterNodeCertsWithOptions(token, nodeId, request, runtime);
    }

    public DescribeServiceContainersResponse describeServiceContainersWithOptions(String clusterId, String serviceId, DescribeServiceContainersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeServiceContainers", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/services/" + serviceId + "/containers", null, request.headers, null, runtime), new DescribeServiceContainersResponse());
    }

    public DescribeServiceContainersResponse describeServiceContainers(String clusterId, String serviceId, DescribeServiceContainersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceContainersWithOptions(clusterId, serviceId, request, runtime);
    }

    public GatherLogsTokenResponse gatherLogsTokenWithOptions(String token, GatherLogsTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("GatherLogsToken", "2018-04-18", "HTTPS", "POST", "Anonymous", "/token/" + token + "/gather_logs", null, request.headers, null, runtime), new GatherLogsTokenResponse());
    }

    public GatherLogsTokenResponse gatherLogsToken(String token, GatherLogsTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.gatherLogsTokenWithOptions(token, request, runtime);
    }

    public GetClusterProjectsResponse getClusterProjectsWithOptions(String clusterId, GetClusterProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("GetClusterProjects", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/projects", null, request.headers, null, runtime), new GetClusterProjectsResponse());
    }

    public GetClusterProjectsResponse getClusterProjects(String clusterId, GetClusterProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterProjectsWithOptions(clusterId, request, runtime);
    }

    public DescribeApiVersionResponse describeApiVersionWithOptions(DescribeApiVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeApiVersion", "2018-04-18", "HTTPS", "GET", "AK", "/version", null, request.headers, null, runtime), new DescribeApiVersionResponse());
    }

    public DescribeApiVersionResponse describeApiVersion(DescribeApiVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiVersionWithOptions(request, runtime);
    }

    public DescribeTaskInfoResponse describeTaskInfoWithOptions(String taskId, DescribeTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeTaskInfo", "2018-04-18", "HTTPS", "GET", "AK", "/tasks/" + taskId + "", null, request.headers, null, runtime), new DescribeTaskInfoResponse());
    }

    public DescribeTaskInfoResponse describeTaskInfo(String taskId, DescribeTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskInfoWithOptions(taskId, request, runtime);
    }

    public DescribeClusterNodesResponse describeClusterNodesWithOptions(String clusterId, DescribeClusterNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterNodes", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/nodes", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeClusterNodesResponse());
    }

    public DescribeClusterNodesResponse describeClusterNodes(String clusterId, DescribeClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterNodesWithOptions(clusterId, request, runtime);
    }

    public DescribeAgilityTunnelAgentInfoResponse describeAgilityTunnelAgentInfoWithOptions(String token, DescribeAgilityTunnelAgentInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeAgilityTunnelAgentInfo", "2018-04-18", "HTTPS", "GET", "Anonymous", "/agility/" + token + "/agent_info", null, request.headers, null, runtime), new DescribeAgilityTunnelAgentInfoResponse());
    }

    public DescribeAgilityTunnelAgentInfoResponse describeAgilityTunnelAgentInfo(String token, DescribeAgilityTunnelAgentInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgilityTunnelAgentInfoWithOptions(token, request, runtime);
    }

    public DeleteClusterNodeResponse deleteClusterNodeWithOptions(String clusterId, String ip, DeleteClusterNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteClusterNode", "2018-04-18", "HTTPS", "DELETE", "AK", "/clusters/" + clusterId + "/ip/" + ip + "", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DeleteClusterNodeResponse());
    }

    public DeleteClusterNodeResponse deleteClusterNode(String clusterId, String ip, DeleteClusterNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterNodeWithOptions(clusterId, ip, request, runtime);
    }

    public DescribeClusterNodeInfoWithInstanceResponse describeClusterNodeInfoWithInstanceWithOptions(String token, String instanceId, DescribeClusterNodeInfoWithInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterNodeInfoWithInstance", "2018-04-18", "HTTPS", "GET", "Anonymous", "/token/" + token + "/instance/" + instanceId + "/node_info", null, request.headers, null, runtime), new DescribeClusterNodeInfoWithInstanceResponse());
    }

    public DescribeClusterNodeInfoWithInstanceResponse describeClusterNodeInfoWithInstance(String token, String instanceId, DescribeClusterNodeInfoWithInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterNodeInfoWithInstanceWithOptions(token, instanceId, request, runtime);
    }

    public DescribeUserContainersResponse describeUserContainersWithOptions(String regionId, DescribeUserContainersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeUserContainers", "2018-04-18", "HTTPS", "GET", "AK", "/region/" + regionId + "/containers", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeUserContainersResponse());
    }

    public DescribeUserContainersResponse describeUserContainers(String regionId, DescribeUserContainersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserContainersWithOptions(regionId, request, runtime);
    }

    public CreateClusterTokenResponse createClusterTokenWithOptions(String clusterId, CreateClusterTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CreateClusterToken", "2018-04-18", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/token", null, request.headers, null, runtime), new CreateClusterTokenResponse());
    }

    public CreateClusterTokenResponse createClusterToken(String clusterId, CreateClusterTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterTokenWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterHostsResponse describeClusterHostsWithOptions(String clusterId, DescribeClusterHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterHosts", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/hosts", null, request.headers, null, runtime), new DescribeClusterHostsResponse());
    }

    public DescribeClusterHostsResponse describeClusterHosts(String clusterId, DescribeClusterHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterHostsWithOptions(clusterId, request, runtime);
    }

    public DescribeKubernetesTemplatesResponse describeKubernetesTemplatesWithOptions(DescribeKubernetesTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeKubernetesTemplates", "2018-04-18", "HTTPS", "GET", "AK", "/k8s/templates", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeKubernetesTemplatesResponse());
    }

    public DescribeKubernetesTemplatesResponse describeKubernetesTemplates(DescribeKubernetesTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKubernetesTemplatesWithOptions(request, runtime);
    }

    public DescribeTemplatesResponse describeTemplatesWithOptions(DescribeTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeTemplates", "2018-04-18", "HTTPS", "GET", "AK", "/templates", null, request.headers, null, runtime), new DescribeTemplatesResponse());
    }

    public DescribeTemplatesResponse describeTemplates(DescribeTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplatesWithOptions(request, runtime);
    }

    public DescribeClusterScaledNodeResponse describeClusterScaledNodeWithOptions(String clusterId, DescribeClusterScaledNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterScaledNode", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/scaled_nodes/", null, request.headers, null, runtime), new DescribeClusterScaledNodeResponse());
    }

    public DescribeClusterScaledNodeResponse describeClusterScaledNode(String clusterId, DescribeClusterScaledNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterScaledNodeWithOptions(clusterId, request, runtime);
    }

    public CallbackClusterTokenResponse callbackClusterTokenWithOptions(String token, String reqOnce, CallbackClusterTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CallbackClusterToken", "2018-04-18", "HTTPS", "POST", "Anonymous", "/token/" + token + "/req_once/" + reqOnce + "/callback", null, request.headers, null, runtime), new CallbackClusterTokenResponse());
    }

    public CallbackClusterTokenResponse callbackClusterToken(String token, String reqOnce, CallbackClusterTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.callbackClusterTokenWithOptions(token, reqOnce, request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeImages", "2018-04-18", "HTTPS", "GET", "AK", "/images", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeClusterLogsResponse describeClusterLogsWithOptions(String clusterId, DescribeClusterLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterLogs", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/logs", null, request.headers, null, runtime), new DescribeClusterLogsResponse());
    }

    public DescribeClusterLogsResponse describeClusterLogs(String clusterId, DescribeClusterLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterLogsWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterServicesResponse describeClusterServicesWithOptions(String clusterId, DescribeClusterServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterServices", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/services", null, request.headers, null, runtime), new DescribeClusterServicesResponse());
    }

    public DescribeClusterServicesResponse describeClusterServices(String clusterId, DescribeClusterServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterServicesWithOptions(clusterId, request, runtime);
    }

    public GetTriggerHookResponse getTriggerHookWithOptions(String clusterId, String projectId, GetTriggerHookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("GetTriggerHook", "2018-04-18", "HTTPS", "GET", "AK", "/hook/trigger/" + clusterId + "/" + projectId + "", null, request.headers, null, runtime), new GetTriggerHookResponse());
    }

    public GetTriggerHookResponse getTriggerHook(String clusterId, String projectId, GetTriggerHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTriggerHookWithOptions(clusterId, projectId, request, runtime);
    }

    public DescribeTemplateAttributeResponse describeTemplateAttributeWithOptions(String templateId, DescribeTemplateAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeTemplateAttribute", "2018-04-18", "HTTPS", "GET", "AK", "/templates/" + templateId + "", null, request.headers, null, runtime), new DescribeTemplateAttributeResponse());
    }

    public DescribeTemplateAttributeResponse describeTemplateAttribute(String templateId, DescribeTemplateAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateAttributeWithOptions(templateId, request, runtime);
    }

    public DescribeClusterCertsResponse describeClusterCertsWithOptions(String clusterId, DescribeClusterCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterCerts", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/certs", null, request.headers, null, runtime), new DescribeClusterCertsResponse());
    }

    public DescribeClusterCertsResponse describeClusterCerts(String clusterId, DescribeClusterCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterCertsWithOptions(clusterId, request, runtime);
    }

    public DescribeClusterNodeInfoResponse describeClusterNodeInfoWithOptions(String token, DescribeClusterNodeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterNodeInfo", "2018-04-18", "HTTPS", "GET", "Anonymous", "/token/" + token + "/node_info", null, request.headers, null, runtime), new DescribeClusterNodeInfoResponse());
    }

    public DescribeClusterNodeInfoResponse describeClusterNodeInfo(String token, DescribeClusterNodeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterNodeInfoWithOptions(token, request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(String clusterId, DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteCluster", "2018-04-18", "HTTPS", "DELETE", "AK", "/clusters/" + clusterId + "", null, request.headers, null, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(String clusterId, DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(clusterId, request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CreateCluster", "2018-04-18", "HTTPS", "POST", "AK", "/clusters", null, request.headers, null, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public DescribeClusterDetailResponse describeClusterDetailWithOptions(String clusterId, DescribeClusterDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusterDetail", "2018-04-18", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "", null, request.headers, null, runtime), new DescribeClusterDetailResponse());
    }

    public DescribeClusterDetailResponse describeClusterDetail(String clusterId, DescribeClusterDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterDetailWithOptions(clusterId, request, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeClusters", "2018-04-18", "HTTPS", "GET", "AK", "/clusters", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeClustersResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClustersWithOptions(request, runtime);
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

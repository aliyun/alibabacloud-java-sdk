// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215;

import com.aliyun.tea.*;
import com.aliyun.cs20151215.models.*;

public class Client extends com.aliyun.teaopenapi.Client {
    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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
        this._endpoint = this.getEndpoint("cs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AttachInstancesResponse attachInstances(String ClusterId, AttachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachInstancesWithOptions(ClusterId, request, headers, runtime);
    }

    public AttachInstancesResponse attachInstancesWithOptions(String ClusterId, AttachInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("instances", request.instances);
        body.put("runtime", request.runtime);
        body.put("image_id", request.imageId);
        body.put("format_disk", request.formatDisk);
        body.put("keep_instance_name", request.keepInstanceName);
        body.put("cpu_policy", request.cpuPolicy);
        body.put("key_pair", request.keyPair);
        body.put("password", request.password);
        body.put("is_edge_worker", request.isEdgeWorker);
        body.put("user_data", request.userData);
        body.put("nodepool_id", request.nodepoolId);
        body.put("rds_instances", request.rdsInstances);
        body.put("tags", request.tags);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("AttachInstances", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/attach", "json", req, runtime), new AttachInstancesResponse());
    }

    public CancelClusterUpgradeResponse cancelClusterUpgrade(String ClusterId, CancelClusterUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelClusterUpgradeWithOptions(ClusterId, request, headers, runtime);
    }

    public CancelClusterUpgradeResponse cancelClusterUpgradeWithOptions(String ClusterId, CancelClusterUpgradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CancelClusterUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "/upgrade/cancel", "none", req, runtime), new CancelClusterUpgradeResponse());
    }

    public CancelComponentUpgradeResponse cancelComponentUpgrade(String clusterid, String componentid, CancelComponentUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelComponentUpgradeWithOptions(clusterid, componentid, request, headers, runtime);
    }

    public CancelComponentUpgradeResponse cancelComponentUpgradeWithOptions(String clusterid, String componentid, CancelComponentUpgradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CancelComponentUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterid + "/components/{componentid}/cancel", "none", req, runtime), new CancelComponentUpgradeResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterWithOptions(request, headers, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("name", request.name);
        body.put("cluster_type", request.clusterType);
        body.put("region_id", request.regionId);
        body.put("zone_id", request.zoneId);
        body.put("kubernetes_version", request.kubernetesVersion);
        body.put("deletion_protection", request.deletionProtection);
        body.put("runtime", request.runtime);
        body.put("vpcid", request.vpcid);
        body.put("worker_vswitch_ids", request.workerVswitchIds);
        body.put("container_cidr", request.containerCidr);
        body.put("service_cidr", request.serviceCidr);
        body.put("node_cidr_mask", request.nodeCidrMask);
        body.put("snat_entry", request.snatEntry);
        body.put("endpoint_public_access", request.endpointPublicAccess);
        body.put("ssh_flags", request.sshFlags);
        body.put("rds_instances", request.rdsInstances);
        body.put("security_group_id", request.securityGroupId);
        body.put("is_enterprise_security_group", request.isEnterpriseSecurityGroup);
        body.put("proxy_mode", request.proxyMode);
        body.put("tags", request.tags);
        body.put("images_id", request.imagesId);
        body.put("master_instance_charge_type", request.masterInstanceChargeType);
        body.put("master_period", request.masterPeriod);
        body.put("master_period_unit", request.masterPeriodUnit);
        body.put("master_auto_renew", request.masterAutoRenew);
        body.put("master_auto_renew_period", request.masterAutoRenewPeriod);
        body.put("master_count", request.masterCount);
        body.put("master_vswitch_ids", request.masterVswitchIds);
        body.put("master_instance_types", request.masterInstanceTypes);
        body.put("master_system_disk_category", request.masterSystemDiskCategory);
        body.put("master_system_disk_size", request.masterSystemDiskSize);
        body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        body.put("worker_period", request.workerPeriod);
        body.put("worker_period_unit", request.workerPeriodUnit);
        body.put("worker_auto_renew", request.workerAutoRenew);
        body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        body.put("num_of_nodes", request.numOfNodes);
        body.put("worker_instance_types", request.workerInstanceTypes);
        body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        body.put("worker_system_disk_size", request.workerSystemDiskSize);
        body.put("worker_data_disks", request.workerDataDisks);
        body.put("os_type", request.osType);
        body.put("key_pair", request.keyPair);
        body.put("login_password", request.loginPassword);
        body.put("user_data", request.userData);
        body.put("node_port_range", request.nodePortRange);
        body.put("cpu_policy", request.cpuPolicy);
        body.put("taints", request.taints);
        body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        body.put("addons", request.addons);
        body.put("platform", request.platform);
        body.put("vswitch_ids", request.vswitchIds);
        body.put("private_zone", request.privateZone);
        body.put("profile", request.profile);
        body.put("pod_vswitch_ids", request.podVswitchIds);
        body.put("disable_rollback", request.disableRollback);
        body.put("timeout_mins", request.timeoutMins);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateCluster", "2015-12-15", "HTTPS", "POST", "AK", "/clusters", "json", req, runtime), new CreateClusterResponse());
    }

    public CreateKubernetesTriggerResponse createKubernetesTrigger(CreateKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKubernetesTriggerWithOptions(request, headers, runtime);
    }

    public CreateKubernetesTriggerResponse createKubernetesTriggerWithOptions(CreateKubernetesTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("RegionId", request.regionId);
        body.put("ClusterId", request.clusterId);
        body.put("ProjectId", request.projectId);
        body.put("Type", request.type);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateKubernetesTrigger", "2015-12-15", "HTTPS", "POST", "AK", "/triggers", "json", req, runtime), new CreateKubernetesTriggerResponse());
    }

    public DeleteClusterResponse deleteCluster(String ClusterId, DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(String ClusterId, DeleteClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("retain_resources", request.retainResources);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteCluster", "2015-12-15", "HTTPS", "DELETE", "AK", "/clusters/" + ClusterId + "", "none", req, runtime), new DeleteClusterResponse());
    }

    public DeleteKubernetesTriggerResponse deleteKubernetesTrigger(String Id, DeleteKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKubernetesTriggerWithOptions(Id, request, headers, runtime);
    }

    public DeleteKubernetesTriggerResponse deleteKubernetesTriggerWithOptions(String Id, DeleteKubernetesTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteKubernetesTrigger", "2015-12-15", "HTTPS", "DELETE", "AK", "/triggers/revoke/" + Id + "", "none", req, runtime), new DeleteKubernetesTriggerResponse());
    }

    public DescribeAddonsResponse describeAddons(DescribeAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAddonsWithOptions(request, headers, runtime);
    }

    public DescribeAddonsResponse describeAddonsWithOptions(DescribeAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("region", request.region);
        query.put("cluster_type", request.clusterType);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAddons", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/components/metadata", "json", req, runtime), new DescribeAddonsResponse());
    }

    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatus(String ClusterId, String ComponentId, DescribeClusterAddonUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonUpgradeStatusWithOptions(ClusterId, ComponentId, request, headers, runtime);
    }

    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatusWithOptions(String ClusterId, String ComponentId, DescribeClusterAddonUpgradeStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterAddonUpgradeStatus", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/components/{ComponentId}/upgradestatus", "json", req, runtime), new DescribeClusterAddonUpgradeStatusResponse());
    }

    /**
     * 批量查询集群Addon升级状态
    
     */
    public DescribeClusterAddonsUpgradeStatusResponse describeClusterAddonsUpgradeStatus(String ClusterId, DescribeClusterAddonsUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonsUpgradeStatusWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterAddonsUpgradeStatusResponse describeClusterAddonsUpgradeStatusWithOptions(String ClusterId, DescribeClusterAddonsUpgradeStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("componentIds", request.componentIds);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterAddonsUpgradeStatus", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/[ClusterId]/components/upgradestatus", "none", req, runtime), new DescribeClusterAddonsUpgradeStatusResponse());
    }

    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersion(String ClusterId, DescribeClusterAddonsVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonsVersionWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersionWithOptions(String ClusterId, DescribeClusterAddonsVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterAddonsVersion", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/components/version", "json", req, runtime), new DescribeClusterAddonsVersionResponse());
    }

    public DescribeClusterAttachScriptsResponse describeClusterAttachScripts(String ClusterId, DescribeClusterAttachScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAttachScriptsWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterAttachScriptsResponse describeClusterAttachScriptsWithOptions(String ClusterId, DescribeClusterAttachScriptsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("arch", request.arch);
        body.put("options", request.options);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("DescribeClusterAttachScripts", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/attachscript", "string", req, runtime), new DescribeClusterAttachScriptsResponse());
    }

    public DescribeClusterDetailResponse describeClusterDetail(String ClusterId, DescribeClusterDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterDetailWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterDetailResponse describeClusterDetailWithOptions(String ClusterId, DescribeClusterDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterDetail", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "", "json", req, runtime), new DescribeClusterDetailResponse());
    }

    public DescribeClusterLogsResponse describeClusterLogs(String ClusterId, DescribeClusterLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterLogsWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterLogsResponse describeClusterLogsWithOptions(String ClusterId, DescribeClusterLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterLogs", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/logs", "json", req, runtime), new DescribeClusterLogsResponse());
    }

    public DescribeClusterNodesResponse describeClusterNodes(String ClusterId, DescribeClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterNodesResponse describeClusterNodesWithOptions(String ClusterId, DescribeClusterNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("pageSize", request.pageSize);
        query.put("pageNumber", request.pageNumber);
        query.put("nodepool_id", request.nodepoolId);
        query.put("state", request.state);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterNodes", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/nodes", "json", req, runtime), new DescribeClusterNodesResponse());
    }

    public DescribeClusterResourcesResponse describeClusterResources(String ClusterId, DescribeClusterResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterResourcesWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterResourcesResponse describeClusterResourcesWithOptions(String ClusterId, DescribeClusterResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterResources", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/resources", "array", req, runtime), new DescribeClusterResourcesResponse());
    }

    public DescribeClusterUserKubeconfigResponse describeClusterUserKubeconfig(String ClusterId, DescribeClusterUserKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterUserKubeconfigWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterUserKubeconfigResponse describeClusterUserKubeconfigWithOptions(String ClusterId, DescribeClusterUserKubeconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PrivateIpAddress", request.privateIpAddress);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterUserKubeconfig", "2015-12-15", "HTTPS", "GET", "AK", "/k8s/" + ClusterId + "/user_config", "json", req, runtime), new DescribeClusterUserKubeconfigResponse());
    }

    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfig(String ClusterId, DescribeClusterV2UserKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterV2UserKubeconfigWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfigWithOptions(String ClusterId, DescribeClusterV2UserKubeconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PrivateIpAddress", request.privateIpAddress);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterV2UserKubeconfig", "2015-12-15", "HTTPS", "GET", "AK", "/api/v2/k8s/" + ClusterId + "/user_config", "json", req, runtime), new DescribeClusterV2UserKubeconfigResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClustersWithOptions(request, headers, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("name", request.name);
        query.put("clusterType", request.clusterType);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusters", "2015-12-15", "HTTPS", "GET", "AK", "/clusters", "array", req, runtime), new DescribeClustersResponse());
    }

    public DescribeClustersV1Response describeClustersV1(DescribeClustersV1Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClustersV1WithOptions(request, headers, runtime);
    }

    public DescribeClustersV1Response describeClustersV1WithOptions(DescribeClustersV1Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Name", request.name);
        query.put("ClusterType", request.clusterType);
        query.put("page_size", request.pageSize);
        query.put("page_number", request.pageNumber);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClustersV1", "2015-12-15", "HTTPS", "GET", "AK", "/api/v1/clusters", "json", req, runtime), new DescribeClustersV1Response());
    }

    public DescribeExternalAgentResponse describeExternalAgent(String ClusterId, DescribeExternalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExternalAgentWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeExternalAgentResponse describeExternalAgentWithOptions(String ClusterId, DescribeExternalAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeExternalAgent", "2015-12-15", "HTTPS", "GET", "AK", "/k8s/" + ClusterId + "/external/agent/deployment", "json", req, runtime), new DescribeExternalAgentResponse());
    }

    public DescribeTemplatesResponse describeTemplates(DescribeTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplatesWithOptions(request, headers, runtime);
    }

    public DescribeTemplatesResponse describeTemplatesWithOptions(DescribeTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("template_type", request.templateType);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeTemplates", "2015-12-15", "HTTPS", "GET", "AK", "/templates", "json", req, runtime), new DescribeTemplatesResponse());
    }

    public DescribeUserQuotaResponse describeUserQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserQuotaWithOptions(headers, runtime);
    }

    public DescribeUserQuotaResponse describeUserQuotaWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUserQuota", "2015-12-15", "HTTPS", "GET", "AK", "/quota", "json", req, runtime), new DescribeUserQuotaResponse());
    }

    public GetKubernetesTriggerResponse getKubernetesTrigger(String ClusterId, GetKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKubernetesTriggerWithOptions(ClusterId, request, headers, runtime);
    }

    public GetKubernetesTriggerResponse getKubernetesTriggerWithOptions(String ClusterId, GetKubernetesTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Namespace", request.namespace);
        query.put("Type", request.type);
        query.put("Name", request.name);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetKubernetesTrigger", "2015-12-15", "HTTPS", "GET", "AK", "/triggers/" + ClusterId + "", "json", req, runtime), new GetKubernetesTriggerResponse());
    }

    public GetUpgradeStatusResponse getUpgradeStatus(String ClusterId, GetUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUpgradeStatusWithOptions(ClusterId, request, headers, runtime);
    }

    public GetUpgradeStatusResponse getUpgradeStatusWithOptions(String ClusterId, GetUpgradeStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetUpgradeStatus", "2015-12-15", "HTTPS", "GET", "AK", "/api/v2/clusters/" + ClusterId + "/upgrade/status", "json", req, runtime), new GetUpgradeStatusResponse());
    }

    public InstallClusterAddonsResponse installClusterAddons(String ClusterId, InstallClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    public InstallClusterAddonsResponse installClusterAddonsWithOptions(String ClusterId, InstallClusterAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        return TeaModel.toModel(this.doROARequest("InstallClusterAddons", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/components/install", "none", req, runtime), new InstallClusterAddonsResponse());
    }

    public ModifyClusterResponse modifyCluster(String ClusterId, ModifyClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public ModifyClusterResponse modifyClusterWithOptions(String ClusterId, ModifyClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("deletion_protection", request.deletionProtection);
        body.put("ingress_loadbalancer_id", request.ingressLoadbalancerId);
        body.put("api_server_eip", request.apiServerEip);
        body.put("api_server_eip_id", request.apiServerEipId);
        body.put("resource_group_id", request.resourceGroupId);
        body.put("ingress_domain_rebinding", request.ingressDomainRebinding);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("ModifyCluster", "2015-12-15", "HTTPS", "PUT", "AK", "/api/v2/clusters/" + ClusterId + "", "json", req, runtime), new ModifyClusterResponse());
    }

    public ModifyClusterConfigurationResponse modifyClusterConfiguration(String ClusterId, ModifyClusterConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterConfigurationWithOptions(ClusterId, request, headers, runtime);
    }

    public ModifyClusterConfigurationResponse modifyClusterConfigurationWithOptions(String ClusterId, ModifyClusterConfigurationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("customize_config", request.customizeConfig);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("ModifyClusterConfiguration", "2015-12-15", "HTTPS", "PUT", "AK", "/clusters/" + ClusterId + "/configuration", "none", req, runtime), new ModifyClusterConfigurationResponse());
    }

    public ModifyClusterTagsResponse modifyClusterTags(String ClusterId, ModifyClusterTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterTagsWithOptions(ClusterId, request, headers, runtime);
    }

    public ModifyClusterTagsResponse modifyClusterTagsWithOptions(String ClusterId, ModifyClusterTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyClusterTags", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/tags", "none", req, runtime), new ModifyClusterTagsResponse());
    }

    public PauseComponentUpgradeResponse pauseComponentUpgrade(String clusterid, String componentid, PauseComponentUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseComponentUpgradeWithOptions(clusterid, componentid, request, headers, runtime);
    }

    public PauseComponentUpgradeResponse pauseComponentUpgradeWithOptions(String clusterid, String componentid, PauseComponentUpgradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PauseComponentUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterid + "/components/{componentid}/pause", "none", req, runtime), new PauseComponentUpgradeResponse());
    }

    public RemoveClusterNodesResponse removeClusterNodes(String ClusterId, RemoveClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    public RemoveClusterNodesResponse removeClusterNodesWithOptions(String ClusterId, RemoveClusterNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("release_node", request.releaseNode);
        body.put("drain_node", request.drainNode);
        body.put("nodes", request.nodes);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("RemoveClusterNodes", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "/nodes/remove", "none", req, runtime), new RemoveClusterNodesResponse());
    }

    public ResumeComponentUpgradeResponse resumeComponentUpgrade(String clusterid, String componentid, ResumeComponentUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeComponentUpgradeWithOptions(clusterid, componentid, request, headers, runtime);
    }

    public ResumeComponentUpgradeResponse resumeComponentUpgradeWithOptions(String clusterid, String componentid, ResumeComponentUpgradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ResumeComponentUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterid + "/components/{componentid}/resume", "none", req, runtime), new ResumeComponentUpgradeResponse());
    }

    public ScaleClusterResponse scaleCluster(String ClusterId, ScaleClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public ScaleClusterResponse scaleClusterWithOptions(String ClusterId, ScaleClusterRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScaleClusterShrinkRequest request = new ScaleClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taints)) {
            request.taintsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taints, "taints", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("count", request.count);
        body.put("key_pair", request.keyPair);
        body.put("login_password", request.loginPassword);
        body.put("worker_data_disk", request.workerDataDisk);
        body.put("worker_instance_types", request.workerInstanceTypes);
        body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        body.put("worker_period", request.workerPeriod);
        body.put("worker_period_unit", request.workerPeriodUnit);
        body.put("worker_auto_renew", request.workerAutoRenew);
        body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        body.put("worker_system_disk_size", request.workerSystemDiskSize);
        body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        body.put("cpu_policy", request.cpuPolicy);
        body.put("disable_rollback", request.disableRollback);
        body.put("vswitch_ids", request.vswitchIds);
        body.put("worker_data_disks", request.workerDataDisks);
        body.put("tags", request.tags);
        body.put("taints", request.taintsShrink);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("ScaleCluster", "2015-12-15", "HTTPS", "PUT", "AK", "/clusters/" + ClusterId + "", "json", req, runtime), new ScaleClusterResponse());
    }

    public ScaleOutClusterResponse scaleOutCluster(String ClusterId, ScaleOutClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleOutClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public ScaleOutClusterResponse scaleOutClusterWithOptions(String ClusterId, ScaleOutClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("count", request.count);
        body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        body.put("worker_period", request.workerPeriod);
        body.put("worker_period_unit", request.workerPeriodUnit);
        body.put("worker_auto_renew", request.workerAutoRenew);
        body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        body.put("worker_system_disk_size", request.workerSystemDiskSize);
        body.put("worker_data_disk", request.workerDataDisk);
        body.put("key_pair", request.keyPair);
        body.put("login_password", request.loginPassword);
        body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        body.put("cpu_policy", request.cpuPolicy);
        body.put("disable_rollback", request.disableRollback);
        body.put("image_id", request.imageId);
        body.put("user_data", request.userData);
        body.put("runtime", request.runtime);
        body.put("vswitch_ids", request.vswitchIds);
        body.put("worker_instance_types", request.workerInstanceTypes);
        body.put("rds_instances", request.rdsInstances);
        body.put("worker_data_disks", request.workerDataDisks);
        body.put("tags", request.tags);
        body.put("taints", request.taints);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("ScaleOutCluster", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "", "json", req, runtime), new ScaleOutClusterResponse());
    }

    public UnInstallClusterAddonsResponse unInstallClusterAddons(String ClusterId, UnInstallClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unInstallClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    public UnInstallClusterAddonsResponse unInstallClusterAddonsWithOptions(String ClusterId, UnInstallClusterAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("addons", request.addons);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UnInstallClusterAddons", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/components/uninstall", "none", req, runtime), new UnInstallClusterAddonsResponse());
    }

    public UpdateTemplateResponse updateTemplate(String TemplateId, UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(TemplateId, request, headers, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(String TemplateId, UpdateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("name", request.name);
        body.put("template", request.template);
        body.put("tags", request.tags);
        body.put("description", request.description);
        body.put("template_type", request.templateType);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateTemplate", "2015-12-15", "HTTPS", "PUT", "AK", "/templates/" + TemplateId + "", "none", req, runtime), new UpdateTemplateResponse());
    }

    public UpgradeClusterResponse upgradeCluster(String ClusterId, UpgradeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public UpgradeClusterResponse upgradeClusterWithOptions(String ClusterId, UpgradeClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("component_name", request.componentName);
        body.put("version", request.version);
        body.put("next_version", request.nextVersion);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpgradeCluster", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "/upgrade", "none", req, runtime), new UpgradeClusterResponse());
    }

    public UpgradeClusterAddonsResponse upgradeClusterAddons(String ClusterId, UpgradeClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    public UpgradeClusterAddonsResponse upgradeClusterAddonsWithOptions(String ClusterId, UpgradeClusterAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        return TeaModel.toModel(this.doROARequest("UpgradeClusterAddons", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/components/upgrade", "none", req, runtime), new UpgradeClusterAddonsResponse());
    }
}

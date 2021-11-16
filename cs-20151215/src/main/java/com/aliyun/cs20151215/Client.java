// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215;

import com.aliyun.tea.*;
import com.aliyun.cs20151215.models.*;
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
            new TeaPair("cn-hangzhou-finance", "cs-vpc.cn-hangzhou-finance.aliyuncs.com"),
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
            new TeaPair("cn-shanghai-finance-1", "cs-vpc.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cs-vpc.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "cs.aliyuncs.com"),
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachInstancesWithOptions(ClusterId, request, headers, runtime);
    }

    public AttachInstancesResponse attachInstancesWithOptions(String ClusterId, AttachInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuPolicy)) {
            body.put("cpu_policy", request.cpuPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatDisk)) {
            body.put("format_disk", request.formatDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("image_id", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEdgeWorker)) {
            body.put("is_edge_worker", request.isEdgeWorker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepInstanceName)) {
            body.put("keep_instance_name", request.keepInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPair)) {
            body.put("key_pair", request.keyPair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            body.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstances)) {
            body.put("rds_instances", request.rdsInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.runtime))) {
            body.put("runtime", request.runtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("user_data", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AttachInstances", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/attach", "json", req, runtime), new AttachInstancesResponse());
    }

    public CancelClusterUpgradeResponse cancelClusterUpgrade(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelClusterUpgradeWithOptions(ClusterId, headers, runtime);
    }

    public CancelClusterUpgradeResponse cancelClusterUpgradeWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CancelClusterUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "/upgrade/cancel", "none", req, runtime), new CancelClusterUpgradeResponse());
    }

    public CancelComponentUpgradeResponse cancelComponentUpgrade(String clusterId, String componentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelComponentUpgradeWithOptions(clusterId, componentId, headers, runtime);
    }

    public CancelComponentUpgradeResponse cancelComponentUpgradeWithOptions(String clusterId, String componentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        componentId = com.aliyun.openapiutil.Client.getEncodeParam(componentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CancelComponentUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/components/" + componentId + "/cancel", "none", req, runtime), new CancelComponentUpgradeResponse());
    }

    public CancelWorkflowResponse cancelWorkflow(String workflowName, CancelWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelWorkflowWithOptions(workflowName, request, headers, runtime);
    }

    public CancelWorkflowResponse cancelWorkflowWithOptions(String workflowName, CancelWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        workflowName = com.aliyun.openapiutil.Client.getEncodeParam(workflowName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CancelWorkflow", "2015-12-15", "HTTPS", "PUT", "AK", "/gs/workflow/" + workflowName + "", "none", req, runtime), new CancelWorkflowResponse());
    }

    public CreateAutoscalingConfigResponse createAutoscalingConfig(String ClusterId, CreateAutoscalingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAutoscalingConfigWithOptions(ClusterId, request, headers, runtime);
    }

    public CreateAutoscalingConfigResponse createAutoscalingConfigWithOptions(String ClusterId, CreateAutoscalingConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coolDownDuration)) {
            body.put("cool_down_duration", request.coolDownDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuUtilizationThreshold)) {
            body.put("gpu_utilization_threshold", request.gpuUtilizationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanInterval)) {
            body.put("scan_interval", request.scanInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unneededDuration)) {
            body.put("unneeded_duration", request.unneededDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utilizationThreshold)) {
            body.put("utilization_threshold", request.utilizationThreshold);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateAutoscalingConfig", "2015-12-15", "HTTPS", "POST", "AK", "/cluster/" + ClusterId + "/autoscale/config/", "none", req, runtime), new CreateAutoscalingConfigResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterWithOptions(request, headers, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addons)) {
            body.put("addons", request.addons);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiAudiences)) {
            body.put("api_audiences", request.apiAudiences);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cisEnabled)) {
            body.put("cis_enabled", request.cisEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudMonitorFlags)) {
            body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDomain)) {
            body.put("cluster_domain", request.clusterDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            body.put("cluster_spec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            body.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerCidr)) {
            body.put("container_cidr", request.containerCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlplaneLogComponents)) {
            body.put("controlplane_log_components", request.controlplaneLogComponents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlplaneLogProject)) {
            body.put("controlplane_log_project", request.controlplaneLogProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlplaneLogTtl)) {
            body.put("controlplane_log_ttl", request.controlplaneLogTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuPolicy)) {
            body.put("cpu_policy", request.cpuPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSan)) {
            body.put("custom_san", request.customSan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            body.put("deletion_protection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            body.put("disable_rollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionProviderKey)) {
            body.put("encryption_provider_key", request.encryptionProviderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointPublicAccess)) {
            body.put("endpoint_public_access", request.endpointPublicAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatDisk)) {
            body.put("format_disk", request.formatDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("image_id", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            body.put("image_type", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnterpriseSecurityGroup)) {
            body.put("is_enterprise_security_group", request.isEnterpriseSecurityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepInstanceName)) {
            body.put("keep_instance_name", request.keepInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPair)) {
            body.put("key_pair", request.keyPair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubernetesVersion)) {
            body.put("kubernetes_version", request.kubernetesVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loggingType)) {
            body.put("logging_type", request.loggingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("login_password", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterAutoRenew)) {
            body.put("master_auto_renew", request.masterAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterAutoRenewPeriod)) {
            body.put("master_auto_renew_period", request.masterAutoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterCount)) {
            body.put("master_count", request.masterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterInstanceChargeType)) {
            body.put("master_instance_charge_type", request.masterInstanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterInstanceTypes)) {
            body.put("master_instance_types", request.masterInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterPeriod)) {
            body.put("master_period", request.masterPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterPeriodUnit)) {
            body.put("master_period_unit", request.masterPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSystemDiskCategory)) {
            body.put("master_system_disk_category", request.masterSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSystemDiskPerformanceLevel)) {
            body.put("master_system_disk_performance_level", request.masterSystemDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSystemDiskSize)) {
            body.put("master_system_disk_size", request.masterSystemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSystemDiskSnapshotPolicyId)) {
            body.put("master_system_disk_snapshot_policy_id", request.masterSystemDiskSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterVswitchIds)) {
            body.put("master_vswitch_ids", request.masterVswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGateway)) {
            body.put("nat_gateway", request.natGateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeCidrMask)) {
            body.put("node_cidr_mask", request.nodeCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNameMode)) {
            body.put("node_name_mode", request.nodeNameMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePortRange)) {
            body.put("node_port_range", request.nodePortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numOfNodes)) {
            body.put("num_of_nodes", request.numOfNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("os_type", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podVswitchIds)) {
            body.put("pod_vswitch_ids", request.podVswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            body.put("profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyMode)) {
            body.put("proxy_mode", request.proxyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstances)) {
            body.put("rds_instances", request.rdsInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.runtime))) {
            body.put("runtime", request.runtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("security_group_id", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceAccountIssuer)) {
            body.put("service_account_issuer", request.serviceAccountIssuer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCidr)) {
            body.put("service_cidr", request.serviceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDiscoveryTypes)) {
            body.put("service_discovery_types", request.serviceDiscoveryTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatEntry)) {
            body.put("snat_entry", request.snatEntry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.socEnabled)) {
            body.put("soc_enabled", request.socEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sshFlags)) {
            body.put("ssh_flags", request.sshFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutMins)) {
            body.put("timeout_mins", request.timeoutMins);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCa)) {
            body.put("user_ca", request.userCa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("user_data", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcid)) {
            body.put("vpcid", request.vpcid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchIds)) {
            body.put("vswitch_ids", request.vswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenew)) {
            body.put("worker_auto_renew", request.workerAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenewPeriod)) {
            body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerDataDisks)) {
            body.put("worker_data_disks", request.workerDataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceChargeType)) {
            body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceTypes)) {
            body.put("worker_instance_types", request.workerInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriod)) {
            body.put("worker_period", request.workerPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriodUnit)) {
            body.put("worker_period_unit", request.workerPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskCategory)) {
            body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskPerformanceLevel)) {
            body.put("worker_system_disk_performance_level", request.workerSystemDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskSize)) {
            body.put("worker_system_disk_size", request.workerSystemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskSnapshotPolicyId)) {
            body.put("worker_system_disk_snapshot_policy_id", request.workerSystemDiskSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerVswitchIds)) {
            body.put("worker_vswitch_ids", request.workerVswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("zone_id", request.zoneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateCluster", "2015-12-15", "HTTPS", "POST", "AK", "/clusters", "json", req, runtime), new CreateClusterResponse());
    }

    public CreateClusterNodePoolResponse createClusterNodePool(String ClusterId, CreateClusterNodePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterNodePoolWithOptions(ClusterId, request, headers, runtime);
    }

    public CreateClusterNodePoolResponse createClusterNodePoolWithOptions(String ClusterId, CreateClusterNodePoolRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.autoScaling))) {
            body.put("auto_scaling", request.autoScaling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.kubernetesConfig))) {
            body.put("kubernetes_config", request.kubernetesConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.management))) {
            body.put("management", request.management);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.nodepoolInfo))) {
            body.put("nodepool_info", request.nodepoolInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.scalingGroup))) {
            body.put("scaling_group", request.scalingGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.teeConfig))) {
            body.put("tee_config", request.teeConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateClusterNodePool", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/nodepools", "json", req, runtime), new CreateClusterNodePoolResponse());
    }

    public CreateEdgeMachineResponse createEdgeMachine(CreateEdgeMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEdgeMachineWithOptions(request, headers, runtime);
    }

    public CreateEdgeMachineResponse createEdgeMachineWithOptions(CreateEdgeMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            body.put("hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            body.put("sn", request.sn);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateEdgeMachine", "2015-12-15", "HTTPS", "POST", "AK", "/edge_machines", "json", req, runtime), new CreateEdgeMachineResponse());
    }

    public CreateKubernetesTriggerResponse createKubernetesTrigger(CreateKubernetesTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKubernetesTriggerWithOptions(request, headers, runtime);
    }

    public CreateKubernetesTriggerResponse createKubernetesTriggerWithOptions(CreateKubernetesTriggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("project_id", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateKubernetesTrigger", "2015-12-15", "HTTPS", "POST", "AK", "/triggers", "json", req, runtime), new CreateKubernetesTriggerResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateWithOptions(request, headers, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("template_type", request.templateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateTemplate", "2015-12-15", "HTTPS", "POST", "AK", "/templates", "json", req, runtime), new CreateTemplateResponse());
    }

    public CreateTriggerResponse createTrigger(String clusterId, CreateTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTriggerWithOptions(clusterId, request, headers, runtime);
    }

    public CreateTriggerResponse createTriggerWithOptions(String clusterId, CreateTriggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("project_id", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateTrigger", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/triggers", "json", req, runtime), new CreateTriggerResponse());
    }

    public DeleteClusterResponse deleteCluster(String ClusterId, DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(String ClusterId, DeleteClusterRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        DeleteClusterShrinkRequest request = new DeleteClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retainResources)) {
            request.retainResourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retainResources, "retain_resources", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keepSlb)) {
            query.put("keep_slb", request.keepSlb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainAllResources)) {
            query.put("retain_all_resources", request.retainAllResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainResourcesShrink)) {
            query.put("retain_resources", request.retainResourcesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteCluster", "2015-12-15", "HTTPS", "DELETE", "AK", "/clusters/" + ClusterId + "", "none", req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterNodepoolResponse deleteClusterNodepool(String ClusterId, String NodepoolId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterNodepoolWithOptions(ClusterId, NodepoolId, headers, runtime);
    }

    public DeleteClusterNodepoolResponse deleteClusterNodepoolWithOptions(String ClusterId, String NodepoolId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        NodepoolId = com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteClusterNodepool", "2015-12-15", "HTTPS", "DELETE", "AK", "/clusters/" + ClusterId + "/nodepools/" + NodepoolId + "", "json", req, runtime), new DeleteClusterNodepoolResponse());
    }

    public DeleteClusterNodesResponse deleteClusterNodes(String ClusterId, DeleteClusterNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    public DeleteClusterNodesResponse deleteClusterNodesWithOptions(String ClusterId, DeleteClusterNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drainNode)) {
            body.put("drain_node", request.drainNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseNode)) {
            body.put("release_node", request.releaseNode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteClusterNodes", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/nodes", "json", req, runtime), new DeleteClusterNodesResponse());
    }

    public DeleteEdgeMachineResponse deleteEdgeMachine(String edgeMachineid, DeleteEdgeMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEdgeMachineWithOptions(edgeMachineid, request, headers, runtime);
    }

    public DeleteEdgeMachineResponse deleteEdgeMachineWithOptions(String edgeMachineid, DeleteEdgeMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        edgeMachineid = com.aliyun.openapiutil.Client.getEncodeParam(edgeMachineid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteEdgeMachine", "2015-12-15", "HTTPS", "DELETE", "AK", "/edge_machines/[edge_machineid]", "none", req, runtime), new DeleteEdgeMachineResponse());
    }

    public DeleteKubernetesTriggerResponse deleteKubernetesTrigger(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKubernetesTriggerWithOptions(Id, headers, runtime);
    }

    public DeleteKubernetesTriggerResponse deleteKubernetesTriggerWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteKubernetesTrigger", "2015-12-15", "HTTPS", "DELETE", "AK", "/triggers/revoke/" + Id + "", "none", req, runtime), new DeleteKubernetesTriggerResponse());
    }

    public DeletePolicyInstanceResponse deletePolicyInstance(String clusterId, String policyName, String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePolicyInstanceWithOptions(clusterId, policyName, instanceId, headers, runtime);
    }

    public DeletePolicyInstanceResponse deletePolicyInstanceWithOptions(String clusterId, String policyName, String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        policyName = com.aliyun.openapiutil.Client.getEncodeParam(policyName);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeletePolicyInstance", "2015-12-15", "HTTPS", "DELETE", "AK", "/clusters/" + clusterId + "/policies/" + policyName + "/instances/" + instanceId + "", "none", req, runtime), new DeletePolicyInstanceResponse());
    }

    public DeleteTemplateResponse deleteTemplate(String TemplateId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(TemplateId, headers, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(String TemplateId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        TemplateId = com.aliyun.openapiutil.Client.getEncodeParam(TemplateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteTemplate", "2015-12-15", "HTTPS", "DELETE", "AK", "/templates/" + TemplateId + "", "none", req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTriggerResponse deleteTrigger(String clusterId, String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTriggerWithOptions(clusterId, Id, headers, runtime);
    }

    public DeleteTriggerResponse deleteTriggerWithOptions(String clusterId, String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteTrigger", "2015-12-15", "HTTPS", "DELETE", "AK", "/clusters/[cluster_id]/triggers/[Id]", "none", req, runtime), new DeleteTriggerResponse());
    }

    public DeployPolicyInstanceResponse deployPolicyInstance(String clusterId, String policyName, DeployPolicyInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployPolicyInstanceWithOptions(clusterId, policyName, request, headers, runtime);
    }

    public DeployPolicyInstanceResponse deployPolicyInstanceWithOptions(String clusterId, String policyName, DeployPolicyInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        policyName = com.aliyun.openapiutil.Client.getEncodeParam(policyName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("DeployPolicyInstance", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/policies/" + policyName + "", "none", req, runtime), new DeployPolicyInstanceResponse());
    }

    public DescirbeWorkflowResponse descirbeWorkflow(String workflowName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.descirbeWorkflowWithOptions(workflowName, headers, runtime);
    }

    public DescirbeWorkflowResponse descirbeWorkflowWithOptions(String workflowName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        workflowName = com.aliyun.openapiutil.Client.getEncodeParam(workflowName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescirbeWorkflow", "2015-12-15", "HTTPS", "GET", "AK", "/gs/workflow/" + workflowName + "", "json", req, runtime), new DescirbeWorkflowResponse());
    }

    public DescribeAddonsResponse describeAddons(DescribeAddonsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAddonsWithOptions(request, headers, runtime);
    }

    public DescribeAddonsResponse describeAddonsWithOptions(DescribeAddonsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAddons", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/components/metadata", "json", req, runtime), new DescribeAddonsResponse());
    }

    public DescribeClusterAddonMetadataResponse describeClusterAddonMetadata(String clusterId, String componentId, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonMetadataWithOptions(clusterId, componentId, version, headers, runtime);
    }

    public DescribeClusterAddonMetadataResponse describeClusterAddonMetadataWithOptions(String clusterId, String componentId, String version, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        componentId = com.aliyun.openapiutil.Client.getEncodeParam(componentId);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterAddonMetadata", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/components/" + componentId + "/metadata", "json", req, runtime), new DescribeClusterAddonMetadataResponse());
    }

    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatus(String ClusterId, String ComponentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonUpgradeStatusWithOptions(ClusterId, ComponentId, headers, runtime);
    }

    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatusWithOptions(String ClusterId, String ComponentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ComponentId = com.aliyun.openapiutil.Client.getEncodeParam(ComponentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterAddonUpgradeStatus", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/components/" + ComponentId + "/upgradestatus", "json", req, runtime), new DescribeClusterAddonUpgradeStatusResponse());
    }

    public DescribeClusterAddonsUpgradeStatusResponse describeClusterAddonsUpgradeStatus(String ClusterId, DescribeClusterAddonsUpgradeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonsUpgradeStatusWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterAddonsUpgradeStatusResponse describeClusterAddonsUpgradeStatusWithOptions(String ClusterId, DescribeClusterAddonsUpgradeStatusRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        DescribeClusterAddonsUpgradeStatusShrinkRequest request = new DescribeClusterAddonsUpgradeStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.componentIds)) {
            request.componentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.componentIds, "componentIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentIdsShrink)) {
            query.put("componentIds", request.componentIdsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterAddonsUpgradeStatus", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/components/upgradestatus", "json", req, runtime), new DescribeClusterAddonsUpgradeStatusResponse());
    }

    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersion(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonsVersionWithOptions(ClusterId, headers, runtime);
    }

    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersionWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterAddonsVersion", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/components/version", "json", req, runtime), new DescribeClusterAddonsVersionResponse());
    }

    public DescribeClusterAttachScriptsResponse describeClusterAttachScripts(String ClusterId, DescribeClusterAttachScriptsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAttachScriptsWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterAttachScriptsResponse describeClusterAttachScriptsWithOptions(String ClusterId, DescribeClusterAttachScriptsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arch)) {
            body.put("arch", request.arch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatDisk)) {
            body.put("format_disk", request.formatDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepInstanceName)) {
            body.put("keep_instance_name", request.keepInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            body.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstances)) {
            body.put("rds_instances", request.rdsInstances);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterAttachScripts", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/attachscript", "string", req, runtime), new DescribeClusterAttachScriptsResponse());
    }

    public DescribeClusterDetailResponse describeClusterDetail(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterDetailWithOptions(ClusterId, headers, runtime);
    }

    public DescribeClusterDetailResponse describeClusterDetailWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterDetail", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "", "json", req, runtime), new DescribeClusterDetailResponse());
    }

    public DescribeClusterLogsResponse describeClusterLogs(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterLogsWithOptions(ClusterId, headers, runtime);
    }

    public DescribeClusterLogsResponse describeClusterLogsWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterLogs", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/logs", "array", req, runtime), new DescribeClusterLogsResponse());
    }

    public DescribeClusterNamespacesResponse describeClusterNamespaces(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNamespacesWithOptions(ClusterId, headers, runtime);
    }

    public DescribeClusterNamespacesResponse describeClusterNamespacesWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterNamespaces", "2015-12-15", "HTTPS", "GET", "AK", "/k8s/" + ClusterId + "/namespaces", "array", req, runtime), new DescribeClusterNamespacesResponse());
    }

    public DescribeClusterNodePoolDetailResponse describeClusterNodePoolDetail(String ClusterId, String NodepoolId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodePoolDetailWithOptions(ClusterId, NodepoolId, headers, runtime);
    }

    public DescribeClusterNodePoolDetailResponse describeClusterNodePoolDetailWithOptions(String ClusterId, String NodepoolId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        NodepoolId = com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterNodePoolDetail", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/nodepools/" + NodepoolId + "", "json", req, runtime), new DescribeClusterNodePoolDetailResponse());
    }

    public DescribeClusterNodePoolsResponse describeClusterNodePools(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodePoolsWithOptions(ClusterId, headers, runtime);
    }

    public DescribeClusterNodePoolsResponse describeClusterNodePoolsWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterNodePools", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/nodepools", "json", req, runtime), new DescribeClusterNodePoolsResponse());
    }

    public DescribeClusterNodesResponse describeClusterNodes(String ClusterId, DescribeClusterNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterNodesResponse describeClusterNodesWithOptions(String ClusterId, DescribeClusterNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("instanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            query.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterNodes", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/nodes", "json", req, runtime), new DescribeClusterNodesResponse());
    }

    public DescribeClusterResourcesResponse describeClusterResources(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterResourcesWithOptions(ClusterId, headers, runtime);
    }

    public DescribeClusterResourcesResponse describeClusterResourcesWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterResources", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/resources", "array", req, runtime), new DescribeClusterResourcesResponse());
    }

    public DescribeClusterUserKubeconfigResponse describeClusterUserKubeconfig(String ClusterId, DescribeClusterUserKubeconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterUserKubeconfigWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterUserKubeconfigResponse describeClusterUserKubeconfigWithOptions(String ClusterId, DescribeClusterUserKubeconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.temporaryDurationMinutes)) {
            query.put("TemporaryDurationMinutes", request.temporaryDurationMinutes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterUserKubeconfig", "2015-12-15", "HTTPS", "GET", "AK", "/k8s/" + ClusterId + "/user_config", "json", req, runtime), new DescribeClusterUserKubeconfigResponse());
    }

    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfig(String ClusterId, DescribeClusterV2UserKubeconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterV2UserKubeconfigWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfigWithOptions(String ClusterId, DescribeClusterV2UserKubeconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusterV2UserKubeconfig", "2015-12-15", "HTTPS", "GET", "AK", "/api/v2/k8s/" + ClusterId + "/user_config", "json", req, runtime), new DescribeClusterV2UserKubeconfigResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClustersWithOptions(request, headers, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("clusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClusters", "2015-12-15", "HTTPS", "GET", "AK", "/clusters", "array", req, runtime), new DescribeClustersResponse());
    }

    public DescribeClustersV1Response describeClustersV1(DescribeClustersV1Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClustersV1WithOptions(request, headers, runtime);
    }

    public DescribeClustersV1Response describeClustersV1WithOptions(DescribeClustersV1Request request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            query.put("cluster_spec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            query.put("profile", request.profile);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeClustersV1", "2015-12-15", "HTTPS", "GET", "AK", "/api/v1/clusters", "json", req, runtime), new DescribeClustersV1Response());
    }

    public DescribeEdgeMachineActiveProcessResponse describeEdgeMachineActiveProcess(String edgeMachineid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdgeMachineActiveProcessWithOptions(edgeMachineid, headers, runtime);
    }

    public DescribeEdgeMachineActiveProcessResponse describeEdgeMachineActiveProcessWithOptions(String edgeMachineid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        edgeMachineid = com.aliyun.openapiutil.Client.getEncodeParam(edgeMachineid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEdgeMachineActiveProcess", "2015-12-15", "HTTPS", "GET", "AK", "/edge_machines/[edge_machineid]/activeprocess", "json", req, runtime), new DescribeEdgeMachineActiveProcessResponse());
    }

    public DescribeEdgeMachineModelsResponse describeEdgeMachineModels() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdgeMachineModelsWithOptions(headers, runtime);
    }

    public DescribeEdgeMachineModelsResponse describeEdgeMachineModelsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEdgeMachineModels", "2015-12-15", "HTTPS", "GET", "AK", "/edge_machines/models", "json", req, runtime), new DescribeEdgeMachineModelsResponse());
    }

    public DescribeEdgeMachineTunnelConfigDetailResponse describeEdgeMachineTunnelConfigDetail(String edgeMachineid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdgeMachineTunnelConfigDetailWithOptions(edgeMachineid, headers, runtime);
    }

    public DescribeEdgeMachineTunnelConfigDetailResponse describeEdgeMachineTunnelConfigDetailWithOptions(String edgeMachineid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        edgeMachineid = com.aliyun.openapiutil.Client.getEncodeParam(edgeMachineid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEdgeMachineTunnelConfigDetail", "2015-12-15", "HTTPS", "POST", "AK", "/edge_machines/[edge_machineid]/tunnelconfig", "json", req, runtime), new DescribeEdgeMachineTunnelConfigDetailResponse());
    }

    public DescribeEdgeMachinesResponse describeEdgeMachines(DescribeEdgeMachinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdgeMachinesWithOptions(request, headers, runtime);
    }

    public DescribeEdgeMachinesResponse describeEdgeMachinesWithOptions(DescribeEdgeMachinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifeState)) {
            query.put("life_state", request.lifeState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineState)) {
            query.put("online_state", request.onlineState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEdgeMachines", "2015-12-15", "HTTPS", "GET", "AK", "/edge_machines", "json", req, runtime), new DescribeEdgeMachinesResponse());
    }

    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEventsWithOptions(request, headers, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEvents", "2015-12-15", "HTTPS", "GET", "AK", "/events", "json", req, runtime), new DescribeEventsResponse());
    }

    public DescribeExternalAgentResponse describeExternalAgent(String ClusterId, DescribeExternalAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExternalAgentWithOptions(ClusterId, request, headers, runtime);
    }

    public DescribeExternalAgentResponse describeExternalAgentWithOptions(String ClusterId, DescribeExternalAgentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeExternalAgent", "2015-12-15", "HTTPS", "GET", "AK", "/k8s/" + ClusterId + "/external/agent/deployment", "json", req, runtime), new DescribeExternalAgentResponse());
    }

    public DescribeKubernetesVersionMetadataResponse describeKubernetesVersionMetadata(DescribeKubernetesVersionMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeKubernetesVersionMetadataWithOptions(request, headers, runtime);
    }

    public DescribeKubernetesVersionMetadataResponse describeKubernetesVersionMetadataWithOptions(DescribeKubernetesVersionMetadataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubernetesVersion)) {
            query.put("KubernetesVersion", request.kubernetesVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            query.put("Profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeKubernetesVersionMetadata", "2015-12-15", "HTTPS", "GET", "AK", "/api/v1/metadata/versions", "array", req, runtime), new DescribeKubernetesVersionMetadataResponse());
    }

    public DescribePoliciesResponse describePolicies() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePoliciesWithOptions(headers, runtime);
    }

    public DescribePoliciesResponse describePoliciesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribePolicies", "2015-12-15", "HTTPS", "GET", "AK", "/policies", "json", req, runtime), new DescribePoliciesResponse());
    }

    public DescribePolicyDetailsResponse describePolicyDetails(String policyName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyDetailsWithOptions(policyName, headers, runtime);
    }

    public DescribePolicyDetailsResponse describePolicyDetailsWithOptions(String policyName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        policyName = com.aliyun.openapiutil.Client.getEncodeParam(policyName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribePolicyDetails", "2015-12-15", "HTTPS", "GET", "AK", "/policies/" + policyName + "", "json", req, runtime), new DescribePolicyDetailsResponse());
    }

    public DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInCluster(String clusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyGovernanceInClusterWithOptions(clusterId, headers, runtime);
    }

    public DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInClusterWithOptions(String clusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribePolicyGovernanceInCluster", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/policygovernance", "json", req, runtime), new DescribePolicyGovernanceInClusterResponse());
    }

    public DescribePolicyInstancesResponse describePolicyInstances(String clusterId, DescribePolicyInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyInstancesWithOptions(clusterId, request, headers, runtime);
    }

    public DescribePolicyInstancesResponse describePolicyInstancesWithOptions(String clusterId, DescribePolicyInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("instance_name", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("policy_name", request.policyName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribePolicyInstances", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/policies", "array", req, runtime), new DescribePolicyInstancesResponse());
    }

    public DescribePolicyInstancesStatusResponse describePolicyInstancesStatus(String clusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyInstancesStatusWithOptions(clusterId, headers, runtime);
    }

    public DescribePolicyInstancesStatusResponse describePolicyInstancesStatusWithOptions(String clusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribePolicyInstancesStatus", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/" + clusterId + "/policies/status", "json", req, runtime), new DescribePolicyInstancesStatusResponse());
    }

    public DescribeTaskInfoResponse describeTaskInfo(String taskId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTaskInfoWithOptions(taskId, headers, runtime);
    }

    public DescribeTaskInfoResponse describeTaskInfoWithOptions(String taskId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeTaskInfo", "2015-12-15", "HTTPS", "GET", "AK", "/tasks/" + taskId + "", "json", req, runtime), new DescribeTaskInfoResponse());
    }

    public DescribeTemplateAttributeResponse describeTemplateAttribute(String TemplateId, DescribeTemplateAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplateAttributeWithOptions(TemplateId, request, headers, runtime);
    }

    public DescribeTemplateAttributeResponse describeTemplateAttributeWithOptions(String TemplateId, DescribeTemplateAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TemplateId = com.aliyun.openapiutil.Client.getEncodeParam(TemplateId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("template_type", request.templateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeTemplateAttribute", "2015-12-15", "HTTPS", "GET", "AK", "/templates/" + TemplateId + "", "array", req, runtime), new DescribeTemplateAttributeResponse());
    }

    public DescribeTemplatesResponse describeTemplates(DescribeTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplatesWithOptions(request, headers, runtime);
    }

    public DescribeTemplatesResponse describeTemplatesWithOptions(DescribeTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("page_num", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("template_type", request.templateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeTemplates", "2015-12-15", "HTTPS", "GET", "AK", "/templates", "json", req, runtime), new DescribeTemplatesResponse());
    }

    public DescribeTriggerResponse describeTrigger(String clusterId, DescribeTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTriggerWithOptions(clusterId, request, headers, runtime);
    }

    public DescribeTriggerResponse describeTriggerWithOptions(String clusterId, DescribeTriggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeTrigger", "2015-12-15", "HTTPS", "GET", "AK", "/clusters/[cluster_id]/triggers", "array", req, runtime), new DescribeTriggerResponse());
    }

    public DescribeUserPermissionResponse describeUserPermission(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserPermissionWithOptions(uid, headers, runtime);
    }

    public DescribeUserPermissionResponse describeUserPermissionWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUserPermission", "2015-12-15", "HTTPS", "GET", "AK", "/permissions/users/" + uid + "", "array", req, runtime), new DescribeUserPermissionResponse());
    }

    public DescribeUserQuotaResponse describeUserQuota() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserQuotaWithOptions(headers, runtime);
    }

    public DescribeUserQuotaResponse describeUserQuotaWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUserQuota", "2015-12-15", "HTTPS", "GET", "AK", "/quota", "json", req, runtime), new DescribeUserQuotaResponse());
    }

    public DescribeWorkflowsResponse describeWorkflows() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWorkflowsWithOptions(headers, runtime);
    }

    public DescribeWorkflowsResponse describeWorkflowsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeWorkflows", "2015-12-15", "HTTPS", "GET", "AK", "/gs/workflows", "json", req, runtime), new DescribeWorkflowsResponse());
    }

    public EdgeClusterAddEdgeMachineResponse edgeClusterAddEdgeMachine(String clusterid, String edgeMachineid, EdgeClusterAddEdgeMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.edgeClusterAddEdgeMachineWithOptions(clusterid, edgeMachineid, request, headers, runtime);
    }

    public EdgeClusterAddEdgeMachineResponse edgeClusterAddEdgeMachineWithOptions(String clusterid, String edgeMachineid, EdgeClusterAddEdgeMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        clusterid = com.aliyun.openapiutil.Client.getEncodeParam(clusterid);
        edgeMachineid = com.aliyun.openapiutil.Client.getEncodeParam(edgeMachineid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expired)) {
            body.put("expired", request.expired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            body.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("EdgeClusterAddEdgeMachine", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/[clusterid]/attachedgemachine/[edge_machineid]", "json", req, runtime), new EdgeClusterAddEdgeMachineResponse());
    }

    public GetKubernetesTriggerResponse getKubernetesTrigger(String ClusterId, GetKubernetesTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKubernetesTriggerWithOptions(ClusterId, request, headers, runtime);
    }

    public GetKubernetesTriggerResponse getKubernetesTriggerWithOptions(String ClusterId, GetKubernetesTriggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetKubernetesTrigger", "2015-12-15", "HTTPS", "GET", "AK", "/triggers/" + ClusterId + "", "array", req, runtime), new GetKubernetesTriggerResponse());
    }

    public GetUpgradeStatusResponse getUpgradeStatus(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUpgradeStatusWithOptions(ClusterId, headers, runtime);
    }

    public GetUpgradeStatusResponse getUpgradeStatusWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetUpgradeStatus", "2015-12-15", "HTTPS", "GET", "AK", "/api/v2/clusters/" + ClusterId + "/upgrade/status", "json", req, runtime), new GetUpgradeStatusResponse());
    }

    public GrantPermissionsResponse grantPermissions(String uid, GrantPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantPermissionsWithOptions(uid, request, headers, runtime);
    }

    public GrantPermissionsResponse grantPermissionsWithOptions(String uid, GrantPermissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        return TeaModel.toModel(this.doROARequest("GrantPermissions", "2015-12-15", "HTTPS", "POST", "AK", "/permissions/users/" + uid + "", "none", req, runtime), new GrantPermissionsResponse());
    }

    public InstallClusterAddonsResponse installClusterAddons(String ClusterId, InstallClusterAddonsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    public InstallClusterAddonsResponse installClusterAddonsWithOptions(String ClusterId, InstallClusterAddonsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        return TeaModel.toModel(this.doROARequest("InstallClusterAddons", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/components/install", "none", req, runtime), new InstallClusterAddonsResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "resource_ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("resource_ids", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resource_type", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTagResources", "2015-12-15", "HTTPS", "GET", "AK", "/tags", "json", req, runtime), new ListTagResourcesResponse());
    }

    public MigrateClusterResponse migrateCluster(String clusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateClusterWithOptions(clusterId, headers, runtime);
    }

    public MigrateClusterResponse migrateClusterWithOptions(String clusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("MigrateCluster", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/migrate", "none", req, runtime), new MigrateClusterResponse());
    }

    public ModifyClusterResponse modifyCluster(String ClusterId, ModifyClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public ModifyClusterResponse modifyClusterWithOptions(String ClusterId, ModifyClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiServerEip)) {
            body.put("api_server_eip", request.apiServerEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiServerEipId)) {
            body.put("api_server_eip_id", request.apiServerEipId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            body.put("deletion_protection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressDomainRebinding)) {
            body.put("ingress_domain_rebinding", request.ingressDomainRebinding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressLoadbalancerId)) {
            body.put("ingress_loadbalancer_id", request.ingressLoadbalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDeletionProtection)) {
            body.put("instance_deletion_protection", request.instanceDeletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.maintenanceWindow))) {
            body.put("maintenance_window", request.maintenanceWindow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resource_group_id", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyCluster", "2015-12-15", "HTTPS", "PUT", "AK", "/api/v2/clusters/" + ClusterId + "", "json", req, runtime), new ModifyClusterResponse());
    }

    public ModifyClusterAddonResponse modifyClusterAddon(String clusterId, String componentId, ModifyClusterAddonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterAddonWithOptions(clusterId, componentId, request, headers, runtime);
    }

    public ModifyClusterAddonResponse modifyClusterAddonWithOptions(String clusterId, String componentId, ModifyClusterAddonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        componentId = com.aliyun.openapiutil.Client.getEncodeParam(componentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyClusterAddon", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterId + "/components/" + componentId + "/config", "none", req, runtime), new ModifyClusterAddonResponse());
    }

    public ModifyClusterConfigurationResponse modifyClusterConfiguration(String ClusterId, ModifyClusterConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterConfigurationWithOptions(ClusterId, request, headers, runtime);
    }

    public ModifyClusterConfigurationResponse modifyClusterConfigurationWithOptions(String ClusterId, ModifyClusterConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customizeConfig)) {
            body.put("customize_config", request.customizeConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyClusterConfiguration", "2015-12-15", "HTTPS", "PUT", "AK", "/clusters/" + ClusterId + "/configuration", "none", req, runtime), new ModifyClusterConfigurationResponse());
    }

    public ModifyClusterNodePoolResponse modifyClusterNodePool(String ClusterId, String NodepoolId, ModifyClusterNodePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterNodePoolWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }

    public ModifyClusterNodePoolResponse modifyClusterNodePoolWithOptions(String ClusterId, String NodepoolId, ModifyClusterNodePoolRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        NodepoolId = com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.autoScaling))) {
            body.put("auto_scaling", request.autoScaling);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.kubernetesConfig))) {
            body.put("kubernetes_config", request.kubernetesConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.management))) {
            body.put("management", request.management);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.nodepoolInfo))) {
            body.put("nodepool_info", request.nodepoolInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.scalingGroup))) {
            body.put("scaling_group", request.scalingGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.teeConfig))) {
            body.put("tee_config", request.teeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateNodes)) {
            body.put("update_nodes", request.updateNodes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyClusterNodePool", "2015-12-15", "HTTPS", "PUT", "AK", "/clusters/" + ClusterId + "/nodepools/" + NodepoolId + "", "json", req, runtime), new ModifyClusterNodePoolResponse());
    }

    public ModifyClusterTagsResponse modifyClusterTags(String ClusterId, ModifyClusterTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterTagsWithOptions(ClusterId, request, headers, runtime);
    }

    public ModifyClusterTagsResponse modifyClusterTagsWithOptions(String ClusterId, ModifyClusterTagsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyClusterTags", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/tags", "none", req, runtime), new ModifyClusterTagsResponse());
    }

    public ModifyPolicyInstanceResponse modifyPolicyInstance(String clusterId, String policyName, ModifyPolicyInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyPolicyInstanceWithOptions(clusterId, policyName, request, headers, runtime);
    }

    public ModifyPolicyInstanceResponse modifyPolicyInstanceWithOptions(String clusterId, String policyName, ModifyPolicyInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        clusterId = com.aliyun.openapiutil.Client.getEncodeParam(clusterId);
        policyName = com.aliyun.openapiutil.Client.getEncodeParam(policyName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instance_name", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyPolicyInstance", "2015-12-15", "HTTPS", "PUT", "AK", "/clusters/" + clusterId + "/policies/" + policyName + "", "none", req, runtime), new ModifyPolicyInstanceResponse());
    }

    public OpenAckServiceResponse openAckService(OpenAckServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openAckServiceWithOptions(request, headers, runtime);
    }

    public OpenAckServiceResponse openAckServiceWithOptions(OpenAckServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("OpenAckService", "2015-12-15", "HTTPS", "POST", "AK", "/service/open", "json", req, runtime), new OpenAckServiceResponse());
    }

    public PauseClusterUpgradeResponse pauseClusterUpgrade(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseClusterUpgradeWithOptions(ClusterId, headers, runtime);
    }

    public PauseClusterUpgradeResponse pauseClusterUpgradeWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PauseClusterUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "/upgrade/pause", "none", req, runtime), new PauseClusterUpgradeResponse());
    }

    public PauseComponentUpgradeResponse pauseComponentUpgrade(String clusterid, String componentid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseComponentUpgradeWithOptions(clusterid, componentid, headers, runtime);
    }

    public PauseComponentUpgradeResponse pauseComponentUpgradeWithOptions(String clusterid, String componentid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterid = com.aliyun.openapiutil.Client.getEncodeParam(clusterid);
        componentid = com.aliyun.openapiutil.Client.getEncodeParam(componentid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PauseComponentUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterid + "/components/" + componentid + "/pause", "none", req, runtime), new PauseComponentUpgradeResponse());
    }

    public RemoveClusterNodesResponse removeClusterNodes(String ClusterId, RemoveClusterNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    public RemoveClusterNodesResponse removeClusterNodesWithOptions(String ClusterId, RemoveClusterNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drainNode)) {
            body.put("drain_node", request.drainNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseNode)) {
            body.put("release_node", request.releaseNode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("RemoveClusterNodes", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "/nodes/remove", "none", req, runtime), new RemoveClusterNodesResponse());
    }

    public RemoveWorkflowResponse removeWorkflow(String workflowName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeWorkflowWithOptions(workflowName, headers, runtime);
    }

    public RemoveWorkflowResponse removeWorkflowWithOptions(String workflowName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        workflowName = com.aliyun.openapiutil.Client.getEncodeParam(workflowName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveWorkflow", "2015-12-15", "HTTPS", "DELETE", "AK", "/gs/workflow/" + workflowName + "", "none", req, runtime), new RemoveWorkflowResponse());
    }

    public ResumeComponentUpgradeResponse resumeComponentUpgrade(String clusterid, String componentid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeComponentUpgradeWithOptions(clusterid, componentid, headers, runtime);
    }

    public ResumeComponentUpgradeResponse resumeComponentUpgradeWithOptions(String clusterid, String componentid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        clusterid = com.aliyun.openapiutil.Client.getEncodeParam(clusterid);
        componentid = com.aliyun.openapiutil.Client.getEncodeParam(componentid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ResumeComponentUpgrade", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + clusterid + "/components/" + componentid + "/resume", "none", req, runtime), new ResumeComponentUpgradeResponse());
    }

    public ResumeUpgradeClusterResponse resumeUpgradeCluster(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeUpgradeClusterWithOptions(ClusterId, headers, runtime);
    }

    public ResumeUpgradeClusterResponse resumeUpgradeClusterWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ResumeUpgradeCluster", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "/upgrade/resume", "none", req, runtime), new ResumeUpgradeClusterResponse());
    }

    public ScaleClusterResponse scaleCluster(String ClusterId, ScaleClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public ScaleClusterResponse scaleClusterWithOptions(String ClusterId, ScaleClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudMonitorFlags)) {
            body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuPolicy)) {
            body.put("cpu_policy", request.cpuPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            body.put("disable_rollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPair)) {
            body.put("key_pair", request.keyPair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("login_password", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchIds)) {
            body.put("vswitch_ids", request.vswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenew)) {
            body.put("worker_auto_renew", request.workerAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenewPeriod)) {
            body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerDataDisk)) {
            body.put("worker_data_disk", request.workerDataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerDataDisks)) {
            body.put("worker_data_disks", request.workerDataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceChargeType)) {
            body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceTypes)) {
            body.put("worker_instance_types", request.workerInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriod)) {
            body.put("worker_period", request.workerPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriodUnit)) {
            body.put("worker_period_unit", request.workerPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskCategory)) {
            body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskSize)) {
            body.put("worker_system_disk_size", request.workerSystemDiskSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ScaleCluster", "2015-12-15", "HTTPS", "PUT", "AK", "/clusters/" + ClusterId + "", "json", req, runtime), new ScaleClusterResponse());
    }

    public ScaleClusterNodePoolResponse scaleClusterNodePool(String ClusterId, String NodepoolId, ScaleClusterNodePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleClusterNodePoolWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }

    public ScaleClusterNodePoolResponse scaleClusterNodePoolWithOptions(String ClusterId, String NodepoolId, ScaleClusterNodePoolRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        NodepoolId = com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ScaleClusterNodePool", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/nodepools/" + NodepoolId + "", "json", req, runtime), new ScaleClusterNodePoolResponse());
    }

    public ScaleOutClusterResponse scaleOutCluster(String ClusterId, ScaleOutClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleOutClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public ScaleOutClusterResponse scaleOutClusterWithOptions(String ClusterId, ScaleOutClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudMonitorFlags)) {
            body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuPolicy)) {
            body.put("cpu_policy", request.cpuPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("image_id", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPair)) {
            body.put("key_pair", request.keyPair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("login_password", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstances)) {
            body.put("rds_instances", request.rdsInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.runtime))) {
            body.put("runtime", request.runtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("user_data", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchIds)) {
            body.put("vswitch_ids", request.vswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenew)) {
            body.put("worker_auto_renew", request.workerAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenewPeriod)) {
            body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerDataDisks)) {
            body.put("worker_data_disks", request.workerDataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceChargeType)) {
            body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceTypes)) {
            body.put("worker_instance_types", request.workerInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriod)) {
            body.put("worker_period", request.workerPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriodUnit)) {
            body.put("worker_period_unit", request.workerPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskCategory)) {
            body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskSize)) {
            body.put("worker_system_disk_size", request.workerSystemDiskSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ScaleOutCluster", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "", "json", req, runtime), new ScaleOutClusterResponse());
    }

    public StartWorkflowResponse startWorkflow(StartWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startWorkflowWithOptions(request, headers, runtime);
    }

    public StartWorkflowResponse startWorkflowWithOptions(StartWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mappingBamOutFilename)) {
            body.put("mapping_bam_out_filename", request.mappingBamOutFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingBamOutPath)) {
            body.put("mapping_bam_out_path", request.mappingBamOutPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingBucketName)) {
            body.put("mapping_bucket_name", request.mappingBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingFastqFirstFilename)) {
            body.put("mapping_fastq_first_filename", request.mappingFastqFirstFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingFastqPath)) {
            body.put("mapping_fastq_path", request.mappingFastqPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingFastqSecondFilename)) {
            body.put("mapping_fastq_second_filename", request.mappingFastqSecondFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingIsMarkDup)) {
            body.put("mapping_is_mark_dup", request.mappingIsMarkDup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingOssRegion)) {
            body.put("mapping_oss_region", request.mappingOssRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingReferencePath)) {
            body.put("mapping_reference_path", request.mappingReferencePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsBucketName)) {
            body.put("wgs_bucket_name", request.wgsBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsFastqFirstFilename)) {
            body.put("wgs_fastq_first_filename", request.wgsFastqFirstFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsFastqPath)) {
            body.put("wgs_fastq_path", request.wgsFastqPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsFastqSecondFilename)) {
            body.put("wgs_fastq_second_filename", request.wgsFastqSecondFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsOssRegion)) {
            body.put("wgs_oss_region", request.wgsOssRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsReferencePath)) {
            body.put("wgs_reference_path", request.wgsReferencePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsVcfOutFilename)) {
            body.put("wgs_vcf_out_filename", request.wgsVcfOutFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsVcfOutPath)) {
            body.put("wgs_vcf_out_path", request.wgsVcfOutPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowType)) {
            body.put("workflow_type", request.workflowType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("StartWorkflow", "2015-12-15", "HTTPS", "POST", "AK", "/gs/workflow", "json", req, runtime), new StartWorkflowResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resource_ids", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resource_type", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("TagResources", "2015-12-15", "HTTPS", "PUT", "AK", "/tags", "none", req, runtime), new TagResourcesResponse());
    }

    public UnInstallClusterAddonsResponse unInstallClusterAddons(String ClusterId, UnInstallClusterAddonsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unInstallClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    public UnInstallClusterAddonsResponse unInstallClusterAddonsWithOptions(String ClusterId, UnInstallClusterAddonsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.addons))
        ));
        return TeaModel.toModel(this.doROARequest("UnInstallClusterAddons", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/components/uninstall", "none", req, runtime), new UnInstallClusterAddonsResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("resource_ids", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resource_type", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("tag_keys", request.tagKeys);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UntagResources", "2015-12-15", "HTTPS", "DELETE", "AK", "/tags", "none", req, runtime), new UntagResourcesResponse());
    }

    public UpdateK8sClusterUserConfigExpireResponse updateK8sClusterUserConfigExpire(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sClusterUserConfigExpireWithOptions(ClusterId, headers, runtime);
    }

    public UpdateK8sClusterUserConfigExpireResponse updateK8sClusterUserConfigExpireWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateK8sClusterUserConfigExpire", "2015-12-15", "HTTPS", "POST", "AK", "/k8s/" + ClusterId + "/user_config/expire", "none", req, runtime), new UpdateK8sClusterUserConfigExpireResponse());
    }

    public UpdateTemplateResponse updateTemplate(String TemplateId, UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(TemplateId, request, headers, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(String TemplateId, UpdateTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TemplateId = com.aliyun.openapiutil.Client.getEncodeParam(TemplateId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("template_type", request.templateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateTemplate", "2015-12-15", "HTTPS", "PUT", "AK", "/templates/" + TemplateId + "", "none", req, runtime), new UpdateTemplateResponse());
    }

    public UpgradeClusterResponse upgradeCluster(String ClusterId, UpgradeClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeClusterWithOptions(ClusterId, request, headers, runtime);
    }

    public UpgradeClusterResponse upgradeClusterWithOptions(String ClusterId, UpgradeClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            body.put("component_name", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextVersion)) {
            body.put("next_version", request.nextVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpgradeCluster", "2015-12-15", "HTTPS", "POST", "AK", "/api/v2/clusters/" + ClusterId + "/upgrade", "none", req, runtime), new UpgradeClusterResponse());
    }

    public UpgradeClusterAddonsResponse upgradeClusterAddons(String ClusterId, UpgradeClusterAddonsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    public UpgradeClusterAddonsResponse upgradeClusterAddonsWithOptions(String ClusterId, UpgradeClusterAddonsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        return TeaModel.toModel(this.doROARequest("UpgradeClusterAddons", "2015-12-15", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/components/upgrade", "none", req, runtime), new UpgradeClusterAddonsResponse());
    }
}

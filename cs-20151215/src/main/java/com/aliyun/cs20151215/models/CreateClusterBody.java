// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterBody extends TeaModel {
    @NameInMap("cluster_type")
    @Validation(required = true)
    public String clusterType;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    @NameInMap("snat_entry")
    @Validation(required = true)
    public Boolean snatEntry;

    @NameInMap("endpoint_public_access")
    public Boolean endpointPublicAccess;

    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    @NameInMap("proxy_mode")
    public String proxyMode;

    @NameInMap("os_type")
    public String osType;

    @NameInMap("platform")
    public String platform;

    @NameInMap("node_port_range")
    public String nodePortRange;

    @NameInMap("key_pair")
    @Validation(required = true)
    public String keyPair;

    @NameInMap("login_password")
    @Validation(required = true)
    public String loginPassword;

    @NameInMap("master_instance_charge_type")
    public String masterInstanceChargeType;

    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    @NameInMap("master_period")
    public Integer masterPeriod;

    @NameInMap("worker_period")
    public Integer workerPeriod;

    @NameInMap("master_period_unit")
    public String masterPeriodUnit;

    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    @NameInMap("master_auto_renew")
    public Boolean masterAutoRenew;

    @NameInMap("master_auto_renew_period")
    public Integer masterAutoRenewPeriod;

    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    @NameInMap("worker_auto_renew_period")
    public Integer workerAutoRenewPeriod;

    @NameInMap("cpu_policy")
    public String cpuPolicy;

    @NameInMap("master_count")
    public Integer masterCount;

    @NameInMap("master_system_disk_category")
    @Validation(required = true)
    public String masterSystemDiskCategory;

    @NameInMap("master_system_disk_size")
    @Validation(required = true)
    public Integer masterSystemDiskSize;

    @NameInMap("runtime")
    public java.util.Map<String, ?> runtime;

    @NameInMap("num_of_nodes")
    @Validation(required = true)
    public Integer numOfNodes;

    @NameInMap("worker_system_disk_category")
    @Validation(required = true)
    public String workerSystemDiskCategory;

    @NameInMap("worker_system_disk_size")
    @Validation(required = true)
    public Integer workerSystemDiskSize;

    @NameInMap("worker_data_disk")
    public Boolean workerDataDisk;

    @NameInMap("vpcid")
    public String vpcid;

    @NameInMap("security_group_id")
    public String securityGroupId;

    @NameInMap("container_cidr")
    public String containerCidr;

    @NameInMap("service_cidr")
    public String serviceCidr;

    @NameInMap("disable_rollback")
    public Boolean disableRollback;

    @NameInMap("timeout_mins")
    public Integer timeoutMins;

    @NameInMap("vswitch_ids")
    public String vswitchIds;

    @NameInMap("private_zone")
    public String privateZone;

    @NameInMap("zone_id")
    public String zoneId;

    @NameInMap("profile")
    public String profile;

    @NameInMap("is_enterprise_security_group")
    public Boolean isEnterpriseSecurityGroup;

    @NameInMap("tags")
    public java.util.List<CreateClusterBodyTags> tags;

    @NameInMap("addons")
    public java.util.List<CreateClusterBodyAddons> addons;

    @NameInMap("taints")
    public java.util.List<CreateClusterBodyTaints> taints;

    @NameInMap("worker_data_disks")
    public java.util.List<CreateClusterBodyWorkerDataDisks> workerDataDisks;

    @NameInMap("master_vswitch_ids")
    public java.util.List<String> masterVswitchIds;

    @NameInMap("master_instance_types")
    public java.util.List<String> masterInstanceTypes;

    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    @NameInMap("worker_vswitch_ids")
    public java.util.List<String> workerVswitchIds;

    @NameInMap("pod_vswitch_ids")
    public java.util.List<String> podVswitchIds;

    public static CreateClusterBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterBody self = new CreateClusterBody();
        return TeaModel.build(map, self);
    }

    public static class CreateClusterBodyTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static CreateClusterBodyTags build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterBodyTags self = new CreateClusterBodyTags();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateClusterBodyAddons extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("config")
        public String config;

        @NameInMap("disabled")
        public Boolean disabled;

        public static CreateClusterBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterBodyAddons self = new CreateClusterBodyAddons();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateClusterBodyTaints extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        @NameInMap("effect")
        public String effect;

        public static CreateClusterBodyTaints build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterBodyTaints self = new CreateClusterBodyTaints();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateClusterBodyWorkerDataDisks extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("size")
        public String size;

        @NameInMap("encrypted")
        public String encrypted;

        public static CreateClusterBodyWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterBodyWorkerDataDisks self = new CreateClusterBodyWorkerDataDisks();
            return TeaModel.build(map, self);
        }

    }

}

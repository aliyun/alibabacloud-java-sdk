// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleOutClusterRequest extends TeaModel {
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    @NameInMap("count")
    public Long count;

    @NameInMap("cpu_policy")
    public String cpuPolicy;

    @NameInMap("image_id")
    public String imageId;

    @NameInMap("key_pair")
    public String keyPair;

    @NameInMap("login_password")
    public String loginPassword;

    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    @NameInMap("runtime")
    public Runtime runtime;

    @NameInMap("tags")
    public java.util.List<Tag> tags;

    @NameInMap("taints")
    public java.util.List<Taint> taints;

    @NameInMap("user_data")
    public String userData;

    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    @NameInMap("worker_auto_renew_period")
    public Long workerAutoRenewPeriod;

    @NameInMap("worker_data_disks")
    public java.util.List<ScaleOutClusterRequestWorkerDataDisks> workerDataDisks;

    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    @NameInMap("worker_period")
    public Long workerPeriod;

    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    @NameInMap("worker_system_disk_category")
    public String workerSystemDiskCategory;

    @NameInMap("worker_system_disk_size")
    public Long workerSystemDiskSize;

    public static ScaleOutClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutClusterRequest self = new ScaleOutClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleOutClusterRequest setCloudMonitorFlags(Boolean cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public ScaleOutClusterRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ScaleOutClusterRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    public ScaleOutClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ScaleOutClusterRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public ScaleOutClusterRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public ScaleOutClusterRequest setRdsInstances(java.util.List<String> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public ScaleOutClusterRequest setRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }
    public Runtime getRuntime() {
        return this.runtime;
    }

    public ScaleOutClusterRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public ScaleOutClusterRequest setTaints(java.util.List<Taint> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<Taint> getTaints() {
        return this.taints;
    }

    public ScaleOutClusterRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ScaleOutClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public ScaleOutClusterRequest setWorkerAutoRenew(Boolean workerAutoRenew) {
        this.workerAutoRenew = workerAutoRenew;
        return this;
    }
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    public ScaleOutClusterRequest setWorkerAutoRenewPeriod(Long workerAutoRenewPeriod) {
        this.workerAutoRenewPeriod = workerAutoRenewPeriod;
        return this;
    }
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    public ScaleOutClusterRequest setWorkerDataDisks(java.util.List<ScaleOutClusterRequestWorkerDataDisks> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<ScaleOutClusterRequestWorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    public ScaleOutClusterRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    public ScaleOutClusterRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    public ScaleOutClusterRequest setWorkerPeriod(Long workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    public ScaleOutClusterRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public ScaleOutClusterRequest setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        this.workerSystemDiskCategory = workerSystemDiskCategory;
        return this;
    }
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    public ScaleOutClusterRequest setWorkerSystemDiskSize(Long workerSystemDiskSize) {
        this.workerSystemDiskSize = workerSystemDiskSize;
        return this;
    }
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    public static class ScaleOutClusterRequestWorkerDataDisks extends TeaModel {
        @NameInMap("auto_snapshot_policy_id")
        public String autoSnapshotPolicyId;

        @NameInMap("category")
        public String category;

        @NameInMap("encrypted")
        public String encrypted;

        @NameInMap("size")
        public String size;

        public static ScaleOutClusterRequestWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterRequestWorkerDataDisks self = new ScaleOutClusterRequestWorkerDataDisks();
            return TeaModel.build(map, self);
        }

        public ScaleOutClusterRequestWorkerDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ScaleOutClusterRequestWorkerDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScaleOutClusterRequestWorkerDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ScaleOutClusterRequestWorkerDataDisks setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}

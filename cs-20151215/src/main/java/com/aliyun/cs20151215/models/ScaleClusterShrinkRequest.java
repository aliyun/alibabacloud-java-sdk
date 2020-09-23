// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterShrinkRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 扩容节点数。
    @NameInMap("count")
    public Long count;

    // keypair名称，和login_password二选一。
    @NameInMap("key_pair")
    public String keyPair;

    // SSH登录密码。和keypair二选一。
    @NameInMap("login_password")
    public String loginPassword;

    // 是否挂载数据盘。
    @NameInMap("worker_data_disk")
    public Boolean workerDataDisk;

    // Worker节点ECS规格类型。
    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    // 节点付费类型。
    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    // 节点包年包月时长。
    @NameInMap("worker_period")
    public Long workerPeriod;

    // 当指定为PrePaid的时候需要指定周期。
    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    // 节点是否开启Worker节点自动续费。
    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    // 自动续费周期。
    @NameInMap("worker_auto_renew_period")
    public Long workerAutoRenewPeriod;

    // 节点系统盘类型。
    @NameInMap("worker_system_disk_category")
    public String workerSystemDiskCategory;

    // 节点系统盘大小
    @NameInMap("worker_system_disk_size")
    public Long workerSystemDiskSize;

    // 节点是否安装云监控插件。
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    // 节点CPU策略。
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    // 失败是否回滚。
    @NameInMap("disable_rollback")
    public Boolean disableRollback;

    // 节点交换机ID列表。
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    // Worker数据盘类型、大小等配置的组合。
    @NameInMap("worker_data_disks")
    public java.util.List<ScaleClusterShrinkRequestWorkerDataDisks> workerDataDisks;

    // 集群标签。
    @NameInMap("tags")
    public java.util.List<ScaleClusterShrinkRequestTags> tags;

    // 节点污点标记。
    @NameInMap("taints")
    public String taintsShrink;

    public static ScaleClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterShrinkRequest self = new ScaleClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScaleClusterShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ScaleClusterShrinkRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ScaleClusterShrinkRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public ScaleClusterShrinkRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public ScaleClusterShrinkRequest setWorkerDataDisk(Boolean workerDataDisk) {
        this.workerDataDisk = workerDataDisk;
        return this;
    }
    public Boolean getWorkerDataDisk() {
        return this.workerDataDisk;
    }

    public ScaleClusterShrinkRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    public ScaleClusterShrinkRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    public ScaleClusterShrinkRequest setWorkerPeriod(Long workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    public ScaleClusterShrinkRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public ScaleClusterShrinkRequest setWorkerAutoRenew(Boolean workerAutoRenew) {
        this.workerAutoRenew = workerAutoRenew;
        return this;
    }
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    public ScaleClusterShrinkRequest setWorkerAutoRenewPeriod(Long workerAutoRenewPeriod) {
        this.workerAutoRenewPeriod = workerAutoRenewPeriod;
        return this;
    }
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    public ScaleClusterShrinkRequest setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        this.workerSystemDiskCategory = workerSystemDiskCategory;
        return this;
    }
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    public ScaleClusterShrinkRequest setWorkerSystemDiskSize(Long workerSystemDiskSize) {
        this.workerSystemDiskSize = workerSystemDiskSize;
        return this;
    }
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    public ScaleClusterShrinkRequest setCloudMonitorFlags(Boolean cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public ScaleClusterShrinkRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    public ScaleClusterShrinkRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public ScaleClusterShrinkRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public ScaleClusterShrinkRequest setWorkerDataDisks(java.util.List<ScaleClusterShrinkRequestWorkerDataDisks> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<ScaleClusterShrinkRequestWorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    public ScaleClusterShrinkRequest setTags(java.util.List<ScaleClusterShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ScaleClusterShrinkRequestTags> getTags() {
        return this.tags;
    }

    public ScaleClusterShrinkRequest setTaintsShrink(String taintsShrink) {
        this.taintsShrink = taintsShrink;
        return this;
    }
    public String getTaintsShrink() {
        return this.taintsShrink;
    }

    public static class ScaleClusterShrinkRequestWorkerDataDisks extends TeaModel {
        // 数据盘类型。
        @NameInMap("category")
        public String category;

        // 是否对数据盘加密。
        @NameInMap("encrypted")
        public String encrypted;

        // 数据盘大小。
        @NameInMap("size")
        public String size;

        public static ScaleClusterShrinkRequestWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterShrinkRequestWorkerDataDisks self = new ScaleClusterShrinkRequestWorkerDataDisks();
            return TeaModel.build(map, self);
        }

        public ScaleClusterShrinkRequestWorkerDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScaleClusterShrinkRequestWorkerDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ScaleClusterShrinkRequestWorkerDataDisks setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class ScaleClusterShrinkRequestTags extends TeaModel {
        // 标签值。
        @NameInMap("key")
        public String key;

        public static ScaleClusterShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterShrinkRequestTags self = new ScaleClusterShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public ScaleClusterShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}

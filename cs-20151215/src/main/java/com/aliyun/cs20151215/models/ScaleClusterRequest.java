// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterRequest extends TeaModel {
    // 节点是否安装云监控插件。
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    // 扩容节点数。
    @NameInMap("count")
    public Long count;

    // 节点CPU策略。
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    // 失败是否回滚。
    @NameInMap("disable_rollback")
    public Boolean disableRollback;

    // keypair名称，和login_password二选一。
    @NameInMap("key_pair")
    public String keyPair;

    // SSH登录密码。和keypair二选一。
    @NameInMap("login_password")
    public String loginPassword;

    // 集群标签。
    @NameInMap("tags")
    public java.util.List<ScaleClusterRequestTags> tags;

    // 节点污点标记。
    @NameInMap("taints")
    public java.util.List<ScaleClusterRequestTaints> taints;

    // 节点交换机ID列表。
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    // 节点是否开启Worker节点自动续费。
    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    // 自动续费周期。
    @NameInMap("worker_auto_renew_period")
    public Long workerAutoRenewPeriod;

    // 是否挂载数据盘。
    @NameInMap("worker_data_disk")
    public Boolean workerDataDisk;

    // Worker数据盘类型、大小等配置的组合。
    @NameInMap("worker_data_disks")
    public java.util.List<ScaleClusterRequestWorkerDataDisks> workerDataDisks;

    // 节点付费类型。
    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    // Worker节点ECS规格类型。
    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    // 节点包年包月时长。
    @NameInMap("worker_period")
    public Long workerPeriod;

    // 当指定为PrePaid的时候需要指定周期。
    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    // 节点系统盘类型。
    @NameInMap("worker_system_disk_category")
    public String workerSystemDiskCategory;

    // 节点系统盘大小
    @NameInMap("worker_system_disk_size")
    public Long workerSystemDiskSize;

    public static ScaleClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterRequest self = new ScaleClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleClusterRequest setCloudMonitorFlags(Boolean cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public ScaleClusterRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ScaleClusterRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    public ScaleClusterRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public ScaleClusterRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public ScaleClusterRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public ScaleClusterRequest setTags(java.util.List<ScaleClusterRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ScaleClusterRequestTags> getTags() {
        return this.tags;
    }

    public ScaleClusterRequest setTaints(java.util.List<ScaleClusterRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<ScaleClusterRequestTaints> getTaints() {
        return this.taints;
    }

    public ScaleClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public ScaleClusterRequest setWorkerAutoRenew(Boolean workerAutoRenew) {
        this.workerAutoRenew = workerAutoRenew;
        return this;
    }
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    public ScaleClusterRequest setWorkerAutoRenewPeriod(Long workerAutoRenewPeriod) {
        this.workerAutoRenewPeriod = workerAutoRenewPeriod;
        return this;
    }
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    public ScaleClusterRequest setWorkerDataDisk(Boolean workerDataDisk) {
        this.workerDataDisk = workerDataDisk;
        return this;
    }
    public Boolean getWorkerDataDisk() {
        return this.workerDataDisk;
    }

    public ScaleClusterRequest setWorkerDataDisks(java.util.List<ScaleClusterRequestWorkerDataDisks> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<ScaleClusterRequestWorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    public ScaleClusterRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    public ScaleClusterRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    public ScaleClusterRequest setWorkerPeriod(Long workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    public ScaleClusterRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public ScaleClusterRequest setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        this.workerSystemDiskCategory = workerSystemDiskCategory;
        return this;
    }
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    public ScaleClusterRequest setWorkerSystemDiskSize(Long workerSystemDiskSize) {
        this.workerSystemDiskSize = workerSystemDiskSize;
        return this;
    }
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    public static class ScaleClusterRequestTags extends TeaModel {
        // 标签值。
        @NameInMap("key")
        public String key;

        public static ScaleClusterRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterRequestTags self = new ScaleClusterRequestTags();
            return TeaModel.build(map, self);
        }

        public ScaleClusterRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ScaleClusterRequestTaints extends TeaModel {
        // 污点生效策略。
        @NameInMap("effect")
        public String effect;

        // 污点键。
        @NameInMap("key")
        public String key;

        // 污点值。
        @NameInMap("value")
        public String value;

        public static ScaleClusterRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterRequestTaints self = new ScaleClusterRequestTaints();
            return TeaModel.build(map, self);
        }

        public ScaleClusterRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ScaleClusterRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ScaleClusterRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ScaleClusterRequestWorkerDataDisks extends TeaModel {
        // 数据盘类型。
        @NameInMap("category")
        public String category;

        // 是否对数据盘加密。
        @NameInMap("encrypted")
        public String encrypted;

        // 数据盘大小。
        @NameInMap("size")
        public String size;

        public static ScaleClusterRequestWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterRequestWorkerDataDisks self = new ScaleClusterRequestWorkerDataDisks();
            return TeaModel.build(map, self);
        }

        public ScaleClusterRequestWorkerDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScaleClusterRequestWorkerDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ScaleClusterRequestWorkerDataDisks setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}

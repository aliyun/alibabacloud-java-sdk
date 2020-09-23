// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleOutClusterRequest extends TeaModel {
    // 扩容实例数量。
    @NameInMap("count")
    public Integer count;

    // Worker节点付费类型。
    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    // Worker节点包年包月时长。
    @NameInMap("worker_period")
    public Integer workerPeriod;

    // Worker节点预付费周期。
    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    // Worker节点是否开启自动续费。
    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    // Worker节点自动续费周期。
    @NameInMap("worker_auto_renew_period")
    public Integer workerAutoRenewPeriod;

    // Worker节点系统盘类型。
    @NameInMap("worker_system_disk_category")
    public String workerSystemDiskCategory;

    // Worker节点系统盘大小。
    @NameInMap("worker_system_disk_size")
    public Integer workerSystemDiskSize;

    // Worker节点是否挂载数据盘。
    @NameInMap("worker_data_disk")
    public Boolean workerDataDisk;

    // keypair名称，和login_password二选一。
    @NameInMap("key_pair")
    public String keyPair;

    // SSH登录密码，和key_pair二选一。
    @NameInMap("login_password")
    public String loginPassword;

    // 是否安装云监控插件。
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    // CPU策略，取值static或者none。
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    // 失败是否回滚。
    @NameInMap("disable_rollback")
    public Boolean disableRollback;

    // 自定义镜像ID。
    @NameInMap("image_id")
    public String imageId;

    // 用户自定义数据。
    @NameInMap("user_data")
    public String userData;

    // 容器引擎。
    @NameInMap("runtime")
    public ScaleOutClusterRequestRuntime runtime;

    // 节点交换机ID列表，交换机个数取值范围为1~3。
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    // Worker节点ECS规格类型代码。
    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    // RDS白名单实例列表。
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    // Worker数据盘类型、大小等配置的组合。
    @NameInMap("worker_data_disks")
    public java.util.List<ScaleOutClusterRequestWorkerDataDisks> workerDataDisks;

    // 节点标签。
    @NameInMap("tags")
    public java.util.List<ScaleOutClusterRequestTags> tags;

    // 节点污点信息。
    @NameInMap("taints")
    public java.util.List<ScaleOutClusterRequestTaints> taints;

    public static ScaleOutClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutClusterRequest self = new ScaleOutClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleOutClusterRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ScaleOutClusterRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    public ScaleOutClusterRequest setWorkerPeriod(Integer workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Integer getWorkerPeriod() {
        return this.workerPeriod;
    }

    public ScaleOutClusterRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public ScaleOutClusterRequest setWorkerAutoRenew(Boolean workerAutoRenew) {
        this.workerAutoRenew = workerAutoRenew;
        return this;
    }
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    public ScaleOutClusterRequest setWorkerAutoRenewPeriod(Integer workerAutoRenewPeriod) {
        this.workerAutoRenewPeriod = workerAutoRenewPeriod;
        return this;
    }
    public Integer getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    public ScaleOutClusterRequest setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        this.workerSystemDiskCategory = workerSystemDiskCategory;
        return this;
    }
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    public ScaleOutClusterRequest setWorkerSystemDiskSize(Integer workerSystemDiskSize) {
        this.workerSystemDiskSize = workerSystemDiskSize;
        return this;
    }
    public Integer getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    public ScaleOutClusterRequest setWorkerDataDisk(Boolean workerDataDisk) {
        this.workerDataDisk = workerDataDisk;
        return this;
    }
    public Boolean getWorkerDataDisk() {
        return this.workerDataDisk;
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

    public ScaleOutClusterRequest setCloudMonitorFlags(Boolean cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public ScaleOutClusterRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    public ScaleOutClusterRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public ScaleOutClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ScaleOutClusterRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ScaleOutClusterRequest setRuntime(ScaleOutClusterRequestRuntime runtime) {
        this.runtime = runtime;
        return this;
    }
    public ScaleOutClusterRequestRuntime getRuntime() {
        return this.runtime;
    }

    public ScaleOutClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public ScaleOutClusterRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    public ScaleOutClusterRequest setRdsInstances(java.util.List<String> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public ScaleOutClusterRequest setWorkerDataDisks(java.util.List<ScaleOutClusterRequestWorkerDataDisks> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<ScaleOutClusterRequestWorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    public ScaleOutClusterRequest setTags(java.util.List<ScaleOutClusterRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ScaleOutClusterRequestTags> getTags() {
        return this.tags;
    }

    public ScaleOutClusterRequest setTaints(java.util.List<ScaleOutClusterRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<ScaleOutClusterRequestTaints> getTaints() {
        return this.taints;
    }

    public static class ScaleOutClusterRequestRuntime extends TeaModel {
        // 容器引擎名称。
        @NameInMap("name")
        public String name;

        // 容器引擎版本。
        @NameInMap("version")
        public String version;

        public static ScaleOutClusterRequestRuntime build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterRequestRuntime self = new ScaleOutClusterRequestRuntime();
            return TeaModel.build(map, self);
        }

        public ScaleOutClusterRequestRuntime setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScaleOutClusterRequestRuntime setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ScaleOutClusterRequestWorkerDataDisks extends TeaModel {
        // 数据盘类型。
        @NameInMap("category")
        public String category;

        // 是否对数据盘加密。
        @NameInMap("encrypted")
        public String encrypted;

        // 数据盘大小。
        @NameInMap("size")
        public String size;

        public static ScaleOutClusterRequestWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterRequestWorkerDataDisks self = new ScaleOutClusterRequestWorkerDataDisks();
            return TeaModel.build(map, self);
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

    public static class ScaleOutClusterRequestTags extends TeaModel {
        // 标签名。
        @NameInMap("key")
        public String key;

        // 标签值。
        @NameInMap("value")
        public String value;

        public static ScaleOutClusterRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterRequestTags self = new ScaleOutClusterRequestTags();
            return TeaModel.build(map, self);
        }

        public ScaleOutClusterRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ScaleOutClusterRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ScaleOutClusterRequestTaints extends TeaModel {
        // 污点生效策略。
        @NameInMap("effect")
        public String effect;

        // 污点名。
        @NameInMap("key")
        public String key;

        // 污点值。
        @NameInMap("value")
        public String value;

        public static ScaleOutClusterRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterRequestTaints self = new ScaleOutClusterRequestTaints();
            return TeaModel.build(map, self);
        }

        public ScaleOutClusterRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ScaleOutClusterRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ScaleOutClusterRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

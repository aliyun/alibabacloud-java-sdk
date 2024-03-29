// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterRequest extends TeaModel {
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    @NameInMap("count")
    public Long count;

    @NameInMap("cpu_policy")
    public String cpuPolicy;

    @NameInMap("disable_rollback")
    public Boolean disableRollback;

    @NameInMap("key_pair")
    public String keyPair;

    @NameInMap("login_password")
    public String loginPassword;

    @NameInMap("tags")
    public java.util.List<ScaleClusterRequestTags> tags;

    @NameInMap("taints")
    public java.util.List<ScaleClusterRequestTaints> taints;

    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    @NameInMap("worker_auto_renew_period")
    public Long workerAutoRenewPeriod;

    @NameInMap("worker_data_disk")
    public Boolean workerDataDisk;

    @NameInMap("worker_data_disks")
    public java.util.List<ScaleClusterRequestWorkerDataDisks> workerDataDisks;

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
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

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
        @NameInMap("category")
        public String category;

        @NameInMap("encrypted")
        public String encrypted;

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

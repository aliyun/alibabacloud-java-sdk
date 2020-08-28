// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleOutClusterBody extends TeaModel {
    @NameInMap("count")
    @Validation(required = true)
    public Integer count;

    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    @NameInMap("worker_period")
    public Integer workerPeriod;

    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    @NameInMap("worker_auto_renew_period")
    public Integer workerAutoRenewPeriod;

    @NameInMap("worker_system_disk_category")
    public String workerSystemDiskCategory;

    @NameInMap("worker_system_disk_size")
    public Integer workerSystemDiskSize;

    @NameInMap("worker_data_disk")
    @Validation(required = true)
    public Boolean workerDataDisk;

    @NameInMap("key_pair")
    @Validation(required = true)
    public String keyPair;

    @NameInMap("login_password")
    @Validation(required = true)
    public String loginPassword;

    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    @NameInMap("cpu_policy")
    public String cpuPolicy;

    @NameInMap("disable_rollback")
    public Boolean disableRollback;

    @NameInMap("worker_data_disks")
    public java.util.List<ScaleOutClusterBodyWorkerDataDisks> workerDataDisks;

    @NameInMap("tags")
    public java.util.List<ScaleOutClusterBodyTags> tags;

    @NameInMap("taints")
    public java.util.List<ScaleOutClusterBodyTaints> taints;

    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    public static ScaleOutClusterBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutClusterBody self = new ScaleOutClusterBody();
        return TeaModel.build(map, self);
    }

    public static class ScaleOutClusterBodyWorkerDataDisks extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("size")
        public String size;

        @NameInMap("encrypted")
        public String encrypted;

        public static ScaleOutClusterBodyWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterBodyWorkerDataDisks self = new ScaleOutClusterBodyWorkerDataDisks();
            return TeaModel.build(map, self);
        }

    }

    public static class ScaleOutClusterBodyTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ScaleOutClusterBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterBodyTags self = new ScaleOutClusterBodyTags();
            return TeaModel.build(map, self);
        }

    }

    public static class ScaleOutClusterBodyTaints extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        @NameInMap("effect")
        public String effect;

        public static ScaleOutClusterBodyTaints build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterBodyTaints self = new ScaleOutClusterBodyTaints();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentNodesRequest extends TeaModel {
    @NameInMap("envUID")
    public String envUID;

    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    @NameInMap("rootPassword")
    public String rootPassword;

    @NameInMap("taints")
    public java.util.List<UpdateEnvironmentNodesRequestTaints> taints;

    // etcd数据盘
    @NameInMap("etcdDisk")
    public String etcdDisk;

    // k8s管控数据盘
    @NameInMap("tridentSystemDisk")
    public String tridentSystemDisk;

    // k8s管控数据盘大小
    @NameInMap("tridentSystemSizeDisk")
    public Integer tridentSystemSizeDisk;

    // 保留业务分区
    @NameInMap("applicationDisk")
    public String applicationDisk;

    public static UpdateEnvironmentNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentNodesRequest self = new UpdateEnvironmentNodesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentNodesRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

    public UpdateEnvironmentNodesRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public UpdateEnvironmentNodesRequest setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public UpdateEnvironmentNodesRequest setTaints(java.util.List<UpdateEnvironmentNodesRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<UpdateEnvironmentNodesRequestTaints> getTaints() {
        return this.taints;
    }

    public UpdateEnvironmentNodesRequest setEtcdDisk(String etcdDisk) {
        this.etcdDisk = etcdDisk;
        return this;
    }
    public String getEtcdDisk() {
        return this.etcdDisk;
    }

    public UpdateEnvironmentNodesRequest setTridentSystemDisk(String tridentSystemDisk) {
        this.tridentSystemDisk = tridentSystemDisk;
        return this;
    }
    public String getTridentSystemDisk() {
        return this.tridentSystemDisk;
    }

    public UpdateEnvironmentNodesRequest setTridentSystemSizeDisk(Integer tridentSystemSizeDisk) {
        this.tridentSystemSizeDisk = tridentSystemSizeDisk;
        return this;
    }
    public Integer getTridentSystemSizeDisk() {
        return this.tridentSystemSizeDisk;
    }

    public UpdateEnvironmentNodesRequest setApplicationDisk(String applicationDisk) {
        this.applicationDisk = applicationDisk;
        return this;
    }
    public String getApplicationDisk() {
        return this.applicationDisk;
    }

    public static class UpdateEnvironmentNodesRequestTaints extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static UpdateEnvironmentNodesRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvironmentNodesRequestTaints self = new UpdateEnvironmentNodesRequestTaints();
            return TeaModel.build(map, self);
        }

        public UpdateEnvironmentNodesRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public UpdateEnvironmentNodesRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateEnvironmentNodesRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

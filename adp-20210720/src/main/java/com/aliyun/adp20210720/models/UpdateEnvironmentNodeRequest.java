// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentNodeRequest extends TeaModel {
    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    @NameInMap("rootPassword")
    public String rootPassword;

    @NameInMap("taints")
    public java.util.List<UpdateEnvironmentNodeRequestTaints> taints;

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

    public static UpdateEnvironmentNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentNodeRequest self = new UpdateEnvironmentNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentNodeRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public UpdateEnvironmentNodeRequest setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public UpdateEnvironmentNodeRequest setTaints(java.util.List<UpdateEnvironmentNodeRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<UpdateEnvironmentNodeRequestTaints> getTaints() {
        return this.taints;
    }

    public UpdateEnvironmentNodeRequest setEtcdDisk(String etcdDisk) {
        this.etcdDisk = etcdDisk;
        return this;
    }
    public String getEtcdDisk() {
        return this.etcdDisk;
    }

    public UpdateEnvironmentNodeRequest setTridentSystemDisk(String tridentSystemDisk) {
        this.tridentSystemDisk = tridentSystemDisk;
        return this;
    }
    public String getTridentSystemDisk() {
        return this.tridentSystemDisk;
    }

    public UpdateEnvironmentNodeRequest setTridentSystemSizeDisk(Integer tridentSystemSizeDisk) {
        this.tridentSystemSizeDisk = tridentSystemSizeDisk;
        return this;
    }
    public Integer getTridentSystemSizeDisk() {
        return this.tridentSystemSizeDisk;
    }

    public UpdateEnvironmentNodeRequest setApplicationDisk(String applicationDisk) {
        this.applicationDisk = applicationDisk;
        return this;
    }
    public String getApplicationDisk() {
        return this.applicationDisk;
    }

    public static class UpdateEnvironmentNodeRequestTaints extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static UpdateEnvironmentNodeRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvironmentNodeRequestTaints self = new UpdateEnvironmentNodeRequestTaints();
            return TeaModel.build(map, self);
        }

        public UpdateEnvironmentNodeRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public UpdateEnvironmentNodeRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateEnvironmentNodeRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

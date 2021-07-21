// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentNodesRequest extends TeaModel {
    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    // master privateId
    @NameInMap("masterPrivateIPs")
    public java.util.List<String> masterPrivateIPs;

    @NameInMap("rootPassword")
    public String rootPassword;

    @NameInMap("taints")
    public java.util.List<AddEnvironmentNodesRequestTaints> taints;

    // work privateIp
    @NameInMap("workerPrivateIPs")
    public java.util.List<String> workerPrivateIPs;

    // etcd数据盘
    @NameInMap("diskAnnotationKeyEtcd")
    public String diskAnnotationKeyEtcd;

    // k8s管控数据盘
    @NameInMap("diskAnnotationKeyTridentSystem")
    public String diskAnnotationKeyTridentSystem;

    // k8s管控数据盘大小
    @NameInMap("diskAnnotationKeyTridentSystemSize")
    public Integer diskAnnotationKeyTridentSystemSize;

    // 保留业务分区
    @NameInMap("diskAnnotationKeyApplication")
    public String diskAnnotationKeyApplication;

    public static AddEnvironmentNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentNodesRequest self = new AddEnvironmentNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentNodesRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public AddEnvironmentNodesRequest setMasterPrivateIPs(java.util.List<String> masterPrivateIPs) {
        this.masterPrivateIPs = masterPrivateIPs;
        return this;
    }
    public java.util.List<String> getMasterPrivateIPs() {
        return this.masterPrivateIPs;
    }

    public AddEnvironmentNodesRequest setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public AddEnvironmentNodesRequest setTaints(java.util.List<AddEnvironmentNodesRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<AddEnvironmentNodesRequestTaints> getTaints() {
        return this.taints;
    }

    public AddEnvironmentNodesRequest setWorkerPrivateIPs(java.util.List<String> workerPrivateIPs) {
        this.workerPrivateIPs = workerPrivateIPs;
        return this;
    }
    public java.util.List<String> getWorkerPrivateIPs() {
        return this.workerPrivateIPs;
    }

    public AddEnvironmentNodesRequest setDiskAnnotationKeyEtcd(String diskAnnotationKeyEtcd) {
        this.diskAnnotationKeyEtcd = diskAnnotationKeyEtcd;
        return this;
    }
    public String getDiskAnnotationKeyEtcd() {
        return this.diskAnnotationKeyEtcd;
    }

    public AddEnvironmentNodesRequest setDiskAnnotationKeyTridentSystem(String diskAnnotationKeyTridentSystem) {
        this.diskAnnotationKeyTridentSystem = diskAnnotationKeyTridentSystem;
        return this;
    }
    public String getDiskAnnotationKeyTridentSystem() {
        return this.diskAnnotationKeyTridentSystem;
    }

    public AddEnvironmentNodesRequest setDiskAnnotationKeyTridentSystemSize(Integer diskAnnotationKeyTridentSystemSize) {
        this.diskAnnotationKeyTridentSystemSize = diskAnnotationKeyTridentSystemSize;
        return this;
    }
    public Integer getDiskAnnotationKeyTridentSystemSize() {
        return this.diskAnnotationKeyTridentSystemSize;
    }

    public AddEnvironmentNodesRequest setDiskAnnotationKeyApplication(String diskAnnotationKeyApplication) {
        this.diskAnnotationKeyApplication = diskAnnotationKeyApplication;
        return this;
    }
    public String getDiskAnnotationKeyApplication() {
        return this.diskAnnotationKeyApplication;
    }

    public static class AddEnvironmentNodesRequestTaints extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static AddEnvironmentNodesRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            AddEnvironmentNodesRequestTaints self = new AddEnvironmentNodesRequestTaints();
            return TeaModel.build(map, self);
        }

        public AddEnvironmentNodesRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public AddEnvironmentNodesRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddEnvironmentNodesRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

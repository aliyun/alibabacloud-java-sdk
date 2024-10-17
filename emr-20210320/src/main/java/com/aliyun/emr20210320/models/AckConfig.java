// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AckConfig extends TeaModel {
    /**
     * <p>ack集群id</p>
     */
    @NameInMap("AckInstanceId")
    public String ackInstanceId;

    @NameInMap("CustomAnnotations")
    public java.util.List<Tag> customAnnotations;

    @NameInMap("CustomLabels")
    public java.util.List<Tag> customLabels;

    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    @NameInMap("DataDiskStorageClass")
    public String dataDiskStorageClass;

    /**
     * <p>Pod的CPU限制值。</p>
     */
    @NameInMap("LimitCpu")
    public Float limitCpu;

    /**
     * <p>Pod的内存限制值。</p>
     */
    @NameInMap("LimitMemory")
    public Float limitMemory;

    @NameInMap("MountHostCgroup")
    public Boolean mountHostCgroup;

    /**
     * <p>ack 命名空间</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NodeAffinity")
    public String nodeAffinity;

    /**
     * <p>ack的节点标签限制</p>
     */
    @NameInMap("NodeSelectors")
    public java.util.List<Tag> nodeSelectors;

    @NameInMap("PodAffinity")
    public String podAffinity;

    @NameInMap("PodAntiAffinity")
    public String podAntiAffinity;

    @NameInMap("PreStartCommand")
    public java.util.List<String> preStartCommand;

    @NameInMap("Pvcs")
    public java.util.List<Pvcs> pvcs;

    /**
     * <p>Pod的CPU请求值</p>
     */
    @NameInMap("RequestCpu")
    public Float requestCpu;

    /**
     * <p>Pod的内存请求值。</p>
     */
    @NameInMap("RequestMemory")
    public Float requestMemory;

    /**
     * <p>ack的节点污点容忍</p>
     */
    @NameInMap("Tolerations")
    public java.util.List<Toleration> tolerations;

    @NameInMap("VolumeMounts")
    public java.util.List<VolumeMounts> volumeMounts;

    @NameInMap("Volumes")
    public java.util.List<Volumes> volumes;

    public static AckConfig build(java.util.Map<String, ?> map) throws Exception {
        AckConfig self = new AckConfig();
        return TeaModel.build(map, self);
    }

    public AckConfig setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public AckConfig setCustomAnnotations(java.util.List<Tag> customAnnotations) {
        this.customAnnotations = customAnnotations;
        return this;
    }
    public java.util.List<Tag> getCustomAnnotations() {
        return this.customAnnotations;
    }

    public AckConfig setCustomLabels(java.util.List<Tag> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.List<Tag> getCustomLabels() {
        return this.customLabels;
    }

    public AckConfig setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public AckConfig setDataDiskStorageClass(String dataDiskStorageClass) {
        this.dataDiskStorageClass = dataDiskStorageClass;
        return this;
    }
    public String getDataDiskStorageClass() {
        return this.dataDiskStorageClass;
    }

    public AckConfig setLimitCpu(Float limitCpu) {
        this.limitCpu = limitCpu;
        return this;
    }
    public Float getLimitCpu() {
        return this.limitCpu;
    }

    public AckConfig setLimitMemory(Float limitMemory) {
        this.limitMemory = limitMemory;
        return this;
    }
    public Float getLimitMemory() {
        return this.limitMemory;
    }

    public AckConfig setMountHostCgroup(Boolean mountHostCgroup) {
        this.mountHostCgroup = mountHostCgroup;
        return this;
    }
    public Boolean getMountHostCgroup() {
        return this.mountHostCgroup;
    }

    public AckConfig setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AckConfig setNodeAffinity(String nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }
    public String getNodeAffinity() {
        return this.nodeAffinity;
    }

    public AckConfig setNodeSelectors(java.util.List<Tag> nodeSelectors) {
        this.nodeSelectors = nodeSelectors;
        return this;
    }
    public java.util.List<Tag> getNodeSelectors() {
        return this.nodeSelectors;
    }

    public AckConfig setPodAffinity(String podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }
    public String getPodAffinity() {
        return this.podAffinity;
    }

    public AckConfig setPodAntiAffinity(String podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
        return this;
    }
    public String getPodAntiAffinity() {
        return this.podAntiAffinity;
    }

    public AckConfig setPreStartCommand(java.util.List<String> preStartCommand) {
        this.preStartCommand = preStartCommand;
        return this;
    }
    public java.util.List<String> getPreStartCommand() {
        return this.preStartCommand;
    }

    public AckConfig setPvcs(java.util.List<Pvcs> pvcs) {
        this.pvcs = pvcs;
        return this;
    }
    public java.util.List<Pvcs> getPvcs() {
        return this.pvcs;
    }

    public AckConfig setRequestCpu(Float requestCpu) {
        this.requestCpu = requestCpu;
        return this;
    }
    public Float getRequestCpu() {
        return this.requestCpu;
    }

    public AckConfig setRequestMemory(Float requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public Float getRequestMemory() {
        return this.requestMemory;
    }

    public AckConfig setTolerations(java.util.List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }
    public java.util.List<Toleration> getTolerations() {
        return this.tolerations;
    }

    public AckConfig setVolumeMounts(java.util.List<VolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public java.util.List<VolumeMounts> getVolumeMounts() {
        return this.volumeMounts;
    }

    public AckConfig setVolumes(java.util.List<Volumes> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<Volumes> getVolumes() {
        return this.volumes;
    }

    public static class Pvcs extends TeaModel {
        @NameInMap("DataDiskSize")
        public Long dataDiskSize;

        @NameInMap("DataDiskStorageClass")
        public String dataDiskStorageClass;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static Pvcs build(java.util.Map<String, ?> map) throws Exception {
            Pvcs self = new Pvcs();
            return TeaModel.build(map, self);
        }

        public Pvcs setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        public Pvcs setDataDiskStorageClass(String dataDiskStorageClass) {
            this.dataDiskStorageClass = dataDiskStorageClass;
            return this;
        }
        public String getDataDiskStorageClass() {
            return this.dataDiskStorageClass;
        }

        public Pvcs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Pvcs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class VolumeMounts extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static VolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            VolumeMounts self = new VolumeMounts();
            return TeaModel.build(map, self);
        }

        public VolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VolumeMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class Volumes extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static Volumes build(java.util.Map<String, ?> map) throws Exception {
            Volumes self = new Volumes();
            return TeaModel.build(map, self);
        }

        public Volumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Volumes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public Volumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

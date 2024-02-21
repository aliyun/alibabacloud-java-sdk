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

    /**
     * <p>ack的节点标签限制</p>
     */
    @NameInMap("NodeSelectors")
    public java.util.List<Tag> nodeSelectors;

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

    public AckConfig setNodeSelectors(java.util.List<Tag> nodeSelectors) {
        this.nodeSelectors = nodeSelectors;
        return this;
    }
    public java.util.List<Tag> getNodeSelectors() {
        return this.nodeSelectors;
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

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesRequest extends TeaModel {
    // CPU亲和策略。
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    // 是否格式化数据盘。
    @NameInMap("format_disk")
    public Boolean formatDisk;

    // 自定义镜像ID。
    @NameInMap("image_id")
    public String imageId;

    // 实例列表。
    @NameInMap("instances")
    public java.util.List<String> instances;

    // 是否为边缘节点。
    @NameInMap("is_edge_worker")
    public Boolean isEdgeWorker;

    // 是否保留实例名称。
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    // key_pair名称，与login_password二选一
    @NameInMap("key_pair")
    public String keyPair;

    // 节点池ID，欲将节点添加到哪个节点池中。。
    @NameInMap("nodepool_id")
    public String nodepoolId;

    // password，与key_pair二选一。
    @NameInMap("password")
    public String password;

    // RDS实例列表。
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    @NameInMap("runtime")
    public Runtime runtime;

    // 节点标签。
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    // 节点自定义数据。
    @NameInMap("user_data")
    public String userData;

    public static AttachInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesRequest self = new AttachInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstancesRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    public AttachInstancesRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    public AttachInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AttachInstancesRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public AttachInstancesRequest setIsEdgeWorker(Boolean isEdgeWorker) {
        this.isEdgeWorker = isEdgeWorker;
        return this;
    }
    public Boolean getIsEdgeWorker() {
        return this.isEdgeWorker;
    }

    public AttachInstancesRequest setKeepInstanceName(Boolean keepInstanceName) {
        this.keepInstanceName = keepInstanceName;
        return this;
    }
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    public AttachInstancesRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public AttachInstancesRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public AttachInstancesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AttachInstancesRequest setRdsInstances(java.util.List<String> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public AttachInstancesRequest setRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }
    public Runtime getRuntime() {
        return this.runtime;
    }

    public AttachInstancesRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public AttachInstancesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

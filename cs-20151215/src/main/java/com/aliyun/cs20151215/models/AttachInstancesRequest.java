// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesRequest extends TeaModel {
    /**
     * <p>The CPU management policy for the node. The following two policies are supported when the cluster version is 1.12.6 or later:</p>
     * <ul>
     * <li><code>static</code>: allows you to enhance CPU affinity and exclusivity for pods with specific resource characteristics on the node.</li>
     * <li><code>none</code>: uses the existing default CPU affinity policy.</li>
     * </ul>
     * <p>Default value: <code>none</code>.</p>
     * <blockquote>
     * <p>This parameter is not supported if nodepool_id is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    /**
     * <p>Specifies whether to store container data and images on a data cloud disk. Valid values:</p>
     * <ul>
     * <li><code>true</code>: stores container data and images on a data cloud disk.</li>
     * <li><code>false</code>: does not store container data and images on a data cloud disk.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>Data cloud disk mounting rules:</p>
     * <ul>
     * <li>If the ECS instance has data cloud disks attached and the file system of the last data cloud disk is not initialized, the system automatically formats the data cloud disk to EXT4 to store the /var/lib/docker and /var/lib/kubelet directories, which are the default data directories for the Docker container runtime and kubelet component.</li>
     * <li>If the ECS instance does not have data cloud disks attached, no new data cloud disk is attached.<blockquote>
     * <p>If you choose to store data on a data cloud disk and the ECS instance already has data cloud disks attached, the existing data on the data cloud disks will be lost. Back up your data first.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>The custom image ID.</p>
     * <ul>
     * <li>If you specify a custom image ID, the system cloud disk image of the instance is replaced with the custom image.</li>
     * <li>If you do not specify this parameter, the default system image is used.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not supported if nodepool_id is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The list of ECS instances to be added.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    /**
     * <p>Specifies whether the node to be added is an edge node, namely an ENS node. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The node to be added is an edge node.</li>
     * <li><code>false</code>: The node to be added is not an edge node.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <blockquote>
     * <p>If the node is an edge node, you must set this parameter to <code>true</code> to identify the node type as an ENS node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_edge_worker")
    public Boolean isEdgeWorker;

    /**
     * <p>Specifies whether to retain the original instance name. Valid values:</p>
     * <ul>
     * <li><code>true</code>: retains the instance name.</li>
     * <li><code>false</code>: does not retain the instance name.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The name of the key pair for the instances to be added. You can specify either the key_pair or password parameter, or leave both empty.</p>
     * <blockquote>
     * <p>This parameter is not supported if nodepool_id is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>security-key</p>
     */
    @NameInMap("key_pair")
    public String keyPair;

    /**
     * <p>The node pool ID. If you do not specify this parameter, the node is added to the default node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>np615c0e0966124216a0412e10afe0****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The SSH logon password for the instances to be added. You can specify either the key_pair or password parameter, or leave both empty.</p>
     * <p>The password must meet the following requirements:</p>
     * <ul>
     * <li>The password must be 8 to 30 characters in length.</li>
     * <li>The password must contain uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>The password cannot contain backslashes (\) or double quotation marks (&quot;).</li>
     * </ul>
     * <p>For security purposes, the password is encrypted during transmission.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello1234</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The list of ApsaraDB RDS instances.</p>
     */
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    /**
     * <p>The container runtime.</p>
     * <blockquote>
     * <p>This parameter is not supported if nodepool_id is specified.</p>
     * </blockquote>
     * <p>name: the name of the container runtime. ACK supports the following three container runtimes:</p>
     * <ul>
     * <li>containerd: recommended. Supported by all cluster versions.</li>
     * <li>Sandboxed-Container.runv: sandboxed container. Provides higher isolation. Supported by clusters runtime version 1.24 and earlier.</li>
     * <li>docker: supported by clusters runtime version 1.22 and earlier.</li>
     * </ul>
     * <p>Default value: containerd.</p>
     * <p>containerd: the version of the container runtime. The default value is the latest version.</p>
     * <p>For more information about the changes to the sandboxed container runtime, see <a href="https://help.aliyun.com/document_detail/160312.html">Sandboxed container runtime release notes</a>.</p>
     */
    @NameInMap("runtime")
    public Runtime runtime;

    /**
     * <p>The node labels. Label definition rules:</p>
     * <ul>
     * <li>A label is a case-sensitive key-value pair. You can configure up to 20 labels.</li>
     * <li>Label keys must be unique and can be up to 64 characters in length.</li>
     * <li>Label values can be empty and can be up to 128 characters in length.</li>
     * <li>Label keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>.</li>
     * </ul>
     * <p>For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</p>
     * <blockquote>
     * <p>This parameter is not supported if nodepool_id is specified.</p>
     * </blockquote>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The custom data for the node. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
     * <blockquote>
     * <p>This parameter is not supported if nodepool_id is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFDSyEi</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesRequest extends TeaModel {
    /**
     * <p>The CPU management policy of the node. The following policies are supported for clusters of version 1.12.6 or later:</p>
     * <ul>
     * <li><code>static</code>: Allows pods with certain resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
     * <li><code>none</code>: Uses the existing default CPU affinity scheme.</li>
     * </ul>
     * <p>Default value: <code>none</code>.</p>
     * <blockquote>
     * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
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
     * <li><p><code>true</code>: Stores container data and images on a data cloud disk.</p>
     * </li>
     * <li><p><code>false</code>: Does not store container data and images on a data cloud disk.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>Data cloud disk mounting rules:</p>
     * <ul>
     * <li>If the ECS instance has data cloud disks mounted and the file system of the last data cloud disk is not initialized, the system automatically formats the data cloud disk to EXT4 to store the content of /var/lib/docker and /var/lib/kubelet (the default data directories for the Docker container runtime and the kubelet component, respectively).</li>
     * <li>If the ECS instance has no data cloud disks mounted, no new data cloud disk is mounted.<blockquote>
     * <p>If you choose to store data on a data cloud disk and the ECS instance already has data cloud disks mounted, existing data on the data cloud disk is lost. Back up your data in advance.</p>
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
     * <li><p>If you specify a custom image ID, the system cloud disk image of the instance is replaced with the custom image.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the default system image is used.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
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
     * <p>Specifies whether the node to be added is an edge node, that is, an Edge Node Service (ENS) node. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The node to be added is an edge node.</p>
     * </li>
     * <li><p><code>false</code>: The node to be added is not an edge node.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <blockquote>
     * <p>If the node is an edge node, set this parameter to <code>true</code> to identify the node type as an ENS node.</p>
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
     * <li><p><code>true</code>: Retains the instance name.</p>
     * </li>
     * <li><p><code>false</code>: Does not retain the instance name.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The name of the key pair for the instances to be added. Specify either key_pair or password. You can also leave both parameters empty.</p>
     * <blockquote>
     * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
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
     * <p>The SSH logon password for the instances to be added. Specify either key_pair or password. You can also leave both parameters empty.</p>
     * <p>The password must meet the following requirements:</p>
     * <ul>
     * <li>The password must be 8 to 30 characters in length.</li>
     * <li>The password must contain uppercase letters, lowercase letters, digits, and special characters at the same time.</li>
     * <li>The password cannot contain backslashes (\) or double quotation marks (&quot;).</li>
     * </ul>
     * <p>The password is encrypted during transmission for security purposes.</p>
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
     * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
     * </blockquote>
     * <p>name: The name of the container runtime. ACK supports the following three container runtimes:</p>
     * <ul>
     * <li>containerd: Recommended. Supported by all cluster versions.</li>
     * <li>Sandboxed-Container.runv: Sandboxed container that provides higher isolation. Supported by clusters of version 1.24 or earlier.</li>
     * <li>docker: Supported by clusters of version 1.22 or earlier.</li>
     * </ul>
     * <p>Default value: containerd.</p>
     * <p>containerd: The container runtime version. Default value: the latest version.</p>
     * <p>For more information about changes to the sandboxed container runtime, see <a href="https://help.aliyun.com/document_detail/160312.html">Release notes for the sandboxed container runtime</a>.</p>
     */
    @NameInMap("runtime")
    public Runtime runtime;

    /**
     * <p>The node labels. Label definition rules:</p>
     * <ul>
     * <li>Labels are case-sensitive key-value pairs. You can set up to 20 labels.</li>
     * <li>Label keys cannot be duplicate and can be up to 64 characters in length.</li>
     * <li>Label values can be empty and can be up to 128 characters in length.</li>
     * <li>Label keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>.</li>
     * </ul>
     * <p>For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</p>
     * <blockquote>
     * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
     * </blockquote>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The instance user data of the node. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
     * <blockquote>
     * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
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

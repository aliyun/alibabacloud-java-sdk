// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesRequest extends TeaModel {
    /**
     * <p>The CPU management policy. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.</p>
     * <ul>
     * <li><code>static</code>: This policy allows pods with specific resource characteristics on the node to be configured with enhanced CPU affinity and exclusivity.</li>
     * <li><code>none</code>: The default CPU affinity is used.</li>
     * </ul>
     * <p>Default value: <code>none</code>.</p>
     * <blockquote>
     * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    /**
     * <p>Specifies whether to store container data and images on data disks. Valid values:</p>
     * <ul>
     * <li><code>true</code>: stores container data and images on data disks.</li>
     * <li><code>false</code>: does not store container data or images on data disks.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>How a data disk is mounted:</p>
     * <ul>
     * <li>If the ECS instances are already mounted with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4 and mounts it to /var/lib/docker and /var/lib/kubelet.</li>
     * <li>If no data disk is attached to the ECS instances, the system does not purchase a new data disk.</li>
     * </ul>
     * <blockquote>
     * <p> If you choose to store container data and images on data disks and a data disk is already mounted to the ECS instance, the original data on this data disk will be cleared. You can back up the disk to avoid data loss.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>The ID of the custom image. If you do not set this parameter, the default system image is used.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you specify a custom image, the custom image is used to deploy the operating systems on the system disks of the nodes.</p>
     * </li>
     * <li><p>This parameter is not supported after you specify <code>nodepool_id</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The ECS instances to be added.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    /**
     * <p>Specifies whether the nodes that you want to add are Edge Node Service (ENS) nodes. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The nodes that you want to add are ENS nodes.</li>
     * <li><code>false</code>: The nodes that you want to add are not ENS nodes.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <blockquote>
     * <p> If the nodes that you want to add are ENS nodes, you must set this parameter to <code>true</code>. This allows you to identify these nodes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_edge_worker")
    public Boolean isEdgeWorker;

    /**
     * <p>Specifies whether to retain the instance name. Valid values:</p>
     * <ul>
     * <li><code>true</code>: retains the instance name.</li>
     * <li><code>false</code>: does not retain the instance name.</li>
     * </ul>
     * <p>Default value: <code>true</code></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The name of the key pair that is used to log on to the ECS instances. You must set key_pair or <code>login_password</code>.</p>
     * <blockquote>
     * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>secrity-key</p>
     */
    @NameInMap("key_pair")
    public String keyPair;

    /**
     * <p>The node pool ID. If you do not set this parameter, the nodes are added to the default node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>np615c0e0966124216a0412e10afe0****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The SSH logon password that is used to log on to the ECS instances. You must set login_password or <code>key_pair</code>. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It cannot contain backslashes (\\) or double quotation marks (&quot;).</p>
     * <p>For security considerations, the password is encrypted during data transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello1234</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>A list of ApsaraDB RDS instances.</p>
     */
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    /**
     * <p>The container runtime.</p>
     * <blockquote>
     * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
     * </blockquote>
     */
    @NameInMap("runtime")
    public Runtime runtime;

    /**
     * <p>The labels that you want to add to nodes. You must add labels based on the following rules:</p>
     * <ul>
     * <li>Each label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
     * <li>A key must be unique and cannot exceed 64 characters in length. A value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
     * </blockquote>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>User-defined data. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate user data</a>.</p>
     * <blockquote>
     * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesToNodePoolRequest extends TeaModel {
    /**
     * <p>Specifies whether to store container data and images on data disks. Valid values:</p>
     * <ul>
     * <li><code>true</code>: stores container data and images on data disks.</li>
     * <li><code>false</code>: does not store container data or images on data disks.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>How to mount a data disk:</p>
     * <ul>
     * <li>If the ECS instances are already mounted with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4 and mounts it to /var/lib/docker and /var/lib/kubelet.</li>
     * <li>If no data disk is attached to the ECS instances, the system does not purchase a new data disk.</li>
     * </ul>
     * <blockquote>
     * <p>If you choose to store container data and images on a data disk and the data disk is already mounted to the ECS instance, the existing data on the data disk will be cleared. You can back up the disk to avoid data loss.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>The IDs of the instances to be added.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    /**
     * <p>Specifies whether to retain the instance name. Valid values:</p>
     * <ul>
     * <li><code>true</code>: retains the instance name.</li>
     * <li><code>false</code>: does not retain the instance name.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The SSH password that is used to log on to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello1234</p>
     */
    @NameInMap("password")
    public String password;

    public static AttachInstancesToNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesToNodePoolRequest self = new AttachInstancesToNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstancesToNodePoolRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    public AttachInstancesToNodePoolRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public AttachInstancesToNodePoolRequest setKeepInstanceName(Boolean keepInstanceName) {
        this.keepInstanceName = keepInstanceName;
        return this;
    }
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    public AttachInstancesToNodePoolRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesToNodePoolRequest extends TeaModel {
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
     * <li>If the ECS instance has data cloud disks attached and the file system of the last data cloud disk is not initialized, the system automatically formats the data cloud disk as EXT4 to store /var/lib/docker and /var/lib/kubelet.</li>
     * <li>If the ECS instance has no data cloud disks attached, no new data cloud disk is mounted.<blockquote>
     * <p>If you choose to store data on a data cloud disk and the ECS instance already has data cloud disks attached, existing data on the data cloud disk is lost. Back up your data in advance.</p>
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
     * <p>The list of ECS instances to be added.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    /**
     * <p>Specifies whether to retain the original instance name. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Retains the instance name.</p>
     * </li>
     * <li><p><code>false</code>: Does not retain the instance name.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The SSH logon password of the instances to be added.</p>
     * 
     * <strong>example:</strong>
     * <hr>
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

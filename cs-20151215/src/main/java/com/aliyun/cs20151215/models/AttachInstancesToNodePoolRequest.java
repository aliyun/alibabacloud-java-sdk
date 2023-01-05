// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesToNodePoolRequest extends TeaModel {
    @NameInMap("format_disk")
    public Boolean formatDisk;

    @NameInMap("instances")
    public java.util.List<String> instances;

    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlockStatusRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lines")
    public java.util.List<String> lines;

    @NameInMap("Status")
    public String status;

    public static ModifyBlockStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlockStatusRequest self = new ModifyBlockStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBlockStatusRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ModifyBlockStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBlockStatusRequest setLines(java.util.List<String> lines) {
        this.lines = lines;
        return this;
    }
    public java.util.List<String> getLines() {
        return this.lines;
    }

    public ModifyBlockStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

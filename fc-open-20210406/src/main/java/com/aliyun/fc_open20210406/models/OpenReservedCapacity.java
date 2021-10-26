// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class OpenReservedCapacity extends TeaModel {
    // createdTime
    @NameInMap("createdTime")
    public String createdTime;

    // cu
    @NameInMap("cu")
    public Long cu;

    // deadline
    @NameInMap("deadline")
    public String deadline;

    // instanceId
    @NameInMap("instanceId")
    public String instanceId;

    // isRefunded
    @NameInMap("isRefunded")
    public String isRefunded;

    // lastModifiedTime
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    public static OpenReservedCapacity build(java.util.Map<String, ?> map) throws Exception {
        OpenReservedCapacity self = new OpenReservedCapacity();
        return TeaModel.build(map, self);
    }

    public OpenReservedCapacity setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public OpenReservedCapacity setCu(Long cu) {
        this.cu = cu;
        return this;
    }
    public Long getCu() {
        return this.cu;
    }

    public OpenReservedCapacity setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }
    public String getDeadline() {
        return this.deadline;
    }

    public OpenReservedCapacity setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OpenReservedCapacity setIsRefunded(String isRefunded) {
        this.isRefunded = isRefunded;
        return this;
    }
    public String getIsRefunded() {
        return this.isRefunded;
    }

    public OpenReservedCapacity setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

}

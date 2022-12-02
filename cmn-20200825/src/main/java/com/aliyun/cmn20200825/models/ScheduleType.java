// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ScheduleType extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Key")
    public String key;

    @NameInMap("RelatedWorker")
    public java.util.List<String> relatedWorker;

    @NameInMap("ScheduleTypeId")
    public String scheduleTypeId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Value")
    public String value;

    public static ScheduleType build(java.util.Map<String, ?> map) throws Exception {
        ScheduleType self = new ScheduleType();
        return TeaModel.build(map, self);
    }

    public ScheduleType setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ScheduleType setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ScheduleType setRelatedWorker(java.util.List<String> relatedWorker) {
        this.relatedWorker = relatedWorker;
        return this;
    }
    public java.util.List<String> getRelatedWorker() {
        return this.relatedWorker;
    }

    public ScheduleType setScheduleTypeId(String scheduleTypeId) {
        this.scheduleTypeId = scheduleTypeId;
        return this;
    }
    public String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    public ScheduleType setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ScheduleType setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ScheduleType setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

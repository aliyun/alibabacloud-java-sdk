// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ScheduleType extends TeaModel {
    // 资源一级ID
    @NameInMap("ScheduleTypeId")
    public String scheduleTypeId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 值班类型key
    @NameInMap("Key")
    public String key;

    // 值班类型value
    @NameInMap("Value")
    public String value;

    // 值班类型状态
    @NameInMap("Status")
    public String status;

    // relatedWorkerStr
    @NameInMap("RelatedWorker")
    public java.util.List<String> relatedWorker;

    public static ScheduleType build(java.util.Map<String, ?> map) throws Exception {
        ScheduleType self = new ScheduleType();
        return TeaModel.build(map, self);
    }

    public ScheduleType setScheduleTypeId(String scheduleTypeId) {
        this.scheduleTypeId = scheduleTypeId;
        return this;
    }
    public String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    public ScheduleType setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ScheduleType setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ScheduleType setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ScheduleType setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ScheduleType setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ScheduleType setRelatedWorker(java.util.List<String> relatedWorker) {
        this.relatedWorker = relatedWorker;
        return this;
    }
    public java.util.List<String> getRelatedWorker() {
        return this.relatedWorker;
    }

}

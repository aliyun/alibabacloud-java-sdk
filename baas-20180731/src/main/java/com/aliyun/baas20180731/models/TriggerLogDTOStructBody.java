// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class TriggerLogDTOStructBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("Position")
    public PositionStructBody position;

    @NameInMap("Status")
    public String status;

    @NameInMap("Uuid")
    public String uuid;

    public static TriggerLogDTOStructBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerLogDTOStructBody self = new TriggerLogDTOStructBody();
        return TeaModel.build(map, self);
    }

    public TriggerLogDTOStructBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TriggerLogDTOStructBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public TriggerLogDTOStructBody setPosition(PositionStructBody position) {
        this.position = position;
        return this;
    }
    public PositionStructBody getPosition() {
        return this.position;
    }

    public TriggerLogDTOStructBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TriggerLogDTOStructBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

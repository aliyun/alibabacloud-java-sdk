// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCreateSoundCodeLabelRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    @NameInMap("Total")
    public Integer total;

    public static BatchCreateSoundCodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSoundCodeLabelRequest self = new BatchCreateSoundCodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateSoundCodeLabelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BatchCreateSoundCodeLabelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchCreateSoundCodeLabelRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public BatchCreateSoundCodeLabelRequest setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}

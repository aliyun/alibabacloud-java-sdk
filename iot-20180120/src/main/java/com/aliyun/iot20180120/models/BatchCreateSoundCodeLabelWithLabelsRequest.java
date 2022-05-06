// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCreateSoundCodeLabelWithLabelsRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Labels")
    public java.util.List<String> labels;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    public static BatchCreateSoundCodeLabelWithLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSoundCodeLabelWithLabelsRequest self = new BatchCreateSoundCodeLabelWithLabelsRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateSoundCodeLabelWithLabelsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BatchCreateSoundCodeLabelWithLabelsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchCreateSoundCodeLabelWithLabelsRequest setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public BatchCreateSoundCodeLabelWithLabelsRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

}

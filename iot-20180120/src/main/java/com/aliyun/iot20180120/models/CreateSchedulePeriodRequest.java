// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSchedulePeriodRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("ScheduleCode")
    public String scheduleCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
     */
    @NameInMap("SoundCodeContent")
    public String soundCodeContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateSchedulePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulePeriodRequest self = new CreateSchedulePeriodRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchedulePeriodRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSchedulePeriodRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateSchedulePeriodRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSchedulePeriodRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public CreateSchedulePeriodRequest setSoundCodeContent(String soundCodeContent) {
        this.soundCodeContent = soundCodeContent;
        return this;
    }
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

    public CreateSchedulePeriodRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

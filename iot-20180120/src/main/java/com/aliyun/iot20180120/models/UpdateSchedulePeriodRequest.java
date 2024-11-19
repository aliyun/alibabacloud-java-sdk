// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSchedulePeriodRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
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
    @NameInMap("PeriodCode")
    public String periodCode;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
     */
    @NameInMap("SoundCodeContent")
    public String soundCodeContent;

    /**
     * <strong>example:</strong>
     * <p>00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static UpdateSchedulePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchedulePeriodRequest self = new UpdateSchedulePeriodRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchedulePeriodRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSchedulePeriodRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateSchedulePeriodRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSchedulePeriodRequest setPeriodCode(String periodCode) {
        this.periodCode = periodCode;
        return this;
    }
    public String getPeriodCode() {
        return this.periodCode;
    }

    public UpdateSchedulePeriodRequest setSoundCodeContent(String soundCodeContent) {
        this.soundCodeContent = soundCodeContent;
        return this;
    }
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

    public UpdateSchedulePeriodRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

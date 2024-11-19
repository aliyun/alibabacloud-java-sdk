// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeLabelRequest extends TeaModel {
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
     * <p>test</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("ScheduleCode")
    public String scheduleCode;

    public static CreateSoundCodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSoundCodeLabelRequest self = new CreateSoundCodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateSoundCodeLabelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSoundCodeLabelRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CreateSoundCodeLabelRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

}

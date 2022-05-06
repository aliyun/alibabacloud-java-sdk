// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSchedulePeriodRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PeriodCode")
    public String periodCode;

    public static DeleteSchedulePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedulePeriodRequest self = new DeleteSchedulePeriodRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSchedulePeriodRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteSchedulePeriodRequest setPeriodCode(String periodCode) {
        this.periodCode = periodCode;
        return this;
    }
    public String getPeriodCode() {
        return this.periodCode;
    }

}

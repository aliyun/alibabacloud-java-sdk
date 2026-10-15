// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerUserAlarmThresholdRequest extends TeaModel {
    /**
     * <p>The type of alert. This parameter is required. Set the value to quota_low_balance, which indicates a low quota alert.</p>
     * 
     * <strong>example:</strong>
     * <p>quota_low_balance</p>
     */
    @NameInMap("AlarmType")
    public String alarmType;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static QueryResellerUserAlarmThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerUserAlarmThresholdRequest self = new QueryResellerUserAlarmThresholdRequest();
        return TeaModel.build(map, self);
    }

    public QueryResellerUserAlarmThresholdRequest setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public QueryResellerUserAlarmThresholdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

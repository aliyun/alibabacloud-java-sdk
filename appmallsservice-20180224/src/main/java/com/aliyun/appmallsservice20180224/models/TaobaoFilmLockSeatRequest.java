// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmLockSeatRequest extends TeaModel {
    @NameInMap("ExtUserId")
    public String extUserId;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("ParamsJson")
    public String paramsJson;

    @NameInMap("ScheduleId")
    public Long scheduleId;

    @NameInMap("SeatIds")
    public String seatIds;

    @NameInMap("SeatNames")
    public String seatNames;

    public static TaobaoFilmLockSeatRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmLockSeatRequest self = new TaobaoFilmLockSeatRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmLockSeatRequest setExtUserId(String extUserId) {
        this.extUserId = extUserId;
        return this;
    }
    public String getExtUserId() {
        return this.extUserId;
    }

    public TaobaoFilmLockSeatRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public TaobaoFilmLockSeatRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

    public TaobaoFilmLockSeatRequest setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public Long getScheduleId() {
        return this.scheduleId;
    }

    public TaobaoFilmLockSeatRequest setSeatIds(String seatIds) {
        this.seatIds = seatIds;
        return this;
    }
    public String getSeatIds() {
        return this.seatIds;
    }

    public TaobaoFilmLockSeatRequest setSeatNames(String seatNames) {
        this.seatNames = seatNames;
        return this;
    }
    public String getSeatNames() {
        return this.seatNames;
    }

}

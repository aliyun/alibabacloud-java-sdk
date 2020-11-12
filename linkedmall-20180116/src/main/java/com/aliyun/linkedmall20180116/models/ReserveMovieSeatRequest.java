// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReserveMovieSeatRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ScheduleId")
    @Validation(required = true)
    public Long scheduleId;

    @NameInMap("SeatIds")
    @Validation(required = true)
    public String seatIds;

    @NameInMap("SeatNames")
    @Validation(required = true)
    public String seatNames;

    @NameInMap("BizUid")
    @Validation(required = true)
    public String bizUid;

    @NameInMap("Mobile")
    @Validation(required = true)
    public String mobile;

    @NameInMap("ExtJson")
    public String extJson;

    public static ReserveMovieSeatRequest build(java.util.Map<String, ?> map) throws Exception {
        ReserveMovieSeatRequest self = new ReserveMovieSeatRequest();
        return TeaModel.build(map, self);
    }

    public ReserveMovieSeatRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ReserveMovieSeatRequest setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public Long getScheduleId() {
        return this.scheduleId;
    }

    public ReserveMovieSeatRequest setSeatIds(String seatIds) {
        this.seatIds = seatIds;
        return this;
    }
    public String getSeatIds() {
        return this.seatIds;
    }

    public ReserveMovieSeatRequest setSeatNames(String seatNames) {
        this.seatNames = seatNames;
        return this;
    }
    public String getSeatNames() {
        return this.seatNames;
    }

    public ReserveMovieSeatRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public ReserveMovieSeatRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ReserveMovieSeatRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

}

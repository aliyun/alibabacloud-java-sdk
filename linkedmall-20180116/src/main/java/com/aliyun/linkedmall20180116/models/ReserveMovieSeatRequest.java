// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReserveMovieSeatRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******003</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22******85759</p>
     */
    @NameInMap("BizUid")
    public String bizUid;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtJson")
    public String extJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>186******71</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9******15</p>
     */
    @NameInMap("ScheduleId")
    public Long scheduleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SeatIds")
    public String seatIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SeatNames")
    public String seatNames;

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

    public ReserveMovieSeatRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public ReserveMovieSeatRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public ReserveMovieSeatRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
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

}

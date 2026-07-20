// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EstimatedPriceQueryV2Request extends TeaModel {
    /**
     * <p>The category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flight</p>
     */
    @NameInMap("biz_type")
    public String bizType;

    /**
     * <p>The departure date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2000-01-01</p>
     */
    @NameInMap("depart_date")
    public String departDate;

    /**
     * <p>The departure or check-in city.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("from_city")
    public String fromCity;

    /**
     * <p>The arrival date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2000-01-01</p>
     */
    @NameInMap("leave_date")
    public String leaveDate;

    /**
     * <p>The arrival or check-out city.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>北京</p>
     */
    @NameInMap("to_city")
    public String toCity;

    /**
     * <p>The user ID. This parameter is required for the hotel category.</p>
     * 
     * <strong>example:</strong>
     * <p>Fei123</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static EstimatedPriceQueryV2Request build(java.util.Map<String, ?> map) throws Exception {
        EstimatedPriceQueryV2Request self = new EstimatedPriceQueryV2Request();
        return TeaModel.build(map, self);
    }

    public EstimatedPriceQueryV2Request setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public EstimatedPriceQueryV2Request setDepartDate(String departDate) {
        this.departDate = departDate;
        return this;
    }
    public String getDepartDate() {
        return this.departDate;
    }

    public EstimatedPriceQueryV2Request setFromCity(String fromCity) {
        this.fromCity = fromCity;
        return this;
    }
    public String getFromCity() {
        return this.fromCity;
    }

    public EstimatedPriceQueryV2Request setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
        return this;
    }
    public String getLeaveDate() {
        return this.leaveDate;
    }

    public EstimatedPriceQueryV2Request setToCity(String toCity) {
        this.toCity = toCity;
        return this;
    }
    public String getToCity() {
        return this.toCity;
    }

    public EstimatedPriceQueryV2Request setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

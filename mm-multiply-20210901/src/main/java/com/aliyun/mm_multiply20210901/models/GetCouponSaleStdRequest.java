// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetCouponSaleStdRequest extends TeaModel {
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponPlatformType")
    public Integer couponPlatformType;

    @NameInMap("CouponTemplateCd")
    public String couponTemplateCd;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static GetCouponSaleStdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCouponSaleStdRequest self = new GetCouponSaleStdRequest();
        return TeaModel.build(map, self);
    }

    public GetCouponSaleStdRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public GetCouponSaleStdRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetCouponSaleStdRequest setCouponPlatformType(Integer couponPlatformType) {
        this.couponPlatformType = couponPlatformType;
        return this;
    }
    public Integer getCouponPlatformType() {
        return this.couponPlatformType;
    }

    public GetCouponSaleStdRequest setCouponTemplateCd(String couponTemplateCd) {
        this.couponTemplateCd = couponTemplateCd;
        return this;
    }
    public String getCouponTemplateCd() {
        return this.couponTemplateCd;
    }

    public GetCouponSaleStdRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public GetCouponSaleStdRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetCouponItemSaleStdRequest extends TeaModel {
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponPlatformType")
    public Integer couponPlatformType;

    @NameInMap("CouponTemplateCd")
    public String couponTemplateCd;

    @NameInMap("OrderByField")
    public String orderByField;

    @NameInMap("OrderByMethod")
    public String orderByMethod;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static GetCouponItemSaleStdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCouponItemSaleStdRequest self = new GetCouponItemSaleStdRequest();
        return TeaModel.build(map, self);
    }

    public GetCouponItemSaleStdRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public GetCouponItemSaleStdRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetCouponItemSaleStdRequest setCouponPlatformType(Integer couponPlatformType) {
        this.couponPlatformType = couponPlatformType;
        return this;
    }
    public Integer getCouponPlatformType() {
        return this.couponPlatformType;
    }

    public GetCouponItemSaleStdRequest setCouponTemplateCd(String couponTemplateCd) {
        this.couponTemplateCd = couponTemplateCd;
        return this;
    }
    public String getCouponTemplateCd() {
        return this.couponTemplateCd;
    }

    public GetCouponItemSaleStdRequest setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public GetCouponItemSaleStdRequest setOrderByMethod(String orderByMethod) {
        this.orderByMethod = orderByMethod;
        return this;
    }
    public String getOrderByMethod() {
        return this.orderByMethod;
    }

    public GetCouponItemSaleStdRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetCouponItemSaleStdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCouponItemSaleStdRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public GetCouponItemSaleStdRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}

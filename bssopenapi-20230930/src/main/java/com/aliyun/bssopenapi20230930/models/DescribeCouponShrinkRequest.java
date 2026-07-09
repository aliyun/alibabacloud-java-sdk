// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeCouponShrinkRequest extends TeaModel {
    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>351430260343</p>
     */
    @NameInMap("CouponId")
    public Long couponId;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>554863270150</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("CouponTemplateIdList")
    public String couponTemplateIdListShrink;

    /**
     * <p>The coupon type.</p>
     * 
     * <strong>example:</strong>
     * <p>CERTAIN</p>
     */
    @NameInMap("CouponType")
    public String couponType;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The enterprise and account list. If this parameter is left empty, the current account is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    /**
     * <p>The effective end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1708423156000</p>
     */
    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    /**
     * <p>The effective start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1684750028000</p>
     */
    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    /**
     * <p>The expiration end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1708423156000</p>
     */
    @NameInMap("ExpireEndDate")
    public Long expireEndDate;

    /**
     * <p>The expiration start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1684750028000</p>
     */
    @NameInMap("ExpireStartDate")
    public Long expireStartDate;

    @NameInMap("IncludeShare")
    public Boolean includeShare;

    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The primary campaign information.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeCouponShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponShrinkRequest self = new DescribeCouponShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCouponShrinkRequest setCouponId(Long couponId) {
        this.couponId = couponId;
        return this;
    }
    public Long getCouponId() {
        return this.couponId;
    }

    public DescribeCouponShrinkRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public DescribeCouponShrinkRequest setCouponTemplateIdListShrink(String couponTemplateIdListShrink) {
        this.couponTemplateIdListShrink = couponTemplateIdListShrink;
        return this;
    }
    public String getCouponTemplateIdListShrink() {
        return this.couponTemplateIdListShrink;
    }

    public DescribeCouponShrinkRequest setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public DescribeCouponShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCouponShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public DescribeCouponShrinkRequest setEffectiveEndTime(Long effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public Long getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public DescribeCouponShrinkRequest setEffectiveStartTime(Long effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public Long getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public DescribeCouponShrinkRequest setExpireEndDate(Long expireEndDate) {
        this.expireEndDate = expireEndDate;
        return this;
    }
    public Long getExpireEndDate() {
        return this.expireEndDate;
    }

    public DescribeCouponShrinkRequest setExpireStartDate(Long expireStartDate) {
        this.expireStartDate = expireStartDate;
        return this;
    }
    public Long getExpireStartDate() {
        return this.expireStartDate;
    }

    public DescribeCouponShrinkRequest setIncludeShare(Boolean includeShare) {
        this.includeShare = includeShare;
        return this;
    }
    public Boolean getIncludeShare() {
        return this.includeShare;
    }

    public DescribeCouponShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCouponShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DescribeCouponShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCouponShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCouponShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeCouponShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

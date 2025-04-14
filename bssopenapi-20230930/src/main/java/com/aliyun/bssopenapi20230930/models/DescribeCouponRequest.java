// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeCouponRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>351430260343</p>
     */
    @NameInMap("CouponId")
    public Long couponId;

    /**
     * <strong>example:</strong>
     * <p>554863270150</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <strong>example:</strong>
     * <p>CERTAIN</p>
     */
    @NameInMap("CouponType")
    public String couponType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EcIdAccountIds")
    public java.util.List<DescribeCouponRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <strong>example:</strong>
     * <p>1708423156000</p>
     */
    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    /**
     * <strong>example:</strong>
     * <p>1684750028000</p>
     */
    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    /**
     * <strong>example:</strong>
     * <p>1708423156000</p>
     */
    @NameInMap("ExpireEndDate")
    public Long expireEndDate;

    /**
     * <strong>example:</strong>
     * <p>1684750028000</p>
     */
    @NameInMap("ExpireStartDate")
    public Long expireStartDate;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponRequest self = new DescribeCouponRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCouponRequest setCouponId(Long couponId) {
        this.couponId = couponId;
        return this;
    }
    public Long getCouponId() {
        return this.couponId;
    }

    public DescribeCouponRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public DescribeCouponRequest setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public DescribeCouponRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCouponRequest setEcIdAccountIds(java.util.List<DescribeCouponRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<DescribeCouponRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public DescribeCouponRequest setEffectiveEndTime(Long effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public Long getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public DescribeCouponRequest setEffectiveStartTime(Long effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public Long getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public DescribeCouponRequest setExpireEndDate(Long expireEndDate) {
        this.expireEndDate = expireEndDate;
        return this;
    }
    public Long getExpireEndDate() {
        return this.expireEndDate;
    }

    public DescribeCouponRequest setExpireStartDate(Long expireStartDate) {
        this.expireStartDate = expireStartDate;
        return this;
    }
    public Long getExpireStartDate() {
        return this.expireStartDate;
    }

    public DescribeCouponRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DescribeCouponRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCouponRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeCouponRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1501603440974415</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static DescribeCouponRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponRequestEcIdAccountIds self = new DescribeCouponRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public DescribeCouponRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public DescribeCouponRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}

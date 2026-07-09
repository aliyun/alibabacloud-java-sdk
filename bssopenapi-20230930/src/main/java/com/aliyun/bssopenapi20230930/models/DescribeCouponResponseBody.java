// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeCouponResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeCouponResponseBodyData> data;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C880B065-A781-4F19-B6DD-3E0E3B715C64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCouponResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponResponseBody self = new DescribeCouponResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCouponResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCouponResponseBody setData(java.util.List<DescribeCouponResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCouponResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCouponResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCouponResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCouponResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCouponResponseBodyDataShareUidList extends TeaModel {
        /**
         * <p>The Alibaba Cloud UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1902671110151254</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云计算有限公司</p>
         */
        @NameInMap("UserNick")
        public String userNick;

        public static DescribeCouponResponseBodyDataShareUidList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponResponseBodyDataShareUidList self = new DescribeCouponResponseBodyDataShareUidList();
            return TeaModel.build(map, self);
        }

        public DescribeCouponResponseBodyDataShareUidList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribeCouponResponseBodyDataShareUidList setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

    public static class DescribeCouponResponseBodyData extends TeaModel {
        /**
         * <p>The face value.</p>
         * 
         * <strong>example:</strong>
         * <p>9929.750000</p>
         */
        @NameInMap("Amount")
        public String amount;

        @NameInMap("CertainAmount")
        public String certainAmount;

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>59243658</p>
         */
        @NameInMap("CouponId")
        public Long couponId;

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>731074910070</p>
         */
        @NameInMap("CouponNo")
        public String couponNo;

        /**
         * <p>The coupon type.</p>
         * 
         * <strong>example:</strong>
         * <p>CERTAIN</p>
         */
        @NameInMap("CouponType")
        public String couponType;

        /**
         * <p>The coupon type name.</p>
         * 
         * <strong>example:</strong>
         * <p>满减券</p>
         */
        @NameInMap("CouponTypeName")
        public String couponTypeName;

        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-06T15:12Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether there is a first purchase restriction.</p>
         */
        @NameInMap("FirstBuy")
        public Boolean firstBuy;

        /**
         * <p>The coupon issuance time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-02T15:12Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The product code list.</p>
         */
        @NameInMap("ItemNames")
        public java.util.List<String> itemNames;

        /**
         * <p>The amount limit.</p>
         * 
         * <strong>example:</strong>
         * <p>无订单金额限制</p>
         */
        @NameInMap("MoneyLimit")
        public String moneyLimit;

        /**
         * <p>The order duration limit rule.</p>
         * 
         * <strong>example:</strong>
         * <p>预付费规则：购买订单时长大于3600s才能使用</p>
         */
        @NameInMap("OrderTimeRule")
        public String orderTimeRule;

        /**
         * <p>The remaining amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("RemainAmount")
        public String remainAmount;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>新买28号</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The shared account list.</p>
         */
        @NameInMap("ShareUidList")
        public java.util.List<DescribeCouponResponseBodyDataShareUidList> shareUidList;

        /**
         * <p>Indicates whether to display the tag deduction button.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowSetDeductTagButton")
        public Boolean showSetDeductTagButton;

        /**
         * <p>The site.</p>
         * 
         * <strong>example:</strong>
         * <p>CHINA</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>官网自营</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-02T15:12Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The applicable account.</p>
         * 
         * <strong>example:</strong>
         * <p>1902671110151254</p>
         */
        @NameInMap("SuitAccount")
        public String suitAccount;

        /**
         * <p>The applicable product type. Valid values: all, which indicates that the coupon is applicable to all products. white, which indicates that the coupon is applicable to specified products. black, which indicates that the coupon is not applicable to specified products.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("SuitItemType")
        public String suitItemType;

        /**
         * <p>The coupon applicable scope.</p>
         * 
         * <strong>example:</strong>
         * <p>UNIVERSAL</p>
         */
        @NameInMap("UniversalType")
        public String universalType;

        /**
         * <p>The list of order types applicable to the coupon.</p>
         */
        @NameInMap("YhOrderTypes")
        public java.util.List<String> yhOrderTypes;

        public static DescribeCouponResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponResponseBodyData self = new DescribeCouponResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCouponResponseBodyData setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DescribeCouponResponseBodyData setCertainAmount(String certainAmount) {
            this.certainAmount = certainAmount;
            return this;
        }
        public String getCertainAmount() {
            return this.certainAmount;
        }

        public DescribeCouponResponseBodyData setCouponId(Long couponId) {
            this.couponId = couponId;
            return this;
        }
        public Long getCouponId() {
            return this.couponId;
        }

        public DescribeCouponResponseBodyData setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribeCouponResponseBodyData setCouponType(String couponType) {
            this.couponType = couponType;
            return this;
        }
        public String getCouponType() {
            return this.couponType;
        }

        public DescribeCouponResponseBodyData setCouponTypeName(String couponTypeName) {
            this.couponTypeName = couponTypeName;
            return this;
        }
        public String getCouponTypeName() {
            return this.couponTypeName;
        }

        public DescribeCouponResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeCouponResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCouponResponseBodyData setFirstBuy(Boolean firstBuy) {
            this.firstBuy = firstBuy;
            return this;
        }
        public Boolean getFirstBuy() {
            return this.firstBuy;
        }

        public DescribeCouponResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCouponResponseBodyData setItemNames(java.util.List<String> itemNames) {
            this.itemNames = itemNames;
            return this;
        }
        public java.util.List<String> getItemNames() {
            return this.itemNames;
        }

        public DescribeCouponResponseBodyData setMoneyLimit(String moneyLimit) {
            this.moneyLimit = moneyLimit;
            return this;
        }
        public String getMoneyLimit() {
            return this.moneyLimit;
        }

        public DescribeCouponResponseBodyData setOrderTimeRule(String orderTimeRule) {
            this.orderTimeRule = orderTimeRule;
            return this;
        }
        public String getOrderTimeRule() {
            return this.orderTimeRule;
        }

        public DescribeCouponResponseBodyData setRemainAmount(String remainAmount) {
            this.remainAmount = remainAmount;
            return this;
        }
        public String getRemainAmount() {
            return this.remainAmount;
        }

        public DescribeCouponResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCouponResponseBodyData setShareUidList(java.util.List<DescribeCouponResponseBodyDataShareUidList> shareUidList) {
            this.shareUidList = shareUidList;
            return this;
        }
        public java.util.List<DescribeCouponResponseBodyDataShareUidList> getShareUidList() {
            return this.shareUidList;
        }

        public DescribeCouponResponseBodyData setShowSetDeductTagButton(Boolean showSetDeductTagButton) {
            this.showSetDeductTagButton = showSetDeductTagButton;
            return this;
        }
        public Boolean getShowSetDeductTagButton() {
            return this.showSetDeductTagButton;
        }

        public DescribeCouponResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public DescribeCouponResponseBodyData setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public DescribeCouponResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCouponResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCouponResponseBodyData setSuitAccount(String suitAccount) {
            this.suitAccount = suitAccount;
            return this;
        }
        public String getSuitAccount() {
            return this.suitAccount;
        }

        public DescribeCouponResponseBodyData setSuitItemType(String suitItemType) {
            this.suitItemType = suitItemType;
            return this;
        }
        public String getSuitItemType() {
            return this.suitItemType;
        }

        public DescribeCouponResponseBodyData setUniversalType(String universalType) {
            this.universalType = universalType;
            return this;
        }
        public String getUniversalType() {
            return this.universalType;
        }

        public DescribeCouponResponseBodyData setYhOrderTypes(java.util.List<String> yhOrderTypes) {
            this.yhOrderTypes = yhOrderTypes;
            return this;
        }
        public java.util.List<String> getYhOrderTypes() {
            return this.yhOrderTypes;
        }

    }

}

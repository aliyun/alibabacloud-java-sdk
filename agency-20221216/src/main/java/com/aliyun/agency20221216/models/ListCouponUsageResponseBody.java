// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCouponUsageResponseBody extends TeaModel {
    /**
     * <p>The status code of the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCouponUsageResponseBodyData> data;

    /**
     * <p>The message returned by the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCouponUsageResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID. You can provide this ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCouponUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCouponUsageResponseBody self = new ListCouponUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCouponUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCouponUsageResponseBody setData(java.util.List<ListCouponUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCouponUsageResponseBodyData> getData() {
        return this.data;
    }

    public ListCouponUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCouponUsageResponseBody setPageInfo(ListCouponUsageResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCouponUsageResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCouponUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCouponUsageResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:oqevfbveuadcrduzmf@ttirv.net">oqevfbveuadcrduzmf@ttirv.net</a></p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The face value of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Amount")
        public Double amount;

        /**
         * <p>The remaining balance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("Balance")
        public Double balance;

        /**
         * <p>The ID of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>59226280</p>
         */
        @NameInMap("CouponId")
        public String couponId;

        /**
         * <p>The ID of the coupon template.</p>
         * 
         * <strong>example:</strong>
         * <p>503802</p>
         */
        @NameInMap("CouponTemplateId")
        public Long couponTemplateId;

        /**
         * <p>The validity period of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-06 00:00:00 ~ 2023-04-07 00:00:00</p>
         */
        @NameInMap("EffDate")
        public String effDate;

        /**
         * <p>The time when the coupon was issued. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-06 19:32:10</p>
         */
        @NameInMap("PublishDate")
        public String publishDate;

        /**
         * <p>The coupon status. Valid values:</br>
         * AVAILABLE: Normal.</br>
         * EXHAUSTED: Used up.</br>
         * EXPIRED: Expired.</br>
         * ABANDONED: Voided.</br></p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UID of the T2 partner.</p>
         * 
         * <strong>example:</strong>
         * <p>5248516956402795</p>
         */
        @NameInMap("T2PartnerUid")
        public String t2PartnerUid;

        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1647668856741998</p>
         */
        @NameInMap("Uid")
        public Long uid;

        public static ListCouponUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCouponUsageResponseBodyData self = new ListCouponUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCouponUsageResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListCouponUsageResponseBodyData setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public ListCouponUsageResponseBodyData setBalance(Double balance) {
            this.balance = balance;
            return this;
        }
        public Double getBalance() {
            return this.balance;
        }

        public ListCouponUsageResponseBodyData setCouponId(String couponId) {
            this.couponId = couponId;
            return this;
        }
        public String getCouponId() {
            return this.couponId;
        }

        public ListCouponUsageResponseBodyData setCouponTemplateId(Long couponTemplateId) {
            this.couponTemplateId = couponTemplateId;
            return this;
        }
        public Long getCouponTemplateId() {
            return this.couponTemplateId;
        }

        public ListCouponUsageResponseBodyData setEffDate(String effDate) {
            this.effDate = effDate;
            return this;
        }
        public String getEffDate() {
            return this.effDate;
        }

        public ListCouponUsageResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public ListCouponUsageResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCouponUsageResponseBodyData setT2PartnerUid(String t2PartnerUid) {
            this.t2PartnerUid = t2PartnerUid;
            return this;
        }
        public String getT2PartnerUid() {
            return this.t2PartnerUid;
        }

        public ListCouponUsageResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class ListCouponUsageResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListCouponUsageResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCouponUsageResponseBodyPageInfo self = new ListCouponUsageResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCouponUsageResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListCouponUsageResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCouponUsageResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}

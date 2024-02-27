// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCouponUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCouponUsageResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListCouponUsageResponseBodyPageInfo pageInfo;

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
        @NameInMap("Account")
        public String account;

        @NameInMap("Amount")
        public Double amount;

        @NameInMap("Balance")
        public Double balance;

        @NameInMap("CouponId")
        public String couponId;

        @NameInMap("CouponTemplateId")
        public Long couponTemplateId;

        @NameInMap("EffDate")
        public String effDate;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("Status")
        public String status;

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

        public ListCouponUsageResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class ListCouponUsageResponseBodyPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

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

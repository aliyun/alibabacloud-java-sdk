// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySmsPackageNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QuerySmsPackageNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageNewResponseBody self = new QuerySmsPackageNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageNewResponseBody setList(QuerySmsPackageNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySmsPackageNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySmsPackageNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsPackageNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsPackageNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsPackageNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySmsPackageNewResponseBodyListSmsPackageInfo extends TeaModel {
        @NameInMap("BuyTime")
        public String buyTime;

        @NameInMap("DetailOrderId")
        public String detailOrderId;

        @NameInMap("EffTime")
        public String effTime;

        @NameInMap("ExpTime")
        public String expTime;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PayPrice")
        public Float payPrice;

        @NameInMap("PkgId")
        public Long pkgId;

        @NameInMap("RefundStatus")
        public Integer refundStatus;

        @NameInMap("State")
        public Integer state;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Usage")
        public Long usage;

        public static QuerySmsPackageNewResponseBodyListSmsPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsPackageNewResponseBodyListSmsPackageInfo self = new QuerySmsPackageNewResponseBodyListSmsPackageInfo();
            return TeaModel.build(map, self);
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setBuyTime(String buyTime) {
            this.buyTime = buyTime;
            return this;
        }
        public String getBuyTime() {
            return this.buyTime;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setDetailOrderId(String detailOrderId) {
            this.detailOrderId = detailOrderId;
            return this;
        }
        public String getDetailOrderId() {
            return this.detailOrderId;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setEffTime(String effTime) {
            this.effTime = effTime;
            return this;
        }
        public String getEffTime() {
            return this.effTime;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setExpTime(String expTime) {
            this.expTime = expTime;
            return this;
        }
        public String getExpTime() {
            return this.expTime;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setPayPrice(Float payPrice) {
            this.payPrice = payPrice;
            return this;
        }
        public Float getPayPrice() {
            return this.payPrice;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setPkgId(Long pkgId) {
            this.pkgId = pkgId;
            return this;
        }
        public Long getPkgId() {
            return this.pkgId;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setRefundStatus(Integer refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public Integer getRefundStatus() {
            return this.refundStatus;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QuerySmsPackageNewResponseBodyListSmsPackageInfo setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

    public static class QuerySmsPackageNewResponseBodyList extends TeaModel {
        @NameInMap("SmsPackageInfo")
        public java.util.List<QuerySmsPackageNewResponseBodyListSmsPackageInfo> smsPackageInfo;

        public static QuerySmsPackageNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsPackageNewResponseBodyList self = new QuerySmsPackageNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsPackageNewResponseBodyList setSmsPackageInfo(java.util.List<QuerySmsPackageNewResponseBodyListSmsPackageInfo> smsPackageInfo) {
            this.smsPackageInfo = smsPackageInfo;
            return this;
        }
        public java.util.List<QuerySmsPackageNewResponseBodyListSmsPackageInfo> getSmsPackageInfo() {
            return this.smsPackageInfo;
        }

    }

}

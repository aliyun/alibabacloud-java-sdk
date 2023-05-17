// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListCostUnitOrdersResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListCostUnitOrdersResponseBodyItems> items;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static ListCostUnitOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCostUnitOrdersResponseBody self = new ListCostUnitOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCostUnitOrdersResponseBody setItems(java.util.List<ListCostUnitOrdersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListCostUnitOrdersResponseBodyItems> getItems() {
        return this.items;
    }

    public ListCostUnitOrdersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCostUnitOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCostUnitOrdersResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public ListCostUnitOrdersResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class ListCostUnitOrdersResponseBodyItems extends TeaModel {
        @NameInMap("AliOrderCode")
        public String aliOrderCode;

        @NameInMap("AliOrderInstanceId")
        public String aliOrderInstanceId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Exhausted")
        public Boolean exhausted;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("RefundTime")
        public Long refundTime;

        @NameInMap("TotalCostUnit")
        public Long totalCostUnit;

        @NameInMap("UsedCostUnit")
        public Long usedCostUnit;

        public static ListCostUnitOrdersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListCostUnitOrdersResponseBodyItems self = new ListCostUnitOrdersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListCostUnitOrdersResponseBodyItems setAliOrderCode(String aliOrderCode) {
            this.aliOrderCode = aliOrderCode;
            return this;
        }
        public String getAliOrderCode() {
            return this.aliOrderCode;
        }

        public ListCostUnitOrdersResponseBodyItems setAliOrderInstanceId(String aliOrderInstanceId) {
            this.aliOrderInstanceId = aliOrderInstanceId;
            return this;
        }
        public String getAliOrderInstanceId() {
            return this.aliOrderInstanceId;
        }

        public ListCostUnitOrdersResponseBodyItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCostUnitOrdersResponseBodyItems setExhausted(Boolean exhausted) {
            this.exhausted = exhausted;
            return this;
        }
        public Boolean getExhausted() {
            return this.exhausted;
        }

        public ListCostUnitOrdersResponseBodyItems setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListCostUnitOrdersResponseBodyItems setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public ListCostUnitOrdersResponseBodyItems setRefundTime(Long refundTime) {
            this.refundTime = refundTime;
            return this;
        }
        public Long getRefundTime() {
            return this.refundTime;
        }

        public ListCostUnitOrdersResponseBodyItems setTotalCostUnit(Long totalCostUnit) {
            this.totalCostUnit = totalCostUnit;
            return this;
        }
        public Long getTotalCostUnit() {
            return this.totalCostUnit;
        }

        public ListCostUnitOrdersResponseBodyItems setUsedCostUnit(Long usedCostUnit) {
            this.usedCostUnit = usedCostUnit;
            return this;
        }
        public Long getUsedCostUnit() {
            return this.usedCostUnit;
        }

    }

}

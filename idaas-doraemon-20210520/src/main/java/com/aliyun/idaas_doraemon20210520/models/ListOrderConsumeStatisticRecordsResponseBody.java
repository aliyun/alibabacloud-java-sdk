// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListOrderConsumeStatisticRecordsResponseBody extends TeaModel {
    // 数据项列表
    @NameInMap("Items")
    public java.util.List<ListOrderConsumeStatisticRecordsResponseBodyItems> items;

    // 每页记录数
    @NameInMap("PageSize")
    public Long pageSize;

    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
    @NameInMap("TotalElements")
    public Long totalElements;

    // 总页数
    @NameInMap("TotalPages")
    public Long totalPages;

    public static ListOrderConsumeStatisticRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrderConsumeStatisticRecordsResponseBody self = new ListOrderConsumeStatisticRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrderConsumeStatisticRecordsResponseBody setItems(java.util.List<ListOrderConsumeStatisticRecordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListOrderConsumeStatisticRecordsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListOrderConsumeStatisticRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOrderConsumeStatisticRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrderConsumeStatisticRecordsResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public ListOrderConsumeStatisticRecordsResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class ListOrderConsumeStatisticRecordsResponseBodyItems extends TeaModel {
        // 阿里云订单编号
        @NameInMap("AliOrderCode")
        public String aliOrderCode;

        // 应用外部标志
        @NameInMap("ApplicationExternalId")
        public String applicationExternalId;

        // 计费数目
        @NameInMap("ChargedCount")
        public Long chargedCount;

        // 服务码
        @NameInMap("ServiceCode")
        public String serviceCode;

        // 统计日期，时间戳，精确到秒
        @NameInMap("StatisticTime")
        public Long statisticTime;

        // 总价
        @NameInMap("TotalPrice")
        public Long totalPrice;

        // 单价
        @NameInMap("UnitPrice")
        public Long unitPrice;

        public static ListOrderConsumeStatisticRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListOrderConsumeStatisticRecordsResponseBodyItems self = new ListOrderConsumeStatisticRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListOrderConsumeStatisticRecordsResponseBodyItems setAliOrderCode(String aliOrderCode) {
            this.aliOrderCode = aliOrderCode;
            return this;
        }
        public String getAliOrderCode() {
            return this.aliOrderCode;
        }

        public ListOrderConsumeStatisticRecordsResponseBodyItems setApplicationExternalId(String applicationExternalId) {
            this.applicationExternalId = applicationExternalId;
            return this;
        }
        public String getApplicationExternalId() {
            return this.applicationExternalId;
        }

        public ListOrderConsumeStatisticRecordsResponseBodyItems setChargedCount(Long chargedCount) {
            this.chargedCount = chargedCount;
            return this;
        }
        public Long getChargedCount() {
            return this.chargedCount;
        }

        public ListOrderConsumeStatisticRecordsResponseBodyItems setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListOrderConsumeStatisticRecordsResponseBodyItems setStatisticTime(Long statisticTime) {
            this.statisticTime = statisticTime;
            return this;
        }
        public Long getStatisticTime() {
            return this.statisticTime;
        }

        public ListOrderConsumeStatisticRecordsResponseBodyItems setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        public ListOrderConsumeStatisticRecordsResponseBodyItems setUnitPrice(Long unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Long getUnitPrice() {
            return this.unitPrice;
        }

    }

}

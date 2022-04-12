// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppliedNearRealStatResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public AppliedNearRealStatResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static AppliedNearRealStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppliedNearRealStatResponseBody self = new AppliedNearRealStatResponseBody();
        return TeaModel.build(map, self);
    }

    public AppliedNearRealStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppliedNearRealStatResponseBody setData(AppliedNearRealStatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppliedNearRealStatResponseBodyData getData() {
        return this.data;
    }

    public AppliedNearRealStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppliedNearRealStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AppliedNearRealStatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AppliedNearRealStatResponseBodyDataRecords extends TeaModel {
        // 应用ID
        @NameInMap("AppliedId")
        public String appliedId;

        // 应用名称
        @NameInMap("AppliedName")
        public String appliedName;

        // 应用版本ID
        @NameInMap("AppliedVersionId")
        public String appliedVersionId;

        // 应用版本名称
        @NameInMap("AppliedVersionName")
        public String appliedVersionName;

        // 实时消耗并发
        @NameInMap("Concurrency")
        public Long concurrency;

        // 实时消耗CU
        @NameInMap("ConsumptionCu")
        public Double consumptionCu;

        public static AppliedNearRealStatResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            AppliedNearRealStatResponseBodyDataRecords self = new AppliedNearRealStatResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public AppliedNearRealStatResponseBodyDataRecords setAppliedId(String appliedId) {
            this.appliedId = appliedId;
            return this;
        }
        public String getAppliedId() {
            return this.appliedId;
        }

        public AppliedNearRealStatResponseBodyDataRecords setAppliedName(String appliedName) {
            this.appliedName = appliedName;
            return this;
        }
        public String getAppliedName() {
            return this.appliedName;
        }

        public AppliedNearRealStatResponseBodyDataRecords setAppliedVersionId(String appliedVersionId) {
            this.appliedVersionId = appliedVersionId;
            return this;
        }
        public String getAppliedVersionId() {
            return this.appliedVersionId;
        }

        public AppliedNearRealStatResponseBodyDataRecords setAppliedVersionName(String appliedVersionName) {
            this.appliedVersionName = appliedVersionName;
            return this;
        }
        public String getAppliedVersionName() {
            return this.appliedVersionName;
        }

        public AppliedNearRealStatResponseBodyDataRecords setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

        public AppliedNearRealStatResponseBodyDataRecords setConsumptionCu(Double consumptionCu) {
            this.consumptionCu = consumptionCu;
            return this;
        }
        public Double getConsumptionCu() {
            return this.consumptionCu;
        }

    }

    public static class AppliedNearRealStatResponseBodyData extends TeaModel {
        // 当前页码，默认1
        @NameInMap("PageNumber")
        public Long pageNumber;

        // 每页项数，默认20,最大100
        @NameInMap("PageSize")
        public Long pageSize;

        // 总页数
        @NameInMap("Pages")
        public Long pages;

        // 结果集
        @NameInMap("Records")
        public java.util.List<AppliedNearRealStatResponseBodyDataRecords> records;

        // 总共项数
        @NameInMap("TotalCount")
        public Long totalCount;

        public static AppliedNearRealStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppliedNearRealStatResponseBodyData self = new AppliedNearRealStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppliedNearRealStatResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public AppliedNearRealStatResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public AppliedNearRealStatResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public AppliedNearRealStatResponseBodyData setRecords(java.util.List<AppliedNearRealStatResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<AppliedNearRealStatResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public AppliedNearRealStatResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class TotalAppliedNearRealStatResponseBodyData extends TeaModel {
        // 实时消耗并发
        @NameInMap("TotalConcurrency")
        public Long totalConcurrency;

        // 实时消耗CU
        @NameInMap("TotalConsumptionCu")
        public Double totalConsumptionCu;

        public static TotalAppliedNearRealStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TotalAppliedNearRealStatResponseBodyData self = new TotalAppliedNearRealStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TotalAppliedNearRealStatResponseBodyData setTotalConcurrency(Long totalConcurrency) {
            this.totalConcurrency = totalConcurrency;
            return this;
        }
        public Long getTotalConcurrency() {
            return this.totalConcurrency;
        }

        public TotalAppliedNearRealStatResponseBodyData setTotalConsumptionCu(Double totalConsumptionCu) {
            this.totalConsumptionCu = totalConsumptionCu;
            return this;
        }
        public Double getTotalConsumptionCu() {
            return this.totalConsumptionCu;
        }

    }

}

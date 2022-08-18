// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailResponseBody extends TeaModel {
    @NameInMap("BatchResultDetails")
    public DescribeBatchResultDetailResponseBodyBatchResultDetails batchResultDetails;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeBatchResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultDetailResponseBody self = new DescribeBatchResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultDetailResponseBody setBatchResultDetails(DescribeBatchResultDetailResponseBodyBatchResultDetails batchResultDetails) {
        this.batchResultDetails = batchResultDetails;
        return this;
    }
    public DescribeBatchResultDetailResponseBodyBatchResultDetails getBatchResultDetails() {
        return this.batchResultDetails;
    }

    public DescribeBatchResultDetailResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBatchResultDetailResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeBatchResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchResultDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail extends TeaModel {
        @NameInMap("BatchType")
        public String batchType;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Line")
        public String line;

        @NameInMap("NewRr")
        public String newRr;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("OperateDateStr")
        public String operateDateStr;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Rr")
        public String rr;

        @NameInMap("RrStatus")
        public String rrStatus;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Ttl")
        public String ttl;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail self = new DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setNewRr(String newRr) {
            this.newRr = newRr;
            return this;
        }
        public String getNewRr() {
            return this.newRr;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setOperateDateStr(String operateDateStr) {
            this.operateDateStr = operateDateStr;
            return this;
        }
        public String getOperateDateStr() {
            return this.operateDateStr;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setRr(String rr) {
            this.rr = rr;
            return this;
        }
        public String getRr() {
            return this.rr;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setRrStatus(String rrStatus) {
            this.rrStatus = rrStatus;
            return this;
        }
        public String getRrStatus() {
            return this.rrStatus;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setTtl(String ttl) {
            this.ttl = ttl;
            return this;
        }
        public String getTtl() {
            return this.ttl;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeBatchResultDetailResponseBodyBatchResultDetails extends TeaModel {
        @NameInMap("BatchResultDetail")
        public java.util.List<DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail> batchResultDetail;

        public static DescribeBatchResultDetailResponseBodyBatchResultDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchResultDetailResponseBodyBatchResultDetails self = new DescribeBatchResultDetailResponseBodyBatchResultDetails();
            return TeaModel.build(map, self);
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setBatchResultDetail(java.util.List<DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail> batchResultDetail) {
            this.batchResultDetail = batchResultDetail;
            return this;
        }
        public java.util.List<DescribeBatchResultDetailResponseBodyBatchResultDetailsBatchResultDetail> getBatchResultDetail() {
            return this.batchResultDetail;
        }

    }

}

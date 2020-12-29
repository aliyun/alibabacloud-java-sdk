// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("BatchResultDetails")
    public java.util.List<DescribeBatchResultDetailResponseBodyBatchResultDetails> batchResultDetails;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeBatchResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultDetailResponseBody self = new DescribeBatchResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeBatchResultDetailResponseBody setBatchResultDetails(java.util.List<DescribeBatchResultDetailResponseBodyBatchResultDetails> batchResultDetails) {
        this.batchResultDetails = batchResultDetails;
        return this;
    }
    public java.util.List<DescribeBatchResultDetailResponseBodyBatchResultDetails> getBatchResultDetails() {
        return this.batchResultDetails;
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

    public DescribeBatchResultDetailResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeBatchResultDetailResponseBodyBatchResultDetails extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("Rr")
        public String rr;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("RrStatus")
        public String rrStatus;

        @NameInMap("OperateDateStr")
        public String operateDateStr;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("Value")
        public String value;

        @NameInMap("Ttl")
        public String ttl;

        @NameInMap("BatchType")
        public String batchType;

        @NameInMap("Line")
        public String line;

        @NameInMap("NewRr")
        public String newRr;

        @NameInMap("Reason")
        public String reason;

        public static DescribeBatchResultDetailResponseBodyBatchResultDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchResultDetailResponseBodyBatchResultDetails self = new DescribeBatchResultDetailResponseBodyBatchResultDetails();
            return TeaModel.build(map, self);
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setRr(String rr) {
            this.rr = rr;
            return this;
        }
        public String getRr() {
            return this.rr;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setRrStatus(String rrStatus) {
            this.rrStatus = rrStatus;
            return this;
        }
        public String getRrStatus() {
            return this.rrStatus;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setOperateDateStr(String operateDateStr) {
            this.operateDateStr = operateDateStr;
            return this;
        }
        public String getOperateDateStr() {
            return this.operateDateStr;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setTtl(String ttl) {
            this.ttl = ttl;
            return this;
        }
        public String getTtl() {
            return this.ttl;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setNewRr(String newRr) {
            this.newRr = newRr;
            return this;
        }
        public String getNewRr() {
            return this.newRr;
        }

        public DescribeBatchResultDetailResponseBodyBatchResultDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}

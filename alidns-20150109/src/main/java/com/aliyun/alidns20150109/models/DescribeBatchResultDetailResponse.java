// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("BatchResultDetails")
    @Validation(required = true)
    public DescribeBatchResultDetailResponseBatchResultDetails batchResultDetails;

    public static DescribeBatchResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultDetailResponse self = new DescribeBatchResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchResultDetailResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeBatchResultDetailResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBatchResultDetailResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeBatchResultDetailResponse setBatchResultDetails(DescribeBatchResultDetailResponseBatchResultDetails batchResultDetails) {
        this.batchResultDetails = batchResultDetails;
        return this;
    }
    public DescribeBatchResultDetailResponseBatchResultDetails getBatchResultDetails() {
        return this.batchResultDetails;
    }

    public static class DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Rr")
        @Validation(required = true)
        public String rr;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("NewRr")
        @Validation(required = true)
        public String newRr;

        @NameInMap("NewValue")
        @Validation(required = true)
        public String newValue;

        @NameInMap("BatchType")
        @Validation(required = true)
        public String batchType;

        @NameInMap("OperateDateStr")
        @Validation(required = true)
        public String operateDateStr;

        @NameInMap("Line")
        @Validation(required = true)
        public String line;

        @NameInMap("Priority")
        @Validation(required = true)
        public String priority;

        @NameInMap("Ttl")
        @Validation(required = true)
        public String ttl;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("RrStatus")
        @Validation(required = true)
        public String rrStatus;

        public static DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail self = new DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setRr(String rr) {
            this.rr = rr;
            return this;
        }
        public String getRr() {
            return this.rr;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setNewRr(String newRr) {
            this.newRr = newRr;
            return this;
        }
        public String getNewRr() {
            return this.newRr;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setOperateDateStr(String operateDateStr) {
            this.operateDateStr = operateDateStr;
            return this;
        }
        public String getOperateDateStr() {
            return this.operateDateStr;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setTtl(String ttl) {
            this.ttl = ttl;
            return this;
        }
        public String getTtl() {
            return this.ttl;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail setRrStatus(String rrStatus) {
            this.rrStatus = rrStatus;
            return this;
        }
        public String getRrStatus() {
            return this.rrStatus;
        }

    }

    public static class DescribeBatchResultDetailResponseBatchResultDetails extends TeaModel {
        @NameInMap("BatchResultDetail")
        @Validation(required = true)
        public java.util.List<DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail> batchResultDetail;

        public static DescribeBatchResultDetailResponseBatchResultDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchResultDetailResponseBatchResultDetails self = new DescribeBatchResultDetailResponseBatchResultDetails();
            return TeaModel.build(map, self);
        }

        public DescribeBatchResultDetailResponseBatchResultDetails setBatchResultDetail(java.util.List<DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail> batchResultDetail) {
            this.batchResultDetail = batchResultDetail;
            return this;
        }
        public java.util.List<DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail> getBatchResultDetail() {
            return this.batchResultDetail;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailResponseBody extends TeaModel {
    /**
     * <p>Detailed information about the batch operation result.</p>
     */
    @NameInMap("BatchResultDetails")
    public DescribeBatchResultDetailResponseBodyBatchResultDetails batchResultDetails;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The type of the batch operation.</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The line code.</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>The new host record.</p>
         */
        @NameInMap("NewRr")
        public String newRr;

        /**
         * <p>The new record value.</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The time when the operation was performed.</p>
         */
        @NameInMap("OperateDateStr")
        public String operateDateStr;

        /**
         * <p>The priority of an MX-type DNS record.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The cause of the execution failure.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The ID of the DNS record.</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>The description of the DNS record.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The host record.</p>
         */
        @NameInMap("Rr")
        public String rr;

        /**
         * <p>The status of the DNS record.</p>
         */
        @NameInMap("RrStatus")
        public String rrStatus;

        /**
         * <p>The execution result. Valid values:**true**: The execution succeeded.**false**: The execution failed.</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <p>The TTL of the DNS record.</p>
         */
        @NameInMap("Ttl")
        public String ttl;

        /**
         * <p>The type of the DNS record.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the DNS record.</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRecordsResponseBody extends TeaModel {
    /**
     * <p>The returned Domain Name System (DNS) records.</p>
     */
    @NameInMap("DomainRecords")
    public DescribeSubDomainRecordsResponseBodyDomainRecords domainRecords;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSubDomainRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainRecordsResponseBody self = new DescribeSubDomainRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainRecordsResponseBody setDomainRecords(DescribeSubDomainRecordsResponseBodyDomainRecords domainRecords) {
        this.domainRecords = domainRecords;
        return this;
    }
    public DescribeSubDomainRecordsResponseBodyDomainRecords getDomainRecords() {
        return this.domainRecords;
    }

    public DescribeSubDomainRecordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSubDomainRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSubDomainRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubDomainRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSubDomainRecordsResponseBodyDomainRecordsRecord extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The DNS resolution line.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>The lock status of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Locked")
        public Boolean locked;

        /**
         * <p>The priority of the mail exchanger (MX) record.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        @NameInMap("RR")
        public String RR;

        /**
         * <p>The ID of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>9999985</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>The description of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time-to-live (TTL) of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("TTL")
        public Long TTL;

        /**
         * <p>The type of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>CNAME</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The record value.</p>
         * 
         * <strong>example:</strong>
         * <p>example.net</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeSubDomainRecordsResponseBodyDomainRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubDomainRecordsResponseBodyDomainRecordsRecord self = new DescribeSubDomainRecordsResponseBodyDomainRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setRR(String RR) {
            this.RR = RR;
            return this;
        }
        public String getRR() {
            return this.RR;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setTTL(Long TTL) {
            this.TTL = TTL;
            return this;
        }
        public Long getTTL() {
            return this.TTL;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeSubDomainRecordsResponseBodyDomainRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<DescribeSubDomainRecordsResponseBodyDomainRecordsRecord> record;

        public static DescribeSubDomainRecordsResponseBodyDomainRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubDomainRecordsResponseBodyDomainRecords self = new DescribeSubDomainRecordsResponseBodyDomainRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setRecord(java.util.List<DescribeSubDomainRecordsResponseBodyDomainRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<DescribeSubDomainRecordsResponseBodyDomainRecordsRecord> getRecord() {
            return this.record;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsResponseBody extends TeaModel {
    /**
     * <p>The DNS records returned.</p>
     */
    @NameInMap("DomainRecords")
    public DescribeDomainRecordsResponseBodyDomainRecords domainRecords;

    /**
     * <p>The number of the returned page.</p>
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
     * <p>The total number of DNS records.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDomainRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordsResponseBody self = new DescribeDomainRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRecordsResponseBody setDomainRecords(DescribeDomainRecordsResponseBodyDomainRecords domainRecords) {
        this.domainRecords = domainRecords;
        return this;
    }
    public DescribeDomainRecordsResponseBodyDomainRecords getDomainRecords() {
        return this.domainRecords;
    }

    public DescribeDomainRecordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainRecordsResponseBodyDomainRecordsRecord extends TeaModel {
        /**
         * <p>The domain name to which the DNS record belongs.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The line that is used by the DNS record.</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>Indicates whether the DNS record is locked.</p>
         */
        @NameInMap("Locked")
        public Boolean locked;

        /**
         * <p>The priority of the MX record.</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The RR value.</p>
         */
        @NameInMap("RR")
        public String RR;

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
         * <p>The status of the DNS record.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time-to-live (TTL) of the DNS record.</p>
         */
        @NameInMap("TTL")
        public Long TTL;

        /**
         * <p>The type of the DNS record.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The record value.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the DNS record.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeDomainRecordsResponseBodyDomainRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRecordsResponseBodyDomainRecordsRecord self = new DescribeDomainRecordsResponseBodyDomainRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setRR(String RR) {
            this.RR = RR;
            return this;
        }
        public String getRR() {
            return this.RR;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setTTL(Long TTL) {
            this.TTL = TTL;
            return this;
        }
        public Long getTTL() {
            return this.TTL;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDomainRecordsResponseBodyDomainRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<DescribeDomainRecordsResponseBodyDomainRecordsRecord> record;

        public static DescribeDomainRecordsResponseBodyDomainRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRecordsResponseBodyDomainRecords self = new DescribeDomainRecordsResponseBodyDomainRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setRecord(java.util.List<DescribeDomainRecordsResponseBodyDomainRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<DescribeDomainRecordsResponseBodyDomainRecordsRecord> getRecord() {
            return this.record;
        }

    }

}

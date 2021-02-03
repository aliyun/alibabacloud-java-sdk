// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRecordsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainRecords")
    public DescribeSubDomainRecordsResponseBodyDomainRecords domainRecords;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeSubDomainRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainRecordsResponseBody self = new DescribeSubDomainRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public static class DescribeSubDomainRecordsResponseBodyDomainRecordsRecord extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Value")
        public String value;

        @NameInMap("TTL")
        public Long TTL;

        @NameInMap("Line")
        public String line;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("RR")
        public String RR;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Locked")
        public Boolean locked;

        public static DescribeSubDomainRecordsResponseBodyDomainRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubDomainRecordsResponseBodyDomainRecordsRecord self = new DescribeSubDomainRecordsResponseBodyDomainRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setTTL(Long TTL) {
            this.TTL = TTL;
            return this;
        }
        public Long getTTL() {
            return this.TTL;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
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

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecordsRecord setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
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

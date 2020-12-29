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
    public java.util.List<DescribeSubDomainRecordsResponseBodyDomainRecords> domainRecords;

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

    public DescribeSubDomainRecordsResponseBody setDomainRecords(java.util.List<DescribeSubDomainRecordsResponseBodyDomainRecords> domainRecords) {
        this.domainRecords = domainRecords;
        return this;
    }
    public java.util.List<DescribeSubDomainRecordsResponseBodyDomainRecords> getDomainRecords() {
        return this.domainRecords;
    }

    public DescribeSubDomainRecordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeSubDomainRecordsResponseBodyDomainRecords extends TeaModel {
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

        public static DescribeSubDomainRecordsResponseBodyDomainRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubDomainRecordsResponseBodyDomainRecords self = new DescribeSubDomainRecordsResponseBodyDomainRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setTTL(Long TTL) {
            this.TTL = TTL;
            return this;
        }
        public Long getTTL() {
            return this.TTL;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setRR(String RR) {
            this.RR = RR;
            return this;
        }
        public String getRR() {
            return this.RR;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeSubDomainRecordsResponseBodyDomainRecords setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

    }

}

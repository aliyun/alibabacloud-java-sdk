// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRecordsResponse extends TeaModel {
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

    @NameInMap("DomainRecords")
    @Validation(required = true)
    public DescribeSubDomainRecordsResponseDomainRecords domainRecords;

    public static DescribeSubDomainRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainRecordsResponse self = new DescribeSubDomainRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubDomainRecordsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeSubDomainRecordsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSubDomainRecordsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSubDomainRecordsResponse setDomainRecords(DescribeSubDomainRecordsResponseDomainRecords domainRecords) {
        this.domainRecords = domainRecords;
        return this;
    }
    public DescribeSubDomainRecordsResponseDomainRecords getDomainRecords() {
        return this.domainRecords;
    }

    public static class DescribeSubDomainRecordsResponseDomainRecordsRecord extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("RR")
        @Validation(required = true)
        public String RR;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("TTL")
        @Validation(required = true)
        public Long TTL;

        @NameInMap("Priority")
        @Validation(required = true)
        public Long priority;

        @NameInMap("Line")
        @Validation(required = true)
        public String line;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Locked")
        @Validation(required = true)
        public Boolean locked;

        @NameInMap("Weight")
        @Validation(required = true)
        public Integer weight;

        public static DescribeSubDomainRecordsResponseDomainRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubDomainRecordsResponseDomainRecordsRecord self = new DescribeSubDomainRecordsResponseDomainRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setRR(String RR) {
            this.RR = RR;
            return this;
        }
        public String getRR() {
            return this.RR;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setTTL(Long TTL) {
            this.TTL = TTL;
            return this;
        }
        public Long getTTL() {
            return this.TTL;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public DescribeSubDomainRecordsResponseDomainRecordsRecord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeSubDomainRecordsResponseDomainRecords extends TeaModel {
        @NameInMap("Record")
        @Validation(required = true)
        public java.util.List<DescribeSubDomainRecordsResponseDomainRecordsRecord> record;

        public static DescribeSubDomainRecordsResponseDomainRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubDomainRecordsResponseDomainRecords self = new DescribeSubDomainRecordsResponseDomainRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSubDomainRecordsResponseDomainRecords setRecord(java.util.List<DescribeSubDomainRecordsResponseDomainRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<DescribeSubDomainRecordsResponseDomainRecordsRecord> getRecord() {
            return this.record;
        }

    }

}

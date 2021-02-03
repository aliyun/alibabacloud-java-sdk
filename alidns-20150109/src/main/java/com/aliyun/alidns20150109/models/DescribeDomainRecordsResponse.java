// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsResponse extends TeaModel {
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
    public DescribeDomainRecordsResponseDomainRecords domainRecords;

    public static DescribeDomainRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordsResponse self = new DescribeDomainRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRecordsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDomainRecordsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainRecordsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainRecordsResponse setDomainRecords(DescribeDomainRecordsResponseDomainRecords domainRecords) {
        this.domainRecords = domainRecords;
        return this;
    }
    public DescribeDomainRecordsResponseDomainRecords getDomainRecords() {
        return this.domainRecords;
    }

    public static class DescribeDomainRecordsResponseDomainRecordsRecord extends TeaModel {
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

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        public static DescribeDomainRecordsResponseDomainRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRecordsResponseDomainRecordsRecord self = new DescribeDomainRecordsResponseDomainRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setRR(String RR) {
            this.RR = RR;
            return this;
        }
        public String getRR() {
            return this.RR;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setTTL(Long TTL) {
            this.TTL = TTL;
            return this;
        }
        public Long getTTL() {
            return this.TTL;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeDomainRecordsResponseDomainRecordsRecord setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class DescribeDomainRecordsResponseDomainRecords extends TeaModel {
        @NameInMap("Record")
        @Validation(required = true)
        public java.util.List<DescribeDomainRecordsResponseDomainRecordsRecord> record;

        public static DescribeDomainRecordsResponseDomainRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRecordsResponseDomainRecords self = new DescribeDomainRecordsResponseDomainRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRecordsResponseDomainRecords setRecord(java.util.List<DescribeDomainRecordsResponseDomainRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<DescribeDomainRecordsResponseDomainRecordsRecord> getRecord() {
            return this.record;
        }

    }

}

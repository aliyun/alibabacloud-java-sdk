// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsResponseBody extends TeaModel {
    @NameInMap("DomainRecords")
    public DescribeDomainRecordsResponseBodyDomainRecords domainRecords;

    /**
     * <p>The page number.</p>
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
     * <p>20</p>
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
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("LbaStatus")
        public Boolean lbaStatus;

        @NameInMap("Line")
        public String line;

        @NameInMap("Locked")
        public Boolean locked;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("RR")
        public String RR;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        @NameInMap("TTL")
        public Long TTL;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("Value")
        public String value;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeDomainRecordsResponseBodyDomainRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRecordsResponseBodyDomainRecordsRecord self = new DescribeDomainRecordsResponseBodyDomainRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setLbaStatus(Boolean lbaStatus) {
            this.lbaStatus = lbaStatus;
            return this;
        }
        public Boolean getLbaStatus() {
            return this.lbaStatus;
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

        public DescribeDomainRecordsResponseBodyDomainRecordsRecord setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainRecords")
    public java.util.List<DescribeDomainRecordsResponseBodyDomainRecords> domainRecords;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeDomainRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordsResponseBody self = new DescribeDomainRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public DescribeDomainRecordsResponseBody setDomainRecords(java.util.List<DescribeDomainRecordsResponseBodyDomainRecords> domainRecords) {
        this.domainRecords = domainRecords;
        return this;
    }
    public java.util.List<DescribeDomainRecordsResponseBodyDomainRecords> getDomainRecords() {
        return this.domainRecords;
    }

    public DescribeDomainRecordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeDomainRecordsResponseBodyDomainRecords extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("TTL")
        public Long TTL;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("RR")
        public String RR;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Value")
        public String value;

        @NameInMap("Line")
        public String line;

        @NameInMap("Locked")
        public Boolean locked;

        public static DescribeDomainRecordsResponseBodyDomainRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRecordsResponseBodyDomainRecords self = new DescribeDomainRecordsResponseBodyDomainRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setTTL(Long TTL) {
            this.TTL = TTL;
            return this;
        }
        public Long getTTL() {
            return this.TTL;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setRR(String RR) {
            this.RR = RR;
            return this;
        }
        public String getRR() {
            return this.RR;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeDomainRecordsResponseBodyDomainRecords setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

    }

}

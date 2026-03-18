// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListRecursionRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public ListRecursionRecordsResponseBodyRecords records;

    /**
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListRecursionRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecursionRecordsResponseBody self = new ListRecursionRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecursionRecordsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRecursionRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecursionRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecursionRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecursionRecordsResponseBody setRecords(ListRecursionRecordsResponseBodyRecords records) {
        this.records = records;
        return this;
    }
    public ListRecursionRecordsResponseBodyRecords getRecords() {
        return this.records;
    }

    public ListRecursionRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecursionRecordsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListRecursionRecordsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListRecursionRecordsResponseBodyRecordsRecord extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Creator")
        public Long creator;

        @NameInMap("CreatorSubType")
        public String creatorSubType;

        @NameInMap("CreatorType")
        public String creatorType;

        @NameInMap("EnableStatus")
        public String enableStatus;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RequestSource")
        public String requestSource;

        @NameInMap("Rr")
        public String rr;

        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("Value")
        public String value;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListRecursionRecordsResponseBodyRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            ListRecursionRecordsResponseBodyRecordsRecord self = new ListRecursionRecordsResponseBodyRecordsRecord();
            return TeaModel.build(map, self);
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setRequestSource(String requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public String getRequestSource() {
            return this.requestSource;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setRr(String rr) {
            this.rr = rr;
            return this;
        }
        public String getRr() {
            return this.rr;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ListRecursionRecordsResponseBodyRecordsRecord setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListRecursionRecordsResponseBodyRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<ListRecursionRecordsResponseBodyRecordsRecord> record;

        public static ListRecursionRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListRecursionRecordsResponseBodyRecords self = new ListRecursionRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListRecursionRecordsResponseBodyRecords setRecord(java.util.List<ListRecursionRecordsResponseBodyRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<ListRecursionRecordsResponseBodyRecordsRecord> getRecord() {
            return this.record;
        }

    }

}

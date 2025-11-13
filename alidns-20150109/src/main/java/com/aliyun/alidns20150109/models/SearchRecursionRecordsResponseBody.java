// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchRecursionRecordsResponseBody extends TeaModel {
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
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public SearchRecursionRecordsResponseBodyRecords records;

    /**
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
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
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static SearchRecursionRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchRecursionRecordsResponseBody self = new SearchRecursionRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchRecursionRecordsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchRecursionRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchRecursionRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchRecursionRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchRecursionRecordsResponseBody setRecords(SearchRecursionRecordsResponseBodyRecords records) {
        this.records = records;
        return this;
    }
    public SearchRecursionRecordsResponseBodyRecords getRecords() {
        return this.records;
    }

    public SearchRecursionRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchRecursionRecordsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchRecursionRecordsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class SearchRecursionRecordsResponseBodyRecordsRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-16T02:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1615182315000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>1521021611066866</p>
         */
        @NameInMap("Creator")
        public Long creator;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("CreatorSubType")
        public String creatorSubType;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("CreatorType")
        public String creatorType;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>record ID</p>
         * 
         * <strong>example:</strong>
         * <p>1927184083990351872</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <strong>example:</strong>
         * <p>vxwk</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("RequestSource")
        public String requestSource;

        /**
         * <strong>example:</strong>
         * <p>wap</p>
         */
        @NameInMap("Rr")
        public String rr;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2022-10-28T13:07Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1722107570000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <strong>example:</strong>
         * <p>14.19.85.71</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Weight")
        public String weight;

        /**
         * <p>zone ID</p>
         * 
         * <strong>example:</strong>
         * <p>169783221000012</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static SearchRecursionRecordsResponseBodyRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            SearchRecursionRecordsResponseBodyRecordsRecord self = new SearchRecursionRecordsResponseBodyRecordsRecord();
            return TeaModel.build(map, self);
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setRequestSource(String requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public String getRequestSource() {
            return this.requestSource;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setRr(String rr) {
            this.rr = rr;
            return this;
        }
        public String getRr() {
            return this.rr;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

        public SearchRecursionRecordsResponseBodyRecordsRecord setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class SearchRecursionRecordsResponseBodyRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<SearchRecursionRecordsResponseBodyRecordsRecord> record;

        public static SearchRecursionRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchRecursionRecordsResponseBodyRecords self = new SearchRecursionRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public SearchRecursionRecordsResponseBodyRecords setRecord(java.util.List<SearchRecursionRecordsResponseBodyRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<SearchRecursionRecordsResponseBodyRecordsRecord> getRecord() {
            return this.record;
        }

    }

}

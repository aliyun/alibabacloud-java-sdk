// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSetRecordsResponseBody extends TeaModel {
    /**
     * <p>The list of dataset records.</p>
     */
    @NameInMap("DataSetRecords")
    public java.util.List<ListDataSetRecordsResponseBodyDataSetRecords> dataSetRecords;

    /**
     * <p>The maximum number of results to return per query when you use the NextToken parameter. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDataSetRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetRecordsResponseBody self = new ListDataSetRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSetRecordsResponseBody setDataSetRecords(java.util.List<ListDataSetRecordsResponseBodyDataSetRecords> dataSetRecords) {
        this.dataSetRecords = dataSetRecords;
        return this;
    }
    public java.util.List<ListDataSetRecordsResponseBodyDataSetRecords> getDataSetRecords() {
        return this.dataSetRecords;
    }

    public ListDataSetRecordsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataSetRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataSetRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSetRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSetRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSetRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataSetRecordsResponseBodyDataSetRecords extends TeaModel {
        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1658974643000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-t8ha6p7k61rmniqw****</p>
         */
        @NameInMap("DataSetId")
        public String dataSetId;

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest</p>
         */
        @NameInMap("DataSetName")
        public String dataSetName;

        /**
         * <p>The ID of the dataset record.</p>
         * 
         * <strong>example:</strong>
         * <p>124566</p>
         */
        @NameInMap("DataSetRecordId")
        public String dataSetRecordId;

        /**
         * <p>The values of the dataset record.</p>
         */
        @NameInMap("DataSetRecordValues")
        public String dataSetRecordValues;

        /**
         * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1658974643000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataSetRecordsResponseBodyDataSetRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetRecordsResponseBodyDataSetRecords self = new ListDataSetRecordsResponseBodyDataSetRecords();
            return TeaModel.build(map, self);
        }

        public ListDataSetRecordsResponseBodyDataSetRecords setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSetRecordsResponseBodyDataSetRecords setDataSetId(String dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public String getDataSetId() {
            return this.dataSetId;
        }

        public ListDataSetRecordsResponseBodyDataSetRecords setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ListDataSetRecordsResponseBodyDataSetRecords setDataSetRecordId(String dataSetRecordId) {
            this.dataSetRecordId = dataSetRecordId;
            return this;
        }
        public String getDataSetRecordId() {
            return this.dataSetRecordId;
        }

        public ListDataSetRecordsResponseBodyDataSetRecords setDataSetRecordValues(String dataSetRecordValues) {
            this.dataSetRecordValues = dataSetRecordValues;
            return this;
        }
        public String getDataSetRecordValues() {
            return this.dataSetRecordValues;
        }

        public ListDataSetRecordsResponseBodyDataSetRecords setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}

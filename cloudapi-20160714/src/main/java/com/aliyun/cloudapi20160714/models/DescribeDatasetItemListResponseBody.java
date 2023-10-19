// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemListResponseBody extends TeaModel {
    /**
     * <p>The Dataset information.</p>
     */
    @NameInMap("DatasetItemInfoList")
    public java.util.List<DescribeDatasetItemListResponseBodyDatasetItemInfoList> datasetItemInfoList;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDatasetItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetItemListResponseBody self = new DescribeDatasetItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetItemListResponseBody setDatasetItemInfoList(java.util.List<DescribeDatasetItemListResponseBodyDatasetItemInfoList> datasetItemInfoList) {
        this.datasetItemInfoList = datasetItemInfoList;
        return this;
    }
    public java.util.List<DescribeDatasetItemListResponseBodyDatasetItemInfoList> getDatasetItemInfoList() {
        return this.datasetItemInfoList;
    }

    public DescribeDatasetItemListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatasetItemListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatasetItemListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatasetItemListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDatasetItemListResponseBodyDatasetItemInfoList extends TeaModel {
        /**
         * <p>The time when the data entry was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the dataset.</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The ID of the data entry.</p>
         */
        @NameInMap("DatasetItemId")
        public String datasetItemId;

        /**
         * <p>The description of the data entry.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time in UTC when the data entry expires. The time is in the **yyyy-MM-ddTHH:mm:ssZ** format. If this parameter is empty, the data entry does not expire.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The last modification time (UTC) of the data entry.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The value of the data entry.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDatasetItemListResponseBodyDatasetItemInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatasetItemListResponseBodyDatasetItemInfoList self = new DescribeDatasetItemListResponseBodyDatasetItemInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeDatasetItemListResponseBodyDatasetItemInfoList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDatasetItemListResponseBodyDatasetItemInfoList setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public DescribeDatasetItemListResponseBodyDatasetItemInfoList setDatasetItemId(String datasetItemId) {
            this.datasetItemId = datasetItemId;
            return this;
        }
        public String getDatasetItemId() {
            return this.datasetItemId;
        }

        public DescribeDatasetItemListResponseBodyDatasetItemInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDatasetItemListResponseBodyDatasetItemInfoList setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDatasetItemListResponseBodyDatasetItemInfoList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeDatasetItemListResponseBodyDatasetItemInfoList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetListResponseBody extends TeaModel {
    @NameInMap("DatasetInfoList")
    public java.util.List<DescribeDatasetListResponseBodyDatasetInfoList> datasetInfoList;

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
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDatasetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetListResponseBody self = new DescribeDatasetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetListResponseBody setDatasetInfoList(java.util.List<DescribeDatasetListResponseBodyDatasetInfoList> datasetInfoList) {
        this.datasetInfoList = datasetInfoList;
        return this;
    }
    public java.util.List<DescribeDatasetListResponseBodyDatasetInfoList> getDatasetInfoList() {
        return this.datasetInfoList;
    }

    public DescribeDatasetListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatasetListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatasetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatasetListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDatasetListResponseBodyDatasetInfoList extends TeaModel {
        /**
         * <p>The creation time (UTC) of the dataset.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the dataset.</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The name of the dataset.</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The type of the dataset. Valid values:</p>
         * <br>
         * <p>*   JWT_BLOCKING: a JSON Web Token (JWT) blacklist</p>
         * <p>*   IP_WHITELIST_CIDR : an IP address whitelist</p>
         * <p>*   PARAMETER_ACCESS : parameter-based access control</p>
         */
        @NameInMap("DatasetType")
        public String datasetType;

        /**
         * <p>The last modification time (UTC) of the dataset.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static DescribeDatasetListResponseBodyDatasetInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatasetListResponseBodyDatasetInfoList self = new DescribeDatasetListResponseBodyDatasetInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeDatasetListResponseBodyDatasetInfoList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDatasetListResponseBodyDatasetInfoList setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public DescribeDatasetListResponseBodyDatasetInfoList setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public DescribeDatasetListResponseBodyDatasetInfoList setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public DescribeDatasetListResponseBodyDatasetInfoList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}

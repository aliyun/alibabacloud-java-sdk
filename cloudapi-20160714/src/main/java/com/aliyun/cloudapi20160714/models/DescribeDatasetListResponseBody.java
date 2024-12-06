// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetListResponseBody extends TeaModel {
    /**
     * <p>The returned dataset information. It is an array consisting of datasetinfo.</p>
     */
    @NameInMap("DatasetInfoList")
    public java.util.List<DescribeDatasetListResponseBodyDatasetInfoList> datasetInfoList;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>D403C6E6-21B3-5B78-82DA-E3B6********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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

    public static class DescribeDatasetListResponseBodyDatasetInfoListTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>ENV</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDatasetListResponseBodyDatasetInfoListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatasetListResponseBodyDatasetInfoListTags self = new DescribeDatasetListResponseBodyDatasetInfoListTags();
            return TeaModel.build(map, self);
        }

        public DescribeDatasetListResponseBodyDatasetInfoListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDatasetListResponseBodyDatasetInfoListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDatasetListResponseBodyDatasetInfoList extends TeaModel {
        /**
         * <p>The time when the dataset was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-21T12:58:43Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6304ce6b4ae6453f********</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>DatasetName</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The dataset type. Valid values:</p>
         * <ul>
         * <li>JWT_BLOCKING : a JSON Web Token (JWT) blacklist</li>
         * <li>IP_WHITELIST_CIDR : an IP address whitelist</li>
         * <li>PARAMETER_ACCESS: a list of parameters for parameter-based access control</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IP_WHITELIST_CIDR</p>
         */
        @NameInMap("DatasetType")
        public String datasetType;

        /**
         * <p>The time when the dataset was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-21T12:58:43Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Tags")
        public java.util.List<DescribeDatasetListResponseBodyDatasetInfoListTags> tags;

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

        public DescribeDatasetListResponseBodyDatasetInfoList setTags(java.util.List<DescribeDatasetListResponseBodyDatasetInfoListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDatasetListResponseBodyDatasetInfoListTags> getTags() {
            return this.tags;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemListResponseBody extends TeaModel {
    @NameInMap("DatasetItemInfoList")
    public java.util.List<DescribeDatasetItemListResponseBodyDatasetItemInfoList> datasetItemInfoList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("DatasetItemId")
        public String datasetItemId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

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

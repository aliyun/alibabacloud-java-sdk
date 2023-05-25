// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetListResponseBody extends TeaModel {
    @NameInMap("DatasetInfoList")
    public java.util.List<DescribeDatasetListResponseBodyDatasetInfoList> datasetInfoList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("DatasetType")
        public String datasetType;

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

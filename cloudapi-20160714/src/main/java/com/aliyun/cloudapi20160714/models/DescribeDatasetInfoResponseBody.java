// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetInfoResponseBody extends TeaModel {
    @NameInMap("DatasetInfo")
    public DescribeDatasetInfoResponseBodyDatasetInfo datasetInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDatasetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetInfoResponseBody self = new DescribeDatasetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetInfoResponseBody setDatasetInfo(DescribeDatasetInfoResponseBodyDatasetInfo datasetInfo) {
        this.datasetInfo = datasetInfo;
        return this;
    }
    public DescribeDatasetInfoResponseBodyDatasetInfo getDatasetInfo() {
        return this.datasetInfo;
    }

    public DescribeDatasetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDatasetInfoResponseBodyDatasetInfo extends TeaModel {
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

        public static DescribeDatasetInfoResponseBodyDatasetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatasetInfoResponseBodyDatasetInfo self = new DescribeDatasetInfoResponseBodyDatasetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatasetInfoResponseBodyDatasetInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDatasetInfoResponseBodyDatasetInfo setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public DescribeDatasetInfoResponseBodyDatasetInfo setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public DescribeDatasetInfoResponseBodyDatasetInfo setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public DescribeDatasetInfoResponseBodyDatasetInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}

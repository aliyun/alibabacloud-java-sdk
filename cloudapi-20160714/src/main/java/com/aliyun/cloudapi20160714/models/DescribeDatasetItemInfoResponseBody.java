// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemInfoResponseBody extends TeaModel {
    @NameInMap("DatasetItemInfo")
    public DescribeDatasetItemInfoResponseBodyDatasetItemInfo datasetItemInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDatasetItemInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetItemInfoResponseBody self = new DescribeDatasetItemInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetItemInfoResponseBody setDatasetItemInfo(DescribeDatasetItemInfoResponseBodyDatasetItemInfo datasetItemInfo) {
        this.datasetItemInfo = datasetItemInfo;
        return this;
    }
    public DescribeDatasetItemInfoResponseBodyDatasetItemInfo getDatasetItemInfo() {
        return this.datasetItemInfo;
    }

    public DescribeDatasetItemInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDatasetItemInfoResponseBodyDatasetItemInfo extends TeaModel {
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

        public static DescribeDatasetItemInfoResponseBodyDatasetItemInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatasetItemInfoResponseBodyDatasetItemInfo self = new DescribeDatasetItemInfoResponseBodyDatasetItemInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatasetItemInfoResponseBodyDatasetItemInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDatasetItemInfoResponseBodyDatasetItemInfo setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public DescribeDatasetItemInfoResponseBodyDatasetItemInfo setDatasetItemId(String datasetItemId) {
            this.datasetItemId = datasetItemId;
            return this;
        }
        public String getDatasetItemId() {
            return this.datasetItemId;
        }

        public DescribeDatasetItemInfoResponseBodyDatasetItemInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDatasetItemInfoResponseBodyDatasetItemInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDatasetItemInfoResponseBodyDatasetItemInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeDatasetItemInfoResponseBodyDatasetItemInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

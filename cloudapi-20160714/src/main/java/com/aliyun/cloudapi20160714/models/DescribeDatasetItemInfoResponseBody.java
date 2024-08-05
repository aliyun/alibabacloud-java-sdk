// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemInfoResponseBody extends TeaModel {
    /**
     * <p>The Dataset information.</p>
     */
    @NameInMap("DatasetItemInfo")
    public DescribeDatasetItemInfoResponseBodyDatasetItemInfo datasetItemInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5BAFA85F-38E3-5D9E-9E32-4B09********</p>
     */
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
        /**
         * <p>The creation time (UTC) of the data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-21T12:58:43Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>626238665db4a5140eea3e40********</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The ID of the data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>5045****</p>
         */
        @NameInMap("DatasetItemId")
        public String datasetItemId;

        /**
         * <p>The description of the data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time in UTC when the data entry expires. The time is in the <strong>yyyy-MM-ddTHH:mm:ssZ</strong> format. If this parameter is empty, the data entry does not expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-22T12:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The last modification time (UTC) of the data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-21T12:58:43Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The value of the data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>106.43.XXX.XXX</p>
         */
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

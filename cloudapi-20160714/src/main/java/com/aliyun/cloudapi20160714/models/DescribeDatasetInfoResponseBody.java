// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetInfoResponseBody extends TeaModel {
    /**
     * <p>The dataset info.</p>
     */
    @NameInMap("DatasetInfo")
    public DescribeDatasetInfoResponseBodyDatasetInfo datasetInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A2C8F75E-EE84-5C64-960F-45C8********</p>
     */
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
        /**
         * <p>The creation time (UTC) of the dataset.</p>
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
         * <p>62b91a790a693238********</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>DatasetName</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The type of the dataset. Valid values:</p>
         * <ul>
         * <li>JWT_BLOCKING: a JSON Web Token (JWT) blacklist</li>
         * <li>IP_WHITELIST_CIDR : an IP address whitelist</li>
         * <li>PARAMETER_ACCESS : parameter-based access control</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JWT_BLOCKING</p>
         */
        @NameInMap("DatasetType")
        public String datasetType;

        @NameInMap("Description")
        public String description;

        /**
         * <p>The last modification time (UTC) of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-21T12:58:43Z</p>
         */
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

        public DescribeDatasetInfoResponseBodyDatasetInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

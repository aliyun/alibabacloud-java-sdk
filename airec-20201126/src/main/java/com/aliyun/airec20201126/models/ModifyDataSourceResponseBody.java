// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyDataSourceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details about the data source.</p>
     */
    @NameInMap("result")
    public ModifyDataSourceResponseBodyResult result;

    public static ModifyDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceResponseBody self = new ModifyDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyDataSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDataSourceResponseBody setResult(ModifyDataSourceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyDataSourceResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyDataSourceResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The AccessKey ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>airec</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The partition in the MaxCompute table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20181122</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The path of the OSS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://xxx.xxx</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The name of the MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>openrec_gray</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The name of the MaxCompute table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_maxcompute</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>The timestamp. The value must be accurate to the millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1544112000000</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The type of the data source. Only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("type")
        public String type;

        public static ModifyDataSourceResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceResponseBodyResultMeta self = new ModifyDataSourceResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceResponseBodyResultMeta setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ModifyDataSourceResponseBodyResultMeta setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ModifyDataSourceResponseBodyResultMeta setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ModifyDataSourceResponseBodyResultMeta setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyDataSourceResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ModifyDataSourceResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ModifyDataSourceResponseBodyResultMeta setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ModifyDataSourceResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyDataSourceResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the data source was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the data source was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The parameters of the data source.</p>
         */
        @NameInMap("meta")
        public ModifyDataSourceResponseBodyResultMeta meta;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>behavior</p>
         */
        @NameInMap("tableName")
        public String tableName;

        public static ModifyDataSourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceResponseBodyResult self = new ModifyDataSourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyDataSourceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyDataSourceResponseBodyResult setMeta(ModifyDataSourceResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ModifyDataSourceResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ModifyDataSourceResponseBodyResult setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}

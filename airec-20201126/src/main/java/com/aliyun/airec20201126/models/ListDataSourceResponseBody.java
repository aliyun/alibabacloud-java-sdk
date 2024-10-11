// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListDataSourceResponseBodyResult> result;

    public static ListDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceResponseBody self = new ListDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceResponseBody setResult(java.util.List<ListDataSourceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataSourceResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataSourceResponseBodyResultMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>airec</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>ds=20181122</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <strong>example:</strong>
         * <p>oss://xxx.xxx</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>openrec_gray</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>test_maxcompute</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>1544112000000</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDataSourceResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyResultMeta self = new ListDataSourceResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyResultMeta setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ListDataSourceResponseBodyResultMeta setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListDataSourceResponseBodyResultMeta setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ListDataSourceResponseBodyResultMeta setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListDataSourceResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDataSourceResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDataSourceResponseBodyResultMeta setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListDataSourceResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataSourceResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("meta")
        public ListDataSourceResponseBodyResultMeta meta;

        /**
         * <strong>example:</strong>
         * <p>behavior</p>
         */
        @NameInMap("tableName")
        public String tableName;

        public static ListDataSourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyResult self = new ListDataSourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataSourceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataSourceResponseBodyResult setMeta(ListDataSourceResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListDataSourceResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ListDataSourceResponseBodyResult setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}

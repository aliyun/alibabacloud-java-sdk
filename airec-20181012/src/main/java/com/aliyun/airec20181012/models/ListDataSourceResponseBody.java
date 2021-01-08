// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDataSourceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<ListDataSourceResponseBodyResult> result;

    public static ListDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceResponseBody self = new ListDataSourceResponseBody();
        return TeaModel.build(map, self);
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

    public ListDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSourceResponseBody setResult(java.util.List<ListDataSourceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataSourceResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataSourceResponseBodyResultMeta extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Path")
        public String path;

        @NameInMap("Partition")
        public String partition;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        public static ListDataSourceResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyResultMeta self = new ListDataSourceResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDataSourceResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDataSourceResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDataSourceResponseBodyResultMeta setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListDataSourceResponseBodyResultMeta setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListDataSourceResponseBodyResultMeta setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ListDataSourceResponseBodyResultMeta setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListDataSourceResponseBodyResultMeta setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

    }

    public static class ListDataSourceResponseBodyResult extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Meta")
        public ListDataSourceResponseBodyResultMeta meta;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static ListDataSourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyResult self = new ListDataSourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyResult setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDataSourceResponseBodyResult setMeta(ListDataSourceResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListDataSourceResponseBodyResultMeta getMeta() {
            return this.meta;
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

    }

}

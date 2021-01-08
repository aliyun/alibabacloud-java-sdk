// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyDataSourceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public ModifyDataSourceResponseBodyResult result;

    public static ModifyDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceResponseBody self = new ModifyDataSourceResponseBody();
        return TeaModel.build(map, self);
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

    public ModifyDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyDataSourceResponseBody setResult(ModifyDataSourceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyDataSourceResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyDataSourceResponseBodyResultMeta extends TeaModel {
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

        public static ModifyDataSourceResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceResponseBodyResultMeta self = new ModifyDataSourceResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyDataSourceResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ModifyDataSourceResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ModifyDataSourceResponseBodyResultMeta setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ModifyDataSourceResponseBodyResultMeta setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyDataSourceResponseBodyResultMeta setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ModifyDataSourceResponseBodyResultMeta setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ModifyDataSourceResponseBodyResultMeta setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

    }

    public static class ModifyDataSourceResponseBodyResult extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Meta")
        public ModifyDataSourceResponseBodyResultMeta meta;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static ModifyDataSourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceResponseBodyResult self = new ModifyDataSourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceResponseBodyResult setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ModifyDataSourceResponseBodyResult setMeta(ModifyDataSourceResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ModifyDataSourceResponseBodyResultMeta getMeta() {
            return this.meta;
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

    }

}

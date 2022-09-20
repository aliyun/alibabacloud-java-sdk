// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryDumpFilesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryDumpFilesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDumpFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDumpFilesResponseBody self = new QueryDumpFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDumpFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDumpFilesResponseBody setData(java.util.List<QueryDumpFilesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDumpFilesResponseBodyData> getData() {
        return this.data;
    }

    public QueryDumpFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDumpFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDumpFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDumpFilesResponseBodyData extends TeaModel {
        @NameInMap("FileCreatTime")
        public String fileCreatTime;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("ObjectName")
        public String objectName;

        public static QueryDumpFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDumpFilesResponseBodyData self = new QueryDumpFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDumpFilesResponseBodyData setFileCreatTime(String fileCreatTime) {
            this.fileCreatTime = fileCreatTime;
            return this;
        }
        public String getFileCreatTime() {
            return this.fileCreatTime;
        }

        public QueryDumpFilesResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryDumpFilesResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryDumpFilesResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public QueryDumpFilesResponseBodyData setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

}

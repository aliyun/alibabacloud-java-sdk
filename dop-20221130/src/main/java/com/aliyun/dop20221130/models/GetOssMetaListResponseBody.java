// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class GetOssMetaListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetOssMetaListResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOssMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssMetaListResponseBody self = new GetOssMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssMetaListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetOssMetaListResponseBody setData(java.util.List<GetOssMetaListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOssMetaListResponseBodyData> getData() {
        return this.data;
    }

    public GetOssMetaListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOssMetaListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetOssMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssMetaListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOssMetaListResponseBodyData extends TeaModel {
        @NameInMap("ds")
        public String ds;

        @NameInMap("fileNames")
        public java.util.List<String> fileNames;

        @NameInMap("fileSize")
        public String fileSize;

        @NameInMap("rows")
        public String rows;

        public static GetOssMetaListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssMetaListResponseBodyData self = new GetOssMetaListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssMetaListResponseBodyData setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public GetOssMetaListResponseBodyData setFileNames(java.util.List<String> fileNames) {
            this.fileNames = fileNames;
            return this;
        }
        public java.util.List<String> getFileNames() {
            return this.fileNames;
        }

        public GetOssMetaListResponseBodyData setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetOssMetaListResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

    }

}

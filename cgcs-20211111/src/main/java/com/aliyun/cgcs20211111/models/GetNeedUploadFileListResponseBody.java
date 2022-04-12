// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetNeedUploadFileListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetNeedUploadFileListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetNeedUploadFileListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNeedUploadFileListResponseBody self = new GetNeedUploadFileListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNeedUploadFileListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNeedUploadFileListResponseBody setData(GetNeedUploadFileListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNeedUploadFileListResponseBodyData getData() {
        return this.data;
    }

    public GetNeedUploadFileListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNeedUploadFileListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNeedUploadFileListResponseBodyData extends TeaModel {
        // 错误信息
        @NameInMap("Err")
        public String err;

        // 待上传文件列表
        @NameInMap("NeedUploadFileList")
        public java.util.List<String> needUploadFileList;

        // 请求结果
        @NameInMap("Success")
        public Boolean success;

        public static GetNeedUploadFileListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNeedUploadFileListResponseBodyData self = new GetNeedUploadFileListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNeedUploadFileListResponseBodyData setErr(String err) {
            this.err = err;
            return this;
        }
        public String getErr() {
            return this.err;
        }

        public GetNeedUploadFileListResponseBodyData setNeedUploadFileList(java.util.List<String> needUploadFileList) {
            this.needUploadFileList = needUploadFileList;
            return this;
        }
        public java.util.List<String> getNeedUploadFileList() {
            return this.needUploadFileList;
        }

        public GetNeedUploadFileListResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}

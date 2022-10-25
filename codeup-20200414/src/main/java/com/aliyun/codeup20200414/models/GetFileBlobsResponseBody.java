// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetFileBlobsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetFileBlobsResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetFileBlobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileBlobsResponseBody self = new GetFileBlobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileBlobsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileBlobsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileBlobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileBlobsResponseBody setResult(GetFileBlobsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFileBlobsResponseBodyResult getResult() {
        return this.result;
    }

    public GetFileBlobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileBlobsResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("TotalLines")
        public Integer totalLines;

        public static GetFileBlobsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFileBlobsResponseBodyResult self = new GetFileBlobsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFileBlobsResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFileBlobsResponseBodyResult setTotalLines(Integer totalLines) {
            this.totalLines = totalLines;
            return this;
        }
        public Integer getTotalLines() {
            return this.totalLines;
        }

    }

}

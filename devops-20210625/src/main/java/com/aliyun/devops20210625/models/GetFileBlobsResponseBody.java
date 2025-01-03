// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFileBlobsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F590C9D8-E908-5B6C-95AC-56B7E8011FFA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetFileBlobsResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
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
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("content")
        public String content;

        @NameInMap("size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("totalLines")
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

        public GetFileBlobsResponseBodyResult setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetDocTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetDocTranslateTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AC642EEB-C29D-54DF-8F52-622565BBB78A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDocTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocTranslateTaskResponseBody self = new GetDocTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocTranslateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocTranslateTaskResponseBody setData(GetDocTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public GetDocTranslateTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDocTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocTranslateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDocTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("charactersCount")
        public Integer charactersCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pageCount")
        public Integer pageCount;

        /**
         * <strong>example:</strong>
         * <p>translated</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>d3a2397bc2c14ab4a2e40a4f5b46241b</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://translate-ai-data-dev.oss-cn-hangzhou.aliyuncs.com/tongyiTranslate/123456789/a7630164ce894c799cca0f0822c36f84_merge.md?Expires=1756700753&OSSAccessKeyId=LTAI5tRmTwxU5YoHUyrF93Jv&Signature=qB03ldVmRa%2FRwWgJ2wSi7ylayMA%3D">http://translate-ai-data-dev.oss-cn-hangzhou.aliyuncs.com/tongyiTranslate/123456789/a7630164ce894c799cca0f0822c36f84_merge.md?Expires=1756700753&amp;OSSAccessKeyId=LTAI5tRmTwxU5YoHUyrF93Jv&amp;Signature=qB03ldVmRa%2FRwWgJ2wSi7ylayMA%3D</a></p>
         */
        @NameInMap("translateFileUrl")
        public String translateFileUrl;

        public static GetDocTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocTranslateTaskResponseBodyData self = new GetDocTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocTranslateTaskResponseBodyData setCharactersCount(Integer charactersCount) {
            this.charactersCount = charactersCount;
            return this;
        }
        public Integer getCharactersCount() {
            return this.charactersCount;
        }

        public GetDocTranslateTaskResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public GetDocTranslateTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDocTranslateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetDocTranslateTaskResponseBodyData setTranslateFileUrl(String translateFileUrl) {
            this.translateFileUrl = translateFileUrl;
            return this;
        }
        public String getTranslateFileUrl() {
            return this.translateFileUrl;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>60945D4F-CF6D-5CFF-89ED-1D1F6657032C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteTagResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagResponseBody self = new DeleteTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteTagResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTagResponseBody setResult(DeleteTagResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteTagResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteTagResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>v1.0</p>
         */
        @NameInMap("tagName")
        public String tagName;

        public static DeleteTagResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteTagResponseBodyResult self = new DeleteTagResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteTagResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}

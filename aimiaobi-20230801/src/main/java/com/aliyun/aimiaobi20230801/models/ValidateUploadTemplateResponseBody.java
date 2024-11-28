// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ValidateUploadTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ValidateUploadTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ValidateUploadTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateUploadTemplateResponseBody self = new ValidateUploadTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateUploadTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateUploadTemplateResponseBody setData(ValidateUploadTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateUploadTemplateResponseBodyData getData() {
        return this.data;
    }

    public ValidateUploadTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ValidateUploadTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateUploadTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateUploadTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ValidateUploadTemplateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CommentCount")
        public Integer commentCount;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DialogueCount")
        public Integer dialogueCount;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ValidateUploadTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateUploadTemplateResponseBodyData self = new ValidateUploadTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateUploadTemplateResponseBodyData setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
            return this;
        }
        public Integer getCommentCount() {
            return this.commentCount;
        }

        public ValidateUploadTemplateResponseBodyData setDialogueCount(Integer dialogueCount) {
            this.dialogueCount = dialogueCount;
            return this;
        }
        public Integer getDialogueCount() {
            return this.dialogueCount;
        }

        public ValidateUploadTemplateResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

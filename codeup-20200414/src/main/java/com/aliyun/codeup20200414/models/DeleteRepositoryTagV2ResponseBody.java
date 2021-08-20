// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryTagV2ResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public DeleteRepositoryTagV2ResponseBodyResult result;

    public static DeleteRepositoryTagV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryTagV2ResponseBody self = new DeleteRepositoryTagV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryTagV2ResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryTagV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryTagV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteRepositoryTagV2ResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryTagV2ResponseBody setResult(DeleteRepositoryTagV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryTagV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRepositoryTagV2ResponseBodyResult extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        public static DeleteRepositoryTagV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryTagV2ResponseBodyResult self = new DeleteRepositoryTagV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryTagV2ResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}

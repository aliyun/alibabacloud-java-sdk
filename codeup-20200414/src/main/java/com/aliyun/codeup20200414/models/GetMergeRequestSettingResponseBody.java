// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetMergeRequestSettingResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public GetMergeRequestSettingResponseBodyResult result;

    public static GetMergeRequestSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestSettingResponseBody self = new GetMergeRequestSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestSettingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMergeRequestSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMergeRequestSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMergeRequestSettingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMergeRequestSettingResponseBody setResult(GetMergeRequestSettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMergeRequestSettingResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMergeRequestSettingResponseBodyResult extends TeaModel {
        @NameInMap("IsEnableSmartCodeReview")
        public Boolean isEnableSmartCodeReview;

        @NameInMap("MergeTypes")
        public java.util.List<String> mergeTypes;

        public static GetMergeRequestSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestSettingResponseBodyResult self = new GetMergeRequestSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestSettingResponseBodyResult setIsEnableSmartCodeReview(Boolean isEnableSmartCodeReview) {
            this.isEnableSmartCodeReview = isEnableSmartCodeReview;
            return this;
        }
        public Boolean getIsEnableSmartCodeReview() {
            return this.isEnableSmartCodeReview;
        }

        public GetMergeRequestSettingResponseBodyResult setMergeTypes(java.util.List<String> mergeTypes) {
            this.mergeTypes = mergeTypes;
            return this;
        }
        public java.util.List<String> getMergeTypes() {
            return this.mergeTypes;
        }

    }

}

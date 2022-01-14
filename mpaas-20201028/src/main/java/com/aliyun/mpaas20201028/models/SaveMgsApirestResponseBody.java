// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SaveMgsApirestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public SaveMgsApirestResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static SaveMgsApirestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveMgsApirestResponseBody self = new SaveMgsApirestResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveMgsApirestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveMgsApirestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveMgsApirestResponseBody setResultContent(SaveMgsApirestResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public SaveMgsApirestResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public SaveMgsApirestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class SaveMgsApirestResponseBodyResultContent extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Value")
        public Boolean value;

        public static SaveMgsApirestResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            SaveMgsApirestResponseBodyResultContent self = new SaveMgsApirestResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public SaveMgsApirestResponseBodyResultContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SaveMgsApirestResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SaveMgsApirestResponseBodyResultContent setValue(Boolean value) {
            this.value = value;
            return this;
        }
        public Boolean getValue() {
            return this.value;
        }

    }

}

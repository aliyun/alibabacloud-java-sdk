// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMpaasAppInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public UpdateMpaasAppInfoResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static UpdateMpaasAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMpaasAppInfoResponseBody self = new UpdateMpaasAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMpaasAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMpaasAppInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMpaasAppInfoResponseBody setResultContent(UpdateMpaasAppInfoResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateMpaasAppInfoResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public UpdateMpaasAppInfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class UpdateMpaasAppInfoResponseBodyResultContentData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static UpdateMpaasAppInfoResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMpaasAppInfoResponseBodyResultContentData self = new UpdateMpaasAppInfoResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public UpdateMpaasAppInfoResponseBodyResultContentData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateMpaasAppInfoResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateMpaasAppInfoResponseBodyResultContentData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public UpdateMpaasAppInfoResponseBodyResultContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateMpaasAppInfoResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateMpaasAppInfoResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public UpdateMpaasAppInfoResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static UpdateMpaasAppInfoResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateMpaasAppInfoResponseBodyResultContent self = new UpdateMpaasAppInfoResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateMpaasAppInfoResponseBodyResultContent setData(UpdateMpaasAppInfoResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public UpdateMpaasAppInfoResponseBodyResultContentData getData() {
            return this.data;
        }

        public UpdateMpaasAppInfoResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}

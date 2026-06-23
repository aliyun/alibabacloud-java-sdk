// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListCubecardAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ListCubecardAppsResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListCubecardAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCubecardAppsResponseBody self = new ListCubecardAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCubecardAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCubecardAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCubecardAppsResponseBody setResultContent(ListCubecardAppsResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListCubecardAppsResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ListCubecardAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListCubecardAppsResponseBodyResultContentDataContent extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        public static ListCubecardAppsResponseBodyResultContentDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCubecardAppsResponseBodyResultContentDataContent self = new ListCubecardAppsResponseBodyResultContentDataContent();
            return TeaModel.build(map, self);
        }

        public ListCubecardAppsResponseBodyResultContentDataContent setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListCubecardAppsResponseBodyResultContentDataContent setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListCubecardAppsResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListCubecardAppsResponseBodyResultContentDataContent> content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListCubecardAppsResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListCubecardAppsResponseBodyResultContentData self = new ListCubecardAppsResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListCubecardAppsResponseBodyResultContentData setContent(java.util.List<ListCubecardAppsResponseBodyResultContentDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCubecardAppsResponseBodyResultContentDataContent> getContent() {
            return this.content;
        }

        public ListCubecardAppsResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListCubecardAppsResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListCubecardAppsResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListCubecardAppsResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ListCubecardAppsResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ListCubecardAppsResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static ListCubecardAppsResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListCubecardAppsResponseBodyResultContent self = new ListCubecardAppsResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListCubecardAppsResponseBodyResultContent setData(ListCubecardAppsResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ListCubecardAppsResponseBodyResultContentData getData() {
            return this.data;
        }

        public ListCubecardAppsResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetUserAppDonwloadUrlInMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetUserAppDonwloadUrlInMsaResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetUserAppDonwloadUrlInMsaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAppDonwloadUrlInMsaResponseBody self = new GetUserAppDonwloadUrlInMsaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAppDonwloadUrlInMsaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserAppDonwloadUrlInMsaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUserAppDonwloadUrlInMsaResponseBody setResultContent(GetUserAppDonwloadUrlInMsaResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetUserAppDonwloadUrlInMsaResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetUserAppDonwloadUrlInMsaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetUserAppDonwloadUrlInMsaResponseBodyResultContentData extends TeaModel {
        @NameInMap("Filename")
        public String filename;

        @NameInMap("Url")
        public String url;

        public static GetUserAppDonwloadUrlInMsaResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppDonwloadUrlInMsaResponseBodyResultContentData self = new GetUserAppDonwloadUrlInMsaResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetUserAppDonwloadUrlInMsaResponseBodyResultContentData setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public GetUserAppDonwloadUrlInMsaResponseBodyResultContentData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetUserAppDonwloadUrlInMsaResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public GetUserAppDonwloadUrlInMsaResponseBodyResultContentData data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static GetUserAppDonwloadUrlInMsaResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppDonwloadUrlInMsaResponseBodyResultContent self = new GetUserAppDonwloadUrlInMsaResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetUserAppDonwloadUrlInMsaResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetUserAppDonwloadUrlInMsaResponseBodyResultContent setData(GetUserAppDonwloadUrlInMsaResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetUserAppDonwloadUrlInMsaResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetUserAppDonwloadUrlInMsaResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetUserAppDonwloadUrlInMsaResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}

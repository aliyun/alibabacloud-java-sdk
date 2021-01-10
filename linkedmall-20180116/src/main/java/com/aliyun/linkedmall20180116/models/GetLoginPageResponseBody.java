// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetLoginPageResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UrlData")
    public GetLoginPageResponseBodyUrlData urlData;

    @NameInMap("Code")
    public String code;

    public static GetLoginPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPageResponseBody self = new GetLoginPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLoginPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoginPageResponseBody setUrlData(GetLoginPageResponseBodyUrlData urlData) {
        this.urlData = urlData;
        return this;
    }
    public GetLoginPageResponseBodyUrlData getUrlData() {
        return this.urlData;
    }

    public GetLoginPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetLoginPageResponseBodyUrlData extends TeaModel {
        @NameInMap("ReturnUrl")
        public String returnUrl;

        public static GetLoginPageResponseBodyUrlData build(java.util.Map<String, ?> map) throws Exception {
            GetLoginPageResponseBodyUrlData self = new GetLoginPageResponseBodyUrlData();
            return TeaModel.build(map, self);
        }

        public GetLoginPageResponseBodyUrlData setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }
        public String getReturnUrl() {
            return this.returnUrl;
        }

    }

}

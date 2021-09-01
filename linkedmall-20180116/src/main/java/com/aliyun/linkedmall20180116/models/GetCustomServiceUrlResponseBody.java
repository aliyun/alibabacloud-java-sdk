// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCustomServiceUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UrlData")
    public GetCustomServiceUrlResponseBodyUrlData urlData;

    public static GetCustomServiceUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomServiceUrlResponseBody self = new GetCustomServiceUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomServiceUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomServiceUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomServiceUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomServiceUrlResponseBody setUrlData(GetCustomServiceUrlResponseBodyUrlData urlData) {
        this.urlData = urlData;
        return this;
    }
    public GetCustomServiceUrlResponseBodyUrlData getUrlData() {
        return this.urlData;
    }

    public static class GetCustomServiceUrlResponseBodyUrlData extends TeaModel {
        @NameInMap("ReturnUrl")
        public String returnUrl;

        public static GetCustomServiceUrlResponseBodyUrlData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomServiceUrlResponseBodyUrlData self = new GetCustomServiceUrlResponseBodyUrlData();
            return TeaModel.build(map, self);
        }

        public GetCustomServiceUrlResponseBodyUrlData setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }
        public String getReturnUrl() {
            return this.returnUrl;
        }

    }

}

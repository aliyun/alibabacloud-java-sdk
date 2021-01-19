// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCustomServiceUrlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("UrlData")
    @Validation(required = true)
    public GetCustomServiceUrlResponseUrlData urlData;

    public static GetCustomServiceUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomServiceUrlResponse self = new GetCustomServiceUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomServiceUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomServiceUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomServiceUrlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomServiceUrlResponse setUrlData(GetCustomServiceUrlResponseUrlData urlData) {
        this.urlData = urlData;
        return this;
    }
    public GetCustomServiceUrlResponseUrlData getUrlData() {
        return this.urlData;
    }

    public static class GetCustomServiceUrlResponseUrlData extends TeaModel {
        @NameInMap("ReturnUrl")
        @Validation(required = true)
        public String returnUrl;

        public static GetCustomServiceUrlResponseUrlData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomServiceUrlResponseUrlData self = new GetCustomServiceUrlResponseUrlData();
            return TeaModel.build(map, self);
        }

        public GetCustomServiceUrlResponseUrlData setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }
        public String getReturnUrl() {
            return this.returnUrl;
        }

    }

}

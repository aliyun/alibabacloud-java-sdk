// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetLoginPageResponse extends TeaModel {
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
    public GetLoginPageResponseUrlData urlData;

    public static GetLoginPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPageResponse self = new GetLoginPageResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginPageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoginPageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoginPageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLoginPageResponse setUrlData(GetLoginPageResponseUrlData urlData) {
        this.urlData = urlData;
        return this;
    }
    public GetLoginPageResponseUrlData getUrlData() {
        return this.urlData;
    }

    public static class GetLoginPageResponseUrlData extends TeaModel {
        @NameInMap("ReturnUrl")
        @Validation(required = true)
        public String returnUrl;

        public static GetLoginPageResponseUrlData build(java.util.Map<String, ?> map) throws Exception {
            GetLoginPageResponseUrlData self = new GetLoginPageResponseUrlData();
            return TeaModel.build(map, self);
        }

        public GetLoginPageResponseUrlData setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }
        public String getReturnUrl() {
            return this.returnUrl;
        }

    }

}

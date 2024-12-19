// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetLoginPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1267088B-4695-50DC-97B9-9E4F89D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UrlData")
    public GetLoginPageResponseBodyUrlData urlData;

    public static GetLoginPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPageResponseBody self = new GetLoginPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public static class GetLoginPageResponseBodyUrlData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>https://**********</p>
         */
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

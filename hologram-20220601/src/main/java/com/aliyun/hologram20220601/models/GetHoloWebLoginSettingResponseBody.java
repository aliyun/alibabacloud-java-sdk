// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetHoloWebLoginSettingResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetHoloWebLoginSettingResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A8DEF6E-067E-5DB0-BAE1-2894266E6C6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. This is independent of the operation\&quot;s result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHoloWebLoginSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoloWebLoginSettingResponseBody self = new GetHoloWebLoginSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoloWebLoginSettingResponseBody setData(GetHoloWebLoginSettingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHoloWebLoginSettingResponseBodyData getData() {
        return this.data;
    }

    public GetHoloWebLoginSettingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetHoloWebLoginSettingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetHoloWebLoginSettingResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoloWebLoginSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoloWebLoginSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoloWebLoginSettingResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether external accounts are allowed to log in.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowExternalAccountsLogin")
        public Boolean allowExternalAccountsLogin;

        public static GetHoloWebLoginSettingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoloWebLoginSettingResponseBodyData self = new GetHoloWebLoginSettingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoloWebLoginSettingResponseBodyData setAllowExternalAccountsLogin(Boolean allowExternalAccountsLogin) {
            this.allowExternalAccountsLogin = allowExternalAccountsLogin;
            return this;
        }
        public Boolean getAllowExternalAccountsLogin() {
            return this.allowExternalAccountsLogin;
        }

    }

}

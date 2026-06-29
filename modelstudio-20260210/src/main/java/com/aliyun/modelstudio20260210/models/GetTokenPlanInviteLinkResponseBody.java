// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetTokenPlanInviteLinkResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetTokenPlanInviteLinkResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTokenPlanInviteLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPlanInviteLinkResponseBody self = new GetTokenPlanInviteLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenPlanInviteLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTokenPlanInviteLinkResponseBody setData(GetTokenPlanInviteLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTokenPlanInviteLinkResponseBodyData getData() {
        return this.data;
    }

    public GetTokenPlanInviteLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTokenPlanInviteLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTokenPlanInviteLinkResponseBodyData extends TeaModel {
        /**
         * <p>The expiration time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1778379206</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The generated token.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-ws-D.<strong><strong>.</strong></strong>***</p>
         */
        @NameInMap("Token")
        public String token;

        public static GetTokenPlanInviteLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenPlanInviteLinkResponseBodyData self = new GetTokenPlanInviteLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTokenPlanInviteLinkResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetTokenPlanInviteLinkResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}

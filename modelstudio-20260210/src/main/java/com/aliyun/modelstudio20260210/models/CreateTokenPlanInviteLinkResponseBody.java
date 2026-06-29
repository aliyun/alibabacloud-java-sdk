// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateTokenPlanInviteLinkResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business parameters.</p>
     */
    @NameInMap("Data")
    public CreateTokenPlanInviteLinkResponseBodyData data;

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
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTokenPlanInviteLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenPlanInviteLinkResponseBody self = new CreateTokenPlanInviteLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTokenPlanInviteLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTokenPlanInviteLinkResponseBody setData(CreateTokenPlanInviteLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTokenPlanInviteLinkResponseBodyData getData() {
        return this.data;
    }

    public CreateTokenPlanInviteLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTokenPlanInviteLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTokenPlanInviteLinkResponseBodyData extends TeaModel {
        /**
         * <p>The generated token.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-ws-D.<strong><strong>.</strong></strong>***</p>
         */
        @NameInMap("Token")
        public String token;

        public static CreateTokenPlanInviteLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTokenPlanInviteLinkResponseBodyData self = new CreateTokenPlanInviteLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTokenPlanInviteLinkResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}

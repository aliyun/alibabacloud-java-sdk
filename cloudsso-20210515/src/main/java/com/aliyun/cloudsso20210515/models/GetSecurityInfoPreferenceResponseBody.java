// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetSecurityInfoPreferenceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8CE8B990-193D-50CE-A604-69F3E7DCE740</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security information management preferences.</p>
     */
    @NameInMap("SecurityInfoPreference")
    public GetSecurityInfoPreferenceResponseBodySecurityInfoPreference securityInfoPreference;

    public static GetSecurityInfoPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityInfoPreferenceResponseBody self = new GetSecurityInfoPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityInfoPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityInfoPreferenceResponseBody setSecurityInfoPreference(GetSecurityInfoPreferenceResponseBodySecurityInfoPreference securityInfoPreference) {
        this.securityInfoPreference = securityInfoPreference;
        return this;
    }
    public GetSecurityInfoPreferenceResponseBodySecurityInfoPreference getSecurityInfoPreference() {
        return this.securityInfoPreference;
    }

    public static class GetSecurityInfoPreferenceResponseBodySecurityInfoPreference extends TeaModel {
        /**
         * <p>Indicates whether CloudSSO users in the directory are allowed to manage their security email addresses in the CloudSSO user portal. Valid values:</p>
         * <ul>
         * <li>true: Allowed.</li>
         * <li>false: Not allowed. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowUserManageSecurityEmail")
        public Boolean allowUserManageSecurityEmail;

        public static GetSecurityInfoPreferenceResponseBodySecurityInfoPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityInfoPreferenceResponseBodySecurityInfoPreference self = new GetSecurityInfoPreferenceResponseBodySecurityInfoPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityInfoPreferenceResponseBodySecurityInfoPreference setAllowUserManageSecurityEmail(Boolean allowUserManageSecurityEmail) {
            this.allowUserManageSecurityEmail = allowUserManageSecurityEmail;
            return this;
        }
        public Boolean getAllowUserManageSecurityEmail() {
            return this.allowUserManageSecurityEmail;
        }

    }

}

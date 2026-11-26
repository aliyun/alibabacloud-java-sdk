// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSecurityInfoPreferenceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B13E4EE-3853-5852-9165-597C32AD8FB7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security information management preferences.</p>
     */
    @NameInMap("SecurityInfoPreference")
    public SetSecurityInfoPreferenceResponseBodySecurityInfoPreference securityInfoPreference;

    public static SetSecurityInfoPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityInfoPreferenceResponseBody self = new SetSecurityInfoPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSecurityInfoPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSecurityInfoPreferenceResponseBody setSecurityInfoPreference(SetSecurityInfoPreferenceResponseBodySecurityInfoPreference securityInfoPreference) {
        this.securityInfoPreference = securityInfoPreference;
        return this;
    }
    public SetSecurityInfoPreferenceResponseBodySecurityInfoPreference getSecurityInfoPreference() {
        return this.securityInfoPreference;
    }

    public static class SetSecurityInfoPreferenceResponseBodySecurityInfoPreference extends TeaModel {
        /**
         * <p>Specifies whether CloudSSO users in the directory are allowed to manage their security email addresses in the CloudSSO user portal. Valid values:</p>
         * <ul>
         * <li>true: allowed.</li>
         * <li>false: not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowUserManageSecurityEmail")
        public Boolean allowUserManageSecurityEmail;

        public static SetSecurityInfoPreferenceResponseBodySecurityInfoPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityInfoPreferenceResponseBodySecurityInfoPreference self = new SetSecurityInfoPreferenceResponseBodySecurityInfoPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityInfoPreferenceResponseBodySecurityInfoPreference setAllowUserManageSecurityEmail(Boolean allowUserManageSecurityEmail) {
            this.allowUserManageSecurityEmail = allowUserManageSecurityEmail;
            return this;
        }
        public Boolean getAllowUserManageSecurityEmail() {
            return this.allowUserManageSecurityEmail;
        }

    }

}

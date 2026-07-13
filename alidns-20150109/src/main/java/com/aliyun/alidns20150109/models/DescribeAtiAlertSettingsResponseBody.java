// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiAlertSettingsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This field is returned only when the RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("AlertConfig")
    public DescribeAtiAlertSettingsResponseBodyAlertConfig alertConfig;

    @NameInMap("AlertGroup")
    public DescribeAtiAlertSettingsResponseBodyAlertGroup alertGroup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAtiAlertSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiAlertSettingsResponseBody self = new DescribeAtiAlertSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAtiAlertSettingsResponseBody setAccessDeniedDetail(DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeAtiAlertSettingsResponseBody setAlertConfig(DescribeAtiAlertSettingsResponseBodyAlertConfig alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public DescribeAtiAlertSettingsResponseBodyAlertConfig getAlertConfig() {
        return this.alertConfig;
    }

    public DescribeAtiAlertSettingsResponseBody setAlertGroup(DescribeAtiAlertSettingsResponseBodyAlertGroup alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public DescribeAtiAlertSettingsResponseBodyAlertGroup getAlertGroup() {
        return this.alertGroup;
    }

    public DescribeAtiAlertSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateRspDomainServerProhibitStatusForGatewayOte</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The ID of the authorization principal owner.</p>
         * 
         * <strong>example:</strong>
         * <p>10469733312XXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encrypted diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaNIARXXXXUQwNjE0LUQzN0XXXXVEQy1BQzExLTMzXXXXNTkxRjk1Ng==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The reason for the authentication failure. Valid values:</p>
         * <ul>
         * <li>ExplicitDeny: explicit deny.</li>
         * <li>ImplicitDeny: implicit deny.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail self = new DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeAtiAlertSettingsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig extends TeaModel {
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        @NameInMap("NoticeType")
        public String noticeType;

        @NameInMap("SmsNotice")
        public Boolean smsNotice;

        public static DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig self = new DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig setDingtalkNotice(Boolean dingtalkNotice) {
            this.dingtalkNotice = dingtalkNotice;
            return this;
        }
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        public DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig setEmailNotice(Boolean emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        public DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig setSmsNotice(Boolean smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

    }

    public static class DescribeAtiAlertSettingsResponseBodyAlertConfig extends TeaModel {
        @NameInMap("AlertConfig")
        public java.util.List<DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig> alertConfig;

        public static DescribeAtiAlertSettingsResponseBodyAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAlertSettingsResponseBodyAlertConfig self = new DescribeAtiAlertSettingsResponseBodyAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAlertSettingsResponseBodyAlertConfig setAlertConfig(java.util.List<DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeAtiAlertSettingsResponseBodyAlertConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

    }

    public static class DescribeAtiAlertSettingsResponseBodyAlertGroup extends TeaModel {
        @NameInMap("AlertGroup")
        public java.util.List<String> alertGroup;

        public static DescribeAtiAlertSettingsResponseBodyAlertGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAlertSettingsResponseBodyAlertGroup self = new DescribeAtiAlertSettingsResponseBodyAlertGroup();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAlertSettingsResponseBodyAlertGroup setAlertGroup(java.util.List<String> alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public java.util.List<String> getAlertGroup() {
            return this.alertGroup;
        }

    }

}

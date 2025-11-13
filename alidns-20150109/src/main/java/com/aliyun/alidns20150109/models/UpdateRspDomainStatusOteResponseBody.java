// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainStatusOteResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Data")
    public UpdateRspDomainStatusOteResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecoverableError")
    public Boolean recoverableError;

    /**
     * <strong>example:</strong>
     * <p>0629502C-XXXX-5DC9-A8ED-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateRspDomainStatusOteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainStatusOteResponseBody self = new UpdateRspDomainStatusOteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainStatusOteResponseBody setAccessDeniedDetail(UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateRspDomainStatusOteResponseBody setData(UpdateRspDomainStatusOteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRspDomainStatusOteResponseBodyData getData() {
        return this.data;
    }

    public UpdateRspDomainStatusOteResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public UpdateRspDomainStatusOteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRspDomainStatusOteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CreateUser</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>10469733312XXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <p>AQFohtp4aIbaeEXXXXQxNjFDLUIzMzgtNTXXXX05NkFCLUI2RkY5XXXXzAzQQ==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail self = new UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public UpdateRspDomainStatusOteResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class UpdateRspDomainStatusOteResponseBodyDataStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>uptp.test.abchina.com.cn</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>serverUpdateProhibited</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMsg")
        public String statusMsg;

        public static UpdateRspDomainStatusOteResponseBodyDataStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainStatusOteResponseBodyDataStatusList self = new UpdateRspDomainStatusOteResponseBodyDataStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainStatusOteResponseBodyDataStatusList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateRspDomainStatusOteResponseBodyDataStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainStatusOteResponseBodyDataStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

    public static class UpdateRspDomainStatusOteResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("StatusList")
        public java.util.List<UpdateRspDomainStatusOteResponseBodyDataStatusList> statusList;

        public static UpdateRspDomainStatusOteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainStatusOteResponseBodyData self = new UpdateRspDomainStatusOteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainStatusOteResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateRspDomainStatusOteResponseBodyData setStatusList(java.util.List<UpdateRspDomainStatusOteResponseBodyDataStatusList> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<UpdateRspDomainStatusOteResponseBodyDataStatusList> getStatusList() {
            return this.statusList;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Data")
    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecoverableError")
    public Boolean recoverableError;

    /**
     * <strong>example:</strong>
     * <p>0629502C-6224-5DC9-A8ED-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody self = new UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody setAccessDeniedDetail(UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody setData(UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData getData() {
        return this.data;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail self = new UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList extends TeaModel {
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

        public static UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList self = new UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("StatusList")
        public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList> statusList;

        public static UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData self = new UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyData setStatusList(java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteResponseBodyDataStatusList> getStatusList() {
            return this.statusList;
        }

    }

}

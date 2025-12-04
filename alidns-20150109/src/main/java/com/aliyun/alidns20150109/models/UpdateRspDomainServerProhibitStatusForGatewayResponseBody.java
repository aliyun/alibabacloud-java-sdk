// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainServerProhibitStatusForGatewayResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Data")
    public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData data;

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

    public static UpdateRspDomainServerProhibitStatusForGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainServerProhibitStatusForGatewayResponseBody self = new UpdateRspDomainServerProhibitStatusForGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainServerProhibitStatusForGatewayResponseBody setAccessDeniedDetail(UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayResponseBody setData(UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData getData() {
        return this.data;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail self = new UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList extends TeaModel {
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

        public static UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList self = new UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("StatusList")
        public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList> statusList;

        public static UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData self = new UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayResponseBodyData setStatusList(java.util.List<UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayResponseBodyDataStatusList> getStatusList() {
            return this.statusList;
        }

    }

}

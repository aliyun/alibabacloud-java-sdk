// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRspDomainServerHoldStatusForGatewayResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This field is returned only when Resource Access Management (RAM) verification fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned data list.</p>
     */
    @NameInMap("Data")
    public AddRspDomainServerHoldStatusForGatewayResponseBodyData data;

    /**
     * <p>Indicates whether you can retry the request if it fails. A value of <code>true</code> indicates that you can retry. A value of <code>false</code> indicates that you cannot.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecoverableError")
    public Boolean recoverableError;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0629502C-XXXX-5DC9-XXXX-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of <code>true</code> indicates success. A value of <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddRspDomainServerHoldStatusForGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRspDomainServerHoldStatusForGatewayResponseBody self = new AddRspDomainServerHoldStatusForGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setAccessDeniedDetail(AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setData(AddRspDomainServerHoldStatusForGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddRspDomainServerHoldStatusForGatewayResponseBodyData getData() {
        return this.data;
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>AddRspDomainServerHoldStatusForGateway</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorized entity.</p>
         * 
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The ID of the owner of the authorized entity.</p>
         * 
         * <strong>example:</strong>
         * <p>1046973331XXXX</p>
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
         * <p>The complete diagnostic information after encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaNIARXXXXUQwNjE0LUQzN0XXXXVEQy1BQzExLTMzXXXXNTkxRjk1Ng==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The reason why the authorization failed. Valid values:</p>
         * <ul>
         * <li><p>ExplicitDeny: The access is explicitly denied.</p>
         * </li>
         * <li><p>ImplicitDeny: The access is implicitly denied.</p>
         * </li>
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

        public static AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail self = new AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class AddRspDomainServerHoldStatusForGatewayResponseBodyData extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static AddRspDomainServerHoldStatusForGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddRspDomainServerHoldStatusForGatewayResponseBodyData self = new AddRspDomainServerHoldStatusForGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}

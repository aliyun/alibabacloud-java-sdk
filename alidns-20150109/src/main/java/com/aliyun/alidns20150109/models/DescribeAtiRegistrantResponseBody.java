// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiRegistrantResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial. This field is returned only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeAtiRegistrantResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The country.</p>
     * 
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("Cc")
    public String cc;

    /**
     * <p>The city. Default value: Hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The creation time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1533773400000</p>
     */
    @NameInMap("CreateTimestamp")
    public String createTimestamp;

    /**
     * <p>The document number of the registrant. The number can be up to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>110123456789122341</p>
     */
    @NameInMap("DocumentCode")
    public String documentCode;

    /**
     * <p>The document type of the registrant. For more information, see the appendix on document types.</p>
     * 
     * <strong>example:</strong>
     * <p>SFZ</p>
     */
    @NameInMap("DocumentType")
    public String documentType;

    /**
     * <p>The email address. The address can be up to 300 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The name of the registrant. The name can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>张xx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The phone number of the registrant. The number can be up to 128 characters in length. If the country is China and the number is not a mobile phone number, the area code must match the city.</p>
     * 
     * <strong>example:</strong>
     * <p>13112345678</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The ID of the real-name verified registrant.</p>
     * 
     * <strong>example:</strong>
     * <p>2072277378616354816</p>
     */
    @NameInMap("RegistrantId")
    public String registrantId;

    /**
     * <p>The reason why the real-name verification was rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>以实际返回为准</p>
     */
    @NameInMap("RejectReason")
    public String rejectReason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the public recursive service.</p>
     * 
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The real-name verification status. Valid values:</p>
     * <ul>
     * <li>Approved.</li>
     * <li>Under review.</li>
     * <li>Rejected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The street address.</p>
     * 
     * <strong>example:</strong>
     * <p>xx区xx街道</p>
     */
    @NameInMap("Street")
    public String street;

    /**
     * <p>The update time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UpdateTimestamp")
    public String updateTimestamp;

    public static DescribeAtiRegistrantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiRegistrantResponseBody self = new DescribeAtiRegistrantResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAtiRegistrantResponseBody setAccessDeniedDetail(DescribeAtiRegistrantResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeAtiRegistrantResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeAtiRegistrantResponseBody setCc(String cc) {
        this.cc = cc;
        return this;
    }
    public String getCc() {
        return this.cc;
    }

    public DescribeAtiRegistrantResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeAtiRegistrantResponseBody setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public String getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeAtiRegistrantResponseBody setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
        return this;
    }
    public String getDocumentCode() {
        return this.documentCode;
    }

    public DescribeAtiRegistrantResponseBody setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public DescribeAtiRegistrantResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public DescribeAtiRegistrantResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAtiRegistrantResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public DescribeAtiRegistrantResponseBody setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
        return this;
    }
    public String getRegistrantId() {
        return this.registrantId;
    }

    public DescribeAtiRegistrantResponseBody setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }
    public String getRejectReason() {
        return this.rejectReason;
    }

    public DescribeAtiRegistrantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAtiRegistrantResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeAtiRegistrantResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAtiRegistrantResponseBody setStreet(String street) {
        this.street = street;
        return this;
    }
    public String getStreet() {
        return this.street;
    }

    public DescribeAtiRegistrantResponseBody setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public String getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeAtiRegistrantResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>RemoveRspDomainServerHoldStatusForGatewayOte</p>
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
         * <p>The owner ID of the authorization principal.</p>
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

        public static DescribeAtiRegistrantResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiRegistrantResponseBodyAccessDeniedDetail self = new DescribeAtiRegistrantResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAtiRegistrantResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeAtiRegistrantResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeAtiRegistrantResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeAtiRegistrantResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeAtiRegistrantResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeAtiRegistrantResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeAtiRegistrantResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}

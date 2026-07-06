// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateServiceCredentialResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81313F5E-3C85-478F-BCC9-E1B70E4556DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service credential information.</p>
     */
    @NameInMap("ServiceCredential")
    public CreateServiceCredentialResponseBodyServiceCredential serviceCredential;

    public static CreateServiceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceCredentialResponseBody self = new CreateServiceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceCredentialResponseBody setServiceCredential(CreateServiceCredentialResponseBodyServiceCredential serviceCredential) {
        this.serviceCredential = serviceCredential;
        return this;
    }
    public CreateServiceCredentialResponseBodyServiceCredential getServiceCredential() {
        return this.serviceCredential;
    }

    public static class CreateServiceCredentialResponseBodyServiceCredential extends TeaModel {
        /**
         * <p>The time when the service credential was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T10:05:24Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time of the service credential.
         * This field is not returned for permanently valid service credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-01T10:05:24Z</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>The service credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>SC*************</p>
         */
        @NameInMap("ServiceCredentialId")
        public String serviceCredentialId;

        /**
         * <p>The service credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>yourServiceCredentialName</p>
         */
        @NameInMap("ServiceCredentialName")
        public String serviceCredentialName;

        /**
         * <p>The secret of the service credential.</p>
         * 
         * <strong>example:</strong>
         * <p>yourServiceCredentialSecret</p>
         */
        @NameInMap("ServiceCredentialSecret")
        public String serviceCredentialSecret;

        /**
         * <p>The Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.aliyuncs.com</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The status of the service credential.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The logon name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static CreateServiceCredentialResponseBodyServiceCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceCredentialResponseBodyServiceCredential self = new CreateServiceCredentialResponseBodyServiceCredential();
            return TeaModel.build(map, self);
        }

        public CreateServiceCredentialResponseBodyServiceCredential setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateServiceCredentialResponseBodyServiceCredential setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public CreateServiceCredentialResponseBodyServiceCredential setServiceCredentialId(String serviceCredentialId) {
            this.serviceCredentialId = serviceCredentialId;
            return this;
        }
        public String getServiceCredentialId() {
            return this.serviceCredentialId;
        }

        public CreateServiceCredentialResponseBodyServiceCredential setServiceCredentialName(String serviceCredentialName) {
            this.serviceCredentialName = serviceCredentialName;
            return this;
        }
        public String getServiceCredentialName() {
            return this.serviceCredentialName;
        }

        public CreateServiceCredentialResponseBodyServiceCredential setServiceCredentialSecret(String serviceCredentialSecret) {
            this.serviceCredentialSecret = serviceCredentialSecret;
            return this;
        }
        public String getServiceCredentialSecret() {
            return this.serviceCredentialSecret;
        }

        public CreateServiceCredentialResponseBodyServiceCredential setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public CreateServiceCredentialResponseBodyServiceCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateServiceCredentialResponseBodyServiceCredential setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}

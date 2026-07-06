// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetServiceCredentialResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66815255-7CCE-4759-AC37-9755794C3626</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service credential information.</p>
     */
    @NameInMap("ServiceCredential")
    public GetServiceCredentialResponseBodyServiceCredential serviceCredential;

    public static GetServiceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceCredentialResponseBody self = new GetServiceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceCredentialResponseBody setServiceCredential(GetServiceCredentialResponseBodyServiceCredential serviceCredential) {
        this.serviceCredential = serviceCredential;
        return this;
    }
    public GetServiceCredentialResponseBodyServiceCredential getServiceCredential() {
        return this.serviceCredential;
    }

    public static class GetServiceCredentialResponseBodyServiceCredential extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-15T09:20:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time. This field is not returned for permanent service credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-15T09:20:58Z</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>The service credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>SC***************</p>
         */
        @NameInMap("ServiceCredentialId")
        public String serviceCredentialId;

        /**
         * <p>The service credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ServiceCredentialName")
        public String serviceCredentialName;

        /**
         * <p>The Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.aliyuncs.com</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The service credential status.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The logon name of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static GetServiceCredentialResponseBodyServiceCredential build(java.util.Map<String, ?> map) throws Exception {
            GetServiceCredentialResponseBodyServiceCredential self = new GetServiceCredentialResponseBodyServiceCredential();
            return TeaModel.build(map, self);
        }

        public GetServiceCredentialResponseBodyServiceCredential setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetServiceCredentialResponseBodyServiceCredential setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public GetServiceCredentialResponseBodyServiceCredential setServiceCredentialId(String serviceCredentialId) {
            this.serviceCredentialId = serviceCredentialId;
            return this;
        }
        public String getServiceCredentialId() {
            return this.serviceCredentialId;
        }

        public GetServiceCredentialResponseBodyServiceCredential setServiceCredentialName(String serviceCredentialName) {
            this.serviceCredentialName = serviceCredentialName;
            return this;
        }
        public String getServiceCredentialName() {
            return this.serviceCredentialName;
        }

        public GetServiceCredentialResponseBodyServiceCredential setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceCredentialResponseBodyServiceCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceCredentialResponseBodyServiceCredential setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}

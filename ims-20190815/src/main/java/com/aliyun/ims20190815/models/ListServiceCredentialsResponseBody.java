// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListServiceCredentialsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether there is a next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE*******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D80A0F97-6F12-5CD1-A70A-77A03BF4CFC5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of service credentials.</p>
     */
    @NameInMap("ServiceCredentials")
    public java.util.List<ListServiceCredentialsResponseBodyServiceCredentials> serviceCredentials;

    public static ListServiceCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceCredentialsResponseBody self = new ListServiceCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceCredentialsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListServiceCredentialsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceCredentialsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceCredentialsResponseBody setServiceCredentials(java.util.List<ListServiceCredentialsResponseBodyServiceCredentials> serviceCredentials) {
        this.serviceCredentials = serviceCredentials;
        return this;
    }
    public java.util.List<ListServiceCredentialsResponseBodyServiceCredentials> getServiceCredentials() {
        return this.serviceCredentials;
    }

    public static class ListServiceCredentialsResponseBodyServiceCredentials extends TeaModel {
        /**
         * <p>The time when the service credential was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T05:49:57Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time. This field is not returned for permanent service credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-07T05:49:57Z</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>The ID of the service credential.</p>
         * 
         * <strong>example:</strong>
         * <p>SC*************</p>
         */
        @NameInMap("ServiceCredentialId")
        public String serviceCredentialId;

        /**
         * <p>The name of the service credential.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ServiceCredentialName")
        public String serviceCredentialName;

        /**
         * <p>The service name of the Alibaba Cloud service.</p>
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
         * <p>The logon name of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static ListServiceCredentialsResponseBodyServiceCredentials build(java.util.Map<String, ?> map) throws Exception {
            ListServiceCredentialsResponseBodyServiceCredentials self = new ListServiceCredentialsResponseBodyServiceCredentials();
            return TeaModel.build(map, self);
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setServiceCredentialId(String serviceCredentialId) {
            this.serviceCredentialId = serviceCredentialId;
            return this;
        }
        public String getServiceCredentialId() {
            return this.serviceCredentialId;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setServiceCredentialName(String serviceCredentialName) {
            this.serviceCredentialName = serviceCredentialName;
            return this;
        }
        public String getServiceCredentialName() {
            return this.serviceCredentialName;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}

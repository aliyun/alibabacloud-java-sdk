// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersForNetworkAccessEndpointResponseBody extends TeaModel {
    @NameInMap("IdentityProvidersForNetworkAccessEndpoint")
    public java.util.List<ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIdentityProvidersForNetworkAccessEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProvidersForNetworkAccessEndpointResponseBody self = new ListIdentityProvidersForNetworkAccessEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityProvidersForNetworkAccessEndpointResponseBody setIdentityProvidersForNetworkAccessEndpoint(java.util.List<ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint) {
        this.identityProvidersForNetworkAccessEndpoint = identityProvidersForNetworkAccessEndpoint;
        return this;
    }
    public java.util.List<ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint> getIdentityProvidersForNetworkAccessEndpoint() {
        return this.identityProvidersForNetworkAccessEndpoint;
    }

    public ListIdentityProvidersForNetworkAccessEndpointResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIdentityProvidersForNetworkAccessEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentityProvidersForNetworkAccessEndpointResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint extends TeaModel {
        /**
         * <p>IdP的ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idp_nbq7i4ylodmm64iy6t5muxxxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>IdP名称。</p>
         * 
         * <strong>example:</strong>
         * <p>OIDC Provider</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <p>IDaaS EIAM 实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_elk5evwagodqlmwpfehasxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint self = new ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        public ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersForNetworkAccessEndpointResponseBody extends TeaModel {
    /**
     * <p>The collection of IdPs for the network endpoint.</p>
     */
    @NameInMap("IdentityProvidersForNetworkAccessEndpoint")
    public java.util.List<ListIdentityProvidersForNetworkAccessEndpointResponseBodyIdentityProvidersForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint;

    /**
     * <p>The token that is returned from the call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The ID of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_nbq7i4ylodmm64iy6t5muxxxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>The name of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>OIDC Provider</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <p>The instance ID.</p>
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

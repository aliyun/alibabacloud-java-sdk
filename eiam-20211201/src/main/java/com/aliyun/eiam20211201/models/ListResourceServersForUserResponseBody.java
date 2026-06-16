// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListResourceServersForUserResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results.</p>
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
     * <p>The list of ResourceServer applications.</p>
     */
    @NameInMap("ResourceServers")
    public java.util.List<ListResourceServersForUserResponseBodyResourceServers> resourceServers;

    /**
     * <p>The total number of entries in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListResourceServersForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServersForUserResponseBody self = new ListResourceServersForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceServersForUserResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceServersForUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceServersForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceServersForUserResponseBody setResourceServers(java.util.List<ListResourceServersForUserResponseBodyResourceServers> resourceServers) {
        this.resourceServers = resourceServers;
        return this;
    }
    public java.util.List<ListResourceServersForUserResponseBodyResourceServers> getResourceServers() {
        return this.resourceServers;
    }

    public ListResourceServersForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceServersForUserResponseBodyResourceServersResourceServerScopes extends TeaModel {
        /**
         * <p>Indicates whether a direct authorization exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDirectAuthorization")
        public Boolean hasDirectAuthorization;

        /**
         * <p>Indicates whether an inherited permission exists.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasInheritAuthorization")
        public Boolean hasInheritAuthorization;

        /**
         * <p>The ID of the Scope permission.</p>
         * 
         * <strong>example:</strong>
         * <p>ress_nbte4bb3qqqnaq73rlmkqixxxx</p>
         */
        @NameInMap("ResourceServerScopeId")
        public String resourceServerScopeId;

        /**
         * <p>The name of the Scope permission.</p>
         * 
         * <strong>example:</strong>
         * <p>Read All User</p>
         */
        @NameInMap("ResourceServerScopeName")
        public String resourceServerScopeName;

        public static ListResourceServersForUserResponseBodyResourceServersResourceServerScopes build(java.util.Map<String, ?> map) throws Exception {
            ListResourceServersForUserResponseBodyResourceServersResourceServerScopes self = new ListResourceServersForUserResponseBodyResourceServersResourceServerScopes();
            return TeaModel.build(map, self);
        }

        public ListResourceServersForUserResponseBodyResourceServersResourceServerScopes setHasDirectAuthorization(Boolean hasDirectAuthorization) {
            this.hasDirectAuthorization = hasDirectAuthorization;
            return this;
        }
        public Boolean getHasDirectAuthorization() {
            return this.hasDirectAuthorization;
        }

        public ListResourceServersForUserResponseBodyResourceServersResourceServerScopes setHasInheritAuthorization(Boolean hasInheritAuthorization) {
            this.hasInheritAuthorization = hasInheritAuthorization;
            return this;
        }
        public Boolean getHasInheritAuthorization() {
            return this.hasInheritAuthorization;
        }

        public ListResourceServersForUserResponseBodyResourceServersResourceServerScopes setResourceServerScopeId(String resourceServerScopeId) {
            this.resourceServerScopeId = resourceServerScopeId;
            return this;
        }
        public String getResourceServerScopeId() {
            return this.resourceServerScopeId;
        }

        public ListResourceServersForUserResponseBodyResourceServersResourceServerScopes setResourceServerScopeName(String resourceServerScopeName) {
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }
        public String getResourceServerScopeName() {
            return this.resourceServerScopeName;
        }

    }

    public static class ListResourceServersForUserResponseBodyResourceServers extends TeaModel {
        /**
         * <p>The ID of the ResourceServer application.</p>
         * 
         * <strong>example:</strong>
         * <p>app_nbsomva32b6utec3hgi7scxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_qsw77zl5vrllwzyrrfwbmpxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The unique identifier of the ResourceServer.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:idaas:test</p>
         */
        @NameInMap("ResourceServerIdentifier")
        public String resourceServerIdentifier;

        /**
         * <p>The list of granted Scope permissions.</p>
         */
        @NameInMap("ResourceServerScopes")
        public java.util.List<ListResourceServersForUserResponseBodyResourceServersResourceServerScopes> resourceServerScopes;

        public static ListResourceServersForUserResponseBodyResourceServers build(java.util.Map<String, ?> map) throws Exception {
            ListResourceServersForUserResponseBodyResourceServers self = new ListResourceServersForUserResponseBodyResourceServers();
            return TeaModel.build(map, self);
        }

        public ListResourceServersForUserResponseBodyResourceServers setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListResourceServersForUserResponseBodyResourceServers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListResourceServersForUserResponseBodyResourceServers setResourceServerIdentifier(String resourceServerIdentifier) {
            this.resourceServerIdentifier = resourceServerIdentifier;
            return this;
        }
        public String getResourceServerIdentifier() {
            return this.resourceServerIdentifier;
        }

        public ListResourceServersForUserResponseBodyResourceServers setResourceServerScopes(java.util.List<ListResourceServersForUserResponseBodyResourceServersResourceServerScopes> resourceServerScopes) {
            this.resourceServerScopes = resourceServerScopes;
            return this;
        }
        public java.util.List<ListResourceServersForUserResponseBodyResourceServersResourceServerScopes> getResourceServerScopes() {
            return this.resourceServerScopes;
        }

    }

}

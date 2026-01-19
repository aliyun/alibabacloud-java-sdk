// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForResourceServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrganizationalUnits")
    public java.util.List<ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits> organizationalUnits;

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

    public static ListOrganizationalUnitsForResourceServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsForResourceServerResponseBody self = new ListOrganizationalUnitsForResourceServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsForResourceServerResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOrganizationalUnitsForResourceServerResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOrganizationalUnitsForResourceServerResponseBody setOrganizationalUnits(java.util.List<ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }
    public java.util.List<ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    public ListOrganizationalUnitsForResourceServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationalUnitsForResourceServerResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes extends TeaModel {
        /**
         * <p>ResourceServerScope唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>ress_nbte4bb3qqqnaq73rlmkqixxxx</p>
         */
        @NameInMap("ResourceServerScopeId")
        public String resourceServerScopeId;

        /**
         * <p>ResourceServerScope名称</p>
         * 
         * <strong>example:</strong>
         * <p>获取资源信息</p>
         */
        @NameInMap("ResourceServerScopeName")
        public String resourceServerScopeName;

        public static ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes self = new ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes setResourceServerScopeId(String resourceServerScopeId) {
            this.resourceServerScopeId = resourceServerScopeId;
            return this;
        }
        public String getResourceServerScopeId() {
            return this.resourceServerScopeId;
        }

        public ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes setResourceServerScopeName(String resourceServerScopeName) {
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }
        public String getResourceServerScopeName() {
            return this.resourceServerScopeName;
        }

    }

    public static class ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits extends TeaModel {
        /**
         * <p>实例唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_qsw77zl5vrllwzyrrfwbmpxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>组织的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>ou_nbsomva32b6utec3hgi7scxxxx</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>资源服务Scope权限集合</p>
         */
        @NameInMap("ResourceServerScopes")
        public java.util.List<ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes> resourceServerScopes;

        public static ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits self = new ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnits setResourceServerScopes(java.util.List<ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes> resourceServerScopes) {
            this.resourceServerScopes = resourceServerScopes;
            return this;
        }
        public java.util.List<ListOrganizationalUnitsForResourceServerResponseBodyOrganizationalUnitsResourceServerScopes> getResourceServerScopes() {
            return this.resourceServerScopes;
        }

    }

}

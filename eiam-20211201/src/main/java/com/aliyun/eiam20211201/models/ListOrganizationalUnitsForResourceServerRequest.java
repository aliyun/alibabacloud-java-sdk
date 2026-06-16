// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForResourceServerRequest extends TeaModel {
    /**
     * <p>The resource server application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The list of filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListOrganizationalUnitsForResourceServerRequestFilter> filter;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. To retrieve the next page of results, set this parameter to the NextToken value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource server scope.</p>
     * 
     * <strong>example:</strong>
     * <p>ress_nbte4bb3qqqnaq73rlmkqixxxx</p>
     */
    @NameInMap("ResourceServerScopeId")
    public String resourceServerScopeId;

    public static ListOrganizationalUnitsForResourceServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsForResourceServerRequest self = new ListOrganizationalUnitsForResourceServerRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsForResourceServerRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListOrganizationalUnitsForResourceServerRequest setFilter(java.util.List<ListOrganizationalUnitsForResourceServerRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListOrganizationalUnitsForResourceServerRequestFilter> getFilter() {
        return this.filter;
    }

    public ListOrganizationalUnitsForResourceServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOrganizationalUnitsForResourceServerRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOrganizationalUnitsForResourceServerRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOrganizationalUnitsForResourceServerRequest setResourceServerScopeId(String resourceServerScopeId) {
        this.resourceServerScopeId = resourceServerScopeId;
        return this;
    }
    public String getResourceServerScopeId() {
        return this.resourceServerScopeId;
    }

    public static class ListOrganizationalUnitsForResourceServerRequestFilter extends TeaModel {
        /**
         * <p>The filter key.</p>
         * 
         * <strong>example:</strong>
         * <p>OrganizationalUnitIds</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of filter values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListOrganizationalUnitsForResourceServerRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsForResourceServerRequestFilter self = new ListOrganizationalUnitsForResourceServerRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsForResourceServerRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOrganizationalUnitsForResourceServerRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}

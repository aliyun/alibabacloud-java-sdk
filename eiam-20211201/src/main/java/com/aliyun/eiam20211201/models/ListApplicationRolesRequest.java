// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationRolesRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListApplicationRolesRequestFilter> filter;

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
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query. Set this parameter to the value of NextToken that is returned in the last API call. Leave this parameter empty for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListApplicationRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRolesRequest self = new ListApplicationRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationRolesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListApplicationRolesRequest setFilter(java.util.List<ListApplicationRolesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListApplicationRolesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListApplicationRolesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationRolesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationRolesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListApplicationRolesRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>ApplicationRoleNameStartsWith</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListApplicationRolesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationRolesRequestFilter self = new ListApplicationRolesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListApplicationRolesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationRolesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountRolesRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListCloudAccountRolesRequestFilter> filter;

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
     * <p>The maximum number of records to return on each page.</p>
     * <ul>
     * <li><p>The default value is 20.</p>
     * </li>
     * <li><p>The maximum value is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the start of the next page of results.</p>
     * <ul>
     * <li>If this parameter is not specified, the query starts from the first page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListCloudAccountRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountRolesRequest self = new ListCloudAccountRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountRolesRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public ListCloudAccountRolesRequest setFilter(java.util.List<ListCloudAccountRolesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListCloudAccountRolesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListCloudAccountRolesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCloudAccountRolesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCloudAccountRolesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListCloudAccountRolesRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter field. Valid values:</p>
         * <ul>
         * <li><p>CloudAccountRoleId: The ID of the cloud role.</p>
         * </li>
         * <li><p>CloudAccountRoleName: The name of the cloud role.</p>
         * </li>
         * <li><p>CloudAccountRoleExternalId: The external ID of the cloud role.</p>
         * </li>
         * <li><p>CloudAccountRoleUsageType: The usage type of the cloud role.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudAccountRoleId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of values for the filter field.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListCloudAccountRolesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountRolesRequestFilter self = new ListCloudAccountRolesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountRolesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCloudAccountRolesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}

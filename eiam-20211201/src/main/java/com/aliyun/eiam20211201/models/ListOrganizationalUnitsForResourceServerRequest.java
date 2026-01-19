// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForResourceServerRequest extends TeaModel {
    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Filter")
    public java.util.List<ListOrganizationalUnitsForResourceServerRequestFilter> filter;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

    public static class ListOrganizationalUnitsForResourceServerRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OrganizationalUnitIds</p>
         */
        @NameInMap("Name")
        public String name;

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

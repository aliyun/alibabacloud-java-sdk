// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceSharedAccountsRequest extends TeaModel {
    /**
     * <p>The filters.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServiceSharedAccountsRequestFilter> filter;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAR130adlM4fHHVSWpTca/t4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The permissions on the service. Valid values:</p>
     * <ul>
     * <li>Deployable: Permissions to deploy the service.</li>
     * <li>Accessible: Permissions to access the service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Accessible</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>The region ID where the service instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>service-e10349089de34exxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static ListServiceSharedAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSharedAccountsRequest self = new ListServiceSharedAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceSharedAccountsRequest setFilter(java.util.List<ListServiceSharedAccountsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServiceSharedAccountsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServiceSharedAccountsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceSharedAccountsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceSharedAccountsRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public ListServiceSharedAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceSharedAccountsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public static class ListServiceSharedAccountsRequestFilter extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more parameter names to query services. Valid values:</p>
         * <ul>
         * <li>Name: the name of the service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserAliUid</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value N of the filter. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServiceSharedAccountsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServiceSharedAccountsRequestFilter self = new ListServiceSharedAccountsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServiceSharedAccountsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceSharedAccountsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceRegistrationsRequest extends TeaModel {
    /**
     * <p>Filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServiceRegistrationsRequestFilter> filter;

    /**
     * <p>The number of items to return per page during a paginated query. The maximum is 100, and the default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListServiceRegistrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRegistrationsRequest self = new ListServiceRegistrationsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceRegistrationsRequest setFilter(java.util.List<ListServiceRegistrationsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServiceRegistrationsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServiceRegistrationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceRegistrationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceRegistrationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ListServiceRegistrationsRequestFilter extends TeaModel {
        /**
         * <p>Name of the filter field. Allowed values:</p>
         * <ul>
         * <li><p>ServiceId: Service ID.</p>
         * </li>
         * <li><p>RegistrationId: Registration ID.</p>
         * </li>
         * <li><p>Status: Registration status. Allowed values: Submitted, Approved, Rejected, Canceled, and Executed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Canceled</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>List of filter values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServiceRegistrationsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServiceRegistrationsRequestFilter self = new ListServiceRegistrationsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServiceRegistrationsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceRegistrationsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}

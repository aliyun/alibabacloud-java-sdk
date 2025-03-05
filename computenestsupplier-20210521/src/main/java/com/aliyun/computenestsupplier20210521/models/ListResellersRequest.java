// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListResellersRequest extends TeaModel {
    /**
     * <p>The filters.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListResellersRequestFilter> filter;

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
     * <p>AAAAAWVmrOoWHbw/80lX0TWxe/s=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListResellersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResellersRequest self = new ListResellersRequest();
        return TeaModel.build(map, self);
    }

    public ListResellersRequest setFilter(java.util.List<ListResellersRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListResellersRequestFilter> getFilter() {
        return this.filter;
    }

    public ListResellersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResellersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResellersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ListResellersRequestFilter extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more parameter names to query services. Valid values:</p>
         * <ul>
         * <li>ResellerUid: the uid of the distributor.</li>
         * <li>Name: the name of the distributor.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Filter value array.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListResellersRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListResellersRequestFilter self = new ListResellersRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListResellersRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResellersRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}

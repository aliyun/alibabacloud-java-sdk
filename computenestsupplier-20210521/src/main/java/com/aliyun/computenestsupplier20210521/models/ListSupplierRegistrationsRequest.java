// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListSupplierRegistrationsRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListSupplierRegistrationsRequestFilter> filter;

    /**
     * <p>Number of items per page in a paginated query. The maximum is 100, and the default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAYChudnQUoBH+mGWFpb6oP0=</p>
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

    public static ListSupplierRegistrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSupplierRegistrationsRequest self = new ListSupplierRegistrationsRequest();
        return TeaModel.build(map, self);
    }

    public ListSupplierRegistrationsRequest setFilter(java.util.List<ListSupplierRegistrationsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListSupplierRegistrationsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListSupplierRegistrationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupplierRegistrationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupplierRegistrationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ListSupplierRegistrationsRequestFilter extends TeaModel {
        /**
         * <p>Name of the filter field. Allowed values:</p>
         * <ul>
         * <li><p>SupplierUid: The aliUid of supplier.</p>
         * </li>
         * <li><p>SupplierName: The name of supplier.</p>
         * </li>
         * <li><p>RegistrationId: Registration ID.</p>
         * </li>
         * <li><p>Status: Registration status. Allowed values: Submitted, Approved, Rejected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SupplierUid</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Filter value.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListSupplierRegistrationsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListSupplierRegistrationsRequestFilter self = new ListSupplierRegistrationsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListSupplierRegistrationsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSupplierRegistrationsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}

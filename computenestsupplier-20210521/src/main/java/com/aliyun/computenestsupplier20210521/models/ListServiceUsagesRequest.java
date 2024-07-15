// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceUsagesRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServiceUsagesRequestFilter> filter;

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
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The role of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Supplier</p>
     */
    @NameInMap("SupplierRole")
    public String supplierRole;

    public static ListServiceUsagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceUsagesRequest self = new ListServiceUsagesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceUsagesRequest setFilter(java.util.List<ListServiceUsagesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServiceUsagesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServiceUsagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceUsagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceUsagesRequest setSupplierRole(String supplierRole) {
        this.supplierRole = supplierRole;
        return this;
    }
    public String getSupplierRole() {
        return this.supplierRole;
    }

    public static class ListServiceUsagesRequestFilter extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more filters. Valid values:</p>
         * <ul>
         * <li>ServiceId: the ID of the service.</li>
         * <li>ServiceName: the service name.</li>
         * <li>Status: the state of the service.</li>
         * <li>SupplierName: the name of the service provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value N of the filter. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServiceUsagesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServiceUsagesRequestFilter self = new ListServiceUsagesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServiceUsagesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceUsagesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}

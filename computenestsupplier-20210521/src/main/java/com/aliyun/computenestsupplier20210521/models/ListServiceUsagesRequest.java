// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceUsagesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListServiceUsagesRequestFilter> filter;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
         * <strong>example:</strong>
         * <p>ServiceId</p>
         */
        @NameInMap("Name")
        public String name;

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

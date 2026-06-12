// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceUsagesRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServiceUsagesRequestFilter> filter;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. This value is the NextToken value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    public ListServiceUsagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ListServiceUsagesRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter. You can query by one or more names. Valid values:</p>
         * <ul>
         * <li><p>ServiceId: The service ID.</p>
         * </li>
         * <li><p>ServiceName: The service name.</p>
         * </li>
         * <li><p>Status: The service status.</p>
         * </li>
         * <li><p>SupplierName: The name of the supplier.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of filter values.</p>
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

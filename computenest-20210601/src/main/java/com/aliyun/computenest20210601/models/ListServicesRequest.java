// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServicesRequestFilter> filter;

    /**
     * <p>The keyword for a fuzzy query.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("FuzzyKeyword")
    public String fuzzyKeyword;

    /**
     * <p>Specifies whether the service is in use. Valid values:</p>
     * <ul>
     * <li><p>false: The service is not in use.</p>
     * </li>
     * <li><p>true: The service is in use.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InUsed")
    public Boolean inUsed;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Set this to the NextToken value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting type for services.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateTime</p>
     */
    @NameInMap("OrderByType")
    public String orderByType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service access type.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ServiceAccessType")
    public String serviceAccessType;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListServicesRequestTag> tag;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setFilter(java.util.List<ListServicesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServicesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServicesRequest setFuzzyKeyword(String fuzzyKeyword) {
        this.fuzzyKeyword = fuzzyKeyword;
        return this;
    }
    public String getFuzzyKeyword() {
        return this.fuzzyKeyword;
    }

    public ListServicesRequest setInUsed(Boolean inUsed) {
        this.inUsed = inUsed;
        return this;
    }
    public Boolean getInUsed() {
        return this.inUsed;
    }

    public ListServicesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesRequest setOrderByType(String orderByType) {
        this.orderByType = orderByType;
        return this;
    }
    public String getOrderByType() {
        return this.orderByType;
    }

    public ListServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServicesRequest setServiceAccessType(String serviceAccessType) {
        this.serviceAccessType = serviceAccessType;
        return this;
    }
    public String getServiceAccessType() {
        return this.serviceAccessType;
    }

    public ListServicesRequest setTag(java.util.List<ListServicesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServicesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServicesRequestFilter extends TeaModel {
        /**
         * <p>The filter name. You can specify one or more filter names to query services. Valid values:</p>
         * <ul>
         * <li><p>ServiceId: The service ID.</p>
         * </li>
         * <li><p>Name: The service name.</p>
         * </li>
         * <li><p>Status: The service status.</p>
         * </li>
         * <li><p>SupplierName: The service provider name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Status</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The filter values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServicesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServicesRequestFilter self = new ListServicesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServicesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServicesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListServicesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListServicesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServicesRequestTag self = new ListServicesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServicesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServicesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

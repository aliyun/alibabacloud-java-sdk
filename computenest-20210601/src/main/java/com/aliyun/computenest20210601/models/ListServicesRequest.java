// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListServicesRequestFilter> filter;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("FuzzyKeyword")
    public String fuzzyKeyword;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InUsed")
    public Boolean inUsed;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderByType")
    public String orderByType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceAccessType")
    public String serviceAccessType;

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
         * <strong>example:</strong>
         * <p>Status</p>
         */
        @NameInMap("Name")
        public String name;

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
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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

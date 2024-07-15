// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>Specifies whether to return all versions of a service. Default value: false, which specifies that only the default version of a service is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllVersions")
    public Boolean allVersions;

    /**
     * <p>The filters.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServicesRequestFilter> filter;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
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
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzkt5buxxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListServicesRequestTag> tag;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setAllVersions(Boolean allVersions) {
        this.allVersions = allVersions;
        return this;
    }
    public Boolean getAllVersions() {
        return this.allVersions;
    }

    public ListServicesRequest setFilter(java.util.List<ListServicesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServicesRequestFilter> getFilter() {
        return this.filter;
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

    public ListServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServicesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
         * <p>The parameter name of the filter. You can specify one or more parameter names to query services. Valid values:</p>
         * <ul>
         * <li>ServiceId: the ID of the service.</li>
         * <li>Name: the name of the service.</li>
         * <li>Status: the state of the service.</li>
         * <li>SupplierName: the name of the service provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Status</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter values of the filter.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstancesRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServiceInstancesRequestFilter> filter;

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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzkt5buxxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to display the information that the service instance is deleted. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowDeleted")
    public Boolean showDeleted;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListServiceInstancesRequestTag> tag;

    public static ListServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesRequest self = new ListServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesRequest setFilter(java.util.List<ListServiceInstancesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServiceInstancesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServiceInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServiceInstancesRequest setShowDeleted(Boolean showDeleted) {
        this.showDeleted = showDeleted;
        return this;
    }
    public Boolean getShowDeleted() {
        return this.showDeleted;
    }

    public ListServiceInstancesRequest setTag(java.util.List<ListServiceInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServiceInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServiceInstancesRequestFilter extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more filters. Valid values:</p>
         * <ul>
         * <li>Name: The service name. If you want to perform a fuzzy match, specify the service name in the <em>xxx</em> format. For example, if the service name is My Service, you can set the filter value to <em>My</em> or <em>Service</em>.</li>
         * <li>ServiceInstanceId: The ID of the service instance.</li>
         * <li>ServiceId: The service ID.</li>
         * <li>UserId: The user ID.</li>
         * <li>Version: The service version.</li>
         * <li>Status: The status of the service instance.</li>
         * <li>DeployType: The deployment type of the service.</li>
         * <li>ServiceType: The service type.</li>
         * <li>OperationStartTimeBefore: The time before the hosted O\&amp;M starts.</li>
         * <li>OperationStartTimeAfter: The time after the hosted O\&amp;M starts.</li>
         * <li>OperationEndTimeBefore: The time before the hosted O\&amp;M ends.</li>
         * <li>OperationEndTimeAfter: The time after the hosted O\&amp;M ends.</li>
         * <li>OperatedServiceInstanceId: The ID of the hosted O\&amp;M instance that belongs to a private service.</li>
         * <li>OperationServiceInstanceId: The ID of the hosted O\&amp;M service instance that belongs to a hosted O\&amp;M service.</li>
         * <li>EnableInstanceOps: Whether the hosted O\&amp;M feature is enabled for service instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceInstanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter values of the filter.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServiceInstancesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesRequestFilter self = new ListServiceInstancesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceInstancesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListServiceInstancesRequestTag extends TeaModel {
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

        public static ListServiceInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesRequestTag self = new ListServiceInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServiceInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

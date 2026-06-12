// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstancesRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServiceInstancesRequestFilter> filter;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set it to the <strong>NextToken</strong> value returned from the previous API call.</p>
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
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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

    public ListServiceInstancesRequest setTag(java.util.List<ListServiceInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServiceInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServiceInstancesRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter. You can specify one or more filter names to query resources. Valid values:</p>
         * <ul>
         * <li><p>Name: The name of the service. To perform a fuzzy search, enter the value in the \<em>xxx\</em> format. For example, if the service name is My Service, you can enter \<em>My\</em> or \<em>Service\</em> for a fuzzy search.</p>
         * </li>
         * <li><p>ServiceInstanceName: The name of the service instance. A fuzzy query is performed if you enter one service instance name. A term query is performed if you enter multiple service instance names.</p>
         * </li>
         * <li><p>ServiceInstanceId: The service instance ID.</p>
         * </li>
         * <li><p>ServiceId: The service ID.</p>
         * </li>
         * <li><p>Version: The service version.</p>
         * </li>
         * <li><p>Status: The instance status.</p>
         * </li>
         * <li><p>DeployType: The deployment type.</p>
         * </li>
         * <li><p>ServiceType: The service type.</p>
         * </li>
         * <li><p>OperationStartTimeBefore: The time before the start of the Alibaba Cloud Managed Services.</p>
         * </li>
         * <li><p>OperationStartTimeAfter: The time after the start of the Alibaba Cloud Managed Services.</p>
         * </li>
         * <li><p>OperationEndTimeBefore: The time before the end of the Alibaba Cloud Managed Services.</p>
         * </li>
         * <li><p>OperationEndTimeAfter: The time after the end of the Alibaba Cloud Managed Services.</p>
         * </li>
         * <li><p>OperatedServiceInstanceId: The ID of the managed service instance under a private service.</p>
         * </li>
         * <li><p>OperationServiceInstanceId: The ID of the service instance under a pure managed service.</p>
         * </li>
         * <li><p>EnableInstanceOps: Indicates whether the Alibaba Cloud Managed Services feature is enabled for the service instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceInstanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of filter values.</p>
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

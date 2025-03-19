// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceResourcesRequest extends TeaModel {
    /**
     * <p>The filter conditions. Vaild values:</p>
     * <ul>
     * <li><p>ExpireTimeStart：
     * Query start time for Subscription resource expiration.
     * <notice>Notice Note: Only supports querying service instances on private deployments.&gt;Notice: </p>
     * </li>
     * <li><p>ExpireTimeEnd：Query end time for Subscription resource expiration.
     * <notice>Notice Note: Only supports querying service instances on private deployments.&gt;Notice: </p>
     * </li>
     * <li><p>PayType：The billing method of the read-only instance. 
     * <notice>Notice Note: Only supports querying service instances on private deployments.<notice> </p>
     * <p> Valid values:</p>
     * <ul>
     * <li><p>PayAsYouGo</p>
     * </li>
     * <li><p>Subscription</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>ResourceARN：The Alibaba Cloud Resource Name (ARN) of a resource.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Filters")
    public java.util.List<ListServiceInstanceResourcesRequestFilters> filters;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
     * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbAx7BkQzyYC+ONO+WudHGKEdB0uWSY7AGnM3qCgm/Ynge7zU6NWdbj0Tegyajyqyc=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: China (Hangzhou).</li>
     * <li>ap-southeast-1: Singapore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d8a0cc2a1ee04dce****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>Service Instance resource type，include AliyunResource and ContainerResource.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunResource</p>
     */
    @NameInMap("ServiceInstanceResourceType")
    public String serviceInstanceResourceType;

    /**
     * <p>The tag key and value.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListServiceInstanceResourcesRequestTag> tag;

    public static ListServiceInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceResourcesRequest self = new ListServiceInstanceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceResourcesRequest setFilters(java.util.List<ListServiceInstanceResourcesRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListServiceInstanceResourcesRequestFilters> getFilters() {
        return this.filters;
    }

    public ListServiceInstanceResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceInstanceResourcesRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public ListServiceInstanceResourcesRequest setServiceInstanceResourceType(String serviceInstanceResourceType) {
        this.serviceInstanceResourceType = serviceInstanceResourceType;
        return this;
    }
    public String getServiceInstanceResourceType() {
        return this.serviceInstanceResourceType;
    }

    public ListServiceInstanceResourcesRequest setTag(java.util.List<ListServiceInstanceResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServiceInstanceResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServiceInstanceResourcesRequestFilters extends TeaModel {
        /**
         * <p>Vaild values:</p>
         * <ul>
         * <li>ExpireTimeStart</li>
         * <li>ExpireTimeEnd</li>
         * <li>PayType</li>
         * <li>ResourceARN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ExpireTimeStart</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the filter condition.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListServiceInstanceResourcesRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceResourcesRequestFilters self = new ListServiceInstanceResourcesRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceResourcesRequestFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceInstanceResourcesRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListServiceInstanceResourcesRequestTag extends TeaModel {
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

        public static ListServiceInstanceResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceResourcesRequestTag self = new ListServiceInstanceResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServiceInstanceResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

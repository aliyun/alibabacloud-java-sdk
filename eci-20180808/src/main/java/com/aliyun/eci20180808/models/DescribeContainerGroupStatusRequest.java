// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupStatusRequest extends TeaModel {
    /**
     * <p>The IDs of the instances. You can specify up to 20 IDs. Each ID must be a string in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;eci-bp17gw49eu09yiwm****&quot;, &quot;eci-bp19aq49du01abcm****&quot;, &quot;eci-2zegym1qhbmdfr1s****&quot;]</p>
     */
    @NameInMap("ContainerGroupIds")
    public String containerGroupIds;

    /**
     * <p>Specifies the maximum number of elastic container instances to be returned for this request. Default value: 200.</p>
     * <blockquote>
     * <p>The number of returned resources can be less than or equal to the value of this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.\
     * You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>d78f2dd8-5979-42fe-xaee-b16db43be5bc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instances belong.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>A relative time in seconds before the current time from which to show elastic container instances whose status changes. This parameter is used to poll status of elastic container instances.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("SinceSecond")
    public Integer sinceSecond;

    /**
     * <p>The tag that is bound to the instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6h3rbwbm90urjwa****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the instances.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-k</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeContainerGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupStatusRequest self = new DescribeContainerGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupStatusRequest setContainerGroupIds(String containerGroupIds) {
        this.containerGroupIds = containerGroupIds;
        return this;
    }
    public String getContainerGroupIds() {
        return this.containerGroupIds;
    }

    public DescribeContainerGroupStatusRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeContainerGroupStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeContainerGroupStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeContainerGroupStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeContainerGroupStatusRequest setSinceSecond(Integer sinceSecond) {
        this.sinceSecond = sinceSecond;
        return this;
    }
    public Integer getSinceSecond() {
        return this.sinceSecond;
    }

    public DescribeContainerGroupStatusRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public DescribeContainerGroupStatusRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeContainerGroupStatusRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class Tag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

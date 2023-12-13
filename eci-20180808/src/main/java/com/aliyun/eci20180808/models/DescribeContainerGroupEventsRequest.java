// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupEventsRequest extends TeaModel {
    /**
     * <p>The IDs of the elastic container instances. You can specify up to 20 IDs. Each ID must be a JSON string.</p>
     */
    @NameInMap("ContainerGroupIds")
    public String containerGroupIds;

    /**
     * <p>The event source. Valid values:</p>
     * <br>
     * <p>*   EciService</p>
     * <p>*   K8sAgent</p>
     * <br>
     * <p>This parameter is empty by default. This indicates that all events are queried.</p>
     */
    @NameInMap("EventSource")
    public String eventSource;

    /**
     * <p>The maximum number of elastic container instances to be returned for this request. Default value: 200.</p>
     * <br>
     * <p>>  The number of elastic container instances to be returned is no greater than this parameter value.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * <br>
     * <p>You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>A relative time in seconds before the current time from which to show event information. This parameter is used to poll incremental events.</p>
     */
    @NameInMap("SinceSecond")
    public Integer sinceSecond;

    /**
     * <p>The tag that is added to the elastic container instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeContainerGroupEventsRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeContainerGroupEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupEventsRequest self = new DescribeContainerGroupEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupEventsRequest setContainerGroupIds(String containerGroupIds) {
        this.containerGroupIds = containerGroupIds;
        return this;
    }
    public String getContainerGroupIds() {
        return this.containerGroupIds;
    }

    public DescribeContainerGroupEventsRequest setEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }
    public String getEventSource() {
        return this.eventSource;
    }

    public DescribeContainerGroupEventsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeContainerGroupEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeContainerGroupEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeContainerGroupEventsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeContainerGroupEventsRequest setSinceSecond(Integer sinceSecond) {
        this.sinceSecond = sinceSecond;
        return this;
    }
    public Integer getSinceSecond() {
        return this.sinceSecond;
    }

    public DescribeContainerGroupEventsRequest setTag(java.util.List<DescribeContainerGroupEventsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeContainerGroupEventsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeContainerGroupEventsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeContainerGroupEventsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeContainerGroupEventsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeContainerGroupEventsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupEventsRequestTag self = new DescribeContainerGroupEventsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupEventsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeContainerGroupEventsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

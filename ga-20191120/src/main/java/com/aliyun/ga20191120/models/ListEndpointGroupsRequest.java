// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>Specifies whether the access logging feature is enabled. Default value: off. Valid values:</p>
     * <br>
     * <p>*   **on:** enables the access logging feature.</p>
     * <p>*   **off:** disables the access logging feature.</p>
     */
    @NameInMap("AccessLogSwitch")
    public String accessLogSwitch;

    /**
     * <p>The ID of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The type of the endpoint group. Valid values:</p>
     * <br>
     * <p>*   **default:** a default endpoint group.</p>
     * <p>*   **virtual:** a virtual endpoint group.</p>
     * <p>*   If you leave this parameter empty, all default and virtual endpoint groups are queried.</p>
     */
    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Tags of GA instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListEndpointGroupsRequestTag> tag;

    public static ListEndpointGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointGroupsRequest self = new ListEndpointGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListEndpointGroupsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListEndpointGroupsRequest setAccessLogSwitch(String accessLogSwitch) {
        this.accessLogSwitch = accessLogSwitch;
        return this;
    }
    public String getAccessLogSwitch() {
        return this.accessLogSwitch;
    }

    public ListEndpointGroupsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public ListEndpointGroupsRequest setEndpointGroupType(String endpointGroupType) {
        this.endpointGroupType = endpointGroupType;
        return this;
    }
    public String getEndpointGroupType() {
        return this.endpointGroupType;
    }

    public ListEndpointGroupsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public ListEndpointGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEndpointGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEndpointGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEndpointGroupsRequest setTag(java.util.List<ListEndpointGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListEndpointGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListEndpointGroupsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the GA instance.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the GA instance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEndpointGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointGroupsRequestTag self = new ListEndpointGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListEndpointGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEndpointGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

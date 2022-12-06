// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupsRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("AccessLogSwitch")
    public String accessLogSwitch;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("Key")
        public String key;

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

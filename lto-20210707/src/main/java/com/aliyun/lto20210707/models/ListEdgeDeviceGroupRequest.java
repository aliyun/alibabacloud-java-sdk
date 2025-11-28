// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListEdgeDeviceGroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Num")
    public Integer num;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Size")
    public Integer size;

    @NameInMap("Status")
    public String status;

    public static ListEdgeDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeDeviceGroupRequest self = new ListEdgeDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeDeviceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEdgeDeviceGroupRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListEdgeDeviceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEdgeDeviceGroupRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListEdgeDeviceGroupRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

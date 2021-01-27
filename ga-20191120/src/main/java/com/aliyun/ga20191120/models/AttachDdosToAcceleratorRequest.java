// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AttachDdosToAcceleratorRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("DdosId")
    public String ddosId;

    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("RegionId")
    public String regionId;

    public static AttachDdosToAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDdosToAcceleratorRequest self = new AttachDdosToAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public AttachDdosToAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public AttachDdosToAcceleratorRequest setDdosId(String ddosId) {
        this.ddosId = ddosId;
        return this;
    }
    public String getDdosId() {
        return this.ddosId;
    }

    public AttachDdosToAcceleratorRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public AttachDdosToAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachDdosFromAcceleratorRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("DdosConfigList")
    public java.util.List<DetachDdosFromAcceleratorRequestDdosConfigList> ddosConfigList;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DetachDdosFromAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDdosFromAcceleratorRequest self = new DetachDdosFromAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public DetachDdosFromAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DetachDdosFromAcceleratorRequest setDdosConfigList(java.util.List<DetachDdosFromAcceleratorRequestDdosConfigList> ddosConfigList) {
        this.ddosConfigList = ddosConfigList;
        return this;
    }
    public java.util.List<DetachDdosFromAcceleratorRequestDdosConfigList> getDdosConfigList() {
        return this.ddosConfigList;
    }

    public DetachDdosFromAcceleratorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DetachDdosFromAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DetachDdosFromAcceleratorRequestDdosConfigList extends TeaModel {
        @NameInMap("DdosId")
        public String ddosId;

        @NameInMap("DdosRegionId")
        public String ddosRegionId;

        public static DetachDdosFromAcceleratorRequestDdosConfigList build(java.util.Map<String, ?> map) throws Exception {
            DetachDdosFromAcceleratorRequestDdosConfigList self = new DetachDdosFromAcceleratorRequestDdosConfigList();
            return TeaModel.build(map, self);
        }

        public DetachDdosFromAcceleratorRequestDdosConfigList setDdosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }
        public String getDdosId() {
            return this.ddosId;
        }

        public DetachDdosFromAcceleratorRequestDdosConfigList setDdosRegionId(String ddosRegionId) {
            this.ddosRegionId = ddosRegionId;
            return this;
        }
        public String getDdosRegionId() {
            return this.ddosRegionId;
        }

    }

}

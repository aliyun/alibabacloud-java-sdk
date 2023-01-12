// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AttachDdosToAcceleratorRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance with which the Anti-DDoS Pro/Premium instance is associated.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the Anti-DDoS Pro/Premium instance to be associated with the GA instance.</p>
     */
    @NameInMap("DdosId")
    public String ddosId;

    /**
     * <p>The region where the Anti-DDoS Pro/Premium instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: regions in the Chinese mainland</p>
     * <p>*   **ap-southeast-1**: regions outside the Chinese mainland</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
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

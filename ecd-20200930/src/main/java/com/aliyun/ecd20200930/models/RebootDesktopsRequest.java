// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebootDesktopsRequest extends TeaModel {
    @NameInMap("CreateSnapshot")
    public Boolean createSnapshot;

    /**
     * <p>An array of 1 to 100 desktop IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>Specifies whether to install system patches.</p>
     */
    @NameInMap("OsUpdate")
    public Boolean osUpdate;

    /**
     * <strong>example:</strong>
     * <p>KB5082063</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>The ID of the region. Call <a href="~~DescribeRegions~~">DescribeRegions</a> to get a list of regions where Elastic Desktop Service is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RebootDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootDesktopsRequest self = new RebootDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public RebootDesktopsRequest setCreateSnapshot(Boolean createSnapshot) {
        this.createSnapshot = createSnapshot;
        return this;
    }
    public Boolean getCreateSnapshot() {
        return this.createSnapshot;
    }

    public RebootDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public RebootDesktopsRequest setOsUpdate(Boolean osUpdate) {
        this.osUpdate = osUpdate;
        return this;
    }
    public Boolean getOsUpdate() {
        return this.osUpdate;
    }

    public RebootDesktopsRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public RebootDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

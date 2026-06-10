// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StopDesktopsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateSnapshot")
    public String createSnapshot;

    /**
     * <p>An array of 1 to 100 cloud desktop IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-7w78ozhjcwa3u****</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>Specifies whether to apply pending patch updates.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to get a list of regions that Elastic Desktop Service supports.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies the billing mode for the cloud desktops after they are stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>StopCharging</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    public static StopDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDesktopsRequest self = new StopDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public StopDesktopsRequest setCreateSnapshot(String createSnapshot) {
        this.createSnapshot = createSnapshot;
        return this;
    }
    public String getCreateSnapshot() {
        return this.createSnapshot;
    }

    public StopDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public StopDesktopsRequest setOsUpdate(Boolean osUpdate) {
        this.osUpdate = osUpdate;
        return this;
    }
    public Boolean getOsUpdate() {
        return this.osUpdate;
    }

    public StopDesktopsRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public StopDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopDesktopsRequest setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

}

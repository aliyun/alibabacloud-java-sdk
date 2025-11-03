// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StopDesktopsRequest extends TeaModel {
    /**
     * <p>The cloud computer IDs. You can specify the IDs of 1 to 100 cloud computers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-7w78ozhjcwa3u****</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>Whether to perform a patch update when the update is ready. A value of true indicates that a patch update is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OsUpdate")
    public Boolean osUpdate;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The billing mode after you stop the cloud computer.</p>
     * <p>Default value: StopCharging. Valid values:</p>
     * <ul>
     * <li><p>StopCharging: After the cloud computer is stopped, the system automatically reclaims computing resources. You are no longer charged for computing resources. However, you are still charged for storage resources.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>KeepCharging: After the cloud computer is stopped, the system does not reclaim resources to prevent insufficient resources and startup failures. You are still charged for the resources.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
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

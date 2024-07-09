// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApproveFotaUpdateRequest extends TeaModel {
    /**
     * <p>Mirror version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1-D-20220513.143129</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The ID of the cloud computer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-138dsptkrt00u****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ApproveFotaUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveFotaUpdateRequest self = new ApproveFotaUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ApproveFotaUpdateRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ApproveFotaUpdateRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ApproveFotaUpdateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

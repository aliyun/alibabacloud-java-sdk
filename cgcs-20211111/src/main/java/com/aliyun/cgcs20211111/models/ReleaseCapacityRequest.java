// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReleaseCapacityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DistrictId")
    public String districtId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExpectReleaseSessionCapacity")
    public Integer expectReleaseSessionCapacity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static ReleaseCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityRequest self = new ReleaseCapacityRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReleaseCapacityRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ReleaseCapacityRequest setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public ReleaseCapacityRequest setExpectReleaseSessionCapacity(Integer expectReleaseSessionCapacity) {
        this.expectReleaseSessionCapacity = expectReleaseSessionCapacity;
        return this;
    }
    public Integer getExpectReleaseSessionCapacity() {
        return this.expectReleaseSessionCapacity;
    }

    public ReleaseCapacityRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

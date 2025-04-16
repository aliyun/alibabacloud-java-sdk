// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

import com.aliyun.tea.*;

public class StartDesktopsRequest extends TeaModel {
    @NameInMap("ClientOS")
    public String clientOS;

    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopsRequest self = new StartDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public StartDesktopsRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public StartDesktopsRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public StartDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public StartDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

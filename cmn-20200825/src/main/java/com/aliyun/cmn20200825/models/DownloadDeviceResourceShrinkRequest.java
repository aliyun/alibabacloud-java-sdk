// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DownloadDeviceResourceShrinkRequest extends TeaModel {
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    @NameInMap("DeviceResourceIds")
    public String deviceResourceIdsShrink;

    @NameInMap("DownloadType")
    public String downloadType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SetupProjectId")
    public String setupProjectId;

    public static DownloadDeviceResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDeviceResourceShrinkRequest self = new DownloadDeviceResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDeviceResourceShrinkRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public DownloadDeviceResourceShrinkRequest setDeviceResourceIdsShrink(String deviceResourceIdsShrink) {
        this.deviceResourceIdsShrink = deviceResourceIdsShrink;
        return this;
    }
    public String getDeviceResourceIdsShrink() {
        return this.deviceResourceIdsShrink;
    }

    public DownloadDeviceResourceShrinkRequest setDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }
    public String getDownloadType() {
        return this.downloadType;
    }

    public DownloadDeviceResourceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadDeviceResourceShrinkRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

}

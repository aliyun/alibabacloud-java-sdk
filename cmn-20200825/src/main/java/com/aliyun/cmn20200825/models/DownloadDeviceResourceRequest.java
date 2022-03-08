// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DownloadDeviceResourceRequest extends TeaModel {
    // deviceResourceId
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    // 资源uuid
    @NameInMap("DeviceResourceIds")
    public java.util.List<String> deviceResourceIds;

    // 操作类型
    @NameInMap("DownloadType")
    public String downloadType;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 建设项目id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    public static DownloadDeviceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDeviceResourceRequest self = new DownloadDeviceResourceRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDeviceResourceRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public DownloadDeviceResourceRequest setDeviceResourceIds(java.util.List<String> deviceResourceIds) {
        this.deviceResourceIds = deviceResourceIds;
        return this;
    }
    public java.util.List<String> getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    public DownloadDeviceResourceRequest setDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }
    public String getDownloadType() {
        return this.downloadType;
    }

    public DownloadDeviceResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadDeviceResourceRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

}

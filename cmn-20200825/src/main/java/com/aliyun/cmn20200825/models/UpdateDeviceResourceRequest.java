// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceResourceRequest extends TeaModel {
    // 更新数据
    @NameInMap("Data")
    public String data;

    // 资源一级ID
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    // 资源一级ID
    @NameInMap("DeviceResourceIds")
    public java.util.List<String> deviceResourceIds;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 建设项目id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 操作类型
    @NameInMap("UpdateType")
    public String updateType;

    public static UpdateDeviceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceResourceRequest self = new UpdateDeviceResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceResourceRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateDeviceResourceRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public UpdateDeviceResourceRequest setDeviceResourceIds(java.util.List<String> deviceResourceIds) {
        this.deviceResourceIds = deviceResourceIds;
        return this;
    }
    public java.util.List<String> getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    public UpdateDeviceResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDeviceResourceRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateDeviceResourceRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

}

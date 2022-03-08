// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceResourceShrinkRequest extends TeaModel {
    // 更新数据
    @NameInMap("Data")
    public String data;

    // 资源一级ID
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    // 资源一级ID
    @NameInMap("DeviceResourceIds")
    public String deviceResourceIdsShrink;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 建设项目id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 操作类型
    @NameInMap("UpdateType")
    public String updateType;

    public static UpdateDeviceResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceResourceShrinkRequest self = new UpdateDeviceResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceResourceShrinkRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateDeviceResourceShrinkRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public UpdateDeviceResourceShrinkRequest setDeviceResourceIdsShrink(String deviceResourceIdsShrink) {
        this.deviceResourceIdsShrink = deviceResourceIdsShrink;
        return this;
    }
    public String getDeviceResourceIdsShrink() {
        return this.deviceResourceIdsShrink;
    }

    public UpdateDeviceResourceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDeviceResourceShrinkRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateDeviceResourceShrinkRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

}

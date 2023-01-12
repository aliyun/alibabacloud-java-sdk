// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceResourceShrinkRequest extends TeaModel {
    /**
     * <p>更新数据</p>
     */
    @NameInMap("Data")
    public String data;

    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("DeviceResourceIds")
    public String deviceResourceIdsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>建设项目id</p>
     */
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    /**
     * <p>操作类型</p>
     */
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

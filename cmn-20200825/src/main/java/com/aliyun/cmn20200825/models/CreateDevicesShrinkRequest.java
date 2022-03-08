// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDevicesShrinkRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    @NameInMap("DeviceParamModelList")
    public String deviceParamModelListShrink;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicesShrinkRequest self = new CreateDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevicesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDevicesShrinkRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public CreateDevicesShrinkRequest setDeviceParamModelListShrink(String deviceParamModelListShrink) {
        this.deviceParamModelListShrink = deviceParamModelListShrink;
        return this;
    }
    public String getDeviceParamModelListShrink() {
        return this.deviceParamModelListShrink;
    }

    public CreateDevicesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceFormRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDeviceFormRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceFormRequest self = new DeleteDeviceFormRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceFormRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public DeleteDeviceFormRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

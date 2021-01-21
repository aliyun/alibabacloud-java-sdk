// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceDeviceGroupRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("DeviceGroupName")
    @Validation(required = true)
    public String deviceGroupName;

    public static AddFaceDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceDeviceGroupRequest self = new AddFaceDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceDeviceGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceDeviceGroupRequest setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
        return this;
    }
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

}

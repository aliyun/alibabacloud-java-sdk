// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceDeviceGroupRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    public String deviceGroupId;

    public static DeleteFaceDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDeviceGroupRequest self = new DeleteFaceDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDeviceGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public DeleteFaceDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}

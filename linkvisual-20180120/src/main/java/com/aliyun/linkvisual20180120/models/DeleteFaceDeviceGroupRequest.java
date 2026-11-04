// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceDeviceGroupRequest extends TeaModel {
    /**
     * <p>The device group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qaf2tihq</p>
     */
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    /**
     * <p>The isolation ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestIsolationId</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    public static DeleteFaceDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDeviceGroupRequest self = new DeleteFaceDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public DeleteFaceDeviceGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

}

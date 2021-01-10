// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteAllVersionGroupDevicesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static DeleteAllVersionGroupDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllVersionGroupDevicesRequest self = new DeleteAllVersionGroupDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAllVersionGroupDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteAllVersionGroupDevicesRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}

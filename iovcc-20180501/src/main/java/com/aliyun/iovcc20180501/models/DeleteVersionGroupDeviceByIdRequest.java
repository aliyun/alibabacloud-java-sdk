// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionGroupDeviceByIdRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("Ids")
    public String ids;

    public static DeleteVersionGroupDeviceByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionGroupDeviceByIdRequest self = new DeleteVersionGroupDeviceByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVersionGroupDeviceByIdRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteVersionGroupDeviceByIdRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public DeleteVersionGroupDeviceByIdRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}

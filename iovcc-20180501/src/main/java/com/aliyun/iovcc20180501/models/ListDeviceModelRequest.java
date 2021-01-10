// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceModelRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static ListDeviceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceModelRequest self = new ListDeviceModelRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceModelRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

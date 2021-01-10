// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceTypesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static ListDeviceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceTypesRequest self = new ListDeviceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceTypesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

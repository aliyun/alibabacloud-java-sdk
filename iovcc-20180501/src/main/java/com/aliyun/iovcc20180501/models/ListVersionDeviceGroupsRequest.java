// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListVersionDeviceGroupsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static ListVersionDeviceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVersionDeviceGroupsRequest self = new ListVersionDeviceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListVersionDeviceGroupsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

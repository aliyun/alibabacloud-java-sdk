// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowProjectUserRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserName")
    public String userName;

    public static DeleteFlowProjectUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowProjectUserRequest self = new DeleteFlowProjectUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowProjectUserRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteFlowProjectUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteFlowProjectUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}

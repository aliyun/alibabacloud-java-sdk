// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetProjectPoliciesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static GetProjectPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectPoliciesRequest self = new GetProjectPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectPoliciesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

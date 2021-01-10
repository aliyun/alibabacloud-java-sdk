// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListNamespacesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AuthType")
    public String authType;

    public static ListNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesRequest self = new ListNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespacesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListNamespacesRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}

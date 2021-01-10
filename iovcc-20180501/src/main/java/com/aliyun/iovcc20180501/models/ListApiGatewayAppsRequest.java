// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListApiGatewayAppsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static ListApiGatewayAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiGatewayAppsRequest self = new ListApiGatewayAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListApiGatewayAppsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

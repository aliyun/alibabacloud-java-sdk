// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateUpstreamAppKeyRelationsRequest extends TeaModel {
    @NameInMap("AppKeys")
    public String appKeys;

    @NameInMap("AppServerId")
    public String appServerId;

    @NameInMap("ProjectId")
    public String projectId;

    public static CreateUpstreamAppKeyRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUpstreamAppKeyRelationsRequest self = new CreateUpstreamAppKeyRelationsRequest();
        return TeaModel.build(map, self);
    }

    public CreateUpstreamAppKeyRelationsRequest setAppKeys(String appKeys) {
        this.appKeys = appKeys;
        return this;
    }
    public String getAppKeys() {
        return this.appKeys;
    }

    public CreateUpstreamAppKeyRelationsRequest setAppServerId(String appServerId) {
        this.appServerId = appServerId;
        return this;
    }
    public String getAppServerId() {
        return this.appServerId;
    }

    public CreateUpstreamAppKeyRelationsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

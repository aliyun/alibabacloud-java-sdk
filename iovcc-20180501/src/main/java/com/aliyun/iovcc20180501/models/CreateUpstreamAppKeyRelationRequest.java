// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateUpstreamAppKeyRelationRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("PAppKey")
    public String PAppKey;

    @NameInMap("ProjectId")
    public String projectId;

    public static CreateUpstreamAppKeyRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUpstreamAppKeyRelationRequest self = new CreateUpstreamAppKeyRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateUpstreamAppKeyRelationRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateUpstreamAppKeyRelationRequest setPAppKey(String PAppKey) {
        this.PAppKey = PAppKey;
        return this;
    }
    public String getPAppKey() {
        return this.PAppKey;
    }

    public CreateUpstreamAppKeyRelationRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

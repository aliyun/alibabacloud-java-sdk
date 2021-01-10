// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateUpstreamAppServerRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Tags")
    public String tags;

    public static CreateUpstreamAppServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUpstreamAppServerRequest self = new CreateUpstreamAppServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateUpstreamAppServerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateUpstreamAppServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUpstreamAppServerRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}

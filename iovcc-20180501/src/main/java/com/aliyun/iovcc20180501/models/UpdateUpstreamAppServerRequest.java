// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateUpstreamAppServerRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("ProjectId")
    public String projectId;

    public static UpdateUpstreamAppServerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUpstreamAppServerRequest self = new UpdateUpstreamAppServerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUpstreamAppServerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateUpstreamAppServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateUpstreamAppServerRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateUpstreamAppServerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

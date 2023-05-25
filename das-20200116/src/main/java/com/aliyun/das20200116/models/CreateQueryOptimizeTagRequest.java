// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateQueryOptimizeTagRequest extends TeaModel {
    @NameInMap("Comments")
    public String comments;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SqlIds")
    public String sqlIds;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Tags")
    public String tags;

    public static CreateQueryOptimizeTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueryOptimizeTagRequest self = new CreateQueryOptimizeTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueryOptimizeTagRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateQueryOptimizeTagRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateQueryOptimizeTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateQueryOptimizeTagRequest setSqlIds(String sqlIds) {
        this.sqlIds = sqlIds;
        return this;
    }
    public String getSqlIds() {
        return this.sqlIds;
    }

    public CreateQueryOptimizeTagRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateQueryOptimizeTagRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}

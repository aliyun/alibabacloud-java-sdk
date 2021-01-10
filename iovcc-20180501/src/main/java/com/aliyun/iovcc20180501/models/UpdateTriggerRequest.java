// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Sandbox")
    public Integer sandbox;

    @NameInMap("Production")
    public Integer production;

    public static UpdateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerRequest self = new UpdateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateTriggerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTriggerRequest setSandbox(Integer sandbox) {
        this.sandbox = sandbox;
        return this;
    }
    public Integer getSandbox() {
        return this.sandbox;
    }

    public UpdateTriggerRequest setProduction(Integer production) {
        this.production = production;
        return this;
    }
    public Integer getProduction() {
        return this.production;
    }

}

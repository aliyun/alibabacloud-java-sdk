// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityTemplateRequest extends TeaModel {
    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Spec")
    public String spec;

    public static CreateDataQualityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityTemplateRequest self = new CreateDataQualityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityTemplateRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateDataQualityTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityTemplateRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}

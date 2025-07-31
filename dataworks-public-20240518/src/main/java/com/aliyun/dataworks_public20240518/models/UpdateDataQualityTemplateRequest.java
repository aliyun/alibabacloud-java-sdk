// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>USER_DEFINED:2001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>95279527****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Spec")
    public String spec;

    public static UpdateDataQualityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityTemplateRequest self = new UpdateDataQualityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDataQualityTemplateRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateDataQualityTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityTemplateRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}

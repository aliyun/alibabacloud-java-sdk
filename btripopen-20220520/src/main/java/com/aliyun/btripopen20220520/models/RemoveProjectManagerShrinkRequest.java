// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class RemoveProjectManagerShrinkRequest extends TeaModel {
    @NameInMap("org_entities")
    public String orgEntitiesShrink;

    /**
     * <strong>example:</strong>
     * <p>projectabc</p>
     */
    @NameInMap("out_project_id")
    public String outProjectId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("project_id")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("remove_all")
    public Boolean removeAll;

    public static RemoveProjectManagerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectManagerShrinkRequest self = new RemoveProjectManagerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveProjectManagerShrinkRequest setOrgEntitiesShrink(String orgEntitiesShrink) {
        this.orgEntitiesShrink = orgEntitiesShrink;
        return this;
    }
    public String getOrgEntitiesShrink() {
        return this.orgEntitiesShrink;
    }

    public RemoveProjectManagerShrinkRequest setOutProjectId(String outProjectId) {
        this.outProjectId = outProjectId;
        return this;
    }
    public String getOutProjectId() {
        return this.outProjectId;
    }

    public RemoveProjectManagerShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RemoveProjectManagerShrinkRequest setRemoveAll(Boolean removeAll) {
        this.removeAll = removeAll;
        return this;
    }
    public Boolean getRemoveAll() {
        return this.removeAll;
    }

}

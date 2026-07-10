// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddProjectManagerRequest extends TeaModel {
    @NameInMap("org_entities")
    public java.util.List<AddProjectManagerRequestOrgEntities> orgEntities;

    @NameInMap("out_project_id")
    public String outProjectId;

    @NameInMap("project_id")
    public Long projectId;

    public static AddProjectManagerRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectManagerRequest self = new AddProjectManagerRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectManagerRequest setOrgEntities(java.util.List<AddProjectManagerRequestOrgEntities> orgEntities) {
        this.orgEntities = orgEntities;
        return this;
    }
    public java.util.List<AddProjectManagerRequestOrgEntities> getOrgEntities() {
        return this.orgEntities;
    }

    public AddProjectManagerRequest setOutProjectId(String outProjectId) {
        this.outProjectId = outProjectId;
        return this;
    }
    public String getOutProjectId() {
        return this.outProjectId;
    }

    public AddProjectManagerRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public static class AddProjectManagerRequestOrgEntities extends TeaModel {
        @NameInMap("entity_id")
        public String entityId;

        @NameInMap("entity_type")
        public String entityType;

        public static AddProjectManagerRequestOrgEntities build(java.util.Map<String, ?> map) throws Exception {
            AddProjectManagerRequestOrgEntities self = new AddProjectManagerRequestOrgEntities();
            return TeaModel.build(map, self);
        }

        public AddProjectManagerRequestOrgEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public AddProjectManagerRequestOrgEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}

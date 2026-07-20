// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class RemoveProjectManagerRequest extends TeaModel {
    @NameInMap("org_entities")
    public java.util.List<RemoveProjectManagerRequestOrgEntities> orgEntities;

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

    public static RemoveProjectManagerRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectManagerRequest self = new RemoveProjectManagerRequest();
        return TeaModel.build(map, self);
    }

    public RemoveProjectManagerRequest setOrgEntities(java.util.List<RemoveProjectManagerRequestOrgEntities> orgEntities) {
        this.orgEntities = orgEntities;
        return this;
    }
    public java.util.List<RemoveProjectManagerRequestOrgEntities> getOrgEntities() {
        return this.orgEntities;
    }

    public RemoveProjectManagerRequest setOutProjectId(String outProjectId) {
        this.outProjectId = outProjectId;
        return this;
    }
    public String getOutProjectId() {
        return this.outProjectId;
    }

    public RemoveProjectManagerRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RemoveProjectManagerRequest setRemoveAll(Boolean removeAll) {
        this.removeAll = removeAll;
        return this;
    }
    public Boolean getRemoveAll() {
        return this.removeAll;
    }

    public static class RemoveProjectManagerRequestOrgEntities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("entity_type")
        public String entityType;

        public static RemoveProjectManagerRequestOrgEntities build(java.util.Map<String, ?> map) throws Exception {
            RemoveProjectManagerRequestOrgEntities self = new RemoveProjectManagerRequestOrgEntities();
            return TeaModel.build(map, self);
        }

        public RemoveProjectManagerRequestOrgEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public RemoveProjectManagerRequestOrgEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}

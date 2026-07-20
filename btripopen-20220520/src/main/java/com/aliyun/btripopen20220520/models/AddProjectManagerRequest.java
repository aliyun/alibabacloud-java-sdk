// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddProjectManagerRequest extends TeaModel {
    /**
     * <p>The list of manager group entities. Currently, entityType only supports &quot;1&quot; (employee). The maximum number is 10.</p>
     */
    @NameInMap("org_entities")
    public java.util.List<AddProjectManagerRequestOrgEntities> orgEntities;

    /**
     * <p>The third-party project ID. You must specify at least one of project_id and out_project_id.</p>
     * 
     * <strong>example:</strong>
     * <p>projectabc</p>
     */
    @NameInMap("out_project_id")
    public String outProjectId;

    /**
     * <p>The internal project ID. You must specify at least one of project_id and out_project_id.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
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
        /**
         * <p>The employee ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <p>Required. Currently only supports &quot;1&quot; (employee).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

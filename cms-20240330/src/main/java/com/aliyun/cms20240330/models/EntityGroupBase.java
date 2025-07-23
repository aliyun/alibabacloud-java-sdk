// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EntityGroupBase extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("entityGroupId")
    public String entityGroupId;

    @NameInMap("entityGroupName")
    public String entityGroupName;

    @NameInMap("entityQueries")
    public java.util.List<EntityGroupBaseEntityQueries> entityQueries;

    @NameInMap("entityRules")
    public EntityDiscoverRule entityRules;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("userId")
    public String userId;

    @NameInMap("workspace")
    public String workspace;

    public static EntityGroupBase build(java.util.Map<String, ?> map) throws Exception {
        EntityGroupBase self = new EntityGroupBase();
        return TeaModel.build(map, self);
    }

    public EntityGroupBase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EntityGroupBase setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
        return this;
    }
    public String getEntityGroupId() {
        return this.entityGroupId;
    }

    public EntityGroupBase setEntityGroupName(String entityGroupName) {
        this.entityGroupName = entityGroupName;
        return this;
    }
    public String getEntityGroupName() {
        return this.entityGroupName;
    }

    public EntityGroupBase setEntityQueries(java.util.List<EntityGroupBaseEntityQueries> entityQueries) {
        this.entityQueries = entityQueries;
        return this;
    }
    public java.util.List<EntityGroupBaseEntityQueries> getEntityQueries() {
        return this.entityQueries;
    }

    public EntityGroupBase setEntityRules(EntityDiscoverRule entityRules) {
        this.entityRules = entityRules;
        return this;
    }
    public EntityDiscoverRule getEntityRules() {
        return this.entityRules;
    }

    public EntityGroupBase setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EntityGroupBase setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public EntityGroupBase setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class EntityGroupBaseEntityQueries extends TeaModel {
        @NameInMap("entityType")
        public String entityType;

        @NameInMap("spl")
        public String spl;

        public static EntityGroupBaseEntityQueries build(java.util.Map<String, ?> map) throws Exception {
            EntityGroupBaseEntityQueries self = new EntityGroupBaseEntityQueries();
            return TeaModel.build(map, self);
        }

        public EntityGroupBaseEntityQueries setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public EntityGroupBaseEntityQueries setSpl(String spl) {
            this.spl = spl;
            return this;
        }
        public String getSpl() {
            return this.spl;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EntityGroupBase extends TeaModel {
    /**
     * <p>实体描述。</p>
     * 
     * <strong>example:</strong>
     * <p>ECS 实例</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>实体ID。</p>
     * 
     * <strong>example:</strong>
     * <p>eg-1234567890</p>
     */
    @NameInMap("entityGroupId")
    public String entityGroupId;

    /**
     * <p>实体名称。</p>
     * 
     * <strong>example:</strong>
     * <p>ECS 全部实体</p>
     */
    @NameInMap("entityGroupName")
    public String entityGroupName;

    /**
     * <p>实体查询规则集合。</p>
     */
    @NameInMap("entityQueries")
    public java.util.List<EntityGroupBaseEntityQueries> entityQueries;

    /**
     * <p>用于实体发现的规则。</p>
     */
    @NameInMap("entityRules")
    public EntityDiscoverRule entityRules;

    /**
     * <p>地域ID。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-heyuan</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>用户ID。</p>
     * 
     * <strong>example:</strong>
     * <p>1654218***343050</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>工作空间。</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1654218***343050-cn-hangzhou</p>
     */
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
        /**
         * <p>实体类型。</p>
         * 
         * <strong>example:</strong>
         * <p>acs.ecs.instance</p>
         */
        @NameInMap("entityType")
        public String entityType;

        /**
         * <p>SPL查询语句。</p>
         * 
         * <strong>example:</strong>
         * <p>.entity with(type=\&quot;acs.ecs.instance\&quot;) | where region_id in (\&quot;cn-beijing\&quot;)</p>
         */
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

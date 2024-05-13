// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntitySetRequest extends TeaModel {
    @NameInMap("entity_d_o_list")
    public java.util.List<EntitySetRequestEntityDOList> entityDOList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("thirdpart_id")
    public String thirdpartId;

    public static EntitySetRequest build(java.util.Map<String, ?> map) throws Exception {
        EntitySetRequest self = new EntitySetRequest();
        return TeaModel.build(map, self);
    }

    public EntitySetRequest setEntityDOList(java.util.List<EntitySetRequestEntityDOList> entityDOList) {
        this.entityDOList = entityDOList;
        return this;
    }
    public java.util.List<EntitySetRequestEntityDOList> getEntityDOList() {
        return this.entityDOList;
    }

    public EntitySetRequest setThirdpartId(String thirdpartId) {
        this.thirdpartId = thirdpartId;
        return this;
    }
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public static class EntitySetRequestEntityDOList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("entity_type")
        public String entityType;

        public static EntitySetRequestEntityDOList build(java.util.Map<String, ?> map) throws Exception {
            EntitySetRequestEntityDOList self = new EntitySetRequestEntityDOList();
            return TeaModel.build(map, self);
        }

        public EntitySetRequestEntityDOList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public EntitySetRequestEntityDOList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}

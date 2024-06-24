// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityAddRequest extends TeaModel {
    @NameInMap("entity_d_o_list")
    public java.util.List<EntityAddRequestEntityDOList> entityDOList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340049</p>
     */
    @NameInMap("thirdpart_id")
    public String thirdpartId;

    public static EntityAddRequest build(java.util.Map<String, ?> map) throws Exception {
        EntityAddRequest self = new EntityAddRequest();
        return TeaModel.build(map, self);
    }

    public EntityAddRequest setEntityDOList(java.util.List<EntityAddRequestEntityDOList> entityDOList) {
        this.entityDOList = entityDOList;
        return this;
    }
    public java.util.List<EntityAddRequestEntityDOList> getEntityDOList() {
        return this.entityDOList;
    }

    public EntityAddRequest setThirdpartId(String thirdpartId) {
        this.thirdpartId = thirdpartId;
        return this;
    }
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public static class EntityAddRequestEntityDOList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("entity_type")
        public String entityType;

        public static EntityAddRequestEntityDOList build(java.util.Map<String, ?> map) throws Exception {
            EntityAddRequestEntityDOList self = new EntityAddRequestEntityDOList();
            return TeaModel.build(map, self);
        }

        public EntityAddRequestEntityDOList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public EntityAddRequestEntityDOList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}

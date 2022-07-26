// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntitySetRequest extends TeaModel {
    @NameInMap("entity_d_o_list")
    public java.util.List<EntitySetRequestEntityDOList> entityDOList;

    @NameInMap("thirdpart_id")
    public String thirdpartId;

    @NameInMap("user_id")
    public String userId;

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

    public EntitySetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class EntitySetRequestEntityDOList extends TeaModel {
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("entity_id")
        public String entityId;

        @NameInMap("entity_type")
        public String entityType;

        @NameInMap("name")
        public String name;

        @NameInMap("user_num")
        public Integer userNum;

        public static EntitySetRequestEntityDOList build(java.util.Map<String, ?> map) throws Exception {
            EntitySetRequestEntityDOList self = new EntitySetRequestEntityDOList();
            return TeaModel.build(map, self);
        }

        public EntitySetRequestEntityDOList setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
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

        public EntitySetRequestEntityDOList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EntitySetRequestEntityDOList setUserNum(Integer userNum) {
            this.userNum = userNum;
            return this;
        }
        public Integer getUserNum() {
            return this.userNum;
        }

    }

}

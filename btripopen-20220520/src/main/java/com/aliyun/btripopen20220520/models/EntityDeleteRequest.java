// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityDeleteRequest extends TeaModel {
    @NameInMap("del_all")
    public Boolean delAll;

    @NameInMap("entity_d_o_list")
    public java.util.List<EntityDeleteRequestEntityDOList> entityDOList;

    @NameInMap("thirdpart_id")
    public String thirdpartId;

    @NameInMap("user_id")
    public String userId;

    public static EntityDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        EntityDeleteRequest self = new EntityDeleteRequest();
        return TeaModel.build(map, self);
    }

    public EntityDeleteRequest setDelAll(Boolean delAll) {
        this.delAll = delAll;
        return this;
    }
    public Boolean getDelAll() {
        return this.delAll;
    }

    public EntityDeleteRequest setEntityDOList(java.util.List<EntityDeleteRequestEntityDOList> entityDOList) {
        this.entityDOList = entityDOList;
        return this;
    }
    public java.util.List<EntityDeleteRequestEntityDOList> getEntityDOList() {
        return this.entityDOList;
    }

    public EntityDeleteRequest setThirdpartId(String thirdpartId) {
        this.thirdpartId = thirdpartId;
        return this;
    }
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public EntityDeleteRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class EntityDeleteRequestEntityDOList extends TeaModel {
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

        public static EntityDeleteRequestEntityDOList build(java.util.Map<String, ?> map) throws Exception {
            EntityDeleteRequestEntityDOList self = new EntityDeleteRequestEntityDOList();
            return TeaModel.build(map, self);
        }

        public EntityDeleteRequestEntityDOList setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public EntityDeleteRequestEntityDOList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public EntityDeleteRequestEntityDOList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public EntityDeleteRequestEntityDOList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EntityDeleteRequestEntityDOList setUserNum(Integer userNum) {
            this.userNum = userNum;
            return this;
        }
        public Integer getUserNum() {
            return this.userNum;
        }

    }

}

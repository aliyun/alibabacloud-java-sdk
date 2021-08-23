// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryEntitiesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Entities")
    public java.util.List<QueryEntitiesResponseBodyEntities> entities;

    public static QueryEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEntitiesResponseBody self = new QueryEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEntitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEntitiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryEntitiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryEntitiesResponseBody setEntities(java.util.List<QueryEntitiesResponseBodyEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<QueryEntitiesResponseBodyEntities> getEntities() {
        return this.entities;
    }

    public static class QueryEntitiesResponseBodyEntitiesMembers extends TeaModel {
        @NameInMap("Synonyms")
        public java.util.List<String> synonyms;

        @NameInMap("MemberName")
        public String memberName;

        public static QueryEntitiesResponseBodyEntitiesMembers build(java.util.Map<String, ?> map) throws Exception {
            QueryEntitiesResponseBodyEntitiesMembers self = new QueryEntitiesResponseBodyEntitiesMembers();
            return TeaModel.build(map, self);
        }

        public QueryEntitiesResponseBodyEntitiesMembers setSynonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

        public QueryEntitiesResponseBodyEntitiesMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

    }

    public static class QueryEntitiesResponseBodyEntities extends TeaModel {
        @NameInMap("Members")
        public java.util.List<QueryEntitiesResponseBodyEntitiesMembers> members;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("EntityId")
        public Long entityId;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Regex")
        public String regex;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static QueryEntitiesResponseBodyEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryEntitiesResponseBodyEntities self = new QueryEntitiesResponseBodyEntities();
            return TeaModel.build(map, self);
        }

        public QueryEntitiesResponseBodyEntities setMembers(java.util.List<QueryEntitiesResponseBodyEntitiesMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<QueryEntitiesResponseBodyEntitiesMembers> getMembers() {
            return this.members;
        }

        public QueryEntitiesResponseBodyEntities setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public QueryEntitiesResponseBodyEntities setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public QueryEntitiesResponseBodyEntities setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public QueryEntitiesResponseBodyEntities setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public QueryEntitiesResponseBodyEntities setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryEntitiesResponseBodyEntities setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

        public QueryEntitiesResponseBodyEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public QueryEntitiesResponseBodyEntities setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public QueryEntitiesResponseBodyEntities setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public QueryEntitiesResponseBodyEntities setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}

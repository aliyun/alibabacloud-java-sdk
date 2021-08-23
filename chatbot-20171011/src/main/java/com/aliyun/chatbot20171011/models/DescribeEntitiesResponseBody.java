// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeEntitiesResponseBody extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ModifyUserId")
    public String modifyUserId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Regex")
    public String regex;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("Members")
    public java.util.List<DescribeEntitiesResponseBodyMembers> members;

    public static DescribeEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEntitiesResponseBody self = new DescribeEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEntitiesResponseBody setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DescribeEntitiesResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DescribeEntitiesResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeEntitiesResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEntitiesResponseBody setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public DescribeEntitiesResponseBody setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public DescribeEntitiesResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeEntitiesResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeEntitiesResponseBody setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public DescribeEntitiesResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeEntitiesResponseBody setMembers(java.util.List<DescribeEntitiesResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<DescribeEntitiesResponseBodyMembers> getMembers() {
        return this.members;
    }

    public static class DescribeEntitiesResponseBodyMembers extends TeaModel {
        @NameInMap("Synonyms")
        public java.util.List<String> synonyms;

        @NameInMap("MemberName")
        public String memberName;

        public static DescribeEntitiesResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            DescribeEntitiesResponseBodyMembers self = new DescribeEntitiesResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public DescribeEntitiesResponseBodyMembers setSynonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

        public DescribeEntitiesResponseBodyMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

    }

}

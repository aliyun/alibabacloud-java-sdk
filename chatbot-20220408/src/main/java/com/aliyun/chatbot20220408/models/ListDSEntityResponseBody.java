// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDSEntityResponseBody extends TeaModel {
    @NameInMap("Entities")
    public java.util.List<ListDSEntityResponseBodyEntities> entities;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDSEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSEntityResponseBody self = new ListDSEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSEntityResponseBody setEntities(java.util.List<ListDSEntityResponseBodyEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<ListDSEntityResponseBodyEntities> getEntities() {
        return this.entities;
    }

    public ListDSEntityResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDSEntityResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDSEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSEntityResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDSEntityResponseBodyEntities extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("EntityId")
        public Long entityId;

        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        // 系统实体code，如@sys.date
        @NameInMap("SysEntityCode")
        public String sysEntityCode;

        public static ListDSEntityResponseBodyEntities build(java.util.Map<String, ?> map) throws Exception {
            ListDSEntityResponseBodyEntities self = new ListDSEntityResponseBodyEntities();
            return TeaModel.build(map, self);
        }

        public ListDSEntityResponseBodyEntities setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDSEntityResponseBodyEntities setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListDSEntityResponseBodyEntities setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListDSEntityResponseBodyEntities setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public ListDSEntityResponseBodyEntities setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public ListDSEntityResponseBodyEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListDSEntityResponseBodyEntities setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListDSEntityResponseBodyEntities setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListDSEntityResponseBodyEntities setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public ListDSEntityResponseBodyEntities setSysEntityCode(String sysEntityCode) {
            this.sysEntityCode = sysEntityCode;
            return this;
        }
        public String getSysEntityCode() {
            return this.sysEntityCode;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDSEntityResponseBody extends TeaModel {
    @NameInMap("Entities")
    public java.util.List<ListDSEntityResponseBodyEntities> entities;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>ga4h345defgwet2sdf223</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>123231</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <strong>example:</strong>
         * <p>234564567445</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        @NameInMap("EntityName")
        public String entityName;

        /**
         * <strong>example:</strong>
         * <p>synonyms</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>123231</p>
         */
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

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

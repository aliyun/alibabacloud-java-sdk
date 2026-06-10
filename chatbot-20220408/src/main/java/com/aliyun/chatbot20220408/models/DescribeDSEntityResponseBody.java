// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeDSEntityResponseBody extends TeaModel {
    /**
     * <p>The time when the entity was created, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-12T16:00:01Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the user who created the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>123231</p>
     */
    @NameInMap("CreateUserId")
    public String createUserId;

    /**
     * <p>The name of the user who created the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <p>The entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The entity name. The name can contain only Chinese characters, letters, digits, and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>书类型</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The entity type. Valid values are <code>synonyms</code> and <code>regex</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>synonyms</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The time when the entity was last modified, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-12T16:00:01Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The ID of the user who last modified the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>123231</p>
     */
    @NameInMap("ModifyUserId")
    public String modifyUserId;

    /**
     * <p>The name of the user who last modified the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ad23234dsf234fga</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The code of the system entity, such as sys.date. This parameter is empty for user-defined entities.</p>
     * 
     * <strong>example:</strong>
     * <p>sys.date</p>
     */
    @NameInMap("SysEntityCode")
    public String sysEntityCode;

    public static DescribeDSEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSEntityResponseBody self = new DescribeDSEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDSEntityResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDSEntityResponseBody setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public DescribeDSEntityResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeDSEntityResponseBody setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DescribeDSEntityResponseBody setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public DescribeDSEntityResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DescribeDSEntityResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeDSEntityResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeDSEntityResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeDSEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDSEntityResponseBody setSysEntityCode(String sysEntityCode) {
        this.sysEntityCode = sysEntityCode;
        return this;
    }
    public String getSysEntityCode() {
        return this.sysEntityCode;
    }

}

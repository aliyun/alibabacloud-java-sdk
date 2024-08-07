// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeDSEntityResponseBody extends TeaModel {
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
     * <p>123</p>
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

    /**
     * <strong>example:</strong>
     * <p>ad23234dsf234fga</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

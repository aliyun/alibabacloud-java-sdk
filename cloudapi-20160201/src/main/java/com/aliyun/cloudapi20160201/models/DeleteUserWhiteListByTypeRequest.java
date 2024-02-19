// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteUserWhiteListByTypeRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public Long uid;

    public static DeleteUserWhiteListByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserWhiteListByTypeRequest self = new DeleteUserWhiteListByTypeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserWhiteListByTypeRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public DeleteUserWhiteListByTypeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteUserWhiteListByTypeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteUserWhiteListByTypeRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowEditLockResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OwnerId")
    public String ownerId;

    public static CreateFlowEditLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowEditLockResponseBody self = new CreateFlowEditLockResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowEditLockResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateFlowEditLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowEditLockResponseBody setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateFlowEditLockResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateFlowEditLockResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateFlowEditLockResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}

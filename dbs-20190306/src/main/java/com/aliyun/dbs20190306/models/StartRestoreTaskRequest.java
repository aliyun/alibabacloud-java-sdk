// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StartRestoreTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RestoreTaskId")
    public String restoreTaskId;

    public static StartRestoreTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRestoreTaskRequest self = new StartRestoreTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartRestoreTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartRestoreTaskRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public StartRestoreTaskRequest setRestoreTaskId(String restoreTaskId) {
        this.restoreTaskId = restoreTaskId;
        return this;
    }
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

}

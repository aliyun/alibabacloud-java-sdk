// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RevokeMpsMessageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("TargetId")
    public String targetId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RevokeMpsMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeMpsMessageRequest self = new RevokeMpsMessageRequest();
        return TeaModel.build(map, self);
    }

    public RevokeMpsMessageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RevokeMpsMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public RevokeMpsMessageRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public RevokeMpsMessageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

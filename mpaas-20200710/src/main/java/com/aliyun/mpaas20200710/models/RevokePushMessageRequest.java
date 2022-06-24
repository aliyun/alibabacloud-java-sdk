// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class RevokePushMessageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("TargetId")
    public String targetId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RevokePushMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokePushMessageRequest self = new RevokePushMessageRequest();
        return TeaModel.build(map, self);
    }

    public RevokePushMessageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RevokePushMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public RevokePushMessageRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public RevokePushMessageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

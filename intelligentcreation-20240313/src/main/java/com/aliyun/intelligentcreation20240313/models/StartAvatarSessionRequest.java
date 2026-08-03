// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StartAvatarSessionRequest extends TeaModel {
    @NameInMap("channelToken")
    public String channelToken;

    @NameInMap("customPushUrl")
    public String customPushUrl;

    @NameInMap("customUserId")
    public String customUserId;

    @NameInMap("projectId")
    public String projectId;

    @NameInMap("requestId")
    public String requestId;

    public static StartAvatarSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAvatarSessionRequest self = new StartAvatarSessionRequest();
        return TeaModel.build(map, self);
    }

    public StartAvatarSessionRequest setChannelToken(String channelToken) {
        this.channelToken = channelToken;
        return this;
    }
    public String getChannelToken() {
        return this.channelToken;
    }

    public StartAvatarSessionRequest setCustomPushUrl(String customPushUrl) {
        this.customPushUrl = customPushUrl;
        return this;
    }
    public String getCustomPushUrl() {
        return this.customPushUrl;
    }

    public StartAvatarSessionRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public StartAvatarSessionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StartAvatarSessionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

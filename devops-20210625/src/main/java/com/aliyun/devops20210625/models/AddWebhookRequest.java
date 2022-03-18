// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddWebhookRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    // webhook描述
    @NameInMap("description")
    public String description;

    // 使用ssl认证
    @NameInMap("enableSslVerification")
    public Boolean enableSslVerification;

    // 合并请求事件
    @NameInMap("mergeRequestsEvents")
    public Boolean mergeRequestsEvents;

    // 评论事件
    @NameInMap("noteEvents")
    public Boolean noteEvents;

    // 分支推送事件
    @NameInMap("pushEvents")
    public Boolean pushEvents;

    @NameInMap("secretToken")
    public String secretToken;

    // 标签推送事件
    @NameInMap("tagPushEvents")
    public Boolean tagPushEvents;

    // hook url
    @NameInMap("url")
    public String url;

    public static AddWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWebhookRequest self = new AddWebhookRequest();
        return TeaModel.build(map, self);
    }

    public AddWebhookRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public AddWebhookRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public AddWebhookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddWebhookRequest setEnableSslVerification(Boolean enableSslVerification) {
        this.enableSslVerification = enableSslVerification;
        return this;
    }
    public Boolean getEnableSslVerification() {
        return this.enableSslVerification;
    }

    public AddWebhookRequest setMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
        return this;
    }
    public Boolean getMergeRequestsEvents() {
        return this.mergeRequestsEvents;
    }

    public AddWebhookRequest setNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
        return this;
    }
    public Boolean getNoteEvents() {
        return this.noteEvents;
    }

    public AddWebhookRequest setPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
        return this;
    }
    public Boolean getPushEvents() {
        return this.pushEvents;
    }

    public AddWebhookRequest setSecretToken(String secretToken) {
        this.secretToken = secretToken;
        return this;
    }
    public String getSecretToken() {
        return this.secretToken;
    }

    public AddWebhookRequest setTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
        return this;
    }
    public Boolean getTagPushEvents() {
        return this.tagPushEvents;
    }

    public AddWebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}

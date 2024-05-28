// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddWebhookRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("description")
    public String description;

    @NameInMap("enableSslVerification")
    public Boolean enableSslVerification;

    @NameInMap("mergeRequestsEvents")
    public Boolean mergeRequestsEvents;

    @NameInMap("noteEvents")
    public Boolean noteEvents;

    @NameInMap("pushEvents")
    public Boolean pushEvents;

    @NameInMap("secretToken")
    public String secretToken;

    @NameInMap("tagPushEvents")
    public Boolean tagPushEvents;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

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

    public AddWebhookRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DelayPublishOsVersionRequest extends TeaModel {
    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PrepubTime")
    public Long prepubTime;

    @NameInMap("PublishTime")
    public Long publishTime;

    @NameInMap("DownTime")
    public Long downTime;

    @NameInMap("Email")
    public String email;

    @NameInMap("Description")
    public String description;

    @NameInMap("SendMessage")
    public String sendMessage;

    @NameInMap("PrepublishCount")
    public String prepublishCount;

    public static DelayPublishOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DelayPublishOsVersionRequest self = new DelayPublishOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public DelayPublishOsVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DelayPublishOsVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DelayPublishOsVersionRequest setPrepubTime(Long prepubTime) {
        this.prepubTime = prepubTime;
        return this;
    }
    public Long getPrepubTime() {
        return this.prepubTime;
    }

    public DelayPublishOsVersionRequest setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public DelayPublishOsVersionRequest setDownTime(Long downTime) {
        this.downTime = downTime;
        return this;
    }
    public Long getDownTime() {
        return this.downTime;
    }

    public DelayPublishOsVersionRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public DelayPublishOsVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DelayPublishOsVersionRequest setSendMessage(String sendMessage) {
        this.sendMessage = sendMessage;
        return this;
    }
    public String getSendMessage() {
        return this.sendMessage;
    }

    public DelayPublishOsVersionRequest setPrepublishCount(String prepublishCount) {
        this.prepublishCount = prepublishCount;
        return this;
    }
    public String getPrepublishCount() {
        return this.prepublishCount;
    }

}

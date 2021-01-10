// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishOsVersionRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("SendMessage")
    public Boolean sendMessage;

    public static PublishOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishOsVersionRequest self = new PublishOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishOsVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PublishOsVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public PublishOsVersionRequest setSendMessage(Boolean sendMessage) {
        this.sendMessage = sendMessage;
        return this;
    }
    public Boolean getSendMessage() {
        return this.sendMessage;
    }

}

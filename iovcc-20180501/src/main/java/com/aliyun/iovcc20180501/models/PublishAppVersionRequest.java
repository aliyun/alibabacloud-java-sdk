// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishAppVersionRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("SendMessage")
    public Boolean sendMessage;

    public static PublishAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAppVersionRequest self = new PublishAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishAppVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PublishAppVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public PublishAppVersionRequest setSendMessage(Boolean sendMessage) {
        this.sendMessage = sendMessage;
        return this;
    }
    public Boolean getSendMessage() {
        return this.sendMessage;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreatePublishRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("PublishType")
    public String publishType;

    @NameInMap("Source")
    public String source;

    @NameInMap("VersionNumber")
    public String versionNumber;

    public static CreatePublishRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishRequest self = new CreatePublishRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreatePublishRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePublishRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public CreatePublishRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePublishRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreatePublishRequest setPublishType(String publishType) {
        this.publishType = publishType;
        return this;
    }
    public String getPublishType() {
        return this.publishType;
    }

    public CreatePublishRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreatePublishRequest setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }
    public String getVersionNumber() {
        return this.versionNumber;
    }

}

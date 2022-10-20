// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileCompressionTaskRequest extends TeaModel {
    @NameInMap("CompressedFormat")
    public String compressedFormat;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("ManifestURI")
    public String manifestURI;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Password")
    public String password;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sources")
    public java.util.List<CreateFileCompressionTaskRequestSources> sources;

    @NameInMap("TargetURI")
    public String targetURI;

    @NameInMap("UserData")
    public String userData;

    public static CreateFileCompressionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileCompressionTaskRequest self = new CreateFileCompressionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileCompressionTaskRequest setCompressedFormat(String compressedFormat) {
        this.compressedFormat = compressedFormat;
        return this;
    }
    public String getCompressedFormat() {
        return this.compressedFormat;
    }

    public CreateFileCompressionTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateFileCompressionTaskRequest setManifestURI(String manifestURI) {
        this.manifestURI = manifestURI;
        return this;
    }
    public String getManifestURI() {
        return this.manifestURI;
    }

    public CreateFileCompressionTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateFileCompressionTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateFileCompressionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFileCompressionTaskRequest setSources(java.util.List<CreateFileCompressionTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateFileCompressionTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateFileCompressionTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateFileCompressionTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateFileCompressionTaskRequestSources extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("URI")
        public String URI;

        public static CreateFileCompressionTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateFileCompressionTaskRequestSources self = new CreateFileCompressionTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateFileCompressionTaskRequestSources setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public CreateFileCompressionTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileCompressionTaskRequest extends TeaModel {
    @NameInMap("CompressedFormat")
    public String compressedFormat;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceManifestURI")
    public String sourceManifestURI;

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

    public CreateFileCompressionTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateFileCompressionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFileCompressionTaskRequest setSourceManifestURI(String sourceManifestURI) {
        this.sourceManifestURI = sourceManifestURI;
        return this;
    }
    public String getSourceManifestURI() {
        return this.sourceManifestURI;
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

        @NameInMap("Mode")
        public String mode;

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

        public CreateFileCompressionTaskRequestSources setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
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

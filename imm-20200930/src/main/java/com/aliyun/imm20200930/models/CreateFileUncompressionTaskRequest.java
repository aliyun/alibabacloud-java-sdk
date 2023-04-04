// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileUncompressionTaskRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("Password")
    public String password;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SelectedFiles")
    public java.util.List<String> selectedFiles;

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Target")
    public CreateFileUncompressionTaskRequestTarget target;

    @NameInMap("UserData")
    public String userData;

    public static CreateFileUncompressionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileUncompressionTaskRequest self = new CreateFileUncompressionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileUncompressionTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateFileUncompressionTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateFileUncompressionTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateFileUncompressionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFileUncompressionTaskRequest setSelectedFiles(java.util.List<String> selectedFiles) {
        this.selectedFiles = selectedFiles;
        return this;
    }
    public java.util.List<String> getSelectedFiles() {
        return this.selectedFiles;
    }

    public CreateFileUncompressionTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateFileUncompressionTaskRequest setTarget(CreateFileUncompressionTaskRequestTarget target) {
        this.target = target;
        return this;
    }
    public CreateFileUncompressionTaskRequestTarget getTarget() {
        return this.target;
    }

    public CreateFileUncompressionTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateFileUncompressionTaskRequestTarget extends TeaModel {
        @NameInMap("ManifestURI")
        public String manifestURI;

        @NameInMap("URI")
        public String URI;

        public static CreateFileUncompressionTaskRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateFileUncompressionTaskRequestTarget self = new CreateFileUncompressionTaskRequestTarget();
            return TeaModel.build(map, self);
        }

        public CreateFileUncompressionTaskRequestTarget setManifestURI(String manifestURI) {
            this.manifestURI = manifestURI;
            return this;
        }
        public String getManifestURI() {
            return this.manifestURI;
        }

        public CreateFileUncompressionTaskRequestTarget setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}

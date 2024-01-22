// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ExtractDocumentTextRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("SourceURI")
    public String sourceURI;

    public static ExtractDocumentTextRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractDocumentTextRequest self = new ExtractDocumentTextRequest();
        return TeaModel.build(map, self);
    }

    public ExtractDocumentTextRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public ExtractDocumentTextRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ExtractDocumentTextRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ExtractDocumentTextRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

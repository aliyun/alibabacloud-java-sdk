// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageBodiesRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sensitivity")
    public Float sensitivity;

    // SourceURI
    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectImageBodiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBodiesRequest self = new DetectImageBodiesRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageBodiesRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public DetectImageBodiesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageBodiesRequest setSensitivity(Float sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public Float getSensitivity() {
        return this.sensitivity;
    }

    public DetectImageBodiesRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

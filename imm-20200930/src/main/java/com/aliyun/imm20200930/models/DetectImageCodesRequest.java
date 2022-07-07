// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCodesRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // SourceURI
    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectImageCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCodesRequest self = new DetectImageCodesRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageCodesRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public DetectImageCodesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageCodesRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

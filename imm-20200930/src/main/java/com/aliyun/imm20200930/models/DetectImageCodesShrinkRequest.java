// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCodesShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectImageCodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCodesShrinkRequest self = new DetectImageCodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageCodesShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public DetectImageCodesShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageCodesShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

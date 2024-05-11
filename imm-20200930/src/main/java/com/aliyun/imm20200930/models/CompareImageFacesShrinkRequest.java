// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CompareImageFacesShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Source")
    public String sourceShrink;

    public static CompareImageFacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareImageFacesShrinkRequest self = new CompareImageFacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CompareImageFacesShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CompareImageFacesShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CompareImageFacesShrinkRequest setSourceShrink(String sourceShrink) {
        this.sourceShrink = sourceShrink;
        return this;
    }
    public String getSourceShrink() {
        return this.sourceShrink;
    }

}

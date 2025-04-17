// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CompareImageFacesShrinkRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The URLs of the two images for compression.</p>
     */
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

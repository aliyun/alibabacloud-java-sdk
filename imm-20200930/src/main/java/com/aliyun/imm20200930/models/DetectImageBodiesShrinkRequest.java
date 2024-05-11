// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageBodiesShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sensitivity")
    public Float sensitivity;

    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectImageBodiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBodiesShrinkRequest self = new DetectImageBodiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageBodiesShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public DetectImageBodiesShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageBodiesShrinkRequest setSensitivity(Float sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public Float getSensitivity() {
        return this.sensitivity;
    }

    public DetectImageBodiesShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

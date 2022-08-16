// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCroppingShrinkRequest extends TeaModel {
    @NameInMap("AspectRatios")
    public String aspectRatios;

    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectImageCroppingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCroppingShrinkRequest self = new DetectImageCroppingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageCroppingShrinkRequest setAspectRatios(String aspectRatios) {
        this.aspectRatios = aspectRatios;
        return this;
    }
    public String getAspectRatios() {
        return this.aspectRatios;
    }

    public DetectImageCroppingShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public DetectImageCroppingShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageCroppingShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

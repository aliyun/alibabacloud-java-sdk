// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageBodiesShrinkRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The accuracy level of detecting and recognizing specific content in the image. Valid values: 0 to 1. Default value: 0.6. A higher sensitivity specifies that more image details can be detected.</p>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Sensitivity")
    public Float sensitivity;

    /**
     * <p>The URI of the Object Storage Service (OSS) bucket in which the image file is stored.</p>
     * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the file that has an extension.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
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

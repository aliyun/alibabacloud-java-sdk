// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageLabelsShrinkRequest extends TeaModel {
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
     * <p>immimagetest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The URI of the Object Storage Service (OSS) bucket in which you store the image.</p>
     * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the image file that has an extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/facetest.jpg</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The threshold of the label confidence. Labels whose confidence is lower than the specified threshold are not returned in the response. Valid values: 0 to 1. If you leave this parameter empty, the algorithm provides a default threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static DetectImageLabelsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageLabelsShrinkRequest self = new DetectImageLabelsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageLabelsShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public DetectImageLabelsShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageLabelsShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public DetectImageLabelsShrinkRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}

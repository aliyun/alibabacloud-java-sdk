// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCroppingShrinkRequest extends TeaModel {
    /**
     * <p>The cropping ratios. You can specify up to five cropping ratios. Take note of the following requirements:</p>
     * <ul>
     * <li>The ratio must be an integer between 0 and 20.</li>
     * <li>The ratio must range from 0.5 to 2.</li>
     * <li>If you leave this parameter empty, the default processing logic is <code>[&quot;auto&quot;]</code>.</li>
     * </ul>
     * <blockquote>
     * <p> Errors are reported in one of the following cases:\
     * You specify more than five cropping ratios.\
     * You pass an empty list to the system.\
     * You specify a ratio that is not an integer, such as <code>4.1:3</code>.\
     * The ratio is beyond the range of 0.5 to 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1:1&quot;]</p>
     */
    @NameInMap("AspectRatios")
    public String aspectRatios;

    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The name of the project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The URI of the Object Storage Service (OSS) bucket in which you store the image.</p>
     * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the image file that has an extension.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/facetest.jpg</p>
     */
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

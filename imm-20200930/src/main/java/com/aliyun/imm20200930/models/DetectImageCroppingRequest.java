// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCroppingRequest extends TeaModel {
    /**
     * <p>The list of cropping aspect ratios. You can specify up to 5 ratios. Each ratio must meet the following requirements:</p>
     * <ul>
     * <li><p>The ratio must consist of integers in the range of (0, 20).</p>
     * </li>
     * <li><p>The ratio value must be in the range of [0.5, 2].</p>
     * </li>
     * <li><p>If you do not specify this parameter, the default value <code>[&quot;auto&quot;]</code> is used.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The following cases cause an error:<br>- More than 5 ratios are specified.<br>- An empty list is passed.<br>- The ratio contains non-integer values, such as <code>4.1:3</code>.<br>- The ratio value is less than 0.5 or greater than 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1:1&quot;]</p>
     */
    @NameInMap("AspectRatios")
    public String aspectRatios;

    /**
     * <p><strong>Leave this parameter empty unless otherwise required.</strong></p>
     * <p>The China authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The list of semantic text descriptions for objects that you want the cropping result to include. Each element is free-form text, such as &quot;signboard&quot; or &quot;dish&quot;.</p>
     * <blockquote>
     * <p>Usage limits of the InclusionHints parameter:
     * <br>- You can pass in up to 1 hint in the array to specify the type of object to include in the cropping result, such as &quot;signboard&quot;.
     * <br>- The algorithm detects all objects in the image that match the hint and generates cropping regions that include as many matched objects as possible.
     * <br>- Each cropping region includes up to 10 matched objects. If more than 10 objects match in the image, the cropping region includes up to 10 of them.
     * <br>- You can use the MatchedInclusionHints response field to determine whether the hint was successfully matched.
     * <br>- This parameter is supported only in regions in the Chinese mainland.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sign&quot;]</p>
     */
    @NameInMap("InclusionHints")
    public java.util.List<String> inclusionHints;

    /**
     * <p>The project name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The OSS URI of the image.</p>
     * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where <code>${Bucket}</code> is the name of an OSS bucket in the same region as the current project, and <code>${Object}</code> is the full path of the file including the file name extension.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/facetest.jpg</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectImageCroppingRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCroppingRequest self = new DetectImageCroppingRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageCroppingRequest setAspectRatios(String aspectRatios) {
        this.aspectRatios = aspectRatios;
        return this;
    }
    public String getAspectRatios() {
        return this.aspectRatios;
    }

    public DetectImageCroppingRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public DetectImageCroppingRequest setInclusionHints(java.util.List<String> inclusionHints) {
        this.inclusionHints = inclusionHints;
        return this;
    }
    public java.util.List<String> getInclusionHints() {
        return this.inclusionHints;
    }

    public DetectImageCroppingRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageCroppingRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageTextsShrinkRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this field empty.</strong></p>
     * <p>The configurations of authorization chains. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
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
     * <p>The Object Storage Service (OSS) URI of the file.</p>
     * <p>Specify the URI in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of an OSS bucket that is in the same region as the current project. ${Object} specifies the path of the object with the extension included.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.jpg</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectImageTextsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageTextsShrinkRequest self = new DetectImageTextsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageTextsShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public DetectImageTextsShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageTextsShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

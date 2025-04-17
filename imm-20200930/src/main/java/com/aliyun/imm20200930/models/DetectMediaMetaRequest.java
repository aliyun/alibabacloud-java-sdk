// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectMediaMetaRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The URI of the media object in Object Storage Service (OSS).</p>
     * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/sampleobject.mp4</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectMediaMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectMediaMetaRequest self = new DetectMediaMetaRequest();
        return TeaModel.build(map, self);
    }

    public DetectMediaMetaRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public DetectMediaMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectMediaMetaRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

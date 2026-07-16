// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectMediaMetaRequest extends TeaModel {
    /**
     * <p><strong>Leave this parameter empty unless you have special requirements.</strong></p>
     * <p>The chain authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chain authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The Object Storage Service (OSS) URI of the media file.</p>
     * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where <code>${Bucket}</code> is the name of an OSS bucket in the same region as the current project, and <code>${Object}</code> is the full path of the file including the file name extension.</p>
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

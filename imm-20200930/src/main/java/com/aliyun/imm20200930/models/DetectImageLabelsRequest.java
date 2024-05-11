// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageLabelsRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Threshold")
    public Float threshold;

    public static DetectImageLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageLabelsRequest self = new DetectImageLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageLabelsRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public DetectImageLabelsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageLabelsRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public DetectImageLabelsRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}

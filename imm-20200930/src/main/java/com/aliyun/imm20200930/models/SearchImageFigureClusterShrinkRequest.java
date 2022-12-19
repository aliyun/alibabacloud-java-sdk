// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SearchImageFigureClusterShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceURI")
    public String sourceURI;

    public static SearchImageFigureClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageFigureClusterShrinkRequest self = new SearchImageFigureClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageFigureClusterShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public SearchImageFigureClusterShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SearchImageFigureClusterShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SearchImageFigureClusterShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

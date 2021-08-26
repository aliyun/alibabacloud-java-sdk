// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBindingRequest extends TeaModel {
    // ProjectName
    @NameInMap("ProjectName")
    public String projectName;

    // DatasetName
    @NameInMap("DatasetName")
    public String datasetName;

    // URI
    @NameInMap("URI")
    public String URI;

    public static CreateBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingRequest self = new CreateBindingRequest();
        return TeaModel.build(map, self);
    }

    public CreateBindingRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateBindingRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateBindingRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}

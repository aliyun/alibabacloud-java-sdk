// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ImportExperimentFromMkRequest extends TeaModel {
    @NameInMap("Definition")
    public String definition;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("ImportUserId")
    public String importUserId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static ImportExperimentFromMkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportExperimentFromMkRequest self = new ImportExperimentFromMkRequest();
        return TeaModel.build(map, self);
    }

    public ImportExperimentFromMkRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public ImportExperimentFromMkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportExperimentFromMkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportExperimentFromMkRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public ImportExperimentFromMkRequest setImportUserId(String importUserId) {
        this.importUserId = importUserId;
        return this;
    }
    public String getImportUserId() {
        return this.importUserId;
    }

    public ImportExperimentFromMkRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class UpdateExperimentBasicInfoRequest extends TeaModel {
    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static UpdateExperimentBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentBasicInfoRequest self = new UpdateExperimentBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentBasicInfoRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public UpdateExperimentBasicInfoRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public UpdateExperimentBasicInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateExperimentBasicInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateExperimentBasicInfoRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateExperimentBasicInfoRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}

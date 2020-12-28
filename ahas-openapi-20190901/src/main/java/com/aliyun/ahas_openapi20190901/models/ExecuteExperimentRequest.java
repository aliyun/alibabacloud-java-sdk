// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ExecuteExperimentRequest extends TeaModel {
    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static ExecuteExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteExperimentRequest self = new ExecuteExperimentRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteExperimentRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public ExecuteExperimentRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public ExecuteExperimentRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public ExecuteExperimentRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class FinishExperimentTaskRequest extends TeaModel {
    @NameInMap("ExperimentTaskId")
    public String experimentTaskId;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static FinishExperimentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishExperimentTaskRequest self = new FinishExperimentTaskRequest();
        return TeaModel.build(map, self);
    }

    public FinishExperimentTaskRequest setExperimentTaskId(String experimentTaskId) {
        this.experimentTaskId = experimentTaskId;
        return this;
    }
    public String getExperimentTaskId() {
        return this.experimentTaskId;
    }

    public FinishExperimentTaskRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public FinishExperimentTaskRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}

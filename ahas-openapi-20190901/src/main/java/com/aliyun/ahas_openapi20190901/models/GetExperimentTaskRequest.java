// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetExperimentTaskRequest extends TeaModel {
    @NameInMap("ExperimentTaskId")
    public String experimentTaskId;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static GetExperimentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentTaskRequest self = new GetExperimentTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentTaskRequest setExperimentTaskId(String experimentTaskId) {
        this.experimentTaskId = experimentTaskId;
        return this;
    }
    public String getExperimentTaskId() {
        return this.experimentTaskId;
    }

    public GetExperimentTaskRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetExperimentTaskRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}

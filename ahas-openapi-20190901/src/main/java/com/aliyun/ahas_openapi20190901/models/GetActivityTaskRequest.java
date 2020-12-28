// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetActivityTaskRequest extends TeaModel {
    @NameInMap("ExperimentTaskId")
    public String experimentTaskId;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("ActivityTaskId")
    public String activityTaskId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static GetActivityTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetActivityTaskRequest self = new GetActivityTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetActivityTaskRequest setExperimentTaskId(String experimentTaskId) {
        this.experimentTaskId = experimentTaskId;
        return this;
    }
    public String getExperimentTaskId() {
        return this.experimentTaskId;
    }

    public GetActivityTaskRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetActivityTaskRequest setActivityTaskId(String activityTaskId) {
        this.activityTaskId = activityTaskId;
        return this;
    }
    public String getActivityTaskId() {
        return this.activityTaskId;
    }

    public GetActivityTaskRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}

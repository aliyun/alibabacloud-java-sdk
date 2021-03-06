// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotKnowledgeStatDataRequest extends TeaModel {
    @NameInMap("CubeId")
    public String cubeId;

    @NameInMap("Measures")
    public String measures;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    public static GetBotKnowledgeStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBotKnowledgeStatDataRequest self = new GetBotKnowledgeStatDataRequest();
        return TeaModel.build(map, self);
    }

    public GetBotKnowledgeStatDataRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public GetBotKnowledgeStatDataRequest setMeasures(String measures) {
        this.measures = measures;
        return this;
    }
    public String getMeasures() {
        return this.measures;
    }

    public GetBotKnowledgeStatDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetBotKnowledgeStatDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetBotKnowledgeStatDataRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

}

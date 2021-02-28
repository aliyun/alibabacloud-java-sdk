// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotSessionDataRequest extends TeaModel {
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

    public static GetBotSessionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBotSessionDataRequest self = new GetBotSessionDataRequest();
        return TeaModel.build(map, self);
    }

    public GetBotSessionDataRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public GetBotSessionDataRequest setMeasures(String measures) {
        this.measures = measures;
        return this;
    }
    public String getMeasures() {
        return this.measures;
    }

    public GetBotSessionDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetBotSessionDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetBotSessionDataRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotChatDataRequest extends TeaModel {
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

    public static GetBotChatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBotChatDataRequest self = new GetBotChatDataRequest();
        return TeaModel.build(map, self);
    }

    public GetBotChatDataRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public GetBotChatDataRequest setMeasures(String measures) {
        this.measures = measures;
        return this;
    }
    public String getMeasures() {
        return this.measures;
    }

    public GetBotChatDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetBotChatDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetBotChatDataRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

}

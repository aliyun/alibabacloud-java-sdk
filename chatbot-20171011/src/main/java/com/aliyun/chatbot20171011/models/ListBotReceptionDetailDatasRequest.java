// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotReceptionDetailDatasRequest extends TeaModel {
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

    @NameInMap("Dimensions")
    public String dimensions;

    public static ListBotReceptionDetailDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBotReceptionDetailDatasRequest self = new ListBotReceptionDetailDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListBotReceptionDetailDatasRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public ListBotReceptionDetailDatasRequest setMeasures(String measures) {
        this.measures = measures;
        return this;
    }
    public String getMeasures() {
        return this.measures;
    }

    public ListBotReceptionDetailDatasRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListBotReceptionDetailDatasRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBotReceptionDetailDatasRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public ListBotReceptionDetailDatasRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

}

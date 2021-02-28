// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotColdKnowledgesRequest extends TeaModel {
    @NameInMap("CubeId")
    public String cubeId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("Filters")
    public String filters;

    @NameInMap("Limit")
    public Integer limit;

    public static ListBotColdKnowledgesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBotColdKnowledgesRequest self = new ListBotColdKnowledgesRequest();
        return TeaModel.build(map, self);
    }

    public ListBotColdKnowledgesRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public ListBotColdKnowledgesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListBotColdKnowledgesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBotColdKnowledgesRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public ListBotColdKnowledgesRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public ListBotColdKnowledgesRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListBotColdKnowledgesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}

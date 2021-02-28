// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotHotKnowledgesRequest extends TeaModel {
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

    @NameInMap("Orders")
    public String orders;

    @NameInMap("Measures")
    public String measures;

    @NameInMap("Filters")
    public String filters;

    @NameInMap("Limit")
    public Integer limit;

    public static ListBotHotKnowledgesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBotHotKnowledgesRequest self = new ListBotHotKnowledgesRequest();
        return TeaModel.build(map, self);
    }

    public ListBotHotKnowledgesRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public ListBotHotKnowledgesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListBotHotKnowledgesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBotHotKnowledgesRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public ListBotHotKnowledgesRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public ListBotHotKnowledgesRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public ListBotHotKnowledgesRequest setMeasures(String measures) {
        this.measures = measures;
        return this;
    }
    public String getMeasures() {
        return this.measures;
    }

    public ListBotHotKnowledgesRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListBotHotKnowledgesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}

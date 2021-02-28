// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotChatHistorysRequest extends TeaModel {
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

    @NameInMap("IsDetail")
    public Boolean isDetail;

    @NameInMap("Orders")
    public String orders;

    @NameInMap("Limit")
    public Integer limit;

    public static ListBotChatHistorysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBotChatHistorysRequest self = new ListBotChatHistorysRequest();
        return TeaModel.build(map, self);
    }

    public ListBotChatHistorysRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public ListBotChatHistorysRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListBotChatHistorysRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBotChatHistorysRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public ListBotChatHistorysRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public ListBotChatHistorysRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    public ListBotChatHistorysRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public ListBotChatHistorysRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}

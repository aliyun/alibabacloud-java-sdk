// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QueryDataMessageStatisticsRequest extends TeaModel {
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("CmdType")
    public String cmdType;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("ItemType")
    public String itemType;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("BhvType")
    public String bhvType;

    @NameInMap("MessageSource")
    public String messageSource;

    public static QueryDataMessageStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataMessageStatisticsRequest self = new QueryDataMessageStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataMessageStatisticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryDataMessageStatisticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDataMessageStatisticsRequest setCmdType(String cmdType) {
        this.cmdType = cmdType;
        return this;
    }
    public String getCmdType() {
        return this.cmdType;
    }

    public QueryDataMessageStatisticsRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryDataMessageStatisticsRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public QueryDataMessageStatisticsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDataMessageStatisticsRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public QueryDataMessageStatisticsRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryDataMessageStatisticsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryDataMessageStatisticsRequest setBhvType(String bhvType) {
        this.bhvType = bhvType;
        return this;
    }
    public String getBhvType() {
        return this.bhvType;
    }

    public QueryDataMessageStatisticsRequest setMessageSource(String messageSource) {
        this.messageSource = messageSource;
        return this;
    }
    public String getMessageSource() {
        return this.messageSource;
    }

}

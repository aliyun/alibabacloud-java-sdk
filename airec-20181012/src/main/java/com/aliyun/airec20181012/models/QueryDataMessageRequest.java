// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QueryDataMessageRequest extends TeaModel {
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

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("BhvType")
    public String bhvType;

    @NameInMap("MessageSource")
    public String messageSource;

    public static QueryDataMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataMessageRequest self = new QueryDataMessageRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataMessageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryDataMessageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDataMessageRequest setCmdType(String cmdType) {
        this.cmdType = cmdType;
        return this;
    }
    public String getCmdType() {
        return this.cmdType;
    }

    public QueryDataMessageRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryDataMessageRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public QueryDataMessageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDataMessageRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public QueryDataMessageRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDataMessageRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public QueryDataMessageRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryDataMessageRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryDataMessageRequest setBhvType(String bhvType) {
        this.bhvType = bhvType;
        return this;
    }
    public String getBhvType() {
        return this.bhvType;
    }

    public QueryDataMessageRequest setMessageSource(String messageSource) {
        this.messageSource = messageSource;
        return this;
    }
    public String getMessageSource() {
        return this.messageSource;
    }

}

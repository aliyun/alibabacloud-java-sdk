// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardEventsRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("BoardId")
    @Validation(required = true)
    public String boardId;

    public static DescribeBoardEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardEventsRequest self = new DescribeBoardEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBoardEventsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeBoardEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeBoardEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeBoardEventsRequest setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

}

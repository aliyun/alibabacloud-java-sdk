// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportLiveStateRequest extends TeaModel {
    @NameInMap("AnchorId")
    public String anchorId;

    @NameInMap("Id")
    public String id;

    @NameInMap("LiveMode")
    public String liveMode;

    @NameInMap("LiveState")
    public String liveState;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Type")
    public String type;

    public static ReportLiveStateRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportLiveStateRequest self = new ReportLiveStateRequest();
        return TeaModel.build(map, self);
    }

    public ReportLiveStateRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public ReportLiveStateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReportLiveStateRequest setLiveMode(String liveMode) {
        this.liveMode = liveMode;
        return this;
    }
    public String getLiveMode() {
        return this.liveMode;
    }

    public ReportLiveStateRequest setLiveState(String liveState) {
        this.liveState = liveState;
        return this;
    }
    public String getLiveState() {
        return this.liveState;
    }

    public ReportLiveStateRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ReportLiveStateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

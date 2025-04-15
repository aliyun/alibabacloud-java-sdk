// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvRecommendSubTaskModel extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ScanQueriesCount")
    public Long scanQueriesCount;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubQueriesCount")
    public Long subQueriesCount;

    @NameInMap("SubtaskId")
    public Long subtaskId;

    public static OpenStructMvRecommendSubTaskModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructMvRecommendSubTaskModel self = new OpenStructMvRecommendSubTaskModel();
        return TeaModel.build(map, self);
    }

    public OpenStructMvRecommendSubTaskModel setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public OpenStructMvRecommendSubTaskModel setScanQueriesCount(Long scanQueriesCount) {
        this.scanQueriesCount = scanQueriesCount;
        return this;
    }
    public Long getScanQueriesCount() {
        return this.scanQueriesCount;
    }

    public OpenStructMvRecommendSubTaskModel setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public OpenStructMvRecommendSubTaskModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OpenStructMvRecommendSubTaskModel setSubQueriesCount(Long subQueriesCount) {
        this.subQueriesCount = subQueriesCount;
        return this;
    }
    public Long getSubQueriesCount() {
        return this.subQueriesCount;
    }

    public OpenStructMvRecommendSubTaskModel setSubtaskId(Long subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }
    public Long getSubtaskId() {
        return this.subtaskId;
    }

}

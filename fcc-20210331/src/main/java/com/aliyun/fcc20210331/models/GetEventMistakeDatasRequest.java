// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEventMistakeDatasRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("CameraNames")
    public String cameraNames;

    @NameInMap("EventNames")
    public String eventNames;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    public static GetEventMistakeDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventMistakeDatasRequest self = new GetEventMistakeDatasRequest();
        return TeaModel.build(map, self);
    }

    public GetEventMistakeDatasRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetEventMistakeDatasRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetEventMistakeDatasRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetEventMistakeDatasRequest setCameraNames(String cameraNames) {
        this.cameraNames = cameraNames;
        return this;
    }
    public String getCameraNames() {
        return this.cameraNames;
    }

    public GetEventMistakeDatasRequest setEventNames(String eventNames) {
        this.eventNames = eventNames;
        return this;
    }
    public String getEventNames() {
        return this.eventNames;
    }

    public GetEventMistakeDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetEventMistakeDatasRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

}

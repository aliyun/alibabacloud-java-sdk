// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRecordSliceFileRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("StartTime")
    public Long startTime;

    public static CreateLiveRecordSliceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordSliceFileRequest self = new CreateLiveRecordSliceFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordSliceFileRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveRecordSliceFileRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateLiveRecordSliceFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateLiveRecordSliceFileRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public CreateLiveRecordSliceFileRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

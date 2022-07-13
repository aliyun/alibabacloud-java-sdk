// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRecordSliceFileRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 片段结束时间，时间戳。
    @NameInMap("EndTime")
    public Long endTime;

    // 自定义文件名称。
    @NameInMap("FileName")
    public String fileName;

    // 直播ID。
    @NameInMap("LiveId")
    public String liveId;

    // 片段开始时间，时间戳。
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

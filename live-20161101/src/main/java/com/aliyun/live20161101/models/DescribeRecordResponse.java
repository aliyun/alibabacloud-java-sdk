// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("BoardId")
    @Validation(required = true)
    public Integer boardId;

    @NameInMap("RecordStartTime")
    @Validation(required = true)
    public Long recordStartTime;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("State")
    @Validation(required = true)
    public Integer state;

    @NameInMap("OssPath")
    @Validation(required = true)
    public String ossPath;

    @NameInMap("OssBucket")
    @Validation(required = true)
    public String ossBucket;

    @NameInMap("OssEndpoint")
    @Validation(required = true)
    public String ossEndpoint;

    public static DescribeRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordResponse self = new DescribeRecordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordResponse setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public DescribeRecordResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRecordResponse setBoardId(Integer boardId) {
        this.boardId = boardId;
        return this;
    }
    public Integer getBoardId() {
        return this.boardId;
    }

    public DescribeRecordResponse setRecordStartTime(Long recordStartTime) {
        this.recordStartTime = recordStartTime;
        return this;
    }
    public Long getRecordStartTime() {
        return this.recordStartTime;
    }

    public DescribeRecordResponse setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeRecordResponse setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRecordResponse setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public DescribeRecordResponse setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public DescribeRecordResponse setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public DescribeRecordResponse setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

}

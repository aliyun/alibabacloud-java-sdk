// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRecordResponseBody extends TeaModel {
    @NameInMap("BoardId")
    public Integer boardId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("RecordStartTime")
    public Long recordStartTime;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("State")
    public Integer state;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("RecordId")
    public String recordId;

    public static DescribeRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordResponseBody self = new DescribeRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordResponseBody setBoardId(Integer boardId) {
        this.boardId = boardId;
        return this;
    }
    public Integer getBoardId() {
        return this.boardId;
    }

    public DescribeRecordResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRecordResponseBody setRecordStartTime(Long recordStartTime) {
        this.recordStartTime = recordStartTime;
        return this;
    }
    public Long getRecordStartTime() {
        return this.recordStartTime;
    }

    public DescribeRecordResponseBody setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public DescribeRecordResponseBody setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public DescribeRecordResponseBody setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public DescribeRecordResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeRecordResponseBody setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public DescribeRecordResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}

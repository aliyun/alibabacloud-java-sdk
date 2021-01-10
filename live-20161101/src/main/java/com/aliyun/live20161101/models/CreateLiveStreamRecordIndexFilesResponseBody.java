// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordInfo")
    public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo recordInfo;

    public static CreateLiveStreamRecordIndexFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamRecordIndexFilesResponseBody self = new CreateLiveStreamRecordIndexFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamRecordIndexFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveStreamRecordIndexFilesResponseBody setRecordInfo(CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo recordInfo) {
        this.recordInfo = recordInfo;
        return this;
    }
    public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo getRecordInfo() {
        return this.recordInfo;
    }

    public static class CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo extends TeaModel {
        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("RecordUrl")
        public String recordUrl;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("OssObject")
        public String ossObject;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo self = new CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo();
            return TeaModel.build(map, self);
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

    }

}

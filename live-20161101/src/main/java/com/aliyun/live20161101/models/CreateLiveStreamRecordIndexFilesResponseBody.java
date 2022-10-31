// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    @NameInMap("RecordInfo")
    public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo recordInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveStreamRecordIndexFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamRecordIndexFilesResponseBody self = new CreateLiveStreamRecordIndexFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamRecordIndexFilesResponseBody setRecordInfo(CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo recordInfo) {
        this.recordInfo = recordInfo;
        return this;
    }
    public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo getRecordInfo() {
        return this.recordInfo;
    }

    public CreateLiveStreamRecordIndexFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("OssObject")
        public String ossObject;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("RecordUrl")
        public String recordUrl;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Width")
        public Integer width;

        public static CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo self = new CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo();
            return TeaModel.build(map, self);
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
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

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public CreateLiveStreamRecordIndexFilesResponseBodyRecordInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}

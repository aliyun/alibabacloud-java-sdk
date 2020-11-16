// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamRecordIndexFilesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordInfo")
    @Validation(required = true)
    public CreateLiveStreamRecordIndexFilesResponseRecordInfo recordInfo;

    public static CreateLiveStreamRecordIndexFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamRecordIndexFilesResponse self = new CreateLiveStreamRecordIndexFilesResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamRecordIndexFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveStreamRecordIndexFilesResponse setRecordInfo(CreateLiveStreamRecordIndexFilesResponseRecordInfo recordInfo) {
        this.recordInfo = recordInfo;
        return this;
    }
    public CreateLiveStreamRecordIndexFilesResponseRecordInfo getRecordInfo() {
        return this.recordInfo;
    }

    public static class CreateLiveStreamRecordIndexFilesResponseRecordInfo extends TeaModel {
        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("RecordUrl")
        @Validation(required = true)
        public String recordUrl;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        @NameInMap("OssObject")
        @Validation(required = true)
        public String ossObject;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public Float duration;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static CreateLiveStreamRecordIndexFilesResponseRecordInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveStreamRecordIndexFilesResponseRecordInfo self = new CreateLiveStreamRecordIndexFilesResponseRecordInfo();
            return TeaModel.build(map, self);
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public CreateLiveStreamRecordIndexFilesResponseRecordInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}

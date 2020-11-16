// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordIndexInfo")
    @Validation(required = true)
    public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo recordIndexInfo;

    public static DescribeLiveStreamRecordIndexFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordIndexFileResponse self = new DescribeLiveStreamRecordIndexFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordIndexFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamRecordIndexFileResponse setRecordIndexInfo(DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo recordIndexInfo) {
        this.recordIndexInfo = recordIndexInfo;
        return this;
    }
    public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo getRecordIndexInfo() {
        return this.recordIndexInfo;
    }

    public static class DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo extends TeaModel {
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

        public static DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo self = new DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeLiveStreamRecordIndexFileResponseRecordIndexInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}

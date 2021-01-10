// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFileResponseBody extends TeaModel {
    @NameInMap("RecordIndexInfo")
    public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo recordIndexInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamRecordIndexFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordIndexFileResponseBody self = new DescribeLiveStreamRecordIndexFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordIndexFileResponseBody setRecordIndexInfo(DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo recordIndexInfo) {
        this.recordIndexInfo = recordIndexInfo;
        return this;
    }
    public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo getRecordIndexInfo() {
        return this.recordIndexInfo;
    }

    public DescribeLiveStreamRecordIndexFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo extends TeaModel {
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

        public static DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo self = new DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeLiveStreamRecordIndexFileResponseBodyRecordIndexInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

    }

}

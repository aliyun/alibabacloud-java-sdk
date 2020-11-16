// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordContentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordContentInfoList")
    @Validation(required = true)
    public DescribeLiveStreamRecordContentResponseRecordContentInfoList recordContentInfoList;

    public static DescribeLiveStreamRecordContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordContentResponse self = new DescribeLiveStreamRecordContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordContentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamRecordContentResponse setRecordContentInfoList(DescribeLiveStreamRecordContentResponseRecordContentInfoList recordContentInfoList) {
        this.recordContentInfoList = recordContentInfoList;
        return this;
    }
    public DescribeLiveStreamRecordContentResponseRecordContentInfoList getRecordContentInfoList() {
        return this.recordContentInfoList;
    }

    public static class DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo extends TeaModel {
        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("OssObjectPrefix")
        @Validation(required = true)
        public String ossObjectPrefix;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public Float duration;

        public static DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo self = new DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

    }

    public static class DescribeLiveStreamRecordContentResponseRecordContentInfoList extends TeaModel {
        @NameInMap("RecordContentInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo> recordContentInfo;

        public static DescribeLiveStreamRecordContentResponseRecordContentInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordContentResponseRecordContentInfoList self = new DescribeLiveStreamRecordContentResponseRecordContentInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordContentResponseRecordContentInfoList setRecordContentInfo(java.util.List<DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo> recordContentInfo) {
            this.recordContentInfo = recordContentInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamRecordContentResponseRecordContentInfoListRecordContentInfo> getRecordContentInfo() {
            return this.recordContentInfo;
        }

    }

}

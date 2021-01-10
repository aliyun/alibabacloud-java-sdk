// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordContentInfoList")
    public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList recordContentInfoList;

    public static DescribeLiveStreamRecordContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordContentResponseBody self = new DescribeLiveStreamRecordContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamRecordContentResponseBody setRecordContentInfoList(DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList recordContentInfoList) {
        this.recordContentInfoList = recordContentInfoList;
        return this;
    }
    public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList getRecordContentInfoList() {
        return this.recordContentInfoList;
    }

    public static class DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo self = new DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

    }

    public static class DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList extends TeaModel {
        @NameInMap("RecordContentInfo")
        public java.util.List<DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo> recordContentInfo;

        public static DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList self = new DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList setRecordContentInfo(java.util.List<DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo> recordContentInfo) {
            this.recordContentInfo = recordContentInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo> getRecordContentInfo() {
            return this.recordContentInfo;
        }

    }

}

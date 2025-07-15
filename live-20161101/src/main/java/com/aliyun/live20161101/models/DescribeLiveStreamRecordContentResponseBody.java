// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordContentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RecordContentInfoList")
    public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList recordContentInfoList;

    /**
     * <p>The end of the time range to query. The time range that is specified by the StartTime and EndTime parameters cannot exceed 4 days. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>62136AE6-7793-45ED-B14A-60D19A9486D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamRecordContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordContentResponseBody self = new DescribeLiveStreamRecordContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordContentResponseBody setRecordContentInfoList(DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList recordContentInfoList) {
        this.recordContentInfoList = recordContentInfoList;
        return this;
    }
    public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoList getRecordContentInfoList() {
        return this.recordContentInfoList;
    }

    public DescribeLiveStreamRecordContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo extends TeaModel {
        /**
         * <p>The beginning of the time range for which the recordings were queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The recordings.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T07:46:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The recording length. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>liveBucket****</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <p>The naming rule of recordings in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-oss-****.aliyuncs.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>record/{Date}/{UnixTimestamp}_{Sequence}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The end of the time range for which the recordings were queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T07:36:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo self = new DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeLiveStreamRecordContentResponseBodyRecordContentInfoListRecordContentInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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

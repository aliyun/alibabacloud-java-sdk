// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamSnapshotInfoResponseBody extends TeaModel {
    @NameInMap("LiveStreamSnapshotInfoList")
    public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList liveStreamSnapshotInfoList;

    /**
     * <p>The next start time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <p>If the content within this time range exceeds the value of Limit, this parameter is returned as the creation time of the next file. You can use this time as the StartTime value and call this operation again to retrieve the next set of content. If this parameter is not returned, the content does not exceed the Limit value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-12-01T17:36:00Z</p>
     */
    @NameInMap("NextStartTime")
    public String nextStartTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62136AE6-7793-45ED-B14A-60D19A9486D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamSnapshotInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamSnapshotInfoResponseBody self = new DescribeLiveStreamSnapshotInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamSnapshotInfoResponseBody setLiveStreamSnapshotInfoList(DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList liveStreamSnapshotInfoList) {
        this.liveStreamSnapshotInfoList = liveStreamSnapshotInfoList;
        return this;
    }
    public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList getLiveStreamSnapshotInfoList() {
        return this.liveStreamSnapshotInfoList;
    }

    public DescribeLiveStreamSnapshotInfoResponseBody setNextStartTime(String nextStartTime) {
        this.nextStartTime = nextStartTime;
        return this;
    }
    public String getNextStartTime() {
        return this.nextStartTime;
    }

    public DescribeLiveStreamSnapshotInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("IsOverlay")
        public Boolean isOverlay;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("OssObject")
        public String ossObject;

        public static DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo self = new DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setIsOverlay(Boolean isOverlay) {
            this.isOverlay = isOverlay;
            return this;
        }
        public Boolean getIsOverlay() {
            return this.isOverlay;
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

    }

    public static class DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList extends TeaModel {
        @NameInMap("LiveStreamSnapshotInfo")
        public java.util.List<DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo> liveStreamSnapshotInfo;

        public static DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList self = new DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList setLiveStreamSnapshotInfo(java.util.List<DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo> liveStreamSnapshotInfo) {
            this.liveStreamSnapshotInfo = liveStreamSnapshotInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo> getLiveStreamSnapshotInfo() {
            return this.liveStreamSnapshotInfo;
        }

    }

}

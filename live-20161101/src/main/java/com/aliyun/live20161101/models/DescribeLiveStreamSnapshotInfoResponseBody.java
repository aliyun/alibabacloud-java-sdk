// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamSnapshotInfoResponseBody extends TeaModel {
    /**
     * <p>The snapshots.</p>
     */
    @NameInMap("LiveStreamSnapshotInfoList")
    public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList liveStreamSnapshotInfoList;

    /**
     * <p>The time when the next call occurred. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p> If the number of snapshots that were captured within the specified time period exceeds the value of the Limit parameter, this parameter is returned. It indicates the time when the DescribeLiveStreamSnapshotInfo operation was called again. If this parameter is not returned, the number of snapshots that are captured within the specified time period does not exceed the specified limit.</p>
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
        /**
         * <p>The time when the snapshot was captured. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T17:36:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp when the snapshot file was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1653641526637</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The snapshot mode. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: overwrite mode, which means that a new snapshot overwrites the previous snapshot.</li>
         * <li><strong>false</strong>: sequence mode, which means that a new snapshot does not overwrite the previous snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOverlay")
        public Boolean isOverlay;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>liveBucket****</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <p>The endpoint of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-oss-****.aliyuncs.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        /**
         * <p>The name of the snapshot stored in Object Storage Service (OSS).</p>
         * 
         * <strong>example:</strong>
         * <p>{liveApp****}/{liveStream****}.jpg</p>
         */
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

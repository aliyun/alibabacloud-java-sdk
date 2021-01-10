// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamSnapshotInfoResponseBody extends TeaModel {
    @NameInMap("LiveStreamSnapshotInfoList")
    public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoList liveStreamSnapshotInfoList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextStartTime")
    public String nextStartTime;

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

    public DescribeLiveStreamSnapshotInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamSnapshotInfoResponseBody setNextStartTime(String nextStartTime) {
        this.nextStartTime = nextStartTime;
        return this;
    }
    public String getNextStartTime() {
        return this.nextStartTime;
    }

    public static class DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo extends TeaModel {
        @NameInMap("OssObject")
        public String ossObject;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo self = new DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveStreamSnapshotInfoResponseBodyLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

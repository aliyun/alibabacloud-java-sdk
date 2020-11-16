// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamSnapshotInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextStartTime")
    @Validation(required = true)
    public String nextStartTime;

    @NameInMap("LiveStreamSnapshotInfoList")
    @Validation(required = true)
    public DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoList liveStreamSnapshotInfoList;

    public static DescribeLiveStreamSnapshotInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamSnapshotInfoResponse self = new DescribeLiveStreamSnapshotInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamSnapshotInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamSnapshotInfoResponse setNextStartTime(String nextStartTime) {
        this.nextStartTime = nextStartTime;
        return this;
    }
    public String getNextStartTime() {
        return this.nextStartTime;
    }

    public DescribeLiveStreamSnapshotInfoResponse setLiveStreamSnapshotInfoList(DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoList liveStreamSnapshotInfoList) {
        this.liveStreamSnapshotInfoList = liveStreamSnapshotInfoList;
        return this;
    }
    public DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoList getLiveStreamSnapshotInfoList() {
        return this.liveStreamSnapshotInfoList;
    }

    public static class DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo extends TeaModel {
        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("OssObject")
        @Validation(required = true)
        public String ossObject;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo self = new DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoList extends TeaModel {
        @NameInMap("LiveStreamSnapshotInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo> liveStreamSnapshotInfo;

        public static DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoList self = new DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoList setLiveStreamSnapshotInfo(java.util.List<DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo> liveStreamSnapshotInfo) {
            this.liveStreamSnapshotInfo = liveStreamSnapshotInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamSnapshotInfoResponseLiveStreamSnapshotInfoListLiveStreamSnapshotInfo> getLiveStreamSnapshotInfo() {
            return this.liveStreamSnapshotInfo;
        }

    }

}

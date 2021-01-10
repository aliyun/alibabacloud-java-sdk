// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotConfigResponseBody extends TeaModel {
    @NameInMap("Order")
    public String order;

    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("LiveStreamSnapshotConfigList")
    public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList liveStreamSnapshotConfigList;

    public static DescribeLiveSnapshotConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotConfigResponseBody self = new DescribeLiveSnapshotConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotConfigResponseBody setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveSnapshotConfigResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveSnapshotConfigResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveSnapshotConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveSnapshotConfigResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveSnapshotConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveSnapshotConfigResponseBody setLiveStreamSnapshotConfigList(DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList liveStreamSnapshotConfigList) {
        this.liveStreamSnapshotConfigList = liveStreamSnapshotConfigList;
        return this;
    }
    public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList getLiveStreamSnapshotConfigList() {
        return this.liveStreamSnapshotConfigList;
    }

    public static class DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig extends TeaModel {
        @NameInMap("OverwriteOssObject")
        public String overwriteOssObject;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Callback")
        public String callback;

        @NameInMap("SequenceOssObject")
        public String sequenceOssObject;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig self = new DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOverwriteOssObject(String overwriteOssObject) {
            this.overwriteOssObject = overwriteOssObject;
            return this;
        }
        public String getOverwriteOssObject() {
            return this.overwriteOssObject;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setSequenceOssObject(String sequenceOssObject) {
            this.sequenceOssObject = sequenceOssObject;
            return this;
        }
        public String getSequenceOssObject() {
            return this.sequenceOssObject;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

    }

    public static class DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList extends TeaModel {
        @NameInMap("LiveStreamSnapshotConfig")
        public java.util.List<DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig> liveStreamSnapshotConfig;

        public static DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList self = new DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList setLiveStreamSnapshotConfig(java.util.List<DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig> liveStreamSnapshotConfig) {
            this.liveStreamSnapshotConfig = liveStreamSnapshotConfig;
            return this;
        }
        public java.util.List<DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig> getLiveStreamSnapshotConfig() {
            return this.liveStreamSnapshotConfig;
        }

    }

}

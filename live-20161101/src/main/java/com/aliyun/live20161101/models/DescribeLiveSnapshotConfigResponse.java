// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Order")
    @Validation(required = true)
    public String order;

    @NameInMap("TotalNum")
    @Validation(required = true)
    public Integer totalNum;

    @NameInMap("TotalPage")
    @Validation(required = true)
    public Integer totalPage;

    @NameInMap("LiveStreamSnapshotConfigList")
    @Validation(required = true)
    public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigList liveStreamSnapshotConfigList;

    public static DescribeLiveSnapshotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotConfigResponse self = new DescribeLiveSnapshotConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveSnapshotConfigResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveSnapshotConfigResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveSnapshotConfigResponse setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveSnapshotConfigResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveSnapshotConfigResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveSnapshotConfigResponse setLiveStreamSnapshotConfigList(DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigList liveStreamSnapshotConfigList) {
        this.liveStreamSnapshotConfigList = liveStreamSnapshotConfigList;
        return this;
    }
    public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigList getLiveStreamSnapshotConfigList() {
        return this.liveStreamSnapshotConfigList;
    }

    public static class DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("TimeInterval")
        @Validation(required = true)
        public Integer timeInterval;

        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("OverwriteOssObject")
        @Validation(required = true)
        public String overwriteOssObject;

        @NameInMap("SequenceOssObject")
        @Validation(required = true)
        public String sequenceOssObject;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Callback")
        @Validation(required = true)
        public String callback;

        public static DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig self = new DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOverwriteOssObject(String overwriteOssObject) {
            this.overwriteOssObject = overwriteOssObject;
            return this;
        }
        public String getOverwriteOssObject() {
            return this.overwriteOssObject;
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setSequenceOssObject(String sequenceOssObject) {
            this.sequenceOssObject = sequenceOssObject;
            return this;
        }
        public String getSequenceOssObject() {
            return this.sequenceOssObject;
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

    }

    public static class DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigList extends TeaModel {
        @NameInMap("LiveStreamSnapshotConfig")
        @Validation(required = true)
        public java.util.List<DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig> liveStreamSnapshotConfig;

        public static DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigList self = new DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigList setLiveStreamSnapshotConfig(java.util.List<DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig> liveStreamSnapshotConfig) {
            this.liveStreamSnapshotConfig = liveStreamSnapshotConfig;
            return this;
        }
        public java.util.List<DescribeLiveSnapshotConfigResponseLiveStreamSnapshotConfigListLiveStreamSnapshotConfig> getLiveStreamSnapshotConfig() {
            return this.liveStreamSnapshotConfig;
        }

    }

}

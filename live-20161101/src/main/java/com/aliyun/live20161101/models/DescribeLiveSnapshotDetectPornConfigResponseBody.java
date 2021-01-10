// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotDetectPornConfigResponseBody extends TeaModel {
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

    @NameInMap("LiveSnapshotDetectPornConfigList")
    public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList;

    public static DescribeLiveSnapshotDetectPornConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotDetectPornConfigResponseBody self = new DescribeLiveSnapshotDetectPornConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotDetectPornConfigResponseBody setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveSnapshotDetectPornConfigResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveSnapshotDetectPornConfigResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveSnapshotDetectPornConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveSnapshotDetectPornConfigResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveSnapshotDetectPornConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveSnapshotDetectPornConfigResponseBody setLiveSnapshotDetectPornConfigList(DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList) {
        this.liveSnapshotDetectPornConfigList = liveSnapshotDetectPornConfigList;
        return this;
    }
    public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigList getLiveSnapshotDetectPornConfigList() {
        return this.liveSnapshotDetectPornConfigList;
    }

    public static class DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes extends TeaModel {
        @NameInMap("scene")
        public java.util.List<String> scene;

        public static DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes self = new DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes setScene(java.util.List<String> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<String> getScene() {
            return this.scene;
        }

    }

    public static class DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig extends TeaModel {
        @NameInMap("OssObject")
        public String ossObject;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Scenes")
        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes scenes;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig self = new DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setScenes(DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes scenes) {
            this.scenes = scenes;
            return this;
        }
        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes getScenes() {
            return this.scenes;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

    }

    public static class DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigList extends TeaModel {
        @NameInMap("LiveSnapshotDetectPornConfig")
        public java.util.List<DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig;

        public static DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigList self = new DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigList setLiveSnapshotDetectPornConfig(java.util.List<DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig) {
            this.liveSnapshotDetectPornConfig = liveSnapshotDetectPornConfig;
            return this;
        }
        public java.util.List<DescribeLiveSnapshotDetectPornConfigResponseBodyLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig> getLiveSnapshotDetectPornConfig() {
            return this.liveSnapshotDetectPornConfig;
        }

    }

}

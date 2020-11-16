// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotDetectPornConfigResponse extends TeaModel {
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

    @NameInMap("LiveSnapshotDetectPornConfigList")
    @Validation(required = true)
    public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList;

    public static DescribeLiveSnapshotDetectPornConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotDetectPornConfigResponse self = new DescribeLiveSnapshotDetectPornConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setLiveSnapshotDetectPornConfigList(DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList) {
        this.liveSnapshotDetectPornConfigList = liveSnapshotDetectPornConfigList;
        return this;
    }
    public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigList getLiveSnapshotDetectPornConfigList() {
        return this.liveSnapshotDetectPornConfigList;
    }

    public static class DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes extends TeaModel {
        // scene
        @NameInMap("scene")
        @Validation(required = true)
        public java.util.List<String> scene;

        public static DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes self = new DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes setScene(java.util.List<String> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<String> getScene() {
            return this.scene;
        }

    }

    public static class DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("OssObject")
        @Validation(required = true)
        public String ossObject;

        @NameInMap("Interval")
        @Validation(required = true)
        public Integer interval;

        @NameInMap("Scenes")
        @Validation(required = true)
        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes scenes;

        public static DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig self = new DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig setScenes(DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes scenes) {
            this.scenes = scenes;
            return this;
        }
        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfigScenes getScenes() {
            return this.scenes;
        }

    }

    public static class DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigList extends TeaModel {
        @NameInMap("LiveSnapshotDetectPornConfig")
        @Validation(required = true)
        public java.util.List<DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig;

        public static DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigList self = new DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigList setLiveSnapshotDetectPornConfig(java.util.List<DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig) {
            this.liveSnapshotDetectPornConfig = liveSnapshotDetectPornConfig;
            return this;
        }
        public java.util.List<DescribeLiveSnapshotDetectPornConfigResponseLiveSnapshotDetectPornConfigListLiveSnapshotDetectPornConfig> getLiveSnapshotDetectPornConfig() {
            return this.liveSnapshotDetectPornConfig;
        }

    }

}

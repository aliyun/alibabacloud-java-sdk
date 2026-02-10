// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePackageConfigResponseBody extends TeaModel {
    @NameInMap("LivePackageConfigList")
    public DescribeLivePackageConfigResponseBodyLivePackageConfigList livePackageConfigList;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong> (default): ascending order</li>
     * <li><strong>desc</strong>: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1FEDCFD8-4C5D-5CB3-A5A1-0B59E5AE57B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of live stream encapsulation configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeLivePackageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePackageConfigResponseBody self = new DescribeLivePackageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePackageConfigResponseBody setLivePackageConfigList(DescribeLivePackageConfigResponseBodyLivePackageConfigList livePackageConfigList) {
        this.livePackageConfigList = livePackageConfigList;
        return this;
    }
    public DescribeLivePackageConfigResponseBodyLivePackageConfigList getLivePackageConfigList() {
        return this.livePackageConfigList;
    }

    public DescribeLivePackageConfigResponseBody setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLivePackageConfigResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLivePackageConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLivePackageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLivePackageConfigResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLivePackageConfigResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("IgnoreTranscode")
        public Boolean ignoreTranscode;

        @NameInMap("PartDuration")
        public Integer partDuration;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SegmentDuration")
        public Integer segmentDuration;

        @NameInMap("SegmentNum")
        public Integer segmentNum;

        @NameInMap("StreamName")
        public String streamName;

        public static DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig self = new DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig setIgnoreTranscode(Boolean ignoreTranscode) {
            this.ignoreTranscode = ignoreTranscode;
            return this;
        }
        public Boolean getIgnoreTranscode() {
            return this.ignoreTranscode;
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig setPartDuration(Integer partDuration) {
            this.partDuration = partDuration;
            return this;
        }
        public Integer getPartDuration() {
            return this.partDuration;
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig setSegmentDuration(Integer segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }
        public Integer getSegmentDuration() {
            return this.segmentDuration;
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig setSegmentNum(Integer segmentNum) {
            this.segmentNum = segmentNum;
            return this;
        }
        public Integer getSegmentNum() {
            return this.segmentNum;
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class DescribeLivePackageConfigResponseBodyLivePackageConfigList extends TeaModel {
        @NameInMap("LivePackageConfig")
        public java.util.List<DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig> livePackageConfig;

        public static DescribeLivePackageConfigResponseBodyLivePackageConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePackageConfigResponseBodyLivePackageConfigList self = new DescribeLivePackageConfigResponseBodyLivePackageConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLivePackageConfigResponseBodyLivePackageConfigList setLivePackageConfig(java.util.List<DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig> livePackageConfig) {
            this.livePackageConfig = livePackageConfig;
            return this;
        }
        public java.util.List<DescribeLivePackageConfigResponseBodyLivePackageConfigListLivePackageConfig> getLivePackageConfig() {
            return this.livePackageConfig;
        }

    }

}

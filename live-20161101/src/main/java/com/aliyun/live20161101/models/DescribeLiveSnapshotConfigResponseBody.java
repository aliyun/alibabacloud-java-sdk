// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotConfigResponseBody extends TeaModel {
    /**
     * <p>The snapshot configurations.</p>
     */
    @NameInMap("LiveStreamSnapshotConfigList")
    public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList liveStreamSnapshotConfigList;

    /**
     * <p>The sort order.</p>
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
     * <p>2</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
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

    public static DescribeLiveSnapshotConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotConfigResponseBody self = new DescribeLiveSnapshotConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotConfigResponseBody setLiveStreamSnapshotConfigList(DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList liveStreamSnapshotConfigList) {
        this.liveStreamSnapshotConfigList = liveStreamSnapshotConfigList;
        return this;
    }
    public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigList getLiveStreamSnapshotConfigList() {
        return this.liveStreamSnapshotConfigList;
    }

    public DescribeLiveSnapshotConfigResponseBody setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeLiveSnapshotConfigResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveSnapshotConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveSnapshotConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveSnapshotConfigResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveSnapshotConfigResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig extends TeaModel {
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The callback URL that is used to receive notifications about snapshot capture.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://learn.aliyundoc.com">https://learn.aliyundoc.com</a></p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <p>The time when the configuration was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-05-20T01:33:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
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
         * <p>The naming format of snapshots that are stored in the overwrite mode, which means that a new snapshot overwrites the previous snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>{liveApp****}/{liveStream****}.jpg</p>
         */
        @NameInMap("OverwriteOssObject")
        public String overwriteOssObject;

        /**
         * <p>The naming format of snapshots that are stored in sequence, which means that a new snapshot does not overwrite the previous snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot/{liveApp****}/{liveStream****}/{UnixTimestamp}.jpg</p>
         */
        @NameInMap("SequenceOssObject")
        public String sequenceOssObject;

        /**
         * <p>The interval at which snapshots are captured. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        public static DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig self = new DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setOverwriteOssObject(String overwriteOssObject) {
            this.overwriteOssObject = overwriteOssObject;
            return this;
        }
        public String getOverwriteOssObject() {
            return this.overwriteOssObject;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setSequenceOssObject(String sequenceOssObject) {
            this.sequenceOssObject = sequenceOssObject;
            return this;
        }
        public String getSequenceOssObject() {
            return this.sequenceOssObject;
        }

        public DescribeLiveSnapshotConfigResponseBodyLiveStreamSnapshotConfigListLiveStreamSnapshotConfig setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAdInsertionsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<ListAdInsertionsResponseBodyConfigs> configs;

    /**
     * <p>获取后续数据的最大记录数，使用此方式获取数据时分页参数将无效</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>获取后续数据的Token，使用此方式获取数据时分页参数将无效</p>
     * 
     * <strong>example:</strong>
     * <p>*<em><strong><strong>8EqYpQbZ6Eh7+Zz8DxVYoQ</strong></strong></em></p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>分页参数，页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>分页参数，页宽</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>分页参数，排序方式，asc:按创建时间升序，desc:按创建时间降序</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>总记录数</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAdInsertionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdInsertionsResponseBody self = new ListAdInsertionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdInsertionsResponseBody setConfigs(java.util.List<ListAdInsertionsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListAdInsertionsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListAdInsertionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAdInsertionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAdInsertionsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListAdInsertionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAdInsertionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdInsertionsResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListAdInsertionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAdInsertionsResponseBodyConfigsCdnConfig extends TeaModel {
        /**
         * <p>广告分片的CDN前缀</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
         */
        @NameInMap("AdSegmentUrlPrefix")
        public String adSegmentUrlPrefix;

        /**
         * <p>视频内容分片的CDN前缀</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
         */
        @NameInMap("ContentSegmentUrlPrefix")
        public String contentSegmentUrlPrefix;

        public static ListAdInsertionsResponseBodyConfigsCdnConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAdInsertionsResponseBodyConfigsCdnConfig self = new ListAdInsertionsResponseBodyConfigsCdnConfig();
            return TeaModel.build(map, self);
        }

        public ListAdInsertionsResponseBodyConfigsCdnConfig setAdSegmentUrlPrefix(String adSegmentUrlPrefix) {
            this.adSegmentUrlPrefix = adSegmentUrlPrefix;
            return this;
        }
        public String getAdSegmentUrlPrefix() {
            return this.adSegmentUrlPrefix;
        }

        public ListAdInsertionsResponseBodyConfigsCdnConfig setContentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
            this.contentSegmentUrlPrefix = contentSegmentUrlPrefix;
            return this;
        }
        public String getContentSegmentUrlPrefix() {
            return this.contentSegmentUrlPrefix;
        }

    }

    public static class ListAdInsertionsResponseBodyConfigsManifestEndpointConfig extends TeaModel {
        /**
         * <p>HLS清单播放端点前缀</p>
         */
        @NameInMap("HlsPrefix")
        public String hlsPrefix;

        public static ListAdInsertionsResponseBodyConfigsManifestEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAdInsertionsResponseBodyConfigsManifestEndpointConfig self = new ListAdInsertionsResponseBodyConfigsManifestEndpointConfig();
            return TeaModel.build(map, self);
        }

        public ListAdInsertionsResponseBodyConfigsManifestEndpointConfig setHlsPrefix(String hlsPrefix) {
            this.hlsPrefix = hlsPrefix;
            return this;
        }
        public String getHlsPrefix() {
            return this.hlsPrefix;
        }

    }

    public static class ListAdInsertionsResponseBodyConfigs extends TeaModel {
        /**
         * <p>广告标记透传</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("AdMarkerPassthrough")
        public String adMarkerPassthrough;

        /**
         * <p>广告策略服务器URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ads.com/ad1?param1=%5Bpalyer_params.p1%5D">http://ads.com/ad1?param1=[palyer_params.p1]</a></p>
         */
        @NameInMap("AdsUrl")
        public String adsUrl;

        /**
         * <p>CDN配置</p>
         */
        @NameInMap("CdnConfig")
        public ListAdInsertionsResponseBodyConfigsCdnConfig cdnConfig;

        /**
         * <p>动态配置别名</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;player_params.p1&quot;: {
         *             &quot;1&quot;: &quot;abc&quot;
         *       }
         * }</p>
         */
        @NameInMap("ConfigAliases")
        public String configAliases;

        /**
         * <p>内容URL前缀</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://source.com/">https://source.com/</a></p>
         */
        @NameInMap("ContentUrlPrefix")
        public String contentUrlPrefix;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:26:09Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:26:09Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>清单播放端点配置</p>
         */
        @NameInMap("ManifestEndpointConfig")
        public ListAdInsertionsResponseBodyConfigsManifestEndpointConfig manifestEndpointConfig;

        /**
         * <p>广告插入配置名称</p>
         * 
         * <strong>example:</strong>
         * <p>my_ad</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>个性化配置阈值</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PersonalizationThreshold")
        public Integer personalizationThreshold;

        /**
         * <p>slate广告URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://storage.com/slate1.mp4">http://storage.com/slate1.mp4</a></p>
         */
        @NameInMap("SlateAdUrl")
        public String slateAdUrl;

        public static ListAdInsertionsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListAdInsertionsResponseBodyConfigs self = new ListAdInsertionsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListAdInsertionsResponseBodyConfigs setAdMarkerPassthrough(String adMarkerPassthrough) {
            this.adMarkerPassthrough = adMarkerPassthrough;
            return this;
        }
        public String getAdMarkerPassthrough() {
            return this.adMarkerPassthrough;
        }

        public ListAdInsertionsResponseBodyConfigs setAdsUrl(String adsUrl) {
            this.adsUrl = adsUrl;
            return this;
        }
        public String getAdsUrl() {
            return this.adsUrl;
        }

        public ListAdInsertionsResponseBodyConfigs setCdnConfig(ListAdInsertionsResponseBodyConfigsCdnConfig cdnConfig) {
            this.cdnConfig = cdnConfig;
            return this;
        }
        public ListAdInsertionsResponseBodyConfigsCdnConfig getCdnConfig() {
            return this.cdnConfig;
        }

        public ListAdInsertionsResponseBodyConfigs setConfigAliases(String configAliases) {
            this.configAliases = configAliases;
            return this;
        }
        public String getConfigAliases() {
            return this.configAliases;
        }

        public ListAdInsertionsResponseBodyConfigs setContentUrlPrefix(String contentUrlPrefix) {
            this.contentUrlPrefix = contentUrlPrefix;
            return this;
        }
        public String getContentUrlPrefix() {
            return this.contentUrlPrefix;
        }

        public ListAdInsertionsResponseBodyConfigs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAdInsertionsResponseBodyConfigs setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListAdInsertionsResponseBodyConfigs setManifestEndpointConfig(ListAdInsertionsResponseBodyConfigsManifestEndpointConfig manifestEndpointConfig) {
            this.manifestEndpointConfig = manifestEndpointConfig;
            return this;
        }
        public ListAdInsertionsResponseBodyConfigsManifestEndpointConfig getManifestEndpointConfig() {
            return this.manifestEndpointConfig;
        }

        public ListAdInsertionsResponseBodyConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAdInsertionsResponseBodyConfigs setPersonalizationThreshold(Integer personalizationThreshold) {
            this.personalizationThreshold = personalizationThreshold;
            return this;
        }
        public Integer getPersonalizationThreshold() {
            return this.personalizationThreshold;
        }

        public ListAdInsertionsResponseBodyConfigs setSlateAdUrl(String slateAdUrl) {
            this.slateAdUrl = slateAdUrl;
            return this;
        }
        public String getSlateAdUrl() {
            return this.slateAdUrl;
        }

    }

}

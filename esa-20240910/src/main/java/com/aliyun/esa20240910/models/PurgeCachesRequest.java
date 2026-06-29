// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesRequest extends TeaModel {
    /**
     * <p>The refresh content.</p>
     */
    @NameInMap("Content")
    public PurgeCachesRequestContent content;

    /**
     * <p>Specifies whether to refresh edge computing cached resources. For example, this allows refreshing content cached by the Edge Routine Cache API operation function.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EdgeComputePurge")
    public Boolean edgeComputePurge;

    /**
     * <p>Specifies whether to refresh all resources under the corresponding directory when the back-to-origin content is inconsistent with the origin server resources. Default value: false.</p>
     * <ul>
     * <li><strong>true</strong>: Refreshes all resources under the corresponding directory.</li>
     * <li><strong>false</strong>: Refreshes only the changed resources under the corresponding directory.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect for directory refresh, cache tag refresh, parameter-ignored refresh, hostname refresh, and full site cache refresh.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of the refresh node. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): file refresh.</li>
     * <li><strong>cachekey</strong>: cache key refresh.</li>
     * <li><strong>cachetag</strong>: cache label refresh.</li>
     * <li><strong>directory</strong>: folder refresh.</li>
     * <li><strong>ignoreParams</strong>: parameter-ignored refresh. This refers to removing the question mark (?) and all parameters after it from the request URL. When you commit a parameter-stripped URL through this API operation, the submitted URL is matched against cached resource URLs after their parameters are also stripped. If a cached resource URL matches the submitted URL after parameter stripping, the point of presence executes the refresh on the cached resource.</li>
     * <li><strong>hostname</strong>: hostname refresh.</li>
     * <li><strong>purgeall</strong>: refreshes all cached content under the site.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("Type")
    public String type;

    public static PurgeCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        PurgeCachesRequest self = new PurgeCachesRequest();
        return TeaModel.build(map, self);
    }

    public PurgeCachesRequest setContent(PurgeCachesRequestContent content) {
        this.content = content;
        return this;
    }
    public PurgeCachesRequestContent getContent() {
        return this.content;
    }

    public PurgeCachesRequest setEdgeComputePurge(Boolean edgeComputePurge) {
        this.edgeComputePurge = edgeComputePurge;
        return this;
    }
    public Boolean getEdgeComputePurge() {
        return this.edgeComputePurge;
    }

    public PurgeCachesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public PurgeCachesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public PurgeCachesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class PurgeCachesRequestContentCacheKeys extends TeaModel {
        /**
         * <p>The header information corresponding to the cache key for the refresh. When the custom cache key feature is enabled, the cache key is generated based on the specified headers for the refresh.</p>
         * <p><strong>UserGeo: country/region</strong></p>
         * <ul>
         * <li>Country/region codes follow the ISO 3166-2 standard.</li>
         * </ul>
         * <p><strong>UserDeviceType: device type. Valid values:</strong></p>
         * <ul>
         * <li><p>desktop</p>
         * </li>
         * <li><p>tablet</p>
         * </li>
         * <li><p>mobile</p>
         * </li>
         * </ul>
         * <p><strong>UserLanguage: language</strong></p>
         * <ul>
         * <li>Language codes follow the ISO 639-1 or BCP 47 standard. For example, set this to zh to refresh content in Chinese.</li>
         * </ul>
         */
        @NameInMap("Headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The URL to refresh.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://a.com/1.jpg?b=1">http://a.com/1.jpg?b=1</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static PurgeCachesRequestContentCacheKeys build(java.util.Map<String, ?> map) throws Exception {
            PurgeCachesRequestContentCacheKeys self = new PurgeCachesRequestContentCacheKeys();
            return TeaModel.build(map, self);
        }

        public PurgeCachesRequestContentCacheKeys setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public PurgeCachesRequestContentCacheKeys setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PurgeCachesRequestContent extends TeaModel {
        /**
         * <p>The list of cache keys to refresh. This parameter is required when Type is set to cachekey.</p>
         */
        @NameInMap("CacheKeys")
        public java.util.List<PurgeCachesRequestContentCacheKeys> cacheKeys;

        /**
         * <p>The list of cache tags to refresh. This parameter is required when Type is set to cachetag.</p>
         */
        @NameInMap("CacheTags")
        public java.util.List<String> cacheTags;

        /**
         * <p>The list of directories to refresh. This parameter is required when Type is set to directory.</p>
         */
        @NameInMap("Directories")
        public java.util.List<String> directories;

        /**
         * <p>The list of files to refresh. This parameter is required when Type is set to file.</p>
         */
        @NameInMap("Files")
        public java.util.List<?> files;

        /**
         * <p>The list of hostnames to refresh. This parameter is required when Type is set to hostname.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The list of files with parameters ignored. This parameter is required when Type is set to ignoreParams.</p>
         */
        @NameInMap("IgnoreParams")
        public java.util.List<String> ignoreParams;

        /**
         * <p>Specifies whether to refresh all cached content under the site. Default value: false. Set this parameter to true when Type is set to purgeall.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PurgeAll")
        public Boolean purgeAll;

        public static PurgeCachesRequestContent build(java.util.Map<String, ?> map) throws Exception {
            PurgeCachesRequestContent self = new PurgeCachesRequestContent();
            return TeaModel.build(map, self);
        }

        public PurgeCachesRequestContent setCacheKeys(java.util.List<PurgeCachesRequestContentCacheKeys> cacheKeys) {
            this.cacheKeys = cacheKeys;
            return this;
        }
        public java.util.List<PurgeCachesRequestContentCacheKeys> getCacheKeys() {
            return this.cacheKeys;
        }

        public PurgeCachesRequestContent setCacheTags(java.util.List<String> cacheTags) {
            this.cacheTags = cacheTags;
            return this;
        }
        public java.util.List<String> getCacheTags() {
            return this.cacheTags;
        }

        public PurgeCachesRequestContent setDirectories(java.util.List<String> directories) {
            this.directories = directories;
            return this;
        }
        public java.util.List<String> getDirectories() {
            return this.directories;
        }

        public PurgeCachesRequestContent setFiles(java.util.List<?> files) {
            this.files = files;
            return this;
        }
        public java.util.List<?> getFiles() {
            return this.files;
        }

        public PurgeCachesRequestContent setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public PurgeCachesRequestContent setIgnoreParams(java.util.List<String> ignoreParams) {
            this.ignoreParams = ignoreParams;
            return this;
        }
        public java.util.List<String> getIgnoreParams() {
            return this.ignoreParams;
        }

        public PurgeCachesRequestContent setPurgeAll(Boolean purgeAll) {
            this.purgeAll = purgeAll;
            return this;
        }
        public Boolean getPurgeAll() {
            return this.purgeAll;
        }

    }

}

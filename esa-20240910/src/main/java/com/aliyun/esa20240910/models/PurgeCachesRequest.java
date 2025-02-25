// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesRequest extends TeaModel {
    /**
     * <p>Content to be refreshed.</p>
     */
    @NameInMap("Content")
    public PurgeCachesRequestContent content;

    /**
     * <p>Used for refreshing cached resources in edge computing, such as allowing the refresh of content cached using the CacheAPI interface of an edge function.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EdgeComputePurge")
    public Boolean edgeComputePurge;

    /**
     * <p>Indicates whether to refresh all resources under the directory when the content from the origin and the source resource are inconsistent. The default is false.</p>
     * <ul>
     * <li><strong>true</strong>: Refreshes all resources under the specified directory.</li>
     * <li><strong>false</strong>: Refreshes only the changed resources under the specified directory.</li>
     * </ul>
     * <blockquote>
     * <p> Applies to: Directory refresh, cachetag refresh, ignoreParams refresh, hostname refresh, and purge all cache of the site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of refresh task. Possible values:</p>
     * <ul>
     * <li><strong>file</strong> (default): File refresh.</li>
     * <li><strong>cachekey</strong>: Cachekey refresh.</li>
     * <li><strong>cachetag</strong>: Cachetag refresh.</li>
     * <li><strong>directory</strong>: Directory refresh.</li>
     * <li><strong>ignoreParams</strong>: Ignore parameters refresh. Ignoring parameters means removing the ? and everything after it in the request URL. When performing an ignore parameters refresh, the user first submits the URL without parameters through the interface. The submitted URLs to be refreshed will then be matched against the cached resource URLs with the parameters removed. If the cached resource URL, after removing the parameters, matches the URL to be refreshed, the CDN node will refresh the cached resources.</li>
     * <li><strong>hostname</strong>: Hostname refresh.</li>
     * <li><strong>purgeall</strong>: Purge all cache under the site.</li>
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
         * <p>When refreshing, specify the header information corresponding to the cache key. When the custom cache key feature switch is enabled, the cache key will be generated based on the specified header for refreshing.</p>
         * <p><strong>UserGeo: Country/Region</strong></p>
         * <ul>
         * <li>Country/region codes follow the ISO 3166-2 standard.</li>
         * </ul>
         * <p><strong>UserDeviceType: Device Type, currently there are three enum values</strong></p>
         * <ul>
         * <li>desktop</li>
         * <li>tablet</li>
         * <li>mobile</li>
         * </ul>
         * <p><strong>UserLanguage: Language</strong></p>
         * <ul>
         * <li>Language codes follow the ISO 639-1 or BCP47 standards. For example, input \&quot;zh\&quot; to refresh content in Chinese.</li>
         * </ul>
         */
        @NameInMap("Headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>URL address to be refreshed.</p>
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
         * <p>List of cachekeys to be refreshed, required when the type is cachekey.</p>
         */
        @NameInMap("CacheKeys")
        public java.util.List<PurgeCachesRequestContentCacheKeys> cacheKeys;

        /**
         * <p>List of cachetags to be refreshed, required when the type is cachetag.</p>
         */
        @NameInMap("CacheTags")
        public java.util.List<String> cacheTags;

        /**
         * <p>List of directories to be refreshed, required when the type is directory.</p>
         */
        @NameInMap("Directories")
        public java.util.List<String> directories;

        /**
         * <p>List of files to be refreshed, required when the type is file.</p>
         */
        @NameInMap("Files")
        public java.util.List<?> files;

        /**
         * <p>List of hostnames to be refreshed, required when the type is hostname.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>List of files with ignored parameters, required when the type is ignoreParams.</p>
         */
        @NameInMap("IgnoreParams")
        public java.util.List<String> ignoreParams;

        /**
         * <p>Flag for purging all content. Default is false, set to true when the type is purgeall.</p>
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

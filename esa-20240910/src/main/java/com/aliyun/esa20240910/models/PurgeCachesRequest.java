// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesRequest extends TeaModel {
    /**
     * <p>The content to purge.</p>
     */
    @NameInMap("Content")
    public PurgeCachesRequestContent content;

    /**
     * <p>Specifies whether to purge cached resources for edge computing. For example, purge the resources cached by the CacheAPI operation of Edge Routine.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EdgeComputePurge")
    public Boolean edgeComputePurge;

    /**
     * <p>Specifies whether to purge resources in a directory if the resources requested are different from the resources on the origin server. Default value: false.</p>
     * <ul>
     * <li><strong>true</strong>: purges all resources in the directory.</li>
     * <li><strong>false</strong>: purges only changed resources in the directory.</li>
     * </ul>
     * <blockquote>
     * <p> This configuration takes effect for the following purge task types: directory, cachetag, ignoreParams, hostname, and purgeall.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of the purge task. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): purges the cache by file.</li>
     * <li><strong>cachetag</strong>: purges the cache by cache tag.</li>
     * <li><strong>directory</strong>: purges the cache by directory.</li>
     * <li><strong>ignoreParams</strong>: purges the cache by URL with specific parameters ignored. This option ignores the question mark (?) and parameters after the question mark (?) in a request URL and purges the cache. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource without specified parameters. If the URLs match, the POPs purge the cached resources.</li>
     * <li><strong>hostname</strong>: purges the cache by hostname.</li>
     * <li><strong>purgeall</strong>: purges all cache.</li>
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
        @NameInMap("Headers")
        public java.util.Map<String, String> headers;

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
        @NameInMap("CacheKeys")
        public java.util.List<PurgeCachesRequestContentCacheKeys> cacheKeys;

        /**
         * <p>The cache tags that are used to purge the cache. This parameter is required if Type is set to cachetag.</p>
         */
        @NameInMap("CacheTags")
        public java.util.List<String> cacheTags;

        /**
         * <p>The directories that are used to purge the cache. This parameter is required if Type is set to directory.</p>
         */
        @NameInMap("Directories")
        public java.util.List<String> directories;

        /**
         * <p>The files to purge. This parameter is required if Type is set to file.</p>
         */
        @NameInMap("Files")
        public java.util.List<?> files;

        /**
         * <p>The hostnames that are used to purge the cache. This parameter is required if Type is set to hostname.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The file URLs with parameters ignored that are used to purge the cache. This parameter is required if Type is set to ignoreParams.</p>
         */
        @NameInMap("IgnoreParams")
        public java.util.List<String> ignoreParams;

        /**
         * <p>Specifies whether to purge all cache of the website. Default value: false. The value is true when Type is set to purgeall.</p>
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

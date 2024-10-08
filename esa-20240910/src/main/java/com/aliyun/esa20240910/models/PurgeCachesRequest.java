// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesRequest extends TeaModel {
    @NameInMap("Content")
    public PurgeCachesRequestContent content;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EdgeComputePurge")
    public Boolean edgeComputePurge;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
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

    public static class PurgeCachesRequestContent extends TeaModel {
        @NameInMap("CacheTags")
        public java.util.List<String> cacheTags;

        @NameInMap("Directories")
        public java.util.List<String> directories;

        @NameInMap("Files")
        public java.util.List<?> files;

        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        @NameInMap("IgnoreParams")
        public java.util.List<String> ignoreParams;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PurgeAll")
        public Boolean purgeAll;

        public static PurgeCachesRequestContent build(java.util.Map<String, ?> map) throws Exception {
            PurgeCachesRequestContent self = new PurgeCachesRequestContent();
            return TeaModel.build(map, self);
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

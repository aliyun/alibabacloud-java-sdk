// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class AdvancePurgeObjectCacheRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    @NameInMap("Content")
    public AdvancePurgeObjectCacheRequestContent content;

    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("Stations")
    public String stations;

    @NameInMap("TimeRangeBegin")
    public Integer timeRangeBegin;

    @NameInMap("TimeRangeEnd")
    public Integer timeRangeEnd;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static AdvancePurgeObjectCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        AdvancePurgeObjectCacheRequest self = new AdvancePurgeObjectCacheRequest();
        return TeaModel.build(map, self);
    }

    public AdvancePurgeObjectCacheRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public AdvancePurgeObjectCacheRequest setContent(AdvancePurgeObjectCacheRequestContent content) {
        this.content = content;
        return this;
    }
    public AdvancePurgeObjectCacheRequestContent getContent() {
        return this.content;
    }

    public AdvancePurgeObjectCacheRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public AdvancePurgeObjectCacheRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public AdvancePurgeObjectCacheRequest setStations(String stations) {
        this.stations = stations;
        return this;
    }
    public String getStations() {
        return this.stations;
    }

    public AdvancePurgeObjectCacheRequest setTimeRangeBegin(Integer timeRangeBegin) {
        this.timeRangeBegin = timeRangeBegin;
        return this;
    }
    public Integer getTimeRangeBegin() {
        return this.timeRangeBegin;
    }

    public AdvancePurgeObjectCacheRequest setTimeRangeEnd(Integer timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public Integer getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public AdvancePurgeObjectCacheRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AdvancePurgeObjectCacheRequestContent extends TeaModel {
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

        @NameInMap("PurgeAll")
        public Boolean purgeAll;

        public static AdvancePurgeObjectCacheRequestContent build(java.util.Map<String, ?> map) throws Exception {
            AdvancePurgeObjectCacheRequestContent self = new AdvancePurgeObjectCacheRequestContent();
            return TeaModel.build(map, self);
        }

        public AdvancePurgeObjectCacheRequestContent setCacheTags(java.util.List<String> cacheTags) {
            this.cacheTags = cacheTags;
            return this;
        }
        public java.util.List<String> getCacheTags() {
            return this.cacheTags;
        }

        public AdvancePurgeObjectCacheRequestContent setDirectories(java.util.List<String> directories) {
            this.directories = directories;
            return this;
        }
        public java.util.List<String> getDirectories() {
            return this.directories;
        }

        public AdvancePurgeObjectCacheRequestContent setFiles(java.util.List<?> files) {
            this.files = files;
            return this;
        }
        public java.util.List<?> getFiles() {
            return this.files;
        }

        public AdvancePurgeObjectCacheRequestContent setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public AdvancePurgeObjectCacheRequestContent setIgnoreParams(java.util.List<String> ignoreParams) {
            this.ignoreParams = ignoreParams;
            return this;
        }
        public java.util.List<String> getIgnoreParams() {
            return this.ignoreParams;
        }

        public AdvancePurgeObjectCacheRequestContent setPurgeAll(Boolean purgeAll) {
            this.purgeAll = purgeAll;
            return this;
        }
        public Boolean getPurgeAll() {
            return this.purgeAll;
        }

    }

}

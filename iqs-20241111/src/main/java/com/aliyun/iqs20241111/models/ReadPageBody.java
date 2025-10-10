// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageBody extends TeaModel {
    @NameInMap("formats")
    public java.util.List<String> formats;

    @NameInMap("location")
    public String location;

    @NameInMap("maxAge")
    public Integer maxAge;

    @NameInMap("pageTimeout")
    public Integer pageTimeout;

    @NameInMap("readability")
    public ReadPageBodyReadability readability;

    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("url")
    public String url;

    public static ReadPageBody build(java.util.Map<String, ?> map) throws Exception {
        ReadPageBody self = new ReadPageBody();
        return TeaModel.build(map, self);
    }

    public ReadPageBody setFormats(java.util.List<String> formats) {
        this.formats = formats;
        return this;
    }
    public java.util.List<String> getFormats() {
        return this.formats;
    }

    public ReadPageBody setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ReadPageBody setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }
    public Integer getMaxAge() {
        return this.maxAge;
    }

    public ReadPageBody setPageTimeout(Integer pageTimeout) {
        this.pageTimeout = pageTimeout;
        return this;
    }
    public Integer getPageTimeout() {
        return this.pageTimeout;
    }

    public ReadPageBody setReadability(ReadPageBodyReadability readability) {
        this.readability = readability;
        return this;
    }
    public ReadPageBodyReadability getReadability() {
        return this.readability;
    }

    public ReadPageBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public ReadPageBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class ReadPageBodyReadability extends TeaModel {
        @NameInMap("excludeAllImages")
        public Boolean excludeAllImages;

        @NameInMap("excludeAllLinks")
        public Boolean excludeAllLinks;

        @NameInMap("excludedTags")
        public java.util.List<String> excludedTags;

        @NameInMap("readabilityMode")
        public String readabilityMode;

        public static ReadPageBodyReadability build(java.util.Map<String, ?> map) throws Exception {
            ReadPageBodyReadability self = new ReadPageBodyReadability();
            return TeaModel.build(map, self);
        }

        public ReadPageBodyReadability setExcludeAllImages(Boolean excludeAllImages) {
            this.excludeAllImages = excludeAllImages;
            return this;
        }
        public Boolean getExcludeAllImages() {
            return this.excludeAllImages;
        }

        public ReadPageBodyReadability setExcludeAllLinks(Boolean excludeAllLinks) {
            this.excludeAllLinks = excludeAllLinks;
            return this;
        }
        public Boolean getExcludeAllLinks() {
            return this.excludeAllLinks;
        }

        public ReadPageBodyReadability setExcludedTags(java.util.List<String> excludedTags) {
            this.excludedTags = excludedTags;
            return this;
        }
        public java.util.List<String> getExcludedTags() {
            return this.excludedTags;
        }

        public ReadPageBodyReadability setReadabilityMode(String readabilityMode) {
            this.readabilityMode = readabilityMode;
            return this;
        }
        public String getReadabilityMode() {
            return this.readabilityMode;
        }

    }

}

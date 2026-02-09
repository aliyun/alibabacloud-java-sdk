// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageScrapeBody extends TeaModel {
    @NameInMap("formats")
    public java.util.List<String> formats;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <strong>example:</strong>
     * <p>1296000</p>
     */
    @NameInMap("maxAge")
    public Integer maxAge;

    /**
     * <strong>example:</strong>
     * <p>15000</p>
     */
    @NameInMap("pageTimeout")
    public Integer pageTimeout;

    @NameInMap("readability")
    public ReadPageScrapeBodyReadability readability;

    /**
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
    @NameInMap("url")
    public String url;

    public static ReadPageScrapeBody build(java.util.Map<String, ?> map) throws Exception {
        ReadPageScrapeBody self = new ReadPageScrapeBody();
        return TeaModel.build(map, self);
    }

    public ReadPageScrapeBody setFormats(java.util.List<String> formats) {
        this.formats = formats;
        return this;
    }
    public java.util.List<String> getFormats() {
        return this.formats;
    }

    public ReadPageScrapeBody setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ReadPageScrapeBody setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }
    public Integer getMaxAge() {
        return this.maxAge;
    }

    public ReadPageScrapeBody setPageTimeout(Integer pageTimeout) {
        this.pageTimeout = pageTimeout;
        return this;
    }
    public Integer getPageTimeout() {
        return this.pageTimeout;
    }

    public ReadPageScrapeBody setReadability(ReadPageScrapeBodyReadability readability) {
        this.readability = readability;
        return this;
    }
    public ReadPageScrapeBodyReadability getReadability() {
        return this.readability;
    }

    public ReadPageScrapeBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public ReadPageScrapeBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class ReadPageScrapeBodyReadability extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeAllImages")
        public Boolean excludeAllImages;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeAllLinks")
        public Boolean excludeAllLinks;

        @NameInMap("excludedTags")
        public java.util.List<String> excludedTags;

        /**
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("readabilityMode")
        public String readabilityMode;

        public static ReadPageScrapeBodyReadability build(java.util.Map<String, ?> map) throws Exception {
            ReadPageScrapeBodyReadability self = new ReadPageScrapeBodyReadability();
            return TeaModel.build(map, self);
        }

        public ReadPageScrapeBodyReadability setExcludeAllImages(Boolean excludeAllImages) {
            this.excludeAllImages = excludeAllImages;
            return this;
        }
        public Boolean getExcludeAllImages() {
            return this.excludeAllImages;
        }

        public ReadPageScrapeBodyReadability setExcludeAllLinks(Boolean excludeAllLinks) {
            this.excludeAllLinks = excludeAllLinks;
            return this;
        }
        public Boolean getExcludeAllLinks() {
            return this.excludeAllLinks;
        }

        public ReadPageScrapeBodyReadability setExcludedTags(java.util.List<String> excludedTags) {
            this.excludedTags = excludedTags;
            return this;
        }
        public java.util.List<String> getExcludedTags() {
            return this.excludedTags;
        }

        public ReadPageScrapeBodyReadability setReadabilityMode(String readabilityMode) {
            this.readabilityMode = readabilityMode;
            return this;
        }
        public String getReadabilityMode() {
            return this.readabilityMode;
        }

    }

}

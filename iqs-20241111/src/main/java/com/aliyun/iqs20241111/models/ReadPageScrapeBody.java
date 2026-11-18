// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageScrapeBody extends TeaModel {
    /**
     * <p>The formats of the parsed result. Valid values:</p>
     * <ul>
     * <li>rawHtml: The HTML of the target site.</li>
     * <li>html: The page content processed based on the readabilityMode.</li>
     * <li>markdown: The Markdown content converted from the HTML.</li>
     * <li>text: The text content in the HTML.</li>
     * <li>screenshot: The screenshot of the target site.</li>
     * </ul>
     */
    @NameInMap("formats")
    public java.util.List<String> formats;

    /**
     * <p>This parameter is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>The maximum cache duration, in seconds.</p>
     * <ul>
     * <li>If the cache duration is less than the maxAge value, the cached content is returned.</li>
     * <li>If the maxAge value is set to 0, the cache is not used.</li>
     * </ul>
     * <p>Default value: 1296000.</p>
     * 
     * <strong>example:</strong>
     * <p>1296000</p>
     */
    @NameInMap("maxAge")
    public Integer maxAge;

    /**
     * <p>The timeout period for waiting for the resources of the target site to fully load. The pageTimeout value must be less than the timeout value.</p>
     * <p>Default value: 15000.</p>
     * 
     * <strong>example:</strong>
     * <p>15000</p>
     */
    @NameInMap("pageTimeout")
    public Integer pageTimeout;

    /**
     * <p>The readability configuration of the parsed result.</p>
     */
    @NameInMap("readability")
    public ReadPageScrapeBodyReadability readability;

    /**
     * <p>The end-to-end processing timeout period, in milliseconds.</p>
     * <p>Valid values: 0 to 180000.</p>
     * <p>Default value: 60000.</p>
     * 
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>The target URL to parse. It must start with http:// or https://.</p>
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
         * <p>Specifies whether to remove all images.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeAllImages")
        public Boolean excludeAllImages;

        /**
         * <p>Specifies whether to remove all links.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeAllLinks")
        public Boolean excludeAllLinks;

        /**
         * <p>The tags to exclude.</p>
         */
        @NameInMap("excludedTags")
        public java.util.List<String> excludedTags;

        /**
         * <p>The readability mode. Valid values:</p>
         * <ul>
         * <li>none: Does not remove any information. This is the default value.</li>
         * <li>normal: Removes irrelevant information from the target page, such as headers, footers, and navigation elements, based on a proprietary algorithm.</li>
         * <li>article: Extracts the main body content of the site based on a proprietary algorithm. This mode is suitable for blogs and news sites, but not for directory or navigation pages.</li>
         * </ul>
         * 
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

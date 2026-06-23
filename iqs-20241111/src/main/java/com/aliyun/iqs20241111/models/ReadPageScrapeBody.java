// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageScrapeBody extends TeaModel {
    /**
     * <p>The format of the parsing result.</p>
     * <ul>
     * <li>rawHtml: the HTML of the target site.</li>
     * <li>html: the page content processed based on readabilityMode.</li>
     * <li>markdown: the Markdown content converted from the HTML.</li>
     * <li>text: the text content extracted from the HTML.</li>
     * <li>screenshot: a screenshot of the target site.</li>
     * </ul>
     */
    @NameInMap("formats")
    public java.util.List<String> formats;

    /**
     * <p>This parameter does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>The maximum cache validity period. Unit: seconds. Default value: 1296000.</p>
     * <ol>
     * <li>If the cache duration is less than the value of maxAge, cached content is returned.</li>
     * <li>If maxAge is set to 0, caching is not used.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1296000</p>
     */
    @NameInMap("maxAge")
    public Integer maxAge;

    /**
     * <p>The timeout period for waiting for the target site resources to fully load. The value of pageTimeout must be less than the value of timeout.</p>
     * <p>Default value: 15000.</p>
     * 
     * <strong>example:</strong>
     * <p>15000</p>
     */
    @NameInMap("pageTimeout")
    public Integer pageTimeout;

    /**
     * <p>The readability configuration for the parsing result.</p>
     */
    @NameInMap("readability")
    public ReadPageScrapeBodyReadability readability;

    /**
     * <p>The end-to-end processing timeout period. Unit: ms.</p>
     * <p>Valid values: [0, 180000].</p>
     * <p>Default value: 60000.</p>
     * 
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>The target URL to parse. The URL must start with http:// or https://.</p>
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
         * <p>是否剔除所有图片</p>
         * <p>默认值：false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeAllImages")
        public Boolean excludeAllImages;

        /**
         * <p>是否剔除所有链接</p>
         * <p>默认值：false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeAllLinks")
        public Boolean excludeAllLinks;

        /**
         * <p>指定排除的标签</p>
         */
        @NameInMap("excludedTags")
        public java.util.List<String> excludedTags;

        /**
         * <p>none：不删除信息，默认为 none</p>
         * <p>normal: 基于自研算法，剔除目标页面无关信息（页头/页脚，导航等）</p>
         * <p>article: 基于自研算法，获取站点主要正文内容(适用于博客、新闻站点，不适用于目录页、导航页)</p>
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

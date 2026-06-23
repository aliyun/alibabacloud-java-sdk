// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageBody extends TeaModel {
    /**
     * <p>The format of the parsing result.</p>
     * <ul>
     * <li>rawHtml: the HTML of the target website.</li>
     * <li>html: the page content processed based on readabilityMode.</li>
     * <li>markdown: the Markdown content converted from HTML.</li>
     * <li>text: the text content extracted from HTML.</li>
     * </ul>
     */
    @NameInMap("formats")
    public java.util.List<String> formats;

    /**
     * <p>You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>The maximum cache validity period. Unit: seconds. Default value: 1296000.</p>
     * <ul>
     * <li><p>If the cache duration is less than the value of maxAge, cached content is returned.</p>
     * </li>
     * <li><p>If the value of maxAge is 0, caching is not used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1296000</p>
     */
    @NameInMap("maxAge")
    public Integer maxAge;

    /**
     * <p>The URL read timeout period. The value of pageTimeout must be less than the value of timeout.</p>
     * <p>Default value: 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("pageTimeout")
    public Integer pageTimeout;

    /**
     * <p>The readability configuration for the parsing result.</p>
     */
    @NameInMap("readability")
    public ReadPageBodyReadability readability;

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
     * <p>The target URL to parse. The value must start with http:// or https://.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://help.aliyun.com/document_detail/2837301.html?spm=a2c4g.11186623.help-menu-2837261.d_0_0_0.59ed3e95CppOt2&scm=20140722.H_2837301._.OR_help-T_cn~zh-V_1">https://help.aliyun.com/document_detail/2837301.html?spm=a2c4g.11186623.help-menu-2837261.d_0_0_0.59ed3e95CppOt2&amp;scm=20140722.H_2837301._.OR_help-T_cn~zh-V_1</a></p>
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
        /**
         * <p>Specifies whether to exclude all images.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeAllImages")
        public Boolean excludeAllImages;

        /**
         * <p>Specifies whether to exclude all links.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li><p>none: does not remove any information. Default value: none.</p>
         * </li>
         * <li><p>normal: removes irrelevant information from the target page, such as headers, footers, and navigation elements, based on a proprietary algorithm.</p>
         * </li>
         * <li><p>article: extracts the main body content of the website based on a proprietary algorithm. This mode is suitable for blogs and news websites, but not for directory or navigation pages.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
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

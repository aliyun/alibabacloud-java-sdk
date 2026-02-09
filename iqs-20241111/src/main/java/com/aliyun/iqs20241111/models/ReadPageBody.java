// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageBody extends TeaModel {
    @NameInMap("formats")
    public java.util.List<String> formats;

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
     * <p>10000</p>
     */
    @NameInMap("pageTimeout")
    public Integer pageTimeout;

    @NameInMap("readability")
    public ReadPageBodyReadability readability;

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

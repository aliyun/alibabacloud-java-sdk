// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCacheConfigsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of Static Page Caching configurations.</p>
     */
    @NameInMap("DomainCacheConfigs")
    public java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigs> domainCacheConfigs;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebCacheConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCacheConfigsResponseBody self = new DescribeWebCacheConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebCacheConfigsResponseBody setDomainCacheConfigs(java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigs> domainCacheConfigs) {
        this.domainCacheConfigs = domainCacheConfigs;
        return this;
    }
    public java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigs> getDomainCacheConfigs() {
        return this.domainCacheConfigs;
    }

    public DescribeWebCacheConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules extends TeaModel {
        /**
         * <p>The expiration time of the page cache. Unit: seconds.</p>
         */
        @NameInMap("CacheTtl")
        public Long cacheTtl;

        /**
         * <p>The cache mode. Valid values:</p>
         * <br>
         * <p>*   **standard**: The standard cache mode is used.</p>
         * <p>*   **aggressive**: The enhanced cache mode is used.</p>
         * <p>*   **bypass**: No data is cached.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path to the cached page.</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules self = new DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules();
            return TeaModel.build(map, self);
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules setCacheTtl(Long cacheTtl) {
            this.cacheTtl = cacheTtl;
            return this;
        }
        public Long getCacheTtl() {
            return this.cacheTtl;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeWebCacheConfigsResponseBodyDomainCacheConfigs extends TeaModel {
        /**
         * <p>An array that consists of custom caching rules.</p>
         */
        @NameInMap("CustomRules")
        public java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules> customRules;

        /**
         * <p>The domain name of the website.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The status of the Static Page Caching policy. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled</p>
         * <p>*   **0**: disabled</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The cache mode. Valid values:</p>
         * <br>
         * <p>*   **standard**: The standard cache mode is used.</p>
         * <p>*   **aggressive**: The enhanced cache mode is used.</p>
         * <p>*   **bypass**: No data is cached.</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static DescribeWebCacheConfigsResponseBodyDomainCacheConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCacheConfigsResponseBodyDomainCacheConfigs self = new DescribeWebCacheConfigsResponseBodyDomainCacheConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigs setCustomRules(java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules> customRules) {
            this.customRules = customRules;
            return this;
        }
        public java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules> getCustomRules() {
            return this.customRules;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigs setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigs setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}

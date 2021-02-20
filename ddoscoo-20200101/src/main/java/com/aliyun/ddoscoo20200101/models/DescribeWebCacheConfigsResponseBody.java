// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCacheConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainCacheConfigs")
    public java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigs> domainCacheConfigs;

    public static DescribeWebCacheConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCacheConfigsResponseBody self = new DescribeWebCacheConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebCacheConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebCacheConfigsResponseBody setDomainCacheConfigs(java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigs> domainCacheConfigs) {
        this.domainCacheConfigs = domainCacheConfigs;
        return this;
    }
    public java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigs> getDomainCacheConfigs() {
        return this.domainCacheConfigs;
    }

    public static class DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules extends TeaModel {
        @NameInMap("CacheTtl")
        public Long cacheTtl;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("CustomRules")
        public java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules> customRules;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Enable")
        public Integer enable;

        public static DescribeWebCacheConfigsResponseBodyDomainCacheConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCacheConfigsResponseBodyDomainCacheConfigs self = new DescribeWebCacheConfigsResponseBodyDomainCacheConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigs setCustomRules(java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules> customRules) {
            this.customRules = customRules;
            return this;
        }
        public java.util.List<DescribeWebCacheConfigsResponseBodyDomainCacheConfigsCustomRules> getCustomRules() {
            return this.customRules;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigs setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeWebCacheConfigsResponseBodyDomainCacheConfigs setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

    }

}

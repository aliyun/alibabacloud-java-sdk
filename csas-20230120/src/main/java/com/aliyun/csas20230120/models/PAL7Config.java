// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class PAL7Config extends TeaModel {
    @NameInMap("BypassConfig")
    public PAL7ConfigBypassConfig bypassConfig;

    @NameInMap("CertId")
    public String certId;

    @NameInMap("DnsConfig")
    public PAL7ConfigDnsConfig dnsConfig;

    @NameInMap("JsHookConfig")
    public PAL7ConfigJsHookConfig jsHookConfig;

    /**
     * <strong>example:</strong>
     * <p>逗号分隔的枚举值：automatic,custom</p>
     */
    @NameInMap("ProxyDomainTypes")
    public byte[] proxyDomainTypes;

    @NameInMap("RequestHeaderRewriteConfig")
    public PAL7ConfigRequestHeaderRewriteConfig requestHeaderRewriteConfig;

    @NameInMap("RequestQueryRewriteConfig")
    public PAL7ConfigRequestQueryRewriteConfig requestQueryRewriteConfig;

    @NameInMap("ResponseHeaderRewriteConfig")
    public PAL7ConfigResponseHeaderRewriteConfig responseHeaderRewriteConfig;

    @NameInMap("ResponseRewriteConfig")
    public PAL7ConfigResponseRewriteConfig responseRewriteConfig;

    public static PAL7Config build(java.util.Map<String, ?> map) throws Exception {
        PAL7Config self = new PAL7Config();
        return TeaModel.build(map, self);
    }

    public PAL7Config setBypassConfig(PAL7ConfigBypassConfig bypassConfig) {
        this.bypassConfig = bypassConfig;
        return this;
    }
    public PAL7ConfigBypassConfig getBypassConfig() {
        return this.bypassConfig;
    }

    public PAL7Config setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public PAL7Config setDnsConfig(PAL7ConfigDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public PAL7ConfigDnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public PAL7Config setJsHookConfig(PAL7ConfigJsHookConfig jsHookConfig) {
        this.jsHookConfig = jsHookConfig;
        return this;
    }
    public PAL7ConfigJsHookConfig getJsHookConfig() {
        return this.jsHookConfig;
    }

    public PAL7Config setProxyDomainTypes(byte[] proxyDomainTypes) {
        this.proxyDomainTypes = proxyDomainTypes;
        return this;
    }
    public byte[] getProxyDomainTypes() {
        return this.proxyDomainTypes;
    }

    public PAL7Config setRequestHeaderRewriteConfig(PAL7ConfigRequestHeaderRewriteConfig requestHeaderRewriteConfig) {
        this.requestHeaderRewriteConfig = requestHeaderRewriteConfig;
        return this;
    }
    public PAL7ConfigRequestHeaderRewriteConfig getRequestHeaderRewriteConfig() {
        return this.requestHeaderRewriteConfig;
    }

    public PAL7Config setRequestQueryRewriteConfig(PAL7ConfigRequestQueryRewriteConfig requestQueryRewriteConfig) {
        this.requestQueryRewriteConfig = requestQueryRewriteConfig;
        return this;
    }
    public PAL7ConfigRequestQueryRewriteConfig getRequestQueryRewriteConfig() {
        return this.requestQueryRewriteConfig;
    }

    public PAL7Config setResponseHeaderRewriteConfig(PAL7ConfigResponseHeaderRewriteConfig responseHeaderRewriteConfig) {
        this.responseHeaderRewriteConfig = responseHeaderRewriteConfig;
        return this;
    }
    public PAL7ConfigResponseHeaderRewriteConfig getResponseHeaderRewriteConfig() {
        return this.responseHeaderRewriteConfig;
    }

    public PAL7Config setResponseRewriteConfig(PAL7ConfigResponseRewriteConfig responseRewriteConfig) {
        this.responseRewriteConfig = responseRewriteConfig;
        return this;
    }
    public PAL7ConfigResponseRewriteConfig getResponseRewriteConfig() {
        return this.responseRewriteConfig;
    }

    public static class PAL7ConfigBypassConfigUrlBypassRules extends TeaModel {
        @NameInMap("Froms")
        public java.util.List<String> froms;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        public static PAL7ConfigBypassConfigUrlBypassRules build(java.util.Map<String, ?> map) throws Exception {
            PAL7ConfigBypassConfigUrlBypassRules self = new PAL7ConfigBypassConfigUrlBypassRules();
            return TeaModel.build(map, self);
        }

        public PAL7ConfigBypassConfigUrlBypassRules setFroms(java.util.List<String> froms) {
            this.froms = froms;
            return this;
        }
        public java.util.List<String> getFroms() {
            return this.froms;
        }

        public PAL7ConfigBypassConfigUrlBypassRules setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

    }

    public static class PAL7ConfigBypassConfig extends TeaModel {
        @NameInMap("AppBypassFroms")
        public java.util.List<String> appBypassFroms;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("UrlBypassRules")
        public java.util.List<PAL7ConfigBypassConfigUrlBypassRules> urlBypassRules;

        public static PAL7ConfigBypassConfig build(java.util.Map<String, ?> map) throws Exception {
            PAL7ConfigBypassConfig self = new PAL7ConfigBypassConfig();
            return TeaModel.build(map, self);
        }

        public PAL7ConfigBypassConfig setAppBypassFroms(java.util.List<String> appBypassFroms) {
            this.appBypassFroms = appBypassFroms;
            return this;
        }
        public java.util.List<String> getAppBypassFroms() {
            return this.appBypassFroms;
        }

        public PAL7ConfigBypassConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public PAL7ConfigBypassConfig setUrlBypassRules(java.util.List<PAL7ConfigBypassConfigUrlBypassRules> urlBypassRules) {
            this.urlBypassRules = urlBypassRules;
            return this;
        }
        public java.util.List<PAL7ConfigBypassConfigUrlBypassRules> getUrlBypassRules() {
            return this.urlBypassRules;
        }

    }

    public static class PAL7ConfigDnsConfig extends TeaModel {
        @NameInMap("DnsServers")
        public java.util.List<String> dnsServers;

        public static PAL7ConfigDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            PAL7ConfigDnsConfig self = new PAL7ConfigDnsConfig();
            return TeaModel.build(map, self);
        }

        public PAL7ConfigDnsConfig setDnsServers(java.util.List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public java.util.List<String> getDnsServers() {
            return this.dnsServers;
        }

    }

    public static class PAL7ConfigJsHookConfig extends TeaModel {
        @NameInMap("Mode")
        public String mode;

        @NameInMap("ReplaceRules")
        public java.util.List<PAL7ConfigReplaceRule> replaceRules;

        public static PAL7ConfigJsHookConfig build(java.util.Map<String, ?> map) throws Exception {
            PAL7ConfigJsHookConfig self = new PAL7ConfigJsHookConfig();
            return TeaModel.build(map, self);
        }

        public PAL7ConfigJsHookConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public PAL7ConfigJsHookConfig setReplaceRules(java.util.List<PAL7ConfigReplaceRule> replaceRules) {
            this.replaceRules = replaceRules;
            return this;
        }
        public java.util.List<PAL7ConfigReplaceRule> getReplaceRules() {
            return this.replaceRules;
        }

    }

    public static class PAL7ConfigRequestHeaderRewriteConfig extends TeaModel {
        @NameInMap("Ops")
        public java.util.List<PAL7ConfigRewriteOp> ops;

        public static PAL7ConfigRequestHeaderRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            PAL7ConfigRequestHeaderRewriteConfig self = new PAL7ConfigRequestHeaderRewriteConfig();
            return TeaModel.build(map, self);
        }

        public PAL7ConfigRequestHeaderRewriteConfig setOps(java.util.List<PAL7ConfigRewriteOp> ops) {
            this.ops = ops;
            return this;
        }
        public java.util.List<PAL7ConfigRewriteOp> getOps() {
            return this.ops;
        }

    }

    public static class PAL7ConfigRequestQueryRewriteConfig extends TeaModel {
        @NameInMap("Ops")
        public java.util.List<PAL7ConfigRewriteOp> ops;

        public static PAL7ConfigRequestQueryRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            PAL7ConfigRequestQueryRewriteConfig self = new PAL7ConfigRequestQueryRewriteConfig();
            return TeaModel.build(map, self);
        }

        public PAL7ConfigRequestQueryRewriteConfig setOps(java.util.List<PAL7ConfigRewriteOp> ops) {
            this.ops = ops;
            return this;
        }
        public java.util.List<PAL7ConfigRewriteOp> getOps() {
            return this.ops;
        }

    }

    public static class PAL7ConfigResponseHeaderRewriteConfig extends TeaModel {
        @NameInMap("Ops")
        public java.util.List<PAL7ConfigRewriteOp> ops;

        public static PAL7ConfigResponseHeaderRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            PAL7ConfigResponseHeaderRewriteConfig self = new PAL7ConfigResponseHeaderRewriteConfig();
            return TeaModel.build(map, self);
        }

        public PAL7ConfigResponseHeaderRewriteConfig setOps(java.util.List<PAL7ConfigRewriteOp> ops) {
            this.ops = ops;
            return this;
        }
        public java.util.List<PAL7ConfigRewriteOp> getOps() {
            return this.ops;
        }

    }

    public static class PAL7ConfigResponseRewriteConfig extends TeaModel {
        @NameInMap("Mode")
        public String mode;

        @NameInMap("ReplaceRules")
        public java.util.List<PAL7ConfigReplaceRule> replaceRules;

        public static PAL7ConfigResponseRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            PAL7ConfigResponseRewriteConfig self = new PAL7ConfigResponseRewriteConfig();
            return TeaModel.build(map, self);
        }

        public PAL7ConfigResponseRewriteConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public PAL7ConfigResponseRewriteConfig setReplaceRules(java.util.List<PAL7ConfigReplaceRule> replaceRules) {
            this.replaceRules = replaceRules;
            return this;
        }
        public java.util.List<PAL7ConfigReplaceRule> getReplaceRules() {
            return this.replaceRules;
        }

    }

}

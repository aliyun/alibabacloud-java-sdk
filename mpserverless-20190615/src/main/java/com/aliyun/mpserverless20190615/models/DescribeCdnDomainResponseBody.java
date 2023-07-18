// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainResponseBody extends TeaModel {
    @NameInMap("AuthConfig")
    public DescribeCdnDomainResponseBodyAuthConfig authConfig;

    @NameInMap("CorsConfig")
    public DescribeCdnDomainResponseBodyCorsConfig corsConfig;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("IpConfig")
    public DescribeCdnDomainResponseBodyIpConfig ipConfig;

    @NameInMap("RefererConfig")
    public DescribeCdnDomainResponseBodyRefererConfig refererConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceStatus")
    public String serviceStatus;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("UaConfig")
    public DescribeCdnDomainResponseBodyUaConfig uaConfig;

    public static DescribeCdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainResponseBody self = new DescribeCdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainResponseBody setAuthConfig(DescribeCdnDomainResponseBodyAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public DescribeCdnDomainResponseBodyAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public DescribeCdnDomainResponseBody setCorsConfig(DescribeCdnDomainResponseBodyCorsConfig corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }
    public DescribeCdnDomainResponseBodyCorsConfig getCorsConfig() {
        return this.corsConfig;
    }

    public DescribeCdnDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnDomainResponseBody setIpConfig(DescribeCdnDomainResponseBodyIpConfig ipConfig) {
        this.ipConfig = ipConfig;
        return this;
    }
    public DescribeCdnDomainResponseBodyIpConfig getIpConfig() {
        return this.ipConfig;
    }

    public DescribeCdnDomainResponseBody setRefererConfig(DescribeCdnDomainResponseBodyRefererConfig refererConfig) {
        this.refererConfig = refererConfig;
        return this;
    }
    public DescribeCdnDomainResponseBodyRefererConfig getRefererConfig() {
        return this.refererConfig;
    }

    public DescribeCdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnDomainResponseBody setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public DescribeCdnDomainResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeCdnDomainResponseBody setUaConfig(DescribeCdnDomainResponseBodyUaConfig uaConfig) {
        this.uaConfig = uaConfig;
        return this;
    }
    public DescribeCdnDomainResponseBodyUaConfig getUaConfig() {
        return this.uaConfig;
    }

    public static class DescribeCdnDomainResponseBodyAuthConfig extends TeaModel {
        @NameInMap("AuthDelta")
        public Integer authDelta;

        @NameInMap("AuthKey")
        public String authKey;

        @NameInMap("AuthType")
        public String authType;

        @NameInMap("configId")
        public String configId;

        public static DescribeCdnDomainResponseBodyAuthConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainResponseBodyAuthConfig self = new DescribeCdnDomainResponseBodyAuthConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainResponseBodyAuthConfig setAuthDelta(Integer authDelta) {
            this.authDelta = authDelta;
            return this;
        }
        public Integer getAuthDelta() {
            return this.authDelta;
        }

        public DescribeCdnDomainResponseBodyAuthConfig setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeCdnDomainResponseBodyAuthConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeCdnDomainResponseBodyAuthConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

    }

    public static class DescribeCdnDomainResponseBodyCorsConfig extends TeaModel {
        @NameInMap("AccessOriginControl")
        public Boolean accessOriginControl;

        @NameInMap("AllowOrigin")
        public String allowOrigin;

        @NameInMap("ConfigId")
        public String configId;

        public static DescribeCdnDomainResponseBodyCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainResponseBodyCorsConfig self = new DescribeCdnDomainResponseBodyCorsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainResponseBodyCorsConfig setAccessOriginControl(Boolean accessOriginControl) {
            this.accessOriginControl = accessOriginControl;
            return this;
        }
        public Boolean getAccessOriginControl() {
            return this.accessOriginControl;
        }

        public DescribeCdnDomainResponseBodyCorsConfig setAllowOrigin(String allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public String getAllowOrigin() {
            return this.allowOrigin;
        }

        public DescribeCdnDomainResponseBodyCorsConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

    }

    public static class DescribeCdnDomainResponseBodyIpConfig extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("IpList")
        public String ipList;

        @NameInMap("Type")
        public String type;

        public static DescribeCdnDomainResponseBodyIpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainResponseBodyIpConfig self = new DescribeCdnDomainResponseBodyIpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainResponseBodyIpConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCdnDomainResponseBodyIpConfig setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

        public DescribeCdnDomainResponseBodyIpConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCdnDomainResponseBodyRefererConfig extends TeaModel {
        @NameInMap("AllowEmpty")
        public String allowEmpty;

        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("DisableAst")
        public String disableAst;

        @NameInMap("ReferList")
        public String referList;

        @NameInMap("Type")
        public String type;

        public static DescribeCdnDomainResponseBodyRefererConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainResponseBodyRefererConfig self = new DescribeCdnDomainResponseBodyRefererConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainResponseBodyRefererConfig setAllowEmpty(String allowEmpty) {
            this.allowEmpty = allowEmpty;
            return this;
        }
        public String getAllowEmpty() {
            return this.allowEmpty;
        }

        public DescribeCdnDomainResponseBodyRefererConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCdnDomainResponseBodyRefererConfig setDisableAst(String disableAst) {
            this.disableAst = disableAst;
            return this;
        }
        public String getDisableAst() {
            return this.disableAst;
        }

        public DescribeCdnDomainResponseBodyRefererConfig setReferList(String referList) {
            this.referList = referList;
            return this;
        }
        public String getReferList() {
            return this.referList;
        }

        public DescribeCdnDomainResponseBodyRefererConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCdnDomainResponseBodyUaConfig extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UaList")
        public String uaList;

        public static DescribeCdnDomainResponseBodyUaConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainResponseBodyUaConfig self = new DescribeCdnDomainResponseBodyUaConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainResponseBodyUaConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCdnDomainResponseBodyUaConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCdnDomainResponseBodyUaConfig setUaList(String uaList) {
            this.uaList = uaList;
            return this;
        }
        public String getUaList() {
            return this.uaList;
        }

    }

}

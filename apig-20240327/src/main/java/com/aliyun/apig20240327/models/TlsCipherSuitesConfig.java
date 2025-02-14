// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class TlsCipherSuitesConfig extends TeaModel {
    @NameInMap("configType")
    public String configType;

    @NameInMap("tlsCipherSuite")
    public java.util.List<TlsCipherSuitesConfigTlsCipherSuite> tlsCipherSuite;

    public static TlsCipherSuitesConfig build(java.util.Map<String, ?> map) throws Exception {
        TlsCipherSuitesConfig self = new TlsCipherSuitesConfig();
        return TeaModel.build(map, self);
    }

    public TlsCipherSuitesConfig setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public TlsCipherSuitesConfig setTlsCipherSuite(java.util.List<TlsCipherSuitesConfigTlsCipherSuite> tlsCipherSuite) {
        this.tlsCipherSuite = tlsCipherSuite;
        return this;
    }
    public java.util.List<TlsCipherSuitesConfigTlsCipherSuite> getTlsCipherSuite() {
        return this.tlsCipherSuite;
    }

    public static class TlsCipherSuitesConfigTlsCipherSuite extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("supportVersions")
        public java.util.List<String> supportVersions;

        public static TlsCipherSuitesConfigTlsCipherSuite build(java.util.Map<String, ?> map) throws Exception {
            TlsCipherSuitesConfigTlsCipherSuite self = new TlsCipherSuitesConfigTlsCipherSuite();
            return TeaModel.build(map, self);
        }

        public TlsCipherSuitesConfigTlsCipherSuite setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TlsCipherSuitesConfigTlsCipherSuite setSupportVersions(java.util.List<String> supportVersions) {
            this.supportVersions = supportVersions;
            return this;
        }
        public java.util.List<String> getSupportVersions() {
            return this.supportVersions;
        }

    }

}

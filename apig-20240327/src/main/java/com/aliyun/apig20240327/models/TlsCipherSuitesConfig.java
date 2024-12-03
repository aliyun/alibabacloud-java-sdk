// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class TlsCipherSuitesConfig extends TeaModel {
    @NameInMap("cipherSuites")
    public java.util.List<TlsCipherSuitesConfigCipherSuites> cipherSuites;

    @NameInMap("configType")
    public String configType;

    public static TlsCipherSuitesConfig build(java.util.Map<String, ?> map) throws Exception {
        TlsCipherSuitesConfig self = new TlsCipherSuitesConfig();
        return TeaModel.build(map, self);
    }

    public TlsCipherSuitesConfig setCipherSuites(java.util.List<TlsCipherSuitesConfigCipherSuites> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }
    public java.util.List<TlsCipherSuitesConfigCipherSuites> getCipherSuites() {
        return this.cipherSuites;
    }

    public TlsCipherSuitesConfig setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public static class TlsCipherSuitesConfigCipherSuites extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("supportVersions")
        public java.util.List<String> supportVersions;

        public static TlsCipherSuitesConfigCipherSuites build(java.util.Map<String, ?> map) throws Exception {
            TlsCipherSuitesConfigCipherSuites self = new TlsCipherSuitesConfigCipherSuites();
            return TeaModel.build(map, self);
        }

        public TlsCipherSuitesConfigCipherSuites setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TlsCipherSuitesConfigCipherSuites setSupportVersions(java.util.List<String> supportVersions) {
            this.supportVersions = supportVersions;
            return this;
        }
        public java.util.List<String> getSupportVersions() {
            return this.supportVersions;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class TLSConfig extends TeaModel {
    /**
     * <p>TLS 加密套件列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;TLS_RSA_WITH_RC4_128_SHA&quot;]</p>
     */
    @NameInMap("cipherSuites")
    public java.util.List<String> cipherSuites;

    /**
     * <p>TLS 最大版本号。</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.3</p>
     */
    @NameInMap("maxVersion")
    public String maxVersion;

    /**
     * <p>TLS 最小版本号。</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.2</p>
     */
    @NameInMap("minVersion")
    public String minVersion;

    public static TLSConfig build(java.util.Map<String, ?> map) throws Exception {
        TLSConfig self = new TLSConfig();
        return TeaModel.build(map, self);
    }

    public TLSConfig setCipherSuites(java.util.List<String> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }
    public java.util.List<String> getCipherSuites() {
        return this.cipherSuites;
    }

    public TLSConfig setMaxVersion(String maxVersion) {
        this.maxVersion = maxVersion;
        return this;
    }
    public String getMaxVersion() {
        return this.maxVersion;
    }

    public TLSConfig setMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }
    public String getMinVersion() {
        return this.minVersion;
    }

}

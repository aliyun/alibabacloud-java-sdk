// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class TLSConfig extends TeaModel {
    /**
     * <p>The list of allowed TLS cipher suites.</p>
     */
    @NameInMap("cipherSuites")
    public java.util.List<String> cipherSuites;

    /**
     * <p>The maximum allowed TLS version.</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.3</p>
     */
    @NameInMap("maxVersion")
    public String maxVersion;

    /**
     * <p>The minimum allowed TLS version.</p>
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

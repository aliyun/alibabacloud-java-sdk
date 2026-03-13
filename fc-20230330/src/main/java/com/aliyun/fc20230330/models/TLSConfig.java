// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TLSConfig extends TeaModel {
    /**
     * <p>The TLS cipher suites.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("cipherSuites")
    public java.util.List<String> cipherSuites;

    /**
     * <p>The maximum TLS version. Valid values: TLSv1.3 and TLSv1.2.</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.3</p>
     */
    @NameInMap("maxVersion")
    public String maxVersion;

    /**
     * <p>The minimum TLS version. Valid values: TLSv1.3 and TLSv1.2.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.0</p>
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

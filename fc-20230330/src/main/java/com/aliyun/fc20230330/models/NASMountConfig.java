// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class NASMountConfig extends TeaModel {
    /**
     * <p>Specifies whether to use the Transport Layer Security (TLS) protocol to secure data transmission. Note: Only General-purpose NAS supports transmission encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableTLS")
    public Boolean enableTLS;

    /**
     * <p>The local mount directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/test</p>
     */
    @NameInMap("mountDir")
    public String mountDir;

    /**
     * <p>The address of a NAS server.</p>
     * 
     * <strong>example:</strong>
     * <p>***-uni85.cn-hangzhou.nas.com:/</p>
     */
    @NameInMap("serverAddr")
    public String serverAddr;

    public static NASMountConfig build(java.util.Map<String, ?> map) throws Exception {
        NASMountConfig self = new NASMountConfig();
        return TeaModel.build(map, self);
    }

    public NASMountConfig setEnableTLS(Boolean enableTLS) {
        this.enableTLS = enableTLS;
        return this;
    }
    public Boolean getEnableTLS() {
        return this.enableTLS;
    }

    public NASMountConfig setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public NASMountConfig setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
        return this;
    }
    public String getServerAddr() {
        return this.serverAddr;
    }

}

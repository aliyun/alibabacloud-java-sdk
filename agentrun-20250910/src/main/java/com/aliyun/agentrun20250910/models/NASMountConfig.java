// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class NASMountConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable encryption in transit. This option is supported only for general-purpose NAS.</p>
     */
    @NameInMap("enableTLS")
    public Boolean enableTLS;

    /**
     * <p>Specifies the local mount directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/test</p>
     */
    @NameInMap("mountDir")
    public String mountDir;

    /**
     * <p>Specifies the NAS server address.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PolarFsMountConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pfs-cn-6sa48a6gk001</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("mountDir")
    public String mountDir;

    /**
     * <strong>example:</strong>
     * <p>/mnt/pfs</p>
     */
    @NameInMap("remoteDir")
    public String remoteDir;

    public static PolarFsMountConfig build(java.util.Map<String, ?> map) throws Exception {
        PolarFsMountConfig self = new PolarFsMountConfig();
        return TeaModel.build(map, self);
    }

    public PolarFsMountConfig setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PolarFsMountConfig setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public PolarFsMountConfig setRemoteDir(String remoteDir) {
        this.remoteDir = remoteDir;
        return this;
    }
    public String getRemoteDir() {
        return this.remoteDir;
    }

}

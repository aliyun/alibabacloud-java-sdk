// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PolarFsMountConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>--skip-delete-rows-check=false  --skip-dir-nlink=0</p>
     */
    @NameInMap("extraOptions")
    public String extraOptions;

    /**
     * <p>The ID of the PolarFS file system instance to mount.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The local mount directory in the function\&quot;s runtime environment.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/polarfs</p>
     */
    @NameInMap("mountDir")
    public String mountDir;

    /**
     * <p>Specifies whether the file system is mounted as read-only. If <code>true</code>, write operations are prohibited.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("readOnly")
    public Boolean readOnly;

    /**
     * <p>The directory within the PolarFS file system to mount.</p>
     * 
     * <strong>example:</strong>
     * <p>/share</p>
     */
    @NameInMap("remoteDir")
    public String remoteDir;

    public static PolarFsMountConfig build(java.util.Map<String, ?> map) throws Exception {
        PolarFsMountConfig self = new PolarFsMountConfig();
        return TeaModel.build(map, self);
    }

    public PolarFsMountConfig setExtraOptions(String extraOptions) {
        this.extraOptions = extraOptions;
        return this;
    }
    public String getExtraOptions() {
        return this.extraOptions;
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

    public PolarFsMountConfig setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public PolarFsMountConfig setRemoteDir(String remoteDir) {
        this.remoteDir = remoteDir;
        return this;
    }
    public String getRemoteDir() {
        return this.remoteDir;
    }

}

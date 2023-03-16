// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class MountNFSRequest extends TeaModel {
    /**
     * <p>The ID of the visualization instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The local mount directory.</p>
     */
    @NameInMap("MountDir")
    public String mountDir;

    /**
     * <p>The address of the mount target.</p>
     */
    @NameInMap("NfsDir")
    public String nfsDir;

    /**
     * <p>The type of the protocol. Valid values:</p>
     * <br>
     * <p>*   nfs</p>
     * <p>*   smb</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The remote mount address.</p>
     */
    @NameInMap("RemoteDir")
    public String remoteDir;

    public static MountNFSRequest build(java.util.Map<String, ?> map) throws Exception {
        MountNFSRequest self = new MountNFSRequest();
        return TeaModel.build(map, self);
    }

    public MountNFSRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MountNFSRequest setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public MountNFSRequest setNfsDir(String nfsDir) {
        this.nfsDir = nfsDir;
        return this;
    }
    public String getNfsDir() {
        return this.nfsDir;
    }

    public MountNFSRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public MountNFSRequest setRemoteDir(String remoteDir) {
        this.remoteDir = remoteDir;
        return this;
    }
    public String getRemoteDir() {
        return this.remoteDir;
    }

}

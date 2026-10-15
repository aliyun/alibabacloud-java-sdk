// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class AgenticFSVolumeConfig extends TeaModel {
    /**
     * <p>The group ID (GID) for accessing the mounted directory in the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("groupID")
    public Integer groupID;

    /**
     * <p>The service address of the AgenticFS access point.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-12345678.fs-12345678-abc.cn-hangzhou.nas.aliyuncs.com:/</p>
     */
    @NameInMap("serverAddr")
    public String serverAddr;

    /**
     * <p>The user ID (UID) for accessing the mounted directory in the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("userID")
    public Integer userID;

    public static AgenticFSVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
        AgenticFSVolumeConfig self = new AgenticFSVolumeConfig();
        return TeaModel.build(map, self);
    }

    public AgenticFSVolumeConfig setGroupID(Integer groupID) {
        this.groupID = groupID;
        return this;
    }
    public Integer getGroupID() {
        return this.groupID;
    }

    public AgenticFSVolumeConfig setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
        return this;
    }
    public String getServerAddr() {
        return this.serverAddr;
    }

    public AgenticFSVolumeConfig setUserID(Integer userID) {
        this.userID = userID;
        return this;
    }
    public Integer getUserID() {
        return this.userID;
    }

}

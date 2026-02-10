// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PolarFsConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("groupId")
    public Integer groupId;

    @NameInMap("mountPoints")
    public java.util.List<PolarFsMountConfig> mountPoints;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("userId")
    public Integer userId;

    public static PolarFsConfig build(java.util.Map<String, ?> map) throws Exception {
        PolarFsConfig self = new PolarFsConfig();
        return TeaModel.build(map, self);
    }

    public PolarFsConfig setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
    public Integer getGroupId() {
        return this.groupId;
    }

    public PolarFsConfig setMountPoints(java.util.List<PolarFsMountConfig> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<PolarFsMountConfig> getMountPoints() {
        return this.mountPoints;
    }

    public PolarFsConfig setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
    public Integer getUserId() {
        return this.userId;
    }

}

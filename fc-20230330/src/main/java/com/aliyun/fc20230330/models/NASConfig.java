// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class NASConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("groupId")
    public Integer groupId;

    @NameInMap("mountPoints")
    public java.util.List<NASMountConfig> mountPoints;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("userId")
    public Integer userId;

    public static NASConfig build(java.util.Map<String, ?> map) throws Exception {
        NASConfig self = new NASConfig();
        return TeaModel.build(map, self);
    }

    public NASConfig setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
    public Integer getGroupId() {
        return this.groupId;
    }

    public NASConfig setMountPoints(java.util.List<NASMountConfig> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<NASMountConfig> getMountPoints() {
        return this.mountPoints;
    }

    public NASConfig setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
    public Integer getUserId() {
        return this.userId;
    }

}

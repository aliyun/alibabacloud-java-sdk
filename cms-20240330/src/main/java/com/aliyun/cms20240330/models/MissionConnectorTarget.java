// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MissionConnectorTarget extends TeaModel {
    /**
     * <p>The display name of the IM contact or group.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert notification group</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The case-sensitive ID of the IM contact or group.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The recipient type. Valid values: user for a user, and group for a group.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static MissionConnectorTarget build(java.util.Map<String, ?> map) throws Exception {
        MissionConnectorTarget self = new MissionConnectorTarget();
        return TeaModel.build(map, self);
    }

    public MissionConnectorTarget setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public MissionConnectorTarget setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public MissionConnectorTarget setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}

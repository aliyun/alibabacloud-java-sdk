// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteUsersShrinkRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserNames")
    public String userNamesShrink;

    public static DeleteUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersShrinkRequest self = new DeleteUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsersShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteUsersShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteUsersShrinkRequest setUserNamesShrink(String userNamesShrink) {
        this.userNamesShrink = userNamesShrink;
        return this;
    }
    public String getUserNamesShrink() {
        return this.userNamesShrink;
    }

}

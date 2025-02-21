// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateUserAttributeRequest extends TeaModel {
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
     * <p>用户备注。</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>用户密码。</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>区域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>用户ID。</p>
     * 
     * <strong>example:</strong>
     * <p>125046002175****</p>
     */
    @NameInMap("UserId")
    @Deprecated
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>yun****</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateUserAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAttributeRequest self = new UpdateUserAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserAttributeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateUserAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserAttributeRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateUserAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    @Deprecated
    public UpdateUserAttributeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateUserAttributeRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}

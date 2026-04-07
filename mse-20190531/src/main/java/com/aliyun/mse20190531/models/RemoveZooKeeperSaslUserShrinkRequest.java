// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RemoveZooKeeperSaslUserShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reload")
    public Boolean reload;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserNames")
    public String userNamesShrink;

    public static RemoveZooKeeperSaslUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveZooKeeperSaslUserShrinkRequest self = new RemoveZooKeeperSaslUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveZooKeeperSaslUserShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public RemoveZooKeeperSaslUserShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveZooKeeperSaslUserShrinkRequest setReload(Boolean reload) {
        this.reload = reload;
        return this;
    }
    public Boolean getReload() {
        return this.reload;
    }

    public RemoveZooKeeperSaslUserShrinkRequest setUserNamesShrink(String userNamesShrink) {
        this.userNamesShrink = userNamesShrink;
        return this;
    }
    public String getUserNamesShrink() {
        return this.userNamesShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddZooKeeperSaslUserShrinkRequest extends TeaModel {
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
     * <p>mse-cn-st21ri2****</p>
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
    @NameInMap("SaslUser")
    public String saslUserShrink;

    public static AddZooKeeperSaslUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddZooKeeperSaslUserShrinkRequest self = new AddZooKeeperSaslUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddZooKeeperSaslUserShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddZooKeeperSaslUserShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddZooKeeperSaslUserShrinkRequest setReload(Boolean reload) {
        this.reload = reload;
        return this;
    }
    public Boolean getReload() {
        return this.reload;
    }

    public AddZooKeeperSaslUserShrinkRequest setSaslUserShrink(String saslUserShrink) {
        this.saslUserShrink = saslUserShrink;
        return this;
    }
    public String getSaslUserShrink() {
        return this.saslUserShrink;
    }

}

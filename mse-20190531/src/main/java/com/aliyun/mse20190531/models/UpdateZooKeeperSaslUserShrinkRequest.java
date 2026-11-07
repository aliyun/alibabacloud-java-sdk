// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateZooKeeperSaslUserShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-tl327w****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the changes take effect immediately.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reload")
    public Boolean reload;

    /**
     * <p>The list of SASL users to update.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SaslUser")
    public String saslUserShrink;

    public static UpdateZooKeeperSaslUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateZooKeeperSaslUserShrinkRequest self = new UpdateZooKeeperSaslUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateZooKeeperSaslUserShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateZooKeeperSaslUserShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateZooKeeperSaslUserShrinkRequest setReload(Boolean reload) {
        this.reload = reload;
        return this;
    }
    public Boolean getReload() {
        return this.reload;
    }

    public UpdateZooKeeperSaslUserShrinkRequest setSaslUserShrink(String saslUserShrink) {
        this.saslUserShrink = saslUserShrink;
        return this;
    }
    public String getSaslUserShrink() {
        return this.saslUserShrink;
    }

}

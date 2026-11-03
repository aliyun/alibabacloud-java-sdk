// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceSettingsRequest extends TeaModel {
    /**
     * <p>The YML file configuration information of the instance.</p>
     */
    @NameInMap("esConfig")
    public java.util.Map<String, String> esConfig;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must ensure that the value is unique among different requests. The value can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to force the change.</p>
     */
    @NameInMap("force")
    public Boolean force;

    /**
     * <p>The change strategy for Elasticsearch, such as the change method during index updates, cluster upgrades, or service deployments. Valid values:</p>
     * <ul>
     * <li>blue_green: Blue-green change. You can run two identical environments (blue and green) in parallel to achieve seamless switching.</li>
     * <li>normal: In-place change. Changes are applied directly to the current environment (such as upgrades or scaling) without requiring additional resources.</li>
     * <li>intelligent: Intelligent change. The system automatically analyzes the change type and environment status to dynamically select the optimal change method (blue-green change or in-place change).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("updateStrategy")
    public String updateStrategy;

    public static UpdateInstanceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSettingsRequest self = new UpdateInstanceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSettingsRequest setEsConfig(java.util.Map<String, String> esConfig) {
        this.esConfig = esConfig;
        return this;
    }
    public java.util.Map<String, String> getEsConfig() {
        return this.esConfig;
    }

    public UpdateInstanceSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateInstanceSettingsRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public UpdateInstanceSettingsRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

}

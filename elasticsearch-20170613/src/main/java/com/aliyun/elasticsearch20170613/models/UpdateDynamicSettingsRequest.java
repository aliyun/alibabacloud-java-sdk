// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDynamicSettingsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the Elasticsearch instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The dynamic configurations of the cluster to be updated. Specify a JSON object where the keys are configuration item names and the values are configuration values.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;indices.recovery.max_bytes_per_sec&quot;:&quot;100mb&quot;}</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The effective mode for dynamic configurations. Valid values:</p>
     * <ul>
     * <li>persistent: persistent configurations.</li>
     * <li>transient: temporary configurations, which become invalid after the cluster is restarted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>persistent</p>
     */
    @NameInMap("mode")
    public String mode;

    public static UpdateDynamicSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDynamicSettingsRequest self = new UpdateDynamicSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDynamicSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDynamicSettingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDynamicSettingsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateDynamicSettingsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}

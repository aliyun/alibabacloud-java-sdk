// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDynamicSettingsRequest extends TeaModel {
    /**
     * <p>A client token used to ensure the idempotency of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the region where the instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request body, which contains the dynamic settings to be updated.</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The update mode for the dynamic settings.</p>
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

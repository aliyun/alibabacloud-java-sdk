// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePushReviewOnOffRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("trunkMode")
    public Boolean trunkMode;

    public static UpdatePushReviewOnOffRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePushReviewOnOffRequest self = new UpdatePushReviewOnOffRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePushReviewOnOffRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public UpdatePushReviewOnOffRequest setTrunkMode(Boolean trunkMode) {
        this.trunkMode = trunkMode;
        return this;
    }
    public Boolean getTrunkMode() {
        return this.trunkMode;
    }

}

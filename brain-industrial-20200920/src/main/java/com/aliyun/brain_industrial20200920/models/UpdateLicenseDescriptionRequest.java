// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class UpdateLicenseDescriptionRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>brainindustrial_aicsruntime_public_cn-mdu3ps3kw04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateLicenseDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLicenseDescriptionRequest self = new UpdateLicenseDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLicenseDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLicenseDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

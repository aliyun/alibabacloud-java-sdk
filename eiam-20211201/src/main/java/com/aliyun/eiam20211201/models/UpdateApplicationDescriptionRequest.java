// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationDescriptionRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The description of the application.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateApplicationDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationDescriptionRequest self = new UpdateApplicationDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationDescriptionRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

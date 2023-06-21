// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationClientSecretsRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to query.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListApplicationClientSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationClientSecretsRequest self = new ListApplicationClientSecretsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationClientSecretsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListApplicationClientSecretsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

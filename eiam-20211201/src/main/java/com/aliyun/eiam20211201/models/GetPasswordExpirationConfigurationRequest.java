// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordExpirationConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetPasswordExpirationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordExpirationConfigurationRequest self = new GetPasswordExpirationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetPasswordExpirationConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

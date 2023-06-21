// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordInitializationConfigurationRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetPasswordInitializationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordInitializationConfigurationRequest self = new GetPasswordInitializationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetPasswordInitializationConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

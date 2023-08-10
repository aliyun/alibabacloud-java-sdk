// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetForgetPasswordConfigurationRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetForgetPasswordConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetForgetPasswordConfigurationRequest self = new GetForgetPasswordConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetForgetPasswordConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

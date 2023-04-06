// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordHistoryConfigurationRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetPasswordHistoryConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordHistoryConfigurationRequest self = new GetPasswordHistoryConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetPasswordHistoryConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

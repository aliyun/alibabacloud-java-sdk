// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetConfigurationVariateRequest extends TeaModel {
    @NameInMap("ConfigurationVariateId")
    public String configurationVariateId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetConfigurationVariateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationVariateRequest self = new GetConfigurationVariateRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigurationVariateRequest setConfigurationVariateId(String configurationVariateId) {
        this.configurationVariateId = configurationVariateId;
        return this;
    }
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    public GetConfigurationVariateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteConfigurationVariateRequest extends TeaModel {
    @NameInMap("ConfigurationVariateId")
    public String configurationVariateId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteConfigurationVariateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationVariateRequest self = new DeleteConfigurationVariateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationVariateRequest setConfigurationVariateId(String configurationVariateId) {
        this.configurationVariateId = configurationVariateId;
        return this;
    }
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    public DeleteConfigurationVariateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

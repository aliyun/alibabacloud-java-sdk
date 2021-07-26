// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteConfigurationSpecificationRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("ConfigurationSpecificationId")
    public String configurationSpecificationId;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteConfigurationSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationSpecificationRequest self = new DeleteConfigurationSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationSpecificationRequest setConfigurationSpecificationId(String configurationSpecificationId) {
        this.configurationSpecificationId = configurationSpecificationId;
        return this;
    }
    public String getConfigurationSpecificationId() {
        return this.configurationSpecificationId;
    }

    public DeleteConfigurationSpecificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

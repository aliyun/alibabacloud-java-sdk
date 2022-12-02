// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetConfigurationSpecificationRequest extends TeaModel {
    @NameInMap("ConfigurationSpecificationId")
    public String configurationSpecificationId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetConfigurationSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationSpecificationRequest self = new GetConfigurationSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigurationSpecificationRequest setConfigurationSpecificationId(String configurationSpecificationId) {
        this.configurationSpecificationId = configurationSpecificationId;
        return this;
    }
    public String getConfigurationSpecificationId() {
        return this.configurationSpecificationId;
    }

    public GetConfigurationSpecificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

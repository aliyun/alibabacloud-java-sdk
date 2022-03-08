// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateConfigurationVariateResponseBody extends TeaModel {
    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("ConfigurationVariateId")
    public String configurationVariateId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConfigurationVariateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationVariateResponseBody self = new CreateConfigurationVariateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationVariateResponseBody setConfigurationVariateId(String configurationVariateId) {
        this.configurationVariateId = configurationVariateId;
        return this;
    }
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    public CreateConfigurationVariateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

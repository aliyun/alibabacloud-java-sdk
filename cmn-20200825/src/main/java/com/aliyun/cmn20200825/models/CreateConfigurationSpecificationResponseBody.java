// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateConfigurationSpecificationResponseBody extends TeaModel {
    // 资源uuid
    @NameInMap("ConfigurationSpecificationId")
    public String configurationSpecificationId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConfigurationSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationSpecificationResponseBody self = new CreateConfigurationSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationSpecificationResponseBody setConfigurationSpecificationId(String configurationSpecificationId) {
        this.configurationSpecificationId = configurationSpecificationId;
        return this;
    }
    public String getConfigurationSpecificationId() {
        return this.configurationSpecificationId;
    }

    public CreateConfigurationSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

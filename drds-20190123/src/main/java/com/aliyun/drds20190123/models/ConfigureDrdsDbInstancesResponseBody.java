// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ConfigureDrdsDbInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ConfigureDrdsDbInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigureDrdsDbInstancesResponseBody self = new ConfigureDrdsDbInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigureDrdsDbInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigureDrdsDbInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

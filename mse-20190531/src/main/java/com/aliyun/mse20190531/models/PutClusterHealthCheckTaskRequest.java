// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class PutClusterHealthCheckTaskRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    public static PutClusterHealthCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PutClusterHealthCheckTaskRequest self = new PutClusterHealthCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public PutClusterHealthCheckTaskRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public PutClusterHealthCheckTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

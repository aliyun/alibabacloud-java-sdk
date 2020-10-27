// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartElasticityAssuranceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StartElasticityAssuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartElasticityAssuranceResponse self = new StartElasticityAssuranceResponse();
        return TeaModel.build(map, self);
    }

    public StartElasticityAssuranceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartElasticityAssuranceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartElasticityAssuranceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartElasticityAssuranceResponseBody self = new StartElasticityAssuranceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartElasticityAssuranceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyElasticityAssuranceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticityAssuranceResponseBody self = new ModifyElasticityAssuranceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticityAssuranceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

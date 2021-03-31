// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyElasticityAssuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticityAssuranceResponse self = new ModifyElasticityAssuranceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticityAssuranceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

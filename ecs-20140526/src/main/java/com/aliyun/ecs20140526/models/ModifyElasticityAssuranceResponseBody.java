// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8455DD10-84F8-43C9-8365-5F448EB169B6</p>
     */
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

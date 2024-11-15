// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class CreateAccountFactoryBaselineResponseBody extends TeaModel {
    /**
     * <p>The baseline ID.</p>
     * 
     * <strong>example:</strong>
     * <p>afb-bp1e6ixtiwupap8m****</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5592E2E-0FC4-557C-B989-DF229B5EBE13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccountFactoryBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountFactoryBaselineResponseBody self = new CreateAccountFactoryBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccountFactoryBaselineResponseBody setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public CreateAccountFactoryBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

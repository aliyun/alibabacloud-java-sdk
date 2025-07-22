// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCostCenterRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCostCenterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCostCenterRuleResponseBody self = new CreateCostCenterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCostCenterRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateCostCenterRuleResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public CreateCostCenterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

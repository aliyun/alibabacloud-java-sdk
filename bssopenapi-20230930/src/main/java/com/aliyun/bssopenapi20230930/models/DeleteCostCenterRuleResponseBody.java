// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCostCenterRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>37404</p>
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
     * <p>UUID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCostCenterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostCenterRuleResponseBody self = new DeleteCostCenterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCostCenterRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DeleteCostCenterRuleResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public DeleteCostCenterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

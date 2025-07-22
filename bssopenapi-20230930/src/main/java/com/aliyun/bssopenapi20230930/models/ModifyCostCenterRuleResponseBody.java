// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5632</p>
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
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCostCenterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostCenterRuleResponseBody self = new ModifyCostCenterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCostCenterRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public ModifyCostCenterRuleResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public ModifyCostCenterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

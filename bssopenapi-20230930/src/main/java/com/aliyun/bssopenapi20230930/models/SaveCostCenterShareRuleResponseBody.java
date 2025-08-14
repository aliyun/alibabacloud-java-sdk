// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SaveCostCenterShareRuleResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveCostCenterShareRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveCostCenterShareRuleResponseBody self = new SaveCostCenterShareRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveCostCenterShareRuleResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public SaveCostCenterShareRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveCostCenterShareRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

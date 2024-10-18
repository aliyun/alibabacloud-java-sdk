// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDIAlarmRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A6C6B486-E3A2-5D52-9E76-D9380485D946</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIAlarmRuleResponseBody self = new UpdateDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDIAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDIAlarmRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleResponseBody extends TeaModel {
    /**
     * <p>The alert rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34988</p>
     */
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C636A747-7E4E-594D-94CD-2B4F8A9A9A63</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDIAlarmRuleResponseBody self = new CreateDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDIAlarmRuleResponseBody setDIAlarmRuleId(Long DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public CreateDIAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

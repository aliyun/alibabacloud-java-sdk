// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DIAlarmRuleId")
    public String DIAlarmRuleId;

    /**
     * <strong>example:</strong>
     * <p>C636A747-7E4E-594D-94CD-2B4F8A9A9A63</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDIAlarmRuleResponseBody self = new CreateDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDIAlarmRuleResponseBody setDIAlarmRuleId(String DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public String getDIAlarmRuleId() {
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

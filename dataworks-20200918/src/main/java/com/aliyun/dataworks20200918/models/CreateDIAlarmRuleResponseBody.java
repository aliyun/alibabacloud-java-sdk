// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleResponseBody extends TeaModel {
    @NameInMap("DIAlarmRuleId")
    @Deprecated
    public String DIAlarmRuleId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDIAlarmRuleResponseBody self = new CreateDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public CreateDIAlarmRuleResponseBody setDIAlarmRuleId(String DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public String getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public CreateDIAlarmRuleResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDIAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

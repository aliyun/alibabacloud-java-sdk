// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyRequest extends TeaModel {
    @NameInMap("PolicyType")
    @Validation(required = true)
    public String policyType;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    public static CreateMonitorGroupNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupNotifyPolicyRequest self = new CreateMonitorGroupNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

}

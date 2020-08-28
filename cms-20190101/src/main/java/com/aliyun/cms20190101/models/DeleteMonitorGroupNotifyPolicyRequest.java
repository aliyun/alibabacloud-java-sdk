// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupNotifyPolicyRequest extends TeaModel {
    @NameInMap("PolicyType")
    @Validation(required = true)
    public String policyType;

    @NameInMap("GroupId")
    public String groupId;

    public static DeleteMonitorGroupNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupNotifyPolicyRequest self = new DeleteMonitorGroupNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

}

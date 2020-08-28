// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupDynamicRuleRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("Category")
    @Validation(required = true)
    public String category;

    public static DeleteMonitorGroupDynamicRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupDynamicRuleRequest self = new DeleteMonitorGroupDynamicRuleRequest();
        return TeaModel.build(map, self);
    }

}

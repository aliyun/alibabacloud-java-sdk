// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupDynamicRulesRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    public static DescribeMonitorGroupDynamicRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupDynamicRulesRequest self = new DescribeMonitorGroupDynamicRulesRequest();
        return TeaModel.build(map, self);
    }

}

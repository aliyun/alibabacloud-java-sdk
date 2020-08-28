// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupNotifyPolicyListRequest extends TeaModel {
    @NameInMap("PolicyType")
    @Validation(required = true)
    public String policyType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("GroupId")
    public String groupId;

    public static DescribeMonitorGroupNotifyPolicyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupNotifyPolicyListRequest self = new DescribeMonitorGroupNotifyPolicyListRequest();
        return TeaModel.build(map, self);
    }

}

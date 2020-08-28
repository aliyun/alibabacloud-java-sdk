// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    public static DescribeMonitorGroupCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupCategoriesRequest self = new DescribeMonitorGroupCategoriesRequest();
        return TeaModel.build(map, self);
    }

}

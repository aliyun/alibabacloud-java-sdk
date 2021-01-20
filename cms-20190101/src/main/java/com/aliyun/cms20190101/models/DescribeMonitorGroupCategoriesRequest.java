// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    public static DescribeMonitorGroupCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupCategoriesRequest self = new DescribeMonitorGroupCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupCategoriesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactWithGroupIdRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    public static DescribeAlertContactWithGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactWithGroupIdRequest self = new DescribeAlertContactWithGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactWithGroupIdRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiGroupDetailRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    public static DescribeApiGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupDetailRequest self = new DescribeApiGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupDetailRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}

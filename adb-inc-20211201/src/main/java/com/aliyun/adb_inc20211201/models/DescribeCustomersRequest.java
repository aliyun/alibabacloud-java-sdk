// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeCustomersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static DescribeCustomersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomersRequest self = new DescribeCustomersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomersRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}

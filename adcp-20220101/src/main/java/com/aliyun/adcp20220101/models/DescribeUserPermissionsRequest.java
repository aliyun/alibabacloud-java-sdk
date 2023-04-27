// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeUserPermissionsRequest extends TeaModel {
    /**
     * <p>The ID of the RAM user that you want to query.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserPermissionsRequest self = new DescribeUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserPermissionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

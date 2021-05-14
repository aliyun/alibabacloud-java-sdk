// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceAccountsRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    public static DescribeInstanceAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAccountsRequest self = new DescribeInstanceAccountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAccountsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}

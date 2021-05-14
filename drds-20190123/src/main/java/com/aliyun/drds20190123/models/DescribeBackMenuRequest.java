// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackMenuRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    public static DescribeBackMenuRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackMenuRequest self = new DescribeBackMenuRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackMenuRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}

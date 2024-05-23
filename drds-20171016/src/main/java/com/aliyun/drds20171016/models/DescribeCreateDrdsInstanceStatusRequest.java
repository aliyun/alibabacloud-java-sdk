// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeCreateDrdsInstanceStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeCreateDrdsInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreateDrdsInstanceStatusRequest self = new DescribeCreateDrdsInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCreateDrdsInstanceStatusRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}

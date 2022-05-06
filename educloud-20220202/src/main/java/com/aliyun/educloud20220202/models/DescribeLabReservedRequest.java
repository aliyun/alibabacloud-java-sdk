// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabReservedRequest extends TeaModel {
    @NameInMap("ReservedId")
    public String reservedId;

    public static DescribeLabReservedRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabReservedRequest self = new DescribeLabReservedRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLabReservedRequest setReservedId(String reservedId) {
        this.reservedId = reservedId;
        return this;
    }
    public String getReservedId() {
        return this.reservedId;
    }

}

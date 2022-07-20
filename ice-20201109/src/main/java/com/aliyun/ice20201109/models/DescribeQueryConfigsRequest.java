// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeQueryConfigsRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static DescribeQueryConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryConfigsRequest self = new DescribeQueryConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQueryConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

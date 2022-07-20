// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeFilterConfigsRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static DescribeFilterConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilterConfigsRequest self = new DescribeFilterConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFilterConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

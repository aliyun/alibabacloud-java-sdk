// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeNetstatURLRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    public static DescribeNetstatURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetstatURLRequest self = new DescribeNetstatURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetstatURLRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

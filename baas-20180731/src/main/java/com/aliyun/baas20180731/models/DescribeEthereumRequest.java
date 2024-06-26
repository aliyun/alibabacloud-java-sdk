// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    public static DescribeEthereumRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumRequest self = new DescribeEthereumRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

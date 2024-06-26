// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumInviteeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    public static DescribeEthereumInviteeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumInviteeRequest self = new DescribeEthereumInviteeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumInviteeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

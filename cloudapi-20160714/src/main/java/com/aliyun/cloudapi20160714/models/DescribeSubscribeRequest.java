// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSubscribeRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("SubscribeId")
    public Long subscribeId;

    public static DescribeSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscribeRequest self = new DescribeSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscribeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSubscribeRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeSubscribeRequest setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public Long getSubscribeId() {
        return this.subscribeId;
    }

}

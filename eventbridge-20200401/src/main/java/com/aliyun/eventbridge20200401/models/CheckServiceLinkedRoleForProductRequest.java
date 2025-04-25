// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForProductRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForEventBridgeConnectVPC</p>
     */
    @NameInMap("ProductName")
    public String productName;

    public static CheckServiceLinkedRoleForProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForProductRequest self = new CheckServiceLinkedRoleForProductRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}

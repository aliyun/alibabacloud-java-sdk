// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddEnvironmentProductVersionsRequest extends TeaModel {
    @NameInMap("productVersionUIDList")
    public java.util.List<String> productVersionUIDList;

    public static AddEnvironmentProductVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentProductVersionsRequest self = new AddEnvironmentProductVersionsRequest();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentProductVersionsRequest setProductVersionUIDList(java.util.List<String> productVersionUIDList) {
        this.productVersionUIDList = productVersionUIDList;
        return this;
    }
    public java.util.List<String> getProductVersionUIDList() {
        return this.productVersionUIDList;
    }

}

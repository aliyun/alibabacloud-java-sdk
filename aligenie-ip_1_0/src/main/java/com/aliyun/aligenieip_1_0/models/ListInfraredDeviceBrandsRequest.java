// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListInfraredDeviceBrandsRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("ServiceProvider")
    public String serviceProvider;

    public static ListInfraredDeviceBrandsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInfraredDeviceBrandsRequest self = new ListInfraredDeviceBrandsRequest();
        return TeaModel.build(map, self);
    }

    public ListInfraredDeviceBrandsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListInfraredDeviceBrandsRequest setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }
    public String getServiceProvider() {
        return this.serviceProvider;
    }

}

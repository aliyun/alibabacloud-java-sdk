// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModulePriceMapValue extends TeaModel {
    @NameInMap("price")
    public Long price;

    @NameInMap("service_no")
    public String serviceNo;

    public static ModulePriceMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModulePriceMapValue self = new ModulePriceMapValue();
        return TeaModel.build(map, self);
    }

    public ModulePriceMapValue setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public ModulePriceMapValue setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
        return this;
    }
    public String getServiceNo() {
        return this.serviceNo;
    }

}

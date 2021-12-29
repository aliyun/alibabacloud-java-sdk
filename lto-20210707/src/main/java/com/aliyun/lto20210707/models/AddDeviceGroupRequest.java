// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddDeviceGroupRequest extends TeaModel {
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Remark")
    public String remark;

    public static AddDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceGroupRequest self = new AddDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceGroupRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public AddDeviceGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}

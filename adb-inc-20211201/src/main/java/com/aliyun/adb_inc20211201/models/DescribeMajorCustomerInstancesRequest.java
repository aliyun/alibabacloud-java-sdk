// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeMajorCustomerInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomerIds")
    public String customerIds;

    public static DescribeMajorCustomerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorCustomerInstancesRequest self = new DescribeMajorCustomerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMajorCustomerInstancesRequest setCustomerIds(String customerIds) {
        this.customerIds = customerIds;
        return this;
    }
    public String getCustomerIds() {
        return this.customerIds;
    }

}

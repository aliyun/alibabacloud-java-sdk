// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolCreateRequest extends TeaModel {
    /**
     * <p>The IDs of the purchased IP instances. Separate multiple IDs with commas (,). You can obtain the instance IDs from the response of the DedicatedIpNonePoolList operation.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx,xxx</p>
     */
    @NameInMap("BuyResourceIds")
    public String buyResourceIds;

    /**
     * <p>The name of the IP pool. The name must be 1 to 50 characters in length. It can contain letters, digits, underscores (_), and hyphens (-). The name cannot be changed after the IP pool is created.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Name")
    public String name;

    public static DedicatedIpPoolCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolCreateRequest self = new DedicatedIpPoolCreateRequest();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolCreateRequest setBuyResourceIds(String buyResourceIds) {
        this.buyResourceIds = buyResourceIds;
        return this;
    }
    public String getBuyResourceIds() {
        return this.buyResourceIds;
    }

    public DedicatedIpPoolCreateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

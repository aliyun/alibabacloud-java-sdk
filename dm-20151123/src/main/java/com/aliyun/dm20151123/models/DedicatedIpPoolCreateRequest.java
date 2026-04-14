// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolCreateRequest extends TeaModel {
    /**
     * <p>Purchased IP instance IDs, separated by commas; derived from the IP purchase instance IDs returned by the DedicatedIpNonePoolList interface.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx,xxx</p>
     */
    @NameInMap("BuyResourceIds")
    public String buyResourceIds;

    /**
     * <p>IP pool name;
     * Length should be 1-50 characters, allowing English letters, numbers, _, and -. The name cannot be modified after the IP pool is created.</p>
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

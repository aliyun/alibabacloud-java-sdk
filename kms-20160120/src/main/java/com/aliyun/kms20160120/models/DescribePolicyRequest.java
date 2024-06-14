// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribePolicyRequest extends TeaModel {
    /**
     * <p>The name of the permission policy that you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static DescribePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyRequest self = new DescribePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

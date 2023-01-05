// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeNodePoolVulsRequest extends TeaModel {
    @NameInMap("necessity")
    public String necessity;

    public static DescribeNodePoolVulsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodePoolVulsRequest self = new DescribeNodePoolVulsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodePoolVulsRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

}

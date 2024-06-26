// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainConfigOptionsRequest extends TeaModel {
    @NameInMap("Purpose")
    public String purpose;

    public static DescribeAntChainConfigOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConfigOptionsRequest self = new DescribeAntChainConfigOptionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConfigOptionsRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

}

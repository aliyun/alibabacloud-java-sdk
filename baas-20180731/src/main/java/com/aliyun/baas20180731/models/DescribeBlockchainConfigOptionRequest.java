// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainConfigOptionRequest extends TeaModel {
    @NameInMap("Purpose")
    public String purpose;

    public static DescribeBlockchainConfigOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainConfigOptionRequest self = new DescribeBlockchainConfigOptionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainConfigOptionRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

}

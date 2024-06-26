// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainCreationConfigOptionsRequest extends TeaModel {
    @NameInMap("Purpose")
    public String purpose;

    public static DescribeBlockchainCreationConfigOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainCreationConfigOptionsRequest self = new DescribeBlockchainCreationConfigOptionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainCreationConfigOptionsRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

}

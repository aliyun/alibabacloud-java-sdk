// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeBandWithdChargeTypeRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    public static DescribeBandWithdChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandWithdChargeTypeRequest self = new DescribeBandWithdChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBandWithdChargeTypeRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}

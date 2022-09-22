// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitDeductFactorResponseBody extends TeaModel {
    @NameInMap("DeductFactor")
    public String deductFactor;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeStorageCapacityUnitDeductFactorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitDeductFactorResponseBody self = new DescribeStorageCapacityUnitDeductFactorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitDeductFactorResponseBody setDeductFactor(String deductFactor) {
        this.deductFactor = deductFactor;
        return this;
    }
    public String getDeductFactor() {
        return this.deductFactor;
    }

    public DescribeStorageCapacityUnitDeductFactorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

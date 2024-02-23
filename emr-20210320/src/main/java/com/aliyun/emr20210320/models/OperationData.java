// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class OperationData extends TeaModel {
    @NameInMap("actualDeliveredAmounts")
    public Integer actualDeliveredAmounts;

    @NameInMap("toBeDeliveredAmounts")
    public Integer toBeDeliveredAmounts;

    public static OperationData build(java.util.Map<String, ?> map) throws Exception {
        OperationData self = new OperationData();
        return TeaModel.build(map, self);
    }

    public OperationData setActualDeliveredAmounts(Integer actualDeliveredAmounts) {
        this.actualDeliveredAmounts = actualDeliveredAmounts;
        return this;
    }
    public Integer getActualDeliveredAmounts() {
        return this.actualDeliveredAmounts;
    }

    public OperationData setToBeDeliveredAmounts(Integer toBeDeliveredAmounts) {
        this.toBeDeliveredAmounts = toBeDeliveredAmounts;
        return this;
    }
    public Integer getToBeDeliveredAmounts() {
        return this.toBeDeliveredAmounts;
    }

}

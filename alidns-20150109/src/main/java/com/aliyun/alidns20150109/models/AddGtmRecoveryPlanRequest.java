// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmRecoveryPlanRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("FaultAddrPool")
    @Validation(required = true)
    public String faultAddrPool;

    public static AddGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmRecoveryPlanRequest self = new AddGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

}

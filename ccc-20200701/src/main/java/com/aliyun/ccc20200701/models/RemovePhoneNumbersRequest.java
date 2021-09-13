// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePhoneNumbersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NumberList")
    public String numberList;

    public static RemovePhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumbersRequest self = new RemovePhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemovePhoneNumbersRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

}

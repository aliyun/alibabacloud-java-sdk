// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddPersonalNumbersToUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("NumberList")
    public String numberList;

    public static AddPersonalNumbersToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPersonalNumbersToUserRequest self = new AddPersonalNumbersToUserRequest();
        return TeaModel.build(map, self);
    }

    public AddPersonalNumbersToUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddPersonalNumbersToUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AddPersonalNumbersToUserRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

}

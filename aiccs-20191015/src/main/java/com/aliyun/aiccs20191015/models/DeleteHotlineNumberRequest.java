// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteHotlineNumberRequest extends TeaModel {
    // 号码
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteHotlineNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotlineNumberRequest self = new DeleteHotlineNumberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHotlineNumberRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public DeleteHotlineNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteContactFlowRequest extends TeaModel {
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactFlowRequest self = new DeleteContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactFlowRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public DeleteContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

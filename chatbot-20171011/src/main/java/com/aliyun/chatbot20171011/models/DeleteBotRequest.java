// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteBotRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteBotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBotRequest self = new DeleteBotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBotRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

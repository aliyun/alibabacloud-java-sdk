// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeBotRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeBotRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotRequest self = new DescribeBotRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBotRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

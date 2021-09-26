// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskBizDataRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 入呼channelId
    @NameInMap("ChannelId")
    public String channelId;

    public static GetAiOutboundTaskBizDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskBizDataRequest self = new GetAiOutboundTaskBizDataRequest();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskBizDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAiOutboundTaskBizDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}

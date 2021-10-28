// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskBizDataRequest extends TeaModel {
    // 入呼channelId
    @NameInMap("ChannelId")
    public String channelId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAiOutboundTaskBizDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskBizDataRequest self = new GetAiOutboundTaskBizDataRequest();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskBizDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public GetAiOutboundTaskBizDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskBizDataRequest extends TeaModel {
    /**
     * <p>Session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it in the <b>Instance Management</b> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
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

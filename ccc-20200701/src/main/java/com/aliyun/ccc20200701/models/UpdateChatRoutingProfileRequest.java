// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateChatRoutingProfileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;RoutingType&quot;: &quot;Automatic&quot;,
     *     &quot;AgentConcurrencySettings&quot;: {
     *         &quot;AllowExceedingLimitWhenTransferring&quot;: false,
     *         &quot;ConcurrencyLimit&quot;: 4,
     *         &quot;AllowExceedingLimitWhenClaiming&quot;: true,
     *         &quot;Enabled&quot;: true
     *     },
     *     &quot;ChatSettings&quot;: {
     *         &quot;IdleChatTimeoutSeconds&quot;: 300
     *     },
     *     &quot;DistributionSettings&quot;: {
     *         &quot;Enabled&quot;: true,
     *         &quot;AgentRingTimeoutSeconds&quot;: 119,
     *         &quot;MaxNumberOfConversationsAgentCanMiss&quot;: 5,
     *         &quot;PostAgentMissingConversionsAction&quot;: &quot;Nothing&quot;
     *     }
     * }</p>
     */
    @NameInMap("RoutingProfiles")
    public String routingProfiles;

    public static UpdateChatRoutingProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatRoutingProfileRequest self = new UpdateChatRoutingProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChatRoutingProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateChatRoutingProfileRequest setRoutingProfiles(String routingProfiles) {
        this.routingProfiles = routingProfiles;
        return this;
    }
    public String getRoutingProfiles() {
        return this.routingProfiles;
    }

}

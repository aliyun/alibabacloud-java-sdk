// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetNotifyConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://customer.com/callback">http://customer.com/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNotify")
    public Boolean enableNotify;

    /**
     * <strong>example:</strong>
     * <p>agent_start,agent_stop,error</p>
     */
    @NameInMap("EventTypes")
    public String eventTypes;

    /**
     * <strong>example:</strong>
     * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
     */
    @NameInMap("Token")
    public String token;

    public static SetNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetNotifyConfigRequest self = new SetNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetNotifyConfigRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public SetNotifyConfigRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public SetNotifyConfigRequest setEnableNotify(Boolean enableNotify) {
        this.enableNotify = enableNotify;
        return this;
    }
    public Boolean getEnableNotify() {
        return this.enableNotify;
    }

    public SetNotifyConfigRequest setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public String getEventTypes() {
        return this.eventTypes;
    }

    public SetNotifyConfigRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}

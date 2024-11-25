// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetEventCallbackRequest extends TeaModel {
    /**
     * <p>The authentication key. The key can be up to 32 characters in length and must contain uppercase letters, lowercase letters, and digits. This parameter takes effect only if you set CallbackType to <strong>HTTP</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>TestKey001</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>Specifies whether to enable callback authentication. This parameter takes effect only if you set CallbackType to <strong>HTTP</strong>. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AuthSwitch")
    public String authSwitch;

    /**
     * <p>The name of the Simple Message Queue (SMQ) queue in the region. The name must start with ice-callback-.</p>
     * 
     * <strong>example:</strong>
     * <p>ice-callback-queue</p>
     */
    @NameInMap("CallbackQueueName")
    public String callbackQueueName;

    /**
     * <p>The callback method. Valid values:</p>
     * <ul>
     * <li><strong>HTTP</strong></li>
     * <li><strong>MNS</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("CallbackType")
    public String callbackType;

    /**
     * <p>The callback URL. This parameter is required if you set CallbackType to <strong>HTTP</strong>. The callback URL cannot exceed 256 bytes in length. You can specify only one callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx.yyy/callback">http://xxx.yyy/callback</a></p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

    /**
     * <p>The type of the callback event. You can specify multiple values separated with commas (,). ProduceMediaComplete: indicates that the editing and production task is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>ProduceMediaComplete</p>
     */
    @NameInMap("EventTypeList")
    public String eventTypeList;

    public static SetEventCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEventCallbackRequest self = new SetEventCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SetEventCallbackRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SetEventCallbackRequest setAuthSwitch(String authSwitch) {
        this.authSwitch = authSwitch;
        return this;
    }
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    public SetEventCallbackRequest setCallbackQueueName(String callbackQueueName) {
        this.callbackQueueName = callbackQueueName;
        return this;
    }
    public String getCallbackQueueName() {
        return this.callbackQueueName;
    }

    public SetEventCallbackRequest setCallbackType(String callbackType) {
        this.callbackType = callbackType;
        return this;
    }
    public String getCallbackType() {
        return this.callbackType;
    }

    public SetEventCallbackRequest setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public SetEventCallbackRequest setEventTypeList(String eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }
    public String getEventTypeList() {
        return this.eventTypeList;
    }

}

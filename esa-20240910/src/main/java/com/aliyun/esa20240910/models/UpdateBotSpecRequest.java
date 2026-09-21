// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateBotSpecRequest extends TeaModel {
    /**
     * <p>The bot instance specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise_bot</p>
     */
    @NameInMap("BotInstanceLevel")
    public String botInstanceLevel;

    /**
     * <p>The bot instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-bot-9tuv*********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateBotSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBotSpecRequest self = new UpdateBotSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBotSpecRequest setBotInstanceLevel(String botInstanceLevel) {
        this.botInstanceLevel = botInstanceLevel;
        return this;
    }
    public String getBotInstanceLevel() {
        return this.botInstanceLevel;
    }

    public UpdateBotSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

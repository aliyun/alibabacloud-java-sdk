// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListSkillGroupRequest extends TeaModel {
    /**
     * <p>The skill group channel type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Returns all skill groups.</li>
     * <li><strong>1</strong>: Voice skill group.</li>
     * <li><strong>2</strong>: Chat skill group.</li>
     * <li><strong>3</strong>: Chat and voice skill group.</li>
     * <li><strong>4</strong>: Ticket skill group.</li>
     * <li><strong>5</strong>: Voice and ticket skill group.</li>
     * <li><strong>6</strong>: Chat and ticket skill group.</li>
     * <li><strong>7</strong>: Chat, voice, and ticket skill group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChannelType")
    public Integer channelType;

    /**
     * <p>Unique ID of the customer request. Used for idempotency validation. You can generate it using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-****-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupRequest self = new ListSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public ListSkillGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

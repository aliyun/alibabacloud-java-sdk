// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SignInGroupRequest extends TeaModel {
    /**
     * <p>If an agent has already signed in to some skill groups, setting this parameter to true allows the agent to sign in to additional skill groups.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Additivity")
    public Boolean additivity;

    /**
     * <p>Chat device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4c51c9116c36537cb850dc1081d745df</p>
     */
    @NameInMap("ChatDeviceId")
    public String chatDeviceId;

    /**
     * <p>Voice device ID. When multiple voice devices are active, use this parameter to specify one of them, such as a browser Web Real-Time Communication (WebRTC) endpoint or a SIP phone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CCC-xx.xx.xx.xx-chrome119-bse1b618bff3xxxxd</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>List of skill group IDs to sign in to, formatted as a JSON array string, where each array element is a skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;skillgroup1@ccc-test&quot;,&quot;skillgroup2@ccc-test&quot;]</p>
     */
    @NameInMap("SignedSkillGroupIdList")
    public String signedSkillGroupIdList;

    /**
     * <p>Agent ID. If not specified, the agent mapped to the current Resource Access Management (RAM) user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static SignInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SignInGroupRequest self = new SignInGroupRequest();
        return TeaModel.build(map, self);
    }

    public SignInGroupRequest setAdditivity(Boolean additivity) {
        this.additivity = additivity;
        return this;
    }
    public Boolean getAdditivity() {
        return this.additivity;
    }

    public SignInGroupRequest setChatDeviceId(String chatDeviceId) {
        this.chatDeviceId = chatDeviceId;
        return this;
    }
    public String getChatDeviceId() {
        return this.chatDeviceId;
    }

    public SignInGroupRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public SignInGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SignInGroupRequest setSignedSkillGroupIdList(String signedSkillGroupIdList) {
        this.signedSkillGroupIdList = signedSkillGroupIdList;
        return this;
    }
    public String getSignedSkillGroupIdList() {
        return this.signedSkillGroupIdList;
    }

    public SignInGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

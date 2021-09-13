// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SignInGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("SignedSkillGroupIdList")
    public String signedSkillGroupIdList;

    public static SignInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SignInGroupRequest self = new SignInGroupRequest();
        return TeaModel.build(map, self);
    }

    public SignInGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SignInGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SignInGroupRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public SignInGroupRequest setSignedSkillGroupIdList(String signedSkillGroupIdList) {
        this.signedSkillGroupIdList = signedSkillGroupIdList;
        return this;
    }
    public String getSignedSkillGroupIdList() {
        return this.signedSkillGroupIdList;
    }

}

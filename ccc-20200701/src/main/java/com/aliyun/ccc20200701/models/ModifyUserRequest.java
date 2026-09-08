// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyUserRequest extends TeaModel {
    /**
     * <p>Agent profile picture URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://abc.com/sam.jpb">http://abc.com/sam.jpb</a></p>
     */
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    /**
     * <p>Agent ID (employee ID).</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("DisplayId")
    public String displayId;

    /**
     * <p>User\&quot;s full name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三疯</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Whether to force the modification.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

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
     * <p>Agent\&quot;s personal phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>1382114****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Agent nickname</p>
     * 
     * <strong>example:</strong>
     * <p>老王</p>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <p>Role ID, in the format: role\@instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Admin@ccc-test</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>Agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user-test@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Work mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ON_SITE</p>
     */
    @NameInMap("WorkMode")
    public String workMode;

    public static ModifyUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserRequest self = new ModifyUserRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserRequest setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public ModifyUserRequest setDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }
    public String getDisplayId() {
        return this.displayId;
    }

    public ModifyUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ModifyUserRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public ModifyUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ModifyUserRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public ModifyUserRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public ModifyUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ModifyUserRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}

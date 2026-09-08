// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The URL of the agent\&quot;s profile picture.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://abc.com/sam.jpg">http://abc.com/sam.jpg</a></p>
     */
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    /**
     * <p>The agent\&quot;s ID number. Set this as needed.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("DisplayId")
    public String displayId;

    /**
     * <p>The display name of the agent. It must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>坐席小王</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address of the agent. After the agent is created, an email is sent to this address. The email contains the logon URL for Cloud Contact Center, and the username and password for the RAM account. Keep this information secure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The logon name of the agent. It must be 4 to 64 characters in length and can contain uppercase letters, lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent</p>
     */
    @NameInMap("LoginName")
    public String loginName;

    /**
     * <p>The personal phone number of the agent. This number is used in OFF_SITE mode. The agent can use this number to answer calls in OFF_SITE mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1382114****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Specifies whether to send an email notification.</p>
     * <ul>
     * <li><p>true: Send</p>
     * </li>
     * <li><p>false: Do not send</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedEmailNotification")
    public String needEmailNotification;

    /**
     * <p>The agent\&quot;s nickname.</p>
     * 
     * <strong>example:</strong>
     * <p>老王</p>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <p>Specifies whether the agent must reset the password upon the first logon. If set to true, the agent is prompted to reset the password when they first log on to the RAM account. Otherwise, they are not prompted. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ResetPassword")
    public Boolean resetPassword;

    /**
     * <p>The role ID. The format is Role\@InstanceID. The following roles are supported: Admin (administrator), Manager (skill group leader), and Agent (agent).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent@ccc-test</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>A list of skill levels for skill groups. This is a string in the format of a JSON array. The array can contain up to 100 elements. Each element is an object that contains two fields: skillGroupId and skillLevel. For skillGroupId, enter the ID of the skill group to add. For skillLevel, enter the skill level to add. The value can range from 1 to 10. A smaller value indicates a higher skill level, meaning the agent can handle more calls per unit of time.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;skillGroupId&quot;:&quot;skillgroup1@ccc-test&quot;,&quot;skillLevel&quot;:1},{&quot;skillGroupId&quot;:&quot;skillgroup2@ccc-test&quot;,&quot;skillLevel&quot;:10}]</p>
     */
    @NameInMap("SkillLevelList")
    public String skillLevelList;

    /**
     * <p>The work mode.</p>
     * 
     * <strong>example:</strong>
     * <p>ON_SITE</p>
     */
    @NameInMap("WorkMode")
    public String workMode;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public CreateUserRequest setDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }
    public String getDisplayId() {
        return this.displayId;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateUserRequest setNeedEmailNotification(String needEmailNotification) {
        this.needEmailNotification = needEmailNotification;
        return this;
    }
    public String getNeedEmailNotification() {
        return this.needEmailNotification;
    }

    public CreateUserRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public CreateUserRequest setResetPassword(Boolean resetPassword) {
        this.resetPassword = resetPassword;
        return this;
    }
    public Boolean getResetPassword() {
        return this.resetPassword;
    }

    public CreateUserRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public CreateUserRequest setSkillLevelList(String skillLevelList) {
        this.skillLevelList = skillLevelList;
        return this;
    }
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    public CreateUserRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}

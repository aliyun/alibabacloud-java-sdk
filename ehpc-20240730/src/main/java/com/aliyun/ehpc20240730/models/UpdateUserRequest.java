// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The user group property to update. Valid values:</p>
     * <ul>
     * <li><p>users: ordinary permission group. This group is suitable for regular users who only need to submit and debug jobs.</p>
     * </li>
     * <li><p>wheel: sudo permission group. This group is suitable for administrators who need cluster management. In addition to submitting and debugging jobs, users in this group can execute sudo commands to install software, restart nodes, and perform other operations.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>users</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The user password property to update. The password must be 8 to 30 characters in length and must contain at least three of the following four character types:</p>
     * <ul>
     * <li>Uppercase letters</li>
     * <li>Lowercase letters</li>
     * <li>Digits</li>
     * <li>Special characters: ()~!@#$%^&amp;*-_+=|{}[]:;\&quot;/&lt;&gt;,.?/</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateUserRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UpdateUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}

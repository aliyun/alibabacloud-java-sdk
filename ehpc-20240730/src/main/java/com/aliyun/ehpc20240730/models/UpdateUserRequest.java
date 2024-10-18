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
     * <p>The user group attribute of the user that you want to update. Valid values:</p>
     * <ul>
     * <li>users: ordinary permissions, which are suitable for ordinary users that need only to submit and debug jobs.</li>
     * <li>wheel: sudo permissions, which are suitable for administrators who need to manage clusters. In addition to submitting and debugging jobs, you can also run sudo commands to install software and restart nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>users</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The password attribute of the user that you want to update. The password must be 6 to 30 characters in length and must contain three of the following four character types:</p>
     * <ul>
     * <li>Uppercase letters</li>
     * <li>Lowercase letters</li>
     * <li>Digits</li>
     * <li>Special characters ()~!@#$%^&amp;\*-_+=|{}[]:;\&quot;/&lt;&gt;,.?/</li>
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

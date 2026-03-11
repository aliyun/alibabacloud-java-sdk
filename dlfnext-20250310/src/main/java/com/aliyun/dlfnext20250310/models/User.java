// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <strong>example:</strong>
     * <p>user_display_name</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>RAM_USER</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    /**
     * <strong>example:</strong>
     * <p>222748924538****</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>user_name</p>
     */
    @NameInMap("userName")
    public String userName;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:user/user_name</p>
     */
    @NameInMap("userPrincipal")
    public String userPrincipal;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public User setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public User setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public User setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public User setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public User setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public User setUserPrincipal(String userPrincipal) {
        this.userPrincipal = userPrincipal;
        return this;
    }
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

}

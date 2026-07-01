// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateYikeUserRequest extends TeaModel {
    /**
     * <p>The user\&quot;s nickname.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nick</p>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <p>The user\&quot;s password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The IDs of productions to add the user to. You can specify multiple IDs separated by commas.</p>
     * <blockquote>
     * <ul>
     * <li>A user can be added to multiple productions.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id1,id2</p>
     */
    @NameInMap("ProductionIds")
    public String productionIds;

    /**
     * <p>The user name prefix for the sub-account. The prefix must meet the following requirements:</p>
     * <ul>
     * <li><p>The prefix can be up to 50 characters long and must be unique within the workspace.</p>
     * </li>
     * <li><p>The system automatically generates a user login name in the format: {UserNamePrefix}.{WorkspaceCode}@{AlibabaCloudUID}.yikeai.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test.xxx@xxx.yikeai">test.xxx@xxx.yikeai</a></p>
     */
    @NameInMap("UserNamePrefix")
    public String userNamePrefix;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-az2gglkjauwnnhpq</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateYikeUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeUserRequest self = new CreateYikeUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateYikeUserRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public CreateYikeUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateYikeUserRequest setProductionIds(String productionIds) {
        this.productionIds = productionIds;
        return this;
    }
    public String getProductionIds() {
        return this.productionIds;
    }

    public CreateYikeUserRequest setUserNamePrefix(String userNamePrefix) {
        this.userNamePrefix = userNamePrefix;
        return this;
    }
    public String getUserNamePrefix() {
        return this.userNamePrefix;
    }

    public CreateYikeUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

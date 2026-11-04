// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserToUserGroupRequest extends TeaModel {
    /**
     * <p>The business isolation ID. It is used to isolate data between different business applications under the same Alibaba Cloud account.</p>
     * <blockquote>
     * <p>Notice: 
     * The user and the user group must be under the same isolation ID. Make sure that this parameter is consistent with the <strong>IsolationId</strong> parameter that you specified when you called the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add the user and the <a href="https://help.aliyun.com/document_detail/288341.html">AddFaceUserGroup</a> operation to create the user group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The user group ID. Set this parameter to the user group ID that you obtained and saved locally after you called the <a href="https://help.aliyun.com/document_detail/288341.html">AddFaceUserGroup</a> operation to create the user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvjy****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The user ID. Set this parameter to the user ID that you obtained and saved locally after you called the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3mtjaqebeq4d****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddFaceUserToUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserToUserGroupRequest self = new AddFaceUserToUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserToUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserToUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public AddFaceUserToUserGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

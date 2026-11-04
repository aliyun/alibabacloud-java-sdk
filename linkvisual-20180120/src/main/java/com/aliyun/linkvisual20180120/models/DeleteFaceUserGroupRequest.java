// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserGroupRequest extends TeaModel {
    /**
     * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. This value must be the same as the <strong>IsolationId</strong> specified when you call the <a href="https://help.aliyun.com/document_detail/288341.html">AddFaceUserGroup</a> operation to add a user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The ID of the user group. Specify the user group ID that you obtained and saved locally after calling the <a href="https://help.aliyun.com/document_detail/288341.html">AddFaceUserGroup</a> operation to add the user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvjy****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DeleteFaceUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserGroupRequest self = new DeleteFaceUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public DeleteFaceUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}

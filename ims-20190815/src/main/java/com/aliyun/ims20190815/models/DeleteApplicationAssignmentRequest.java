// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteApplicationAssignmentRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>472457090344041****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The user principal name or role name.</p>
     * <ul>
     * <li>User principal name: The format is <code>&lt;username&gt;@&lt;account-id&gt;.onaliyun.com</code>. You can query it by calling the <code>GetUser</code> or <code>ListUsers</code> API operation.</li>
     * <li>Role name: You can query it by calling the <code>ListRoles</code> API operation of RAM.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:user@example.onaliyun.com">user@example.onaliyun.com</a></p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The type of the target principal for the application assignment. Valid values:</p>
     * <ul>
     * <li>user: The principal is a RAM user. In this case, PrincipalName must be a user principal name.</li>
     * <li>role: The principal is a RAM role. In this case, PrincipalName must be a role name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    public static DeleteApplicationAssignmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationAssignmentRequest self = new DeleteApplicationAssignmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationAssignmentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteApplicationAssignmentRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public DeleteApplicationAssignmentRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}

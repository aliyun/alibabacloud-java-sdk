// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupRequest extends TeaModel {
    /**
     * <p>The caller authentication status of the API. Valid values: <strong>ok</strong>: The authentication is successful. <strong>mismatch</strong>: The request is redirected. <strong>servicenotfound</strong>: A request error occurred. <strong>Unknown</strong>: An unknown error occurred.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Auth")
    public String auth;

    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6735211ab9094c818f32f27bc545b6c8</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the monitoring group.</p>
     * 
     * <strong>example:</strong>
     * <p>166636221</p>
     */
    @NameInMap("RawMonitorGroupId")
    public Long rawMonitorGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupRequest self = new CreateMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupRequest setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

    public CreateMonitorGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateMonitorGroupRequest setRawMonitorGroupId(Long rawMonitorGroupId) {
        this.rawMonitorGroupId = rawMonitorGroupId;
        return this;
    }
    public Long getRawMonitorGroupId() {
        return this.rawMonitorGroupId;
    }

    public CreateMonitorGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

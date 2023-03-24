// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyRequest extends TeaModel {
    /**
     * <p>The status of the AccessKey pair. Valid values:</p>
     * <br>
     * <p>*   Active</p>
     * <p>*   Inactive</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The AccessKey ID of the AccessKey pair for which you want to modify the status.</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The logon name of the RAM user.</p>
     * <br>
     * <p>If this parameter is empty, the status of the AccessKey pair for the current user is modified.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static UpdateAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyRequest self = new UpdateAccessKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessKeyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAccessKeyRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public UpdateAccessKeyRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}

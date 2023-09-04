// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserStatusRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The new status of the user. Valid values:</p>
     * <br>
     * <p>*   Enabled: The logon of the user is enabled.</p>
     * <p>*   Disabled: The logon of the user is disabled.</p>
     */
    @NameInMap("NewStatus")
    public String newStatus;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UpdateUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserStatusRequest self = new UpdateUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserStatusRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateUserStatusRequest setNewStatus(String newStatus) {
        this.newStatus = newStatus;
        return this;
    }
    public String getNewStatus() {
        return this.newStatus;
    }

    public UpdateUserStatusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

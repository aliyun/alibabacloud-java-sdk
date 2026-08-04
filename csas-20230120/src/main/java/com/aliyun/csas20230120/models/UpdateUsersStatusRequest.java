// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUsersStatusRequest extends TeaModel {
    /**
     * <p>Collection of user IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SaseUserIds")
    public java.util.List<String> saseUserIds;

    /**
     * <p>User status. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enable the user.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disable the user.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateUsersStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUsersStatusRequest self = new UpdateUsersStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUsersStatusRequest setSaseUserIds(java.util.List<String> saseUserIds) {
        this.saseUserIds = saseUserIds;
        return this;
    }
    public java.util.List<String> getSaseUserIds() {
        return this.saseUserIds;
    }

    public UpdateUsersStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

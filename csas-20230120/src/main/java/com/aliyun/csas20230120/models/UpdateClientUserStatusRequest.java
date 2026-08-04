// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserStatusRequest extends TeaModel {
    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1495</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The status of the user. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: The user is enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: The user is disabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateClientUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserStatusRequest self = new UpdateClientUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserStatusRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateClientUserStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

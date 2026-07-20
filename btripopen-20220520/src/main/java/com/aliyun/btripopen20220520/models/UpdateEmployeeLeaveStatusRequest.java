// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UpdateEmployeeLeaveStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_leave")
    public Boolean isLeave;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static UpdateEmployeeLeaveStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEmployeeLeaveStatusRequest self = new UpdateEmployeeLeaveStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEmployeeLeaveStatusRequest setIsLeave(Boolean isLeave) {
        this.isLeave = isLeave;
        return this;
    }
    public Boolean getIsLeave() {
        return this.isLeave;
    }

    public UpdateEmployeeLeaveStatusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

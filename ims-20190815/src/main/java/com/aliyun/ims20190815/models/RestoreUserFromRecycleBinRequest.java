// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RestoreUserFromRecycleBinRequest extends TeaModel {
    /**
     * <p>The ID of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RestoreUserFromRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreUserFromRecycleBinRequest self = new RestoreUserFromRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public RestoreUserFromRecycleBinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

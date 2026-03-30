// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteUserInRecycleBinRequest extends TeaModel {
    /**
     * <p>The ID of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteUserInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserInRecycleBinRequest self = new DeleteUserInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserInRecycleBinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

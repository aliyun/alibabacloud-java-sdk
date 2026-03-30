// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAccessKeysInRecycleBinRequest extends TeaModel {
    /**
     * <p>The ID of the Resource Access Management (RAM) user.</p>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListAccessKeysInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysInRecycleBinRequest self = new ListAccessKeysInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysInRecycleBinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

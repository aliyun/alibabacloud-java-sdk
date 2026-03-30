// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RestoreAccessKeyFromRecycleBinRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The ID of the Resource Access Management (RAM) user.</p>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RestoreAccessKeyFromRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreAccessKeyFromRecycleBinRequest self = new RestoreAccessKeyFromRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public RestoreAccessKeyFromRecycleBinRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public RestoreAccessKeyFromRecycleBinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

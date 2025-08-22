// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyInRecycleBinRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The ID of the RAM user.</p>
     * <blockquote>
     * <ul>
     * <li>If you use an Alibaba Cloud account to call the operation, you must specify the parameter.</li>
     * <li>If you use a RAM user to call the operation, you can leave the parameter empty. In this case, the ID of the RAM user is used by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteAccessKeyInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyInRecycleBinRequest self = new DeleteAccessKeyInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyInRecycleBinRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public DeleteAccessKeyInRecycleBinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

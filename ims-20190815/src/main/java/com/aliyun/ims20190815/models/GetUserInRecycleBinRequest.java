// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserInRecycleBinRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the RAM user.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: <code>UserId</code> and <code>UserAccessKeyId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The ID of the RAM user.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: <code>UserId</code> and <code>UserAccessKeyId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetUserInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserInRecycleBinRequest self = new GetUserInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public GetUserInRecycleBinRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public GetUserInRecycleBinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

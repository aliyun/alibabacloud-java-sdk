// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class UpdateFaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun1</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>base64picdata</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserInfo")
    public String userInfo;

    public static UpdateFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceRequest self = new UpdateFaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaceRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public UpdateFaceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateFaceRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

}

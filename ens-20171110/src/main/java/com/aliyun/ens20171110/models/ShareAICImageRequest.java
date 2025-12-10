// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ShareAICImageRequest extends TeaModel {
    /**
     * <p>The image name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The user groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static ShareAICImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ShareAICImageRequest self = new ShareAICImageRequest();
        return TeaModel.build(map, self);
    }

    public ShareAICImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ShareAICImageRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetVideoFieldUrlRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoFile")
    public String videoFile;

    public static GetVideoFieldUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoFieldUrlRequest self = new GetVideoFieldUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoFieldUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetVideoFieldUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetVideoFieldUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetVideoFieldUrlRequest setVideoFile(String videoFile) {
        this.videoFile = videoFile;
        return this;
    }
    public String getVideoFile() {
        return this.videoFile;
    }

}

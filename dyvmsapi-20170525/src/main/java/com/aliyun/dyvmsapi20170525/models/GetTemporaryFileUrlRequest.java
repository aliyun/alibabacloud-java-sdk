// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetTemporaryFileUrlRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    public String videoId;

    public static GetTemporaryFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemporaryFileUrlRequest self = new GetTemporaryFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetTemporaryFileUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetTemporaryFileUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetTemporaryFileUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetTemporaryFileUrlRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}

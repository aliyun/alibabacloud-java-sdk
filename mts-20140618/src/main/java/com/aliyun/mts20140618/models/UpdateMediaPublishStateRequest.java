// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaPublishStateRequest extends TeaModel {
    /**
     * <p>The ID of the media file whose publishing status you want update. To obtain the ID of a media file, you can call the [AddMedia](~~44458~~) operation. Alternatively, perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose **Media Management** > **Media List**. Find the required video and click **Manage**. The ID of the video is displayed on the Basics tab.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The publishing status. Default value: **Initialed**. Valid values:</p>
     * <br>
     * <p>*   **true**: published</p>
     * <p>*   **false**: unpublished</p>
     */
    @NameInMap("Publish")
    public Boolean publish;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateMediaPublishStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaPublishStateRequest self = new UpdateMediaPublishStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaPublishStateRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaPublishStateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateMediaPublishStateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMediaPublishStateRequest setPublish(Boolean publish) {
        this.publish = publish;
        return this;
    }
    public Boolean getPublish() {
        return this.publish;
    }

    public UpdateMediaPublishStateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMediaPublishStateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

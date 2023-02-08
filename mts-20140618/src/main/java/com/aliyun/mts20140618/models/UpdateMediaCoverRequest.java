// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaCoverRequest extends TeaModel {
    /**
     * <p>The URL of the thumbnail that you want to specify for the media file. The URL complies with RFC 2396 and is encoded in UTF-8. The URL can be up to 3,200 bytes in length.</p>
     * <br>
     * <p>>  To obtain the thumbnail URL, you can find the image in the Object Storage Service (OSS) bucket and click the image to view details. In the View Details panel, copy the part before the question mark (?) from the URL field. You can enter only an HTTP URL.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The ID of the media file whose thumbnail you want to update. To obtain the ID of a media file, you can call the [AddMedia](~~44458~~) operation. Alternatively, perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose **Media Management** > **Media List**. Find the required video and click **Manage**. The ID of the video is displayed on the Basics tab.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateMediaCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCoverRequest self = new UpdateMediaCoverRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCoverRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateMediaCoverRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaCoverRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateMediaCoverRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMediaCoverRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMediaCoverRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

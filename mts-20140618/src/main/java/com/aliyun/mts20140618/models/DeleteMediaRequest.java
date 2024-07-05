// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaRequest extends TeaModel {
    /**
     * <p>The IDs of the media files that you want to remove. Separate multiple IDs with commas (,). You can remove up to 10 media files at a time.</p>
     * <blockquote>
     * <p>You can obtain the ID of the media file from the response parameters of the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation. Alternatively, you can log on to the MPS console. In the left-side navigation pane, choose <strong>Media Management</strong> &gt; <strong>Media List</strong>. Find the required video and click <strong>Manage</strong> in the Actions column. The ID of the video is displayed on the Basics tab.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e1cd21131a94525be55acf65888****,3e6149d5a8c944c09b1a8d2dc3e4****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaRequest self = new DeleteMediaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public DeleteMediaRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteMediaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteMediaRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteMediaRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaTagRequest extends TeaModel {
    /**
     * <p>The ID of the media file for which you want to remove a tag. To obtain the ID of a media file, you can call the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation. Alternatively, perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose <strong>Media Management</strong> &gt; <strong>Media List</strong>. Find the required video and click <strong>Manage</strong> in the Actions column. The ID of the video is displayed on the Basics tab.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e6149d5a8c944c09b1a8d2dc3e4****</p>
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

    /**
     * <p>The media tag that you want to remove. The value is encoded in UTF-8 and can be up to 32 bytes in length.</p>
     * <blockquote>
     * <p>You can remove only one tag at a time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tag1</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static DeleteMediaTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaTagRequest self = new DeleteMediaTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaTagRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DeleteMediaTagRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteMediaTagRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteMediaTagRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteMediaTagRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteMediaTagRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}

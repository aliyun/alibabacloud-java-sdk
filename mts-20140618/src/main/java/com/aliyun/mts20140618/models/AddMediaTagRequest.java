// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaTagRequest extends TeaModel {
    /**
     * <p>The ID of the media file to which you want to add tags.</p>
     * <blockquote>
     * <p>To obtain the ID of a media file, you can call the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation. Alternatively, perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose <strong>Media Management</strong> &gt; <strong>Media List</strong>. Find the file that you want to manage and click <strong>Manage</strong> in the Actions column. The ID of the file is displayed on the Basics tab.</p>
     * </blockquote>
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
     * <p>The tag that you want to add to the medial file. The value is encoded in UTF-8 and can be up to 32 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>tag1</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static AddMediaTagRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMediaTagRequest self = new AddMediaTagRequest();
        return TeaModel.build(map, self);
    }

    public AddMediaTagRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public AddMediaTagRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddMediaTagRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddMediaTagRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddMediaTagRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddMediaTagRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}

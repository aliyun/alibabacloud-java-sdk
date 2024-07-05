// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaCategoryRequest extends TeaModel {
    /**
     * <p>The ID of the category. The value cannot be negative.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The ID of the media file whose category you want to update.</p>
     * <blockquote>
     * <p>To obtain the ID of a media file, you can call the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation. Alternatively, perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose <strong>Media Management &gt; Media List</strong>. Find the required video and click <strong>Manage</strong> in the Actions column. The ID of the video is displayed on the Basics tab.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e1cd21131a94525be55acf65888****</p>
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

    public static UpdateMediaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCategoryRequest self = new UpdateMediaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCategoryRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateMediaCategoryRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaCategoryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateMediaCategoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMediaCategoryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMediaCategoryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

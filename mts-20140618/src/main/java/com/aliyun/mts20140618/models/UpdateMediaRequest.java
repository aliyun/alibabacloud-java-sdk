// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaRequest extends TeaModel {
    /**
     * <p>The ID of the category to which the media file belongs. The value must be an integer.</p>
     * <br>
     * <p>*   If you do not specify this parameter, the value is NULL.</p>
     * <p>*   The value cannot be negative.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The storage location of the thumbnail that you want to specify for the media file. To obtain the URL, you can log on to the **MPS console** and choose **Workflows** > **Media Buckets**. Alternatively, you can log on to the **Object Storage Service (OSS) console** and click **My OSS Paths**.</p>
     * <br>
     * <p>*   The value can be up to 3,200 bytes in length.</p>
     * <p>*   The URL complies with RFC 2396 and is encoded in UTF-8, with reserved characters being percent-encoded.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the media file. Multiple character types, such as letters and digits, are supported.</p>
     * <br>
     * <p>*   If you do not specify this parameter, the value is NULL.</p>
     * <p>*   The value is encoded in UTF-8 and can be up to 1,024 bytes in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the media file whose basic information you want to update. To obtain the ID of the media file, you can log on to the **ApsaraVideo Media Processing (MPS) console** and choose **Media Management** > **Media List** in the left-side navigation pane.</p>
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
     * <p>The tags that you want to add for the media file.</p>
     * <br>
     * <p>*   Separate multiple tags with commas (,). You can specify up to 16 tags for a media file.</p>
     * <p>*   Each tag can be up to 32 bytes in length.</p>
     * <p>*   The value is encoded in UTF-8.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the media file. Multiple character types, such as letters and digits, are supported.</p>
     * <br>
     * <p>*   If you do not specify this parameter, the value is NULL.</p>
     * <p>*   The value is encoded in UTF-8 and can be up to 128 bytes in length.</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaRequest self = new UpdateMediaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateMediaRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateMediaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMediaRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateMediaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMediaRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMediaRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateMediaRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateMediaRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

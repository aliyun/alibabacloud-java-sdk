// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaRequest extends TeaModel {
    /**
     * <p>The ID of the category to which the media file belongs. The value must be an integer.</p>
     * <ul>
     * <li>If you do not specify this parameter, the value is NULL.</li>
     * <li>The value cannot be negative.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The URL of the thumbnail. This parameter is used to specify the storage location of the thumbnail. To obtain the URL, you can log on to the <strong>MPS console</strong> and choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong> in the left-side navigation pane. Alternatively, you can log on to the <strong>OSS console</strong> and click <strong>Buckets</strong> in the left-side navigation pane.</p>
     * <ul>
     * <li>The value can be up to 3,200 bytes in length.</li>
     * <li>The URL complies with RFC 2396 and is encoded in UTF-8, with reserved characters being percent-encoded. For more information, see <a href="https://help.aliyun.com/document_detail/423796.html">URL encoding</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/test****.jpg">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/test****.jpg</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the media file. Multiple character types, such as letters and digits, are supported.</p>
     * <ul>
     * <li>If you do not specify this parameter, the value is NULL.</li>
     * <li>The value is encoded in UTF-8 and can be up to 1,024 bytes in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the media file whose basic information you want to update. To obtain the ID of the media file, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane.</p>
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

    /**
     * <p>The tags that you want to add to the media file.</p>
     * <ul>
     * <li>You can specify up to 16 tags for a media file. Separate multiple tags with commas (,).</li>
     * <li>Each tag can be up to 32 bytes in length.</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the media file. Multiple character types, such as letters and digits, are supported.</p>
     * <ul>
     * <li>If you do not specify this parameter, the value is NULL.</li>
     * <li>The value is encoded in UTF-8 and can be up to 128 bytes in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
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

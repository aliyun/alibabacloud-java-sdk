// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImAuditRequest extends TeaModel {
    /**
     * <p>The business type. By default, the public business type is used.</p>
     * 
     * <strong>example:</strong>
     * <p>139440480445****</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The custom text entries. You can specify up to 5 text entries. The value must be a JSON array. You must specify at least one of the Images and Contents parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Hello&quot;,&quot;Who are you&quot;,&quot;Where am I&quot;]</p>
     */
    @NameInMap("Contents")
    public String contents;

    /**
     * <p>The image URLs. You can specify up to 5 image URLs. The value must be a JSON array. To view the URLs of the images, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane. You must set at least one of the Images and Contents parameters. The image to be moderated must meet the following limits. Otherwise, the moderation task may fail.</p>
     * <ul>
     * <li>The image size cannot exceed 20 MB, the height or width of the image cannot exceed 30,000 pixels, and the image cannot exceed 0.25 billion pixels.</li>
     * <li>We recommend that you upload images of at least 256 × 256 pixels to ensure required moderation result.</li>
     * </ul>
     */
    @NameInMap("Images")
    public String images;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The moderation scenarios. Separate multiple scenarios with commas (,). For example, if you specify {&quot;porn&quot;,&quot;terrorism&quot;} for this parameter, both pornographic content detection and terrorist content detection are performed on the images and text. Valid values:</p>
     * <ul>
     * <li>porn: pornography</li>
     * <li>terrorism: terrorist content</li>
     * <li>ad: ad violation</li>
     * <li>qrcode: QR code</li>
     * <li>live: undesirable scene</li>
     * <li>logo: special logo</li>
     * <li>antispam: text anti-spam (valid only for text)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;porn&quot;,&quot;terrorism&quot;,&quot;ad&quot;]</p>
     */
    @NameInMap("Scenes")
    public String scenes;

    public static ImAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        ImAuditRequest self = new ImAuditRequest();
        return TeaModel.build(map, self);
    }

    public ImAuditRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ImAuditRequest setContents(String contents) {
        this.contents = contents;
        return this;
    }
    public String getContents() {
        return this.contents;
    }

    public ImAuditRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public ImAuditRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImAuditRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImAuditRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImAuditRequest setScenes(String scenes) {
        this.scenes = scenes;
        return this;
    }
    public String getScenes() {
        return this.scenes;
    }

}

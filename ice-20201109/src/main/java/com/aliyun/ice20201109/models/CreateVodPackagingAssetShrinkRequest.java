// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingAssetShrinkRequest extends TeaModel {
    /**
     * <p>The name of the asset. The name must be unique and can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>hls_3s</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    /**
     * <p>The content ID in the digital rights management (DRM) system. The maximum length is 256 characters. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>movie</p>
     */
    @NameInMap("ContentId")
    public String contentId;

    /**
     * <p>The asset description.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS 3 second packaging</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the packaging group.</p>
     * 
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The asset input configurations.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    public static CreateVodPackagingAssetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingAssetShrinkRequest self = new CreateVodPackagingAssetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingAssetShrinkRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public CreateVodPackagingAssetShrinkRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public CreateVodPackagingAssetShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVodPackagingAssetShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateVodPackagingAssetShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingAssetRequest extends TeaModel {
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
    public CreateVodPackagingAssetRequestInput input;

    public static CreateVodPackagingAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingAssetRequest self = new CreateVodPackagingAssetRequest();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingAssetRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public CreateVodPackagingAssetRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public CreateVodPackagingAssetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVodPackagingAssetRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateVodPackagingAssetRequest setInput(CreateVodPackagingAssetRequestInput input) {
        this.input = input;
        return this;
    }
    public CreateVodPackagingAssetRequestInput getInput() {
        return this.input;
    }

    public static class CreateVodPackagingAssetRequestInput extends TeaModel {
        /**
         * <p>The URL of the media file. Only M3U8 files stored in OSS are supported.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The input type. Only Object Storage Service (OSS) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateVodPackagingAssetRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CreateVodPackagingAssetRequestInput self = new CreateVodPackagingAssetRequestInput();
            return TeaModel.build(map, self);
        }

        public CreateVodPackagingAssetRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public CreateVodPackagingAssetRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

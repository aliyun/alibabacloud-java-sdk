// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingAssetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hls_3s</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    /**
     * <strong>example:</strong>
     * <p>movie</p>
     */
    @NameInMap("ContentId")
    public String contentId;

    /**
     * <strong>example:</strong>
     * <p>HLS 3 second packaging</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

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
        @NameInMap("Media")
        public String media;

        /**
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

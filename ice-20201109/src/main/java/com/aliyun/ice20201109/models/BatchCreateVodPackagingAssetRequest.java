// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchCreateVodPackagingAssetRequest extends TeaModel {
    /**
     * <p>The assets that you want to ingest.</p>
     */
    @NameInMap("Assets")
    public java.util.List<BatchCreateVodPackagingAssetRequestAssets> assets;

    /**
     * <p>The name of the packaging group.</p>
     * 
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static BatchCreateVodPackagingAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateVodPackagingAssetRequest self = new BatchCreateVodPackagingAssetRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateVodPackagingAssetRequest setAssets(java.util.List<BatchCreateVodPackagingAssetRequestAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<BatchCreateVodPackagingAssetRequestAssets> getAssets() {
        return this.assets;
    }

    public BatchCreateVodPackagingAssetRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public static class BatchCreateVodPackagingAssetRequestAssetsInput extends TeaModel {
        /**
         * <p>The URL of the media file. You can only specify a M3U8 file stored in Object Storage Service (OSS).</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The input type. Only OSS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static BatchCreateVodPackagingAssetRequestAssetsInput build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateVodPackagingAssetRequestAssetsInput self = new BatchCreateVodPackagingAssetRequestAssetsInput();
            return TeaModel.build(map, self);
        }

        public BatchCreateVodPackagingAssetRequestAssetsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public BatchCreateVodPackagingAssetRequestAssetsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class BatchCreateVodPackagingAssetRequestAssets extends TeaModel {
        /**
         * <p>The name of the asset. The name must be unique and can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>30min_movie</p>
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
         * <p>The asset input configurations.</p>
         */
        @NameInMap("Input")
        public BatchCreateVodPackagingAssetRequestAssetsInput input;

        public static BatchCreateVodPackagingAssetRequestAssets build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateVodPackagingAssetRequestAssets self = new BatchCreateVodPackagingAssetRequestAssets();
            return TeaModel.build(map, self);
        }

        public BatchCreateVodPackagingAssetRequestAssets setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public BatchCreateVodPackagingAssetRequestAssets setContentId(String contentId) {
            this.contentId = contentId;
            return this;
        }
        public String getContentId() {
            return this.contentId;
        }

        public BatchCreateVodPackagingAssetRequestAssets setInput(BatchCreateVodPackagingAssetRequestAssetsInput input) {
            this.input = input;
            return this;
        }
        public BatchCreateVodPackagingAssetRequestAssetsInput getInput() {
            return this.input;
        }

    }

}

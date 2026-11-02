// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class VodPackagingAsset extends TeaModel {
    /**
     * <p>The asset name. It must be unique per user, up to 128 characters in length, and match the format [A-Za-z0-9_-]+.</p>
     * 
     * <strong>example:</strong>
     * <p>example-asset</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    /**
     * <p>The content ID in the DRM system. The format is [A-Za-z0-9_-]+, and the maximum length is 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>example-content</p>
     */
    @NameInMap("ContentId")
    public String contentId;

    /**
     * <p>The creation time. The format is 2024-11-21T06:45:32Z, which indicates 2024-11-21 14:45:32 in UTC+8.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-21T06:45:32Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The name of the packaging group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The input configuration of the asset.</p>
     */
    @NameInMap("Input")
    public VodPackagingAssetInput input;

    public static VodPackagingAsset build(java.util.Map<String, ?> map) throws Exception {
        VodPackagingAsset self = new VodPackagingAsset();
        return TeaModel.build(map, self);
    }

    public VodPackagingAsset setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public VodPackagingAsset setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public VodPackagingAsset setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public VodPackagingAsset setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public VodPackagingAsset setInput(VodPackagingAssetInput input) {
        this.input = input;
        return this;
    }
    public VodPackagingAssetInput getInput() {
        return this.input;
    }

    public static class VodPackagingAssetInput extends TeaModel {
        /**
         * <p>The input media asset. Currently, only OSS paths are supported, such as OSS://test-bucket/video/202208/test.m3u8. Only inputs with the .m3u8 extension are supported.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The input type. Currently, only OSS is supported.</p>
         */
        @NameInMap("Type")
        public String type;

        public static VodPackagingAssetInput build(java.util.Map<String, ?> map) throws Exception {
            VodPackagingAssetInput self = new VodPackagingAssetInput();
            return TeaModel.build(map, self);
        }

        public VodPackagingAssetInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public VodPackagingAssetInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

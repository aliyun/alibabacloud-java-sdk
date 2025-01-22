// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class VodPackagingAsset extends TeaModel {
    @NameInMap("AssetName")
    public String assetName;

    @NameInMap("ContentId")
    public String contentId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("GroupName")
    public String groupName;

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
        @NameInMap("Media")
        public String media;

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

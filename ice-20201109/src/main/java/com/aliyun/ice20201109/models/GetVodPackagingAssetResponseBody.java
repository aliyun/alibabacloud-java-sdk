// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingAssetResponseBody extends TeaModel {
    @NameInMap("Asset")
    public GetVodPackagingAssetResponseBodyAsset asset;

    /**
     * <strong>example:</strong>
     * <p>0622C702-41BE-467E-AF2E-883D4517962E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVodPackagingAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingAssetResponseBody self = new GetVodPackagingAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingAssetResponseBody setAsset(GetVodPackagingAssetResponseBodyAsset asset) {
        this.asset = asset;
        return this;
    }
    public GetVodPackagingAssetResponseBodyAsset getAsset() {
        return this.asset;
    }

    public GetVodPackagingAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVodPackagingAssetResponseBodyAssetEgressEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hls_3s</p>
         */
        @NameInMap("ConfigurationName")
        public String configurationName;

        /**
         * <strong>example:</strong>
         * <p>Playable</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Url")
        public String url;

        public static GetVodPackagingAssetResponseBodyAssetEgressEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetVodPackagingAssetResponseBodyAssetEgressEndpoints self = new GetVodPackagingAssetResponseBodyAssetEgressEndpoints();
            return TeaModel.build(map, self);
        }

        public GetVodPackagingAssetResponseBodyAssetEgressEndpoints setConfigurationName(String configurationName) {
            this.configurationName = configurationName;
            return this;
        }
        public String getConfigurationName() {
            return this.configurationName;
        }

        public GetVodPackagingAssetResponseBodyAssetEgressEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVodPackagingAssetResponseBodyAssetEgressEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetVodPackagingAssetResponseBodyAssetInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetVodPackagingAssetResponseBodyAssetInput build(java.util.Map<String, ?> map) throws Exception {
            GetVodPackagingAssetResponseBodyAssetInput self = new GetVodPackagingAssetResponseBodyAssetInput();
            return TeaModel.build(map, self);
        }

        public GetVodPackagingAssetResponseBodyAssetInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetVodPackagingAssetResponseBodyAssetInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetVodPackagingAssetResponseBodyAsset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30min_movie</p>
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
         * <p>2024-11-21T06:45:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EgressEndpoints")
        public java.util.List<GetVodPackagingAssetResponseBodyAssetEgressEndpoints> egressEndpoints;

        /**
         * <strong>example:</strong>
         * <p>vod_hls</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Input")
        public GetVodPackagingAssetResponseBodyAssetInput input;

        public static GetVodPackagingAssetResponseBodyAsset build(java.util.Map<String, ?> map) throws Exception {
            GetVodPackagingAssetResponseBodyAsset self = new GetVodPackagingAssetResponseBodyAsset();
            return TeaModel.build(map, self);
        }

        public GetVodPackagingAssetResponseBodyAsset setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public GetVodPackagingAssetResponseBodyAsset setContentId(String contentId) {
            this.contentId = contentId;
            return this;
        }
        public String getContentId() {
            return this.contentId;
        }

        public GetVodPackagingAssetResponseBodyAsset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVodPackagingAssetResponseBodyAsset setEgressEndpoints(java.util.List<GetVodPackagingAssetResponseBodyAssetEgressEndpoints> egressEndpoints) {
            this.egressEndpoints = egressEndpoints;
            return this;
        }
        public java.util.List<GetVodPackagingAssetResponseBodyAssetEgressEndpoints> getEgressEndpoints() {
            return this.egressEndpoints;
        }

        public GetVodPackagingAssetResponseBodyAsset setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetVodPackagingAssetResponseBodyAsset setInput(GetVodPackagingAssetResponseBodyAssetInput input) {
            this.input = input;
            return this;
        }
        public GetVodPackagingAssetResponseBodyAssetInput getInput() {
            return this.input;
        }

    }

}

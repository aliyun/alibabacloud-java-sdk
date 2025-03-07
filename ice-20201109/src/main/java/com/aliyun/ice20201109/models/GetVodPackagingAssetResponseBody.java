// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingAssetResponseBody extends TeaModel {
    /**
     * <p>The information about the asset.</p>
     */
    @NameInMap("Asset")
    public GetVodPackagingAssetResponseBodyAsset asset;

    /**
     * <p>The ID of the request.</p>
     * 
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
         * <p>The name of the packaging configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>hls_3s</p>
         */
        @NameInMap("ConfigurationName")
        public String configurationName;

        /**
         * <p>The asset status. Valid values:</p>
         * <ul>
         * <li>Queuing: The asset is waiting for packaging.</li>
         * <li>Playable: The asset is packaged and playable.</li>
         * <li>Failed: The asset fails to be packaged.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Playable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The playback URL. If the asset fails to be packaged, no playback URL is returned.</p>
         */
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
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>30min_movie</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The content ID in the DRM system. The maximum length is 256 characters. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>movie</p>
         */
        @NameInMap("ContentId")
        public String contentId;

        /**
         * <p>The time when the asset was created. It follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-21T06:45:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The egress endpoints, each corresponding to a packaging configuration.</p>
         */
        @NameInMap("EgressEndpoints")
        public java.util.List<GetVodPackagingAssetResponseBodyAssetEgressEndpoints> egressEndpoints;

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

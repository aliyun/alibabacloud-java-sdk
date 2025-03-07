// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAdInsertionResponseBody extends TeaModel {
    /**
     * <p>The ad insertion configuration.</p>
     */
    @NameInMap("Config")
    public UpdateAdInsertionResponseBodyConfig config;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAdInsertionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdInsertionResponseBody self = new UpdateAdInsertionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAdInsertionResponseBody setConfig(UpdateAdInsertionResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public UpdateAdInsertionResponseBodyConfig getConfig() {
        return this.config;
    }

    public UpdateAdInsertionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAdInsertionResponseBodyConfigCdnConfig extends TeaModel {
        /**
         * <p>The CDN prefix for ad segments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
         */
        @NameInMap("AdSegmentUrlPrefix")
        public String adSegmentUrlPrefix;

        /**
         * <p>The CDN prefix for content segments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
         */
        @NameInMap("ContentSegmentUrlPrefix")
        public String contentSegmentUrlPrefix;

        public static UpdateAdInsertionResponseBodyConfigCdnConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAdInsertionResponseBodyConfigCdnConfig self = new UpdateAdInsertionResponseBodyConfigCdnConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAdInsertionResponseBodyConfigCdnConfig setAdSegmentUrlPrefix(String adSegmentUrlPrefix) {
            this.adSegmentUrlPrefix = adSegmentUrlPrefix;
            return this;
        }
        public String getAdSegmentUrlPrefix() {
            return this.adSegmentUrlPrefix;
        }

        public UpdateAdInsertionResponseBodyConfigCdnConfig setContentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
            this.contentSegmentUrlPrefix = contentSegmentUrlPrefix;
            return this;
        }
        public String getContentSegmentUrlPrefix() {
            return this.contentSegmentUrlPrefix;
        }

    }

    public static class UpdateAdInsertionResponseBodyConfigManifestEndpointConfig extends TeaModel {
        /**
         * <p>The prefix of the playback endpoint for HLS manifests.</p>
         */
        @NameInMap("HlsPrefix")
        public String hlsPrefix;

        public static UpdateAdInsertionResponseBodyConfigManifestEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAdInsertionResponseBodyConfigManifestEndpointConfig self = new UpdateAdInsertionResponseBodyConfigManifestEndpointConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAdInsertionResponseBodyConfigManifestEndpointConfig setHlsPrefix(String hlsPrefix) {
            this.hlsPrefix = hlsPrefix;
            return this;
        }
        public String getHlsPrefix() {
            return this.hlsPrefix;
        }

    }

    public static class UpdateAdInsertionResponseBodyConfig extends TeaModel {
        /**
         * <p>Indicates whether ad marker passthrough is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("AdMarkerPassthrough")
        public String adMarkerPassthrough;

        /**
         * <p>The request URL of ADS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ads.com/ad1?param1=%5Bpalyer_params.p1%5D">http://ads.com/ad1?param1=[palyer_params.p1]</a></p>
         */
        @NameInMap("AdsUrl")
        public String adsUrl;

        /**
         * <p>The CDN configurations.</p>
         */
        @NameInMap("CdnConfig")
        public UpdateAdInsertionResponseBodyConfigCdnConfig cdnConfig;

        /**
         * <p>The player parameter variables and aliases.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;player_params.p1&quot;: { &quot;1&quot;: &quot;abc&quot; } }</p>
         */
        @NameInMap("ConfigAliases")
        public String configAliases;

        /**
         * <p>The URL prefix for the source content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://source.com/">https://source.com/</a></p>
         */
        @NameInMap("ContentUrlPrefix")
        public String contentUrlPrefix;

        /**
         * <p>The time when the configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:26:09Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the configuration was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:26:09Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The playback endpoint configuration.</p>
         */
        @NameInMap("ManifestEndpointConfig")
        public UpdateAdInsertionResponseBodyConfigManifestEndpointConfig manifestEndpointConfig;

        /**
         * <p>The name of the ad insertion configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>my_ad</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The personalization threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PersonalizationThreshold")
        public Integer personalizationThreshold;

        /**
         * <p>The URL of the slate ad.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://storage.com/slate1.mp4">http://storage.com/slate1.mp4</a></p>
         */
        @NameInMap("SlateAdUrl")
        public String slateAdUrl;

        public static UpdateAdInsertionResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAdInsertionResponseBodyConfig self = new UpdateAdInsertionResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAdInsertionResponseBodyConfig setAdMarkerPassthrough(String adMarkerPassthrough) {
            this.adMarkerPassthrough = adMarkerPassthrough;
            return this;
        }
        public String getAdMarkerPassthrough() {
            return this.adMarkerPassthrough;
        }

        public UpdateAdInsertionResponseBodyConfig setAdsUrl(String adsUrl) {
            this.adsUrl = adsUrl;
            return this;
        }
        public String getAdsUrl() {
            return this.adsUrl;
        }

        public UpdateAdInsertionResponseBodyConfig setCdnConfig(UpdateAdInsertionResponseBodyConfigCdnConfig cdnConfig) {
            this.cdnConfig = cdnConfig;
            return this;
        }
        public UpdateAdInsertionResponseBodyConfigCdnConfig getCdnConfig() {
            return this.cdnConfig;
        }

        public UpdateAdInsertionResponseBodyConfig setConfigAliases(String configAliases) {
            this.configAliases = configAliases;
            return this;
        }
        public String getConfigAliases() {
            return this.configAliases;
        }

        public UpdateAdInsertionResponseBodyConfig setContentUrlPrefix(String contentUrlPrefix) {
            this.contentUrlPrefix = contentUrlPrefix;
            return this;
        }
        public String getContentUrlPrefix() {
            return this.contentUrlPrefix;
        }

        public UpdateAdInsertionResponseBodyConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateAdInsertionResponseBodyConfig setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public UpdateAdInsertionResponseBodyConfig setManifestEndpointConfig(UpdateAdInsertionResponseBodyConfigManifestEndpointConfig manifestEndpointConfig) {
            this.manifestEndpointConfig = manifestEndpointConfig;
            return this;
        }
        public UpdateAdInsertionResponseBodyConfigManifestEndpointConfig getManifestEndpointConfig() {
            return this.manifestEndpointConfig;
        }

        public UpdateAdInsertionResponseBodyConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAdInsertionResponseBodyConfig setPersonalizationThreshold(Integer personalizationThreshold) {
            this.personalizationThreshold = personalizationThreshold;
            return this;
        }
        public Integer getPersonalizationThreshold() {
            return this.personalizationThreshold;
        }

        public UpdateAdInsertionResponseBodyConfig setSlateAdUrl(String slateAdUrl) {
            this.slateAdUrl = slateAdUrl;
            return this;
        }
        public String getSlateAdUrl() {
            return this.slateAdUrl;
        }

    }

}

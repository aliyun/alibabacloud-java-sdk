// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAdInsertionResponseBody extends TeaModel {
    /**
     * <p>The ad insertion configuration.</p>
     */
    @NameInMap("Config")
    public GetAdInsertionResponseBodyConfig config;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAdInsertionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdInsertionResponseBody self = new GetAdInsertionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdInsertionResponseBody setConfig(GetAdInsertionResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetAdInsertionResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetAdInsertionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAdInsertionResponseBodyConfigCdnConfig extends TeaModel {
        /**
         * <p>The CDN prefix for accessing ad segments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
         */
        @NameInMap("AdSegmentUrlPrefix")
        public String adSegmentUrlPrefix;

        /**
         * <p>The CDN prefix for accessing content segments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
         */
        @NameInMap("ContentSegmentUrlPrefix")
        public String contentSegmentUrlPrefix;

        public static GetAdInsertionResponseBodyConfigCdnConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAdInsertionResponseBodyConfigCdnConfig self = new GetAdInsertionResponseBodyConfigCdnConfig();
            return TeaModel.build(map, self);
        }

        public GetAdInsertionResponseBodyConfigCdnConfig setAdSegmentUrlPrefix(String adSegmentUrlPrefix) {
            this.adSegmentUrlPrefix = adSegmentUrlPrefix;
            return this;
        }
        public String getAdSegmentUrlPrefix() {
            return this.adSegmentUrlPrefix;
        }

        public GetAdInsertionResponseBodyConfigCdnConfig setContentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
            this.contentSegmentUrlPrefix = contentSegmentUrlPrefix;
            return this;
        }
        public String getContentSegmentUrlPrefix() {
            return this.contentSegmentUrlPrefix;
        }

    }

    public static class GetAdInsertionResponseBodyConfigManifestEndpointConfig extends TeaModel {
        /**
         * <p>DASH清单播放端点前缀</p>
         */
        @NameInMap("DashPrefix")
        public String dashPrefix;

        /**
         * <p>The playback endpoint prefix for accessing HLS manifests.</p>
         */
        @NameInMap("HlsPrefix")
        public String hlsPrefix;

        public static GetAdInsertionResponseBodyConfigManifestEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAdInsertionResponseBodyConfigManifestEndpointConfig self = new GetAdInsertionResponseBodyConfigManifestEndpointConfig();
            return TeaModel.build(map, self);
        }

        public GetAdInsertionResponseBodyConfigManifestEndpointConfig setDashPrefix(String dashPrefix) {
            this.dashPrefix = dashPrefix;
            return this;
        }
        public String getDashPrefix() {
            return this.dashPrefix;
        }

        public GetAdInsertionResponseBodyConfigManifestEndpointConfig setHlsPrefix(String hlsPrefix) {
            this.hlsPrefix = hlsPrefix;
            return this;
        }
        public String getHlsPrefix() {
            return this.hlsPrefix;
        }

    }

    public static class GetAdInsertionResponseBodyConfig extends TeaModel {
        /**
         * <p>Indicates whether ad marker passthrough is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("AdMarkerPassthrough")
        public String adMarkerPassthrough;

        /**
         * <p>The URL of the ad decision server (ADS).</p>
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
        public GetAdInsertionResponseBodyConfigCdnConfig cdnConfig;

        /**
         * <p>The aliases for dynamic variable replacement.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;player_params.p1&quot;: {
         *             &quot;1&quot;: &quot;abc&quot;
         *       }
         * }</p>
         */
        @NameInMap("ConfigAliases")
        public String configAliases;

        /**
         * <p>The prefix of the source URL.</p>
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
         * <p>The playback endpoint prefix for accessing manifests.</p>
         */
        @NameInMap("ManifestEndpointConfig")
        public GetAdInsertionResponseBodyConfigManifestEndpointConfig manifestEndpointConfig;

        /**
         * <p>The name of the configuration.</p>
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

        public static GetAdInsertionResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAdInsertionResponseBodyConfig self = new GetAdInsertionResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetAdInsertionResponseBodyConfig setAdMarkerPassthrough(String adMarkerPassthrough) {
            this.adMarkerPassthrough = adMarkerPassthrough;
            return this;
        }
        public String getAdMarkerPassthrough() {
            return this.adMarkerPassthrough;
        }

        public GetAdInsertionResponseBodyConfig setAdsUrl(String adsUrl) {
            this.adsUrl = adsUrl;
            return this;
        }
        public String getAdsUrl() {
            return this.adsUrl;
        }

        public GetAdInsertionResponseBodyConfig setCdnConfig(GetAdInsertionResponseBodyConfigCdnConfig cdnConfig) {
            this.cdnConfig = cdnConfig;
            return this;
        }
        public GetAdInsertionResponseBodyConfigCdnConfig getCdnConfig() {
            return this.cdnConfig;
        }

        public GetAdInsertionResponseBodyConfig setConfigAliases(String configAliases) {
            this.configAliases = configAliases;
            return this;
        }
        public String getConfigAliases() {
            return this.configAliases;
        }

        public GetAdInsertionResponseBodyConfig setContentUrlPrefix(String contentUrlPrefix) {
            this.contentUrlPrefix = contentUrlPrefix;
            return this;
        }
        public String getContentUrlPrefix() {
            return this.contentUrlPrefix;
        }

        public GetAdInsertionResponseBodyConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAdInsertionResponseBodyConfig setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public GetAdInsertionResponseBodyConfig setManifestEndpointConfig(GetAdInsertionResponseBodyConfigManifestEndpointConfig manifestEndpointConfig) {
            this.manifestEndpointConfig = manifestEndpointConfig;
            return this;
        }
        public GetAdInsertionResponseBodyConfigManifestEndpointConfig getManifestEndpointConfig() {
            return this.manifestEndpointConfig;
        }

        public GetAdInsertionResponseBodyConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAdInsertionResponseBodyConfig setPersonalizationThreshold(Integer personalizationThreshold) {
            this.personalizationThreshold = personalizationThreshold;
            return this;
        }
        public Integer getPersonalizationThreshold() {
            return this.personalizationThreshold;
        }

        public GetAdInsertionResponseBodyConfig setSlateAdUrl(String slateAdUrl) {
            this.slateAdUrl = slateAdUrl;
            return this;
        }
        public String getSlateAdUrl() {
            return this.slateAdUrl;
        }

    }

}

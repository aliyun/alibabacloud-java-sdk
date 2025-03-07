// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddAdInsertionResponseBody extends TeaModel {
    /**
     * <p>The ad insertion configuration.</p>
     */
    @NameInMap("Config")
    public AddAdInsertionResponseBodyConfig config;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAdInsertionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAdInsertionResponseBody self = new AddAdInsertionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAdInsertionResponseBody setConfig(AddAdInsertionResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public AddAdInsertionResponseBodyConfig getConfig() {
        return this.config;
    }

    public AddAdInsertionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddAdInsertionResponseBodyConfigCdnConfig extends TeaModel {
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

        public static AddAdInsertionResponseBodyConfigCdnConfig build(java.util.Map<String, ?> map) throws Exception {
            AddAdInsertionResponseBodyConfigCdnConfig self = new AddAdInsertionResponseBodyConfigCdnConfig();
            return TeaModel.build(map, self);
        }

        public AddAdInsertionResponseBodyConfigCdnConfig setAdSegmentUrlPrefix(String adSegmentUrlPrefix) {
            this.adSegmentUrlPrefix = adSegmentUrlPrefix;
            return this;
        }
        public String getAdSegmentUrlPrefix() {
            return this.adSegmentUrlPrefix;
        }

        public AddAdInsertionResponseBodyConfigCdnConfig setContentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
            this.contentSegmentUrlPrefix = contentSegmentUrlPrefix;
            return this;
        }
        public String getContentSegmentUrlPrefix() {
            return this.contentSegmentUrlPrefix;
        }

    }

    public static class AddAdInsertionResponseBodyConfigManifestEndpointConfig extends TeaModel {
        /**
         * <p>The prefix of the playback endpoint for HLS manifests.</p>
         */
        @NameInMap("HlsPrefix")
        public String hlsPrefix;

        public static AddAdInsertionResponseBodyConfigManifestEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
            AddAdInsertionResponseBodyConfigManifestEndpointConfig self = new AddAdInsertionResponseBodyConfigManifestEndpointConfig();
            return TeaModel.build(map, self);
        }

        public AddAdInsertionResponseBodyConfigManifestEndpointConfig setHlsPrefix(String hlsPrefix) {
            this.hlsPrefix = hlsPrefix;
            return this;
        }
        public String getHlsPrefix() {
            return this.hlsPrefix;
        }

    }

    public static class AddAdInsertionResponseBodyConfig extends TeaModel {
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
        public AddAdInsertionResponseBodyConfigCdnConfig cdnConfig;

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
        public AddAdInsertionResponseBodyConfigManifestEndpointConfig manifestEndpointConfig;

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

        public static AddAdInsertionResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            AddAdInsertionResponseBodyConfig self = new AddAdInsertionResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public AddAdInsertionResponseBodyConfig setAdMarkerPassthrough(String adMarkerPassthrough) {
            this.adMarkerPassthrough = adMarkerPassthrough;
            return this;
        }
        public String getAdMarkerPassthrough() {
            return this.adMarkerPassthrough;
        }

        public AddAdInsertionResponseBodyConfig setAdsUrl(String adsUrl) {
            this.adsUrl = adsUrl;
            return this;
        }
        public String getAdsUrl() {
            return this.adsUrl;
        }

        public AddAdInsertionResponseBodyConfig setCdnConfig(AddAdInsertionResponseBodyConfigCdnConfig cdnConfig) {
            this.cdnConfig = cdnConfig;
            return this;
        }
        public AddAdInsertionResponseBodyConfigCdnConfig getCdnConfig() {
            return this.cdnConfig;
        }

        public AddAdInsertionResponseBodyConfig setConfigAliases(String configAliases) {
            this.configAliases = configAliases;
            return this;
        }
        public String getConfigAliases() {
            return this.configAliases;
        }

        public AddAdInsertionResponseBodyConfig setContentUrlPrefix(String contentUrlPrefix) {
            this.contentUrlPrefix = contentUrlPrefix;
            return this;
        }
        public String getContentUrlPrefix() {
            return this.contentUrlPrefix;
        }

        public AddAdInsertionResponseBodyConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AddAdInsertionResponseBodyConfig setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public AddAdInsertionResponseBodyConfig setManifestEndpointConfig(AddAdInsertionResponseBodyConfigManifestEndpointConfig manifestEndpointConfig) {
            this.manifestEndpointConfig = manifestEndpointConfig;
            return this;
        }
        public AddAdInsertionResponseBodyConfigManifestEndpointConfig getManifestEndpointConfig() {
            return this.manifestEndpointConfig;
        }

        public AddAdInsertionResponseBodyConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddAdInsertionResponseBodyConfig setPersonalizationThreshold(Integer personalizationThreshold) {
            this.personalizationThreshold = personalizationThreshold;
            return this;
        }
        public Integer getPersonalizationThreshold() {
            return this.personalizationThreshold;
        }

        public AddAdInsertionResponseBodyConfig setSlateAdUrl(String slateAdUrl) {
            this.slateAdUrl = slateAdUrl;
            return this;
        }
        public String getSlateAdUrl() {
            return this.slateAdUrl;
        }

    }

}

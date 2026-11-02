// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAdInsertionRequest extends TeaModel {
    /**
     * <p>Specifies whether to pass through ad markers. Valid values: ON and OFF. Default value: OFF.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("AdMarkerPassthrough")
    public String adMarkerPassthrough;

    /**
     * <p>The URL of the ad decision server. HTTP and HTTPS protocols are supported. The maximum length is 2,048 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://ads.com/ad1?param1=%5Bpalyer_params.p1%5D">http://ads.com/ad1?param1=[palyer_params.p1]</a></p>
     */
    @NameInMap("AdsUrl")
    public String adsUrl;

    /**
     * <p>The CDN prefix for ad segments. HTTP and HTTPS protocols are supported. The maximum length is 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
     */
    @NameInMap("CdnAdSegmentUrlPrefix")
    public String cdnAdSegmentUrlPrefix;

    /**
     * <p>The CDN prefix for video content segments. HTTP and HTTPS protocols are supported. The maximum length is 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
     */
    @NameInMap("CdnContentSegmentUrlPrefix")
    public String cdnContentSegmentUrlPrefix;

    /**
     * <p>The aliases for dynamic configurations. The value is a JSON string. You can add up to 20 player_params.{name} entries. The name part is limited to 150 characters. Under each player_params.xxx, you can add up to 50 key-value pairs. The key is limited to 150 characters, and the value is limited to 500 characters. Example: { &quot;player_params.{name}&quot;: { &quot;{key}&quot;: &quot;{value}&quot; } }</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;player_params.p1&quot;: { &quot;1&quot;: &quot;abc&quot; } }</p>
     */
    @NameInMap("ConfigAliases")
    public String configAliases;

    /**
     * <p>The prefix of the content URL. HTTP and HTTPS protocols are supported. The maximum length is 512 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://source.com/">https://source.com/</a></p>
     */
    @NameInMap("ContentUrlPrefix")
    public String contentUrlPrefix;

    /**
     * <p>The name of the configuration. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_ad</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The threshold for personalization configuration, in seconds. Default value: 8.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PersonalizationThreshold")
    public Integer personalizationThreshold;

    /**
     * <p>The URL of the slate ad. HTTP and HTTPS protocols are supported. Only MP4 files (.mp4) are supported. The maximum length is 2,048 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://storage.com/slate1.mp4">http://storage.com/slate1.mp4</a></p>
     */
    @NameInMap("SlateAdUrl")
    public String slateAdUrl;

    public static UpdateAdInsertionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdInsertionRequest self = new UpdateAdInsertionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAdInsertionRequest setAdMarkerPassthrough(String adMarkerPassthrough) {
        this.adMarkerPassthrough = adMarkerPassthrough;
        return this;
    }
    public String getAdMarkerPassthrough() {
        return this.adMarkerPassthrough;
    }

    public UpdateAdInsertionRequest setAdsUrl(String adsUrl) {
        this.adsUrl = adsUrl;
        return this;
    }
    public String getAdsUrl() {
        return this.adsUrl;
    }

    public UpdateAdInsertionRequest setCdnAdSegmentUrlPrefix(String cdnAdSegmentUrlPrefix) {
        this.cdnAdSegmentUrlPrefix = cdnAdSegmentUrlPrefix;
        return this;
    }
    public String getCdnAdSegmentUrlPrefix() {
        return this.cdnAdSegmentUrlPrefix;
    }

    public UpdateAdInsertionRequest setCdnContentSegmentUrlPrefix(String cdnContentSegmentUrlPrefix) {
        this.cdnContentSegmentUrlPrefix = cdnContentSegmentUrlPrefix;
        return this;
    }
    public String getCdnContentSegmentUrlPrefix() {
        return this.cdnContentSegmentUrlPrefix;
    }

    public UpdateAdInsertionRequest setConfigAliases(String configAliases) {
        this.configAliases = configAliases;
        return this;
    }
    public String getConfigAliases() {
        return this.configAliases;
    }

    public UpdateAdInsertionRequest setContentUrlPrefix(String contentUrlPrefix) {
        this.contentUrlPrefix = contentUrlPrefix;
        return this;
    }
    public String getContentUrlPrefix() {
        return this.contentUrlPrefix;
    }

    public UpdateAdInsertionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAdInsertionRequest setPersonalizationThreshold(Integer personalizationThreshold) {
        this.personalizationThreshold = personalizationThreshold;
        return this;
    }
    public Integer getPersonalizationThreshold() {
        return this.personalizationThreshold;
    }

    public UpdateAdInsertionRequest setSlateAdUrl(String slateAdUrl) {
        this.slateAdUrl = slateAdUrl;
        return this;
    }
    public String getSlateAdUrl() {
        return this.slateAdUrl;
    }

}

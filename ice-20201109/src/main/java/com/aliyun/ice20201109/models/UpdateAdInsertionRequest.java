// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAdInsertionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable ad marker passthrough. Default value: OFF.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>OFF: Disable.</li>
     * <li>ON: Enable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("AdMarkerPassthrough")
    public String adMarkerPassthrough;

    /**
     * <p>The request URL of the ad decision server (ADS). HTTP and HTTPS are supported. The maximum length is 2,048 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://ads.com/ad1?param1=%5Bpalyer_params.p1%5D">http://ads.com/ad1?param1=[palyer_params.p1]</a></p>
     */
    @NameInMap("AdsUrl")
    public String adsUrl;

    /**
     * <p>The CDN prefix for ad segments. HTTP and HTTPS are supported. The maximum length is 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
     */
    @NameInMap("CdnAdSegmentUrlPrefix")
    public String cdnAdSegmentUrlPrefix;

    /**
     * <p>The CDN prefix for content segments. HTTP and HTTPS are supported. The maximum length is 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
     */
    @NameInMap("CdnContentSegmentUrlPrefix")
    public String cdnContentSegmentUrlPrefix;

    /**
     * <p>A JSON string that specifies the player parameter variables and aliases. Format: { &quot;player_params.{name}&quot;: { &quot;{key}&quot;: &quot;{value}&quot; } }. You can add up to 20 player_params.{name} entries. The name field can be up to 150 characters in length. Each player parameter can include up to 50 key-value pairs. A key can be up to 150 characters long, and a value can be up to 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;player_params.p1&quot;: { &quot;1&quot;: &quot;abc&quot; } }</p>
     */
    @NameInMap("ConfigAliases")
    public String configAliases;

    /**
     * <p>The URL prefix for the source content. HTTP and HTTPS are supported. The maximum length is 512 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://source.com/">https://source.com/</a></p>
     */
    @NameInMap("ContentUrlPrefix")
    public String contentUrlPrefix;

    /**
     * <p>The configuration name, which cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_ad</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies the maximum duration of underfilled time allowed in an ad break. Unit: seconds. Default value: 8 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PersonalizationThreshold")
    public Integer personalizationThreshold;

    /**
     * <p>The HTTP or HTTPS URL of the slate ad. Only MP4 format is supported. The maximum length is 2,048 characters.</p>
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

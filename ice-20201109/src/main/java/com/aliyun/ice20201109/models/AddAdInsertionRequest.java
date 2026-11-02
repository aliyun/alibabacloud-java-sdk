// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddAdInsertionRequest extends TeaModel {
    /**
     * <p>Specifies whether to pass through ad markers. Default value: OFF.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("AdMarkerPassthrough")
    public String adMarkerPassthrough;

    /**
     * <p>The URL of the ad decision server. The URL supports the HTTP and HTTPS protocols. It can be up to 2,048 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://ads.com/ad1?param1=%5Bpalyer_params.p1%5D">http://ads.com/ad1?param1=[palyer_params.p1]</a></p>
     */
    @NameInMap("AdsUrl")
    public String adsUrl;

    /**
     * <p>The CDN prefix for ad segments. The URL supports the HTTP and HTTPS protocols. It can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
     */
    @NameInMap("CdnAdSegmentUrlPrefix")
    public String cdnAdSegmentUrlPrefix;

    /**
     * <p>The CDN prefix for video content segments. The URL supports the HTTP and HTTPS protocols. It can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
     */
    @NameInMap("CdnContentSegmentUrlPrefix")
    public String cdnContentSegmentUrlPrefix;

    /**
     * <p>The client token that is used to ensure idempotence. The token must be unique for each request to prevent duplicate submissions. It can be up to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>0311a423d11a5f7dee713535</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The dynamic configuration aliases. The value is a JSON string. You can add up to 20 player_params.{name} entries. The name part can be up to 150 characters in length. Under each player_params.xxx, you can add up to 50 key-value pairs. The key can be up to 150 characters in length, and the value can be up to 500 characters in length. Example:
     * {
     *   &quot;player_params.{name}&quot;: {
     *     &quot;{key}&quot;: &quot;{value}&quot;
     *   }
     * }</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;player_params.p1&quot;: { &quot;1&quot;: &quot;abc&quot; } }</p>
     */
    @NameInMap("ConfigAliases")
    public String configAliases;

    /**
     * <p>The prefix of the content URL. The URL supports the HTTP and HTTPS protocols. It can be up to 512 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://source.com/">https://source.com/</a></p>
     */
    @NameInMap("ContentUrlPrefix")
    public String contentUrlPrefix;

    /**
     * <p>The name of the configuration. The name must be unique within the same account. It can be up to 128 characters in length and must match the regular expression [A-Za-z0-9_-]+.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_ad</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The personalization threshold. Unit: seconds. Default value: 8.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PersonalizationThreshold")
    public Integer personalizationThreshold;

    /**
     * <p>The URL of the slate ad. The URL supports the HTTP and HTTPS protocols and only MP4 files (.mp4). It can be up to 2,048 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://storage.com/slate1.mp4">http://storage.com/slate1.mp4</a></p>
     */
    @NameInMap("SlateAdUrl")
    public String slateAdUrl;

    public static AddAdInsertionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAdInsertionRequest self = new AddAdInsertionRequest();
        return TeaModel.build(map, self);
    }

    public AddAdInsertionRequest setAdMarkerPassthrough(String adMarkerPassthrough) {
        this.adMarkerPassthrough = adMarkerPassthrough;
        return this;
    }
    public String getAdMarkerPassthrough() {
        return this.adMarkerPassthrough;
    }

    public AddAdInsertionRequest setAdsUrl(String adsUrl) {
        this.adsUrl = adsUrl;
        return this;
    }
    public String getAdsUrl() {
        return this.adsUrl;
    }

    public AddAdInsertionRequest setCdnAdSegmentUrlPrefix(String cdnAdSegmentUrlPrefix) {
        this.cdnAdSegmentUrlPrefix = cdnAdSegmentUrlPrefix;
        return this;
    }
    public String getCdnAdSegmentUrlPrefix() {
        return this.cdnAdSegmentUrlPrefix;
    }

    public AddAdInsertionRequest setCdnContentSegmentUrlPrefix(String cdnContentSegmentUrlPrefix) {
        this.cdnContentSegmentUrlPrefix = cdnContentSegmentUrlPrefix;
        return this;
    }
    public String getCdnContentSegmentUrlPrefix() {
        return this.cdnContentSegmentUrlPrefix;
    }

    public AddAdInsertionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddAdInsertionRequest setConfigAliases(String configAliases) {
        this.configAliases = configAliases;
        return this;
    }
    public String getConfigAliases() {
        return this.configAliases;
    }

    public AddAdInsertionRequest setContentUrlPrefix(String contentUrlPrefix) {
        this.contentUrlPrefix = contentUrlPrefix;
        return this;
    }
    public String getContentUrlPrefix() {
        return this.contentUrlPrefix;
    }

    public AddAdInsertionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddAdInsertionRequest setPersonalizationThreshold(Integer personalizationThreshold) {
        this.personalizationThreshold = personalizationThreshold;
        return this;
    }
    public Integer getPersonalizationThreshold() {
        return this.personalizationThreshold;
    }

    public AddAdInsertionRequest setSlateAdUrl(String slateAdUrl) {
        this.slateAdUrl = slateAdUrl;
        return this;
    }
    public String getSlateAdUrl() {
        return this.slateAdUrl;
    }

}

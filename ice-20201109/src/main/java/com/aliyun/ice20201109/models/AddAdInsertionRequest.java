// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddAdInsertionRequest extends TeaModel {
    /**
     * <p>内容URL前缀</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("AdMarkerPassthrough")
    public String adMarkerPassthrough;

    /**
     * <p>广告策略服务器URL</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://ads.com/ad1?param1=%5Bpalyer_params.p1%5D">http://ads.com/ad1?param1=[palyer_params.p1]</a></p>
     */
    @NameInMap("AdsUrl")
    public String adsUrl;

    /**
     * <p>广告分片的CDN前缀</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
     */
    @NameInMap("CdnAdSegmentUrlPrefix")
    public String cdnAdSegmentUrlPrefix;

    /**
     * <p>视频内容分片的CDN前缀</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
     */
    @NameInMap("CdnContentSegmentUrlPrefix")
    public String cdnContentSegmentUrlPrefix;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>0311a423d11a5f7dee713535</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>动态配置别名</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;player_params.p1&quot;: { &quot;1&quot;: &quot;abc&quot; } }</p>
     */
    @NameInMap("ConfigAliases")
    public String configAliases;

    /**
     * <p>内容URL前缀</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://source.com/">https://source.com/</a></p>
     */
    @NameInMap("ContentUrlPrefix")
    public String contentUrlPrefix;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_ad</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>个性化配置阈值</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PersonalizationThreshold")
    public Integer personalizationThreshold;

    /**
     * <p>slate广告URL</p>
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

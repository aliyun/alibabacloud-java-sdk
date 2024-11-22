// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteFunctionShrinkRequest extends TeaModel {
    @NameInMap("CacheReserve")
    public String cacheReserveShrink;

    @NameInMap("CacheRules")
    public String cacheRulesShrink;

    @NameInMap("CacheTags")
    public String cacheTagsShrink;

    @NameInMap("CnameFlattening")
    public String cnameFlatteningShrink;

    @NameInMap("CompressionRules")
    public String compressionRulesShrink;

    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimizationShrink;

    @NameInMap("DevelopmentMode")
    public String developmentModeShrink;

    @NameInMap("HttpRequestHeaderModificationRules")
    public String httpRequestHeaderModificationRulesShrink;

    @NameInMap("HttpResponseHeaderModificationRules")
    public String httpResponseHeaderModificationRulesShrink;

    @NameInMap("HttpsApplicationConfiguration")
    public String httpsApplicationConfigurationShrink;

    @NameInMap("HttpsBasicConfiguration")
    public String httpsBasicConfigurationShrink;

    @NameInMap("ImageTransform")
    public String imageTransformShrink;

    @NameInMap("Ipv6")
    public String ipv6Shrink;

    @NameInMap("ManagedTransforms")
    public String managedTransformsShrink;

    @NameInMap("NetworkOptimization")
    public String networkOptimizationShrink;

    @NameInMap("OriginRules")
    public String originRulesShrink;

    @NameInMap("RedirectRules")
    public String redirectRulesShrink;

    @NameInMap("RewriteUrlRules")
    public String rewriteUrlRulesShrink;

    @NameInMap("SeoBypass")
    public String seoBypassShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateSiteFunction</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("SiteNameExclusive")
    public String siteNameExclusiveShrink;

    @NameInMap("SitePause")
    public String sitePauseShrink;

    @NameInMap("TieredCache")
    public String tieredCacheShrink;

    public static UpdateSiteFunctionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteFunctionShrinkRequest self = new UpdateSiteFunctionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteFunctionShrinkRequest setCacheReserveShrink(String cacheReserveShrink) {
        this.cacheReserveShrink = cacheReserveShrink;
        return this;
    }
    public String getCacheReserveShrink() {
        return this.cacheReserveShrink;
    }

    public UpdateSiteFunctionShrinkRequest setCacheRulesShrink(String cacheRulesShrink) {
        this.cacheRulesShrink = cacheRulesShrink;
        return this;
    }
    public String getCacheRulesShrink() {
        return this.cacheRulesShrink;
    }

    public UpdateSiteFunctionShrinkRequest setCacheTagsShrink(String cacheTagsShrink) {
        this.cacheTagsShrink = cacheTagsShrink;
        return this;
    }
    public String getCacheTagsShrink() {
        return this.cacheTagsShrink;
    }

    public UpdateSiteFunctionShrinkRequest setCnameFlatteningShrink(String cnameFlatteningShrink) {
        this.cnameFlatteningShrink = cnameFlatteningShrink;
        return this;
    }
    public String getCnameFlatteningShrink() {
        return this.cnameFlatteningShrink;
    }

    public UpdateSiteFunctionShrinkRequest setCompressionRulesShrink(String compressionRulesShrink) {
        this.compressionRulesShrink = compressionRulesShrink;
        return this;
    }
    public String getCompressionRulesShrink() {
        return this.compressionRulesShrink;
    }

    public UpdateSiteFunctionShrinkRequest setCrossBorderOptimizationShrink(String crossBorderOptimizationShrink) {
        this.crossBorderOptimizationShrink = crossBorderOptimizationShrink;
        return this;
    }
    public String getCrossBorderOptimizationShrink() {
        return this.crossBorderOptimizationShrink;
    }

    public UpdateSiteFunctionShrinkRequest setDevelopmentModeShrink(String developmentModeShrink) {
        this.developmentModeShrink = developmentModeShrink;
        return this;
    }
    public String getDevelopmentModeShrink() {
        return this.developmentModeShrink;
    }

    public UpdateSiteFunctionShrinkRequest setHttpRequestHeaderModificationRulesShrink(String httpRequestHeaderModificationRulesShrink) {
        this.httpRequestHeaderModificationRulesShrink = httpRequestHeaderModificationRulesShrink;
        return this;
    }
    public String getHttpRequestHeaderModificationRulesShrink() {
        return this.httpRequestHeaderModificationRulesShrink;
    }

    public UpdateSiteFunctionShrinkRequest setHttpResponseHeaderModificationRulesShrink(String httpResponseHeaderModificationRulesShrink) {
        this.httpResponseHeaderModificationRulesShrink = httpResponseHeaderModificationRulesShrink;
        return this;
    }
    public String getHttpResponseHeaderModificationRulesShrink() {
        return this.httpResponseHeaderModificationRulesShrink;
    }

    public UpdateSiteFunctionShrinkRequest setHttpsApplicationConfigurationShrink(String httpsApplicationConfigurationShrink) {
        this.httpsApplicationConfigurationShrink = httpsApplicationConfigurationShrink;
        return this;
    }
    public String getHttpsApplicationConfigurationShrink() {
        return this.httpsApplicationConfigurationShrink;
    }

    public UpdateSiteFunctionShrinkRequest setHttpsBasicConfigurationShrink(String httpsBasicConfigurationShrink) {
        this.httpsBasicConfigurationShrink = httpsBasicConfigurationShrink;
        return this;
    }
    public String getHttpsBasicConfigurationShrink() {
        return this.httpsBasicConfigurationShrink;
    }

    public UpdateSiteFunctionShrinkRequest setImageTransformShrink(String imageTransformShrink) {
        this.imageTransformShrink = imageTransformShrink;
        return this;
    }
    public String getImageTransformShrink() {
        return this.imageTransformShrink;
    }

    public UpdateSiteFunctionShrinkRequest setIpv6Shrink(String ipv6Shrink) {
        this.ipv6Shrink = ipv6Shrink;
        return this;
    }
    public String getIpv6Shrink() {
        return this.ipv6Shrink;
    }

    public UpdateSiteFunctionShrinkRequest setManagedTransformsShrink(String managedTransformsShrink) {
        this.managedTransformsShrink = managedTransformsShrink;
        return this;
    }
    public String getManagedTransformsShrink() {
        return this.managedTransformsShrink;
    }

    public UpdateSiteFunctionShrinkRequest setNetworkOptimizationShrink(String networkOptimizationShrink) {
        this.networkOptimizationShrink = networkOptimizationShrink;
        return this;
    }
    public String getNetworkOptimizationShrink() {
        return this.networkOptimizationShrink;
    }

    public UpdateSiteFunctionShrinkRequest setOriginRulesShrink(String originRulesShrink) {
        this.originRulesShrink = originRulesShrink;
        return this;
    }
    public String getOriginRulesShrink() {
        return this.originRulesShrink;
    }

    public UpdateSiteFunctionShrinkRequest setRedirectRulesShrink(String redirectRulesShrink) {
        this.redirectRulesShrink = redirectRulesShrink;
        return this;
    }
    public String getRedirectRulesShrink() {
        return this.redirectRulesShrink;
    }

    public UpdateSiteFunctionShrinkRequest setRewriteUrlRulesShrink(String rewriteUrlRulesShrink) {
        this.rewriteUrlRulesShrink = rewriteUrlRulesShrink;
        return this;
    }
    public String getRewriteUrlRulesShrink() {
        return this.rewriteUrlRulesShrink;
    }

    public UpdateSiteFunctionShrinkRequest setSeoBypassShrink(String seoBypassShrink) {
        this.seoBypassShrink = seoBypassShrink;
        return this;
    }
    public String getSeoBypassShrink() {
        return this.seoBypassShrink;
    }

    public UpdateSiteFunctionShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateSiteFunctionShrinkRequest setSiteNameExclusiveShrink(String siteNameExclusiveShrink) {
        this.siteNameExclusiveShrink = siteNameExclusiveShrink;
        return this;
    }
    public String getSiteNameExclusiveShrink() {
        return this.siteNameExclusiveShrink;
    }

    public UpdateSiteFunctionShrinkRequest setSitePauseShrink(String sitePauseShrink) {
        this.sitePauseShrink = sitePauseShrink;
        return this;
    }
    public String getSitePauseShrink() {
        return this.sitePauseShrink;
    }

    public UpdateSiteFunctionShrinkRequest setTieredCacheShrink(String tieredCacheShrink) {
        this.tieredCacheShrink = tieredCacheShrink;
        return this;
    }
    public String getTieredCacheShrink() {
        return this.tieredCacheShrink;
    }

}

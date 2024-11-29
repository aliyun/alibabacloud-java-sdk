// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteFunctionShrinkRequest extends TeaModel {
    @NameInMap("CacheReserve")
    public String cacheReserveShrink;

    /**
     * <p>The cache rules.</p>
     */
    @NameInMap("CacheRules")
    public String cacheRulesShrink;

    /**
     * <p>The cache tags.</p>
     */
    @NameInMap("CacheTags")
    public String cacheTagsShrink;

    /**
     * <p>The configuration of CNAME flattening.</p>
     */
    @NameInMap("CnameFlattening")
    public String cnameFlatteningShrink;

    /**
     * <p>The configuration of a compression rule.</p>
     */
    @NameInMap("CompressionRules")
    public String compressionRulesShrink;

    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimizationShrink;

    /**
     * <p>The configuration of development mode.</p>
     */
    @NameInMap("DevelopmentMode")
    public String developmentModeShrink;

    /**
     * <p>The configuration of a request header modification rule.</p>
     */
    @NameInMap("HttpRequestHeaderModificationRules")
    public String httpRequestHeaderModificationRulesShrink;

    /**
     * <p>The configuration of a response header modification rule.</p>
     */
    @NameInMap("HttpResponseHeaderModificationRules")
    public String httpResponseHeaderModificationRulesShrink;

    @NameInMap("HttpsApplicationConfiguration")
    public String httpsApplicationConfigurationShrink;

    @NameInMap("HttpsBasicConfiguration")
    public String httpsBasicConfigurationShrink;

    /**
     * <p>The configuration of image transformations.</p>
     */
    @NameInMap("ImageTransform")
    public String imageTransformShrink;

    /**
     * <p>The IPv6 configuration.</p>
     */
    @NameInMap("Ipv6")
    public String ipv6Shrink;

    /**
     * <p>The configuration of managed transforms.</p>
     */
    @NameInMap("ManagedTransforms")
    public String managedTransformsShrink;

    @NameInMap("NetworkOptimization")
    public String networkOptimizationShrink;

    /**
     * <p>The configuration of origin protection.</p>
     */
    @NameInMap("OriginProtection")
    public String originProtectionShrink;

    /**
     * <p>The configuration of an origin rule.</p>
     */
    @NameInMap("OriginRules")
    public String originRulesShrink;

    /**
     * <p>The configuration of a redirect rule.</p>
     */
    @NameInMap("RedirectRules")
    public String redirectRulesShrink;

    /**
     * <p>The configuration of a URL rewrite rule.</p>
     */
    @NameInMap("RewriteUrlRules")
    public String rewriteUrlRulesShrink;

    /**
     * <p>The configuration of SEO crawler bypassing.</p>
     */
    @NameInMap("SeoBypass")
    public String seoBypassShrink;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateSiteFunction</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The configuration of site hold. After this feature is enabled, other accounts cannot add your website domain or its subdomains to ESA.</p>
     */
    @NameInMap("SiteNameExclusive")
    public String siteNameExclusiveShrink;

    /**
     * <p>The configuration of temporarily pausing ESA proxy on the website. If you pause ESA proxy, all requests to the domains in your DNS records go directly to your origin server.</p>
     */
    @NameInMap("SitePause")
    public String sitePauseShrink;

    /**
     * <p>The version number of the website. You can use this parameter to specify a version of your website to apply the new feature settings. By default, version 0 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    @NameInMap("TieredCache")
    public String tieredCacheShrink;

    public static CreateSiteFunctionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteFunctionShrinkRequest self = new CreateSiteFunctionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSiteFunctionShrinkRequest setCacheReserveShrink(String cacheReserveShrink) {
        this.cacheReserveShrink = cacheReserveShrink;
        return this;
    }
    public String getCacheReserveShrink() {
        return this.cacheReserveShrink;
    }

    public CreateSiteFunctionShrinkRequest setCacheRulesShrink(String cacheRulesShrink) {
        this.cacheRulesShrink = cacheRulesShrink;
        return this;
    }
    public String getCacheRulesShrink() {
        return this.cacheRulesShrink;
    }

    public CreateSiteFunctionShrinkRequest setCacheTagsShrink(String cacheTagsShrink) {
        this.cacheTagsShrink = cacheTagsShrink;
        return this;
    }
    public String getCacheTagsShrink() {
        return this.cacheTagsShrink;
    }

    public CreateSiteFunctionShrinkRequest setCnameFlatteningShrink(String cnameFlatteningShrink) {
        this.cnameFlatteningShrink = cnameFlatteningShrink;
        return this;
    }
    public String getCnameFlatteningShrink() {
        return this.cnameFlatteningShrink;
    }

    public CreateSiteFunctionShrinkRequest setCompressionRulesShrink(String compressionRulesShrink) {
        this.compressionRulesShrink = compressionRulesShrink;
        return this;
    }
    public String getCompressionRulesShrink() {
        return this.compressionRulesShrink;
    }

    public CreateSiteFunctionShrinkRequest setCrossBorderOptimizationShrink(String crossBorderOptimizationShrink) {
        this.crossBorderOptimizationShrink = crossBorderOptimizationShrink;
        return this;
    }
    public String getCrossBorderOptimizationShrink() {
        return this.crossBorderOptimizationShrink;
    }

    public CreateSiteFunctionShrinkRequest setDevelopmentModeShrink(String developmentModeShrink) {
        this.developmentModeShrink = developmentModeShrink;
        return this;
    }
    public String getDevelopmentModeShrink() {
        return this.developmentModeShrink;
    }

    public CreateSiteFunctionShrinkRequest setHttpRequestHeaderModificationRulesShrink(String httpRequestHeaderModificationRulesShrink) {
        this.httpRequestHeaderModificationRulesShrink = httpRequestHeaderModificationRulesShrink;
        return this;
    }
    public String getHttpRequestHeaderModificationRulesShrink() {
        return this.httpRequestHeaderModificationRulesShrink;
    }

    public CreateSiteFunctionShrinkRequest setHttpResponseHeaderModificationRulesShrink(String httpResponseHeaderModificationRulesShrink) {
        this.httpResponseHeaderModificationRulesShrink = httpResponseHeaderModificationRulesShrink;
        return this;
    }
    public String getHttpResponseHeaderModificationRulesShrink() {
        return this.httpResponseHeaderModificationRulesShrink;
    }

    public CreateSiteFunctionShrinkRequest setHttpsApplicationConfigurationShrink(String httpsApplicationConfigurationShrink) {
        this.httpsApplicationConfigurationShrink = httpsApplicationConfigurationShrink;
        return this;
    }
    public String getHttpsApplicationConfigurationShrink() {
        return this.httpsApplicationConfigurationShrink;
    }

    public CreateSiteFunctionShrinkRequest setHttpsBasicConfigurationShrink(String httpsBasicConfigurationShrink) {
        this.httpsBasicConfigurationShrink = httpsBasicConfigurationShrink;
        return this;
    }
    public String getHttpsBasicConfigurationShrink() {
        return this.httpsBasicConfigurationShrink;
    }

    public CreateSiteFunctionShrinkRequest setImageTransformShrink(String imageTransformShrink) {
        this.imageTransformShrink = imageTransformShrink;
        return this;
    }
    public String getImageTransformShrink() {
        return this.imageTransformShrink;
    }

    public CreateSiteFunctionShrinkRequest setIpv6Shrink(String ipv6Shrink) {
        this.ipv6Shrink = ipv6Shrink;
        return this;
    }
    public String getIpv6Shrink() {
        return this.ipv6Shrink;
    }

    public CreateSiteFunctionShrinkRequest setManagedTransformsShrink(String managedTransformsShrink) {
        this.managedTransformsShrink = managedTransformsShrink;
        return this;
    }
    public String getManagedTransformsShrink() {
        return this.managedTransformsShrink;
    }

    public CreateSiteFunctionShrinkRequest setNetworkOptimizationShrink(String networkOptimizationShrink) {
        this.networkOptimizationShrink = networkOptimizationShrink;
        return this;
    }
    public String getNetworkOptimizationShrink() {
        return this.networkOptimizationShrink;
    }

    public CreateSiteFunctionShrinkRequest setOriginProtectionShrink(String originProtectionShrink) {
        this.originProtectionShrink = originProtectionShrink;
        return this;
    }
    public String getOriginProtectionShrink() {
        return this.originProtectionShrink;
    }

    public CreateSiteFunctionShrinkRequest setOriginRulesShrink(String originRulesShrink) {
        this.originRulesShrink = originRulesShrink;
        return this;
    }
    public String getOriginRulesShrink() {
        return this.originRulesShrink;
    }

    public CreateSiteFunctionShrinkRequest setRedirectRulesShrink(String redirectRulesShrink) {
        this.redirectRulesShrink = redirectRulesShrink;
        return this;
    }
    public String getRedirectRulesShrink() {
        return this.redirectRulesShrink;
    }

    public CreateSiteFunctionShrinkRequest setRewriteUrlRulesShrink(String rewriteUrlRulesShrink) {
        this.rewriteUrlRulesShrink = rewriteUrlRulesShrink;
        return this;
    }
    public String getRewriteUrlRulesShrink() {
        return this.rewriteUrlRulesShrink;
    }

    public CreateSiteFunctionShrinkRequest setSeoBypassShrink(String seoBypassShrink) {
        this.seoBypassShrink = seoBypassShrink;
        return this;
    }
    public String getSeoBypassShrink() {
        return this.seoBypassShrink;
    }

    public CreateSiteFunctionShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateSiteFunctionShrinkRequest setSiteNameExclusiveShrink(String siteNameExclusiveShrink) {
        this.siteNameExclusiveShrink = siteNameExclusiveShrink;
        return this;
    }
    public String getSiteNameExclusiveShrink() {
        return this.siteNameExclusiveShrink;
    }

    public CreateSiteFunctionShrinkRequest setSitePauseShrink(String sitePauseShrink) {
        this.sitePauseShrink = sitePauseShrink;
        return this;
    }
    public String getSitePauseShrink() {
        return this.sitePauseShrink;
    }

    public CreateSiteFunctionShrinkRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public CreateSiteFunctionShrinkRequest setTieredCacheShrink(String tieredCacheShrink) {
        this.tieredCacheShrink = tieredCacheShrink;
        return this;
    }
    public String getTieredCacheShrink() {
        return this.tieredCacheShrink;
    }

}

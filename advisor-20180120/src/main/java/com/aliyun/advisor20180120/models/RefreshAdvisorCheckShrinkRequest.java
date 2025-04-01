// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCheckShrinkRequest extends TeaModel {
    @NameInMap("AssumeAliyunId")
    public Long assumeAliyunId;

    /**
     * <strong>example:</strong>
     * <p>EcsHighCpuUtilization</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("CheckPlanId")
    public Long checkPlanId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("ResourceDimensionList")
    public String resourceDimensionListShrink;

    /**
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Token")
    public String token;

    public static RefreshAdvisorCheckShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCheckShrinkRequest self = new RefreshAdvisorCheckShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCheckShrinkRequest setAssumeAliyunId(Long assumeAliyunId) {
        this.assumeAliyunId = assumeAliyunId;
        return this;
    }
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    public RefreshAdvisorCheckShrinkRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public RefreshAdvisorCheckShrinkRequest setCheckPlanId(Long checkPlanId) {
        this.checkPlanId = checkPlanId;
        return this;
    }
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    public RefreshAdvisorCheckShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RefreshAdvisorCheckShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public RefreshAdvisorCheckShrinkRequest setResourceDimensionListShrink(String resourceDimensionListShrink) {
        this.resourceDimensionListShrink = resourceDimensionListShrink;
        return this;
    }
    public String getResourceDimensionListShrink() {
        return this.resourceDimensionListShrink;
    }

    public RefreshAdvisorCheckShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public RefreshAdvisorCheckShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}

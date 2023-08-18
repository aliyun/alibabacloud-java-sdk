// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCheckRequest extends TeaModel {
    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("Language")
    public String language;

    @NameInMap("Product")
    public String product;

    @NameInMap("ResourceId")
    public String resourceId;

    public static RefreshAdvisorCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCheckRequest self = new RefreshAdvisorCheckRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCheckRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public RefreshAdvisorCheckRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RefreshAdvisorCheckRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public RefreshAdvisorCheckRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}

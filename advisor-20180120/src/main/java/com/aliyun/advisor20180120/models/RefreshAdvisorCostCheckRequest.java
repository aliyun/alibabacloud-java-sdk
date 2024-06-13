// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCostCheckRequest extends TeaModel {
    @NameInMap("AssumeAliyunIdList")
    public java.util.List<Long> assumeAliyunIdList;

    @NameInMap("CheckIds")
    public java.util.List<String> checkIds;

    @NameInMap("Product")
    public String product;

    @NameInMap("RefreshResource")
    public Boolean refreshResource;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    public static RefreshAdvisorCostCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCostCheckRequest self = new RefreshAdvisorCostCheckRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCostCheckRequest setAssumeAliyunIdList(java.util.List<Long> assumeAliyunIdList) {
        this.assumeAliyunIdList = assumeAliyunIdList;
        return this;
    }
    public java.util.List<Long> getAssumeAliyunIdList() {
        return this.assumeAliyunIdList;
    }

    public RefreshAdvisorCostCheckRequest setCheckIds(java.util.List<String> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<String> getCheckIds() {
        return this.checkIds;
    }

    public RefreshAdvisorCostCheckRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public RefreshAdvisorCostCheckRequest setRefreshResource(Boolean refreshResource) {
        this.refreshResource = refreshResource;
        return this;
    }
    public Boolean getRefreshResource() {
        return this.refreshResource;
    }

    public RefreshAdvisorCostCheckRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}

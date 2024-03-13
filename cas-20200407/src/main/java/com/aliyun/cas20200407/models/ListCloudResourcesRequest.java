// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudResourcesRequest extends TeaModel {
    @NameInMap("CloudName")
    public String cloudName;

    @NameInMap("CloudProduct")
    public String cloudProduct;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("SecretId")
    public String secretId;

    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListCloudResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudResourcesRequest self = new ListCloudResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudResourcesRequest setCloudName(String cloudName) {
        this.cloudName = cloudName;
        return this;
    }
    public String getCloudName() {
        return this.cloudName;
    }

    public ListCloudResourcesRequest setCloudProduct(String cloudProduct) {
        this.cloudProduct = cloudProduct;
        return this;
    }
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    public ListCloudResourcesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudResourcesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCloudResourcesRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public ListCloudResourcesRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}

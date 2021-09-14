// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchGetTemplateDataSourcesRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("TemplateIds")
    public java.util.List<Integer> templateIds;

    public static BatchGetTemplateDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTemplateDataSourcesRequest self = new BatchGetTemplateDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetTemplateDataSourcesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public BatchGetTemplateDataSourcesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public BatchGetTemplateDataSourcesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BatchGetTemplateDataSourcesRequest setTemplateIds(java.util.List<Integer> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<Integer> getTemplateIds() {
        return this.templateIds;
    }

}

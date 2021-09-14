// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetTemplateDataSourceRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("TemplateId")
    public Integer templateId;

    public static GetTemplateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateDataSourceRequest self = new GetTemplateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateDataSourceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetTemplateDataSourceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetTemplateDataSourceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetTemplateDataSourceRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

}

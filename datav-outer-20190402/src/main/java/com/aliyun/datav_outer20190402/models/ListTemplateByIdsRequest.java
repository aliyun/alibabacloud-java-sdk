// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListTemplateByIdsRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("TemplateIds")
    public String templateIds;

    @NameInMap("NeedConfig")
    public Boolean needConfig;

    public static ListTemplateByIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateByIdsRequest self = new ListTemplateByIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateByIdsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListTemplateByIdsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ListTemplateByIdsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListTemplateByIdsRequest setTemplateIds(String templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public String getTemplateIds() {
        return this.templateIds;
    }

    public ListTemplateByIdsRequest setNeedConfig(Boolean needConfig) {
        this.needConfig = needConfig;
        return this;
    }
    public Boolean getNeedConfig() {
        return this.needConfig;
    }

}

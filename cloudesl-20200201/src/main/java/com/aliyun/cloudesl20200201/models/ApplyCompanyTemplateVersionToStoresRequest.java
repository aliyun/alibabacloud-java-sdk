// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class ApplyCompanyTemplateVersionToStoresRequest extends TeaModel {
    @NameInMap("Stores")
    public String stores;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static ApplyCompanyTemplateVersionToStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCompanyTemplateVersionToStoresRequest self = new ApplyCompanyTemplateVersionToStoresRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCompanyTemplateVersionToStoresRequest setStores(String stores) {
        this.stores = stores;
        return this;
    }
    public String getStores() {
        return this.stores;
    }

    public ApplyCompanyTemplateVersionToStoresRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}

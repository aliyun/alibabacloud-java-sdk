// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanTemplatesRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AppTemplateId")
    public String appTemplateId;

    @NameInMap("AppVersion")
    public String appVersion;

    public static QueryAIPlanTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanTemplatesRequest self = new QueryAIPlanTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanTemplatesRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryAIPlanTemplatesRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryAIPlanTemplatesRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    public QueryAIPlanTemplatesRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

}

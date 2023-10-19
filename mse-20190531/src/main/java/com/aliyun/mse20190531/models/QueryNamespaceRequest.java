// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryNamespaceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh and en. Default value: zh. The value zh which indicates Chinese, and the value en indicates English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    public static QueryNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNamespaceRequest self = new QueryNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryNamespaceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryNamespaceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}

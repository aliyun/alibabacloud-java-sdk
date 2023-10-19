// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace that you want to query.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static QueryAllSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllSwimmingLaneGroupRequest self = new QueryAllSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllSwimmingLaneGroupRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryAllSwimmingLaneGroupRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}

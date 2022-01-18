// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterSpecificationRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static QueryClusterSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterSpecificationRequest self = new QueryClusterSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterSpecificationRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}

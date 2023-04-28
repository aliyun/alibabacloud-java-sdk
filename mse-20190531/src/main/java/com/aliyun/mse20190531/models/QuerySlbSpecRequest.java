// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySlbSpecRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static QuerySlbSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlbSpecRequest self = new QuerySlbSpecRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlbSpecRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}

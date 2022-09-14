// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySlbSpecRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("MseSessionId")
    public String mseSessionId;

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

    public QuerySlbSpecRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

}

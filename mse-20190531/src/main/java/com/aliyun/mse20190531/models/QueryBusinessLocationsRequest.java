// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryBusinessLocationsRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    public static QueryBusinessLocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessLocationsRequest self = new QueryBusinessLocationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessLocationsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryBusinessLocationsRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

}

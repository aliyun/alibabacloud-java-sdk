// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAhasPostStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static QueryAhasPostStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAhasPostStatusRequest self = new QueryAhasPostStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAhasPostStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}

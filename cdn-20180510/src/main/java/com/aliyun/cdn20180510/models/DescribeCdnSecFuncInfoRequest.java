// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSecFuncInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SecFuncType")
    public String secFuncType;

    public static DescribeCdnSecFuncInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSecFuncInfoRequest self = new DescribeCdnSecFuncInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSecFuncInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCdnSecFuncInfoRequest setSecFuncType(String secFuncType) {
        this.secFuncType = secFuncType;
        return this;
    }
    public String getSecFuncType() {
        return this.secFuncType;
    }

}

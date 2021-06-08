// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSecFuncInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecFuncType")
    public String secFuncType;

    @NameInMap("Lang")
    public String lang;

    public static DescribeDcdnSecFuncInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSecFuncInfoRequest self = new DescribeDcdnSecFuncInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSecFuncInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnSecFuncInfoRequest setSecFuncType(String secFuncType) {
        this.secFuncType = secFuncType;
        return this;
    }
    public String getSecFuncType() {
        return this.secFuncType;
    }

    public DescribeDcdnSecFuncInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}

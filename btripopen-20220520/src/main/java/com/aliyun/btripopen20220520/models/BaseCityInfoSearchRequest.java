// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BaseCityInfoSearchRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("region")
    public String region;

    public static BaseCityInfoSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        BaseCityInfoSearchRequest self = new BaseCityInfoSearchRequest();
        return TeaModel.build(map, self);
    }

    public BaseCityInfoSearchRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public BaseCityInfoSearchRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}

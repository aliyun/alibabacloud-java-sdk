// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CitySearchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("keyword")
    public String keyword;

    public static CitySearchRequest build(java.util.Map<String, ?> map) throws Exception {
        CitySearchRequest self = new CitySearchRequest();
        return TeaModel.build(map, self);
    }

    public CitySearchRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}

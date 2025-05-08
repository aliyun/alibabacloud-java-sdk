// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class SearchCredits extends TeaModel {
    @NameInMap("genericTextSearch")
    public Integer genericTextSearch;

    public static SearchCredits build(java.util.Map<String, ?> map) throws Exception {
        SearchCredits self = new SearchCredits();
        return TeaModel.build(map, self);
    }

    public SearchCredits setGenericTextSearch(Integer genericTextSearch) {
        this.genericTextSearch = genericTextSearch;
        return this;
    }
    public Integer getGenericTextSearch() {
        return this.genericTextSearch;
    }

}

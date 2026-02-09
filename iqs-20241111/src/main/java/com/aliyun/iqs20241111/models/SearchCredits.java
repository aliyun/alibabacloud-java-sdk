// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class SearchCredits extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("genericTextSearch")
    public Integer genericTextSearch;

    @NameInMap("liteAdvancedTextSearch")
    public Integer liteAdvancedTextSearch;

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

    public SearchCredits setLiteAdvancedTextSearch(Integer liteAdvancedTextSearch) {
        this.liteAdvancedTextSearch = liteAdvancedTextSearch;
        return this;
    }
    public Integer getLiteAdvancedTextSearch() {
        return this.liteAdvancedTextSearch;
    }

}

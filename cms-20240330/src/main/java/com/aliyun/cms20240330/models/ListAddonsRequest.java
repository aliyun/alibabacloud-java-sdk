// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAddonsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    /**
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("category")
    public String category;

    @NameInMap("regexp")
    public Boolean regexp;

    /**
     * <strong>example:</strong>
     * <p>105095</p>
     */
    @NameInMap("search")
    public String search;

    public static ListAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddonsRequest self = new ListAddonsRequest();
        return TeaModel.build(map, self);
    }

    public ListAddonsRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public ListAddonsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListAddonsRequest setRegexp(Boolean regexp) {
        this.regexp = regexp;
        return this;
    }
    public Boolean getRegexp() {
        return this.regexp;
    }

    public ListAddonsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}

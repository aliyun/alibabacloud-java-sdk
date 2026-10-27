// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAddonsRequest extends TeaModel {
    /**
     * <p>The language environment. Valid values: zh and en. Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    /**
     * <p>The add-on catalog version. Valid values: v1 and v2. Default value: v2. If you specify v1, the add-ons in the v1 catalog are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("apiVersion")
    public String apiVersion;

    /**
     * <p>The category filter.</p>
     * 
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>Specifies whether to use regular expression matching for the query field. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("regexp")
    public Boolean regexp;

    /**
     * <p>The search keyword. You can search by add-on name, description, or keyword.</p>
     * 
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

    public ListAddonsRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
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

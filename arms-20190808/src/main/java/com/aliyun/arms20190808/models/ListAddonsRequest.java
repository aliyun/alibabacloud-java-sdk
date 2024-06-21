// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAddonsRequest extends TeaModel {
    /**
     * <p>Language,the default language is Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>Category filter.</p>
     * 
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Whether to enable regular matching.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Regexp")
    public Boolean regexp;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A query field can be queried by name or description.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("Search")
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

    public ListAddonsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAddonsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}

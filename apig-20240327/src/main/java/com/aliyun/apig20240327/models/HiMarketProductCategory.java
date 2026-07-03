// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketProductCategory extends TeaModel {
    /**
     * <p>The categorization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cat-xxx</p>
     */
    @NameInMap("categoryId")
    public String categoryId;

    /**
     * <p>The categorization description.</p>
     * 
     * <strong>example:</strong>
     * <p>AI网关相关产品分类</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The icon configuration.</p>
     */
    @NameInMap("icon")
    public HiMarketIcon icon;

    /**
     * <p>The categorization name.</p>
     * 
     * <strong>example:</strong>
     * <p>AI网关</p>
     */
    @NameInMap("name")
    public String name;

    public static HiMarketProductCategory build(java.util.Map<String, ?> map) throws Exception {
        HiMarketProductCategory self = new HiMarketProductCategory();
        return TeaModel.build(map, self);
    }

    public HiMarketProductCategory setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public HiMarketProductCategory setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HiMarketProductCategory setIcon(HiMarketIcon icon) {
        this.icon = icon;
        return this;
    }
    public HiMarketIcon getIcon() {
        return this.icon;
    }

    public HiMarketProductCategory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

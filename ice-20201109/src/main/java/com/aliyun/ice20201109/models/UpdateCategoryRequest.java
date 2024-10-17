// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://ims.console.aliyun.com">Intelligent Media Services (IMS) console</a> and choose <strong>Media Asset Management</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
     * <li>View the value of CateId returned by the AddCategory operation that you called to create a category.</li>
     * <li>View the value of CateId returned by the GetCategories operation that you called to query a category.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The category name.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CateName")
    public String cateName;

    public static UpdateCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryRequest self = new UpdateCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateCategoryRequest setCateName(String cateName) {
        this.cateName = cateName;
        return this;
    }
    public String getCateName() {
        return this.cateName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCategoriesResponseBody extends TeaModel {
    /**
     * <p>The information about the category.</p>
     */
    @NameInMap("Category")
    public GetCategoriesResponseBodyCategory category;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The subcategories in the category.</p>
     */
    @NameInMap("SubCategories")
    public GetCategoriesResponseBodySubCategories subCategories;

    /**
     * <p>The total number of subcategories.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SubTotal")
    public Long subTotal;

    public static GetCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesResponseBody self = new GetCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCategoriesResponseBody setCategory(GetCategoriesResponseBodyCategory category) {
        this.category = category;
        return this;
    }
    public GetCategoriesResponseBodyCategory getCategory() {
        return this.category;
    }

    public GetCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCategoriesResponseBody setSubCategories(GetCategoriesResponseBodySubCategories subCategories) {
        this.subCategories = subCategories;
        return this;
    }
    public GetCategoriesResponseBodySubCategories getSubCategories() {
        return this.subCategories;
    }

    public GetCategoriesResponseBody setSubTotal(Long subTotal) {
        this.subTotal = subTotal;
        return this;
    }
    public Long getSubTotal() {
        return this.subTotal;
    }

    public static class GetCategoriesResponseBodyCategory extends TeaModel {
        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The category name.</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The level of the category. A value of <strong>0</strong> indicates a level-1 category, a value of <strong>1</strong> indicates a level-2 category, and a value of <strong>2</strong> indicates a level-3 category.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The ID of the parent category.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The type of the category. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: audio, video, and image files. This is the default value.</li>
         * <li><strong>material</strong>: short video materials.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCategoriesResponseBodyCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseBodyCategory self = new GetCategoriesResponseBodyCategory();
            return TeaModel.build(map, self);
        }

        public GetCategoriesResponseBodyCategory setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetCategoriesResponseBodyCategory setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetCategoriesResponseBodyCategory setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetCategoriesResponseBodyCategory setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetCategoriesResponseBodyCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCategoriesResponseBodySubCategoriesCategory extends TeaModel {
        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>129</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The category name.</p>
         * <ul>
         * <li>The value can be up to 64 bytes in length.</li>
         * <li>The value is encoded in UTF-8.</li>
         * </ul>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The level of the category. A value of <strong>0</strong> indicates a level-1 category, a value of <strong>1</strong> indicates a level-2 category, and a value of <strong>2</strong> indicates a level-3 category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The ID of the parent category.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The total number of subcategories.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SubTotal")
        public Long subTotal;

        /**
         * <p>The type of the category. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: audio, video, and image files. This is the default value.</li>
         * <li><strong>material</strong>: short video materials.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCategoriesResponseBodySubCategoriesCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseBodySubCategoriesCategory self = new GetCategoriesResponseBodySubCategoriesCategory();
            return TeaModel.build(map, self);
        }

        public GetCategoriesResponseBodySubCategoriesCategory setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setSubTotal(Long subTotal) {
            this.subTotal = subTotal;
            return this;
        }
        public Long getSubTotal() {
            return this.subTotal;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCategoriesResponseBodySubCategories extends TeaModel {
        @NameInMap("Category")
        public java.util.List<GetCategoriesResponseBodySubCategoriesCategory> category;

        public static GetCategoriesResponseBodySubCategories build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseBodySubCategories self = new GetCategoriesResponseBodySubCategories();
            return TeaModel.build(map, self);
        }

        public GetCategoriesResponseBodySubCategories setCategory(java.util.List<GetCategoriesResponseBodySubCategoriesCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<GetCategoriesResponseBodySubCategoriesCategory> getCategory() {
            return this.category;
        }

    }

}

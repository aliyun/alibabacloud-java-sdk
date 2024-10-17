// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddCategoryResponseBody extends TeaModel {
    /**
     * <p>The information about the category.</p>
     */
    @NameInMap("Category")
    public AddCategoryResponseBodyCategory category;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryResponseBody self = new AddCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCategoryResponseBody setCategory(AddCategoryResponseBodyCategory category) {
        this.category = category;
        return this;
    }
    public AddCategoryResponseBodyCategory getCategory() {
        return this.category;
    }

    public AddCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddCategoryResponseBodyCategory extends TeaModel {
        /**
         * <p>The ID of the created category.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
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
         * <p>The ID of the parent category. By default, if ParentId is left empty or less than 1, -1 is returned, which indicates that the created category is the root directory.</p>
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

        public static AddCategoryResponseBodyCategory build(java.util.Map<String, ?> map) throws Exception {
            AddCategoryResponseBodyCategory self = new AddCategoryResponseBodyCategory();
            return TeaModel.build(map, self);
        }

        public AddCategoryResponseBodyCategory setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public AddCategoryResponseBodyCategory setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public AddCategoryResponseBodyCategory setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public AddCategoryResponseBodyCategory setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public AddCategoryResponseBodyCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

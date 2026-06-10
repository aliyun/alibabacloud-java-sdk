// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateCategoryResponseBody extends TeaModel {
    /**
     * <p>Details of the created category.</p>
     */
    @NameInMap("Category")
    public CreateCategoryResponseBodyCategory category;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A629A28F-F25E-5572-A679-FA46FB0151D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCategoryResponseBody self = new CreateCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCategoryResponseBody setCategory(CreateCategoryResponseBodyCategory category) {
        this.category = category;
        return this;
    }
    public CreateCategoryResponseBodyCategory getCategory() {
        return this.category;
    }

    public CreateCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCategoryResponseBodyCategory extends TeaModel {
        /**
         * <p>The business code.</p>
         * 
         * <strong>example:</strong>
         * <p>bizcode123</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000049006</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The category name.</p>
         * 
         * <strong>example:</strong>
         * <p>类目名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the parent category.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        /**
         * <p>The category status. A value of -1 indicates that the category has been deleted, but this change has not been published. A value of 0 indicates Normal.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static CreateCategoryResponseBodyCategory build(java.util.Map<String, ?> map) throws Exception {
            CreateCategoryResponseBodyCategory self = new CreateCategoryResponseBodyCategory();
            return TeaModel.build(map, self);
        }

        public CreateCategoryResponseBodyCategory setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public CreateCategoryResponseBodyCategory setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public CreateCategoryResponseBodyCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCategoryResponseBodyCategory setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public CreateCategoryResponseBodyCategory setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}

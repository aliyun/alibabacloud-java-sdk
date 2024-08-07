// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeCategoryResponseBody extends TeaModel {
    @NameInMap("Category")
    public DescribeCategoryResponseBodyCategory category;

    /**
     * <strong>example:</strong>
     * <p>2B0304FD-3804-5C06-9A83-77F5523664AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryResponseBody self = new DescribeCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryResponseBody setCategory(DescribeCategoryResponseBodyCategory category) {
        this.category = category;
        return this;
    }
    public DescribeCategoryResponseBodyCategory getCategory() {
        return this.category;
    }

    public DescribeCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCategoryResponseBodyCategory extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>30000049006</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeCategoryResponseBodyCategory build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoryResponseBodyCategory self = new DescribeCategoryResponseBodyCategory();
            return TeaModel.build(map, self);
        }

        public DescribeCategoryResponseBodyCategory setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public DescribeCategoryResponseBodyCategory setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public DescribeCategoryResponseBodyCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCategoryResponseBodyCategory setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public DescribeCategoryResponseBodyCategory setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}

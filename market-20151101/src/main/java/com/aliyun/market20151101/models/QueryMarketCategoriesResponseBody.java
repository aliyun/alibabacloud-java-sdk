// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class QueryMarketCategoriesResponseBody extends TeaModel {
    @NameInMap("Categories")
    public QueryMarketCategoriesResponseBodyCategories categories;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryMarketCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketCategoriesResponseBody self = new QueryMarketCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMarketCategoriesResponseBody setCategories(QueryMarketCategoriesResponseBodyCategories categories) {
        this.categories = categories;
        return this;
    }
    public QueryMarketCategoriesResponseBodyCategories getCategories() {
        return this.categories;
    }

    public QueryMarketCategoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryMarketCategoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMarketCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMarketCategoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory extends TeaModel {
        @NameInMap("CategoryCode")
        public String categoryCode;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Id")
        public Long id;

        public static QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory self = new QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory();
            return TeaModel.build(map, self);
        }

        public QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategories extends TeaModel {
        @NameInMap("ChildCategory")
        public java.util.List<QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory> childCategory;

        public static QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategories build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategories self = new QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategories();
            return TeaModel.build(map, self);
        }

        public QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategories setChildCategory(java.util.List<QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory> childCategory) {
            this.childCategory = childCategory;
            return this;
        }
        public java.util.List<QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategoriesChildCategory> getChildCategory() {
            return this.childCategory;
        }

    }

    public static class QueryMarketCategoriesResponseBodyCategoriesCategory extends TeaModel {
        @NameInMap("CategoryCode")
        public String categoryCode;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ChildCategories")
        public QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategories childCategories;

        @NameInMap("Id")
        public Long id;

        public static QueryMarketCategoriesResponseBodyCategoriesCategory build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketCategoriesResponseBodyCategoriesCategory self = new QueryMarketCategoriesResponseBodyCategoriesCategory();
            return TeaModel.build(map, self);
        }

        public QueryMarketCategoriesResponseBodyCategoriesCategory setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public QueryMarketCategoriesResponseBodyCategoriesCategory setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public QueryMarketCategoriesResponseBodyCategoriesCategory setChildCategories(QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategories childCategories) {
            this.childCategories = childCategories;
            return this;
        }
        public QueryMarketCategoriesResponseBodyCategoriesCategoryChildCategories getChildCategories() {
            return this.childCategories;
        }

        public QueryMarketCategoriesResponseBodyCategoriesCategory setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class QueryMarketCategoriesResponseBodyCategories extends TeaModel {
        @NameInMap("Category")
        public java.util.List<QueryMarketCategoriesResponseBodyCategoriesCategory> category;

        public static QueryMarketCategoriesResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            QueryMarketCategoriesResponseBodyCategories self = new QueryMarketCategoriesResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public QueryMarketCategoriesResponseBodyCategories setCategory(java.util.List<QueryMarketCategoriesResponseBodyCategoriesCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<QueryMarketCategoriesResponseBodyCategoriesCategory> getCategory() {
            return this.category;
        }

    }

}

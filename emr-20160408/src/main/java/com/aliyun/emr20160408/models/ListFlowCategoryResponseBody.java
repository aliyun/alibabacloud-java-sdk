// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowCategoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Categories")
    public ListFlowCategoryResponseBodyCategories categories;

    @NameInMap("Total")
    public Integer total;

    public static ListFlowCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowCategoryResponseBody self = new ListFlowCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowCategoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowCategoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowCategoryResponseBody setCategories(ListFlowCategoryResponseBodyCategories categories) {
        this.categories = categories;
        return this;
    }
    public ListFlowCategoryResponseBodyCategories getCategories() {
        return this.categories;
    }

    public ListFlowCategoryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListFlowCategoryResponseBodyCategoriesCategory extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("CategoryType")
        public String categoryType;

        @NameInMap("Id")
        public String id;

        public static ListFlowCategoryResponseBodyCategoriesCategory build(java.util.Map<String, ?> map) throws Exception {
            ListFlowCategoryResponseBodyCategoriesCategory self = new ListFlowCategoryResponseBodyCategoriesCategory();
            return TeaModel.build(map, self);
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setCategoryType(String categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public String getCategoryType() {
            return this.categoryType;
        }

        public ListFlowCategoryResponseBodyCategoriesCategory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListFlowCategoryResponseBodyCategories extends TeaModel {
        @NameInMap("Category")
        public java.util.List<ListFlowCategoryResponseBodyCategoriesCategory> category;

        public static ListFlowCategoryResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            ListFlowCategoryResponseBodyCategories self = new ListFlowCategoryResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public ListFlowCategoryResponseBodyCategories setCategory(java.util.List<ListFlowCategoryResponseBodyCategoriesCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<ListFlowCategoryResponseBodyCategoriesCategory> getCategory() {
            return this.category;
        }

    }

}

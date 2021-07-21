// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("MonitorGroupCategories")
    public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories monitorGroupCategories;

    public static DescribeMonitorGroupCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupCategoriesResponseBody self = new DescribeMonitorGroupCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupCategoriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMonitorGroupCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorGroupCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorGroupCategoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMonitorGroupCategoriesResponseBody setMonitorGroupCategories(DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories monitorGroupCategories) {
        this.monitorGroupCategories = monitorGroupCategories;
        return this;
    }
    public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories getMonitorGroupCategories() {
        return this.monitorGroupCategories;
    }

    public static class DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Category")
        public String category;

        public static DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem self = new DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory extends TeaModel {
        @NameInMap("CategoryItem")
        public java.util.List<DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem> categoryItem;

        public static DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory self = new DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory setCategoryItem(java.util.List<DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem> categoryItem) {
            this.categoryItem = categoryItem;
            return this;
        }
        public java.util.List<DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem> getCategoryItem() {
            return this.categoryItem;
        }

    }

    public static class DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories extends TeaModel {
        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("MonitorGroupCategory")
        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory monitorGroupCategory;

        public static DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories self = new DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories setMonitorGroupCategory(DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory monitorGroupCategory) {
            this.monitorGroupCategory = monitorGroupCategory;
            return this;
        }
        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory getMonitorGroupCategory() {
            return this.monitorGroupCategory;
        }

    }

}

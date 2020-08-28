// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("MonitorGroupCategories")
    @Validation(required = true)
    public DescribeMonitorGroupCategoriesResponseMonitorGroupCategories monitorGroupCategories;

    public static DescribeMonitorGroupCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupCategoriesResponse self = new DescribeMonitorGroupCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategoryCategoryItem extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategoryCategoryItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategoryCategoryItem self = new DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategoryCategoryItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategory extends TeaModel {
        @NameInMap("CategoryItem")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategoryCategoryItem> categoryItem;

        public static DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategory self = new DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupCategoriesResponseMonitorGroupCategories extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public Long groupId;

        @NameInMap("MonitorGroupCategory")
        @Validation(required = true)
        public DescribeMonitorGroupCategoriesResponseMonitorGroupCategoriesMonitorGroupCategory monitorGroupCategory;

        public static DescribeMonitorGroupCategoriesResponseMonitorGroupCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseMonitorGroupCategories self = new DescribeMonitorGroupCategoriesResponseMonitorGroupCategories();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.</p>
     */
    @NameInMap("MonitorGroupCategories")
    public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories monitorGroupCategories;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DescribeMonitorGroupCategoriesResponseBody setMonitorGroupCategories(DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories monitorGroupCategories) {
        this.monitorGroupCategories = monitorGroupCategories;
        return this;
    }
    public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories getMonitorGroupCategories() {
        return this.monitorGroupCategories;
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

    public static class DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem extends TeaModel {
        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * <br>
         * <p>To obtain the abbreviation of an Alibaba Cloud service name, call the [DescribeProjectMeta](~~114916~~) operation. The `metricCategory` tag in the `Labels` response parameter indicates the abbreviation of the Alibaba Cloud service name.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The number of resources that belong to the cloud service.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem self = new DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
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
        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.</p>
         */
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

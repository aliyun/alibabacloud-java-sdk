// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexAccFlowResponseBody extends TeaModel {
    @NameInMap("FlowData")
    public DescribeFlexAccFlowResponseBodyFlowData flowData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeFlexAccFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexAccFlowResponseBody self = new DescribeFlexAccFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlexAccFlowResponseBody setFlowData(DescribeFlexAccFlowResponseBodyFlowData flowData) {
        this.flowData = flowData;
        return this;
    }
    public DescribeFlexAccFlowResponseBodyFlowData getFlowData() {
        return this.flowData;
    }

    public DescribeFlexAccFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlexAccFlowResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeFlexAccFlowResponseBodyFlowDataItems extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("Name")
        public String name;

        public static DescribeFlexAccFlowResponseBodyFlowDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexAccFlowResponseBodyFlowDataItems self = new DescribeFlexAccFlowResponseBodyFlowDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeFlexAccFlowResponseBodyFlowDataItems setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public DescribeFlexAccFlowResponseBodyFlowDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFlexAccFlowResponseBodyFlowDataTimeScope extends TeaModel {
        @NameInMap("Start")
        public Long start;

        @NameInMap("Interval")
        public Long interval;

        public static DescribeFlexAccFlowResponseBodyFlowDataTimeScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexAccFlowResponseBodyFlowDataTimeScope self = new DescribeFlexAccFlowResponseBodyFlowDataTimeScope();
            return TeaModel.build(map, self);
        }

        public DescribeFlexAccFlowResponseBodyFlowDataTimeScope setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public DescribeFlexAccFlowResponseBodyFlowDataTimeScope setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

    }

    public static class DescribeFlexAccFlowResponseBodyFlowData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeFlexAccFlowResponseBodyFlowDataItems> items;

        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("TimeScope")
        public DescribeFlexAccFlowResponseBodyFlowDataTimeScope timeScope;

        @NameInMap("CategoriesType")
        public String categoriesType;

        public static DescribeFlexAccFlowResponseBodyFlowData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexAccFlowResponseBodyFlowData self = new DescribeFlexAccFlowResponseBodyFlowData();
            return TeaModel.build(map, self);
        }

        public DescribeFlexAccFlowResponseBodyFlowData setItems(java.util.List<DescribeFlexAccFlowResponseBodyFlowDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeFlexAccFlowResponseBodyFlowDataItems> getItems() {
            return this.items;
        }

        public DescribeFlexAccFlowResponseBodyFlowData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeFlexAccFlowResponseBodyFlowData setTimeScope(DescribeFlexAccFlowResponseBodyFlowDataTimeScope timeScope) {
            this.timeScope = timeScope;
            return this;
        }
        public DescribeFlexAccFlowResponseBodyFlowDataTimeScope getTimeScope() {
            return this.timeScope;
        }

        public DescribeFlexAccFlowResponseBodyFlowData setCategoriesType(String categoriesType) {
            this.categoriesType = categoriesType;
            return this;
        }
        public String getCategoriesType() {
            return this.categoriesType;
        }

    }

}

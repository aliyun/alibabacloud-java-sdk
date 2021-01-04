// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBpsFlowResponseBody extends TeaModel {
    @NameInMap("FlowData")
    public DescribeBpsFlowResponseBodyFlowData flowData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeBpsFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBpsFlowResponseBody self = new DescribeBpsFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBpsFlowResponseBody setFlowData(DescribeBpsFlowResponseBodyFlowData flowData) {
        this.flowData = flowData;
        return this;
    }
    public DescribeBpsFlowResponseBodyFlowData getFlowData() {
        return this.flowData;
    }

    public DescribeBpsFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBpsFlowResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeBpsFlowResponseBodyFlowDataItems extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("Name")
        public String name;

        public static DescribeBpsFlowResponseBodyFlowDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBpsFlowResponseBodyFlowDataItems self = new DescribeBpsFlowResponseBodyFlowDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeBpsFlowResponseBodyFlowDataItems setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public DescribeBpsFlowResponseBodyFlowDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBpsFlowResponseBodyFlowDataTimeScope extends TeaModel {
        @NameInMap("Start")
        public Long start;

        @NameInMap("Interval")
        public Long interval;

        public static DescribeBpsFlowResponseBodyFlowDataTimeScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeBpsFlowResponseBodyFlowDataTimeScope self = new DescribeBpsFlowResponseBodyFlowDataTimeScope();
            return TeaModel.build(map, self);
        }

        public DescribeBpsFlowResponseBodyFlowDataTimeScope setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public DescribeBpsFlowResponseBodyFlowDataTimeScope setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

    }

    public static class DescribeBpsFlowResponseBodyFlowData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeBpsFlowResponseBodyFlowDataItems> items;

        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("TimeScope")
        public DescribeBpsFlowResponseBodyFlowDataTimeScope timeScope;

        @NameInMap("CategoriesType")
        public String categoriesType;

        public static DescribeBpsFlowResponseBodyFlowData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBpsFlowResponseBodyFlowData self = new DescribeBpsFlowResponseBodyFlowData();
            return TeaModel.build(map, self);
        }

        public DescribeBpsFlowResponseBodyFlowData setItems(java.util.List<DescribeBpsFlowResponseBodyFlowDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeBpsFlowResponseBodyFlowDataItems> getItems() {
            return this.items;
        }

        public DescribeBpsFlowResponseBodyFlowData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeBpsFlowResponseBodyFlowData setTimeScope(DescribeBpsFlowResponseBodyFlowDataTimeScope timeScope) {
            this.timeScope = timeScope;
            return this;
        }
        public DescribeBpsFlowResponseBodyFlowDataTimeScope getTimeScope() {
            return this.timeScope;
        }

        public DescribeBpsFlowResponseBodyFlowData setCategoriesType(String categoriesType) {
            this.categoriesType = categoriesType;
            return this;
        }
        public String getCategoriesType() {
            return this.categoriesType;
        }

    }

}

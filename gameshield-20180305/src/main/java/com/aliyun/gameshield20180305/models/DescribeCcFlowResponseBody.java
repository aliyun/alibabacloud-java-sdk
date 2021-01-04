// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcFlowResponseBody extends TeaModel {
    @NameInMap("FlowData")
    public DescribeCcFlowResponseBodyFlowData flowData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeCcFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcFlowResponseBody self = new DescribeCcFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcFlowResponseBody setFlowData(DescribeCcFlowResponseBodyFlowData flowData) {
        this.flowData = flowData;
        return this;
    }
    public DescribeCcFlowResponseBodyFlowData getFlowData() {
        return this.flowData;
    }

    public DescribeCcFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcFlowResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeCcFlowResponseBodyFlowDataItems extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("Name")
        public String name;

        public static DescribeCcFlowResponseBodyFlowDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcFlowResponseBodyFlowDataItems self = new DescribeCcFlowResponseBodyFlowDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeCcFlowResponseBodyFlowDataItems setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public DescribeCcFlowResponseBodyFlowDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeCcFlowResponseBodyFlowDataTimeScope extends TeaModel {
        @NameInMap("Start")
        public Long start;

        @NameInMap("Interval")
        public Long interval;

        public static DescribeCcFlowResponseBodyFlowDataTimeScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcFlowResponseBodyFlowDataTimeScope self = new DescribeCcFlowResponseBodyFlowDataTimeScope();
            return TeaModel.build(map, self);
        }

        public DescribeCcFlowResponseBodyFlowDataTimeScope setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public DescribeCcFlowResponseBodyFlowDataTimeScope setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

    }

    public static class DescribeCcFlowResponseBodyFlowData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeCcFlowResponseBodyFlowDataItems> items;

        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("TimeScope")
        public DescribeCcFlowResponseBodyFlowDataTimeScope timeScope;

        @NameInMap("CategoriesType")
        public String categoriesType;

        public static DescribeCcFlowResponseBodyFlowData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcFlowResponseBodyFlowData self = new DescribeCcFlowResponseBodyFlowData();
            return TeaModel.build(map, self);
        }

        public DescribeCcFlowResponseBodyFlowData setItems(java.util.List<DescribeCcFlowResponseBodyFlowDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeCcFlowResponseBodyFlowDataItems> getItems() {
            return this.items;
        }

        public DescribeCcFlowResponseBodyFlowData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeCcFlowResponseBodyFlowData setTimeScope(DescribeCcFlowResponseBodyFlowDataTimeScope timeScope) {
            this.timeScope = timeScope;
            return this;
        }
        public DescribeCcFlowResponseBodyFlowDataTimeScope getTimeScope() {
            return this.timeScope;
        }

        public DescribeCcFlowResponseBodyFlowData setCategoriesType(String categoriesType) {
            this.categoriesType = categoriesType;
            return this;
        }
        public String getCategoriesType() {
            return this.categoriesType;
        }

    }

}

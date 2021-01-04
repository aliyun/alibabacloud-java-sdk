// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcSocketDetailResponseBody extends TeaModel {
    @NameInMap("FlowData")
    public DescribeCcSocketDetailResponseBodyFlowData flowData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeCcSocketDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcSocketDetailResponseBody self = new DescribeCcSocketDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcSocketDetailResponseBody setFlowData(DescribeCcSocketDetailResponseBodyFlowData flowData) {
        this.flowData = flowData;
        return this;
    }
    public DescribeCcSocketDetailResponseBodyFlowData getFlowData() {
        return this.flowData;
    }

    public DescribeCcSocketDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcSocketDetailResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeCcSocketDetailResponseBodyFlowDataItems extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("Name")
        public String name;

        public static DescribeCcSocketDetailResponseBodyFlowDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcSocketDetailResponseBodyFlowDataItems self = new DescribeCcSocketDetailResponseBodyFlowDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeCcSocketDetailResponseBodyFlowDataItems setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public DescribeCcSocketDetailResponseBodyFlowDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeCcSocketDetailResponseBodyFlowDataTimeScope extends TeaModel {
        @NameInMap("Start")
        public Long start;

        @NameInMap("Interval")
        public Long interval;

        public static DescribeCcSocketDetailResponseBodyFlowDataTimeScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcSocketDetailResponseBodyFlowDataTimeScope self = new DescribeCcSocketDetailResponseBodyFlowDataTimeScope();
            return TeaModel.build(map, self);
        }

        public DescribeCcSocketDetailResponseBodyFlowDataTimeScope setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public DescribeCcSocketDetailResponseBodyFlowDataTimeScope setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

    }

    public static class DescribeCcSocketDetailResponseBodyFlowData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeCcSocketDetailResponseBodyFlowDataItems> items;

        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("TimeScope")
        public DescribeCcSocketDetailResponseBodyFlowDataTimeScope timeScope;

        @NameInMap("CategoriesType")
        public String categoriesType;

        public static DescribeCcSocketDetailResponseBodyFlowData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcSocketDetailResponseBodyFlowData self = new DescribeCcSocketDetailResponseBodyFlowData();
            return TeaModel.build(map, self);
        }

        public DescribeCcSocketDetailResponseBodyFlowData setItems(java.util.List<DescribeCcSocketDetailResponseBodyFlowDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeCcSocketDetailResponseBodyFlowDataItems> getItems() {
            return this.items;
        }

        public DescribeCcSocketDetailResponseBodyFlowData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeCcSocketDetailResponseBodyFlowData setTimeScope(DescribeCcSocketDetailResponseBodyFlowDataTimeScope timeScope) {
            this.timeScope = timeScope;
            return this;
        }
        public DescribeCcSocketDetailResponseBodyFlowDataTimeScope getTimeScope() {
            return this.timeScope;
        }

        public DescribeCcSocketDetailResponseBodyFlowData setCategoriesType(String categoriesType) {
            this.categoriesType = categoriesType;
            return this;
        }
        public String getCategoriesType() {
            return this.categoriesType;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryResponseBody extends TeaModel {
    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // 本次请求的唯一 Id
    @NameInMap("RequestId")
    public String requestId;

    // 文件列表
    @NameInMap("Files")
    public java.util.List<File> files;

    // 聚合字段的字段名
    @NameInMap("Aggregations")
    public java.util.List<SimpleQueryResponseBodyAggregations> aggregations;

    public static SimpleQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SimpleQueryResponseBody self = new SimpleQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SimpleQueryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SimpleQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SimpleQueryResponseBody setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

    public SimpleQueryResponseBody setAggregations(java.util.List<SimpleQueryResponseBodyAggregations> aggregations) {
        this.aggregations = aggregations;
        return this;
    }
    public java.util.List<SimpleQueryResponseBodyAggregations> getAggregations() {
        return this.aggregations;
    }

    public static class SimpleQueryResponseBodyAggregationsGroups extends TeaModel {
        // 分组聚合的值
        @NameInMap("Value")
        public String value;

        // 分组聚合的计数
        @NameInMap("Count")
        public Long count;

        public static SimpleQueryResponseBodyAggregationsGroups build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryResponseBodyAggregationsGroups self = new SimpleQueryResponseBodyAggregationsGroups();
            return TeaModel.build(map, self);
        }

        public SimpleQueryResponseBodyAggregationsGroups setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public SimpleQueryResponseBodyAggregationsGroups setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class SimpleQueryResponseBodyAggregations extends TeaModel {
        // 聚合字段名
        @NameInMap("Field")
        public String field;

        // 聚合字段的聚合操作符
        @NameInMap("Operation")
        public String operation;

        // 聚合的统计结果
        @NameInMap("Value")
        public Float value;

        // 分组聚合的结果
        @NameInMap("Groups")
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups;

        public static SimpleQueryResponseBodyAggregations build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryResponseBodyAggregations self = new SimpleQueryResponseBodyAggregations();
            return TeaModel.build(map, self);
        }

        public SimpleQueryResponseBodyAggregations setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SimpleQueryResponseBodyAggregations setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public SimpleQueryResponseBodyAggregations setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public SimpleQueryResponseBodyAggregations setGroups(java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> getGroups() {
            return this.groups;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQuery extends TeaModel {
    // 需要查询的字段名
    @NameInMap("Field")
    public String field;

    // 运算符
    @NameInMap("Operation")
    public String operation;

    // 由 SimpleQuery 结构体组成的子查询数组
    @NameInMap("SubQueries")
    public java.util.List<SimpleQuery> subQueries;

    // 需要查询的字段值
    @NameInMap("Value")
    public String value;

    public static SimpleQuery build(java.util.Map<String, ?> map) throws Exception {
        SimpleQuery self = new SimpleQuery();
        return TeaModel.build(map, self);
    }

    public SimpleQuery setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public SimpleQuery setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public SimpleQuery setSubQueries(java.util.List<SimpleQuery> subQueries) {
        this.subQueries = subQueries;
        return this;
    }
    public java.util.List<SimpleQuery> getSubQueries() {
        return this.subQueries;
    }

    public SimpleQuery setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

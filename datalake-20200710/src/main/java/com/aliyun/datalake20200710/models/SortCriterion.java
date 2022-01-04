// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SortCriterion extends TeaModel {
    // 排序字段
    @NameInMap("FieldName")
    public String fieldName;

    // 排序方式
    @NameInMap("Sort")
    public String sort;

    public static SortCriterion build(java.util.Map<String, ?> map) throws Exception {
        SortCriterion self = new SortCriterion();
        return TeaModel.build(map, self);
    }

    public SortCriterion setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public SortCriterion setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}

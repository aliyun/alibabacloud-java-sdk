// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Row extends TeaModel {
    @NameInMap("Columns")
    public java.util.List<Column> columns;

    public static Row build(java.util.Map<String, ?> map) throws Exception {
        Row self = new Row();
        return TeaModel.build(map, self);
    }

    public Row setColumns(java.util.List<Column> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<Column> getColumns() {
        return this.columns;
    }

}

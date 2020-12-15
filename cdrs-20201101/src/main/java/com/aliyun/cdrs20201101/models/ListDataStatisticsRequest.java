// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListDataStatisticsRequest extends TeaModel {
    @NameInMap("BackCategory")
    @Validation(required = true)
    public String backCategory;

    @NameInMap("Schema")
    public String schema;

    public static ListDataStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataStatisticsRequest self = new ListDataStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataStatisticsRequest setBackCategory(String backCategory) {
        this.backCategory = backCategory;
        return this;
    }
    public String getBackCategory() {
        return this.backCategory;
    }

    public ListDataStatisticsRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourcesByAdvancedSearchRequest extends TeaModel {
    @NameInMap("Sql")
    public String sql;

    public static ListResourcesByAdvancedSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByAdvancedSearchRequest self = new ListResourcesByAdvancedSearchRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesByAdvancedSearchRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}

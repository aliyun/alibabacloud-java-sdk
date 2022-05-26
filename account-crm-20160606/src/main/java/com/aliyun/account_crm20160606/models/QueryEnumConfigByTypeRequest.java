// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryEnumConfigByTypeRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static QueryEnumConfigByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnumConfigByTypeRequest self = new QueryEnumConfigByTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnumConfigByTypeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

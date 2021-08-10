// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListPatentUserSearchCompanyRequest extends TeaModel {
    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Type")
    public Integer type;

    public static ListPatentUserSearchCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPatentUserSearchCompanyRequest self = new ListPatentUserSearchCompanyRequest();
        return TeaModel.build(map, self);
    }

    public ListPatentUserSearchCompanyRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListPatentUserSearchCompanyRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}

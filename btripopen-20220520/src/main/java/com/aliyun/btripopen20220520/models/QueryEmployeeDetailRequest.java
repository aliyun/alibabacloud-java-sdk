// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryEmployeeDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc12138</p>
     */
    @NameInMap("out_employee_id")
    public String outEmployeeId;

    public static QueryEmployeeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEmployeeDetailRequest self = new QueryEmployeeDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryEmployeeDetailRequest setOutEmployeeId(String outEmployeeId) {
        this.outEmployeeId = outEmployeeId;
        return this;
    }
    public String getOutEmployeeId() {
        return this.outEmployeeId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSqlAuditStatusRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    public static DescribeDrdsSqlAuditStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsSqlAuditStatusRequest self = new DescribeDrdsSqlAuditStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsSqlAuditStatusRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}

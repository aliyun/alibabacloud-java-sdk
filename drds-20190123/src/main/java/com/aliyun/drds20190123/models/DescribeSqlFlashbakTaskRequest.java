// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbakTaskRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    public static DescribeSqlFlashbakTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlFlashbakTaskRequest self = new DescribeSqlFlashbakTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlFlashbakTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}

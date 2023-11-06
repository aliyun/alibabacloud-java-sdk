// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbakTaskRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
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
